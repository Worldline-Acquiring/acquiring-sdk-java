/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

import java.time.LocalDate;
import java.util.List;

public class DisputeEntryWithDisputeSummary extends DisputeEntry {

    private String disputeId;

    private DisputeSummary disputeSummary;

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
    public DisputeEntryWithDisputeSummary withDisputeId(String value) {
        this.disputeId = value;
        return this;
    }

    /**
     * A summary of the dispute case, returned in the search results when searching for dispute<br>
     * entries. This is only returned when explicitly requested via the {@code includeDisputeSummary} property is set to {@code true}
     * in the request.
     */
    public DisputeSummary getDisputeSummary() {
        return disputeSummary;
    }

    /**
     * A summary of the dispute case, returned in the search results when searching for dispute<br>
     * entries. This is only returned when explicitly requested via the {@code includeDisputeSummary} property is set to {@code true}
     * in the request.
     */
    public void setDisputeSummary(DisputeSummary value) {
        this.disputeSummary = value;
    }

    /**
     * A summary of the dispute case, returned in the search results when searching for dispute<br>
     * entries. This is only returned when explicitly requested via the {@code includeDisputeSummary} property is set to {@code true}
     * in the request.
     */
    public DisputeEntryWithDisputeSummary withDisputeSummary(DisputeSummary value) {
        this.disputeSummary = value;
        return this;
    }

    /**
     * A list of documents related to the history entry.
     */
    @Override
    public DisputeEntryWithDisputeSummary withDocuments(List<DisputeDocument> value) {
        super.withDocuments(value);
        return this;
    }

    /**
     * The long message text of the dispute entry, if applicable. This is typically used for communication entries
     * to provide the content of the message sent by the acquirer to the merchant or vice versa.
     * This field can contain a more detailed message than the {@code messageText} property.
     */
    @Override
    public DisputeEntryWithDisputeSummary withElaboration(String value) {
        super.withElaboration(value);
        return this;
    }

    /**
     * The category of the dispute entry.
     * <p>
     * Possible values are:
     * <ul>
     *   <li>{@code DISPUTE} (Transaction which drives the scheme dispute processing flow)</li>
     *   <li>{@code COMMUNICATION} (Conversational and informational messages which are exchanged in the communication between Acquirer and Merchant)</li>
     *   <li>{@code EVIDENCE} (Merchant response to Acquirer Evidence Request (including liability acceptance))</li>
     *   <li>{@code POSTING} (Notification about upcoming Merchant account adjustments, executed by the Acquirer)</li>
     * </ul>
     */
    @Override
    public DisputeEntryWithDisputeSummary withEntryCategory(String value) {
        super.withEntryCategory(value);
        return this;
    }

    /**
     * The date and time when the dispute entry was made, in ISO 8601 format, but without the timezone designator.
     */
    @Override
    public DisputeEntryWithDisputeSummary withEntryDateTime(String value) {
        super.withEntryDateTime(value);
        return this;
    }

    /**
     * The unique identifier for an dispute entry.
     */
    @Override
    public DisputeEntryWithDisputeSummary withEntryId(String value) {
        super.withEntryId(value);
        return this;
    }

    /**
     * The type of the dispute entry. The values for this field depend on the value of the {@code EntryCategory} field.
     * <p>
     * Possible values are:
     * <ul>
     *   <li>For DISPUTE entry Category:
     *     <ul>
     *       <li>{@code Iss-Dsp} (Issuer dispute (full/partial))</li>
     *       <li>{@code Iss-DspRev} (Issuer reversed dispute)</li>
     *       <li>{@code Iss-ArbDsp} (Issuer Arbitration dispute (full/partial))</li>
     *       <li>{@code Iss-PArb} (Issuer Pre-Arbitration (full/partial))</li>
     *       <li>{@code Iss-PComp} (Issuer Pre-Compliance)</li>
     *       <li>{@code Iss-Arb} (Issuer Arbitration)</li>
     *       <li>'Iss-Comp' (Issuer Compliance)</li>
     *       <li>{@code Acq-PArb} (Acquirer Pre-Arbitration (full/partial))</li>
     *       <li>{@code Acq-PComp} (Acquirer Pre-Compliance)</li>
     *       <li>{@code Acq-Arb} (Acquirer Arbitration)</li>
     *       <li>{@code Acq-Comp} (Acquirer Compliance)</li>
     *       <li>{@code Acq-DspDecline} (Acquirer Declines Dispute (full/partial))</li>
     *       <li>{@code Acq-ArbDspDecline} (Acquirer Declines Arbitration Dispute (full/partial))</li>
     *       <li>{@code Acq-PArbDecline} (Acquirer Declines Pre-Arbitration (full/partial))</li>
     *       <li>{@code Acq-PCompDecline} (Acquirer Declines Pre-Compliance (full/partial))</li>
     *       <li>{@code Iss-PArbDecline} (Issuer Declines Pre-Arbitration (full/partial))</li>
     *       <li>{@code Iss-PCompDecline} (Issuer Declines Pre-Compliance (full/partial))</li>
     *       <li>{@code Acq-MchLost} (Dispute case is lost, Liability on Acquirer)</li>
     *       <li>{@code Acq-MchWon} (Dispute case is won, Liability on Issuer)</li>
     *     </ul>
     *   </li>
     *   <li>For COMMUNICATION entryCategory:
     *     <ul>
     *       <li>{@code Acq-MsgToMch} (Acquirer sent a message to the Merchant)</li>
     *       <li>{@code Mch-MsgToAcq} (Merchant sent a message to the Acquirer)</li>
     *     </ul>
     *   </li>
     *   <li>For EVIDENCE entryCategory:
     *     <ul>
     *       <li>{@code Acq-EvidenceReq} (Acquirer request evidence from Merchant)</li>
     *       <li>{@code Acq-EvidenceRej} (Acquirer reject the evidence submitted by the Merchant)</li>
     *       <li>{@code Mch-Evidence} (Merchant submitted evidence)</li>
     *       <li>{@code Mch-Accept} (Merchant accepted liability)</li>
     *     </ul>
     *   </li>
     *   <li>For POSTING entryCategory:
     *     <ul>
     *       <li>{@code Acq-CreditAdj} (Acquirer credited the Merchant)</li>
     *       <li>{@code Acq-DebitAdj} (Acquirer debited the Merchant)</li>
     *     </ul>
     *   </li>
     * </ul>
     */
    @Override
    public DisputeEntryWithDisputeSummary withEntryType(String value) {
        super.withEntryType(value);
        return this;
    }

    /**
     * The human readable description of the {@code EntryType} field.
     */
    @Override
    public DisputeEntryWithDisputeSummary withEntryTypeDescription(String value) {
        super.withEntryTypeDescription(value);
        return this;
    }

    /**
     * The message text of the dispute entry, if applicable. This is typically used for communication entries
     * to provide the content of the message sent by the acquirer to the merchant or vice versa.
     */
    @Override
    public DisputeEntryWithDisputeSummary withMessageText(String value) {
        super.withMessageText(value);
        return this;
    }

    /**
     * The questionnaire provided by the card scheme for the dispute, if applicable. This is typically used for communication entries
     * to provide the content of the questionnaire sent by the acquirer to the merchant in case the card scheme requires a specific
     * set of questions to be answered by the merchant in order to provide evidence for the dispute case.
     */
    @Override
    public DisputeEntryWithDisputeSummary withQuestionnaire(String value) {
        super.withQuestionnaire(value);
        return this;
    }

    /**
     * The date when a response to the dispute is due.
     * This field is typically relevant when the {@code disputeStatus} is &quot;EVIDENCE_REQUESTED&quot;, to indicate the deadline to respond
     * to the dispute.
     */
    @Override
    public DisputeEntryWithDisputeSummary withResponseDueDate(LocalDate value) {
        super.withResponseDueDate(value);
        return this;
    }

    /**
     * The reason provided by the card scheme for the dispute.
     */
    @Override
    public DisputeEntryWithDisputeSummary withSchemeReason(String value) {
        super.withSchemeReason(value);
        return this;
    }

    /**
     * The human readable description of the reason provided by the card scheme for the dispute.
     */
    @Override
    public DisputeEntryWithDisputeSummary withSchemeReasonDescription(String value) {
        super.withSchemeReasonDescription(value);
        return this;
    }

    /**
     * Amount for the operation.
     */
    @Override
    public DisputeEntryWithDisputeSummary withSettlementAmount(AmountData value) {
        super.withSettlementAmount(value);
        return this;
    }

    /**
     * Amount for the operation.
     */
    @Override
    public DisputeEntryWithDisputeSummary withTransactionAmount(AmountData value) {
        super.withTransactionAmount(value);
        return this;
    }

    /**
     * The unique identifier of the user that triggered the dispute entry, if applicable.
     */
    @Override
    public DisputeEntryWithDisputeSummary withUserId(String value) {
        super.withUserId(value);
        return this;
    }
}
