/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class MerchantIdItem {

    private String acquirerId;

    private String merchantId;

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
    public MerchantIdItem withAcquirerId(String value) {
        this.acquirerId = value;
        return this;
    }

    /**
     * The unique identifier of the merchant.
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * The unique identifier of the merchant.
     */
    public void setMerchantId(String value) {
        this.merchantId = value;
    }

    /**
     * The unique identifier of the merchant.
     */
    public MerchantIdItem withMerchantId(String value) {
        this.merchantId = value;
        return this;
    }
}
