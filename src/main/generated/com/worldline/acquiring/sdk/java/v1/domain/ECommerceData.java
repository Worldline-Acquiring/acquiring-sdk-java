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
     * Strong customer authentication exemption request. Indicates the reason why the transaction may be exempt from SCA requirements.
     * <p>
     * Possible values are:
     * <ul>
     *   <li>LOW_VALUE_PAYMENT - Transaction amount is low enough to be exempt from SCA requirements.</li>
     *   <li>SCA_DELEGATION - Strong Customer Authentication (SCA) has been performed through other means.</li>
     *   <li>SECURE_CORPORATE_PAYMENT - The transaction is a secure corporate payment, using a corporate card.</li>
     *   <li>TRANSACTION_RISK_ANALYSIS - The transaction risk has been analyzed and deemed low.</li>
     *   <li>TRUSTED_BENEFICIARY - The beneficiary is a trusted entity with established relationship.</li>
     *   <li>AUTHENTICATION_OUTAGE - The authentication service is currently unavailable.</li>
     * </ul>
     */
    public String getScaExemptionRequest() {
        return scaExemptionRequest;
    }

    /**
     * Strong customer authentication exemption request. Indicates the reason why the transaction may be exempt from SCA requirements.
     * <p>
     * Possible values are:
     * <ul>
     *   <li>LOW_VALUE_PAYMENT - Transaction amount is low enough to be exempt from SCA requirements.</li>
     *   <li>SCA_DELEGATION - Strong Customer Authentication (SCA) has been performed through other means.</li>
     *   <li>SECURE_CORPORATE_PAYMENT - The transaction is a secure corporate payment, using a corporate card.</li>
     *   <li>TRANSACTION_RISK_ANALYSIS - The transaction risk has been analyzed and deemed low.</li>
     *   <li>TRUSTED_BENEFICIARY - The beneficiary is a trusted entity with established relationship.</li>
     *   <li>AUTHENTICATION_OUTAGE - The authentication service is currently unavailable.</li>
     * </ul>
     */
    public void setScaExemptionRequest(String value) {
        this.scaExemptionRequest = value;
    }

    /**
     * Strong customer authentication exemption request. Indicates the reason why the transaction may be exempt from SCA requirements.
     * <p>
     * Possible values are:
     * <ul>
     *   <li>LOW_VALUE_PAYMENT - Transaction amount is low enough to be exempt from SCA requirements.</li>
     *   <li>SCA_DELEGATION - Strong Customer Authentication (SCA) has been performed through other means.</li>
     *   <li>SECURE_CORPORATE_PAYMENT - The transaction is a secure corporate payment, using a corporate card.</li>
     *   <li>TRANSACTION_RISK_ANALYSIS - The transaction risk has been analyzed and deemed low.</li>
     *   <li>TRUSTED_BENEFICIARY - The beneficiary is a trusted entity with established relationship.</li>
     *   <li>AUTHENTICATION_OUTAGE - The authentication service is currently unavailable.</li>
     * </ul>
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
