/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.acquirer.merchant.payments;

import java.util.ArrayList;
import java.util.List;

import com.worldline.acquiring.sdk.java.communication.ParamRequest;
import com.worldline.acquiring.sdk.java.communication.RequestParam;

/**
 * Query parameters for
 * <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Payments/operation/getPaymentStatus">Retrieve payment</a>
 */
public class GetPaymentStatusParams implements ParamRequest {

    private Boolean returnOperations;

    /**
     * If true, the response will contain the operations of the payment.
     * False by default.
     */
    public Boolean getReturnOperations() {
        return returnOperations;
    }

    /**
     * If true, the response will contain the operations of the payment.
     * False by default.
     */
    public void setReturnOperations(Boolean value) {
        this.returnOperations = value;
    }

    @Override
    public List<RequestParam> toRequestParameters() {
        List<RequestParam> result = new ArrayList<>();
        if (returnOperations != null) {
            result.add(new RequestParam("returnOperations", returnOperations.toString()));
        }
        return result;
    }
}
