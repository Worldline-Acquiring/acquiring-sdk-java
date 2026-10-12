/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class PaymentReferences {

    private String dynamicDescriptor;

    private String merchantReference;

    /**
     * Custom text provided by the merchant that is shown to the customer on
     * their account statement, next to or instead of the registered merchant
     * name. Support and maximum length depend on the payment method.
     * <p>
     * Note that there are restrictions on length and allowed characters that differ
     * depending on the brand and scheme. If this string is too long it's usually
     * truncated.
     */
    public String getDynamicDescriptor() {
        return dynamicDescriptor;
    }

    /**
     * Custom text provided by the merchant that is shown to the customer on
     * their account statement, next to or instead of the registered merchant
     * name. Support and maximum length depend on the payment method.
     * <p>
     * Note that there are restrictions on length and allowed characters that differ
     * depending on the brand and scheme. If this string is too long it's usually
     * truncated.
     */
    public void setDynamicDescriptor(String value) {
        this.dynamicDescriptor = value;
    }

    /**
     * Custom text provided by the merchant that is shown to the customer on
     * their account statement, next to or instead of the registered merchant
     * name. Support and maximum length depend on the payment method.
     * <p>
     * Note that there are restrictions on length and allowed characters that differ
     * depending on the brand and scheme. If this string is too long it's usually
     * truncated.
     */
    public PaymentReferences withDynamicDescriptor(String value) {
        this.dynamicDescriptor = value;
        return this;
    }

    /**
     * Custom text provided by the merchant that appears on their own settlement
     * reports and on the reimbursement notices from the acquirer.
     * <p>
     * It allows the merchant to reconcile their payments in our report files
     * and in their disputes.
     * <p>
     * It is advised to submit a unique value per transaction.<br>
     * The value is returned in the baseTrxType/addlMercData element of the MRX file.
     */
    public String getMerchantReference() {
        return merchantReference;
    }

    /**
     * Custom text provided by the merchant that appears on their own settlement
     * reports and on the reimbursement notices from the acquirer.
     * <p>
     * It allows the merchant to reconcile their payments in our report files
     * and in their disputes.
     * <p>
     * It is advised to submit a unique value per transaction.<br>
     * The value is returned in the baseTrxType/addlMercData element of the MRX file.
     */
    public void setMerchantReference(String value) {
        this.merchantReference = value;
    }

    /**
     * Custom text provided by the merchant that appears on their own settlement
     * reports and on the reimbursement notices from the acquirer.
     * <p>
     * It allows the merchant to reconcile their payments in our report files
     * and in their disputes.
     * <p>
     * It is advised to submit a unique value per transaction.<br>
     * The value is returned in the baseTrxType/addlMercData element of the MRX file.
     */
    public PaymentReferences withMerchantReference(String value) {
        this.merchantReference = value;
        return this;
    }
}
