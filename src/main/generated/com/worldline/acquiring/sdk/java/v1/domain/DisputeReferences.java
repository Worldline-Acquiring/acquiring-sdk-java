/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class DisputeReferences {

    private String acquirerDisputeReference;

    private String schemeDisputeReference;

    /**
     * The reference provided by the acquirer for the dispute.
     */
    public String getAcquirerDisputeReference() {
        return acquirerDisputeReference;
    }

    /**
     * The reference provided by the acquirer for the dispute.
     */
    public void setAcquirerDisputeReference(String value) {
        this.acquirerDisputeReference = value;
    }

    /**
     * The reference provided by the acquirer for the dispute.
     */
    public DisputeReferences withAcquirerDisputeReference(String value) {
        this.acquirerDisputeReference = value;
        return this;
    }

    /**
     * The reference provided by the card scheme for the dispute.
     */
    public String getSchemeDisputeReference() {
        return schemeDisputeReference;
    }

    /**
     * The reference provided by the card scheme for the dispute.
     */
    public void setSchemeDisputeReference(String value) {
        this.schemeDisputeReference = value;
    }

    /**
     * The reference provided by the card scheme for the dispute.
     */
    public DisputeReferences withSchemeDisputeReference(String value) {
        this.schemeDisputeReference = value;
        return this;
    }
}
