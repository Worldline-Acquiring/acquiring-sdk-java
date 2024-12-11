/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

import java.time.ZonedDateTime;
import java.util.List;

public class ApiPaymentResource {

    private CardPaymentDataForResource cardPaymentData;

    private String initialAuthorizationCode;

    private List<SubOperation> operations;

    private String paymentId;

    private ApiReferencesForResponses references;

    private String retryAfter;

    private String status;

    private ZonedDateTime statusTimestamp;

    private AmountData totalAuthorizedAmount;

    public CardPaymentDataForResource getCardPaymentData() {
        return cardPaymentData;
    }

    public void setCardPaymentData(CardPaymentDataForResource value) {
        this.cardPaymentData = value;
    }

    public ApiPaymentResource withCardPaymentData(CardPaymentDataForResource value) {
        this.cardPaymentData = value;
        return this;
    }

    /**
     * Authorization approval code
     */
    public String getInitialAuthorizationCode() {
        return initialAuthorizationCode;
    }

    /**
     * Authorization approval code
     */
    public void setInitialAuthorizationCode(String value) {
        this.initialAuthorizationCode = value;
    }

    /**
     * Authorization approval code
     */
    public ApiPaymentResource withInitialAuthorizationCode(String value) {
        this.initialAuthorizationCode = value;
        return this;
    }

    public List<SubOperation> getOperations() {
        return operations;
    }

    public void setOperations(List<SubOperation> value) {
        this.operations = value;
    }

    public ApiPaymentResource withOperations(List<SubOperation> value) {
        this.operations = value;
        return this;
    }

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
    public ApiPaymentResource withPaymentId(String value) {
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
    public ApiPaymentResource withReferences(ApiReferencesForResponses value) {
        this.references = value;
        return this;
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
     * The duration to wait after the initial submission before retrying the payment.<br>
     * Expressed using ISO 8601 duration format, ex: PT2H for 2 hours.<br>
     * This field is only present when the payment can be retried later.<br>
     * PT0 means that the payment can be retried immediately.
     */
    public ApiPaymentResource withRetryAfter(String value) {
        this.retryAfter = value;
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
    public ApiPaymentResource withStatus(String value) {
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
    public ApiPaymentResource withStatusTimestamp(ZonedDateTime value) {
        this.statusTimestamp = value;
        return this;
    }

    /**
     * Amount for the operation.
     */
    public AmountData getTotalAuthorizedAmount() {
        return totalAuthorizedAmount;
    }

    /**
     * Amount for the operation.
     */
    public void setTotalAuthorizedAmount(AmountData value) {
        this.totalAuthorizedAmount = value;
    }

    /**
     * Amount for the operation.
     */
    public ApiPaymentResource withTotalAuthorizedAmount(AmountData value) {
        this.totalAuthorizedAmount = value;
        return this;
    }
}
