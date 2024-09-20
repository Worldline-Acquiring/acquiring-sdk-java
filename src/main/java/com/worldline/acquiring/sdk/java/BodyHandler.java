package com.worldline.acquiring.sdk.java;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.worldline.acquiring.sdk.java.communication.ResponseHeader;

/**
 * An interface for handling binary responses.
 */
public interface BodyHandler {

    /**
     * @param bodyStream The raw response body as an input stream. Note that it will be closed outside of this method.
     * @param headers The headers that were returned by the Worldline Acquiring platform. Never {@code null}.
     */
    void handleBody(InputStream bodyStream, List<ResponseHeader> headers) throws IOException;
}
