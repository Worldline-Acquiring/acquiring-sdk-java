package com.worldline.acquiring.sdk.java.authentication;

import java.io.IOException;
import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.apache.http.HttpStatus;

import com.worldline.acquiring.sdk.java.CommunicatorConfiguration;
import com.worldline.acquiring.sdk.java.ProxyConfiguration;
import com.worldline.acquiring.sdk.java.communication.Connection;
import com.worldline.acquiring.sdk.java.communication.DefaultConnectionBuilder;
import com.worldline.acquiring.sdk.java.communication.RequestHeader;
import com.worldline.acquiring.sdk.java.communication.ResponseHandler;
import com.worldline.acquiring.sdk.java.json.DefaultMarshaller;
import com.worldline.acquiring.sdk.java.json.Marshaller;

/**
 * OAuth2 {@link Authenticator} implementation.
 */
public class OAuth2Authenticator implements Authenticator {

    private static final Marshaller MARSHALLER = DefaultMarshaller.INSTANCE;
    private static final String CONTENT_TYPE_KEY = "Content-Type";
    private static final String CONTENT_TYPE_VALUE = "application/x-www-form-urlencoded";
    private static final int MAX_CONNECTIONS = 1;

    private final String clientId;
    private final String clientSecret;
    private final URI oauth2TokenUri;
    private final int connectTimeout;
    private final int socketTimeout;
    private final ProxyConfiguration proxyConfiguration;
    private final Set<String> httpsProtocols;
    private ConcurrentMap<TokenType, OAuth2AccessToken> accessTokens = new ConcurrentHashMap<>();

    /**
     * Constructs a new OAuth2Authenticator instance using the provided CommunicatorConfiguration.
     *
     * @param communicatorConfiguration The configuration object containing the OAuth2 client id, client secret and token URI,
     *                                  connect timeout, and socket timeout. None of these can be {@code null} or empty, and
     *                                  the timeout values must be positive.
     * @throws IllegalArgumentException If the OAuth2 client id, client secret or token URI from the communicator configuration
     *                                  is {@code null} or empty, or if the connect timeout or socket timeout is non-positive.
     */
    public OAuth2Authenticator(CommunicatorConfiguration communicatorConfiguration) {
        if (communicatorConfiguration.getOAuth2ClientId() == null || communicatorConfiguration.getOAuth2ClientId().trim().isEmpty()) {
            throw new IllegalArgumentException("clientId is required");
        }
        if (communicatorConfiguration.getOAuth2ClientSecret() == null || communicatorConfiguration.getOAuth2ClientSecret().trim().isEmpty()) {
            throw new IllegalArgumentException("clientSecret is required");
        }
        if (communicatorConfiguration.getOAuth2TokenUri() == null || communicatorConfiguration.getOAuth2TokenUri().trim().isEmpty()) {
            throw new IllegalArgumentException("tokenUri is required");
        }
        if (communicatorConfiguration.getConnectTimeout() <= 0) {
            throw new IllegalArgumentException("connectTimeout must be positive");
        }
        if (communicatorConfiguration.getSocketTimeout() <= 0) {
            throw new IllegalArgumentException("socketTimeout must be positive");
        }
        this.clientId = communicatorConfiguration.getOAuth2ClientId();
        this.clientSecret = communicatorConfiguration.getOAuth2ClientSecret();
        this.oauth2TokenUri = URI.create(communicatorConfiguration.getOAuth2TokenUri());
        this.connectTimeout = communicatorConfiguration.getConnectTimeout();
        this.socketTimeout = communicatorConfiguration.getSocketTimeout();
        this.proxyConfiguration = communicatorConfiguration.getProxyConfiguration();
        this.httpsProtocols = communicatorConfiguration.getHttpsProtocols();
    }

    @Override
    public String getAuthorization(String httpMethod, URI resourceUri, List<RequestHeader> requestHeaders) {
        OAuth2AccessToken accessToken = accessTokens.compute(TokenType.of(resourceUri.getPath()), (tokenType, existingToken) -> {
            try {
                if (isAccessTokenNullOrExpired(existingToken)) {
                    return getAccessToken(tokenType);
                }
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }

            return existingToken;
        });

        return "Bearer " + accessToken.getAccessToken();
    }

    private boolean isAccessTokenNullOrExpired(OAuth2AccessToken accessToken) {
        return accessToken == null || accessToken.getExpirationTime() < System.currentTimeMillis();
    }

    private OAuth2AccessToken getAccessToken(TokenType tokenType) throws IOException {
        List<RequestHeader> requestHeaders = Collections.singletonList(new RequestHeader(CONTENT_TYPE_KEY, CONTENT_TYPE_VALUE));
        String requestBody = getAccessTokenRequestBody(clientId, clientSecret, tokenType.scopes);

        try (Connection connection = new DefaultConnectionBuilder(connectTimeout, socketTimeout)
                .withMaxConnections(MAX_CONNECTIONS)
                .withProxyConfiguration(proxyConfiguration)
                .withHttpsProtocols(httpsProtocols)
                .build()) {

            return connection.post(oauth2TokenUri, requestHeaders, requestBody, getAccessTokenResponseHandler());
        }
    }

    private String getAccessTokenRequestBody(String clientId, String clientSecret, String scopes) {
        return String.format("grant_type=client_credentials&client_id=%s&client_secret=%s&scope=%s", clientId, clientSecret, scopes);
    }

    private ResponseHandler<OAuth2AccessToken> getAccessTokenResponseHandler() {
        long startTime = System.currentTimeMillis();

        return (statusCode, bodyStream, headers) -> {
            OAuth2AccessTokenResponse accessTokenResponse = MARSHALLER.unmarshal(bodyStream, OAuth2AccessTokenResponse.class);

            if (statusCode != HttpStatus.SC_OK) {
                throw new OAuth2Exception(
                        String.format("There was an error while retrieving the OAuth2 access token: %s - %s",
                                accessTokenResponse.getError(),
                                accessTokenResponse.getErrorDescription()
                        )
                );
            }

            long accessTokenExpiresMillis = accessTokenResponse.getExpiresIn() * 1000L;
            long accessTokenExpirationTime = startTime + accessTokenExpiresMillis;

            return new OAuth2AccessToken(accessTokenResponse.getAccessToken(), accessTokenExpirationTime);
        };
    }

    enum TokenType {
        // Only a limited amount of scopes may be sent in one request.
        // While at the moment all scopes fit in one request, keep this code so we can easily add more token types if necessary.
        // The empty path will ensure that all paths will match, as each full path ends with an empty string.
        DEFAULT("", "processing_payment", "processing_refund", "processing_credittransfer", "processing_accountverification",
                "processing_operation_reverse", "processing_dcc_rate", "services_ping"),
        ;

        private final String path;
        private final String scopes;

        TokenType(String pathMatch, String... scopes) {
            this.path = pathMatch;
            this.scopes = String.join(" ", scopes);
        }

        static TokenType of(String fullPath) {
            return Arrays.stream(values())
                    .filter(tokenType -> fullPath.endsWith(tokenType.path) || fullPath.contains(tokenType.path + "/"))
                    .findFirst()
                    .orElseThrow(() -> new IllegalArgumentException(String.format("Scope could not be found for path %s", fullPath)));
        }
    }
}
