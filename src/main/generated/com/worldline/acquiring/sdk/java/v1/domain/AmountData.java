/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class AmountData {

    private Long amount;

    private String currencyCode;

    private Integer numberOfDecimals;

    /**
     * Amount of transaction formatted according to card scheme
     * specifications.
     * E.g. 100 for 1.00 EUR. Either this or amount must be present.
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * Amount of transaction formatted according to card scheme
     * specifications.
     * E.g. 100 for 1.00 EUR. Either this or amount must be present.
     */
    public void setAmount(Long value) {
        this.amount = value;
    }

    /**
     * Alpha-numeric ISO 4217 currency code for transaction, e.g. EUR
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Alpha-numeric ISO 4217 currency code for transaction, e.g. EUR
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Number of decimals in the amount
     */
    public Integer getNumberOfDecimals() {
        return numberOfDecimals;
    }

    /**
     * Number of decimals in the amount
     */
    public void setNumberOfDecimals(Integer value) {
        this.numberOfDecimals = value;
    }
}
