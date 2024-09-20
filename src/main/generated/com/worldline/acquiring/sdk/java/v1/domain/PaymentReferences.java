/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class PaymentReferences {

    private String dynamicDescriptor;

    private String merchantReference;

    private String retrievalReferenceNumber;

    /**
     * Dynamic descriptor gives you the ability to control the descriptor
     * on the credit card statement of the customer.
     */
    public String getDynamicDescriptor() {
        return dynamicDescriptor;
    }

    /**
     * Dynamic descriptor gives you the ability to control the descriptor
     * on the credit card statement of the customer.
     */
    public void setDynamicDescriptor(String value) {
        this.dynamicDescriptor = value;
    }

    /**
     * Reference for the transaction to allow the merchant to reconcile their payments in our report files.<br>
     * It is advised to submit a unique value per transaction.<br>
     * The value provided here is returned in the baseTrxType/addlMercData element of the MRX file.
     */
    public String getMerchantReference() {
        return merchantReference;
    }

    /**
     * Reference for the transaction to allow the merchant to reconcile their payments in our report files.<br>
     * It is advised to submit a unique value per transaction.<br>
     * The value provided here is returned in the baseTrxType/addlMercData element of the MRX file.
     */
    public void setMerchantReference(String value) {
        this.merchantReference = value;
    }

    /**
     * Retrieval reference number for transaction, must be AN(12) if provided
     */
    public String getRetrievalReferenceNumber() {
        return retrievalReferenceNumber;
    }

    /**
     * Retrieval reference number for transaction, must be AN(12) if provided
     */
    public void setRetrievalReferenceNumber(String value) {
        this.retrievalReferenceNumber = value;
    }
}
