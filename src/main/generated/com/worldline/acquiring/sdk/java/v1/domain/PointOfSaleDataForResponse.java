/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class PointOfSaleDataForResponse {

    private String panLast4Digits;

    private Integer pinRetryCounter;

    /**
     * Last 4 digits of the PAN
     */
    public String getPanLast4Digits() {
        return panLast4Digits;
    }

    /**
     * Last 4 digits of the PAN
     */
    public void setPanLast4Digits(String value) {
        this.panLast4Digits = value;
    }

    /**
     * Last 4 digits of the PAN
     */
    public PointOfSaleDataForResponse withPanLast4Digits(String value) {
        this.panLast4Digits = value;
        return this;
    }

    /**
     * Number of PIN retries
     */
    public Integer getPinRetryCounter() {
        return pinRetryCounter;
    }

    /**
     * Number of PIN retries
     */
    public void setPinRetryCounter(Integer value) {
        this.pinRetryCounter = value;
    }

    /**
     * Number of PIN retries
     */
    public PointOfSaleDataForResponse withPinRetryCounter(Integer value) {
        this.pinRetryCounter = value;
        return this;
    }
}
