package com.worldline.acquiring.sdk.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.worldline.acquiring.sdk.java.authentication.Authenticator;
import com.worldline.acquiring.sdk.java.communication.Connection;
import com.worldline.acquiring.sdk.java.communication.MetadataProvider;
import com.worldline.acquiring.sdk.java.communication.RequestParam;
import com.worldline.acquiring.sdk.java.json.Marshaller;

class CommunicatorTest {

    private static final URI BASE_URI = URI.create("https://api.preprod.acquiring.worldline-solutions.com");

    private Connection connection;
    private Authenticator authenticator;
    private MetadataProvider metadataProvider;
    private Marshaller marshaller;

    @BeforeEach
    void initMocks() {
        connection = mock(Connection.class);
        authenticator = mock(Authenticator.class);
        metadataProvider = mock(MetadataProvider.class);
        marshaller = mock(Marshaller.class);
    }

    @Nested
    class ToAbsoluteURI {

        @Test
        void testWithoutRequestParams() {
            @SuppressWarnings("resource")
            Communicator communicator = new Communicator(BASE_URI, connection, authenticator, metadataProvider, marshaller);

            URI uri = communicator.toAbsoluteURI("services/v1/100812/520000214/dcc-rates", Collections.emptyList());
            assertEquals(URI.create("https://api.preprod.acquiring.worldline-solutions.com/services/v1/100812/520000214/dcc-rates"), uri);

            uri = communicator.toAbsoluteURI("/services/v1/100812/520000214/dcc-rates", Collections.emptyList());
            assertEquals(URI.create("https://api.preprod.acquiring.worldline-solutions.com/services/v1/100812/520000214/dcc-rates"), uri);
        }

        @Test
        void testWithRequestParams() {
            List<RequestParam> requestParams = Arrays.asList(
                    new RequestParam("amount", "123"),
                    new RequestParam("source", "USD"),
                    new RequestParam("target", "EUR"),
                    new RequestParam("dummy", "é&%=")
            );

            @SuppressWarnings("resource")
            Communicator communicator = new Communicator(BASE_URI, connection, authenticator, metadataProvider, marshaller);

            URI uri = communicator.toAbsoluteURI("services/v1/100812/520000214/dcc-rates", requestParams);
            assertEquals(URI.create("https://api.preprod.acquiring.worldline-solutions.com/services/v1/100812/520000214/dcc-rates?amount=123&source=USD&target=EUR&dummy=%C3%A9%26%25%3D"), uri);

            uri = communicator.toAbsoluteURI("/services/v1/100812/520000214/dcc-rates", requestParams);
            assertEquals(URI.create("https://api.preprod.acquiring.worldline-solutions.com/services/v1/100812/520000214/dcc-rates?amount=123&source=USD&target=EUR&dummy=%C3%A9%26%25%3D"), uri);
        }
    }
}
