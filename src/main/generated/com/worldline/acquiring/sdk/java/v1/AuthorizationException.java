/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1;

/**
 * Represents an error response from the Worldline Acquiring platform when API authorization failed.
 */
@SuppressWarnings("serial")
public class AuthorizationException extends ApiException {

    public AuthorizationException(int statusCode, String responseBody, String type, String title, Integer status, String detail, String instance) {
        super("The Worldline Acquiring platform returned an API authorization error response", statusCode, responseBody, type, title, status, detail, instance);
    }

    public AuthorizationException(String message, int statusCode, String responseBody, String type, String title, Integer status, String detail, String instance) {
        super(message, statusCode, responseBody, type, title, status, detail, instance);
    }
}
