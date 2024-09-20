/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1;

import com.worldline.acquiring.sdk.java.CallContext;
import com.worldline.acquiring.sdk.java.v1.domain.ApiPaymentErrorResponse;

/**
 * Factory for exceptions thrown by Worldline Acquiring platform API v1 resources.
 */
public class ExceptionFactory {

    public RuntimeException createException(int statusCode, String responseBody, Object errorObject, CallContext context) {
        if (errorObject instanceof ApiPaymentErrorResponse) {
            ApiPaymentErrorResponse apiPaymentErrorResponse = (ApiPaymentErrorResponse) errorObject;
            return createException(statusCode, responseBody, apiPaymentErrorResponse.getType(), apiPaymentErrorResponse.getTitle(), apiPaymentErrorResponse.getStatus(), apiPaymentErrorResponse.getDetail(), apiPaymentErrorResponse.getInstance(), context);
        }
        if (errorObject == null) {
            return createException(statusCode, responseBody, null, null, null, null, null, context);
        }
        throw new IllegalArgumentException("unsupported error object type: " + errorObject.getClass().getName());
    }

    // keep the context here to not have to make breaking changes if we should need it in the future
    @SuppressWarnings("unused")
    private RuntimeException createException(int statusCode, String responseBody, String type, String title, Integer status, String detail, String instance, CallContext context) {
        switch (statusCode) {
        case 400:
            return new ValidationException(statusCode, responseBody, type, title, status, detail, instance);
        case 403:
            return new AuthorizationException(statusCode, responseBody, type, title, status, detail, instance);
        case 404:
            return new ReferenceException(statusCode, responseBody, type, title, status, detail, instance);
        case 409:
            return new ReferenceException(statusCode, responseBody, type, title, status, detail, instance);
        case 410:
            return new ReferenceException(statusCode, responseBody, type, title, status, detail, instance);
        case 500:
            return new PlatformException(statusCode, responseBody, type, title, status, detail, instance);
        case 502:
            return new PlatformException(statusCode, responseBody, type, title, status, detail, instance);
        case 503:
            return new PlatformException(statusCode, responseBody, type, title, status, detail, instance);
        default:
            return new ApiException(statusCode, responseBody, type, title, status, detail, instance);
        }
    }
}
