/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.acquirer.merchant;

import java.util.Map;

import com.worldline.acquiring.sdk.java.ApiResource;
import com.worldline.acquiring.sdk.java.v1.acquirer.merchant.accountverifications.AccountVerificationsClient;
import com.worldline.acquiring.sdk.java.v1.acquirer.merchant.balanceinquiries.BalanceInquiriesClient;
import com.worldline.acquiring.sdk.java.v1.acquirer.merchant.cardpayments.CardPaymentsClient;
import com.worldline.acquiring.sdk.java.v1.acquirer.merchant.cardrefunds.CardRefundsClient;
import com.worldline.acquiring.sdk.java.v1.acquirer.merchant.dynamiccurrencyconversion.DynamicCurrencyConversionClient;
import com.worldline.acquiring.sdk.java.v1.acquirer.merchant.technicalreversals.TechnicalReversalsClient;

/**
 * Merchant client. Thread-safe.
 */
public class MerchantClient extends ApiResource {

    public MerchantClient(ApiResource parent, Map<String, String> pathContext) {
        super(parent, pathContext);
    }

    /**
     * Resource /processing/v1/{acquirerId}/{merchantId}/payments
     *
     * @return CardPaymentsClient
     */
    public CardPaymentsClient cardPayments() {
        return new CardPaymentsClient(this, null);
    }

    /**
     * Resource /processing/v1/{acquirerId}/{merchantId}/refunds
     *
     * @return CardRefundsClient
     */
    public CardRefundsClient cardRefunds() {
        return new CardRefundsClient(this, null);
    }

    /**
     * Resource /processing/v1/{acquirerId}/{merchantId}/account-verifications
     *
     * @return AccountVerificationsClient
     */
    public AccountVerificationsClient accountVerifications() {
        return new AccountVerificationsClient(this, null);
    }

    /**
     * Resource /processing/v1/{acquirerId}/{merchantId}/balance-inquiries
     *
     * @return BalanceInquiriesClient
     */
    public BalanceInquiriesClient balanceInquiries() {
        return new BalanceInquiriesClient(this, null);
    }

    /**
     * Resource /processing/v1/{acquirerId}/{merchantId}/operations/{operationId}/reverse
     *
     * @return TechnicalReversalsClient
     */
    public TechnicalReversalsClient technicalReversals() {
        return new TechnicalReversalsClient(this, null);
    }

    /**
     * Resource /services/v1/{acquirerId}/{merchantId}/dcc-rates
     *
     * @return DynamicCurrencyConversionClient
     */
    public DynamicCurrencyConversionClient dynamicCurrencyConversion() {
        return new DynamicCurrencyConversionClient(this, null);
    }
}
