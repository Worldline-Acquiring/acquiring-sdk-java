/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class UploadDocumentResponse {

    private String documentId;

    private String requestId;

    /**
     * The unique identifier of a document submitted as evidence for the dispute case, if applicable.
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * The unique identifier of a document submitted as evidence for the dispute case, if applicable.
     */
    public void setDocumentId(String value) {
        this.documentId = value;
    }

    /**
     * The unique identifier of a document submitted as evidence for the dispute case, if applicable.
     */
    public UploadDocumentResponse withDocumentId(String value) {
        this.documentId = value;
        return this;
    }

    /**
     * The unique Worldline identifier for the request that resulted in this response.
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * The unique Worldline identifier for the request that resulted in this response.
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * The unique Worldline identifier for the request that resulted in this response.
     */
    public UploadDocumentResponse withRequestId(String value) {
        this.requestId = value;
        return this;
    }
}
