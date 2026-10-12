/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class TransactionReferencesBase {

    private String acquirerReferenceNumber;

    private String merchantReference;

    private String paymentId;

    /**
     * Acquirer reference number (ARN) for transaction
     */
    public String getAcquirerReferenceNumber() {
        return acquirerReferenceNumber;
    }

    /**
     * Acquirer reference number (ARN) for transaction
     */
    public void setAcquirerReferenceNumber(String value) {
        this.acquirerReferenceNumber = value;
    }

    /**
     * Acquirer reference number (ARN) for transaction
     */
    public TransactionReferencesBase withAcquirerReferenceNumber(String value) {
        this.acquirerReferenceNumber = value;
        return this;
    }

    /**
     * Custom text provided by the merchant that appears on their own settlement
     * reports and on the reimbursement notices from the acquirer.
     * <p>
     * It allows the merchant to reconcile their payments in our report files
     * and in their disputes.
     * <p>
     * It is advised to submit a unique value per transaction.<br>
     * The value is returned in the baseTrxType/addlMercData element of the MRX file.
     */
    public String getMerchantReference() {
        return merchantReference;
    }

    /**
     * Custom text provided by the merchant that appears on their own settlement
     * reports and on the reimbursement notices from the acquirer.
     * <p>
     * It allows the merchant to reconcile their payments in our report files
     * and in their disputes.
     * <p>
     * It is advised to submit a unique value per transaction.<br>
     * The value is returned in the baseTrxType/addlMercData element of the MRX file.
     */
    public void setMerchantReference(String value) {
        this.merchantReference = value;
    }

    /**
     * Custom text provided by the merchant that appears on their own settlement
     * reports and on the reimbursement notices from the acquirer.
     * <p>
     * It allows the merchant to reconcile their payments in our report files
     * and in their disputes.
     * <p>
     * It is advised to submit a unique value per transaction.<br>
     * The value is returned in the baseTrxType/addlMercData element of the MRX file.
     */
    public TransactionReferencesBase withMerchantReference(String value) {
        this.merchantReference = value;
        return this;
    }

    /**
     * The unique identifier for the original payment transaction that resulted in the dispute.
     * Depending on the interface used for the original transaction different values are returned. If the original
     * transaction was made through the Acquiring API, the {@code paymentId} from the original transaction is returned.
     */
    public String getPaymentId() {
        return paymentId;
    }

    /**
     * The unique identifier for the original payment transaction that resulted in the dispute.
     * Depending on the interface used for the original transaction different values are returned. If the original
     * transaction was made through the Acquiring API, the {@code paymentId} from the original transaction is returned.
     */
    public void setPaymentId(String value) {
        this.paymentId = value;
    }

    /**
     * The unique identifier for the original payment transaction that resulted in the dispute.
     * Depending on the interface used for the original transaction different values are returned. If the original
     * transaction was made through the Acquiring API, the {@code paymentId} from the original transaction is returned.
     */
    public TransactionReferencesBase withPaymentId(String value) {
        this.paymentId = value;
        return this;
    }
}
