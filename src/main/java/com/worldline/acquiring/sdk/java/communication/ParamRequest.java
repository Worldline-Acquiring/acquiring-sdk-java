package com.worldline.acquiring.sdk.java.communication;

import java.util.List;

/**
 * Represents a set of request parameters.
 */
public interface ParamRequest {

    List<RequestParam> toRequestParameters();
}
