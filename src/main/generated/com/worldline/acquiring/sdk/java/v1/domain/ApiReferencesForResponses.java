/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class ApiReferencesForResponses {

    private String paymentAccountReference;

    private String retrievalReferenceNumber;

    private String schemeTransactionId;

    /**
     * (PAR) Unique identifier associated with a specific cardholder PAN
     */
    public String getPaymentAccountReference() {
        return paymentAccountReference;
    }

    /**
     * (PAR) Unique identifier associated with a specific cardholder PAN
     */
    public void setPaymentAccountReference(String value) {
        this.paymentAccountReference = value;
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

    /**
     * ID assigned by the scheme to identify a transaction through
     * its whole lifecycle.
     */
    public String getSchemeTransactionId() {
        return schemeTransactionId;
    }

    /**
     * ID assigned by the scheme to identify a transaction through
     * its whole lifecycle.
     */
    public void setSchemeTransactionId(String value) {
        this.schemeTransactionId = value;
    }
}
