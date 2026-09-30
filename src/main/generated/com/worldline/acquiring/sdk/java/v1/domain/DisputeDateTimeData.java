/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

import java.time.LocalDate;

public class DisputeDateTimeData {

    private String closedDateTime;

    private String lastStatusChangedDateTime;

    private String openedDateTime;

    private LocalDate responseDueDate;

    /**
     * The date and time when the dispute was closed, in ISO 8601 format, but without the timezone designator.
     * Only present if the dispute is closed.
     */
    public String getClosedDateTime() {
        return closedDateTime;
    }

    /**
     * The date and time when the dispute was closed, in ISO 8601 format, but without the timezone designator.
     * Only present if the dispute is closed.
     */
    public void setClosedDateTime(String value) {
        this.closedDateTime = value;
    }

    /**
     * The date and time when the dispute was closed, in ISO 8601 format, but without the timezone designator.
     * Only present if the dispute is closed.
     */
    public DisputeDateTimeData withClosedDateTime(String value) {
        this.closedDateTime = value;
        return this;
    }

    /**
     * The date and time when the status of the dispute was last updated, in ISO 8601 format, but without the timezone designator.
     * When the dispute case is first created the value will be equal to the {@code OpenedDateTime} property.
     * As dispute process continues, this value changes.
     */
    public String getLastStatusChangedDateTime() {
        return lastStatusChangedDateTime;
    }

    /**
     * The date and time when the status of the dispute was last updated, in ISO 8601 format, but without the timezone designator.
     * When the dispute case is first created the value will be equal to the {@code OpenedDateTime} property.
     * As dispute process continues, this value changes.
     */
    public void setLastStatusChangedDateTime(String value) {
        this.lastStatusChangedDateTime = value;
    }

    /**
     * The date and time when the status of the dispute was last updated, in ISO 8601 format, but without the timezone designator.
     * When the dispute case is first created the value will be equal to the {@code OpenedDateTime} property.
     * As dispute process continues, this value changes.
     */
    public DisputeDateTimeData withLastStatusChangedDateTime(String value) {
        this.lastStatusChangedDateTime = value;
        return this;
    }

    /**
     * The date and time when the dispute was opened, in ISO 8601 format, but without the timezone designator.
     */
    public String getOpenedDateTime() {
        return openedDateTime;
    }

    /**
     * The date and time when the dispute was opened, in ISO 8601 format, but without the timezone designator.
     */
    public void setOpenedDateTime(String value) {
        this.openedDateTime = value;
    }

    /**
     * The date and time when the dispute was opened, in ISO 8601 format, but without the timezone designator.
     */
    public DisputeDateTimeData withOpenedDateTime(String value) {
        this.openedDateTime = value;
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
    public DisputeDateTimeData withResponseDueDate(LocalDate value) {
        this.responseDueDate = value;
        return this;
    }
}
