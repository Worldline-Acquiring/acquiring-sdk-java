/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class ApiActionResponseForRefund {

    private String operationId;

    private ApiRefundSummaryForResponse refund;

    private String responder;

    private String responseCode;

    private String responseCodeCategory;

    private String responseCodeDescription;

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
     * A summary of the refund used for responses
     */
    public ApiRefundSummaryForResponse getRefund() {
        return refund;
    }

    /**
     * A summary of the refund used for responses
     */
    public void setRefund(ApiRefundSummaryForResponse value) {
        this.refund = value;
    }

    /**
     * The party that originated the response
     */
    public String getResponder() {
        return responder;
    }

    /**
     * The party that originated the response
     */
    public void setResponder(String value) {
        this.responder = value;
    }

    /**
     * Numeric response code, e.g. 0000, 0005
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * Numeric response code, e.g. 0000, 0005
     */
    public void setResponseCode(String value) {
        this.responseCode = value;
    }

    /**
     * Category of response code.
     */
    public String getResponseCodeCategory() {
        return responseCodeCategory;
    }

    /**
     * Category of response code.
     */
    public void setResponseCodeCategory(String value) {
        this.responseCodeCategory = value;
    }

    /**
     * Description of the response code
     */
    public String getResponseCodeDescription() {
        return responseCodeDescription;
    }

    /**
     * Description of the response code
     */
    public void setResponseCodeDescription(String value) {
        this.responseCodeDescription = value;
    }
}
