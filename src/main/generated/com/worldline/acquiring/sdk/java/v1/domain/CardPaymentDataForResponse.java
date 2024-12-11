/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class CardPaymentDataForResponse {

    private String brand;

    private ECommerceDataForResponse ecommerceData;

    private PointOfSaleDataForResponse pointOfSaleData;

    /**
     * The card brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * The card brand
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * The card brand
     */
    public CardPaymentDataForResponse withBrand(String value) {
        this.brand = value;
        return this;
    }

    public ECommerceDataForResponse getEcommerceData() {
        return ecommerceData;
    }

    public void setEcommerceData(ECommerceDataForResponse value) {
        this.ecommerceData = value;
    }

    public CardPaymentDataForResponse withEcommerceData(ECommerceDataForResponse value) {
        this.ecommerceData = value;
        return this;
    }

    public PointOfSaleDataForResponse getPointOfSaleData() {
        return pointOfSaleData;
    }

    public void setPointOfSaleData(PointOfSaleDataForResponse value) {
        this.pointOfSaleData = value;
    }

    public CardPaymentDataForResponse withPointOfSaleData(PointOfSaleDataForResponse value) {
        this.pointOfSaleData = value;
        return this;
    }
}
