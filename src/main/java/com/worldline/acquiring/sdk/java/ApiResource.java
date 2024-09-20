package com.worldline.acquiring.sdk.java;

import java.util.Map;

/**
 * Base class of all Worldline Acquiring platform API resources.
 */
public abstract class ApiResource {

    private final ApiResource parent;
    protected final Communicator communicator;
    private final Map<String, String> pathContext;

    protected ApiResource(ApiResource parent, Map<String, String> pathContext) {
        if (parent == null) {
            throw new IllegalArgumentException("parent is required");
        }
        this.parent = parent;
        this.communicator = parent.communicator;
        this.pathContext = pathContext;
    }

    protected ApiResource(Communicator communicator, Map<String, String> pathContext) {
        if (communicator == null) {
            throw new IllegalArgumentException("communicator is required");
        }
        this.parent = null;
        this.communicator = communicator;
        this.pathContext = pathContext;
    }

    protected String instantiateUri(String uri, Map<String, String> pathContext) {
        uri = replaceAll(uri, pathContext);
        uri = instantiateUri(uri);
        return uri;
    }

    private String instantiateUri(String uri) {
        uri = replaceAll(uri, pathContext);
        if (parent != null) {
            uri = parent.instantiateUri(uri);
        }
        return uri;
    }

    private static String replaceAll(String uri, Map<String, String> pathContext) {
        if (pathContext != null) {
            for (Map.Entry<String, String> entry : pathContext.entrySet()) {
                uri = uri.replace(String.format("{%s}", entry.getKey()), entry.getValue());
            }
        }
        return uri;
    }
}
