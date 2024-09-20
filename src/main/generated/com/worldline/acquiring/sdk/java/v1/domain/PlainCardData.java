/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class PlainCardData {

    private String cardNumber;

    private String cardSecurityCode;

    private String expiryDate;

    /**
     * Card number (PAN, network token or DPAN).
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Card number (PAN, network token or DPAN).
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * The security code indicated on the card<br>
     * Based on the card brand, it can be 3 or 4 digits long<br>
     * and have different names: CVV2, CVC2, CVN2, CID, CVC, CAV2, etc.
     */
    public String getCardSecurityCode() {
        return cardSecurityCode;
    }

    /**
     * The security code indicated on the card<br>
     * Based on the card brand, it can be 3 or 4 digits long<br>
     * and have different names: CVV2, CVC2, CVN2, CID, CVC, CAV2, etc.
     */
    public void setCardSecurityCode(String value) {
        this.cardSecurityCode = value;
    }

    /**
     * Card or token expiry date in format MMYYYY
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Card or token expiry date in format MMYYYY
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
    }
}
