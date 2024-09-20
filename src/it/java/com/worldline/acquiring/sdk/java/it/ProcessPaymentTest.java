package com.worldline.acquiring.sdk.java.it;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;

import com.worldline.acquiring.sdk.java.Client;
import com.worldline.acquiring.sdk.java.v1.acquirer.merchant.payments.GetPaymentStatusParams;
import com.worldline.acquiring.sdk.java.v1.acquirer.merchant.payments.PaymentsClient;
import com.worldline.acquiring.sdk.java.v1.domain.ApiPaymentRequest;
import com.worldline.acquiring.sdk.java.v1.domain.ApiPaymentResource;
import com.worldline.acquiring.sdk.java.v1.domain.ApiPaymentResponse;

class ProcessPaymentTest extends ItTest {

    /**
     * Smoke test for process payment.
     */
    @Test
    void test() throws URISyntaxException, IOException {
        try (Client client = getClient()) {
            ApiPaymentRequest body = getProcessPaymentRequest();

            PaymentsClient paymentsClient = client
                    .v1()
                    .acquirer(getAcquirerId())
                    .merchant(getMerchantId())
                    .payments();

            ApiPaymentResponse response = paymentsClient.processPayment(body);

            assertProcessPaymentResponse(body, response);

            String paymentId = response.getPaymentId();

            GetPaymentStatusParams query = new GetPaymentStatusParams();
            query.setReturnOperations(true);

            ApiPaymentResource status = paymentsClient.getPaymentStatus(paymentId, query);

            assertPaymentStatusResponse(paymentId, status);
        }
    }
}
