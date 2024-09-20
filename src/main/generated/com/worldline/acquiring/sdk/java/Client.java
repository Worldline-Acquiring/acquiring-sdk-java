/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.worldline.acquiring.sdk.java.communication.PooledConnection;
import com.worldline.acquiring.sdk.java.logging.BodyObfuscator;
import com.worldline.acquiring.sdk.java.logging.CommunicatorLogger;
import com.worldline.acquiring.sdk.java.logging.HeaderObfuscator;
import com.worldline.acquiring.sdk.java.logging.LoggingCapable;
import com.worldline.acquiring.sdk.java.logging.ObfuscationCapable;
import com.worldline.acquiring.sdk.java.v1.V1Client;

/**
 * Worldline Acquiring platform client.
 * <p>
 * Thread-safe.
 */
public class Client extends ApiResource implements Closeable, LoggingCapable, ObfuscationCapable {

    public Client(Communicator communicator) {
        super(communicator, null);
    }

    /**
     * Utility method that delegates the call to this client's communicator.
     *
     * @see Communicator#closeIdleConnections(long, TimeUnit)
     * @see PooledConnection#closeIdleConnections(long, TimeUnit)
     */
    public void closeIdleConnections(long idleTime, TimeUnit timeUnit) {
        communicator.closeIdleConnections(idleTime, timeUnit);
    }

    /**
     * Utility method that delegates the call to this client's communicator.
     *
     * @see Communicator#closeExpiredConnections()
     * @see PooledConnection#closeExpiredConnections()
     */
    public void closeExpiredConnections() {
        communicator.closeExpiredConnections();
    }

    @Override
    public void setBodyObfuscator(BodyObfuscator bodyObfuscator) {
        // delegate to the communicator
        communicator.setBodyObfuscator(bodyObfuscator);
    }

    @Override
    public void setHeaderObfuscator(HeaderObfuscator headerObfuscator) {
        // delegate to the communicator
        communicator.setHeaderObfuscator(headerObfuscator);
    }

    @Override
    public void enableLogging(CommunicatorLogger communicatorLogger) {
        // delegate to the communicator
        communicator.enableLogging(communicatorLogger);
    }

    @Override
    public void disableLogging() {
        // delegate to the communicator
        communicator.disableLogging();
    }

    /**
     * Releases any system resources associated with this object.
     */
    @Override
    public void close() throws IOException {
        communicator.close();
    }

    public V1Client v1() {
        return new V1Client(this, null);
    }
}
