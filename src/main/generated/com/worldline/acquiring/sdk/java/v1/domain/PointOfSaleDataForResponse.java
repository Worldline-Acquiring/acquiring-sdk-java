/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

import java.util.List;

public class PointOfSaleDataForResponse {

    private List<EmvDataItem> emvData;

    private String panLast4Digits;

    private Integer pinRetryCounter;

    /**
     * EMV data of the card as tag/value pairs.
     */
    public List<EmvDataItem> getEmvData() {
        return emvData;
    }

    /**
     * EMV data of the card as tag/value pairs.
     */
    public void setEmvData(List<EmvDataItem> value) {
        this.emvData = value;
    }

    /**
     * EMV data of the card as tag/value pairs.
     */
    public PointOfSaleDataForResponse withEmvData(List<EmvDataItem> value) {
        this.emvData = value;
        return this;
    }

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
