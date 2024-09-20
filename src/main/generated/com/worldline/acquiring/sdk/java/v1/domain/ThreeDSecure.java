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
     * Electronic Commerce Indicator<br>
     * Value returned by the 3D Secure process that indicates the level of
     * authentication.<br>
     * Contains different values depending on the brand.
     */
    public String getEci() {
        return eci;
    }

    /**
     * Electronic Commerce Indicator<br>
     * Value returned by the 3D Secure process that indicates the level of
     * authentication.<br>
     * Contains different values depending on the brand.
     */
    public void setEci(String value) {
        this.eci = value;
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
}
