/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

import java.util.List;

public class SubmitEvidenceRequest {

    private List<DisputeDocumentIdItem> documentIds;

    private String elaboration;

    private Boolean includeEntries;

    private AmountData partialAmount;

    private String userId;

    public List<DisputeDocumentIdItem> getDocumentIds() {
        return documentIds;
    }

    public void setDocumentIds(List<DisputeDocumentIdItem> value) {
        this.documentIds = value;
    }

    public SubmitEvidenceRequest withDocumentIds(List<DisputeDocumentIdItem> value) {
        this.documentIds = value;
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
    public SubmitEvidenceRequest withElaboration(String value) {
        this.elaboration = value;
        return this;
    }

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
    public SubmitEvidenceRequest withIncludeEntries(Boolean value) {
        this.includeEntries = value;
        return this;
    }

    /**
     * Optional: Challenge only a partial amount of the dispute. By providing this value, you accept
     * automatic liability for the remaining disputed amount.
     * <p>
     * Rules:
     * <ul>
     *   <li>Must be greater than 0</li>
     *   <li>Must not exceed {@code originalDisputeAmount}</li>
     *   <li>All submitted evidence will be applied only to defending this partial amount</li>
     * </ul>
     * <p>
     * Example: If dispute is EUR 100 and {@code partialAmount} is EUR 30, you're defending EUR 30 and accepting
     * liability for EUR 70.
     */
    public AmountData getPartialAmount() {
        return partialAmount;
    }

    /**
     * Optional: Challenge only a partial amount of the dispute. By providing this value, you accept
     * automatic liability for the remaining disputed amount.
     * <p>
     * Rules:
     * <ul>
     *   <li>Must be greater than 0</li>
     *   <li>Must not exceed {@code originalDisputeAmount}</li>
     *   <li>All submitted evidence will be applied only to defending this partial amount</li>
     * </ul>
     * <p>
     * Example: If dispute is EUR 100 and {@code partialAmount} is EUR 30, you're defending EUR 30 and accepting
     * liability for EUR 70.
     */
    public void setPartialAmount(AmountData value) {
        this.partialAmount = value;
    }

    /**
     * Optional: Challenge only a partial amount of the dispute. By providing this value, you accept
     * automatic liability for the remaining disputed amount.
     * <p>
     * Rules:
     * <ul>
     *   <li>Must be greater than 0</li>
     *   <li>Must not exceed {@code originalDisputeAmount}</li>
     *   <li>All submitted evidence will be applied only to defending this partial amount</li>
     * </ul>
     * <p>
     * Example: If dispute is EUR 100 and {@code partialAmount} is EUR 30, you're defending EUR 30 and accepting
     * liability for EUR 70.
     */
    public SubmitEvidenceRequest withPartialAmount(AmountData value) {
        this.partialAmount = value;
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
    public SubmitEvidenceRequest withUserId(String value) {
        this.userId = value;
        return this;
    }
}
