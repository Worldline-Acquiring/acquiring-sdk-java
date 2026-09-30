/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class DisputeMerchantData extends DisputeMerchantDataBase {

    private Integer merchantCategoryCode;

    private String merchantCity;

    private String merchantCountryCode;

    private String merchantName;

    /**
     * Merchant category code (MCC)
     */
    public Integer getMerchantCategoryCode() {
        return merchantCategoryCode;
    }

    /**
     * Merchant category code (MCC)
     */
    public void setMerchantCategoryCode(Integer value) {
        this.merchantCategoryCode = value;
    }

    /**
     * Merchant category code (MCC)
     */
    public DisputeMerchantData withMerchantCategoryCode(Integer value) {
        this.merchantCategoryCode = value;
        return this;
    }

    /**
     * The city where the merchant is located.
     */
    public String getMerchantCity() {
        return merchantCity;
    }

    /**
     * The city where the merchant is located.
     */
    public void setMerchantCity(String value) {
        this.merchantCity = value;
    }

    /**
     * The city where the merchant is located.
     */
    public DisputeMerchantData withMerchantCity(String value) {
        this.merchantCity = value;
        return this;
    }

    /**
     * The country code of the merchant's location in ISO 3166-1 alpha-2 format.
     */
    public String getMerchantCountryCode() {
        return merchantCountryCode;
    }

    /**
     * The country code of the merchant's location in ISO 3166-1 alpha-2 format.
     */
    public void setMerchantCountryCode(String value) {
        this.merchantCountryCode = value;
    }

    /**
     * The country code of the merchant's location in ISO 3166-1 alpha-2 format.
     */
    public DisputeMerchantData withMerchantCountryCode(String value) {
        this.merchantCountryCode = value;
        return this;
    }

    /**
     * Merchant name
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * Merchant name
     */
    public void setMerchantName(String value) {
        this.merchantName = value;
    }

    /**
     * Merchant name
     */
    public DisputeMerchantData withMerchantName(String value) {
        this.merchantName = value;
        return this;
    }

    /**
     * The unique identifier of the acquirer.
     */
    @Override
    public DisputeMerchantData withAcquirerId(String value) {
        super.withAcquirerId(value);
        return this;
    }

    /**
     * The unique identifier of the merchant.
     */
    @Override
    public DisputeMerchantData withMerchantId(String value) {
        super.withMerchantId(value);
        return this;
    }

    /**
     * The root identifier of the merchant, which is the same for all sub-merchants under the same parent company.
     */
    @Override
    public DisputeMerchantData withMerchantRootId(String value) {
        super.withMerchantRootId(value);
        return this;
    }
}
