/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.disputemanagement;

import java.util.Map;
import java.util.TreeMap;

import com.worldline.acquiring.sdk.java.ApiResource;
import com.worldline.acquiring.sdk.java.CallContext;
import com.worldline.acquiring.sdk.java.communication.ResponseException;
import com.worldline.acquiring.sdk.java.v1.ApiException;
import com.worldline.acquiring.sdk.java.v1.AuthorizationException;
import com.worldline.acquiring.sdk.java.v1.ExceptionFactory;
import com.worldline.acquiring.sdk.java.v1.PlatformException;
import com.worldline.acquiring.sdk.java.v1.ReferenceException;
import com.worldline.acquiring.sdk.java.v1.ValidationException;
import com.worldline.acquiring.sdk.java.v1.domain.AcceptDisputeLiabilityRequest;
import com.worldline.acquiring.sdk.java.v1.domain.ApiPaymentErrorResponse;
import com.worldline.acquiring.sdk.java.v1.domain.DisputeResponse;
import com.worldline.acquiring.sdk.java.v1.domain.SearchDisputesRequest;
import com.worldline.acquiring.sdk.java.v1.domain.SearchDisputesResponse;
import com.worldline.acquiring.sdk.java.v1.domain.SubmitEvidenceRequest;

/**
 * DisputeManagement client. Thread-safe.
 */
public class DisputeManagementClient extends ApiResource {

    private static final ExceptionFactory EXCEPTION_FACTORY = new ExceptionFactory();

    public DisputeManagementClient(ApiResource parent, Map<String, String> pathContext) {
        super(parent, pathContext);
    }

    /**
     * Resource /dispute-management/v1/disputes/search
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Dispute-Management/operation/searchDisputes">Search Disputes</a>
     *
     * @param body SearchDisputesRequest
     * @return SearchDisputesResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public SearchDisputesResponse searchDisputes(SearchDisputesRequest body) {
        return searchDisputes(body, null);
    }

    /**
     * Resource /dispute-management/v1/disputes/search
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Dispute-Management/operation/searchDisputes">Search Disputes</a>
     *
     * @param body SearchDisputesRequest
     * @param context CallContext
     * @return SearchDisputesResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public SearchDisputesResponse searchDisputes(SearchDisputesRequest body, CallContext context) {
        String uri = instantiateUri("/dispute-management/v1/disputes/search", null);
        try {
            return communicator.post(
                    uri,
                    null,
                    null,
                    body,
                    SearchDisputesResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ApiPaymentErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /dispute-management/v1/disputes/{disputeId}
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Dispute-Management/operation/getDispute">Retrieve Dispute</a>
     *
     * @param disputeId String
     * @param query GetDisputeParams
     * @return DisputeResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public DisputeResponse getDispute(String disputeId, GetDisputeParams query) {
        return getDispute(disputeId, query, null);
    }

    /**
     * Resource /dispute-management/v1/disputes/{disputeId}
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Dispute-Management/operation/getDispute">Retrieve Dispute</a>
     *
     * @param disputeId String
     * @param query GetDisputeParams
     * @param context CallContext
     * @return DisputeResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public DisputeResponse getDispute(String disputeId, GetDisputeParams query, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("disputeId", disputeId);
        String uri = instantiateUri("/dispute-management/v1/disputes/{disputeId}", pathContext);
        try {
            return communicator.get(
                    uri,
                    null,
                    query,
                    DisputeResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ApiPaymentErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /dispute-management/v1/disputes/{disputeId}/accept
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Dispute-Management/operation/acceptDisputeLiability">Accept Liability</a>
     *
     * @param disputeId String
     * @param body AcceptDisputeLiabilityRequest
     * @return DisputeResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public DisputeResponse acceptDisputeLiability(String disputeId, AcceptDisputeLiabilityRequest body) {
        return acceptDisputeLiability(disputeId, body, null);
    }

    /**
     * Resource /dispute-management/v1/disputes/{disputeId}/accept
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Dispute-Management/operation/acceptDisputeLiability">Accept Liability</a>
     *
     * @param disputeId String
     * @param body AcceptDisputeLiabilityRequest
     * @param context CallContext
     * @return DisputeResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public DisputeResponse acceptDisputeLiability(String disputeId, AcceptDisputeLiabilityRequest body, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("disputeId", disputeId);
        String uri = instantiateUri("/dispute-management/v1/disputes/{disputeId}/accept", pathContext);
        try {
            return communicator.post(
                    uri,
                    null,
                    null,
                    body,
                    DisputeResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ApiPaymentErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /dispute-management/v1/disputes/{disputeId}/submit-evidence
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Dispute-Management/operation/submitEvidence">Submit Evidence</a>
     *
     * @param disputeId String
     * @param body SubmitEvidenceRequest
     * @return DisputeResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public DisputeResponse submitEvidence(String disputeId, SubmitEvidenceRequest body) {
        return submitEvidence(disputeId, body, null);
    }

    /**
     * Resource /dispute-management/v1/disputes/{disputeId}/submit-evidence
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Dispute-Management/operation/submitEvidence">Submit Evidence</a>
     *
     * @param disputeId String
     * @param body SubmitEvidenceRequest
     * @param context CallContext
     * @return DisputeResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public DisputeResponse submitEvidence(String disputeId, SubmitEvidenceRequest body, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("disputeId", disputeId);
        String uri = instantiateUri("/dispute-management/v1/disputes/{disputeId}/submit-evidence", pathContext);
        try {
            return communicator.post(
                    uri,
                    null,
                    null,
                    body,
                    DisputeResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ApiPaymentErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }
}
