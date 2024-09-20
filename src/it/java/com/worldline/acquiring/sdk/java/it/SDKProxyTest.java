package com.worldline.acquiring.sdk.java.it;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;

import com.worldline.acquiring.sdk.java.Client;
import com.worldline.acquiring.sdk.java.v1.acquirer.merchant.dynamiccurrencyconversion.DynamicCurrencyConversionClient;
import com.worldline.acquiring.sdk.java.v1.domain.GetDCCRateRequest;
import com.worldline.acquiring.sdk.java.v1.domain.GetDccRateResponse;

class SDKProxyTest extends ItTest {

    /**
     * Smoke test for using a proxy configured through SDK properties.
     */
    @Test
    void test() throws URISyntaxException, IOException {
        try (Client client = getClientWithProxy()) {
            DynamicCurrencyConversionClient dynamicCurrencyConversionClient = client
                    .v1()
                    .acquirer(getAcquirerId())
                    .merchant(getMerchantId())
                    .dynamicCurrencyConversion();

            GetDCCRateRequest body = getDCCRateRequest();

            GetDccRateResponse response = dynamicCurrencyConversionClient.requestDccRate(body);

            assertDccRateResponse(body, response);
        }
    }
}
