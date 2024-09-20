/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.acquirer.merchant.payments;

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
import com.worldline.acquiring.sdk.java.v1.domain.ApiActionResponse;
import com.worldline.acquiring.sdk.java.v1.domain.ApiActionResponseForRefund;
import com.worldline.acquiring.sdk.java.v1.domain.ApiCaptureRequest;
import com.worldline.acquiring.sdk.java.v1.domain.ApiIncrementRequest;
import com.worldline.acquiring.sdk.java.v1.domain.ApiIncrementResponse;
import com.worldline.acquiring.sdk.java.v1.domain.ApiPaymentErrorResponse;
import com.worldline.acquiring.sdk.java.v1.domain.ApiPaymentRefundRequest;
import com.worldline.acquiring.sdk.java.v1.domain.ApiPaymentRequest;
import com.worldline.acquiring.sdk.java.v1.domain.ApiPaymentResource;
import com.worldline.acquiring.sdk.java.v1.domain.ApiPaymentResponse;
import com.worldline.acquiring.sdk.java.v1.domain.ApiPaymentReversalRequest;
import com.worldline.acquiring.sdk.java.v1.domain.ApiReversalResponse;

/**
 * Payments client. Thread-safe.
 */
public class PaymentsClient extends ApiResource {

    private static final ExceptionFactory EXCEPTION_FACTORY = new ExceptionFactory();

    public PaymentsClient(ApiResource parent, Map<String, String> pathContext) {
        super(parent, pathContext);
    }

    /**
     * Resource /processing/v1/{acquirerId}/{merchantId}/payments
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Payments/operation/processPayment">Create payment</a>
     *
     * @param body ApiPaymentRequest
     * @return ApiPaymentResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public ApiPaymentResponse processPayment(ApiPaymentRequest body) {
        return processPayment(body, null);
    }

    /**
     * Resource /processing/v1/{acquirerId}/{merchantId}/payments
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Payments/operation/processPayment">Create payment</a>
     *
     * @param body ApiPaymentRequest
     * @param context CallContext
     * @return ApiPaymentResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public ApiPaymentResponse processPayment(ApiPaymentRequest body, CallContext context) {
        String uri = instantiateUri("/processing/v1/{acquirerId}/{merchantId}/payments", null);
        try {
            return communicator.post(
                    uri,
                    null,
                    null,
                    body,
                    ApiPaymentResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ApiPaymentErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /processing/v1/{acquirerId}/{merchantId}/payments/{paymentId}
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Payments/operation/getPaymentStatus">Retrieve payment</a>
     *
     * @param paymentId String
     * @param query GetPaymentStatusParams
     * @return ApiPaymentResource
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public ApiPaymentResource getPaymentStatus(String paymentId, GetPaymentStatusParams query) {
        return getPaymentStatus(paymentId, query, null);
    }

    /**
     * Resource /processing/v1/{acquirerId}/{merchantId}/payments/{paymentId}
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Payments/operation/getPaymentStatus">Retrieve payment</a>
     *
     * @param paymentId String
     * @param query GetPaymentStatusParams
     * @param context CallContext
     * @return ApiPaymentResource
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public ApiPaymentResource getPaymentStatus(String paymentId, GetPaymentStatusParams query, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("paymentId", paymentId);
        String uri = instantiateUri("/processing/v1/{acquirerId}/{merchantId}/payments/{paymentId}", pathContext);
        try {
            return communicator.get(
                    uri,
                    null,
                    query,
                    ApiPaymentResource.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ApiPaymentErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /processing/v1/{acquirerId}/{merchantId}/payments/{paymentId}/captures
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Payments/operation/simpleCaptureOfPayment">Capture payment</a>
     *
     * @param paymentId String
     * @param body ApiCaptureRequest
     * @return ApiActionResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public ApiActionResponse simpleCaptureOfPayment(String paymentId, ApiCaptureRequest body) {
        return simpleCaptureOfPayment(paymentId, body, null);
    }

    /**
     * Resource /processing/v1/{acquirerId}/{merchantId}/payments/{paymentId}/captures
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Payments/operation/simpleCaptureOfPayment">Capture payment</a>
     *
     * @param paymentId String
     * @param body ApiCaptureRequest
     * @param context CallContext
     * @return ApiActionResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public ApiActionResponse simpleCaptureOfPayment(String paymentId, ApiCaptureRequest body, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("paymentId", paymentId);
        String uri = instantiateUri("/processing/v1/{acquirerId}/{merchantId}/payments/{paymentId}/captures", pathContext);
        try {
            return communicator.post(
                    uri,
                    null,
                    null,
                    body,
                    ApiActionResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ApiPaymentErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /processing/v1/{acquirerId}/{merchantId}/payments/{paymentId}/authorization-reversals
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Payments/operation/reverseAuthorization">Reverse authorization</a>
     *
     * @param paymentId String
     * @param body ApiPaymentReversalRequest
     * @return ApiReversalResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public ApiReversalResponse reverseAuthorization(String paymentId, ApiPaymentReversalRequest body) {
        return reverseAuthorization(paymentId, body, null);
    }

    /**
     * Resource /processing/v1/{acquirerId}/{merchantId}/payments/{paymentId}/authorization-reversals
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Payments/operation/reverseAuthorization">Reverse authorization</a>
     *
     * @param paymentId String
     * @param body ApiPaymentReversalRequest
     * @param context CallContext
     * @return ApiReversalResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public ApiReversalResponse reverseAuthorization(String paymentId, ApiPaymentReversalRequest body, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("paymentId", paymentId);
        String uri = instantiateUri("/processing/v1/{acquirerId}/{merchantId}/payments/{paymentId}/authorization-reversals", pathContext);
        try {
            return communicator.post(
                    uri,
                    null,
                    null,
                    body,
                    ApiReversalResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ApiPaymentErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /processing/v1/{acquirerId}/{merchantId}/payments/{paymentId}/increments
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Payments/operation/incrementPayment">Increment authorization</a>
     *
     * @param paymentId String
     * @param body ApiIncrementRequest
     * @return ApiIncrementResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public ApiIncrementResponse incrementPayment(String paymentId, ApiIncrementRequest body) {
        return incrementPayment(paymentId, body, null);
    }

    /**
     * Resource /processing/v1/{acquirerId}/{merchantId}/payments/{paymentId}/increments
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Payments/operation/incrementPayment">Increment authorization</a>
     *
     * @param paymentId String
     * @param body ApiIncrementRequest
     * @param context CallContext
     * @return ApiIncrementResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public ApiIncrementResponse incrementPayment(String paymentId, ApiIncrementRequest body, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("paymentId", paymentId);
        String uri = instantiateUri("/processing/v1/{acquirerId}/{merchantId}/payments/{paymentId}/increments", pathContext);
        try {
            return communicator.post(
                    uri,
                    null,
                    null,
                    body,
                    ApiIncrementResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ApiPaymentErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /processing/v1/{acquirerId}/{merchantId}/payments/{paymentId}/refunds
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Payments/operation/createRefund">Refund payment</a>
     *
     * @param paymentId String
     * @param body ApiPaymentRefundRequest
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
    public ApiActionResponseForRefund createRefund(String paymentId, ApiPaymentRefundRequest body) {
        return createRefund(paymentId, body, null);
    }

    /**
     * Resource /processing/v1/{acquirerId}/{merchantId}/payments/{paymentId}/refunds
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Payments/operation/createRefund">Refund payment</a>
     *
     * @param paymentId String
     * @param body ApiPaymentRefundRequest
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
    public ApiActionResponseForRefund createRefund(String paymentId, ApiPaymentRefundRequest body, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("paymentId", paymentId);
        String uri = instantiateUri("/processing/v1/{acquirerId}/{merchantId}/payments/{paymentId}/refunds", pathContext);
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
