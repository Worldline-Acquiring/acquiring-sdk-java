package com.worldline.acquiring.sdk.java;

import static com.worldline.acquiring.sdk.java.FactoryTest.AUTH_ID;
import static com.worldline.acquiring.sdk.java.FactoryTest.AUTH_SECRET;
import static com.worldline.acquiring.sdk.java.FactoryTest.PROPERTIES_OAUTH2_URI;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.worldline.acquiring.sdk.java.communication.Connection;
import com.worldline.acquiring.sdk.java.communication.PooledConnection;

class ClientTest {

    private PooledConnection pooledConnection;
    private Connection connection;

    @BeforeEach
    void initMocks() {
        pooledConnection = mock(PooledConnection.class);
        connection = mock(Connection.class);
    }

    @Nested
    class CloseIdleConnections {

        @Test
        @SuppressWarnings("resource")
        void testNotPooled() {
            CommunicatorBuilder builder = Factory.createCommunicatorBuilder(PROPERTIES_OAUTH2_URI, AUTH_ID, AUTH_SECRET);
            Communicator communicator = builder.withConnection(connection).build();
            Client client = Factory.createClient(communicator);
            // with a connection that isn't a PooledConnection, this doesn't throw any exceptions
            assertDoesNotThrow(() -> client.closeIdleConnections(5, TimeUnit.SECONDS));
        }

        @Test
        @SuppressWarnings("resource")
        void testPooled() {
            CommunicatorBuilder builder = Factory.createCommunicatorBuilder(PROPERTIES_OAUTH2_URI, AUTH_ID, AUTH_SECRET);
            Communicator communicator = builder.withConnection(pooledConnection).build();
            Client client = Factory.createClient(communicator);
            // with a connection that is a PooledConnection, this gets delegated to pooledConnection
            client.closeIdleConnections(5, TimeUnit.SECONDS);

            verify(pooledConnection).closeIdleConnections(5, TimeUnit.SECONDS);
        }
    }

    @Nested
    class CloseExpiredConnections {

        @Test
        @SuppressWarnings("resource")
        void testNotPooled() {
            CommunicatorBuilder builder = Factory.createCommunicatorBuilder(PROPERTIES_OAUTH2_URI, AUTH_ID, AUTH_SECRET);
            Communicator communicator = builder.withConnection(connection).build();
            Client client = Factory.createClient(communicator);
            // with a connection that isn't a PooledConnection, this doesn't throw any exceptions
            assertDoesNotThrow(client::closeExpiredConnections);
        }

        @Test
        @SuppressWarnings("resource")
        void testPooled() {
            CommunicatorBuilder builder = Factory.createCommunicatorBuilder(PROPERTIES_OAUTH2_URI, AUTH_ID, AUTH_SECRET);
            Communicator communicator = builder.withConnection(pooledConnection).build();
            Client client = Factory.createClient(communicator);
            // with a connection that is a PooledConnection, this gets delegated to pooledConnection
            client.closeExpiredConnections();

            verify(pooledConnection).closeExpiredConnections();
        }
    }
}
