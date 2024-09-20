/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1;

/**
 * Represents an error response from the Worldline Acquiring platform when something went wrong at the Worldline Acquiring platform or further downstream.
 */
@SuppressWarnings("serial")
public class PlatformException extends ApiException {

    public PlatformException(int statusCode, String responseBody, String type, String title, Integer status, String detail, String instance) {
        super("The Worldline Acquiring platform returned an error response", statusCode, responseBody, type, title, status, detail, instance);
    }

    public PlatformException(String message, int statusCode, String responseBody, String type, String title, Integer status, String detail, String instance) {
        super(message, statusCode, responseBody, type, title, status, detail, instance);
    }
}
