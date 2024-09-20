package com.worldline.acquiring.sdk.java.it;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;

import com.worldline.acquiring.sdk.java.Client;
import com.worldline.acquiring.sdk.java.v1.domain.GetDCCRateRequest;
import com.worldline.acquiring.sdk.java.v1.domain.GetDccRateResponse;

class ConnectionReuseTest extends ItTest {

    /**
     * Smoke test with connection reuse turned on (default).
     */
    @Test
    void testWithConnectionReuse() throws URISyntaxException, IOException {
        try (Client client = getClient()) {
            test(client);
        }
    }

    /**
     * Smoke test with connection reuse turned off.
     */
    @Test
    void testWithoutConnectionReuse() throws URISyntaxException, IOException {
        try (Client client = getClientWithoutConnectionReuse()) {
            test(client);
        }
    }

    private void test(Client client) {
        GetDCCRateRequest body = getDCCRateRequest();

        GetDccRateResponse response = client
                .v1()
                .acquirer(getAcquirerId())
                .merchant(getMerchantId())
                .dynamicCurrencyConversion()
                .requestDccRate(body);

        assertDccRateResponse(body, response);

        response = client
                .v1()
                .acquirer(getAcquirerId())
                .merchant(getMerchantId())
                .dynamicCurrencyConversion()
                .requestDccRate(body);

        assertDccRateResponse(body, response);
    }
}
