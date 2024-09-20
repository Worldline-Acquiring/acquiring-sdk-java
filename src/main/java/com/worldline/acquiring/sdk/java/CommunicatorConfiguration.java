package com.worldline.acquiring.sdk.java;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Pattern;

import com.worldline.acquiring.sdk.java.authentication.AuthorizationType;
import com.worldline.acquiring.sdk.java.domain.ShoppingCartExtension;

/**
 * Configuration for the communicator.
 */
public class CommunicatorConfiguration {

    /** The default number of maximum connections. */
    public static final int DEFAULT_MAX_CONNECTIONS = 10;

    /** The default HTTPS protocols. */
    public static final Set<String> DEFAULT_HTTPS_PROTOCOLS = Collections.unmodifiableSet(new LinkedHashSet<>(Arrays.asList("TLSv1.1", "TLSv1.2")));

    private static final Pattern COMMA_SEPARATOR_PATTERN = Pattern.compile("\\s*,\\s*");

    private URI apiEndpoint;

    private int connectTimeout;

    private int socketTimeout;

    private int maxConnections = DEFAULT_MAX_CONNECTIONS;

    private boolean connectionReuse = true;

    private AuthorizationType authorizationType;

    private String authorizationId;

    private String authorizationSecret;

    private String oauth2TokenUri;

    private ProxyConfiguration proxyConfiguration;

    private Set<String> httpsProtocols = new LinkedHashSet<>(DEFAULT_HTTPS_PROTOCOLS);

    private String integrator;

    private ShoppingCartExtension shoppingCartExtension;

    public CommunicatorConfiguration() {
    }

    public CommunicatorConfiguration(Properties properties) {
        if (properties != null) {
            apiEndpoint       = getApiEndpoint(properties);
            authorizationType = AuthorizationType.valueOf(properties.getProperty("acquiring.api.authorizationType"));
            oauth2TokenUri    = properties.getProperty("acquiring.api.oauth2.tokenUri");
            connectTimeout    = Integer.parseInt(properties.getProperty("acquiring.api.connectTimeout"));
            socketTimeout     = Integer.parseInt(properties.getProperty("acquiring.api.socketTimeout"));
            maxConnections    = getProperty(properties, "acquiring.api.maxConnections", DEFAULT_MAX_CONNECTIONS);

            String proxyURI  = properties.getProperty("acquiring.api.proxy.uri");
            String proxyUser = properties.getProperty("acquiring.api.proxy.username");
            String proxyPass = properties.getProperty("acquiring.api.proxy.password");
            if (proxyURI != null) {
                proxyConfiguration = new ProxyConfiguration(URI.create(proxyURI), proxyUser, proxyPass);
            }

            String httpsProtocolString = properties.getProperty("acquiring.api.https.protocols");
            if (httpsProtocolString != null) {
                httpsProtocols.clear();
                httpsProtocols.addAll(Arrays.asList(COMMA_SEPARATOR_PATTERN.split(httpsProtocolString.trim())));
            }

            connectionReuse = Boolean.parseBoolean(properties.getProperty("acquiring.api.connectionReuse", "true"));

            integrator            = properties.getProperty("acquiring.api.integrator");
            shoppingCartExtension = getShoppingCartExtension(properties);
        }
    }

    private static int getProperty(Properties properties, String key, int defaultValue) {
        String propertyValue = properties.getProperty(key, null);
        return propertyValue != null ? Integer.parseInt(propertyValue) : defaultValue;
    }

    private static URI getApiEndpoint(Properties properties) {
        String host   = properties.getProperty("acquiring.api.endpoint.host");
        String scheme = properties.getProperty("acquiring.api.endpoint.scheme");
        String port   = properties.getProperty("acquiring.api.endpoint.port");

        return createURI(scheme != null ? scheme : "https", host, port != null ? Integer.parseInt(port) : -1);
    }

    private static URI createURI(String scheme, String host, int port) {
        try {
            return new URI(scheme, null, host, port, null, null, null);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Unable to construct API endpoint URI", e);
        }
    }

    private static ShoppingCartExtension getShoppingCartExtension(Properties properties) {
        String creator     = properties.getProperty("acquiring.api.shoppingCartExtension.creator");
        String name        = properties.getProperty("acquiring.api.shoppingCartExtension.name");
        String version     = properties.getProperty("acquiring.api.shoppingCartExtension.version");
        String extensionId = properties.getProperty("acquiring.api.shoppingCartExtension.extensionId");

        if (creator == null && name == null && version == null && extensionId == null) {
            return null;
        } else if (extensionId == null) {
            return new ShoppingCartExtension(creator, name, version);
        } else {
            return new ShoppingCartExtension(creator, name, version, extensionId);
        }
    }

    /**
     * Returns the Worldline Acquiring platform API endpoint URI.
     */
    public URI getApiEndpoint() {
        return apiEndpoint;
    }

    public void setApiEndpoint(URI apiEndpoint) {
        if (apiEndpoint != null && apiEndpoint.getPath() != null && !apiEndpoint.getPath().isEmpty()) {
            throw new IllegalArgumentException("apiEndpoint should not contain a path");
        }
        if (apiEndpoint != null && (
                   apiEndpoint.getUserInfo() != null
                || apiEndpoint.getQuery() != null
                || apiEndpoint.getFragment() != null
                )) {
            throw new IllegalArgumentException("apiEndpoint should not contain user info, query or fragment");
        }
        this.apiEndpoint = apiEndpoint;
    }

    public CommunicatorConfiguration withApiEndpoint(URI apiEndpoint) {
        setApiEndpoint(apiEndpoint);
        return this;
    }

    /**
     * Returns an id used for authorization. The meaning of this id is different for each authorization type.
     * For instance, for {@link AuthorizationType#OAUTH2} this is the client id.
     */
    public String getAuthorizationId() {
        return authorizationId;
    }

    public void setAuthorizationId(String authorizationId) {
        this.authorizationId = authorizationId;
    }

    public CommunicatorConfiguration withAuthorizationId(String authorizationId) {
        setAuthorizationId(authorizationId);
        return this;
    }

    /**
     * Returns a secret used for authorization. The meaning of this secret is different for each authorization type.
     * For instance, for {@link AuthorizationType#OAUTH2} this is the client secret.
     */
    public String getAuthorizationSecret() {
        return authorizationSecret;
    }

    public void setAuthorizationSecret(String authorizationSecret) {
        this.authorizationSecret = authorizationSecret;
    }

    public CommunicatorConfiguration withAuthorizationSecret(String authorizationSecret) {
        setAuthorizationSecret(authorizationSecret);
        return this;
    }

    /**
     * The OAuth2 client id.
     * <p>
     * This method is an alias for {@link #getAuthorizationId()}.
     */
    public String getOAuth2ClientId() {
        return getAuthorizationId();
    }

    /**
     * This method is an alias for {@link #setAuthorizationId(String)}.
     */
    public void setOAuth2ClientId(String oauth2ClientId) {
        setAuthorizationId(oauth2ClientId);
    }

    /**
     * This method is an alias for {@link #withAuthorizationId(String)}.
     */
    public CommunicatorConfiguration withOAuth2ClientId(String oauth2ClientId) {
        return withAuthorizationId(oauth2ClientId);
    }

    /**
     * The OAuth2 client secret.
     * <p>
     * This method is an alias for {@link #getAuthorizationSecret()}.
     */
    public String getOAuth2ClientSecret() {
        return getAuthorizationSecret();
    }

    /**
     * This method is an alias for {@link #setAuthorizationSecret(String)}.
     */
    public void setOAuth2ClientSecret(String oauth2ClientSecret) {
        setAuthorizationSecret(oauth2ClientSecret);
    }

    /**
     * This method is an alias for {@link #withAuthorizationSecret(String)}.
     */
    public CommunicatorConfiguration withOAuth2ClientSecret(String oauth2ClientSecret) {
        return withAuthorizationSecret(oauth2ClientSecret);
    }

    public String getOAuth2TokenUri() {
        return oauth2TokenUri;
    }

    public void setOAuth2TokenUri(String oauth2TokenUri) {
        this.oauth2TokenUri = oauth2TokenUri;
    }

    public CommunicatorConfiguration withOAuth2TokenUri(String oauth2TokenUri) {
        setOAuth2TokenUri(oauth2TokenUri);
        return this;
    }

    public AuthorizationType getAuthorizationType() {
        return authorizationType;
    }

    public void setAuthorizationType(AuthorizationType authorizationType) {
        this.authorizationType = authorizationType;
    }

    public CommunicatorConfiguration withAuthorizationType(AuthorizationType authorizationType) {
        setAuthorizationType(authorizationType);
        return this;
    }

    public int getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public CommunicatorConfiguration withConnectTimeout(int connectTimeout) {
        setConnectTimeout(connectTimeout);
        return this;
    }

    public int getSocketTimeout() {
        return socketTimeout;
    }

    public void setSocketTimeout(int socketTimeout) {
        this.socketTimeout = socketTimeout;
    }

    public CommunicatorConfiguration withSocketTimeout(int socketTimeout) {
        setSocketTimeout(socketTimeout);
        return this;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(int maxConnections) {
        this.maxConnections = maxConnections;
    }

    public CommunicatorConfiguration withMaxConnections(int maxConnections) {
        setMaxConnections(maxConnections);
        return this;
    }

    public boolean isConnectionReuse() {
        return connectionReuse;
    }

    public void setConnectionReuse(boolean connectionReuse) {
        this.connectionReuse = connectionReuse;
    }

    public CommunicatorConfiguration withConnectionReuse(boolean connectionReuse) {
        this.connectionReuse = connectionReuse;
        return this;
    }

    public ProxyConfiguration getProxyConfiguration() {
        return proxyConfiguration;
    }

    public void setProxyConfiguration(ProxyConfiguration proxyConfiguration) {
        this.proxyConfiguration = proxyConfiguration;
    }

    public CommunicatorConfiguration withProxyConfiguration(ProxyConfiguration proxyConfiguration) {
        setProxyConfiguration(proxyConfiguration);
        return this;
    }

    public Set<String> getHttpsProtocols() {
        if (httpsProtocols == null) {
            httpsProtocols = new LinkedHashSet<>();
        }
        return httpsProtocols;
    }

    public void setHttpsProtocols(Set<String> httpsProtocols) {
        this.httpsProtocols = httpsProtocols;
    }

    public CommunicatorConfiguration withHttpsProtocols(Collection<String> httpsProtocols) {
        getHttpsProtocols().clear();
        getHttpsProtocols().addAll(httpsProtocols);
        return this;
    }

    public CommunicatorConfiguration withHttpsProtocols(String... httpsProtocols) {
        return withHttpsProtocols(Arrays.asList(httpsProtocols));
    }

    public String getIntegrator() {
        return integrator;
    }

    public void setIntegrator(String integrator) {
        this.integrator = integrator;
    }

    public CommunicatorConfiguration withIntegrator(String integrator) {
        setIntegrator(integrator);
        return this;
    }

    public ShoppingCartExtension getShoppingCartExtension() {
        return shoppingCartExtension;
    }

    public void setShoppingCartExtension(ShoppingCartExtension shoppingCartExtension) {
        this.shoppingCartExtension = shoppingCartExtension;
    }

    public CommunicatorConfiguration withShoppingCartExtension(ShoppingCartExtension shoppingCartExtension) {
        setShoppingCartExtension(shoppingCartExtension);
        return this;
    }
}
