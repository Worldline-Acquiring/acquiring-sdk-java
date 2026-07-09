/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class AddressVerificationData {

    private String cardholderAddress;

    private String cardholderPostalCode;

    /**
     * Cardholder street address
     */
    public String getCardholderAddress() {
        return cardholderAddress;
    }

    /**
     * Cardholder street address
     */
    public void setCardholderAddress(String value) {
        this.cardholderAddress = value;
    }

    /**
     * Cardholder street address
     */
    public AddressVerificationData withCardholderAddress(String value) {
        this.cardholderAddress = value;
        return this;
    }

    /**
     * Cardholder postal code
     */
    public String getCardholderPostalCode() {
        return cardholderPostalCode;
    }

    /**
     * Cardholder postal code
     */
    public void setCardholderPostalCode(String value) {
        this.cardholderPostalCode = value;
    }

    /**
     * Cardholder postal code
     */
    public AddressVerificationData withCardholderPostalCode(String value) {
        this.cardholderPostalCode = value;
        return this;
    }
}
