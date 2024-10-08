/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

import java.time.ZonedDateTime;

public class ApiPaymentRefundRequest {

    private AmountData amount;

    private Boolean captureImmediately;

    private DccData dynamicCurrencyConversion;

    private String operationId;

    private PaymentReferences references;

    private ZonedDateTime transactionTimestamp;

    /**
     * Amount to refund. If not provided, the full amount will be refunded.
     */
    public AmountData getAmount() {
        return amount;
    }

    /**
     * Amount to refund. If not provided, the full amount will be refunded.
     */
    public void setAmount(AmountData value) {
        this.amount = value;
    }

    /**
     * If true the transaction will be authorized and captured immediately
     */
    public Boolean getCaptureImmediately() {
        return captureImmediately;
    }

    /**
     * If true the transaction will be authorized and captured immediately
     */
    public void setCaptureImmediately(Boolean value) {
        this.captureImmediately = value;
    }

    /**
     * Dynamic Currency Conversion (DCC) rate data from DCC lookup response.<br>
     * Mandatory for DCC transactions.
     */
    public DccData getDynamicCurrencyConversion() {
        return dynamicCurrencyConversion;
    }

    /**
     * Dynamic Currency Conversion (DCC) rate data from DCC lookup response.<br>
     * Mandatory for DCC transactions.
     */
    public void setDynamicCurrencyConversion(DccData value) {
        this.dynamicCurrencyConversion = value;
    }

    /**
     * A globally unique identifier of the operation, generated by you.<br>
     * We advise you to submit a UUID or an identifier composed of an arbitrary string
     * and a UUID/URL-safe Base64 UUID (RFC 4648 §5).<br>
     * It's used to detect duplicate requests or to reference an operation in
     * technical reversals.
     */
    public String getOperationId() {
        return operationId;
    }

    /**
     * A globally unique identifier of the operation, generated by you.<br>
     * We advise you to submit a UUID or an identifier composed of an arbitrary string
     * and a UUID/URL-safe Base64 UUID (RFC 4648 §5).<br>
     * It's used to detect duplicate requests or to reference an operation in
     * technical reversals.
     */
    public void setOperationId(String value) {
        this.operationId = value;
    }

    /**
     * Payment References
     */
    public PaymentReferences getReferences() {
        return references;
    }

    /**
     * Payment References
     */
    public void setReferences(PaymentReferences value) {
        this.references = value;
    }

    /**
     * Timestamp of transaction in ISO 8601 format (YYYY-MM-DDThh:mm:ss+TZD)<br>
     * It can be expressed in merchant time zone (ex: 2023-10-10T08:00+02:00)
     * or in UTC (ex: 2023-10-10T08:00Z)
     */
    public ZonedDateTime getTransactionTimestamp() {
        return transactionTimestamp;
    }

    /**
     * Timestamp of transaction in ISO 8601 format (YYYY-MM-DDThh:mm:ss+TZD)<br>
     * It can be expressed in merchant time zone (ex: 2023-10-10T08:00+02:00)
     * or in UTC (ex: 2023-10-10T08:00Z)
     */
    public void setTransactionTimestamp(ZonedDateTime value) {
        this.transactionTimestamp = value;
    }
}
