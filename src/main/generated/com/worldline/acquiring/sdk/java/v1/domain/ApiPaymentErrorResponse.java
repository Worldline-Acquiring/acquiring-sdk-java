/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class ApiPaymentErrorResponse {

    private String detail;

    private String instance;

    private String requestId;

    private Integer status;

    private String title;

    private String type;

    /**
     * Any relevant details about the error.<br>
     * May include suggestions for handling it. Can be an empty string if no extra details are
     * available.
     */
    public String getDetail() {
        return detail;
    }

    /**
     * Any relevant details about the error.<br>
     * May include suggestions for handling it. Can be an empty string if no extra details are
     * available.
     */
    public void setDetail(String value) {
        this.detail = value;
    }

    /**
     * Any relevant details about the error.<br>
     * May include suggestions for handling it. Can be an empty string if no extra details are
     * available.
     */
    public ApiPaymentErrorResponse withDetail(String value) {
        this.detail = value;
        return this;
    }

    /**
     * A URI reference that identifies the specific occurrence of the error.<br>
     * It may or may not yield further information if dereferenced.
     */
    public String getInstance() {
        return instance;
    }

    /**
     * A URI reference that identifies the specific occurrence of the error.<br>
     * It may or may not yield further information if dereferenced.
     */
    public void setInstance(String value) {
        this.instance = value;
    }

    /**
     * A URI reference that identifies the specific occurrence of the error.<br>
     * It may or may not yield further information if dereferenced.
     */
    public ApiPaymentErrorResponse withInstance(String value) {
        this.instance = value;
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
    public ApiPaymentErrorResponse withRequestId(String value) {
        this.requestId = value;
        return this;
    }

    /**
     * The HTTP status code of this error response.<br>
     * Included to aid those frameworks that have a hard time working with anything other than
     * the body of an HTTP response.
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * The HTTP status code of this error response.<br>
     * Included to aid those frameworks that have a hard time working with anything other than
     * the body of an HTTP response.
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

    /**
     * The HTTP status code of this error response.<br>
     * Included to aid those frameworks that have a hard time working with anything other than
     * the body of an HTTP response.
     */
    public ApiPaymentErrorResponse withStatus(Integer value) {
        this.status = value;
        return this;
    }

    /**
     * The human-readable version of the error.
     */
    public String getTitle() {
        return title;
    }

    /**
     * The human-readable version of the error.
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * The human-readable version of the error.
     */
    public ApiPaymentErrorResponse withTitle(String value) {
        this.title = value;
        return this;
    }

    /**
     * The type of the error.<br>
     * This is what you should match against when implementing error handling.<br>
     * It is in the form of a URL that identifies the error type.
     */
    public String getType() {
        return type;
    }

    /**
     * The type of the error.<br>
     * This is what you should match against when implementing error handling.<br>
     * It is in the form of a URL that identifies the error type.
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * The type of the error.<br>
     * This is what you should match against when implementing error handling.<br>
     * It is in the form of a URL that identifies the error type.
     */
    public ApiPaymentErrorResponse withType(String value) {
        this.type = value;
        return this;
    }
}
