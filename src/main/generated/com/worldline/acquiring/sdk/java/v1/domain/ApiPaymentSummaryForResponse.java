/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

import java.time.ZonedDateTime;

public class ApiPaymentSummaryForResponse {

    private String paymentId;

    private ApiReferencesForResponses references;

    private String retryAfter;

    private String status;

    private ZonedDateTime statusTimestamp;

    /**
     * the ID of the payment
     */
    public String getPaymentId() {
        return paymentId;
    }

    /**
     * the ID of the payment
     */
    public void setPaymentId(String value) {
        this.paymentId = value;
    }

    /**
     * A set of references returned in responses
     */
    public ApiReferencesForResponses getReferences() {
        return references;
    }

    /**
     * A set of references returned in responses
     */
    public void setReferences(ApiReferencesForResponses value) {
        this.references = value;
    }

    /**
     * The duration to wait after the initial submission before retrying the payment.<br>
     * Expressed using ISO 8601 duration format, ex: PT2H for 2 hours.<br>
     * This field is only present when the payment can be retried later.<br>
     * PT0 means that the payment can be retried immediately.
     */
    public String getRetryAfter() {
        return retryAfter;
    }

    /**
     * The duration to wait after the initial submission before retrying the payment.<br>
     * Expressed using ISO 8601 duration format, ex: PT2H for 2 hours.<br>
     * This field is only present when the payment can be retried later.<br>
     * PT0 means that the payment can be retried immediately.
     */
    public void setRetryAfter(String value) {
        this.retryAfter = value;
    }

    /**
     * The status of the payment, refund or credit transfer
     */
    public String getStatus() {
        return status;
    }

    /**
     * The status of the payment, refund or credit transfer
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Timestamp of the status in format yyyy-MM-ddTHH:mm:ssZ
     */
    public ZonedDateTime getStatusTimestamp() {
        return statusTimestamp;
    }

    /**
     * Timestamp of the status in format yyyy-MM-ddTHH:mm:ssZ
     */
    public void setStatusTimestamp(ZonedDateTime value) {
        this.statusTimestamp = value;
    }
}
