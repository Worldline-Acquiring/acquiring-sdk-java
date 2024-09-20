/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

import java.time.ZonedDateTime;

public class ApiRefundSummaryForResponse {

    private ApiReferencesForResponses references;

    private String refundId;

    private String retryAfter;

    private String status;

    private ZonedDateTime statusTimestamp;

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
     * the ID of the refund
     */
    public String getRefundId() {
        return refundId;
    }

    /**
     * the ID of the refund
     */
    public void setRefundId(String value) {
        this.refundId = value;
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
