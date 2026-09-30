/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

import java.util.List;

public class SearchDisputesRequest {

    private String acquirerDisputeReference;

    private String acquirerReferenceNumber;

    private DateTimeRange closedDateTime;

    private String disputeId;

    private List<String> disputeStages;

    private List<String> disputeStatusCategories;

    private Boolean isOpen;

    private DateTimeRange lastStatusChangedDateTime;

    private String merchantReference;

    private MerchantScope merchantScope;

    private DateTimeRange openedDateTime;

    private PaginationRequest pagination;

    private String paymentId;

    private DateRange responseDueDate;

    private List<String> schemes;

    private String sortBy;

    private String sortOrder;

    private List<String> unifiedCategories;

    /**
     * The reference provided by the acquirer for the dispute.
     */
    public String getAcquirerDisputeReference() {
        return acquirerDisputeReference;
    }

    /**
     * The reference provided by the acquirer for the dispute.
     */
    public void setAcquirerDisputeReference(String value) {
        this.acquirerDisputeReference = value;
    }

    /**
     * The reference provided by the acquirer for the dispute.
     */
    public SearchDisputesRequest withAcquirerDisputeReference(String value) {
        this.acquirerDisputeReference = value;
        return this;
    }

    /**
     * Acquirer reference number (ARN) for transaction
     */
    public String getAcquirerReferenceNumber() {
        return acquirerReferenceNumber;
    }

    /**
     * Acquirer reference number (ARN) for transaction
     */
    public void setAcquirerReferenceNumber(String value) {
        this.acquirerReferenceNumber = value;
    }

    /**
     * Acquirer reference number (ARN) for transaction
     */
    public SearchDisputesRequest withAcquirerReferenceNumber(String value) {
        this.acquirerReferenceNumber = value;
        return this;
    }

    /**
     * A range of date time values, used to select disputes that have a date time field that falls within this range.
     * <p>
     * <b>NOTE</b>: You can set either one or both of the lower and greater than properties to filter the results.
     */
    public DateTimeRange getClosedDateTime() {
        return closedDateTime;
    }

    /**
     * A range of date time values, used to select disputes that have a date time field that falls within this range.
     * <p>
     * <b>NOTE</b>: You can set either one or both of the lower and greater than properties to filter the results.
     */
    public void setClosedDateTime(DateTimeRange value) {
        this.closedDateTime = value;
    }

    /**
     * A range of date time values, used to select disputes that have a date time field that falls within this range.
     * <p>
     * <b>NOTE</b>: You can set either one or both of the lower and greater than properties to filter the results.
     */
    public SearchDisputesRequest withClosedDateTime(DateTimeRange value) {
        this.closedDateTime = value;
        return this;
    }

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
    public SearchDisputesRequest withDisputeId(String value) {
        this.disputeId = value;
        return this;
    }

    public List<String> getDisputeStages() {
        return disputeStages;
    }

    public void setDisputeStages(List<String> value) {
        this.disputeStages = value;
    }

    public SearchDisputesRequest withDisputeStages(List<String> value) {
        this.disputeStages = value;
        return this;
    }

    public List<String> getDisputeStatusCategories() {
        return disputeStatusCategories;
    }

    public void setDisputeStatusCategories(List<String> value) {
        this.disputeStatusCategories = value;
    }

    public SearchDisputesRequest withDisputeStatusCategories(List<String> value) {
        this.disputeStatusCategories = value;
        return this;
    }

    /**
     * Indicates whether the dispute is open or closed. An open dispute is a dispute that's still in the process
     * of being resolved, while a closed dispute is a dispute that has been resolved.
     */
    public Boolean getIsOpen() {
        return isOpen;
    }

    /**
     * Indicates whether the dispute is open or closed. An open dispute is a dispute that's still in the process
     * of being resolved, while a closed dispute is a dispute that has been resolved.
     */
    public void setIsOpen(Boolean value) {
        this.isOpen = value;
    }

    /**
     * Indicates whether the dispute is open or closed. An open dispute is a dispute that's still in the process
     * of being resolved, while a closed dispute is a dispute that has been resolved.
     */
    public SearchDisputesRequest withIsOpen(Boolean value) {
        this.isOpen = value;
        return this;
    }

    /**
     * A range of date time values, used to select disputes that have a date time field that falls within this range.
     * <p>
     * <b>NOTE</b>: You can set either one or both of the lower and greater than properties to filter the results.
     */
    public DateTimeRange getLastStatusChangedDateTime() {
        return lastStatusChangedDateTime;
    }

    /**
     * A range of date time values, used to select disputes that have a date time field that falls within this range.
     * <p>
     * <b>NOTE</b>: You can set either one or both of the lower and greater than properties to filter the results.
     */
    public void setLastStatusChangedDateTime(DateTimeRange value) {
        this.lastStatusChangedDateTime = value;
    }

    /**
     * A range of date time values, used to select disputes that have a date time field that falls within this range.
     * <p>
     * <b>NOTE</b>: You can set either one or both of the lower and greater than properties to filter the results.
     */
    public SearchDisputesRequest withLastStatusChangedDateTime(DateTimeRange value) {
        this.lastStatusChangedDateTime = value;
        return this;
    }

    /**
     * Reference for the transaction to allow the merchant to reconcile their payments in our report files
     * and in their disputes.<br>
     * It is advised to submit a unique value per transaction.<br>
     * The value is returned in the baseTrxType/addlMercData element of the MRX file.
     */
    public String getMerchantReference() {
        return merchantReference;
    }

    /**
     * Reference for the transaction to allow the merchant to reconcile their payments in our report files
     * and in their disputes.<br>
     * It is advised to submit a unique value per transaction.<br>
     * The value is returned in the baseTrxType/addlMercData element of the MRX file.
     */
    public void setMerchantReference(String value) {
        this.merchantReference = value;
    }

    /**
     * Reference for the transaction to allow the merchant to reconcile their payments in our report files
     * and in their disputes.<br>
     * It is advised to submit a unique value per transaction.<br>
     * The value is returned in the baseTrxType/addlMercData element of the MRX file.
     */
    public SearchDisputesRequest withMerchantReference(String value) {
        this.merchantReference = value;
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
    public SearchDisputesRequest withMerchantScope(MerchantScope value) {
        this.merchantScope = value;
        return this;
    }

    /**
     * A range of date time values, used to select disputes that have a date time field that falls within this range.
     * <p>
     * <b>NOTE</b>: You can set either one or both of the lower and greater than properties to filter the results.
     */
    public DateTimeRange getOpenedDateTime() {
        return openedDateTime;
    }

    /**
     * A range of date time values, used to select disputes that have a date time field that falls within this range.
     * <p>
     * <b>NOTE</b>: You can set either one or both of the lower and greater than properties to filter the results.
     */
    public void setOpenedDateTime(DateTimeRange value) {
        this.openedDateTime = value;
    }

    /**
     * A range of date time values, used to select disputes that have a date time field that falls within this range.
     * <p>
     * <b>NOTE</b>: You can set either one or both of the lower and greater than properties to filter the results.
     */
    public SearchDisputesRequest withOpenedDateTime(DateTimeRange value) {
        this.openedDateTime = value;
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
    public SearchDisputesRequest withPagination(PaginationRequest value) {
        this.pagination = value;
        return this;
    }

    /**
     * The unique identifier for the original payment transaction that resulted in the dispute.
     * Depending on the interface used for the original transaction different values are returned. If the original
     * transaction was made through the Acquiring API, the {@code paymentId} from the original transaction is returned.
     */
    public String getPaymentId() {
        return paymentId;
    }

    /**
     * The unique identifier for the original payment transaction that resulted in the dispute.
     * Depending on the interface used for the original transaction different values are returned. If the original
     * transaction was made through the Acquiring API, the {@code paymentId} from the original transaction is returned.
     */
    public void setPaymentId(String value) {
        this.paymentId = value;
    }

    /**
     * The unique identifier for the original payment transaction that resulted in the dispute.
     * Depending on the interface used for the original transaction different values are returned. If the original
     * transaction was made through the Acquiring API, the {@code paymentId} from the original transaction is returned.
     */
    public SearchDisputesRequest withPaymentId(String value) {
        this.paymentId = value;
        return this;
    }

    /**
     * A range of date values, used to select disputes that have a date field that falls within this range.
     * <p>
     * <b>NOTE</b>: You can set either one or both of the properties to filter the results.
     */
    public DateRange getResponseDueDate() {
        return responseDueDate;
    }

    /**
     * A range of date values, used to select disputes that have a date field that falls within this range.
     * <p>
     * <b>NOTE</b>: You can set either one or both of the properties to filter the results.
     */
    public void setResponseDueDate(DateRange value) {
        this.responseDueDate = value;
    }

    /**
     * A range of date values, used to select disputes that have a date field that falls within this range.
     * <p>
     * <b>NOTE</b>: You can set either one or both of the properties to filter the results.
     */
    public SearchDisputesRequest withResponseDueDate(DateRange value) {
        this.responseDueDate = value;
        return this;
    }

    public List<String> getSchemes() {
        return schemes;
    }

    public void setSchemes(List<String> value) {
        this.schemes = value;
    }

    public SearchDisputesRequest withSchemes(List<String> value) {
        this.schemes = value;
        return this;
    }

    /**
     * The field by which to sort the search results. This can be any of the date-time fields in
     * the dispute resource, such as {@code openedDateTime}, {@code closedDateTime}, {@code lastStatusChangedDateTime} or
     * {@code responseDueDate}.
     */
    public String getSortBy() {
        return sortBy;
    }

    /**
     * The field by which to sort the search results. This can be any of the date-time fields in
     * the dispute resource, such as {@code openedDateTime}, {@code closedDateTime}, {@code lastStatusChangedDateTime} or
     * {@code responseDueDate}.
     */
    public void setSortBy(String value) {
        this.sortBy = value;
    }

    /**
     * The field by which to sort the search results. This can be any of the date-time fields in
     * the dispute resource, such as {@code openedDateTime}, {@code closedDateTime}, {@code lastStatusChangedDateTime} or
     * {@code responseDueDate}.
     */
    public SearchDisputesRequest withSortBy(String value) {
        this.sortBy = value;
        return this;
    }

    /**
     * The order in which to sort the search results. Can be either ascending (ASC) or descending (DESC).
     */
    public String getSortOrder() {
        return sortOrder;
    }

    /**
     * The order in which to sort the search results. Can be either ascending (ASC) or descending (DESC).
     */
    public void setSortOrder(String value) {
        this.sortOrder = value;
    }

    /**
     * The order in which to sort the search results. Can be either ascending (ASC) or descending (DESC).
     */
    public SearchDisputesRequest withSortOrder(String value) {
        this.sortOrder = value;
        return this;
    }

    public List<String> getUnifiedCategories() {
        return unifiedCategories;
    }

    public void setUnifiedCategories(List<String> value) {
        this.unifiedCategories = value;
    }

    public SearchDisputesRequest withUnifiedCategories(List<String> value) {
        this.unifiedCategories = value;
        return this;
    }
}
