/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class SignedAmountData {

    private Long amount;

    private String currencyCode;

    private String debitCreditIndicator;

    private Integer numberOfDecimals;

    /**
     * Amount of transaction formatted according to card scheme
     * specifications.
     * E.g. 100 for 1.00 EUR.
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * Amount of transaction formatted according to card scheme
     * specifications.
     * E.g. 100 for 1.00 EUR.
     */
    public void setAmount(Long value) {
        this.amount = value;
    }

    /**
     * Amount of transaction formatted according to card scheme
     * specifications.
     * E.g. 100 for 1.00 EUR.
     */
    public SignedAmountData withAmount(Long value) {
        this.amount = value;
        return this;
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
     * Alpha-numeric ISO 4217 currency code for transaction, e.g. EUR
     */
    public SignedAmountData withCurrencyCode(String value) {
        this.currencyCode = value;
        return this;
    }

    /**
     * Indicates whether the dispute is for a debit or credit transaction.<br>
     * Possible values are:
     * <ul>
     *   <li>DEBIT (The merchant receives funds)</li>
     *   <li>CREDIT (The merchant loses funds)</li>
     * </ul>
     */
    public String getDebitCreditIndicator() {
        return debitCreditIndicator;
    }

    /**
     * Indicates whether the dispute is for a debit or credit transaction.<br>
     * Possible values are:
     * <ul>
     *   <li>DEBIT (The merchant receives funds)</li>
     *   <li>CREDIT (The merchant loses funds)</li>
     * </ul>
     */
    public void setDebitCreditIndicator(String value) {
        this.debitCreditIndicator = value;
    }

    /**
     * Indicates whether the dispute is for a debit or credit transaction.<br>
     * Possible values are:
     * <ul>
     *   <li>DEBIT (The merchant receives funds)</li>
     *   <li>CREDIT (The merchant loses funds)</li>
     * </ul>
     */
    public SignedAmountData withDebitCreditIndicator(String value) {
        this.debitCreditIndicator = value;
        return this;
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

    /**
     * Number of decimals in the amount
     */
    public SignedAmountData withNumberOfDecimals(Integer value) {
        this.numberOfDecimals = value;
        return this;
    }
}
