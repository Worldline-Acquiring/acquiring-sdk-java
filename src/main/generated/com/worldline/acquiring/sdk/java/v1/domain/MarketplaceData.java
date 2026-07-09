/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class MarketplaceData {

    private String retailerCountryCode;

    private String retailerName;

    /**
     * Address country code, ISO 3166 international standard
     */
    public String getRetailerCountryCode() {
        return retailerCountryCode;
    }

    /**
     * Address country code, ISO 3166 international standard
     */
    public void setRetailerCountryCode(String value) {
        this.retailerCountryCode = value;
    }

    /**
     * Address country code, ISO 3166 international standard
     */
    public MarketplaceData withRetailerCountryCode(String value) {
        this.retailerCountryCode = value;
        return this;
    }

    /**
     * Name of the retailer in the marketplace
     */
    public String getRetailerName() {
        return retailerName;
    }

    /**
     * Name of the retailer in the marketplace
     */
    public void setRetailerName(String value) {
        this.retailerName = value;
    }

    /**
     * Name of the retailer in the marketplace
     */
    public MarketplaceData withRetailerName(String value) {
        this.retailerName = value;
        return this;
    }
}
