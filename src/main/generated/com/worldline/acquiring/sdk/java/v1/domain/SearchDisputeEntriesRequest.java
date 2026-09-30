/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

import java.util.List;

public class SearchDisputeEntriesRequest {

    private String disputeId;

    private List<String> entryCategories;

    private DateTimeRange entryDateTime;

    private String entryId;

    private List<String> entryTypes;

    private Boolean includeDisputeSummary;

    private MerchantScope merchantScope;

    private PaginationRequest pagination;

    private String sortOrder;

    /**
     * The unique identifier for a dispute.
     */
    public String getDisputeId() {
        return disputeId;
    }

    /**
     * The unique identifier for a dispute.
     */
    public void setDisputeId(String value) {
        this.disputeId = value;
    }

    /**
     * The unique identifier for a dispute.
     */
    public SearchDisputeEntriesRequest withDisputeId(String value) {
        this.disputeId = value;
        return this;
    }

    public List<String> getEntryCategories() {
        return entryCategories;
    }

    public void setEntryCategories(List<String> value) {
        this.entryCategories = value;
    }

    public SearchDisputeEntriesRequest withEntryCategories(List<String> value) {
        this.entryCategories = value;
        return this;
    }

    /**
     * A range of date time values, used to select disputes that have a date time field that falls within this range.
     * <p>
     * <b>NOTE</b>: You can set either one or both of the lower and greater than properties to filter the results.
     */
    public DateTimeRange getEntryDateTime() {
        return entryDateTime;
    }

    /**
     * A range of date time values, used to select disputes that have a date time field that falls within this range.
     * <p>
     * <b>NOTE</b>: You can set either one or both of the lower and greater than properties to filter the results.
     */
    public void setEntryDateTime(DateTimeRange value) {
        this.entryDateTime = value;
    }

    /**
     * A range of date time values, used to select disputes that have a date time field that falls within this range.
     * <p>
     * <b>NOTE</b>: You can set either one or both of the lower and greater than properties to filter the results.
     */
    public SearchDisputeEntriesRequest withEntryDateTime(DateTimeRange value) {
        this.entryDateTime = value;
        return this;
    }

    /**
     * The unique identifier for an dispute entry.
     */
    public String getEntryId() {
        return entryId;
    }

    /**
     * The unique identifier for an dispute entry.
     */
    public void setEntryId(String value) {
        this.entryId = value;
    }

    /**
     * The unique identifier for an dispute entry.
     */
    public SearchDisputeEntriesRequest withEntryId(String value) {
        this.entryId = value;
        return this;
    }

    public List<String> getEntryTypes() {
        return entryTypes;
    }

    public void setEntryTypes(List<String> value) {
        this.entryTypes = value;
    }

    public SearchDisputeEntriesRequest withEntryTypes(List<String> value) {
        this.entryTypes = value;
        return this;
    }

    /**
     * If true, the summary of the dispute case will be included in the response for dispute entries search.
     * The dispute case summary includes key information about the dispute case such as the current status,
     * the reason for the dispute and the amount of the disputed transaction. This can be useful to provide context
     * about the dispute case when searching for specific dispute entries.<br>
     * False by default.
     */
    public Boolean getIncludeDisputeSummary() {
        return includeDisputeSummary;
    }

    /**
     * If true, the summary of the dispute case will be included in the response for dispute entries search.
     * The dispute case summary includes key information about the dispute case such as the current status,
     * the reason for the dispute and the amount of the disputed transaction. This can be useful to provide context
     * about the dispute case when searching for specific dispute entries.<br>
     * False by default.
     */
    public void setIncludeDisputeSummary(Boolean value) {
        this.includeDisputeSummary = value;
    }

    /**
     * If true, the summary of the dispute case will be included in the response for dispute entries search.
     * The dispute case summary includes key information about the dispute case such as the current status,
     * the reason for the dispute and the amount of the disputed transaction. This can be useful to provide context
     * about the dispute case when searching for specific dispute entries.<br>
     * False by default.
     */
    public SearchDisputeEntriesRequest withIncludeDisputeSummary(Boolean value) {
        this.includeDisputeSummary = value;
        return this;
    }

    /**
     * A set of fields to specify the scope of the search for disputes related to a specific merchant or set of merchants.
     * The following options are available:
     * <ul>
     *   <li>Search for disputes related to specific acquirers, by providing the {@code acquirerIds} field.</li>
     *   <li>Search for disputes related to specific merchant groups, by providing the {@code merchantRootIds} field.</li>
     *   <li>Search for disputes related to specific merchants, by providing the {@code merchantIds} field.</li>
     * </ul>
     * <p>
     * If no merchant scope is provided, disputes for all merchants that the API user has access to will be returned (that
     * also match the other provided search criteria, if any).
     */
    public MerchantScope getMerchantScope() {
        return merchantScope;
    }

    /**
     * A set of fields to specify the scope of the search for disputes related to a specific merchant or set of merchants.
     * The following options are available:
     * <ul>
     *   <li>Search for disputes related to specific acquirers, by providing the {@code acquirerIds} field.</li>
     *   <li>Search for disputes related to specific merchant groups, by providing the {@code merchantRootIds} field.</li>
     *   <li>Search for disputes related to specific merchants, by providing the {@code merchantIds} field.</li>
     * </ul>
     * <p>
     * If no merchant scope is provided, disputes for all merchants that the API user has access to will be returned (that
     * also match the other provided search criteria, if any).
     */
    public void setMerchantScope(MerchantScope value) {
        this.merchantScope = value;
    }

    /**
     * A set of fields to specify the scope of the search for disputes related to a specific merchant or set of merchants.
     * The following options are available:
     * <ul>
     *   <li>Search for disputes related to specific acquirers, by providing the {@code acquirerIds} field.</li>
     *   <li>Search for disputes related to specific merchant groups, by providing the {@code merchantRootIds} field.</li>
     *   <li>Search for disputes related to specific merchants, by providing the {@code merchantIds} field.</li>
     * </ul>
     * <p>
     * If no merchant scope is provided, disputes for all merchants that the API user has access to will be returned (that
     * also match the other provided search criteria, if any).
     */
    public SearchDisputeEntriesRequest withMerchantScope(MerchantScope value) {
        this.merchantScope = value;
        return this;
    }

    /**
     * Pagination details for paginated responses.
     * <p>
     * First request: Omit {@code searchId}, set {@code fromIndex}=0, {@code pageSize}=20
     * Subsequent requests: Use {@code searchId} from previous response to maintain query context.
     * <p>
     * Note: {@code searchId} expires after 24 hours. If you should perform your original search request again.
     */
    public PaginationRequest getPagination() {
        return pagination;
    }

    /**
     * Pagination details for paginated responses.
     * <p>
     * First request: Omit {@code searchId}, set {@code fromIndex}=0, {@code pageSize}=20
     * Subsequent requests: Use {@code searchId} from previous response to maintain query context.
     * <p>
     * Note: {@code searchId} expires after 24 hours. If you should perform your original search request again.
     */
    public void setPagination(PaginationRequest value) {
        this.pagination = value;
    }

    /**
     * Pagination details for paginated responses.
     * <p>
     * First request: Omit {@code searchId}, set {@code fromIndex}=0, {@code pageSize}=20
     * Subsequent requests: Use {@code searchId} from previous response to maintain query context.
     * <p>
     * Note: {@code searchId} expires after 24 hours. If you should perform your original search request again.
     */
    public SearchDisputeEntriesRequest withPagination(PaginationRequest value) {
        this.pagination = value;
        return this;
    }

    /**
     * The order in which to sort the dispute entries in the response. Can be either ascending (ASC) or descending (DESC). The sorting is done based on the {@code entryDateTime} field of the dispute entries, so when the sort order is ascending, the oldest entry is returned first and the newest entry is returned last. By default, the dispute entries are sorted in descending order.
     */
    public String getSortOrder() {
        return sortOrder;
    }

    /**
     * The order in which to sort the dispute entries in the response. Can be either ascending (ASC) or descending (DESC). The sorting is done based on the {@code entryDateTime} field of the dispute entries, so when the sort order is ascending, the oldest entry is returned first and the newest entry is returned last. By default, the dispute entries are sorted in descending order.
     */
    public void setSortOrder(String value) {
        this.sortOrder = value;
    }

    /**
     * The order in which to sort the dispute entries in the response. Can be either ascending (ASC) or descending (DESC). The sorting is done based on the {@code entryDateTime} field of the dispute entries, so when the sort order is ascending, the oldest entry is returned first and the newest entry is returned last. By default, the dispute entries are sorted in descending order.
     */
    public SearchDisputeEntriesRequest withSortOrder(String value) {
        this.sortOrder = value;
        return this;
    }
}
