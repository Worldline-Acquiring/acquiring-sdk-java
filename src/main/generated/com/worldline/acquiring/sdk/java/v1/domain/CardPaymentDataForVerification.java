/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class CardPaymentDataForVerification {

    private String brand;

    private String brandSelector;

    private PlainCardData cardData;

    private String cardEntryMode;

    private CardOnFileData cardOnFileData;

    private String cardholderVerificationMethod;

    private ECommerceDataForAccountVerification ecommerceData;

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
     * The card brand
     */
    public CardPaymentDataForVerification withBrand(String value) {
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
    public CardPaymentDataForVerification withBrandSelector(String value) {
        this.brandSelector = value;
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
    public CardPaymentDataForVerification withCardData(PlainCardData value) {
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
    public CardPaymentDataForVerification withCardEntryMode(String value) {
        this.cardEntryMode = value;
        return this;
    }

    /**
     * Card data can be kept on file to support various use cases. It requires you to flag the transaction correctly.
     */
    public CardOnFileData getCardOnFileData() {
        return cardOnFileData;
    }

    /**
     * Card data can be kept on file to support various use cases. It requires you to flag the transaction correctly.
     */
    public void setCardOnFileData(CardOnFileData value) {
        this.cardOnFileData = value;
    }

    /**
     * Card data can be kept on file to support various use cases. It requires you to flag the transaction correctly.
     */
    public CardPaymentDataForVerification withCardOnFileData(CardOnFileData value) {
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
    public CardPaymentDataForVerification withCardholderVerificationMethod(String value) {
        this.cardholderVerificationMethod = value;
        return this;
    }

    /**
     * Request data for eCommerce transactions
     */
    public ECommerceDataForAccountVerification getEcommerceData() {
        return ecommerceData;
    }

    /**
     * Request data for eCommerce transactions
     */
    public void setEcommerceData(ECommerceDataForAccountVerification value) {
        this.ecommerceData = value;
    }

    /**
     * Request data for eCommerce transactions
     */
    public CardPaymentDataForVerification withEcommerceData(ECommerceDataForAccountVerification value) {
        this.ecommerceData = value;
        return this;
    }

    public NetworkTokenData getNetworkTokenData() {
        return networkTokenData;
    }

    public void setNetworkTokenData(NetworkTokenData value) {
        this.networkTokenData = value;
    }

    public CardPaymentDataForVerification withNetworkTokenData(NetworkTokenData value) {
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
    public CardPaymentDataForVerification withPointOfSaleData(PointOfSaleData value) {
        this.pointOfSaleData = value;
        return this;
    }

    /**
     * Type of wallet, values are assigned by card schemes, e.g.
     * <ul>
     *   <li>101 for MasterPass in eCommerce</li>
     *   <li>102 for MasterPass NFC</li>
     *   <li>103 for Apple Pay</li>
     *   <li>216 for Google Pay</li>
     *   <li>217 for Samsung Pay</li>
     *   <li>327 to indicate the usage of Network tokens in the transaction</li>
     * </ul>
     */
    public String getWalletId() {
        return walletId;
    }

    /**
     * Type of wallet, values are assigned by card schemes, e.g.
     * <ul>
     *   <li>101 for MasterPass in eCommerce</li>
     *   <li>102 for MasterPass NFC</li>
     *   <li>103 for Apple Pay</li>
     *   <li>216 for Google Pay</li>
     *   <li>217 for Samsung Pay</li>
     *   <li>327 to indicate the usage of Network tokens in the transaction</li>
     * </ul>
     */
    public void setWalletId(String value) {
        this.walletId = value;
    }

    /**
     * Type of wallet, values are assigned by card schemes, e.g.
     * <ul>
     *   <li>101 for MasterPass in eCommerce</li>
     *   <li>102 for MasterPass NFC</li>
     *   <li>103 for Apple Pay</li>
     *   <li>216 for Google Pay</li>
     *   <li>217 for Samsung Pay</li>
     *   <li>327 to indicate the usage of Network tokens in the transaction</li>
     * </ul>
     */
    public CardPaymentDataForVerification withWalletId(String value) {
        this.walletId = value;
        return this;
    }
}
