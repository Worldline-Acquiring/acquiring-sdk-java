/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class NetworkTokenData {

    private String cryptogram;

    private String eci;

    /**
     * Network token cryptogram
     */
    public String getCryptogram() {
        return cryptogram;
    }

    /**
     * Network token cryptogram
     */
    public void setCryptogram(String value) {
        this.cryptogram = value;
    }

    /**
     * Network token cryptogram
     */
    public NetworkTokenData withCryptogram(String value) {
        this.cryptogram = value;
        return this;
    }

    /**
     * Electronic Commerce Indicator<br>
     * Value that indicates the level of authentication.<br>
     * Contains different values depending on the brand.
     */
    public String getEci() {
        return eci;
    }

    /**
     * Electronic Commerce Indicator<br>
     * Value that indicates the level of authentication.<br>
     * Contains different values depending on the brand.
     */
    public void setEci(String value) {
        this.eci = value;
    }

    /**
     * Electronic Commerce Indicator<br>
     * Value that indicates the level of authentication.<br>
     * Contains different values depending on the brand.
     */
    public NetworkTokenData withEci(String value) {
        this.eci = value;
        return this;
    }
}
