package com.worldline.acquiring.sdk.java.it;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.startsWith;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import com.worldline.acquiring.sdk.java.Client;
import com.worldline.acquiring.sdk.java.CommunicatorConfiguration;
import com.worldline.acquiring.sdk.java.Factory;
import com.worldline.acquiring.sdk.java.authentication.OAuth2Exception;
import com.worldline.acquiring.sdk.java.v1.AuthorizationException;
import com.worldline.acquiring.sdk.java.v1.acquirer.merchant.dynamiccurrencyconversion.DynamicCurrencyConversionClient;
import com.worldline.acquiring.sdk.java.v1.domain.GetDccRateRequest;
import com.worldline.acquiring.sdk.java.v1.domain.GetDccRateResponse;

class CustomOAuth2ScopesTest extends ItTest {

    @ParameterizedTest
    @ValueSource(strings = { "processing_dcc_rate", "processing_dcc_rate services_ping" })
    @NullAndEmptySource
    void testWithValidScopes(String oauth2Scopes) throws URISyntaxException, IOException {
        CommunicatorConfiguration configuration = getCommunicatorConfiguration()
                .withOAuth2Scopes(oauth2Scopes);

        try (Client client = Factory.createClient(configuration)) {
            GetDccRateRequest body = getDCCRateRequest();

            GetDccRateResponse response = client
                    .v1()
                    .acquirer(getAcquirerId())
                    .merchant(getMerchantId())
                    .dynamicCurrencyConversion()
                    .requestDccRate(body);
            assertDccRateResponse(body, response);
        }
    }

    @Test
    void testWithMissingScopes() throws URISyntaxException, IOException {
        CommunicatorConfiguration configuration = getCommunicatorConfiguration()
                .withOAuth2Scopes("services_ping");

        try (Client client = Factory.createClient(configuration)) {
            GetDccRateRequest body = getDCCRateRequest();

            DynamicCurrencyConversionClient dynamicCurrencyConversionClient = client
                    .v1()
                    .acquirer(getAcquirerId())
                    .merchant(getMerchantId())
                    .dynamicCurrencyConversion();

            assertThrows(AuthorizationException.class, () -> dynamicCurrencyConversionClient.requestDccRate(body));
        }
    }

    @Test
    void testWithInvalidScope() throws URISyntaxException, IOException {
        CommunicatorConfiguration configuration = getCommunicatorConfiguration()
                .withOAuth2Scopes("processing_dcc_rate invalid_scope");

        try (Client client = Factory.createClient(configuration)) {
            GetDccRateRequest body = getDCCRateRequest();

            DynamicCurrencyConversionClient dynamicCurrencyConversionClient = client
                    .v1()
                    .acquirer(getAcquirerId())
                    .merchant(getMerchantId())
                    .dynamicCurrencyConversion();

            OAuth2Exception exception = assertThrows(OAuth2Exception.class, () -> dynamicCurrencyConversionClient.requestDccRate(body));
            assertThat(exception.getMessage(), startsWith("There was an error while retrieving the OAuth2 access token: invalid_scope - "));
        }
    }
}
