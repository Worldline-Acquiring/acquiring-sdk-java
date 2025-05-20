package com.worldline.acquiring.sdk.java.authentication;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import static org.hamcrest.Matchers.not;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

import org.junit.jupiter.api.Test;

class OAuth2ScopesTest {

    @Test
    void testAll() {
        Set<String> allScopes = OAuth2Scopes.all();
        assertThat(allScopes, hasItems("processing_payment", "processing_dcc_rate", "services_ping"));

        String allScopesString = String.join(" ", allScopes);
        assertThat(allScopesString + " is too long", allScopesString.length(), lessThanOrEqualTo(260));
    }

    @Test
    void testForV1() {
        Set<String> scopes = OAuth2Scopes.forApiVersion("v1");
        assertThat(scopes, hasItems("processing_payment", "processing_dcc_rate", "services_ping"));
    }

    @Test
    void testForUnknownApiVersion() {
        Set<String> scopes = OAuth2Scopes.forApiVersion("v-1");
        assertThat(scopes, hasSize(0));
    }

    @Test
    void testForV1ProcessPayment() {
        Set<String> scopes = OAuth2Scopes.forOperation("v1", "processPayment");
        assertThat(scopes, hasItem("processing_payment"));
    }

    @Test
    void testForV1RequestDccRate() {
        Set<String> scopes = OAuth2Scopes.forOperation("v1", "requestDccRate");
        assertThat(scopes, hasItem("processing_dcc_rate"));
    }

    @Test
    void testForUnknownOperation() {
        Set<String> scopes = OAuth2Scopes.forOperation("v1", "unknown");
        assertThat(scopes, hasSize(0));
    }

    @Test
    void testForOperationOfUnknownApiVersion() {
        Set<String> scopes = OAuth2Scopes.forOperation("v-1", "processPayment");
        assertThat(scopes, hasSize(0));
    }

    @Test
    void testForV1Operations() {
        Set<String> scopes = OAuth2Scopes.forOperations("v1", "processPayment", "requestDccRate", "unknown");
        assertThat(scopes, hasItems("processing_payment", "processing_dcc_rate"));
        assertThat(scopes, not(hasItem("services_ping")));
    }

    @Test
    void testForOperationsOfUnknownApiVersion() {
        Set<String> scopes = OAuth2Scopes.forOperations("v-1", "processPayment", "requestDccRate");
        assertThat(scopes, hasSize(0));
    }

    @Test
    void testForOperationsWithPredicate() {
        Collection<String> operationIds = Arrays.asList("processPayment", "requestDccRate", "unknown");
        Set<String> scopes = OAuth2Scopes.forOperations((v, o) -> "v1".equals(v) && operationIds.contains(o));
        assertThat(scopes, hasItems("processing_payment", "processing_dcc_rate"));
        assertThat(scopes, not(hasItem("services_ping")));
    }
}
