/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

import java.math.BigDecimal;

public class DccData {

    private Long amount;

    private BigDecimal conversionRate;

    private String currencyCode;

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
    public DccData withAmount(Long value) {
        this.amount = value;
        return this;
    }

    /**
     * Currency conversion rate in decimal notation.
     */
    public BigDecimal getConversionRate() {
        return conversionRate;
    }

    /**
     * Currency conversion rate in decimal notation.
     */
    public void setConversionRate(BigDecimal value) {
        this.conversionRate = value;
    }

    /**
     * Currency conversion rate in decimal notation.
     */
    public DccData withConversionRate(BigDecimal value) {
        this.conversionRate = value;
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
    public DccData withCurrencyCode(String value) {
        this.currencyCode = value;
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
    public DccData withNumberOfDecimals(Integer value) {
        this.numberOfDecimals = value;
        return this;
    }
}
