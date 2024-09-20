/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class CardPaymentDataForVerification {

    private String brand;

    private PlainCardData cardData;

    private String cardEntryMode;

    private CardOnFileData cardOnFileData;

    private String cardholderVerificationMethod;

    private ECommerceDataForAccountVerification ecommerceData;

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
    public ECommerceDataForAccountVerification getEcommerceData() {
        return ecommerceData;
    }

    /**
     * Request data for eCommerce and MOTO transactions
     */
    public void setEcommerceData(ECommerceDataForAccountVerification value) {
        this.ecommerceData = value;
    }

    public NetworkTokenData getNetworkTokenData() {
        return networkTokenData;
    }

    public void setNetworkTokenData(NetworkTokenData value) {
        this.networkTokenData = value;
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
