/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.acquirer;

import java.util.Map;
import java.util.TreeMap;

import com.worldline.acquiring.sdk.java.ApiResource;
import com.worldline.acquiring.sdk.java.v1.acquirer.merchant.MerchantClient;

/**
 * Acquirer client. Thread-safe.
 */
public class AcquirerClient extends ApiResource {

    public AcquirerClient(ApiResource parent, Map<String, String> pathContext) {
        super(parent, pathContext);
    }

    /**
     * Resource /processing/v1/{acquirerId}/{merchantId}
     *
     * @param merchantId String
     * @return MerchantClient
     */
    public MerchantClient merchant(String merchantId) {
        Map<String, String> subContext = new TreeMap<>();
        subContext.put("merchantId", merchantId);
        return new MerchantClient(this, subContext);
    }
}
