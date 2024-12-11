/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public class RateData {

    private BigDecimal exchangeRate;

    private BigDecimal invertedExchangeRate;

    private BigDecimal markUp;

    private String markUpBasis;

    private ZonedDateTime quotationDateTime;

    /**
     * The exchange rate
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    /**
     * The exchange rate
     */
    public void setExchangeRate(BigDecimal value) {
        this.exchangeRate = value;
    }

    /**
     * The exchange rate
     */
    public RateData withExchangeRate(BigDecimal value) {
        this.exchangeRate = value;
        return this;
    }

    /**
     * The inverted exchange rate
     */
    public BigDecimal getInvertedExchangeRate() {
        return invertedExchangeRate;
    }

    /**
     * The inverted exchange rate
     */
    public void setInvertedExchangeRate(BigDecimal value) {
        this.invertedExchangeRate = value;
    }

    /**
     * The inverted exchange rate
     */
    public RateData withInvertedExchangeRate(BigDecimal value) {
        this.invertedExchangeRate = value;
        return this;
    }

    /**
     * The mark up applied on the rate (in percentage).
     */
    public BigDecimal getMarkUp() {
        return markUp;
    }

    /**
     * The mark up applied on the rate (in percentage).
     */
    public void setMarkUp(BigDecimal value) {
        this.markUp = value;
    }

    /**
     * The mark up applied on the rate (in percentage).
     */
    public RateData withMarkUp(BigDecimal value) {
        this.markUp = value;
        return this;
    }

    /**
     * The source of the rate the markup is based upon.
     * If the cardholder and the merchant are based in Europe, the
     * mark up is calculated based on the
     * rates provided by the European Central Bank.
     */
    public String getMarkUpBasis() {
        return markUpBasis;
    }

    /**
     * The source of the rate the markup is based upon.
     * If the cardholder and the merchant are based in Europe, the
     * mark up is calculated based on the
     * rates provided by the European Central Bank.
     */
    public void setMarkUpBasis(String value) {
        this.markUpBasis = value;
    }

    /**
     * The source of the rate the markup is based upon.
     * If the cardholder and the merchant are based in Europe, the
     * mark up is calculated based on the
     * rates provided by the European Central Bank.
     */
    public RateData withMarkUpBasis(String value) {
        this.markUpBasis = value;
        return this;
    }

    /**
     * The date and time of the quotation
     */
    public ZonedDateTime getQuotationDateTime() {
        return quotationDateTime;
    }

    /**
     * The date and time of the quotation
     */
    public void setQuotationDateTime(ZonedDateTime value) {
        this.quotationDateTime = value;
    }

    /**
     * The date and time of the quotation
     */
    public RateData withQuotationDateTime(ZonedDateTime value) {
        this.quotationDateTime = value;
        return this;
    }
}
