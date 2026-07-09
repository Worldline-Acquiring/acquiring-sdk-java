/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class CaptureAmountBreakdownData {

    private AmountData tipAmount;

    /**
     * Optional amount of tip.
     * <p>
     * The amount specified is included in the total capture {@code amount}, the information is provided
     * for data enrichment and reconciliation purposes.
     */
    public AmountData getTipAmount() {
        return tipAmount;
    }

    /**
     * Optional amount of tip.
     * <p>
     * The amount specified is included in the total capture {@code amount}, the information is provided
     * for data enrichment and reconciliation purposes.
     */
    public void setTipAmount(AmountData value) {
        this.tipAmount = value;
    }

    /**
     * Optional amount of tip.
     * <p>
     * The amount specified is included in the total capture {@code amount}, the information is provided
     * for data enrichment and reconciliation purposes.
     */
    public CaptureAmountBreakdownData withTipAmount(AmountData value) {
        this.tipAmount = value;
        return this;
    }
}
