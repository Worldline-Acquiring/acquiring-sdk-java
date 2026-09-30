/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

import java.util.List;

public class PointOfSaleData {

    private List<EmvDataItem> emvData;

    private Boolean isResponseToPinRequest;

    private Boolean isRetryWithTheSameOperationId;

    private OnlinePinData onlinePinData;

    private String track2Data;

    /**
     * EMV data of the card as tag/value pairs.<br>
     * It is needed when cardEntryMode is CHIP or CONTACTLESS.
     */
    public List<EmvDataItem> getEmvData() {
        return emvData;
    }

    /**
     * EMV data of the card as tag/value pairs.<br>
     * It is needed when cardEntryMode is CHIP or CONTACTLESS.
     */
    public void setEmvData(List<EmvDataItem> value) {
        this.emvData = value;
    }

    /**
     * EMV data of the card as tag/value pairs.<br>
     * It is needed when cardEntryMode is CHIP or CONTACTLESS.
     */
    public PointOfSaleData withEmvData(List<EmvDataItem> value) {
        this.emvData = value;
        return this;
    }

    /**
     * Indicate whether the request is made after a first one that resulted in a PIN request
     */
    public Boolean getIsResponseToPinRequest() {
        return isResponseToPinRequest;
    }

    /**
     * Indicate whether the request is made after a first one that resulted in a PIN request
     */
    public void setIsResponseToPinRequest(Boolean value) {
        this.isResponseToPinRequest = value;
    }

    /**
     * Indicate whether the request is made after a first one that resulted in a PIN request
     */
    public PointOfSaleData withIsResponseToPinRequest(Boolean value) {
        this.isResponseToPinRequest = value;
        return this;
    }

    /**
     * Indicate whether the request is a retry with the same operation ID after a first request that resulted in a PIN request
     */
    public Boolean getIsRetryWithTheSameOperationId() {
        return isRetryWithTheSameOperationId;
    }

    /**
     * Indicate whether the request is a retry with the same operation ID after a first request that resulted in a PIN request
     */
    public void setIsRetryWithTheSameOperationId(Boolean value) {
        this.isRetryWithTheSameOperationId = value;
    }

    /**
     * Indicate whether the request is a retry with the same operation ID after a first request that resulted in a PIN request
     */
    public PointOfSaleData withIsRetryWithTheSameOperationId(Boolean value) {
        this.isRetryWithTheSameOperationId = value;
        return this;
    }

    /**
     * In case of online PIN verification, send this object with the appropriate values.
     * <p>
     * Depending on the acquirer, different PIN encryption types are supported. Please check with your
     * Worldline contact which encryption type is supported for your account.
     */
    public OnlinePinData getOnlinePinData() {
        return onlinePinData;
    }

    /**
     * In case of online PIN verification, send this object with the appropriate values.
     * <p>
     * Depending on the acquirer, different PIN encryption types are supported. Please check with your
     * Worldline contact which encryption type is supported for your account.
     */
    public void setOnlinePinData(OnlinePinData value) {
        this.onlinePinData = value;
    }

    /**
     * In case of online PIN verification, send this object with the appropriate values.
     * <p>
     * Depending on the acquirer, different PIN encryption types are supported. Please check with your
     * Worldline contact which encryption type is supported for your account.
     */
    public PointOfSaleData withOnlinePinData(OnlinePinData value) {
        this.onlinePinData = value;
        return this;
    }

    /**
     * Track 2 data from the card<br>
     * It is needed when cardEntryMode is MAGNETIC_STRIPE.
     */
    public String getTrack2Data() {
        return track2Data;
    }

    /**
     * Track 2 data from the card<br>
     * It is needed when cardEntryMode is MAGNETIC_STRIPE.
     */
    public void setTrack2Data(String value) {
        this.track2Data = value;
    }

    /**
     * Track 2 data from the card<br>
     * It is needed when cardEntryMode is MAGNETIC_STRIPE.
     */
    public PointOfSaleData withTrack2Data(String value) {
        this.track2Data = value;
        return this;
    }
}
