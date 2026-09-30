/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class AcceptDisputeLiabilityRequest {

    private Boolean includeEntries;

    private String messageText;

    private String userId;

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
    public AcceptDisputeLiabilityRequest withIncludeEntries(Boolean value) {
        this.includeEntries = value;
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
    public AcceptDisputeLiabilityRequest withMessageText(String value) {
        this.messageText = value;
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
    public AcceptDisputeLiabilityRequest withUserId(String value) {
        this.userId = value;
        return this;
    }
}
