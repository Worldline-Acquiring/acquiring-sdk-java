/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class AdditionalResponseData {

    private String merchantAdviceCode;

    private String merchantAdviceCodeDescription;

    /**
     * Merchant advice code as returned by the scheme, usually returned upon rejection.
     * Known possible values at the time of writing this documentation are:
     * <ul>
     *   <li>{@code 01} - New Account Information Available</li>
     *   <li>{@code 02} - Try Again Later</li>
     *   <li>{@code 03} - Do Not Try Again</li>
     *   <li>{@code 04} - Token requirements not fulfilled for this token type</li>
     *   <li>{@code 05} - Negotiated value not provided</li>
     *   <li>{@code 21} - Payment Cancellation</li>
     *   <li>{@code 22} - Merchant does not qualify for product code</li>
     *   <li>{@code 24} - Retry after 1 hour</li>
     *   <li>{@code 25} - Retry after 24 hours</li>
     *   <li>{@code 26} - Retry after 2 days</li>
     *   <li>{@code 27} - Retry after 4 days</li>
     *   <li>{@code 28} - Retry after 6 days</li>
     *   <li>{@code 29} - Retry after 8 days</li>
     *   <li>{@code 30} - Retry after 10 days</li>
     *   <li>{@code 40} - Consumer non-reloadable prepaid card</li>
     *   <li>{@code 41} - Consumer single-use virtual card number</li>
     *   <li>{@code 42} - Sanctions Scoring Service: Score Exceeds Applicable Threshold Value</li>
     *   <li>{@code 43} - Consumer multi-use virtual card number
     * Note: In case new values are added and returned by the schemes, they will be returned as is. We will
     * maintain the above list on a best-effort basis.</li>
     * </ul>
     */
    public String getMerchantAdviceCode() {
        return merchantAdviceCode;
    }

    /**
     * Merchant advice code as returned by the scheme, usually returned upon rejection.
     * Known possible values at the time of writing this documentation are:
     * <ul>
     *   <li>{@code 01} - New Account Information Available</li>
     *   <li>{@code 02} - Try Again Later</li>
     *   <li>{@code 03} - Do Not Try Again</li>
     *   <li>{@code 04} - Token requirements not fulfilled for this token type</li>
     *   <li>{@code 05} - Negotiated value not provided</li>
     *   <li>{@code 21} - Payment Cancellation</li>
     *   <li>{@code 22} - Merchant does not qualify for product code</li>
     *   <li>{@code 24} - Retry after 1 hour</li>
     *   <li>{@code 25} - Retry after 24 hours</li>
     *   <li>{@code 26} - Retry after 2 days</li>
     *   <li>{@code 27} - Retry after 4 days</li>
     *   <li>{@code 28} - Retry after 6 days</li>
     *   <li>{@code 29} - Retry after 8 days</li>
     *   <li>{@code 30} - Retry after 10 days</li>
     *   <li>{@code 40} - Consumer non-reloadable prepaid card</li>
     *   <li>{@code 41} - Consumer single-use virtual card number</li>
     *   <li>{@code 42} - Sanctions Scoring Service: Score Exceeds Applicable Threshold Value</li>
     *   <li>{@code 43} - Consumer multi-use virtual card number
     * Note: In case new values are added and returned by the schemes, they will be returned as is. We will
     * maintain the above list on a best-effort basis.</li>
     * </ul>
     */
    public void setMerchantAdviceCode(String value) {
        this.merchantAdviceCode = value;
    }

    /**
     * Merchant advice code as returned by the scheme, usually returned upon rejection.
     * Known possible values at the time of writing this documentation are:
     * <ul>
     *   <li>{@code 01} - New Account Information Available</li>
     *   <li>{@code 02} - Try Again Later</li>
     *   <li>{@code 03} - Do Not Try Again</li>
     *   <li>{@code 04} - Token requirements not fulfilled for this token type</li>
     *   <li>{@code 05} - Negotiated value not provided</li>
     *   <li>{@code 21} - Payment Cancellation</li>
     *   <li>{@code 22} - Merchant does not qualify for product code</li>
     *   <li>{@code 24} - Retry after 1 hour</li>
     *   <li>{@code 25} - Retry after 24 hours</li>
     *   <li>{@code 26} - Retry after 2 days</li>
     *   <li>{@code 27} - Retry after 4 days</li>
     *   <li>{@code 28} - Retry after 6 days</li>
     *   <li>{@code 29} - Retry after 8 days</li>
     *   <li>{@code 30} - Retry after 10 days</li>
     *   <li>{@code 40} - Consumer non-reloadable prepaid card</li>
     *   <li>{@code 41} - Consumer single-use virtual card number</li>
     *   <li>{@code 42} - Sanctions Scoring Service: Score Exceeds Applicable Threshold Value</li>
     *   <li>{@code 43} - Consumer multi-use virtual card number
     * Note: In case new values are added and returned by the schemes, they will be returned as is. We will
     * maintain the above list on a best-effort basis.</li>
     * </ul>
     */
    public AdditionalResponseData withMerchantAdviceCode(String value) {
        this.merchantAdviceCode = value;
        return this;
    }

    /**
     * Human readable description of the merchant advice code.
     * Note: In case the merchant advice code is unknown (unmapped), the system returns {@code Unknown}.
     */
    public String getMerchantAdviceCodeDescription() {
        return merchantAdviceCodeDescription;
    }

    /**
     * Human readable description of the merchant advice code.
     * Note: In case the merchant advice code is unknown (unmapped), the system returns {@code Unknown}.
     */
    public void setMerchantAdviceCodeDescription(String value) {
        this.merchantAdviceCodeDescription = value;
    }

    /**
     * Human readable description of the merchant advice code.
     * Note: In case the merchant advice code is unknown (unmapped), the system returns {@code Unknown}.
     */
    public AdditionalResponseData withMerchantAdviceCodeDescription(String value) {
        this.merchantAdviceCodeDescription = value;
        return this;
    }
}
