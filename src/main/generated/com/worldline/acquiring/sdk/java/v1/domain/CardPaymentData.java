/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class CardPaymentData {

    private Boolean allowPartialApproval;

    private String brand;

    private Boolean captureImmediately;

    private PlainCardData cardData;

    private String cardEntryMode;

    private CardOnFileData cardOnFileData;

    private String cardholderVerificationMethod;

    private ECommerceData ecommerceData;

    private NetworkTokenData networkTokenData;

    private PointOfSaleData pointOfSaleData;

    private String walletId;

    /**
     * Indicate wether you allow partial approval or not
     */
    public Boolean getAllowPartialApproval() {
        return allowPartialApproval;
    }

    /**
     * Indicate wether you allow partial approval or not
     */
    public void setAllowPartialApproval(Boolean value) {
        this.allowPartialApproval = value;
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
     * Card entry mode used in the transaction, defaults to ECOMMERCE
     */
    public String getCardEntryMode() {
        return cardEntryMode;
    }

    /**
     * Card entry mode used in the transaction, defaults to ECOMMERCE
     */
    public void setCardEntryMode(String value) {
        this.cardEntryMode = value;
    }

    public CardOnFileData getCardOnFileData() {
        return cardOnFileData;
    }

    public void setCardOnFileData(CardOnFileData value) {
        this.cardOnFileData = value;
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
     * Request data for eCommerce and MOTO transactions
     */
    public ECommerceData getEcommerceData() {
        return ecommerceData;
    }

    /**
     * Request data for eCommerce and MOTO transactions
     */
    public void setEcommerceData(ECommerceData value) {
        this.ecommerceData = value;
    }

    public NetworkTokenData getNetworkTokenData() {
        return networkTokenData;
    }

    public void setNetworkTokenData(NetworkTokenData value) {
        this.networkTokenData = value;
    }

    /**
     * Payment terminal request data
     */
    public PointOfSaleData getPointOfSaleData() {
        return pointOfSaleData;
    }

    /**
     * Payment terminal request data
     */
    public void setPointOfSaleData(PointOfSaleData value) {
        this.pointOfSaleData = value;
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
}
