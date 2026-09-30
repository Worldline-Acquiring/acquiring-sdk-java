/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class DateTimeRange {

    private String greater;

    private String greaterEqual;

    private String lower;

    private String lowerEqual;

    /**
     * A date-time value that can be used in search criteria to filter results to only include items
     * with a date-time greater to the specified value (after). The date-time is in ISO 8601 format, but
     * without the timezone designator.
     */
    public String getGreater() {
        return greater;
    }

    /**
     * A date-time value that can be used in search criteria to filter results to only include items
     * with a date-time greater to the specified value (after). The date-time is in ISO 8601 format, but
     * without the timezone designator.
     */
    public void setGreater(String value) {
        this.greater = value;
    }

    /**
     * A date-time value that can be used in search criteria to filter results to only include items
     * with a date-time greater to the specified value (after). The date-time is in ISO 8601 format, but
     * without the timezone designator.
     */
    public DateTimeRange withGreater(String value) {
        this.greater = value;
        return this;
    }

    /**
     * A date-time value that can be used in search criteria to filter results to only include items
     * with a date-time greater than or equal to the specified value (equal or after). The date-time is in ISO 8601 format, but
     * without the timezone designator.
     */
    public String getGreaterEqual() {
        return greaterEqual;
    }

    /**
     * A date-time value that can be used in search criteria to filter results to only include items
     * with a date-time greater than or equal to the specified value (equal or after). The date-time is in ISO 8601 format, but
     * without the timezone designator.
     */
    public void setGreaterEqual(String value) {
        this.greaterEqual = value;
    }

    /**
     * A date-time value that can be used in search criteria to filter results to only include items
     * with a date-time greater than or equal to the specified value (equal or after). The date-time is in ISO 8601 format, but
     * without the timezone designator.
     */
    public DateTimeRange withGreaterEqual(String value) {
        this.greaterEqual = value;
        return this;
    }

    /**
     * A date-time value that can be used in search criteria to filter results to only include items
     * with a date-time lower to the specified value (before). The date-time is in ISO 8601 format, but
     * without the timezone designator.
     */
    public String getLower() {
        return lower;
    }

    /**
     * A date-time value that can be used in search criteria to filter results to only include items
     * with a date-time lower to the specified value (before). The date-time is in ISO 8601 format, but
     * without the timezone designator.
     */
    public void setLower(String value) {
        this.lower = value;
    }

    /**
     * A date-time value that can be used in search criteria to filter results to only include items
     * with a date-time lower to the specified value (before). The date-time is in ISO 8601 format, but
     * without the timezone designator.
     */
    public DateTimeRange withLower(String value) {
        this.lower = value;
        return this;
    }

    /**
     * A date-time value that can be used in search criteria to filter results to only include items
     * with a date-time lower than or equal to the specified value (equal or before). The date-time is in ISO 8601 format, but
     * without the timezone designator.
     */
    public String getLowerEqual() {
        return lowerEqual;
    }

    /**
     * A date-time value that can be used in search criteria to filter results to only include items
     * with a date-time lower than or equal to the specified value (equal or before). The date-time is in ISO 8601 format, but
     * without the timezone designator.
     */
    public void setLowerEqual(String value) {
        this.lowerEqual = value;
    }

    /**
     * A date-time value that can be used in search criteria to filter results to only include items
     * with a date-time lower than or equal to the specified value (equal or before). The date-time is in ISO 8601 format, but
     * without the timezone designator.
     */
    public DateTimeRange withLowerEqual(String value) {
        this.lowerEqual = value;
        return this;
    }
}
