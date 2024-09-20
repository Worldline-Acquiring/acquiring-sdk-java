package com.worldline.acquiring.sdk.java.it;

import static org.junit.jupiter.api.Assumptions.assumeFalse;

import java.io.IOException;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URI;
import java.net.URISyntaxException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.worldline.acquiring.sdk.java.Client;
import com.worldline.acquiring.sdk.java.CommunicatorConfiguration;
import com.worldline.acquiring.sdk.java.Factory;
import com.worldline.acquiring.sdk.java.v1.domain.GetDCCRateRequest;
import com.worldline.acquiring.sdk.java.v1.domain.GetDccRateResponse;

class SystemProxyTest extends ItTest {

    private boolean setHttpProxyHost;
    private boolean setHttpProxyPort;
    private boolean setHttpsProxyHost;
    private boolean setHttpsProxyPort;
    private boolean setHttpProxyUser;
    private boolean setHttpProxyPass;

    @BeforeEach
    void setup() throws URISyntaxException {
        if (setupProxyHost("http")) {
            setHttpProxyHost = true;
            setHttpProxyPort = true;
        }
        if (setupProxyHost("https")) {
            setHttpsProxyHost = true;
            setHttpsProxyPort = true;
        }

        if (System.getProperty("http.proxyUser") == null) {
            String proxyUsername = System.getProperty("acquiring.api.proxy.username");
            if (proxyUsername != null) {
                System.setProperty("http.proxyUser", proxyUsername);
                setHttpProxyUser = true;
            }
        }
        if (System.getProperty("http.proxyPass") == null) {
            String proxyPassword = System.getProperty("acquiring.api.proxy.password");
            if (proxyPassword != null) {
                System.setProperty("http.proxyPass", proxyPassword);
                setHttpProxyPass = true;
            }
        }
    }

    private boolean setupProxyHost(String prefix) throws URISyntaxException {
        String proxyHostProperty = prefix + ".proxyHost";
        String proxyPortProperty = prefix + ".proxyPort";

        String proxyHost = System.getProperty(proxyPortProperty);
        String proxyPort = System.getProperty(proxyPortProperty);

        if (proxyHost == null && proxyPort == null) {
            String proxyURIString = System.getProperty("acquiring.api.proxy.uri");
            assumeFalse(proxyURIString == null,
                    "Either system properties '" + proxyHostProperty + "' and '" + proxyPortProperty + "' must be set,"
                    + " or system property acquiring.api.proxy.uri must be set");

            URI proxyURI = new URI(proxyURIString);
            System.setProperty(proxyHostProperty, proxyURI.getHost());
            System.setProperty(proxyPortProperty, Integer.toString(proxyURI.getPort()));

            return true;
        }
        if (proxyHost == null || proxyPort == null) {
            throw new IllegalStateException("Either system properties '" + proxyHostProperty + "' and '" + proxyPortProperty + "' must both be set,"
                    + " or neither must be set");
        }

        // did not setup the proxy host
        return false;
    }

    @AfterEach
    void cleanup() {
        if (setHttpProxyHost) {
            System.clearProperty("http.proxyHost");
        }
        if (setHttpProxyPort) {
            System.clearProperty("http.proxyPort");
        }
        if (setHttpsProxyHost) {
            System.clearProperty("https.proxyHost");
        }
        if (setHttpsProxyPort) {
            System.clearProperty("https.proxyPort");
        }
        if (setHttpProxyUser) {
            System.clearProperty("http.proxyUser");
        }
        if (setHttpProxyPass) {
            System.clearProperty("http.proxyPass");
        }
    }

    /**
     * Smoke test for using a proxy configured through system properties.
     */
    @Test
    void test() throws URISyntaxException, IOException {

        final boolean[] authenticationCalled = { false };

        final String username = System.getProperty("http.proxyUser");
        final String password = System.getProperty("http.proxyPass");

        Authenticator.setDefault(new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                authenticationCalled[0] = true;

                return new PasswordAuthentication(username, password.toCharArray());
            }
        });

        CommunicatorConfiguration configuration = getCommunicatorConfiguration()
                .withProxyConfiguration(null);

        try (Client client = Factory.createClient(configuration)) {
            GetDCCRateRequest body = getDCCRateRequest();

            GetDccRateResponse response = client
                    .v1()
                    .acquirer(getAcquirerId())
                    .merchant(getMerchantId())
                    .dynamicCurrencyConversion()
                    .requestDccRate(body);

            assertDccRateResponse(body, response);
        }

        // Authentication may or may not be required, depending on the proxy configuration.
        // Therefore, no assertions can be made about authenticationCalled[0]
    }
}
