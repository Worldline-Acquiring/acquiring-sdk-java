/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.acquirer.merchant.balanceinquiries;

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
import com.worldline.acquiring.sdk.java.v1.domain.ApiBalanceInquiryRequest;
import com.worldline.acquiring.sdk.java.v1.domain.ApiBalanceInquiryResponse;
import com.worldline.acquiring.sdk.java.v1.domain.ApiPaymentErrorResponse;

/**
 * BalanceInquiries client. Thread-safe.
 */
public class BalanceInquiriesClient extends ApiResource {

    private static final ExceptionFactory EXCEPTION_FACTORY = new ExceptionFactory();

    public BalanceInquiriesClient(ApiResource parent, Map<String, String> pathContext) {
        super(parent, pathContext);
    }

    /**
     * Resource /processing/v1/{acquirerId}/{merchantId}/balance-inquiries
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Balance-Inquiries/operation/processBalanceInquiry">Balance inquiry</a>
     *
     * @param body ApiBalanceInquiryRequest
     * @return ApiBalanceInquiryResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public ApiBalanceInquiryResponse processBalanceInquiry(ApiBalanceInquiryRequest body) {
        return processBalanceInquiry(body, null);
    }

    /**
     * Resource /processing/v1/{acquirerId}/{merchantId}/balance-inquiries
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Balance-Inquiries/operation/processBalanceInquiry">Balance inquiry</a>
     *
     * @param body ApiBalanceInquiryRequest
     * @param context CallContext
     * @return ApiBalanceInquiryResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public ApiBalanceInquiryResponse processBalanceInquiry(ApiBalanceInquiryRequest body, CallContext context) {
        String uri = instantiateUri("/processing/v1/{acquirerId}/{merchantId}/balance-inquiries", null);
        try {
            return communicator.post(
                    uri,
                    null,
                    null,
                    body,
                    ApiBalanceInquiryResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ApiPaymentErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }
}
