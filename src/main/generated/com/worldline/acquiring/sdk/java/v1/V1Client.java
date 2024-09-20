/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1;

import java.util.Map;
import java.util.TreeMap;

import com.worldline.acquiring.sdk.java.ApiResource;
import com.worldline.acquiring.sdk.java.v1.acquirer.AcquirerClient;
import com.worldline.acquiring.sdk.java.v1.ping.PingClient;

/**
 * V1 client. Thread-safe.
 */
public class V1Client extends ApiResource {

    public V1Client(ApiResource parent, Map<String, String> pathContext) {
        super(parent, pathContext);
    }

    /**
     * Resource /processing/v1/{acquirerId}
     *
     * @param acquirerId String
     * @return AcquirerClient
     */
    public AcquirerClient acquirer(String acquirerId) {
        Map<String, String> subContext = new TreeMap<>();
        subContext.put("acquirerId", acquirerId);
        return new AcquirerClient(this, subContext);
    }

    /**
     * Resource /services/v1/ping
     *
     * @return PingClient
     */
    public PingClient ping() {
        return new PingClient(this, null);
    }
}
