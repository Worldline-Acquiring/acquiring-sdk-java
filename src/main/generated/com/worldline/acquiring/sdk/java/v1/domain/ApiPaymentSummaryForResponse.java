/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

import java.time.ZonedDateTime;

public class ApiPaymentSummaryForResponse {

    private String paymentId;

    private ApiReferencesForResponses references;

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
     * the ID of the payment
     */
    public ApiPaymentSummaryForResponse withPaymentId(String value) {
        this.paymentId = value;
        return this;
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
     * A set of references returned in responses
     */
    public ApiPaymentSummaryForResponse withReferences(ApiReferencesForResponses value) {
        this.references = value;
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
    public ApiPaymentSummaryForResponse withStatus(String value) {
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
    public ApiPaymentSummaryForResponse withStatusTimestamp(ZonedDateTime value) {
        this.statusTimestamp = value;
        return this;
    }
}
