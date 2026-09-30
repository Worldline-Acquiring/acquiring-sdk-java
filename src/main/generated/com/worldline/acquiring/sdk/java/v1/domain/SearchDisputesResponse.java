/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

import java.util.List;

public class SearchDisputesResponse {

    private List<DisputeCase> disputes;

    private PaginationResponse pagination;

    private String requestId;

    /**
     * A list of dispute cases matching the provided search criteria. Each dispute case contains
     * the full details of the dispute, but without the full history of entries for the dispute.
     * These can be retrieved by setting the {@code includeEntries} parameter to true when using the
     * <a href="#operation/getDispute">Retrieve Dispute</a> endpoint.
     */
    public List<DisputeCase> getDisputes() {
        return disputes;
    }

    /**
     * A list of dispute cases matching the provided search criteria. Each dispute case contains
     * the full details of the dispute, but without the full history of entries for the dispute.
     * These can be retrieved by setting the {@code includeEntries} parameter to true when using the
     * <a href="#operation/getDispute">Retrieve Dispute</a> endpoint.
     */
    public void setDisputes(List<DisputeCase> value) {
        this.disputes = value;
    }

    /**
     * A list of dispute cases matching the provided search criteria. Each dispute case contains
     * the full details of the dispute, but without the full history of entries for the dispute.
     * These can be retrieved by setting the {@code includeEntries} parameter to true when using the
     * <a href="#operation/getDispute">Retrieve Dispute</a> endpoint.
     */
    public SearchDisputesResponse withDisputes(List<DisputeCase> value) {
        this.disputes = value;
        return this;
    }

    /**
     * Pagination details for paginated responses.
     */
    public PaginationResponse getPagination() {
        return pagination;
    }

    /**
     * Pagination details for paginated responses.
     */
    public void setPagination(PaginationResponse value) {
        this.pagination = value;
    }

    /**
     * Pagination details for paginated responses.
     */
    public SearchDisputesResponse withPagination(PaginationResponse value) {
        this.pagination = value;
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
    public SearchDisputesResponse withRequestId(String value) {
        this.requestId = value;
        return this;
    }
}
