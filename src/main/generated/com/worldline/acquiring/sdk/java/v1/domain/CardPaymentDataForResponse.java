/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class CardPaymentDataForResponse {

    private String brand;

    private ECommerceDataForResponse ecommerceData;

    private PointOfSaleData pointOfSaleData;

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

    public ECommerceDataForResponse getEcommerceData() {
        return ecommerceData;
    }

    public void setEcommerceData(ECommerceDataForResponse value) {
        this.ecommerceData = value;
    }

    /**
     * Payment terminal request data
     */
    public PointOfSaleData getPointOfSaleData() {
        return pointOfSaleData;
    }

    /**
     * Payment terminal request data
     */
    public void setPointOfSaleData(PointOfSaleData value) {
        this.pointOfSaleData = value;
    }
}
