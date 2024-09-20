/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class ApiIncrementResponse extends ApiActionResponse {

    private String authorizationCode;

    private AmountData totalAuthorizedAmount;

    /**
     * Authorization approval code
     */
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * Authorization approval code
     */
    public void setAuthorizationCode(String value) {
        this.authorizationCode = value;
    }

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
