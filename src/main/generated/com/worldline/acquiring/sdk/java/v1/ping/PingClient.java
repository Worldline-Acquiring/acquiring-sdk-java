/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.ping;

import java.util.Map;

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

/**
 * Ping client. Thread-safe.
 */
public class PingClient extends ApiResource {

    private static final ExceptionFactory EXCEPTION_FACTORY = new ExceptionFactory();

    public PingClient(ApiResource parent, Map<String, String> pathContext) {
        super(parent, pathContext);
    }

    /**
     * Resource /services/v1/ping
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Ping/operation/ping">Check API connection</a>
     *
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public void ping() {
        ping(null);
    }

    /**
     * Resource /services/v1/ping
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Ping/operation/ping">Check API connection</a>
     *
     * @param context CallContext
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public void ping(CallContext context) {
        String uri = instantiateUri("/services/v1/ping", null);
        try {
            communicator.get(
                    uri,
                    null,
                    null,
                    void.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ApiPaymentErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }
}
