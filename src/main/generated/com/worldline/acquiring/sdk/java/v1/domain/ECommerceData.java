/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class ECommerceData {

    private AddressVerificationData addressVerificationData;

    private String scaExemptionRequest;

    private ThreeDSecure threeDSecure;

    /**
     * Address Verification System data
     */
    public AddressVerificationData getAddressVerificationData() {
        return addressVerificationData;
    }

    /**
     * Address Verification System data
     */
    public void setAddressVerificationData(AddressVerificationData value) {
        this.addressVerificationData = value;
    }

    /**
     * Address Verification System data
     */
    public ECommerceData withAddressVerificationData(AddressVerificationData value) {
        this.addressVerificationData = value;
        return this;
    }

    /**
     * Strong customer authentication exemption request
     */
    public String getScaExemptionRequest() {
        return scaExemptionRequest;
    }

    /**
     * Strong customer authentication exemption request
     */
    public void setScaExemptionRequest(String value) {
        this.scaExemptionRequest = value;
    }

    /**
     * Strong customer authentication exemption request
     */
    public ECommerceData withScaExemptionRequest(String value) {
        this.scaExemptionRequest = value;
        return this;
    }

    /**
     * 3D Secure data.<br>
     * Please note that if AAV or CAVV or equivalent is
     * missing, transaction should not be flagged as 3D Secure.
     */
    public ThreeDSecure getThreeDSecure() {
        return threeDSecure;
    }

    /**
     * 3D Secure data.<br>
     * Please note that if AAV or CAVV or equivalent is
     * missing, transaction should not be flagged as 3D Secure.
     */
    public void setThreeDSecure(ThreeDSecure value) {
        this.threeDSecure = value;
    }

    /**
     * 3D Secure data.<br>
     * Please note that if AAV or CAVV or equivalent is
     * missing, transaction should not be flagged as 3D Secure.
     */
    public ECommerceData withThreeDSecure(ThreeDSecure value) {
        this.threeDSecure = value;
        return this;
    }
}
