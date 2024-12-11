/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class CardPaymentData {

    private Boolean allowPartialApproval;

    private String brand;

    private String brandSelector;

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
     * Indicate whether you allow partial approval or not
     */
    public Boolean getAllowPartialApproval() {
        return allowPartialApproval;
    }

    /**
     * Indicate whether you allow partial approval or not
     */
    public void setAllowPartialApproval(Boolean value) {
        this.allowPartialApproval = value;
    }

    /**
     * Indicate whether you allow partial approval or not
     */
    public CardPaymentData withAllowPartialApproval(Boolean value) {
        this.allowPartialApproval = value;
        return this;
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
     * The card brand
     */
    public CardPaymentData withBrand(String value) {
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
    public CardPaymentData withBrandSelector(String value) {
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
    public CardPaymentData withCaptureImmediately(Boolean value) {
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
    public CardPaymentData withCardData(PlainCardData value) {
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
    public CardPaymentData withCardEntryMode(String value) {
        this.cardEntryMode = value;
        return this;
    }

    public CardOnFileData getCardOnFileData() {
        return cardOnFileData;
    }

    public void setCardOnFileData(CardOnFileData value) {
        this.cardOnFileData = value;
    }

    public CardPaymentData withCardOnFileData(CardOnFileData value) {
        this.cardOnFileData = value;
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
    public CardPaymentData withCardholderVerificationMethod(String value) {
        this.cardholderVerificationMethod = value;
        return this;
    }

    /**
     * Request data for eCommerce transactions
     */
    public ECommerceData getEcommerceData() {
        return ecommerceData;
    }

    /**
     * Request data for eCommerce transactions
     */
    public void setEcommerceData(ECommerceData value) {
        this.ecommerceData = value;
    }

    /**
     * Request data for eCommerce transactions
     */
    public CardPaymentData withEcommerceData(ECommerceData value) {
        this.ecommerceData = value;
        return this;
    }

    public NetworkTokenData getNetworkTokenData() {
        return networkTokenData;
    }

    public void setNetworkTokenData(NetworkTokenData value) {
        this.networkTokenData = value;
    }

    public CardPaymentData withNetworkTokenData(NetworkTokenData value) {
        this.networkTokenData = value;
        return this;
    }

    /**
     * Request data for Point Of Sale (POS) or &quot;in person&quot; Transaction
     */
    public PointOfSaleData getPointOfSaleData() {
        return pointOfSaleData;
    }

    /**
     * Request data for Point Of Sale (POS) or &quot;in person&quot; Transaction
     */
    public void setPointOfSaleData(PointOfSaleData value) {
        this.pointOfSaleData = value;
    }

    /**
     * Request data for Point Of Sale (POS) or &quot;in person&quot; Transaction
     */
    public CardPaymentData withPointOfSaleData(PointOfSaleData value) {
        this.pointOfSaleData = value;
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
    public CardPaymentData withWalletId(String value) {
        this.walletId = value;
        return this;
    }
}
