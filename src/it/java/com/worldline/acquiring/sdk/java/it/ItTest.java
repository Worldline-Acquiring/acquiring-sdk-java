package com.worldline.acquiring.sdk.java.it;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assumptions.assumeFalse;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.ZonedDateTime;
import java.util.UUID;

import com.worldline.acquiring.sdk.java.Client;
import com.worldline.acquiring.sdk.java.CommunicatorConfiguration;
import com.worldline.acquiring.sdk.java.Factory;
import com.worldline.acquiring.sdk.java.ProxyConfiguration;
import com.worldline.acquiring.sdk.java.v1.domain.AmountData;
import com.worldline.acquiring.sdk.java.v1.domain.ApiPaymentRequest;
import com.worldline.acquiring.sdk.java.v1.domain.ApiPaymentResource;
import com.worldline.acquiring.sdk.java.v1.domain.ApiPaymentResponse;
import com.worldline.acquiring.sdk.java.v1.domain.CardDataForDcc;
import com.worldline.acquiring.sdk.java.v1.domain.CardPaymentData;
import com.worldline.acquiring.sdk.java.v1.domain.GetDCCRateRequest;
import com.worldline.acquiring.sdk.java.v1.domain.GetDccRateResponse;
import com.worldline.acquiring.sdk.java.v1.domain.PaymentReferences;
import com.worldline.acquiring.sdk.java.v1.domain.PlainCardData;
import com.worldline.acquiring.sdk.java.v1.domain.PointOfSaleDataForDcc;
import com.worldline.acquiring.sdk.java.v1.domain.TransactionDataForDcc;

abstract class ItTest {

    private static final String PROPERTIES_URL = "/itconfiguration.properties";
    private static final String OAUTH2_CLIENT_ID;
    private static final String OAUTH2_CLIENT_SECRET;
    private static final String OAUTH2_TOKEN_URI;
    private static final String MERCHANT_ID;
    private static final String ACQUIRER_ID;

    static {
        OAUTH2_CLIENT_ID = System.getProperty("acquiring.api.oauth2.clientId");
        OAUTH2_CLIENT_SECRET = System.getProperty("acquiring.api.oauth2.clientSecret");
        OAUTH2_TOKEN_URI = System.getProperty("acquiring.api.oauth2.tokenUri");
        if (OAUTH2_CLIENT_ID == null || OAUTH2_CLIENT_SECRET == null || OAUTH2_TOKEN_URI == null) {
            throw new IllegalStateException("System properties 'acquiring.api.oauth2.clientId', 'acquiring.api.oauth2.clientSecret' and 'acquiring.api.oauth2.tokenUri' must be set");
        }
        MERCHANT_ID = System.getProperty("acquiring.api.merchantId");
        if (MERCHANT_ID == null) {
            throw new IllegalStateException("System property 'acquiring.api.merchantId' must be set");
        }
        ACQUIRER_ID = System.getProperty("acquiring.api.acquirerId");
        if (ACQUIRER_ID == null) {
            throw new IllegalStateException("System property 'acquiring.api.acquirerId' must be set");
        }
    }

    private CommunicatorConfiguration getCommunicatorConfiguration(URL propertiesUrl) throws URISyntaxException {
        CommunicatorConfiguration configuration = Factory.createConfiguration(propertiesUrl.toURI(), OAUTH2_CLIENT_ID, OAUTH2_CLIENT_SECRET);
        configuration.setOAuth2TokenUri(OAUTH2_TOKEN_URI);

        String host = System.getProperty("acquiring.api.endpoint.host");
        if (host != null) {
            String scheme = System.getProperty("acquiring.api.endpoint.scheme", "https");
            int port = Integer.parseInt(System.getProperty("acquiring.api.endpoint.port", "-1"));
            URI apiEndpoint = new URI(scheme, null, host, port, null, null, null);
            configuration = configuration.withApiEndpoint(apiEndpoint);
        }

        String httpsProtocols = System.getProperty("acquiring.api.https.protocols");
        if (httpsProtocols != null) {
            configuration = configuration.withHttpsProtocols(httpsProtocols.split("\\s*,\\s*"));
        }

        return configuration;
    }

    protected CommunicatorConfiguration getCommunicatorConfiguration() throws URISyntaxException {
        URL propertiesUrl = getClass().getResource(PROPERTIES_URL);
        return getCommunicatorConfiguration(propertiesUrl);
    }

    protected CommunicatorConfiguration getCommunicatorConfigurationWithProxy() throws URISyntaxException {
        String proxyURI = System.getProperty("acquiring.api.proxy.uri");
        String proxyUsername = System.getProperty("acquiring.api.proxy.username");
        String proxyPassword = System.getProperty("acquiring.api.proxy.password");
        assumeFalse(proxyURI == null, "System property 'acquiring.api.proxy.uri' must be set");

        return getCommunicatorConfiguration()
                .withProxyConfiguration(new ProxyConfiguration(new URI(proxyURI), proxyUsername, proxyPassword));
    }

    protected Client getClient() throws URISyntaxException {
        URL propertiesUrl = getClass().getResource(PROPERTIES_URL);
        CommunicatorConfiguration configuration = getCommunicatorConfiguration(propertiesUrl);
        return Factory
                .createClient(configuration);
    }

    protected Client getClientWithProxy() throws URISyntaxException {
        CommunicatorConfiguration configuration = getCommunicatorConfigurationWithProxy();
        return Factory
                .createClient(configuration);
    }

    protected Client getClientWithoutConnectionReuse() throws URISyntaxException {
        URL propertiesUrl = getClass().getResource(PROPERTIES_URL);
        CommunicatorConfiguration configuration = getCommunicatorConfiguration(propertiesUrl);
        configuration.setConnectionReuse(false);
        return Factory
                .createClient(configuration);
    }

    protected String getMerchantId() {
        return MERCHANT_ID;
    }

    protected String getAcquirerId() {
        return ACQUIRER_ID;
    }

    protected static ApiPaymentRequest getProcessPaymentRequest() {
        AmountData amountData = new AmountData();
        amountData.setAmount(200L);
        amountData.setCurrencyCode("GBP");
        amountData.setNumberOfDecimals(2);

        PlainCardData plainCardData = new PlainCardData();
        plainCardData.setCardNumber("4176669999000104");
        plainCardData.setCardSecurityCode("012");
        plainCardData.setExpiryDate("122031");

        CardPaymentData cardPaymentData = new CardPaymentData();
        cardPaymentData.setCardEntryMode("ECOMMERCE");
        cardPaymentData.setCardholderVerificationMethod("CARD_SECURITY_CODE");
        cardPaymentData.setAllowPartialApproval(false);
        cardPaymentData.setBrand("VISA");
        cardPaymentData.setCaptureImmediately(false);
        cardPaymentData.setCardData(plainCardData);

        PaymentReferences references = new PaymentReferences();
        references.setMerchantReference(String.format("your-order-%s", UUID.randomUUID()));

        ApiPaymentRequest request = new ApiPaymentRequest();
        request.setAmount(amountData);
        request.setAuthorizationType("PRE_AUTHORIZATION");
        request.setTransactionTimestamp(ZonedDateTime.now());
        request.setCardPaymentData(cardPaymentData);
        request.setReferences(references);
        request.setOperationId(UUID.randomUUID().toString());
        return request;
    }

    protected static void assertProcessPaymentResponse(ApiPaymentRequest body, ApiPaymentResponse response) {
        assertEquals(body.getOperationId(), response.getOperationId());
        assertEquals("0", response.getResponseCode());
        assertEquals("APPROVED", response.getResponseCodeCategory());
        assertNotNull(response.getResponseCodeDescription());
        assertEquals("AUTHORIZED", response.getStatus());
        assertNotNull(response.getInitialAuthorizationCode());
        assertNotNull(response.getPaymentId());
        assertNotNull(response.getTotalAuthorizedAmount());
        assertEquals(200L, response.getTotalAuthorizedAmount().getAmount());
        assertEquals("GBP", response.getTotalAuthorizedAmount().getCurrencyCode());
        assertEquals(2, response.getTotalAuthorizedAmount().getNumberOfDecimals());
    }

    protected static void assertPaymentStatusResponse(String paymentId, ApiPaymentResource response) {
        assertNotNull(response.getInitialAuthorizationCode());
        assertEquals(paymentId, response.getPaymentId());
        assertEquals("AUTHORIZED", response.getStatus());
    }

    protected static GetDCCRateRequest getDCCRateRequest() {
        return getDCCRateRequest(200L);
    }

    protected static GetDCCRateRequest getDCCRateRequest(long amount) {
        AmountData amountData = new AmountData();
        amountData.setAmount(amount);
        amountData.setCurrencyCode("GBP");
        amountData.setNumberOfDecimals(2);

        TransactionDataForDcc transactionDataForDcc = new TransactionDataForDcc();
        transactionDataForDcc.setAmount(amountData);
        transactionDataForDcc.setTransactionTimestamp(ZonedDateTime.now());
        transactionDataForDcc.setTransactionType("PAYMENT");

        PointOfSaleDataForDcc pointOfSaleDataForDcc = new PointOfSaleDataForDcc();
        pointOfSaleDataForDcc.setTerminalId("12345678");

        CardDataForDcc cardDataForDcc = new CardDataForDcc();
        cardDataForDcc.setBrand("VISA");
        cardDataForDcc.setBin("41766699");

        GetDCCRateRequest request = new GetDCCRateRequest();
        request.setTransaction(transactionDataForDcc);
        request.setOperationId(UUID.randomUUID().toString());
        request.setTargetCurrency("EUR");
        request.setPointOfSaleData(pointOfSaleDataForDcc);
        request.setCardPaymentData(cardDataForDcc);

        return request;
    }

    protected static void assertDccRateResponse(GetDCCRateRequest body, GetDccRateResponse response) {
        assertNotNull(response.getProposal());
        assertNotNull(response.getProposal().getOriginalAmount());
        assertEqualAmounts(body.getTransaction().getAmount(), response.getProposal().getOriginalAmount());
        assertEquals(body.getTargetCurrency(), response.getProposal().getResultingAmount().getCurrencyCode());
    }

    protected static void assertEqualAmounts(AmountData expected, AmountData actual) {
        assertEquals(expected.getAmount(), actual.getAmount());
        assertEquals(expected.getCurrencyCode(), actual.getCurrencyCode());
        assertEquals(expected.getNumberOfDecimals(), actual.getNumberOfDecimals());
    }
}
