/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

import java.time.LocalDate;
import java.util.List;

public class DisputeEntry {

    private List<DisputeDocument> documents;

    private String elaboration;

    private String entryCategory;

    private String entryDateTime;

    private String entryId;

    private String entryType;

    private String entryTypeDescription;

    private String messageText;

    private String questionnaire;

    private LocalDate responseDueDate;

    private String schemeReason;

    private String schemeReasonDescription;

    private AmountData settlementAmount;

    private AmountData transactionAmount;

    private String userId;

    /**
     * A list of documents related to the history entry.
     */
    public List<DisputeDocument> getDocuments() {
        return documents;
    }

    /**
     * A list of documents related to the history entry.
     */
    public void setDocuments(List<DisputeDocument> value) {
        this.documents = value;
    }

    /**
     * A list of documents related to the history entry.
     */
    public DisputeEntry withDocuments(List<DisputeDocument> value) {
        this.documents = value;
        return this;
    }

    /**
     * The long message text of the dispute entry, if applicable. This is typically used for communication entries
     * to provide the content of the message sent by the acquirer to the merchant or vice versa.
     * This field can contain a more detailed message than the {@code messageText} property.
     */
    public String getElaboration() {
        return elaboration;
    }

    /**
     * The long message text of the dispute entry, if applicable. This is typically used for communication entries
     * to provide the content of the message sent by the acquirer to the merchant or vice versa.
     * This field can contain a more detailed message than the {@code messageText} property.
     */
    public void setElaboration(String value) {
        this.elaboration = value;
    }

    /**
     * The long message text of the dispute entry, if applicable. This is typically used for communication entries
     * to provide the content of the message sent by the acquirer to the merchant or vice versa.
     * This field can contain a more detailed message than the {@code messageText} property.
     */
    public DisputeEntry withElaboration(String value) {
        this.elaboration = value;
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
    public String getEntryCategory() {
        return entryCategory;
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
    public void setEntryCategory(String value) {
        this.entryCategory = value;
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
    public DisputeEntry withEntryCategory(String value) {
        this.entryCategory = value;
        return this;
    }

    /**
     * The date and time when the dispute entry was made, in ISO 8601 format, but without the timezone designator.
     */
    public String getEntryDateTime() {
        return entryDateTime;
    }

    /**
     * The date and time when the dispute entry was made, in ISO 8601 format, but without the timezone designator.
     */
    public void setEntryDateTime(String value) {
        this.entryDateTime = value;
    }

    /**
     * The date and time when the dispute entry was made, in ISO 8601 format, but without the timezone designator.
     */
    public DisputeEntry withEntryDateTime(String value) {
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
    public DisputeEntry withEntryId(String value) {
        this.entryId = value;
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
    public String getEntryType() {
        return entryType;
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
    public void setEntryType(String value) {
        this.entryType = value;
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
    public DisputeEntry withEntryType(String value) {
        this.entryType = value;
        return this;
    }

    /**
     * The human readable description of the {@code EntryType} field.
     */
    public String getEntryTypeDescription() {
        return entryTypeDescription;
    }

    /**
     * The human readable description of the {@code EntryType} field.
     */
    public void setEntryTypeDescription(String value) {
        this.entryTypeDescription = value;
    }

    /**
     * The human readable description of the {@code EntryType} field.
     */
    public DisputeEntry withEntryTypeDescription(String value) {
        this.entryTypeDescription = value;
        return this;
    }

    /**
     * The message text of the dispute entry, if applicable. This is typically used for communication entries
     * to provide the content of the message sent by the acquirer to the merchant or vice versa.
     */
    public String getMessageText() {
        return messageText;
    }

    /**
     * The message text of the dispute entry, if applicable. This is typically used for communication entries
     * to provide the content of the message sent by the acquirer to the merchant or vice versa.
     */
    public void setMessageText(String value) {
        this.messageText = value;
    }

    /**
     * The message text of the dispute entry, if applicable. This is typically used for communication entries
     * to provide the content of the message sent by the acquirer to the merchant or vice versa.
     */
    public DisputeEntry withMessageText(String value) {
        this.messageText = value;
        return this;
    }

    /**
     * The questionnaire provided by the card scheme for the dispute, if applicable. This is typically used for communication entries
     * to provide the content of the questionnaire sent by the acquirer to the merchant in case the card scheme requires a specific
     * set of questions to be answered by the merchant in order to provide evidence for the dispute case.
     */
    public String getQuestionnaire() {
        return questionnaire;
    }

    /**
     * The questionnaire provided by the card scheme for the dispute, if applicable. This is typically used for communication entries
     * to provide the content of the questionnaire sent by the acquirer to the merchant in case the card scheme requires a specific
     * set of questions to be answered by the merchant in order to provide evidence for the dispute case.
     */
    public void setQuestionnaire(String value) {
        this.questionnaire = value;
    }

    /**
     * The questionnaire provided by the card scheme for the dispute, if applicable. This is typically used for communication entries
     * to provide the content of the questionnaire sent by the acquirer to the merchant in case the card scheme requires a specific
     * set of questions to be answered by the merchant in order to provide evidence for the dispute case.
     */
    public DisputeEntry withQuestionnaire(String value) {
        this.questionnaire = value;
        return this;
    }

    /**
     * The date when a response to the dispute is due.
     * This field is typically relevant when the {@code disputeStatus} is &quot;EVIDENCE_REQUESTED&quot;, to indicate the deadline to respond
     * to the dispute.
     */
    public LocalDate getResponseDueDate() {
        return responseDueDate;
    }

    /**
     * The date when a response to the dispute is due.
     * This field is typically relevant when the {@code disputeStatus} is &quot;EVIDENCE_REQUESTED&quot;, to indicate the deadline to respond
     * to the dispute.
     */
    public void setResponseDueDate(LocalDate value) {
        this.responseDueDate = value;
    }

    /**
     * The date when a response to the dispute is due.
     * This field is typically relevant when the {@code disputeStatus} is &quot;EVIDENCE_REQUESTED&quot;, to indicate the deadline to respond
     * to the dispute.
     */
    public DisputeEntry withResponseDueDate(LocalDate value) {
        this.responseDueDate = value;
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
    public DisputeEntry withSchemeReason(String value) {
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
    public DisputeEntry withSchemeReasonDescription(String value) {
        this.schemeReasonDescription = value;
        return this;
    }

    /**
     * Amount for the operation.
     */
    public AmountData getSettlementAmount() {
        return settlementAmount;
    }

    /**
     * Amount for the operation.
     */
    public void setSettlementAmount(AmountData value) {
        this.settlementAmount = value;
    }

    /**
     * Amount for the operation.
     */
    public DisputeEntry withSettlementAmount(AmountData value) {
        this.settlementAmount = value;
        return this;
    }

    /**
     * Amount for the operation.
     */
    public AmountData getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Amount for the operation.
     */
    public void setTransactionAmount(AmountData value) {
        this.transactionAmount = value;
    }

    /**
     * Amount for the operation.
     */
    public DisputeEntry withTransactionAmount(AmountData value) {
        this.transactionAmount = value;
        return this;
    }

    /**
     * The unique identifier of the user that triggered the dispute entry, if applicable.
     */
    public String getUserId() {
        return userId;
    }

    /**
     * The unique identifier of the user that triggered the dispute entry, if applicable.
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * The unique identifier of the user that triggered the dispute entry, if applicable.
     */
    public DisputeEntry withUserId(String value) {
        this.userId = value;
        return this;
    }
}
