package com.worldline.acquiring.sdk.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;

import org.junit.jupiter.api.Test;

import com.worldline.acquiring.sdk.java.authentication.Authenticator;
import com.worldline.acquiring.sdk.java.authentication.AuthorizationType;
import com.worldline.acquiring.sdk.java.authentication.OAuth2Authenticator;
import com.worldline.acquiring.sdk.java.communication.Connection;
import com.worldline.acquiring.sdk.java.communication.DefaultConnection;
import com.worldline.acquiring.sdk.java.communication.MetadataProvider;
import com.worldline.acquiring.sdk.java.communication.RequestHeader;
import com.worldline.acquiring.sdk.java.json.DefaultMarshaller;
import com.worldline.acquiring.sdk.java.util.DefaultConnectionAssertions;
import com.worldline.acquiring.sdk.java.util.ReflectionUtil;

class FactoryTest {

    static final URI PROPERTIES_OAUTH2_URI;
    static final String AUTH_ID     = "someId";
    static final String AUTH_SECRET = "someSecret";

    static {
        try {
            PROPERTIES_OAUTH2_URI = FactoryTest.class.getResource("configuration.oauth2.properties").toURI();
        } catch (URISyntaxException e) {
            InstantiationError error = new InstantiationError(e.getMessage());
            error.initCause(e);
            throw error;
        }
    }

    @Test
    void testCreateConfiguration() {
        CommunicatorConfiguration configuration = Factory.createConfiguration(PROPERTIES_OAUTH2_URI, AUTH_ID, AUTH_SECRET);
        assertEquals(URI.create("https://api.preprod.acquiring.worldline-solutions.com"), configuration.getApiEndpoint());
        assertEquals(AuthorizationType.OAUTH2, configuration.getAuthorizationType());
        assertEquals(1000, configuration.getConnectTimeout());
        assertEquals(1000, configuration.getSocketTimeout());
        assertEquals(100, configuration.getMaxConnections());
        assertEquals(AUTH_ID, configuration.getOAuth2ClientId());
        assertEquals(AUTH_SECRET, configuration.getOAuth2ClientSecret());
        assertNull(configuration.getProxyConfiguration());
    }

    @Test
    void testCreateCommunicator() {
        @SuppressWarnings("resource")
        Communicator communicator = Factory.createCommunicator(PROPERTIES_OAUTH2_URI, AUTH_ID, AUTH_SECRET);

        assertSame(DefaultMarshaller.INSTANCE, communicator.getMarshaller());

        @SuppressWarnings("resource")
        Connection connection = ReflectionUtil.getField(communicator, "connection", Connection.class);
        @SuppressWarnings("resource")
        DefaultConnection defaultConnection = assertInstanceOf(DefaultConnection.class, connection);
        DefaultConnectionAssertions.assertConnection(defaultConnection, 1000, 1000, 100, null);

        Authenticator authenticator = ReflectionUtil.getField(communicator, "authenticator", Authenticator.class);
        assertInstanceOf(OAuth2Authenticator.class, authenticator);
        assertEquals(AUTH_ID, ReflectionUtil.getField(authenticator, "clientId", String.class));
        assertEquals(AUTH_SECRET, ReflectionUtil.getField(authenticator, "clientSecret", String.class));

        MetadataProvider metadataProvider = ReflectionUtil.getField(communicator, "metadataProvider", MetadataProvider.class);
        assertEquals(MetadataProvider.class, metadataProvider.getClass());
        Collection<RequestHeader> requestHeaders = metadataProvider.getServerMetadataHeaders();
        assertEquals(1, requestHeaders.size());
        RequestHeader requestHeader = requestHeaders.iterator().next();
        assertEquals("X-WL-ServerMetaInfo", requestHeader.getName());
    }
}
