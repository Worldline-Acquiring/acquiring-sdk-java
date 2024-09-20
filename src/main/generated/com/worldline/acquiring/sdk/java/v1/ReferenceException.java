/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1;

/**
 * Represents an error response from the Worldline Acquiring platform when a non-existing or removed object is trying to be accessed.
 */
@SuppressWarnings("serial")
public class ReferenceException extends ApiException {

    public ReferenceException(int statusCode, String responseBody, String type, String title, Integer status, String detail, String instance) {
        super("The Worldline Acquiring platform returned a reference error response", statusCode, responseBody, type, title, status, detail, instance);
    }

    public ReferenceException(String message, int statusCode, String responseBody, String type, String title, Integer status, String detail, String instance) {
        super(message, statusCode, responseBody, type, title, status, detail, instance);
    }
}
