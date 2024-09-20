/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1;

/**
 * Represents an error response from the Worldline Acquiring platform.
 */
@SuppressWarnings("serial")
public class ApiException extends RuntimeException {

    private final int statusCode;
    private final String responseBody;
    private final String type;
    private final String title;
    private final Integer status;
    private final String detail;
    private final String instance;

    public ApiException(int statusCode, String responseBody, String type, String title, Integer status, String detail, String instance) {
        this("The Worldline Acquiring platform returned an error response", statusCode, responseBody, type, title, status, detail, instance);
    }

    public ApiException(String message, int statusCode, String responseBody, String type, String title, Integer status, String detail, String instance) {
        super(message);
        this.statusCode = statusCode;
        this.responseBody = responseBody;
        this.type = type;
        this.title = title;
        this.status = status;
        this.detail = detail;
        this.instance = instance;
    }

    /**
     * @return The HTTP status code that was returned by the Worldline Acquiring platform.
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * @return The raw response body that was returned by the Worldline Acquiring platform.
     */
    public String getResponseBody() {
        return responseBody;
    }

    /**
     * @return The {@code type} received from the Worldline Acquiring platform if available.
     */
    public String getType() {
        return type;
    }

    /**
     * @return The {@code title} received from the Worldline Acquiring platform if available.
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return The {@code status} received from the Worldline Acquiring platform if available.
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @return The {@code detail} received from the Worldline Acquiring platform if available.
     */
    public String getDetail() {
        return detail;
    }

    /**
     * @return The {@code instance} received from the Worldline Acquiring platform if available.
     */
    public String getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        if (statusCode > 0) {
            sb.append("; statusCode=").append(statusCode);
        }
        if (responseBody != null && responseBody.length() > 0) {
            sb.append("; responseBody='").append(responseBody).append("'");
        }
        return sb.toString();
    }
}
