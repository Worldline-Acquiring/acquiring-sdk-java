/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class PlainCardData {

    private String cardNumber;

    private String cardSecurityCode;

    private Integer cardSequenceNumber;

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
     * Card number (PAN, network token or DPAN).
     */
    public PlainCardData withCardNumber(String value) {
        this.cardNumber = value;
        return this;
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
     * The security code indicated on the card<br>
     * Based on the card brand, it can be 3 or 4 digits long<br>
     * and have different names: CVV2, CVC2, CVN2, CID, CVC, CAV2, etc.
     */
    public PlainCardData withCardSecurityCode(String value) {
        this.cardSecurityCode = value;
        return this;
    }

    /**
     * Card sequence number extracted from track2
     * <ul>
     *   <li>usually known only for on-us cards, as the position of the sequence number is issuer specific</li>
     *   <li>for requests without track2 the card sequence number is usually stored in the EMV tag {@code 5F34}</li>
     * </ul>
     */
    public Integer getCardSequenceNumber() {
        return cardSequenceNumber;
    }

    /**
     * Card sequence number extracted from track2
     * <ul>
     *   <li>usually known only for on-us cards, as the position of the sequence number is issuer specific</li>
     *   <li>for requests without track2 the card sequence number is usually stored in the EMV tag {@code 5F34}</li>
     * </ul>
     */
    public void setCardSequenceNumber(Integer value) {
        this.cardSequenceNumber = value;
    }

    /**
     * Card sequence number extracted from track2
     * <ul>
     *   <li>usually known only for on-us cards, as the position of the sequence number is issuer specific</li>
     *   <li>for requests without track2 the card sequence number is usually stored in the EMV tag {@code 5F34}</li>
     * </ul>
     */
    public PlainCardData withCardSequenceNumber(Integer value) {
        this.cardSequenceNumber = value;
        return this;
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

    /**
     * Card or token expiry date in format MMYYYY
     */
    public PlainCardData withExpiryDate(String value) {
        this.expiryDate = value;
        return this;
    }
}
