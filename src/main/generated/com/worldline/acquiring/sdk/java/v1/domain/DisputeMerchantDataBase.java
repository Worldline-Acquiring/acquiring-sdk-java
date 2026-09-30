/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class DisputeMerchantDataBase {

    private String acquirerId;

    private String merchantId;

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
    public DisputeMerchantDataBase withAcquirerId(String value) {
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
    public DisputeMerchantDataBase withMerchantId(String value) {
        this.merchantId = value;
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
    public DisputeMerchantDataBase withMerchantRootId(String value) {
        this.merchantRootId = value;
        return this;
    }
}
