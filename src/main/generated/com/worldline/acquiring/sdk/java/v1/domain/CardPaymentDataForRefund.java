/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class CardPaymentDataForRefund {

    private String brand;

    private Boolean captureImmediately;

    private PlainCardData cardData;

    private String cardEntryMode;

    private NetworkTokenData networkTokenData;

    private PointOfSaleData pointOfSaleData;

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
