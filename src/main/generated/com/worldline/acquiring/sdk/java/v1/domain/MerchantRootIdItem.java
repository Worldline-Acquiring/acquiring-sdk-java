/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class MerchantRootIdItem {

    private String acquirerId;

    private String merchantRootId;

    /**
     * The unique identifier of the acquirer.
     */
    public String getAcquirerId() {
        return acquirerId;
    }

    /**
     * The unique identifier of the acquirer.
     */
    public void setAcquirerId(String value) {
        this.acquirerId = value;
    }

    /**
     * The unique identifier of the acquirer.
     */
    public MerchantRootIdItem withAcquirerId(String value) {
        this.acquirerId = value;
        return this;
    }

    /**
     * The root identifier of the merchant, which is the same for all sub-merchants under the same parent company.
     */
    public String getMerchantRootId() {
        return merchantRootId;
    }

    /**
     * The root identifier of the merchant, which is the same for all sub-merchants under the same parent company.
     */
    public void setMerchantRootId(String value) {
        this.merchantRootId = value;
    }

    /**
     * The root identifier of the merchant, which is the same for all sub-merchants under the same parent company.
     */
    public MerchantRootIdItem withMerchantRootId(String value) {
        this.merchantRootId = value;
        return this;
    }
}
