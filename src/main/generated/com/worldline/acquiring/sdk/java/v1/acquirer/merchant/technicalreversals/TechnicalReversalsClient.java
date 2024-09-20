/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.acquirer.merchant.technicalreversals;

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
import com.worldline.acquiring.sdk.java.v1.domain.ApiPaymentErrorResponse;
import com.worldline.acquiring.sdk.java.v1.domain.ApiTechnicalReversalRequest;
import com.worldline.acquiring.sdk.java.v1.domain.ApiTechnicalReversalResponse;

/**
 * TechnicalReversals client. Thread-safe.
 */
public class TechnicalReversalsClient extends ApiResource {

    private static final ExceptionFactory EXCEPTION_FACTORY = new ExceptionFactory();

    public TechnicalReversalsClient(ApiResource parent, Map<String, String> pathContext) {
        super(parent, pathContext);
    }

    /**
     * Resource /processing/v1/{acquirerId}/{merchantId}/operations/{operationId}/reverse
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Technical-Reversals/operation/technicalReversal">Technical reversal</a>
     *
     * @param operationId String
     * @param body ApiTechnicalReversalRequest
     * @return ApiTechnicalReversalResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public ApiTechnicalReversalResponse technicalReversal(String operationId, ApiTechnicalReversalRequest body) {
        return technicalReversal(operationId, body, null);
    }

    /**
     * Resource /processing/v1/{acquirerId}/{merchantId}/operations/{operationId}/reverse
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Technical-Reversals/operation/technicalReversal">Technical reversal</a>
     *
     * @param operationId String
     * @param body ApiTechnicalReversalRequest
     * @param context CallContext
     * @return ApiTechnicalReversalResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public ApiTechnicalReversalResponse technicalReversal(String operationId, ApiTechnicalReversalRequest body, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("operationId", operationId);
        String uri = instantiateUri("/processing/v1/{acquirerId}/{merchantId}/operations/{operationId}/reverse", pathContext);
        try {
            return communicator.post(
                    uri,
                    null,
                    null,
                    body,
                    ApiTechnicalReversalResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ApiPaymentErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }
}
