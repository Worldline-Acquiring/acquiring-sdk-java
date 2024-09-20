package com.worldline.acquiring.sdk.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.net.URI;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Properties;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.worldline.acquiring.sdk.java.authentication.AuthorizationType;

class CommunicatorConfigurationTest {

    @Nested
    class ConstructFromProperties {

        @Test
        void testWithoutProxy() {
            Properties properties = new Properties();
            properties.setProperty("acquiring.api.endpoint.host", "api.preprod.acquiring.worldline-solutions.com");
            properties.setProperty("acquiring.api.authorizationType", "OAUTH2");
            properties.setProperty("acquiring.api.connectTimeout", "20000");
            properties.setProperty("acquiring.api.socketTimeout", "10000");

            CommunicatorConfiguration configuration = new CommunicatorConfiguration(properties);

            assertEquals(URI.create("https://api.preprod.acquiring.worldline-solutions.com"), configuration.getApiEndpoint());
            assertEquals(AuthorizationType.OAUTH2, configuration.getAuthorizationType());
            assertEquals(20000, configuration.getConnectTimeout());
            assertEquals(10000, configuration.getSocketTimeout());
            assertEquals(CommunicatorConfiguration.DEFAULT_MAX_CONNECTIONS, configuration.getMaxConnections());
            assertTrue(configuration.isConnectionReuse());
            assertNull(configuration.getAuthorizationId());
            assertNull(configuration.getAuthorizationSecret());
            assertNull(configuration.getProxyConfiguration());
            assertEquals(CommunicatorConfiguration.DEFAULT_HTTPS_PROTOCOLS, configuration.getHttpsProtocols());
            assertNull(configuration.getIntegrator());
            assertNull(configuration.getShoppingCartExtension());
        }

        @Test
        void testWithProxyWithoutAuthentication() {
            Properties properties = new Properties();
            properties.setProperty("acquiring.api.endpoint.host", "api.preprod.acquiring.worldline-solutions.com");
            properties.setProperty("acquiring.api.authorizationType", "OAUTH2");
            properties.setProperty("acquiring.api.connectTimeout", "20000");
            properties.setProperty("acquiring.api.socketTimeout", "10000");
            properties.setProperty("acquiring.api.proxy.uri", "http://proxy.example.org:3128");

            CommunicatorConfiguration configuration = new CommunicatorConfiguration(properties);

            assertEquals(URI.create("https://api.preprod.acquiring.worldline-solutions.com"), configuration.getApiEndpoint());
            assertEquals(AuthorizationType.OAUTH2, configuration.getAuthorizationType());
            assertEquals(20000, configuration.getConnectTimeout());
            assertEquals(10000, configuration.getSocketTimeout());
            assertEquals(CommunicatorConfiguration.DEFAULT_MAX_CONNECTIONS, configuration.getMaxConnections());
            assertTrue(configuration.isConnectionReuse());
            assertNull(configuration.getAuthorizationId());
            assertNull(configuration.getAuthorizationSecret());

            assertNotNull(configuration.getProxyConfiguration());
            ProxyConfiguration proxyConfiguration = configuration.getProxyConfiguration();
            assertEquals("http", proxyConfiguration.getScheme());
            assertEquals("proxy.example.org", proxyConfiguration.getHost());
            assertEquals(3128, proxyConfiguration.getPort());
            assertNull(proxyConfiguration.getUsername());
            assertNull(proxyConfiguration.getPassword());
        }

        @Test
        void testWithProxyWithAuthentication() {
            Properties properties = new Properties();
            properties.setProperty("acquiring.api.endpoint.host", "api.preprod.acquiring.worldline-solutions.com");
            properties.setProperty("acquiring.api.authorizationType", "OAUTH2");
            properties.setProperty("acquiring.api.connectTimeout", "20000");
            properties.setProperty("acquiring.api.socketTimeout", "10000");
            properties.setProperty("acquiring.api.proxy.uri", "http://proxy.example.org:3128");
            properties.setProperty("acquiring.api.proxy.username", "proxy-username");
            properties.setProperty("acquiring.api.proxy.password", "proxy-password");

            CommunicatorConfiguration configuration = new CommunicatorConfiguration(properties);

            assertEquals(URI.create("https://api.preprod.acquiring.worldline-solutions.com"), configuration.getApiEndpoint());
            assertEquals(AuthorizationType.OAUTH2, configuration.getAuthorizationType());
            assertEquals(20000, configuration.getConnectTimeout());
            assertEquals(10000, configuration.getSocketTimeout());
            assertEquals(CommunicatorConfiguration.DEFAULT_MAX_CONNECTIONS, configuration.getMaxConnections());
            assertTrue(configuration.isConnectionReuse());
            assertNull(configuration.getAuthorizationId());
            assertNull(configuration.getAuthorizationSecret());

            assertNotNull(configuration.getProxyConfiguration());
            ProxyConfiguration proxyConfiguration = configuration.getProxyConfiguration();
            assertEquals("http", proxyConfiguration.getScheme());
            assertEquals("proxy.example.org", proxyConfiguration.getHost());
            assertEquals(3128, proxyConfiguration.getPort());
            assertEquals("proxy-username", proxyConfiguration.getUsername());
            assertEquals("proxy-password", proxyConfiguration.getPassword());
        }

        @Test
        void testWithMaxConnections() {
            Properties properties = new Properties();
            properties.setProperty("acquiring.api.endpoint.host", "api.preprod.acquiring.worldline-solutions.com");
            properties.setProperty("acquiring.api.authorizationType", "OAUTH2");
            properties.setProperty("acquiring.api.connectTimeout", "20000");
            properties.setProperty("acquiring.api.socketTimeout", "10000");
            properties.setProperty("acquiring.api.maxConnections", "100");

            CommunicatorConfiguration configuration = new CommunicatorConfiguration(properties);

            assertEquals(URI.create("https://api.preprod.acquiring.worldline-solutions.com"), configuration.getApiEndpoint());
            assertEquals(AuthorizationType.OAUTH2, configuration.getAuthorizationType());
            assertEquals(20000, configuration.getConnectTimeout());
            assertEquals(10000, configuration.getSocketTimeout());
            assertEquals(100, configuration.getMaxConnections());
            assertTrue(configuration.isConnectionReuse());
            assertNull(configuration.getAuthorizationId());
            assertNull(configuration.getAuthorizationSecret());
            assertNull(configuration.getProxyConfiguration());
        }

        @Test
        void testWithConnectionReuse() {
            Properties properties = new Properties();
            properties.setProperty("acquiring.api.endpoint.host", "api.preprod.acquiring.worldline-solutions.com");
            properties.setProperty("acquiring.api.authorizationType", "OAUTH2");
            properties.setProperty("acquiring.api.connectTimeout", "20000");
            properties.setProperty("acquiring.api.socketTimeout", "10000");
            properties.setProperty("acquiring.api.connectionReuse", "false");

            CommunicatorConfiguration configuration = new CommunicatorConfiguration(properties);

            assertEquals(URI.create("https://api.preprod.acquiring.worldline-solutions.com"), configuration.getApiEndpoint());
            assertEquals(AuthorizationType.OAUTH2, configuration.getAuthorizationType());
            assertEquals(20000, configuration.getConnectTimeout());
            assertEquals(10000, configuration.getSocketTimeout());
            assertEquals(CommunicatorConfiguration.DEFAULT_MAX_CONNECTIONS, configuration.getMaxConnections());
            assertFalse(configuration.isConnectionReuse());
            assertNull(configuration.getAuthorizationId());
            assertNull(configuration.getAuthorizationSecret());
            assertNull(configuration.getProxyConfiguration());
        }

        @Test
        void testWithHost() {
            Properties properties = new Properties();
            properties.setProperty("acquiring.api.endpoint.host", "api.preprod.acquiring.worldline-solutions.com");
            properties.setProperty("acquiring.api.authorizationType", "OAUTH2");
            properties.setProperty("acquiring.api.connectTimeout", "20000");
            properties.setProperty("acquiring.api.socketTimeout", "10000");

            CommunicatorConfiguration configuration = new CommunicatorConfiguration(properties);

            assertEquals(URI.create("https://api.preprod.acquiring.worldline-solutions.com"), configuration.getApiEndpoint());
        }

        @Test
        void testWithHostAndScheme() {
            Properties properties = new Properties();
            properties.setProperty("acquiring.api.endpoint.host", "api.preprod.acquiring.worldline-solutions.com");
            properties.setProperty("acquiring.api.endpoint.scheme", "http");
            properties.setProperty("acquiring.api.authorizationType", "OAUTH2");
            properties.setProperty("acquiring.api.connectTimeout", "20000");
            properties.setProperty("acquiring.api.socketTimeout", "10000");

            CommunicatorConfiguration configuration = new CommunicatorConfiguration(properties);

            assertEquals(URI.create("http://api.preprod.acquiring.worldline-solutions.com"), configuration.getApiEndpoint());
        }

        @Test
        void testWithHostAndPort() {
            Properties properties = new Properties();
            properties.setProperty("acquiring.api.endpoint.host", "api.preprod.acquiring.worldline-solutions.com");
            properties.setProperty("acquiring.api.endpoint.port", "8443");
            properties.setProperty("acquiring.api.authorizationType", "OAUTH2");
            properties.setProperty("acquiring.api.connectTimeout", "20000");
            properties.setProperty("acquiring.api.socketTimeout", "10000");

            CommunicatorConfiguration configuration = new CommunicatorConfiguration(properties);

            assertEquals(URI.create("https://api.preprod.acquiring.worldline-solutions.com:8443"), configuration.getApiEndpoint());
        }

        @Test
        void testWithHostSchemeAndPort() {
            Properties properties = new Properties();
            properties.setProperty("acquiring.api.endpoint.host", "api.preprod.acquiring.worldline-solutions.com");
            properties.setProperty("acquiring.api.endpoint.scheme", "http");
            properties.setProperty("acquiring.api.endpoint.port", "8080");
            properties.setProperty("acquiring.api.authorizationType", "OAUTH2");
            properties.setProperty("acquiring.api.connectTimeout", "20000");
            properties.setProperty("acquiring.api.socketTimeout", "10000");

            CommunicatorConfiguration configuration = new CommunicatorConfiguration(properties);

            assertEquals(URI.create("http://api.preprod.acquiring.worldline-solutions.com:8080"), configuration.getApiEndpoint());
        }

        @Test
        void testWithIPv6Host() {
            Properties properties = new Properties();
            properties.setProperty("acquiring.api.endpoint.host", "::1");
            properties.setProperty("acquiring.api.authorizationType", "OAUTH2");
            properties.setProperty("acquiring.api.connectTimeout", "20000");
            properties.setProperty("acquiring.api.socketTimeout", "10000");

            CommunicatorConfiguration configuration = new CommunicatorConfiguration(properties);

            assertEquals(URI.create("https://[::1]"), configuration.getApiEndpoint());
        }

        @Test
        void testWithHttpsProtocols() {
            Properties properties = new Properties();
            properties.setProperty("acquiring.api.endpoint.host", "api.preprod.acquiring.worldline-solutions.com");
            properties.setProperty("acquiring.api.authorizationType", "OAUTH2");
            properties.setProperty("acquiring.api.connectTimeout", "20000");
            properties.setProperty("acquiring.api.socketTimeout", "10000");
            properties.setProperty("acquiring.api.https.protocols", "TLSv1, TLSv1.1, TLSv1.2");

            CommunicatorConfiguration configuration = new CommunicatorConfiguration(properties);

            assertEquals(URI.create("https://api.preprod.acquiring.worldline-solutions.com"), configuration.getApiEndpoint());
            assertEquals(AuthorizationType.OAUTH2, configuration.getAuthorizationType());
            assertEquals(20000, configuration.getConnectTimeout());
            assertEquals(10000, configuration.getSocketTimeout());
            assertEquals(CommunicatorConfiguration.DEFAULT_MAX_CONNECTIONS, configuration.getMaxConnections());
            assertTrue(configuration.isConnectionReuse());
            assertNull(configuration.getAuthorizationId());
            assertNull(configuration.getAuthorizationSecret());
            assertNull(configuration.getProxyConfiguration());
            assertEquals(new HashSet<>(Arrays.asList("TLSv1", "TLSv1.1", "TLSv1.2")), configuration.getHttpsProtocols());
            assertNull(configuration.getIntegrator());
            assertNull(configuration.getShoppingCartExtension());
        }

        @Test
        void testWithMetadata() {
            Properties properties = new Properties();
            properties.setProperty("acquiring.api.endpoint.host", "api.preprod.acquiring.worldline-solutions.com");
            properties.setProperty("acquiring.api.authorizationType", "OAUTH2");
            properties.setProperty("acquiring.api.connectTimeout", "20000");
            properties.setProperty("acquiring.api.socketTimeout", "10000");
            properties.setProperty("acquiring.api.integrator", "Worldline.Integrator");
            properties.setProperty("acquiring.api.shoppingCartExtension.creator", "Worldline.Creator");
            properties.setProperty("acquiring.api.shoppingCartExtension.name", "Worldline.ShoppingCarts");
            properties.setProperty("acquiring.api.shoppingCartExtension.version", "1.0");

            CommunicatorConfiguration configuration = new CommunicatorConfiguration(properties);

            assertEquals(URI.create("https://api.preprod.acquiring.worldline-solutions.com"), configuration.getApiEndpoint());
            assertEquals(AuthorizationType.OAUTH2, configuration.getAuthorizationType());
            assertEquals(20000, configuration.getConnectTimeout());
            assertEquals(10000, configuration.getSocketTimeout());
            assertEquals(CommunicatorConfiguration.DEFAULT_MAX_CONNECTIONS, configuration.getMaxConnections());
            assertTrue(configuration.isConnectionReuse());
            assertNull(configuration.getAuthorizationId());
            assertNull(configuration.getAuthorizationSecret());
            assertNull(configuration.getProxyConfiguration());
            assertEquals("Worldline.Integrator", configuration.getIntegrator());
            assertNotNull(configuration.getShoppingCartExtension());
            assertEquals("Worldline.Creator", configuration.getShoppingCartExtension().getCreator());
            assertEquals("Worldline.ShoppingCarts", configuration.getShoppingCartExtension().getName());
            assertEquals("1.0", configuration.getShoppingCartExtension().getVersion());
        }
    }
}
