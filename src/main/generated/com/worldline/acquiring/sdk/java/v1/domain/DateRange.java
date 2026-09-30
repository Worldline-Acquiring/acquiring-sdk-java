/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

import java.time.LocalDate;

public class DateRange {

    private LocalDate greaterEqual;

    private LocalDate lowerEqual;

    /**
     * A date value that can be used in search criteria to filter results to only include items
     * with a date greater than or equal to the specified value (equal or after). The date is in ISO 8601 format.
     */
    public LocalDate getGreaterEqual() {
        return greaterEqual;
    }

    /**
     * A date value that can be used in search criteria to filter results to only include items
     * with a date greater than or equal to the specified value (equal or after). The date is in ISO 8601 format.
     */
    public void setGreaterEqual(LocalDate value) {
        this.greaterEqual = value;
    }

    /**
     * A date value that can be used in search criteria to filter results to only include items
     * with a date greater than or equal to the specified value (equal or after). The date is in ISO 8601 format.
     */
    public DateRange withGreaterEqual(LocalDate value) {
        this.greaterEqual = value;
        return this;
    }

    /**
     * A date value that can be used in search criteria to filter results to only include items
     * with a date lower than the specified value (equal or before). The date is in ISO 8601 format.
     */
    public LocalDate getLowerEqual() {
        return lowerEqual;
    }

    /**
     * A date value that can be used in search criteria to filter results to only include items
     * with a date lower than the specified value (equal or before). The date is in ISO 8601 format.
     */
    public void setLowerEqual(LocalDate value) {
        this.lowerEqual = value;
    }

    /**
     * A date value that can be used in search criteria to filter results to only include items
     * with a date lower than the specified value (equal or before). The date is in ISO 8601 format.
     */
    public DateRange withLowerEqual(LocalDate value) {
        this.lowerEqual = value;
        return this;
    }
}
