/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class ECommerceDataForResponse {

    private String addressVerificationResult;

    private String cardSecurityCodeResult;

    /**
     * Result of Address Verification Result<br>
     * Possible values:
     * <ul>
     *   <li>MATCH</li>
     *   <li>ADDRESS_MATCH</li>
     *   <li>POSTAL_CODE_MATCH</li>
     *   <li>MISMATCH</li>
     *   <li>NOT_VERIFIED</li>
     *   <li>OTHER</li>
     *   <li>ERROR</li>
     * </ul>
     */
    public String getAddressVerificationResult() {
        return addressVerificationResult;
    }

    /**
     * Result of Address Verification Result<br>
     * Possible values:
     * <ul>
     *   <li>MATCH</li>
     *   <li>ADDRESS_MATCH</li>
     *   <li>POSTAL_CODE_MATCH</li>
     *   <li>MISMATCH</li>
     *   <li>NOT_VERIFIED</li>
     *   <li>OTHER</li>
     *   <li>ERROR</li>
     * </ul>
     */
    public void setAddressVerificationResult(String value) {
        this.addressVerificationResult = value;
    }

    /**
     * Result of Address Verification Result<br>
     * Possible values:
     * <ul>
     *   <li>MATCH</li>
     *   <li>ADDRESS_MATCH</li>
     *   <li>POSTAL_CODE_MATCH</li>
     *   <li>MISMATCH</li>
     *   <li>NOT_VERIFIED</li>
     *   <li>OTHER</li>
     *   <li>ERROR</li>
     * </ul>
     */
    public ECommerceDataForResponse withAddressVerificationResult(String value) {
        this.addressVerificationResult = value;
        return this;
    }

    /**
     * Result of card security code check<br>
     * Possible values:
     * <ul>
     *   <li>MATCH</li>
     *   <li>MISMATCH</li>
     *   <li>NOT_VERIFIED</li>
     *   <li>OMITTED</li>
     *   <li>MISSING</li>
     * </ul>
     */
    public String getCardSecurityCodeResult() {
        return cardSecurityCodeResult;
    }

    /**
     * Result of card security code check<br>
     * Possible values:
     * <ul>
     *   <li>MATCH</li>
     *   <li>MISMATCH</li>
     *   <li>NOT_VERIFIED</li>
     *   <li>OMITTED</li>
     *   <li>MISSING</li>
     * </ul>
     */
    public void setCardSecurityCodeResult(String value) {
        this.cardSecurityCodeResult = value;
    }

    /**
     * Result of card security code check<br>
     * Possible values:
     * <ul>
     *   <li>MATCH</li>
     *   <li>MISMATCH</li>
     *   <li>NOT_VERIFIED</li>
     *   <li>OMITTED</li>
     *   <li>MISSING</li>
     * </ul>
     */
    public ECommerceDataForResponse withCardSecurityCodeResult(String value) {
        this.cardSecurityCodeResult = value;
        return this;
    }
}
