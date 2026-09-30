/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

import java.util.List;

public class CapturePointOfSaleData {

    private List<EmvDataItem> emvData;

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
    public CapturePointOfSaleData withEmvData(List<EmvDataItem> value) {
        this.emvData = value;
        return this;
    }
}
