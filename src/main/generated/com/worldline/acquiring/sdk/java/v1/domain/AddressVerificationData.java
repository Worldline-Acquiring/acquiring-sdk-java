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
     * Cardholder postal code, should be provided without spaces
     */
    public String getCardholderPostalCode() {
        return cardholderPostalCode;
    }

    /**
     * Cardholder postal code, should be provided without spaces
     */
    public void setCardholderPostalCode(String value) {
        this.cardholderPostalCode = value;
    }
}
