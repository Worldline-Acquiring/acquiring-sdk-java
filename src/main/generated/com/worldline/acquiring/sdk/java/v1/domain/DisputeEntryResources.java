/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

import java.util.List;

public class DisputeEntryResources {

    private List<DisputeEntryWithDisputeSummary> disputeEntries;

    private PaginationResponse pagination;

    private String requestId;

    /**
     * A list of dispute entries matching the provided search criteria. Each entry documents a single event in the
     * lifecycle of the dispute, such as when the dispute was opened, when evidence was requested by the acquirer,
     * when evidence was provided by the merchant, when a credit adjustment was made by the acquirer, etc.
     * <p>
     * Each entry has a category and type that indicate what kind of step it represents. The data elements can be
     * different, depending on the entry type. For some steps more details are provided in a message text.
     * <p>
     * For each entry, if there are documents related to it, a list of document metadata will be included in the
     * {@code documents} field.
     * <p>
     * Optionally a {@code disputeSummary} object can be included for each entry by setting the {@code includeDisputeSummary}
     * parameter to {@code true} in the request of the <a href="#operation/searchDisputeEntries">Search Dispute Entries</a> endpoint. This summary contains key
     * information on the dispute case that can be useful to understand the context of the entry, such as the
     * current status and stage of the dispute, the type of dispute, the amount in dispute, the reason code, etc.
     */
    public List<DisputeEntryWithDisputeSummary> getDisputeEntries() {
        return disputeEntries;
    }

    /**
     * A list of dispute entries matching the provided search criteria. Each entry documents a single event in the
     * lifecycle of the dispute, such as when the dispute was opened, when evidence was requested by the acquirer,
     * when evidence was provided by the merchant, when a credit adjustment was made by the acquirer, etc.
     * <p>
     * Each entry has a category and type that indicate what kind of step it represents. The data elements can be
     * different, depending on the entry type. For some steps more details are provided in a message text.
     * <p>
     * For each entry, if there are documents related to it, a list of document metadata will be included in the
     * {@code documents} field.
     * <p>
     * Optionally a {@code disputeSummary} object can be included for each entry by setting the {@code includeDisputeSummary}
     * parameter to {@code true} in the request of the <a href="#operation/searchDisputeEntries">Search Dispute Entries</a> endpoint. This summary contains key
     * information on the dispute case that can be useful to understand the context of the entry, such as the
     * current status and stage of the dispute, the type of dispute, the amount in dispute, the reason code, etc.
     */
    public void setDisputeEntries(List<DisputeEntryWithDisputeSummary> value) {
        this.disputeEntries = value;
    }

    /**
     * A list of dispute entries matching the provided search criteria. Each entry documents a single event in the
     * lifecycle of the dispute, such as when the dispute was opened, when evidence was requested by the acquirer,
     * when evidence was provided by the merchant, when a credit adjustment was made by the acquirer, etc.
     * <p>
     * Each entry has a category and type that indicate what kind of step it represents. The data elements can be
     * different, depending on the entry type. For some steps more details are provided in a message text.
     * <p>
     * For each entry, if there are documents related to it, a list of document metadata will be included in the
     * {@code documents} field.
     * <p>
     * Optionally a {@code disputeSummary} object can be included for each entry by setting the {@code includeDisputeSummary}
     * parameter to {@code true} in the request of the <a href="#operation/searchDisputeEntries">Search Dispute Entries</a> endpoint. This summary contains key
     * information on the dispute case that can be useful to understand the context of the entry, such as the
     * current status and stage of the dispute, the type of dispute, the amount in dispute, the reason code, etc.
     */
    public DisputeEntryResources withDisputeEntries(List<DisputeEntryWithDisputeSummary> value) {
        this.disputeEntries = value;
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
    public DisputeEntryResources withPagination(PaginationResponse value) {
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
    public DisputeEntryResources withRequestId(String value) {
        this.requestId = value;
        return this;
    }
}
