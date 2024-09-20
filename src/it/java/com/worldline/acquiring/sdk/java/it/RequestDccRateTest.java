package com.worldline.acquiring.sdk.java.it;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;

import com.worldline.acquiring.sdk.java.Client;
import com.worldline.acquiring.sdk.java.v1.domain.GetDCCRateRequest;
import com.worldline.acquiring.sdk.java.v1.domain.GetDccRateResponse;

class RequestDccRateTest extends ItTest {

    /**
     * Smoke test for request DCC rate.
     */
    @Test
    void test() throws URISyntaxException, IOException {
        try (Client client = getClient()) {
            GetDCCRateRequest body = getDCCRateRequest();

            GetDccRateResponse response = client
                    .v1()
                    .acquirer(getAcquirerId())
                    .merchant(getMerchantId())
                    .dynamicCurrencyConversion()
                    .requestDccRate(body);
            assertDccRateResponse(body, response);
        }
    }
}
