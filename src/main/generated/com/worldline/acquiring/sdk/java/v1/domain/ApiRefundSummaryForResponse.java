/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

import java.time.ZonedDateTime;

public class ApiRefundSummaryForResponse {

    private ApiReferencesForResponses references;

    private String refundId;

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
     * A set of references returned in responses
     */
    public ApiRefundSummaryForResponse withReferences(ApiReferencesForResponses value) {
        this.references = value;
        return this;
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
     * the ID of the refund
     */
    public ApiRefundSummaryForResponse withRefundId(String value) {
        this.refundId = value;
        return this;
    }

    /**
     * The status of the payment, refund or credit transfer<br>
     * Possible values are:
     * <ul>
     *   <li>AUTHORIZED</li>
     *   <li>NOT_AUTHORIZED</li>
     *   <li>PENDING</li>
     *   <li>PENDING_CAPTURE</li>
     *   <li>CONFIRMED</li>
     *   <li>REVERSED</li>
     *   <li>CANCELLED</li>
     * </ul>
     */
    public String getStatus() {
        return status;
    }

    /**
     * The status of the payment, refund or credit transfer<br>
     * Possible values are:
     * <ul>
     *   <li>AUTHORIZED</li>
     *   <li>NOT_AUTHORIZED</li>
     *   <li>PENDING</li>
     *   <li>PENDING_CAPTURE</li>
     *   <li>CONFIRMED</li>
     *   <li>REVERSED</li>
     *   <li>CANCELLED</li>
     * </ul>
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * The status of the payment, refund or credit transfer<br>
     * Possible values are:
     * <ul>
     *   <li>AUTHORIZED</li>
     *   <li>NOT_AUTHORIZED</li>
     *   <li>PENDING</li>
     *   <li>PENDING_CAPTURE</li>
     *   <li>CONFIRMED</li>
     *   <li>REVERSED</li>
     *   <li>CANCELLED</li>
     * </ul>
     */
    public ApiRefundSummaryForResponse withStatus(String value) {
        this.status = value;
        return this;
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

    /**
     * Timestamp of the status in format yyyy-MM-ddTHH:mm:ssZ
     */
    public ApiRefundSummaryForResponse withStatusTimestamp(ZonedDateTime value) {
        this.statusTimestamp = value;
        return this;
    }
}
