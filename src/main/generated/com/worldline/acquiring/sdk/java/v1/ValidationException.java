/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1;

/**
 * Represents an error response from the Worldline Acquiring platform when validation of requests failed.
 */
@SuppressWarnings("serial")
public class ValidationException extends ApiException {

    public ValidationException(int statusCode, String responseBody, String type, String title, Integer status, String detail, String instance) {
        super("The Worldline Acquiring platform returned an incorrect request error response", statusCode, responseBody, type, title, status, detail, instance);
    }

    public ValidationException(String message, int statusCode, String responseBody, String type, String title, Integer status, String detail, String instance) {
        super(message, statusCode, responseBody, type, title, status, detail, instance);
    }
}
