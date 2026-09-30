/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class OriginalTransactionSummaryData {

    private String cardholderVerificationMethod;

    private String paymentCategory;

    private PaymentMethodDataBase paymentMethodData;

    private String pointOfSaleEntryMode;

    private TransactionReferencesBase transactionReferences;

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
    public OriginalTransactionSummaryData withCardholderVerificationMethod(String value) {
        this.cardholderVerificationMethod = value;
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
    public OriginalTransactionSummaryData withPaymentCategory(String value) {
        this.paymentCategory = value;
        return this;
    }

    /**
     * The payment method used in the original transaction that led to the dispute.
     */
    public PaymentMethodDataBase getPaymentMethodData() {
        return paymentMethodData;
    }

    /**
     * The payment method used in the original transaction that led to the dispute.
     */
    public void setPaymentMethodData(PaymentMethodDataBase value) {
        this.paymentMethodData = value;
    }

    /**
     * The payment method used in the original transaction that led to the dispute.
     */
    public OriginalTransactionSummaryData withPaymentMethodData(PaymentMethodDataBase value) {
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
    public OriginalTransactionSummaryData withPointOfSaleEntryMode(String value) {
        this.pointOfSaleEntryMode = value;
        return this;
    }

    /**
     * A subset of references related to the original transaction that led to the dispute. The full list is
     * returned by the <a href="#operation/getDispute">Retrieve Dispute</a> endpoint.
     */
    public TransactionReferencesBase getTransactionReferences() {
        return transactionReferences;
    }

    /**
     * A subset of references related to the original transaction that led to the dispute. The full list is
     * returned by the <a href="#operation/getDispute">Retrieve Dispute</a> endpoint.
     */
    public void setTransactionReferences(TransactionReferencesBase value) {
        this.transactionReferences = value;
    }

    /**
     * A subset of references related to the original transaction that led to the dispute. The full list is
     * returned by the <a href="#operation/getDispute">Retrieve Dispute</a> endpoint.
     */
    public OriginalTransactionSummaryData withTransactionReferences(TransactionReferencesBase value) {
        this.transactionReferences = value;
        return this;
    }
}
