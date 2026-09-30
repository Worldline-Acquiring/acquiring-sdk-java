/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class OriginalTransactionData {

    private String cardholderVerificationMethod;

    private String localTransactionDateTime;

    private String paymentCategory;

    private PaymentMethodData paymentMethodData;

    private String pointOfSaleEntryMode;

    private String schemeProcessedDateTime;

    private AmountData settlementAmount;

    private AmountData transactionAmount;

    private TransactionReferencesDispute transactionReferences;

    /**
     * The cardholder verification method (CVM) used in the original transaction that led to the dispute.
     */
    public String getCardholderVerificationMethod() {
        return cardholderVerificationMethod;
    }

    /**
     * The cardholder verification method (CVM) used in the original transaction that led to the dispute.
     */
    public void setCardholderVerificationMethod(String value) {
        this.cardholderVerificationMethod = value;
    }

    /**
     * The cardholder verification method (CVM) used in the original transaction that led to the dispute.
     */
    public OriginalTransactionData withCardholderVerificationMethod(String value) {
        this.cardholderVerificationMethod = value;
        return this;
    }

    /**
     * The local date and time of the original transaction capture that resulted in the dispute, in ISO 8601 format,
     * but without the timezone designator.
     */
    public String getLocalTransactionDateTime() {
        return localTransactionDateTime;
    }

    /**
     * The local date and time of the original transaction capture that resulted in the dispute, in ISO 8601 format,
     * but without the timezone designator.
     */
    public void setLocalTransactionDateTime(String value) {
        this.localTransactionDateTime = value;
    }

    /**
     * The local date and time of the original transaction capture that resulted in the dispute, in ISO 8601 format,
     * but without the timezone designator.
     */
    public OriginalTransactionData withLocalTransactionDateTime(String value) {
        this.localTransactionDateTime = value;
        return this;
    }

    /**
     * The category of the payment used in the original transaction that led to the dispute.
     * <p>
     * Possible values are:
     * <ul>
     *   <li>{@code SALES} (Different kind of payments with debits the recipient)</li>
     *   <li>{@code CREDIT_VOUCHER} (Refund/Credit payment)</li>
     *   <li>{@code ORIGINAL_CREDIT} (Transaction that credits the recipient in a payment transaction (money send, original credit) or cardholder funds transfer)</li>
     *   <li>{@code ATM} (ATM Deposit)</li>
     *   <li>{@code ACCOUNT_FUNDING} (Transaction that debits the sender in a payment transaction (money send, original credit))</li>
     *   <li>{@code CASH_ADVANCE} (Cash advance payment)</li>
     * </ul>
     */
    public String getPaymentCategory() {
        return paymentCategory;
    }

    /**
     * The category of the payment used in the original transaction that led to the dispute.
     * <p>
     * Possible values are:
     * <ul>
     *   <li>{@code SALES} (Different kind of payments with debits the recipient)</li>
     *   <li>{@code CREDIT_VOUCHER} (Refund/Credit payment)</li>
     *   <li>{@code ORIGINAL_CREDIT} (Transaction that credits the recipient in a payment transaction (money send, original credit) or cardholder funds transfer)</li>
     *   <li>{@code ATM} (ATM Deposit)</li>
     *   <li>{@code ACCOUNT_FUNDING} (Transaction that debits the sender in a payment transaction (money send, original credit))</li>
     *   <li>{@code CASH_ADVANCE} (Cash advance payment)</li>
     * </ul>
     */
    public void setPaymentCategory(String value) {
        this.paymentCategory = value;
    }

    /**
     * The category of the payment used in the original transaction that led to the dispute.
     * <p>
     * Possible values are:
     * <ul>
     *   <li>{@code SALES} (Different kind of payments with debits the recipient)</li>
     *   <li>{@code CREDIT_VOUCHER} (Refund/Credit payment)</li>
     *   <li>{@code ORIGINAL_CREDIT} (Transaction that credits the recipient in a payment transaction (money send, original credit) or cardholder funds transfer)</li>
     *   <li>{@code ATM} (ATM Deposit)</li>
     *   <li>{@code ACCOUNT_FUNDING} (Transaction that debits the sender in a payment transaction (money send, original credit))</li>
     *   <li>{@code CASH_ADVANCE} (Cash advance payment)</li>
     * </ul>
     */
    public OriginalTransactionData withPaymentCategory(String value) {
        this.paymentCategory = value;
        return this;
    }

    /**
     * The payment method used in the original transaction that led to the dispute.
     */
    public PaymentMethodData getPaymentMethodData() {
        return paymentMethodData;
    }

    /**
     * The payment method used in the original transaction that led to the dispute.
     */
    public void setPaymentMethodData(PaymentMethodData value) {
        this.paymentMethodData = value;
    }

    /**
     * The payment method used in the original transaction that led to the dispute.
     */
    public OriginalTransactionData withPaymentMethodData(PaymentMethodData value) {
        this.paymentMethodData = value;
        return this;
    }

    /**
     * The point of sale (POS) entry mode used in the original transaction that led to the dispute.
     * <p>
     * Non-exclusive list of possible values:
     * <ul>
     *   <li>Unknown</li>
     *   <li>Track1</li>
     *   <li>Track2</li>
     *   <li>Track3</li>
     *   <li>Chip</li>
     *   <li>Manual</li>
     *   <li>Contactless-EMV</li>
     *   <li>Contactless-Magstripe</li>
     *   <li>Account ID</li>
     *   <li>EMV fallback</li>
     *   <li>Server or Wallet</li>
     *   <li>QRC Code TAGC</li>
     *   <li>CredentialOnFile</li>
     *   <li>URL-intent</li>
     * </ul>
     */
    public String getPointOfSaleEntryMode() {
        return pointOfSaleEntryMode;
    }

    /**
     * The point of sale (POS) entry mode used in the original transaction that led to the dispute.
     * <p>
     * Non-exclusive list of possible values:
     * <ul>
     *   <li>Unknown</li>
     *   <li>Track1</li>
     *   <li>Track2</li>
     *   <li>Track3</li>
     *   <li>Chip</li>
     *   <li>Manual</li>
     *   <li>Contactless-EMV</li>
     *   <li>Contactless-Magstripe</li>
     *   <li>Account ID</li>
     *   <li>EMV fallback</li>
     *   <li>Server or Wallet</li>
     *   <li>QRC Code TAGC</li>
     *   <li>CredentialOnFile</li>
     *   <li>URL-intent</li>
     * </ul>
     */
    public void setPointOfSaleEntryMode(String value) {
        this.pointOfSaleEntryMode = value;
    }

    /**
     * The point of sale (POS) entry mode used in the original transaction that led to the dispute.
     * <p>
     * Non-exclusive list of possible values:
     * <ul>
     *   <li>Unknown</li>
     *   <li>Track1</li>
     *   <li>Track2</li>
     *   <li>Track3</li>
     *   <li>Chip</li>
     *   <li>Manual</li>
     *   <li>Contactless-EMV</li>
     *   <li>Contactless-Magstripe</li>
     *   <li>Account ID</li>
     *   <li>EMV fallback</li>
     *   <li>Server or Wallet</li>
     *   <li>QRC Code TAGC</li>
     *   <li>CredentialOnFile</li>
     *   <li>URL-intent</li>
     * </ul>
     */
    public OriginalTransactionData withPointOfSaleEntryMode(String value) {
        this.pointOfSaleEntryMode = value;
        return this;
    }

    /**
     * The date and time when the dispute was processed by the card scheme, in ISO 8601 format,
     * but without the timezone designator.
     */
    public String getSchemeProcessedDateTime() {
        return schemeProcessedDateTime;
    }

    /**
     * The date and time when the dispute was processed by the card scheme, in ISO 8601 format,
     * but without the timezone designator.
     */
    public void setSchemeProcessedDateTime(String value) {
        this.schemeProcessedDateTime = value;
    }

    /**
     * The date and time when the dispute was processed by the card scheme, in ISO 8601 format,
     * but without the timezone designator.
     */
    public OriginalTransactionData withSchemeProcessedDateTime(String value) {
        this.schemeProcessedDateTime = value;
        return this;
    }

    /**
     * Amount for the operation.
     */
    public AmountData getSettlementAmount() {
        return settlementAmount;
    }

    /**
     * Amount for the operation.
     */
    public void setSettlementAmount(AmountData value) {
        this.settlementAmount = value;
    }

    /**
     * Amount for the operation.
     */
    public OriginalTransactionData withSettlementAmount(AmountData value) {
        this.settlementAmount = value;
        return this;
    }

    /**
     * Amount for the operation.
     */
    public AmountData getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Amount for the operation.
     */
    public void setTransactionAmount(AmountData value) {
        this.transactionAmount = value;
    }

    /**
     * Amount for the operation.
     */
    public OriginalTransactionData withTransactionAmount(AmountData value) {
        this.transactionAmount = value;
        return this;
    }

    /**
     * A full set of references related to the original transaction that led to the dispute.
     */
    public TransactionReferencesDispute getTransactionReferences() {
        return transactionReferences;
    }

    /**
     * A full set of references related to the original transaction that led to the dispute.
     */
    public void setTransactionReferences(TransactionReferencesDispute value) {
        this.transactionReferences = value;
    }

    /**
     * A full set of references related to the original transaction that led to the dispute.
     */
    public OriginalTransactionData withTransactionReferences(TransactionReferencesDispute value) {
        this.transactionReferences = value;
        return this;
    }
}
