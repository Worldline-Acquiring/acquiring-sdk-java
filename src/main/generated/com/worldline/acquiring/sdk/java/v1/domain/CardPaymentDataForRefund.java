/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class CardPaymentDataForRefund {

    private String brand;

    private String brandSelector;

    private Boolean captureImmediately;

    private PlainCardData cardData;

    private String cardEntryMode;

    private String cardholderVerificationMethod;

    private NetworkTokenData networkTokenData;

    private String walletId;

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
     * The card brand
     */
    public CardPaymentDataForRefund withBrand(String value) {
        this.brand = value;
        return this;
    }

    /**
     * The party responsible for the brand selection.
     */
    public String getBrandSelector() {
        return brandSelector;
    }

    /**
     * The party responsible for the brand selection.
     */
    public void setBrandSelector(String value) {
        this.brandSelector = value;
    }

    /**
     * The party responsible for the brand selection.
     */
    public CardPaymentDataForRefund withBrandSelector(String value) {
        this.brandSelector = value;
        return this;
    }

    /**
     * If true the transaction will be authorized and captured immediately
     */
    public Boolean getCaptureImmediately() {
        return captureImmediately;
    }

    /**
     * If true the transaction will be authorized and captured immediately
     */
    public void setCaptureImmediately(Boolean value) {
        this.captureImmediately = value;
    }

    /**
     * If true the transaction will be authorized and captured immediately
     */
    public CardPaymentDataForRefund withCaptureImmediately(Boolean value) {
        this.captureImmediately = value;
        return this;
    }

    /**
     * Card data in plain text
     */
    public PlainCardData getCardData() {
        return cardData;
    }

    /**
     * Card data in plain text
     */
    public void setCardData(PlainCardData value) {
        this.cardData = value;
    }

    /**
     * Card data in plain text
     */
    public CardPaymentDataForRefund withCardData(PlainCardData value) {
        this.cardData = value;
        return this;
    }

    /**
     * Card entry mode used in the transaction
     */
    public String getCardEntryMode() {
        return cardEntryMode;
    }

    /**
     * Card entry mode used in the transaction
     */
    public void setCardEntryMode(String value) {
        this.cardEntryMode = value;
    }

    /**
     * Card entry mode used in the transaction
     */
    public CardPaymentDataForRefund withCardEntryMode(String value) {
        this.cardEntryMode = value;
        return this;
    }

    /**
     * Cardholder verification method used in the transaction
     */
    public String getCardholderVerificationMethod() {
        return cardholderVerificationMethod;
    }

    /**
     * Cardholder verification method used in the transaction
     */
    public void setCardholderVerificationMethod(String value) {
        this.cardholderVerificationMethod = value;
    }

    /**
     * Cardholder verification method used in the transaction
     */
    public CardPaymentDataForRefund withCardholderVerificationMethod(String value) {
        this.cardholderVerificationMethod = value;
        return this;
    }

    public NetworkTokenData getNetworkTokenData() {
        return networkTokenData;
    }

    public void setNetworkTokenData(NetworkTokenData value) {
        this.networkTokenData = value;
    }

    public CardPaymentDataForRefund withNetworkTokenData(NetworkTokenData value) {
        this.networkTokenData = value;
        return this;
    }

    /**
     * Type of wallet, values are assigned by card schemes, e.g. 101
     * for MasterPass in eCommerce, 102 for MasterPass NFC, 103 for Apple Pay,
     * 216 for Google Pay and 217 for Samsung Pay
     */
    public String getWalletId() {
        return walletId;
    }

    /**
     * Type of wallet, values are assigned by card schemes, e.g. 101
     * for MasterPass in eCommerce, 102 for MasterPass NFC, 103 for Apple Pay,
     * 216 for Google Pay and 217 for Samsung Pay
     */
    public void setWalletId(String value) {
        this.walletId = value;
    }

    /**
     * Type of wallet, values are assigned by card schemes, e.g. 101
     * for MasterPass in eCommerce, 102 for MasterPass NFC, 103 for Apple Pay,
     * 216 for Google Pay and 217 for Samsung Pay
     */
    public CardPaymentDataForRefund withWalletId(String value) {
        this.walletId = value;
        return this;
    }
}
