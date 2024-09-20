/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.acquirer.merchant.refunds;

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
import com.worldline.acquiring.sdk.java.v1.domain.ApiActionResponseForRefund;
import com.worldline.acquiring.sdk.java.v1.domain.ApiCaptureRequestForRefund;
import com.worldline.acquiring.sdk.java.v1.domain.ApiPaymentErrorResponse;
import com.worldline.acquiring.sdk.java.v1.domain.ApiPaymentReversalRequest;
import com.worldline.acquiring.sdk.java.v1.domain.ApiRefundRequest;
import com.worldline.acquiring.sdk.java.v1.domain.ApiRefundResource;
import com.worldline.acquiring.sdk.java.v1.domain.ApiRefundResponse;

/**
 * Refunds client. Thread-safe.
 */
public class RefundsClient extends ApiResource {

    private static final ExceptionFactory EXCEPTION_FACTORY = new ExceptionFactory();

    public RefundsClient(ApiResource parent, Map<String, String> pathContext) {
        super(parent, pathContext);
    }

    /**
     * Resource /processing/v1/{acquirerId}/{merchantId}/refunds
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Refunds/operation/processStandaloneRefund">Create standalone refund</a>
     *
     * @param body ApiRefundRequest
     * @return ApiRefundResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public ApiRefundResponse processStandaloneRefund(ApiRefundRequest body) {
        return processStandaloneRefund(body, null);
    }

    /**
     * Resource /processing/v1/{acquirerId}/{merchantId}/refunds
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Refunds/operation/processStandaloneRefund">Create standalone refund</a>
     *
     * @param body ApiRefundRequest
     * @param context CallContext
     * @return ApiRefundResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public ApiRefundResponse processStandaloneRefund(ApiRefundRequest body, CallContext context) {
        String uri = instantiateUri("/processing/v1/{acquirerId}/{merchantId}/refunds", null);
        try {
            return communicator.post(
                    uri,
                    null,
                    null,
                    body,
                    ApiRefundResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ApiPaymentErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /processing/v1/{acquirerId}/{merchantId}/refunds/{refundId}
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Refunds/operation/getRefund">Retrieve refund</a>
     *
     * @param refundId String
     * @param query GetRefundParams
     * @return ApiRefundResource
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public ApiRefundResource getRefund(String refundId, GetRefundParams query) {
        return getRefund(refundId, query, null);
    }

    /**
     * Resource /processing/v1/{acquirerId}/{merchantId}/refunds/{refundId}
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Refunds/operation/getRefund">Retrieve refund</a>
     *
     * @param refundId String
     * @param query GetRefundParams
     * @param context CallContext
     * @return ApiRefundResource
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public ApiRefundResource getRefund(String refundId, GetRefundParams query, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("refundId", refundId);
        String uri = instantiateUri("/processing/v1/{acquirerId}/{merchantId}/refunds/{refundId}", pathContext);
        try {
            return communicator.get(
                    uri,
                    null,
                    query,
                    ApiRefundResource.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ApiPaymentErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /processing/v1/{acquirerId}/{merchantId}/refunds/{refundId}/captures
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Refunds/operation/captureRefund">Capture refund</a>
     *
     * @param refundId String
     * @param body ApiCaptureRequestForRefund
     * @return ApiActionResponseForRefund
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public ApiActionResponseForRefund captureRefund(String refundId, ApiCaptureRequestForRefund body) {
        return captureRefund(refundId, body, null);
    }

    /**
     * Resource /processing/v1/{acquirerId}/{merchantId}/refunds/{refundId}/captures
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Refunds/operation/captureRefund">Capture refund</a>
     *
     * @param refundId String
     * @param body ApiCaptureRequestForRefund
     * @param context CallContext
     * @return ApiActionResponseForRefund
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public ApiActionResponseForRefund captureRefund(String refundId, ApiCaptureRequestForRefund body, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("refundId", refundId);
        String uri = instantiateUri("/processing/v1/{acquirerId}/{merchantId}/refunds/{refundId}/captures", pathContext);
        try {
            return communicator.post(
                    uri,
                    null,
                    null,
                    body,
                    ApiActionResponseForRefund.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ApiPaymentErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /processing/v1/{acquirerId}/{merchantId}/refunds/{refundId}/authorization-reversals
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Refunds/operation/reverseRefundAuthorization">Reverse refund authorization</a>
     *
     * @param refundId String
     * @param body ApiPaymentReversalRequest
     * @return ApiActionResponseForRefund
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public ApiActionResponseForRefund reverseRefundAuthorization(String refundId, ApiPaymentReversalRequest body) {
        return reverseRefundAuthorization(refundId, body, null);
    }

    /**
     * Resource /processing/v1/{acquirerId}/{merchantId}/refunds/{refundId}/authorization-reversals
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Refunds/operation/reverseRefundAuthorization">Reverse refund authorization</a>
     *
     * @param refundId String
     * @param body ApiPaymentReversalRequest
     * @param context CallContext
     * @return ApiActionResponseForRefund
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public ApiActionResponseForRefund reverseRefundAuthorization(String refundId, ApiPaymentReversalRequest body, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("refundId", refundId);
        String uri = instantiateUri("/processing/v1/{acquirerId}/{merchantId}/refunds/{refundId}/authorization-reversals", pathContext);
        try {
            return communicator.post(
                    uri,
                    null,
                    null,
                    body,
                    ApiActionResponseForRefund.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ApiPaymentErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }
}
