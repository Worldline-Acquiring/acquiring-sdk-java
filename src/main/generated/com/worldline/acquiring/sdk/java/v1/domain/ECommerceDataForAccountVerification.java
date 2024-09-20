/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class ECommerceDataForAccountVerification {

    private AddressVerificationData addressVerificationData;

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
}
