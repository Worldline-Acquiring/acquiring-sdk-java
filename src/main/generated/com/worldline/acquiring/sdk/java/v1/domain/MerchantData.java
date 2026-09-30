/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class MerchantData {

    private String address;

    private String city;

    private String countryCode;

    private CustomerServiceData customerServiceData;

    private Integer merchantCategoryCode;

    private String name;

    private String paymentFacilitatorId;

    private String postalCode;

    private String stateCode;

    private String subMerchantId;

    private String taxId;

    /**
     * Street address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Street address
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Street address
     */
    public MerchantData withAddress(String value) {
        this.address = value;
        return this;
    }

    /**
     * Address city
     */
    public String getCity() {
        return city;
    }

    /**
     * Address city
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Address city
     */
    public MerchantData withCity(String value) {
        this.city = value;
        return this;
    }

    /**
     * Address country code, ISO 3166 international standard
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Address country code, ISO 3166 international standard
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Address country code, ISO 3166 international standard
     */
    public MerchantData withCountryCode(String value) {
        this.countryCode = value;
        return this;
    }

    /**
     * Customer Service Data
     */
    public CustomerServiceData getCustomerServiceData() {
        return customerServiceData;
    }

    /**
     * Customer Service Data
     */
    public void setCustomerServiceData(CustomerServiceData value) {
        this.customerServiceData = value;
    }

    /**
     * Customer Service Data
     */
    public MerchantData withCustomerServiceData(CustomerServiceData value) {
        this.customerServiceData = value;
        return this;
    }

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
    public MerchantData withMerchantCategoryCode(Integer value) {
        this.merchantCategoryCode = value;
        return this;
    }

    /**
     * Merchant name
     */
    public String getName() {
        return name;
    }

    /**
     * Merchant name
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Merchant name
     */
    public MerchantData withName(String value) {
        this.name = value;
        return this;
    }

    /**
     * Payment Facilitator identifier as assigned by Worldline
     */
    public String getPaymentFacilitatorId() {
        return paymentFacilitatorId;
    }

    /**
     * Payment Facilitator identifier as assigned by Worldline
     */
    public void setPaymentFacilitatorId(String value) {
        this.paymentFacilitatorId = value;
    }

    /**
     * Payment Facilitator identifier as assigned by Worldline
     */
    public MerchantData withPaymentFacilitatorId(String value) {
        this.paymentFacilitatorId = value;
        return this;
    }

    /**
     * Address postal code
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Address postal code
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Address postal code
     */
    public MerchantData withPostalCode(String value) {
        this.postalCode = value;
        return this;
    }

    /**
     * Address state code, only supplied if country is US or CA
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * Address state code, only supplied if country is US or CA
     */
    public void setStateCode(String value) {
        this.stateCode = value;
    }

    /**
     * Address state code, only supplied if country is US or CA
     */
    public MerchantData withStateCode(String value) {
        this.stateCode = value;
        return this;
    }

    /**
     * Sub-merchant identifier in the context of a Payment Facilitator.
     */
    public String getSubMerchantId() {
        return subMerchantId;
    }

    /**
     * Sub-merchant identifier in the context of a Payment Facilitator.
     */
    public void setSubMerchantId(String value) {
        this.subMerchantId = value;
    }

    /**
     * Sub-merchant identifier in the context of a Payment Facilitator.
     */
    public MerchantData withSubMerchantId(String value) {
        this.subMerchantId = value;
        return this;
    }

    /**
     * Applicable for Payment Facilitator submerchants located in France, Belgium or Luxembourg &amp;
     * having a valid national SIRET/Tax ID when using Bambora as the acquirer.
     */
    public String getTaxId() {
        return taxId;
    }

    /**
     * Applicable for Payment Facilitator submerchants located in France, Belgium or Luxembourg &amp;
     * having a valid national SIRET/Tax ID when using Bambora as the acquirer.
     */
    public void setTaxId(String value) {
        this.taxId = value;
    }

    /**
     * Applicable for Payment Facilitator submerchants located in France, Belgium or Luxembourg &amp;
     * having a valid national SIRET/Tax ID when using Bambora as the acquirer.
     */
    public MerchantData withTaxId(String value) {
        this.taxId = value;
        return this;
    }
}
