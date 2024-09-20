/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class CardDataForDcc {

    private String bin;

    private String brand;

    private String cardCountryCode;

    /**
     * Used to determine the currency of the card.
     * The first 12 digits of the card number.
     * The BIN number is on the first 6 or 8 digits.
     * Some issuers are using subranges for different countries on digits
     * 9-12.
     */
    public String getBin() {
        return bin;
    }

    /**
     * Used to determine the currency of the card.
     * The first 12 digits of the card number.
     * The BIN number is on the first 6 or 8 digits.
     * Some issuers are using subranges for different countries on digits
     * 9-12.
     */
    public void setBin(String value) {
        this.bin = value;
    }

    /**
     * The card brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * The card brand
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * The country code of the card
     */
    public String getCardCountryCode() {
        return cardCountryCode;
    }

    /**
     * The country code of the card
     */
    public void setCardCountryCode(String value) {
        this.cardCountryCode = value;
    }
}
