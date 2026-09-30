/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class DisputeDocument {

    private String documentId;

    private String fileName;

    private String mimeType;

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
    public DisputeDocument withDocumentId(String value) {
        this.documentId = value;
        return this;
    }

    /**
     * The name of the file submitted as evidence for the dispute case, if applicable.
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * The name of the file submitted as evidence for the dispute case, if applicable.
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * The name of the file submitted as evidence for the dispute case, if applicable.
     */
    public DisputeDocument withFileName(String value) {
        this.fileName = value;
        return this;
    }

    /**
     * The MIME type of the file submitted as evidence for the dispute case, if applicable.
     * <p>
     * Possible values are:
     * <ul>
     *   <li>{@code application/pdf}</li>
     *   <li>{@code image/jpeg}</li>
     *   <li>{@code image/jpg}</li>
     *   <li>{@code image/png}</li>
     * </ul>
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * The MIME type of the file submitted as evidence for the dispute case, if applicable.
     * <p>
     * Possible values are:
     * <ul>
     *   <li>{@code application/pdf}</li>
     *   <li>{@code image/jpeg}</li>
     *   <li>{@code image/jpg}</li>
     *   <li>{@code image/png}</li>
     * </ul>
     */
    public void setMimeType(String value) {
        this.mimeType = value;
    }

    /**
     * The MIME type of the file submitted as evidence for the dispute case, if applicable.
     * <p>
     * Possible values are:
     * <ul>
     *   <li>{@code application/pdf}</li>
     *   <li>{@code image/jpeg}</li>
     *   <li>{@code image/jpg}</li>
     *   <li>{@code image/png}</li>
     * </ul>
     */
    public DisputeDocument withMimeType(String value) {
        this.mimeType = value;
        return this;
    }
}
