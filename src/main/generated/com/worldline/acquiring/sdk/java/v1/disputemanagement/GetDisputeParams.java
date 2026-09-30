/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.disputemanagement;

import java.util.ArrayList;
import java.util.List;

import com.worldline.acquiring.sdk.java.communication.ParamRequest;
import com.worldline.acquiring.sdk.java.communication.RequestParam;

/**
 * Query parameters for
 * <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Dispute-Management/operation/getDispute">Retrieve Dispute</a>
 */
public class GetDisputeParams implements ParamRequest {

    private Boolean includeEntries;

    /**
     * If true, the response will include the full history of dispute entries related to the dispute.
     * False by default.
     */
    public Boolean getIncludeEntries() {
        return includeEntries;
    }

    /**
     * If true, the response will include the full history of dispute entries related to the dispute.
     * False by default.
     */
    public void setIncludeEntries(Boolean value) {
        this.includeEntries = value;
    }

    /**
     * If true, the response will include the full history of dispute entries related to the dispute.
     * False by default.
     */
    public GetDisputeParams withIncludeEntries(Boolean value) {
        this.includeEntries = value;
        return this;
    }

    @Override
    public List<RequestParam> toRequestParameters() {
        List<RequestParam> result = new ArrayList<>();
        if (includeEntries != null) {
            result.add(new RequestParam("includeEntries", includeEntries.toString()));
        }
        return result;
    }
}
