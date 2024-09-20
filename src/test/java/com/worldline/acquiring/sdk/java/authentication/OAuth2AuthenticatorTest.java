package com.worldline.acquiring.sdk.java.authentication;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;

import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.localserver.LocalServerTestBase;
import org.apache.http.protocol.HttpRequestHandler;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import com.worldline.acquiring.sdk.java.CommunicatorConfiguration;

class OAuth2AuthenticatorTest extends LocalServerTestBase {

    private static final String CLIENT_ID = UUID.randomUUID().toString();
    private static final String CLIENT_SECRET = UUID.randomUUID().toString();
    private static final int CONNECTION_TIMEOUT = 1000;
    private static final int SOCKET_TIMEOUT = 1000;
    private static final String OAUTH2_TOKEN_URI = "/auth/realms/api/protocol/openid-connect/token";

    private CommunicatorConfiguration communicatorConfiguration;

    private HttpRequestHandler httpRequestHandler;

    @BeforeEach
    void setup() throws Exception {
        setUp();

        httpRequestHandler = mock(HttpRequestHandler.class);

        serverBootstrap.registerHandler(OAUTH2_TOKEN_URI, httpRequestHandler);
        HttpHost host = start();

        communicatorConfiguration = new CommunicatorConfiguration();
        communicatorConfiguration.setOAuth2ClientId(CLIENT_ID);
        communicatorConfiguration.setOAuth2ClientSecret(CLIENT_SECRET);
        communicatorConfiguration.setConnectTimeout(CONNECTION_TIMEOUT);
        communicatorConfiguration.setSocketTimeout(SOCKET_TIMEOUT);
        communicatorConfiguration.setOAuth2TokenUri(host.toURI() + OAUTH2_TOKEN_URI);
    }

    @AfterEach
    void shutdown() throws Exception {
        shutDown();
    }

    @Nested
    class GetAuthorization {

        @Test
        void testSuccess() throws Exception {
            OAuth2Authenticator oauth2Authenticator = new OAuth2Authenticator(communicatorConfiguration);
            setupRequestHandler(setJsonResponse("oauth2AccessToken.json", 200));

            String authorization = oauth2Authenticator.getAuthorization(null, URI.create("/api/v1/payments"), null);

            assertEquals("Bearer accessToken", authorization);
            verify(httpRequestHandler).handle(any(), any(), any());
        }

        @Test
        void testWithInvalidClient() throws Exception {
            OAuth2Authenticator oauth2Authenticator = new OAuth2Authenticator(communicatorConfiguration);
            setupRequestHandler(setJsonResponse("oauth2AccessToken.invalidClient.json", 401));

            URI uri = URI.create("/api/v1/payments");
            OAuth2Exception exception = assertThrows(OAuth2Exception.class, () -> oauth2Authenticator.getAuthorization(null, uri, null));

            assertEquals("There was an error while retrieving the OAuth2 access token: unauthorized_client - INVALID_CREDENTIALS: Invalid client credentials", exception.getMessage());
            verify(httpRequestHandler).handle(any(), any(), any());
        }

        @Nested
        class MultiThreaded {

            @Test
            void testWithValidToken() throws Exception {
                OAuth2Authenticator oauth2Authenticator = new OAuth2Authenticator(communicatorConfiguration);
                setupRequestHandler(setJsonResponse("oauth2AccessToken.json", 200));

                CountDownLatch startLatch = new CountDownLatch(1);
                CountDownLatch readyLatch = new CountDownLatch(10);
                CountDownLatch finishLatch = new CountDownLatch(10);

                List<Exception> exceptions = new ArrayList<>();

                for (int i = 0; i < 10; i++) {
                    new Thread(() -> {
                        try {
                            readyLatch.countDown();
                            startLatch.await();
                            oauth2Authenticator.getAuthorization(null, URI.create("/api/v1/payments"), null);
                        } catch (Exception e) {
                            exceptions.add(e);
                        } finally {
                            finishLatch.countDown();
                        }
                    }).start();
                }

                readyLatch.await();
                startLatch.countDown();
                finishLatch.await();

                assertEquals(Collections.emptyList(), exceptions);
                verify(httpRequestHandler, times(1)).handle(any(), any(), any());
            }

            @Test
            void testWithExpiredToken() throws Exception {
                OAuth2Authenticator oauth2Authenticator = new OAuth2Authenticator(communicatorConfiguration);
                setupRequestHandler(setJsonResponse("oauth2AccessToken.expired.json", 200));

                CountDownLatch startLatch = new CountDownLatch(1);
                CountDownLatch readyLatch = new CountDownLatch(10);
                CountDownLatch finishLatch = new CountDownLatch(10);

                List<Exception> exceptions = new ArrayList<>();

                for (int i = 0; i < 10; i++) {
                    new Thread(() -> {
                        try {
                            readyLatch.countDown();
                            startLatch.await();
                            oauth2Authenticator.getAuthorization(null, URI.create("/api/v1/payments"), null);
                        } catch (Exception e) {
                            exceptions.add(e);
                        } finally {
                            finishLatch.countDown();
                        }
                    }).start();
                }

                readyLatch.await();
                startLatch.countDown();
                finishLatch.await();

                assertEquals(Collections.emptyList(), exceptions);
                verify(httpRequestHandler, times(10)).handle(any(), any(), any());
            }
        }
    }

    private void setupRequestHandler(Answer<Void> answer) throws IOException, HttpException {
        doAnswer(answer).when(httpRequestHandler).handle(any(), any(), any());
    }

    private Answer<Void> setJsonResponse(String resource, int statusCode) {
        return invocation -> {
            HttpResponse response = invocation.getArgument(1, HttpResponse.class);

            response.setStatusCode(statusCode);
            response.setHeader("Content-Type", "application/json");

            response.setEntity(createEntity(resource));

            return null;
        };
    }

    @SuppressWarnings("resource")
    private InputStreamEntity createEntity(String resource) {
        return new InputStreamEntity(OAuth2AuthenticatorTest.class.getResourceAsStream(resource));
    }
}
