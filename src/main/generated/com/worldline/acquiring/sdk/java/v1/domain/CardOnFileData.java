/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class CardOnFileData {

    private InitialCardOnFileData initialCardOnFileData;

    private Boolean isInitialTransaction;

    private SubsequentCardOnFileData subsequentCardOnFileData;

    /**
     * When card data is stored you need to flag its purpose using {@code transactionType} and the intended {@code futureUse} of the card data.
     */
    public InitialCardOnFileData getInitialCardOnFileData() {
        return initialCardOnFileData;
    }

    /**
     * When card data is stored you need to flag its purpose using {@code transactionType} and the intended {@code futureUse} of the card data.
     */
    public void setInitialCardOnFileData(InitialCardOnFileData value) {
        this.initialCardOnFileData = value;
    }

    /**
     * When card data is stored you need to flag its purpose using {@code transactionType} and the intended {@code futureUse} of the card data.
     */
    public CardOnFileData withInitialCardOnFileData(InitialCardOnFileData value) {
        this.initialCardOnFileData = value;
        return this;
    }

    /**
     * Indicate whether this is the initial Card on File transaction or not
     */
    public Boolean getIsInitialTransaction() {
        return isInitialTransaction;
    }

    /**
     * Indicate whether this is the initial Card on File transaction or not
     */
    public void setIsInitialTransaction(Boolean value) {
        this.isInitialTransaction = value;
    }

    /**
     * Indicate whether this is the initial Card on File transaction or not
     */
    public CardOnFileData withIsInitialTransaction(Boolean value) {
        this.isInitialTransaction = value;
        return this;
    }

    /**
     * When you are using stored card you need to again specify the {@code transactionType}. All values are supported when the MERCHANT is
     * the initiator of the transaction. When the CARDHOLDER is the initiator of the transaction, only {@code UNSCHEDULED_CARD_ON_FILE} is
     * supported. For all cases when the MERCHANT is the initiator of the transaction, the {@code initialSchemeTransactionId} property
     * is mandatory.
     */
    public SubsequentCardOnFileData getSubsequentCardOnFileData() {
        return subsequentCardOnFileData;
    }

    /**
     * When you are using stored card you need to again specify the {@code transactionType}. All values are supported when the MERCHANT is
     * the initiator of the transaction. When the CARDHOLDER is the initiator of the transaction, only {@code UNSCHEDULED_CARD_ON_FILE} is
     * supported. For all cases when the MERCHANT is the initiator of the transaction, the {@code initialSchemeTransactionId} property
     * is mandatory.
     */
    public void setSubsequentCardOnFileData(SubsequentCardOnFileData value) {
        this.subsequentCardOnFileData = value;
    }

    /**
     * When you are using stored card you need to again specify the {@code transactionType}. All values are supported when the MERCHANT is
     * the initiator of the transaction. When the CARDHOLDER is the initiator of the transaction, only {@code UNSCHEDULED_CARD_ON_FILE} is
     * supported. For all cases when the MERCHANT is the initiator of the transaction, the {@code initialSchemeTransactionId} property
     * is mandatory.
     */
    public CardOnFileData withSubsequentCardOnFileData(SubsequentCardOnFileData value) {
        this.subsequentCardOnFileData = value;
        return this;
    }
}
