/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class CustomerServiceData {

    private String customerServiceEmail;

    private String customerServicePhoneNumber;

    private String customerServiceUrl;

    /**
     * Submerchant's customer service email address.
     * Applicable only for Amex transactions but this field could be set for other
     * scheme transactions too.
     * Mandatory for all card not present transactions processed through Bambora.
     */
    public String getCustomerServiceEmail() {
        return customerServiceEmail;
    }

    /**
     * Submerchant's customer service email address.
     * Applicable only for Amex transactions but this field could be set for other
     * scheme transactions too.
     * Mandatory for all card not present transactions processed through Bambora.
     */
    public void setCustomerServiceEmail(String value) {
        this.customerServiceEmail = value;
    }

    /**
     * Submerchant's customer service email address.
     * Applicable only for Amex transactions but this field could be set for other
     * scheme transactions too.
     * Mandatory for all card not present transactions processed through Bambora.
     */
    public CustomerServiceData withCustomerServiceEmail(String value) {
        this.customerServiceEmail = value;
        return this;
    }

    /**
     * Submerchant's customer service phone number that can be used for transaction inquiries.
     * Applicable for MasterCard transactions but this field could be set for other
     * scheme transactions too.
     * Optional for all card not present transactions. Either {@code CustomerServiceUrl} or
     * {@code CustomerServicePhoneNumber} is mandatory for card present transactions.
     */
    public String getCustomerServicePhoneNumber() {
        return customerServicePhoneNumber;
    }

    /**
     * Submerchant's customer service phone number that can be used for transaction inquiries.
     * Applicable for MasterCard transactions but this field could be set for other
     * scheme transactions too.
     * Optional for all card not present transactions. Either {@code CustomerServiceUrl} or
     * {@code CustomerServicePhoneNumber} is mandatory for card present transactions.
     */
    public void setCustomerServicePhoneNumber(String value) {
        this.customerServicePhoneNumber = value;
    }

    /**
     * Submerchant's customer service phone number that can be used for transaction inquiries.
     * Applicable for MasterCard transactions but this field could be set for other
     * scheme transactions too.
     * Optional for all card not present transactions. Either {@code CustomerServiceUrl} or
     * {@code CustomerServicePhoneNumber} is mandatory for card present transactions.
     */
    public CustomerServiceData withCustomerServicePhoneNumber(String value) {
        this.customerServicePhoneNumber = value;
        return this;
    }

    /**
     * Submerchant's customer service portal URL
     * Applicable for MasterCard transactions but this field could be set for other
     * scheme transactions too.
     * Mandatory for all card not present transactions processed through Bambora.
     * Either {@code CustomerServiceUrl} or {@code CustomerServicePhoneNumber} is mandatory for card
     * present transactions.
     */
    public String getCustomerServiceUrl() {
        return customerServiceUrl;
    }

    /**
     * Submerchant's customer service portal URL
     * Applicable for MasterCard transactions but this field could be set for other
     * scheme transactions too.
     * Mandatory for all card not present transactions processed through Bambora.
     * Either {@code CustomerServiceUrl} or {@code CustomerServicePhoneNumber} is mandatory for card
     * present transactions.
     */
    public void setCustomerServiceUrl(String value) {
        this.customerServiceUrl = value;
    }

    /**
     * Submerchant's customer service portal URL
     * Applicable for MasterCard transactions but this field could be set for other
     * scheme transactions too.
     * Mandatory for all card not present transactions processed through Bambora.
     * Either {@code CustomerServiceUrl} or {@code CustomerServicePhoneNumber} is mandatory for card
     * present transactions.
     */
    public CustomerServiceData withCustomerServiceUrl(String value) {
        this.customerServiceUrl = value;
        return this;
    }
}
