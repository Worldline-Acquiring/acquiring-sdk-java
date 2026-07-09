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

    private ServiceLocationData serviceLocationData;

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
    public CardPaymentData withCardOnFileData(CardOnFileData value) {
        this.cardOnFileData = value;
        return this;
    }

    /**
     * Method used by the terminal or the e-commerce website to verify that the customer is the legitimate cardholder (a.k.a. CVM)
     * <ul>
     *   <li>NONE: no cardholder verification performed</li>
     *   <li>CARD_SECURITY_CODE: the customer provided the card verification value (3 or 4 digits)</li>
     *   <li>THREE_DS: the customer completed an additional verification step with the card issuer</li>
     *   <li>SIGNATURE: the terminal prompted for a signature</li>
     *   <li>ONLINE_PIN: the terminal verifies the PIN online with the card issuer</li>
     *   <li>OFFLINE_PIN: the terminal verified the PIN with the EMV chip on the card</li>
     *   <li>CARDHOLDER_DEVICE: the cardholder device prompted the cardholder for authentication (a.k.a. CDCVM). Mainly used in transactions where digital wallets are involved</li>
     * </ul>
     */
    public String getCardholderVerificationMethod() {
        return cardholderVerificationMethod;
    }

    /**
     * Method used by the terminal or the e-commerce website to verify that the customer is the legitimate cardholder (a.k.a. CVM)
     * <ul>
     *   <li>NONE: no cardholder verification performed</li>
     *   <li>CARD_SECURITY_CODE: the customer provided the card verification value (3 or 4 digits)</li>
     *   <li>THREE_DS: the customer completed an additional verification step with the card issuer</li>
     *   <li>SIGNATURE: the terminal prompted for a signature</li>
     *   <li>ONLINE_PIN: the terminal verifies the PIN online with the card issuer</li>
     *   <li>OFFLINE_PIN: the terminal verified the PIN with the EMV chip on the card</li>
     *   <li>CARDHOLDER_DEVICE: the cardholder device prompted the cardholder for authentication (a.k.a. CDCVM). Mainly used in transactions where digital wallets are involved</li>
     * </ul>
     */
    public void setCardholderVerificationMethod(String value) {
        this.cardholderVerificationMethod = value;
    }

    /**
     * Method used by the terminal or the e-commerce website to verify that the customer is the legitimate cardholder (a.k.a. CVM)
     * <ul>
     *   <li>NONE: no cardholder verification performed</li>
     *   <li>CARD_SECURITY_CODE: the customer provided the card verification value (3 or 4 digits)</li>
     *   <li>THREE_DS: the customer completed an additional verification step with the card issuer</li>
     *   <li>SIGNATURE: the terminal prompted for a signature</li>
     *   <li>ONLINE_PIN: the terminal verifies the PIN online with the card issuer</li>
     *   <li>OFFLINE_PIN: the terminal verified the PIN with the EMV chip on the card</li>
     *   <li>CARDHOLDER_DEVICE: the cardholder device prompted the cardholder for authentication (a.k.a. CDCVM). Mainly used in transactions where digital wallets are involved</li>
     * </ul>
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
     * Request data object to describe the location where the cardholder received the service.
     * Note: You should either provide the address or the geo coordinates.
     */
    public ServiceLocationData getServiceLocationData() {
        return serviceLocationData;
    }

    /**
     * Request data object to describe the location where the cardholder received the service.
     * Note: You should either provide the address or the geo coordinates.
     */
    public void setServiceLocationData(ServiceLocationData value) {
        this.serviceLocationData = value;
    }

    /**
     * Request data object to describe the location where the cardholder received the service.
     * Note: You should either provide the address or the geo coordinates.
     */
    public CardPaymentData withServiceLocationData(ServiceLocationData value) {
        this.serviceLocationData = value;
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
    public CardPaymentData withWalletId(String value) {
        this.walletId = value;
        return this;
    }
}
