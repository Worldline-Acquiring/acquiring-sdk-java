/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class GetDccRateResponse {

    private String disclaimerDisplay;

    private String disclaimerReceipt;

    private DccProposal proposal;

    private String result;

    /**
     * The disclaimer display
     */
    public String getDisclaimerDisplay() {
        return disclaimerDisplay;
    }

    /**
     * The disclaimer display
     */
    public void setDisclaimerDisplay(String value) {
        this.disclaimerDisplay = value;
    }

    /**
     * The disclaimer display
     */
    public GetDccRateResponse withDisclaimerDisplay(String value) {
        this.disclaimerDisplay = value;
        return this;
    }

    /**
     * The disclaimer receipt
     */
    public String getDisclaimerReceipt() {
        return disclaimerReceipt;
    }

    /**
     * The disclaimer receipt
     */
    public void setDisclaimerReceipt(String value) {
        this.disclaimerReceipt = value;
    }

    /**
     * The disclaimer receipt
     */
    public GetDccRateResponse withDisclaimerReceipt(String value) {
        this.disclaimerReceipt = value;
        return this;
    }

    public DccProposal getProposal() {
        return proposal;
    }

    public void setProposal(DccProposal value) {
        this.proposal = value;
    }

    public GetDccRateResponse withProposal(DccProposal value) {
        this.proposal = value;
        return this;
    }

    /**
     * The result of the operation
     */
    public String getResult() {
        return result;
    }

    /**
     * The result of the operation
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * The result of the operation
     */
    public GetDccRateResponse withResult(String value) {
        this.result = value;
        return this;
    }
}
