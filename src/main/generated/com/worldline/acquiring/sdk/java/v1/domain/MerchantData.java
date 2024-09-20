/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class MerchantData {

    private String address;

    private String city;

    private String countryCode;

    private Integer merchantCategoryCode;

    private String name;

    private String postalCode;

    private String stateCode;

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
}
