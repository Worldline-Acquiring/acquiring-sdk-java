/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class DccProposal {

    private AmountData originalAmount;

    private RateData rate;

    private String rateReferenceId;

    private AmountData resultingAmount;

    /**
     * Amount for the operation.
     */
    public AmountData getOriginalAmount() {
        return originalAmount;
    }

    /**
     * Amount for the operation.
     */
    public void setOriginalAmount(AmountData value) {
        this.originalAmount = value;
    }

    /**
     * Amount for the operation.
     */
    public DccProposal withOriginalAmount(AmountData value) {
        this.originalAmount = value;
        return this;
    }

    public RateData getRate() {
        return rate;
    }

    public void setRate(RateData value) {
        this.rate = value;
    }

    public DccProposal withRate(RateData value) {
        this.rate = value;
        return this;
    }

    /**
     * The rate reference ID
     */
    public String getRateReferenceId() {
        return rateReferenceId;
    }

    /**
     * The rate reference ID
     */
    public void setRateReferenceId(String value) {
        this.rateReferenceId = value;
    }

    /**
     * The rate reference ID
     */
    public DccProposal withRateReferenceId(String value) {
        this.rateReferenceId = value;
        return this;
    }

    /**
     * Amount for the operation.
     */
    public AmountData getResultingAmount() {
        return resultingAmount;
    }

    /**
     * Amount for the operation.
     */
    public void setResultingAmount(AmountData value) {
        this.resultingAmount = value;
    }

    /**
     * Amount for the operation.
     */
    public DccProposal withResultingAmount(AmountData value) {
        this.resultingAmount = value;
        return this;
    }
}
