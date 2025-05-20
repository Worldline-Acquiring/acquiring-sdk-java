/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.authentication;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public final class OAuth2Scopes {

    private static final Map<String, Map<String, Set<String>>> SCOPES_BY_OPERATION;

    static {
        Map<String, Map<String, Set<String>>> scopesByOperation = new HashMap<>();

        Map<String, Set<String>> v1Scopes = new HashMap<>();
        v1Scopes.put("processPayment", new LinkedHashSet<>(Arrays.asList("processing_payment")));
        v1Scopes.put("getPaymentStatus", new LinkedHashSet<>(Arrays.asList("processing_payment")));
        v1Scopes.put("simpleCaptureOfPayment", new LinkedHashSet<>(Arrays.asList("processing_payment")));
        v1Scopes.put("reverseAuthorization", new LinkedHashSet<>(Arrays.asList("processing_payment")));
        v1Scopes.put("incrementPayment", new LinkedHashSet<>(Arrays.asList("processing_payment")));
        v1Scopes.put("createRefund", new LinkedHashSet<>(Arrays.asList("processing_refund")));
        v1Scopes.put("processStandaloneRefund", new LinkedHashSet<>(Arrays.asList("processing_refund")));
        v1Scopes.put("getRefund", new LinkedHashSet<>(Arrays.asList("processing_refund")));
        v1Scopes.put("captureRefund", new LinkedHashSet<>(Arrays.asList("processing_refund")));
        v1Scopes.put("reverseRefundAuthorization", new LinkedHashSet<>(Arrays.asList("processing_refund")));
        v1Scopes.put("processAccountVerification", new LinkedHashSet<>(Arrays.asList("processing_accountverification")));
        v1Scopes.put("processBalanceInquiry", new LinkedHashSet<>(Arrays.asList("processing_balanceinquiry")));
        v1Scopes.put("technicalReversal", new LinkedHashSet<>(Arrays.asList("processing_operation_reverse")));
        v1Scopes.put("requestDccRate", new LinkedHashSet<>(Arrays.asList("processing_dcc_rate")));
        v1Scopes.put("ping", new LinkedHashSet<>(Arrays.asList("services_ping")));
        scopesByOperation.put("v1", v1Scopes);

        SCOPES_BY_OPERATION = Collections.unmodifiableMap(scopesByOperation);
    }

    private static final Set<String> ALL_SCOPES = Collections.unmodifiableSet(SCOPES_BY_OPERATION.values()
            .stream()
            .flatMap(m -> m.values().stream())
            .flatMap(Set::stream)
            .collect(Collectors.toSet()));

    private OAuth2Scopes() {
    }

    /**
     * Returns all available scopes.
     */
    public static Set<String> all() {
        return ALL_SCOPES;
    }

    /**
     * Returns all scopes needed for all operations of the given API version.
     */
    public static Set<String> forApiVersion(String apiVersion) {
        Map<String, Set<String>> operations = SCOPES_BY_OPERATION.get(apiVersion);
        if (operations == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(operations.values()
                .stream()
                .flatMap(Set::stream)
                .collect(Collectors.toSet()));
    }

    /**
     * Returns all scopes needed for the given operation of the given API version.
     */
    public static Set<String> forOperation(String apiVersion, String operationId) {
        Set<String> scopes = SCOPES_BY_OPERATION.getOrDefault(apiVersion, Collections.emptyMap()).get(operationId);
        return scopes != null ? Collections.unmodifiableSet(scopes) : Collections.emptySet();
    }

    /**
     * Returns all scopes needed for the given operations of the given API version.
     */
    public static Set<String> forOperations(String apiVersion, String... operationIds) {
        Set<String> operationIdSet = new HashSet<>(Arrays.asList(operationIds));
        Map<String, Set<String>> operations = SCOPES_BY_OPERATION.get(apiVersion);
        if (operations == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(operations.entrySet()
                .stream()
                .filter(e -> operationIdSet.contains(e.getKey()))
                .flatMap(e -> e.getValue().stream())
                .collect(Collectors.toSet()));
    }

    /**
     * Returns all scopes needed for the operations that pass the given predicate.
     * The first argument to the predicate is the API version, the second is the operation id.
     */
    public static Set<String> forOperations(BiPredicate<? super String, ? super String> predicate) {
        return Collections.unmodifiableSet(SCOPES_BY_OPERATION.entrySet()
                .stream()
                .flatMap(e1 -> e1.getValue()
                        .entrySet()
                        .stream()
                        .filter(e2 -> predicate.test(e1.getKey(), e2.getKey()))
                        .flatMap(e2 -> e2.getValue().stream())
                )
                .collect(Collectors.toSet()));
    }
}
