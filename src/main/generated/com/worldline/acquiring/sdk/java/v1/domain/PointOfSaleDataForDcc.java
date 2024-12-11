/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class PointOfSaleDataForDcc {

    private String terminalCountryCode;

    private String terminalId;

    /**
     * ISO 3166 Country code of the terminal
     */
    public String getTerminalCountryCode() {
        return terminalCountryCode;
    }

    /**
     * ISO 3166 Country code of the terminal
     */
    public void setTerminalCountryCode(String value) {
        this.terminalCountryCode = value;
    }

    /**
     * ISO 3166 Country code of the terminal
     */
    public PointOfSaleDataForDcc withTerminalCountryCode(String value) {
        this.terminalCountryCode = value;
        return this;
    }

    /**
     * The terminal ID
     */
    public String getTerminalId() {
        return terminalId;
    }

    /**
     * The terminal ID
     */
    public void setTerminalId(String value) {
        this.terminalId = value;
    }

    /**
     * The terminal ID
     */
    public PointOfSaleDataForDcc withTerminalId(String value) {
        this.terminalId = value;
        return this;
    }
}
