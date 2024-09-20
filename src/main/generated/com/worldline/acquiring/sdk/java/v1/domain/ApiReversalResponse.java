/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class ApiReversalResponse extends ApiActionResponse {

    private AmountData totalAuthorizedAmount;

    /**
     * Amount for the operation.
     */
    public AmountData getTotalAuthorizedAmount() {
        return totalAuthorizedAmount;
    }

    /**
     * Amount for the operation.
     */
    public void setTotalAuthorizedAmount(AmountData value) {
        this.totalAuthorizedAmount = value;
    }
}
