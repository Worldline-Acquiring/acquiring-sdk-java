/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

import java.util.List;

public class DisputeCaseWithEntries extends DisputeCase {

    private List<DisputeEntry> entries;

    /**
     * A list of entries that were done against the dispute during its lifecycle.
     */
    public List<DisputeEntry> getEntries() {
        return entries;
    }

    /**
     * A list of entries that were done against the dispute during its lifecycle.
     */
    public void setEntries(List<DisputeEntry> value) {
        this.entries = value;
    }

    /**
     * A list of entries that were done against the dispute during its lifecycle.
     */
    public DisputeCaseWithEntries withEntries(List<DisputeEntry> value) {
        this.entries = value;
        return this;
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
    @Override
    public DisputeCaseWithEntries withDisputeDateTimeData(DisputeDateTimeData value) {
        super.withDisputeDateTimeData(value);
        return this;
    }

    /**
     * The unique identifier for a dispute.
     */
    @Override
    public DisputeCaseWithEntries withDisputeId(String value) {
        super.withDisputeId(value);
        return this;
    }

    /**
     * A set of references related to the dispute case.
     */
    @Override
    public DisputeCaseWithEntries withDisputeReferences(DisputeReferences value) {
        super.withDisputeReferences(value);
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
    @Override
    public DisputeCaseWithEntries withDisputeStage(String value) {
        super.withDisputeStage(value);
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
    @Override
    public DisputeCaseWithEntries withDisputeStatus(String value) {
        super.withDisputeStatus(value);
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
    @Override
    public DisputeCaseWithEntries withDisputeStatusCategory(String value) {
        super.withDisputeStatusCategory(value);
        return this;
    }

    /**
     * Indicates whether the dispute is open or closed. An open dispute is a dispute that's still in the process
     * of being resolved, while a closed dispute is a dispute that has been resolved.
     */
    @Override
    public DisputeCaseWithEntries withIsOpen(Boolean value) {
        super.withIsOpen(value);
        return this;
    }

    /**
     * Amount with an indicator whether it's a debit or credit amount.
     */
    @Override
    public DisputeCaseWithEntries withMerchantBalanceAmount(SignedAmountData value) {
        super.withMerchantBalanceAmount(value);
        return this;
    }

    /**
     * Data related to the merchant involved in the dispute.
     */
    @Override
    public DisputeCaseWithEntries withMerchantData(DisputeMerchantData value) {
        super.withMerchantData(value);
        return this;
    }

    /**
     * Amount for the operation.
     */
    @Override
    public DisputeCaseWithEntries withOriginalDisputeAmount(AmountData value) {
        super.withOriginalDisputeAmount(value);
        return this;
    }

    /**
     * Data related to the original transaction that led to the dispute.
     */
    @Override
    public DisputeCaseWithEntries withOriginalTransactionData(OriginalTransactionData value) {
        super.withOriginalTransactionData(value);
        return this;
    }

    /**
     * The reason provided by the card scheme for the dispute.
     */
    @Override
    public DisputeCaseWithEntries withSchemeReason(String value) {
        super.withSchemeReason(value);
        return this;
    }

    /**
     * The human readable description of the reason provided by the card scheme for the dispute.
     */
    @Override
    public DisputeCaseWithEntries withSchemeReasonDescription(String value) {
        super.withSchemeReasonDescription(value);
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
    @Override
    public DisputeCaseWithEntries withUnifiedCategory(String value) {
        super.withUnifiedCategory(value);
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
    @Override
    public DisputeCaseWithEntries withUnifiedReason(String value) {
        super.withUnifiedReason(value);
        return this;
    }
}
