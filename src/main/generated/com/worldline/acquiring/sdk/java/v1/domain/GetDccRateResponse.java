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

    public DccProposal getProposal() {
        return proposal;
    }

    public void setProposal(DccProposal value) {
        this.proposal = value;
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
}
