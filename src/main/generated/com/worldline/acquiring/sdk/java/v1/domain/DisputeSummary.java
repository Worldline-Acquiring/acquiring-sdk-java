/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class DisputeSummary {

    private String acquirerDisputeReference;

    private DisputeMerchantDataBase merchantData;

    private OriginalTransactionSummaryData originalTransactionData;

    private String schemeReason;

    private String schemeReasonDescription;

    private String unifiedCategory;

    private String unifiedReason;

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
    public DisputeSummary withAcquirerDisputeReference(String value) {
        this.acquirerDisputeReference = value;
        return this;
    }

    /**
     * Summary data related to the merchant involved in the dispute.
     */
    public DisputeMerchantDataBase getMerchantData() {
        return merchantData;
    }

    /**
     * Summary data related to the merchant involved in the dispute.
     */
    public void setMerchantData(DisputeMerchantDataBase value) {
        this.merchantData = value;
    }

    /**
     * Summary data related to the merchant involved in the dispute.
     */
    public DisputeSummary withMerchantData(DisputeMerchantDataBase value) {
        this.merchantData = value;
        return this;
    }

    /**
     * Data related to the original transaction that led to the dispute.
     */
    public OriginalTransactionSummaryData getOriginalTransactionData() {
        return originalTransactionData;
    }

    /**
     * Data related to the original transaction that led to the dispute.
     */
    public void setOriginalTransactionData(OriginalTransactionSummaryData value) {
        this.originalTransactionData = value;
    }

    /**
     * Data related to the original transaction that led to the dispute.
     */
    public DisputeSummary withOriginalTransactionData(OriginalTransactionSummaryData value) {
        this.originalTransactionData = value;
        return this;
    }

    /**
     * The reason provided by the card scheme for the dispute.
     */
    public String getSchemeReason() {
        return schemeReason;
    }

    /**
     * The reason provided by the card scheme for the dispute.
     */
    public void setSchemeReason(String value) {
        this.schemeReason = value;
    }

    /**
     * The reason provided by the card scheme for the dispute.
     */
    public DisputeSummary withSchemeReason(String value) {
        this.schemeReason = value;
        return this;
    }

    /**
     * The human readable description of the reason provided by the card scheme for the dispute.
     */
    public String getSchemeReasonDescription() {
        return schemeReasonDescription;
    }

    /**
     * The human readable description of the reason provided by the card scheme for the dispute.
     */
    public void setSchemeReasonDescription(String value) {
        this.schemeReasonDescription = value;
    }

    /**
     * The human readable description of the reason provided by the card scheme for the dispute.
     */
    public DisputeSummary withSchemeReasonDescription(String value) {
        this.schemeReasonDescription = value;
        return this;
    }

    /**
     * The unified category of the dispute, used for categorization and reporting purposes.
     * Only present if a dispute was received.
     * <p>
     * Possible values are:
     * <ul>
     *   <li>AUTHORIZATION_RELATED (authorization related disputes)</li>
     *   <li>FRAUD_RELATED (fraud related disputes)</li>
     *   <li>CONSUMER_DISPUTE (consumer initiated disputes)</li>
     *   <li>PROCESSING_ERROR (error during the payment processing leads to a dispute)</li>
     *   <li>OTHER (collection of diverse dispute reasons)</li>
     * </ul>
     */
    public String getUnifiedCategory() {
        return unifiedCategory;
    }

    /**
     * The unified category of the dispute, used for categorization and reporting purposes.
     * Only present if a dispute was received.
     * <p>
     * Possible values are:
     * <ul>
     *   <li>AUTHORIZATION_RELATED (authorization related disputes)</li>
     *   <li>FRAUD_RELATED (fraud related disputes)</li>
     *   <li>CONSUMER_DISPUTE (consumer initiated disputes)</li>
     *   <li>PROCESSING_ERROR (error during the payment processing leads to a dispute)</li>
     *   <li>OTHER (collection of diverse dispute reasons)</li>
     * </ul>
     */
    public void setUnifiedCategory(String value) {
        this.unifiedCategory = value;
    }

    /**
     * The unified category of the dispute, used for categorization and reporting purposes.
     * Only present if a dispute was received.
     * <p>
     * Possible values are:
     * <ul>
     *   <li>AUTHORIZATION_RELATED (authorization related disputes)</li>
     *   <li>FRAUD_RELATED (fraud related disputes)</li>
     *   <li>CONSUMER_DISPUTE (consumer initiated disputes)</li>
     *   <li>PROCESSING_ERROR (error during the payment processing leads to a dispute)</li>
     *   <li>OTHER (collection of diverse dispute reasons)</li>
     * </ul>
     */
    public DisputeSummary withUnifiedCategory(String value) {
        this.unifiedCategory = value;
        return this;
    }

    /**
     * The unified reason for the dispute, used for categorization and reporting purposes.
     * Only present if a dispute was received.
     * <p>
     * Possible values are:
     * <ul>
     *   <li>FRAUDULENT_CARD_USAGE (Fraudulent use of card)</li>
     *   <li>UNAUTHORIZED_TRANSACTION (No valid Issuer authorization)</li>
     *   <li>GENERAL_PAYMENT_ERROR (General payment error)</li>
     *   <li>INVALID_TRANSACTION_TYPE (Invalid transaction type)</li>
     *   <li>INVALID_CURRENCY (Invalid currency)</li>
     *   <li>INVALID_CARD_NUMBER (Invalid card number)</li>
     *   <li>INVALID_AMOUNT (Invalid amount)</li>
     *   <li>DUPLICATE_CHARGE_OR_PAID_BY_OTHER_MEANS (Duplicate charge or paid by other means)</li>
     *   <li>GENERAL_CUSTOMER_DISPUTE (General customer dispute)</li>
     *   <li>GOODS_OR_SERVICES_NOT_RECEIVED (Goods or services not received)</li>
     *   <li>CANCELLED_SUBSCRIPTION (Cancelled subscription)</li>
     *   <li>GOODS_OR_SERVICES_NOT_MATCHING_ORDER (Goods or services not matching order)</li>
     *   <li>COUNTERFEIT_MERCHANDISE (Counterfeit merchandise)</li>
     *   <li>DUE_REFUND_NOT_RECEIVED (Due refund not received)</li>
     *   <li>CHARGE_NOT_ACCEPTED ((Subsequent) Charge not accepted)</li>
     *   <li>OTHER (Other)</li>
     * </ul>
     */
    public String getUnifiedReason() {
        return unifiedReason;
    }

    /**
     * The unified reason for the dispute, used for categorization and reporting purposes.
     * Only present if a dispute was received.
     * <p>
     * Possible values are:
     * <ul>
     *   <li>FRAUDULENT_CARD_USAGE (Fraudulent use of card)</li>
     *   <li>UNAUTHORIZED_TRANSACTION (No valid Issuer authorization)</li>
     *   <li>GENERAL_PAYMENT_ERROR (General payment error)</li>
     *   <li>INVALID_TRANSACTION_TYPE (Invalid transaction type)</li>
     *   <li>INVALID_CURRENCY (Invalid currency)</li>
     *   <li>INVALID_CARD_NUMBER (Invalid card number)</li>
     *   <li>INVALID_AMOUNT (Invalid amount)</li>
     *   <li>DUPLICATE_CHARGE_OR_PAID_BY_OTHER_MEANS (Duplicate charge or paid by other means)</li>
     *   <li>GENERAL_CUSTOMER_DISPUTE (General customer dispute)</li>
     *   <li>GOODS_OR_SERVICES_NOT_RECEIVED (Goods or services not received)</li>
     *   <li>CANCELLED_SUBSCRIPTION (Cancelled subscription)</li>
     *   <li>GOODS_OR_SERVICES_NOT_MATCHING_ORDER (Goods or services not matching order)</li>
     *   <li>COUNTERFEIT_MERCHANDISE (Counterfeit merchandise)</li>
     *   <li>DUE_REFUND_NOT_RECEIVED (Due refund not received)</li>
     *   <li>CHARGE_NOT_ACCEPTED ((Subsequent) Charge not accepted)</li>
     *   <li>OTHER (Other)</li>
     * </ul>
     */
    public void setUnifiedReason(String value) {
        this.unifiedReason = value;
    }

    /**
     * The unified reason for the dispute, used for categorization and reporting purposes.
     * Only present if a dispute was received.
     * <p>
     * Possible values are:
     * <ul>
     *   <li>FRAUDULENT_CARD_USAGE (Fraudulent use of card)</li>
     *   <li>UNAUTHORIZED_TRANSACTION (No valid Issuer authorization)</li>
     *   <li>GENERAL_PAYMENT_ERROR (General payment error)</li>
     *   <li>INVALID_TRANSACTION_TYPE (Invalid transaction type)</li>
     *   <li>INVALID_CURRENCY (Invalid currency)</li>
     *   <li>INVALID_CARD_NUMBER (Invalid card number)</li>
     *   <li>INVALID_AMOUNT (Invalid amount)</li>
     *   <li>DUPLICATE_CHARGE_OR_PAID_BY_OTHER_MEANS (Duplicate charge or paid by other means)</li>
     *   <li>GENERAL_CUSTOMER_DISPUTE (General customer dispute)</li>
     *   <li>GOODS_OR_SERVICES_NOT_RECEIVED (Goods or services not received)</li>
     *   <li>CANCELLED_SUBSCRIPTION (Cancelled subscription)</li>
     *   <li>GOODS_OR_SERVICES_NOT_MATCHING_ORDER (Goods or services not matching order)</li>
     *   <li>COUNTERFEIT_MERCHANDISE (Counterfeit merchandise)</li>
     *   <li>DUE_REFUND_NOT_RECEIVED (Due refund not received)</li>
     *   <li>CHARGE_NOT_ACCEPTED ((Subsequent) Charge not accepted)</li>
     *   <li>OTHER (Other)</li>
     * </ul>
     */
    public DisputeSummary withUnifiedReason(String value) {
        this.unifiedReason = value;
        return this;
    }
}
