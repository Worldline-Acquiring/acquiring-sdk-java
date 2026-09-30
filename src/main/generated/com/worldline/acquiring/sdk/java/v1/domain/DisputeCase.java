/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class DisputeCase {

    private DisputeDateTimeData disputeDateTimeData;

    private String disputeId;

    private DisputeReferences disputeReferences;

    private String disputeStage;

    private String disputeStatus;

    private String disputeStatusCategory;

    private Boolean isOpen;

    private SignedAmountData merchantBalanceAmount;

    private DisputeMerchantData merchantData;

    private AmountData originalDisputeAmount;

    private OriginalTransactionData originalTransactionData;

    private String schemeReason;

    private String schemeReasonDescription;

    private String unifiedCategory;

    private String unifiedReason;

    /**
     * A set of date time fields related to the dispute case. Depending on the {@code disputeStatus} and
     * {@code disputeStage} of the dispute, different date time fields are relevant. For example, when the
     * {@code disputeStatus} is &quot;EVIDENCE_REQUESTED&quot;, the {@code responseDueDate} field indicates the deadline to respond
     * to the dispute.
     * <p>
     * The {@code closedDateTime} field represents the date and time when the dispute was closed. This field is only
     * returned for closed disputes. Disputes that are open too long are automatically closed.
     */
    public DisputeDateTimeData getDisputeDateTimeData() {
        return disputeDateTimeData;
    }

    /**
     * A set of date time fields related to the dispute case. Depending on the {@code disputeStatus} and
     * {@code disputeStage} of the dispute, different date time fields are relevant. For example, when the
     * {@code disputeStatus} is &quot;EVIDENCE_REQUESTED&quot;, the {@code responseDueDate} field indicates the deadline to respond
     * to the dispute.
     * <p>
     * The {@code closedDateTime} field represents the date and time when the dispute was closed. This field is only
     * returned for closed disputes. Disputes that are open too long are automatically closed.
     */
    public void setDisputeDateTimeData(DisputeDateTimeData value) {
        this.disputeDateTimeData = value;
    }

    /**
     * A set of date time fields related to the dispute case. Depending on the {@code disputeStatus} and
     * {@code disputeStage} of the dispute, different date time fields are relevant. For example, when the
     * {@code disputeStatus} is &quot;EVIDENCE_REQUESTED&quot;, the {@code responseDueDate} field indicates the deadline to respond
     * to the dispute.
     * <p>
     * The {@code closedDateTime} field represents the date and time when the dispute was closed. This field is only
     * returned for closed disputes. Disputes that are open too long are automatically closed.
     */
    public DisputeCase withDisputeDateTimeData(DisputeDateTimeData value) {
        this.disputeDateTimeData = value;
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
    public DisputeCase withDisputeId(String value) {
        this.disputeId = value;
        return this;
    }

    /**
     * A set of references related to the dispute case.
     */
    public DisputeReferences getDisputeReferences() {
        return disputeReferences;
    }

    /**
     * A set of references related to the dispute case.
     */
    public void setDisputeReferences(DisputeReferences value) {
        this.disputeReferences = value;
    }

    /**
     * A set of references related to the dispute case.
     */
    public DisputeCase withDisputeReferences(DisputeReferences value) {
        this.disputeReferences = value;
        return this;
    }

    /**
     * The current stage in the lifecycle of the dispute.
     * <p>
     * Possible values are:
     * <ul>
     *   <li>CREATED (The dispute case includes no dispute relevant information)</li>
     *   <li>FRAUD (The dispute case is opened with a fraud report (Issuer cases only))</li>
     *   <li>INQUIRY (Pre-dispute phase)</li>
     *   <li>DISPUTE (The dispute case reached the dispute stage, which includes dispute and representment handling)</li>
     *   <li>PRE_ARBITRATION (The dispute case is in the first stage of the case filing process, before escalation to arbitration)</li>
     *   <li>ARBITRATION (The dispute case filing process escalated to the arbitration phase)</li>
     *   <li>PRE_COMPLIANCE (The dispute case is in the first stage of the case filing process, before escalation to compliance)</li>
     *   <li>COMPLIANCE (The dispute case filing process escalated to the compliance phase)</li>
     * </ul>
     */
    public String getDisputeStage() {
        return disputeStage;
    }

    /**
     * The current stage in the lifecycle of the dispute.
     * <p>
     * Possible values are:
     * <ul>
     *   <li>CREATED (The dispute case includes no dispute relevant information)</li>
     *   <li>FRAUD (The dispute case is opened with a fraud report (Issuer cases only))</li>
     *   <li>INQUIRY (Pre-dispute phase)</li>
     *   <li>DISPUTE (The dispute case reached the dispute stage, which includes dispute and representment handling)</li>
     *   <li>PRE_ARBITRATION (The dispute case is in the first stage of the case filing process, before escalation to arbitration)</li>
     *   <li>ARBITRATION (The dispute case filing process escalated to the arbitration phase)</li>
     *   <li>PRE_COMPLIANCE (The dispute case is in the first stage of the case filing process, before escalation to compliance)</li>
     *   <li>COMPLIANCE (The dispute case filing process escalated to the compliance phase)</li>
     * </ul>
     */
    public void setDisputeStage(String value) {
        this.disputeStage = value;
    }

    /**
     * The current stage in the lifecycle of the dispute.
     * <p>
     * Possible values are:
     * <ul>
     *   <li>CREATED (The dispute case includes no dispute relevant information)</li>
     *   <li>FRAUD (The dispute case is opened with a fraud report (Issuer cases only))</li>
     *   <li>INQUIRY (Pre-dispute phase)</li>
     *   <li>DISPUTE (The dispute case reached the dispute stage, which includes dispute and representment handling)</li>
     *   <li>PRE_ARBITRATION (The dispute case is in the first stage of the case filing process, before escalation to arbitration)</li>
     *   <li>ARBITRATION (The dispute case filing process escalated to the arbitration phase)</li>
     *   <li>PRE_COMPLIANCE (The dispute case is in the first stage of the case filing process, before escalation to compliance)</li>
     *   <li>COMPLIANCE (The dispute case filing process escalated to the compliance phase)</li>
     * </ul>
     */
    public DisputeCase withDisputeStage(String value) {
        this.disputeStage = value;
        return this;
    }

    /**
     * The current status of the dispute.
     * <p>
     * Possible values are:
     * <ul>
     *   <li>For {@code IN_PROGRESS} dispute status category:
     *     <ul>
     *       <li>REVIEW_BY_ACQUIRER (Next action is on Acquirer side)</li>
     *       <li>REVIEW_BY_ISSUER (Next action is on Issuer side)</li>
     *       <li>REVIEW_BY_SCHEME (Next action is on Scheme side)</li>
     *     </ul>
     *   </li>
     *   <li>For {@code NEEDS_RESPONSE} dispute status category:
     *     <ul>
     *       <li>EVIDENCE_REQUESTED (Acquirer request evidence from merchant)</li>
     *     </ul>
     *   </li>
     *   <li>For {@code WON} dispute status category:
     *     <ul>
     *       <li>ISSUER_WITHDRAWN (Issuer withdraw the dispute and accept liability)</li>
     *       <li>SUCCESSFUL_DEFENSE (Acquirer dispute defense was successful)</li>
     *       <li>SCHEME_RULING (Dispute is escalated and scheme ruled in favor of Merchant)</li>
     *     </ul>
     *   </li>
     *   <li>For {@code LOST} dispute status category:
     *     <ul>
     *       <li>UNSUCCESSFUL_DEFENSE (Acquirer dispute defense was not successful)</li>
     *       <li>UNANSWERED_EXPIRED (Dispute respond time expired, no further defense is possible)</li>
     *       <li>ACCEPTED (Acquirer accepted liability)</li>
     *       <li>SCHEME_RULING (Dispute is escalated and scheme ruled in favor of Issuer)</li>
     *     </ul>
     *   </li>
     *   <li>For {@code CANCELLED} dispute status category:
     *     <ul>
     *       <li>DISPUTE_CANCELLED (Issuer withdrew the dispute)</li>
     *     </ul>
     *   </li>
     * </ul>
     */
    public String getDisputeStatus() {
        return disputeStatus;
    }

    /**
     * The current status of the dispute.
     * <p>
     * Possible values are:
     * <ul>
     *   <li>For {@code IN_PROGRESS} dispute status category:
     *     <ul>
     *       <li>REVIEW_BY_ACQUIRER (Next action is on Acquirer side)</li>
     *       <li>REVIEW_BY_ISSUER (Next action is on Issuer side)</li>
     *       <li>REVIEW_BY_SCHEME (Next action is on Scheme side)</li>
     *     </ul>
     *   </li>
     *   <li>For {@code NEEDS_RESPONSE} dispute status category:
     *     <ul>
     *       <li>EVIDENCE_REQUESTED (Acquirer request evidence from merchant)</li>
     *     </ul>
     *   </li>
     *   <li>For {@code WON} dispute status category:
     *     <ul>
     *       <li>ISSUER_WITHDRAWN (Issuer withdraw the dispute and accept liability)</li>
     *       <li>SUCCESSFUL_DEFENSE (Acquirer dispute defense was successful)</li>
     *       <li>SCHEME_RULING (Dispute is escalated and scheme ruled in favor of Merchant)</li>
     *     </ul>
     *   </li>
     *   <li>For {@code LOST} dispute status category:
     *     <ul>
     *       <li>UNSUCCESSFUL_DEFENSE (Acquirer dispute defense was not successful)</li>
     *       <li>UNANSWERED_EXPIRED (Dispute respond time expired, no further defense is possible)</li>
     *       <li>ACCEPTED (Acquirer accepted liability)</li>
     *       <li>SCHEME_RULING (Dispute is escalated and scheme ruled in favor of Issuer)</li>
     *     </ul>
     *   </li>
     *   <li>For {@code CANCELLED} dispute status category:
     *     <ul>
     *       <li>DISPUTE_CANCELLED (Issuer withdrew the dispute)</li>
     *     </ul>
     *   </li>
     * </ul>
     */
    public void setDisputeStatus(String value) {
        this.disputeStatus = value;
    }

    /**
     * The current status of the dispute.
     * <p>
     * Possible values are:
     * <ul>
     *   <li>For {@code IN_PROGRESS} dispute status category:
     *     <ul>
     *       <li>REVIEW_BY_ACQUIRER (Next action is on Acquirer side)</li>
     *       <li>REVIEW_BY_ISSUER (Next action is on Issuer side)</li>
     *       <li>REVIEW_BY_SCHEME (Next action is on Scheme side)</li>
     *     </ul>
     *   </li>
     *   <li>For {@code NEEDS_RESPONSE} dispute status category:
     *     <ul>
     *       <li>EVIDENCE_REQUESTED (Acquirer request evidence from merchant)</li>
     *     </ul>
     *   </li>
     *   <li>For {@code WON} dispute status category:
     *     <ul>
     *       <li>ISSUER_WITHDRAWN (Issuer withdraw the dispute and accept liability)</li>
     *       <li>SUCCESSFUL_DEFENSE (Acquirer dispute defense was successful)</li>
     *       <li>SCHEME_RULING (Dispute is escalated and scheme ruled in favor of Merchant)</li>
     *     </ul>
     *   </li>
     *   <li>For {@code LOST} dispute status category:
     *     <ul>
     *       <li>UNSUCCESSFUL_DEFENSE (Acquirer dispute defense was not successful)</li>
     *       <li>UNANSWERED_EXPIRED (Dispute respond time expired, no further defense is possible)</li>
     *       <li>ACCEPTED (Acquirer accepted liability)</li>
     *       <li>SCHEME_RULING (Dispute is escalated and scheme ruled in favor of Issuer)</li>
     *     </ul>
     *   </li>
     *   <li>For {@code CANCELLED} dispute status category:
     *     <ul>
     *       <li>DISPUTE_CANCELLED (Issuer withdrew the dispute)</li>
     *     </ul>
     *   </li>
     * </ul>
     */
    public DisputeCase withDisputeStatus(String value) {
        this.disputeStatus = value;
        return this;
    }

    /**
     * The category of the current status of the dispute.
     * <p>
     * Possible values are:
     * <ul>
     *   <li>IN_PROGRESS (Dispute process is ongoing and has no final decision. The merchant currently waits for further status updates.)</li>
     *   <li>NEEDS_RESPONSE (The merchant is contacted to provide supporting evidence documents before a deadline)</li>
     *   <li>WON (Dispute case has been won)</li>
     *   <li>LOST (Dispute case has been lost)</li>
     *   <li>CANCELLED (Dispute has been withdrawn)</li>
     * </ul>
     */
    public String getDisputeStatusCategory() {
        return disputeStatusCategory;
    }

    /**
     * The category of the current status of the dispute.
     * <p>
     * Possible values are:
     * <ul>
     *   <li>IN_PROGRESS (Dispute process is ongoing and has no final decision. The merchant currently waits for further status updates.)</li>
     *   <li>NEEDS_RESPONSE (The merchant is contacted to provide supporting evidence documents before a deadline)</li>
     *   <li>WON (Dispute case has been won)</li>
     *   <li>LOST (Dispute case has been lost)</li>
     *   <li>CANCELLED (Dispute has been withdrawn)</li>
     * </ul>
     */
    public void setDisputeStatusCategory(String value) {
        this.disputeStatusCategory = value;
    }

    /**
     * The category of the current status of the dispute.
     * <p>
     * Possible values are:
     * <ul>
     *   <li>IN_PROGRESS (Dispute process is ongoing and has no final decision. The merchant currently waits for further status updates.)</li>
     *   <li>NEEDS_RESPONSE (The merchant is contacted to provide supporting evidence documents before a deadline)</li>
     *   <li>WON (Dispute case has been won)</li>
     *   <li>LOST (Dispute case has been lost)</li>
     *   <li>CANCELLED (Dispute has been withdrawn)</li>
     * </ul>
     */
    public DisputeCase withDisputeStatusCategory(String value) {
        this.disputeStatusCategory = value;
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
    public DisputeCase withIsOpen(Boolean value) {
        this.isOpen = value;
        return this;
    }

    /**
     * Amount with an indicator whether it's a debit or credit amount.
     */
    public SignedAmountData getMerchantBalanceAmount() {
        return merchantBalanceAmount;
    }

    /**
     * Amount with an indicator whether it's a debit or credit amount.
     */
    public void setMerchantBalanceAmount(SignedAmountData value) {
        this.merchantBalanceAmount = value;
    }

    /**
     * Amount with an indicator whether it's a debit or credit amount.
     */
    public DisputeCase withMerchantBalanceAmount(SignedAmountData value) {
        this.merchantBalanceAmount = value;
        return this;
    }

    /**
     * Data related to the merchant involved in the dispute.
     */
    public DisputeMerchantData getMerchantData() {
        return merchantData;
    }

    /**
     * Data related to the merchant involved in the dispute.
     */
    public void setMerchantData(DisputeMerchantData value) {
        this.merchantData = value;
    }

    /**
     * Data related to the merchant involved in the dispute.
     */
    public DisputeCase withMerchantData(DisputeMerchantData value) {
        this.merchantData = value;
        return this;
    }

    /**
     * Amount for the operation.
     */
    public AmountData getOriginalDisputeAmount() {
        return originalDisputeAmount;
    }

    /**
     * Amount for the operation.
     */
    public void setOriginalDisputeAmount(AmountData value) {
        this.originalDisputeAmount = value;
    }

    /**
     * Amount for the operation.
     */
    public DisputeCase withOriginalDisputeAmount(AmountData value) {
        this.originalDisputeAmount = value;
        return this;
    }

    /**
     * Data related to the original transaction that led to the dispute.
     */
    public OriginalTransactionData getOriginalTransactionData() {
        return originalTransactionData;
    }

    /**
     * Data related to the original transaction that led to the dispute.
     */
    public void setOriginalTransactionData(OriginalTransactionData value) {
        this.originalTransactionData = value;
    }

    /**
     * Data related to the original transaction that led to the dispute.
     */
    public DisputeCase withOriginalTransactionData(OriginalTransactionData value) {
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
    public DisputeCase withSchemeReason(String value) {
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
    public DisputeCase withSchemeReasonDescription(String value) {
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
    public DisputeCase withUnifiedCategory(String value) {
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
    public DisputeCase withUnifiedReason(String value) {
        this.unifiedReason = value;
        return this;
    }
}
