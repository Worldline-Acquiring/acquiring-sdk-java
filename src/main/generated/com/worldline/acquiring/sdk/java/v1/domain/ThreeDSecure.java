/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class ThreeDSecure {

    private String authenticationValue;

    private String directoryServerTransactionId;

    private String eci;

    private String threeDSecureType;

    private String version;

    /**
     * MasterCard AAV in original base64 encoding or Visa, DinersClub,
     * UnionPay or JCB CAVV in either hexadecimal or base64 encoding
     */
    public String getAuthenticationValue() {
        return authenticationValue;
    }

    /**
     * MasterCard AAV in original base64 encoding or Visa, DinersClub,
     * UnionPay or JCB CAVV in either hexadecimal or base64 encoding
     */
    public void setAuthenticationValue(String value) {
        this.authenticationValue = value;
    }

    /**
     * MasterCard AAV in original base64 encoding or Visa, DinersClub,
     * UnionPay or JCB CAVV in either hexadecimal or base64 encoding
     */
    public ThreeDSecure withAuthenticationValue(String value) {
        this.authenticationValue = value;
        return this;
    }

    /**
     * 3D Secure 2.x directory server transaction ID
     */
    public String getDirectoryServerTransactionId() {
        return directoryServerTransactionId;
    }

    /**
     * 3D Secure 2.x directory server transaction ID
     */
    public void setDirectoryServerTransactionId(String value) {
        this.directoryServerTransactionId = value;
    }

    /**
     * 3D Secure 2.x directory server transaction ID
     */
    public ThreeDSecure withDirectoryServerTransactionId(String value) {
        this.directoryServerTransactionId = value;
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
    public ThreeDSecure withEci(String value) {
        this.eci = value;
        return this;
    }

    /**
     * 3D Secure type used in the transaction
     */
    public String getThreeDSecureType() {
        return threeDSecureType;
    }

    /**
     * 3D Secure type used in the transaction
     */
    public void setThreeDSecureType(String value) {
        this.threeDSecureType = value;
    }

    /**
     * 3D Secure type used in the transaction
     */
    public ThreeDSecure withThreeDSecureType(String value) {
        this.threeDSecureType = value;
        return this;
    }

    /**
     * 3D Secure version
     */
    public String getVersion() {
        return version;
    }

    /**
     * 3D Secure version
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * 3D Secure version
     */
    public ThreeDSecure withVersion(String value) {
        this.version = value;
        return this;
    }
}
