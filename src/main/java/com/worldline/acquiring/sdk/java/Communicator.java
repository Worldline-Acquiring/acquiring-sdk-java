package com.worldline.acquiring.sdk.java;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.apache.http.HttpStatus;
import org.apache.http.client.utils.URIBuilder;

import com.worldline.acquiring.sdk.java.authentication.Authenticator;
import com.worldline.acquiring.sdk.java.communication.CommunicationException;
import com.worldline.acquiring.sdk.java.communication.Connection;
import com.worldline.acquiring.sdk.java.communication.MetadataProvider;
import com.worldline.acquiring.sdk.java.communication.MultipartFormDataObject;
import com.worldline.acquiring.sdk.java.communication.MultipartFormDataRequest;
import com.worldline.acquiring.sdk.java.communication.NotFoundException;
import com.worldline.acquiring.sdk.java.communication.ParamRequest;
import com.worldline.acquiring.sdk.java.communication.PooledConnection;
import com.worldline.acquiring.sdk.java.communication.RequestHeader;
import com.worldline.acquiring.sdk.java.communication.RequestParam;
import com.worldline.acquiring.sdk.java.communication.ResponseException;
import com.worldline.acquiring.sdk.java.communication.ResponseHeader;
import com.worldline.acquiring.sdk.java.json.Marshaller;
import com.worldline.acquiring.sdk.java.logging.BodyObfuscator;
import com.worldline.acquiring.sdk.java.logging.CommunicatorLogger;
import com.worldline.acquiring.sdk.java.logging.HeaderObfuscator;
import com.worldline.acquiring.sdk.java.logging.LoggingCapable;
import com.worldline.acquiring.sdk.java.logging.ObfuscationCapable;

/**
 * Used to communicate with the Worldline Acquiring platform web services.
 * <p>
 * It contains all the logic to transform a request object to a HTTP request and
 * a HTTP response to a response object.
 * <p>
 * Thread-safe.
 */
public class Communicator implements Closeable, LoggingCapable, ObfuscationCapable {

    private static final String CONTENT_TYPE_HEADER = "Content-Type";
    private static final String CONTENT_TYPE_JSON = "application/json";
    private static final String CONTENT_TYPE_PROBLEM_JSON = "application/problem+json";

    private static final Charset CHARSET = StandardCharsets.UTF_8;

    private final URI apiEndpoint;

    private final Connection connection;

    private final Authenticator authenticator;

    private final MetadataProvider metadataProvider;

    private final Marshaller marshaller;

    public Communicator(URI apiEndpoint,
            Connection connection,
            Authenticator authenticator,
            MetadataProvider metadataProvider,
            Marshaller marshaller) {

        if (apiEndpoint == null) {
            throw new IllegalArgumentException("apiEndpoint is required");
        }
        if (apiEndpoint.getPath() != null && !apiEndpoint.getPath().isEmpty()) {
            throw new IllegalArgumentException("apiEndpoint should not contain a path");
        }
        if (apiEndpoint.getUserInfo() != null
                || apiEndpoint.getQuery() != null
                || apiEndpoint.getFragment() != null) {

            throw new IllegalArgumentException("apiEndpoint should not contain user info, query or fragment");
        }

        if (connection == null) {
            throw new IllegalArgumentException("connection is required");
        }
        if (authenticator == null) {
            throw new IllegalArgumentException("authenticator is required");
        }
        if (metadataProvider == null) {
            throw new IllegalArgumentException("metadataProvider is required");
        }
        if (marshaller == null) {
            throw new IllegalArgumentException("marshaller is required");
        }

        this.apiEndpoint = apiEndpoint;
        this.connection = connection;
        this.authenticator = authenticator;
        this.metadataProvider = metadataProvider;
        this.marshaller = marshaller;
    }

    /**
     * Releases any system resources associated with this object.
     */
    @Override
    public void close() throws IOException {
        connection.close();
    }

    /**
     * Corresponds to the HTTP GET method.
     *
     * @param relativePath The path to call, relative to the base URI.
     * @param requestHeaders An optional list of request headers.
     * @param requestParameters An optional set of request parameters.
     * @param responseType The type of response to return.
     * @param context The optional call context to use.
     * @throws CommunicationException when an exception occurred communicating with the Worldline Acquiring platform
     * @throws ResponseException when an error response was received from the Worldline Acquiring platform
     */
    public <O> O get(String relativePath, List<RequestHeader> requestHeaders, ParamRequest requestParameters,
            Class<O> responseType, CallContext context) {

        URI uri = toAbsoluteURI(relativePath, requestParameters);

        if (requestHeaders == null) {
            requestHeaders = new ArrayList<>();
        }

        addGenericHeaders("GET", uri, requestHeaders, context);

        return connection.get(uri, requestHeaders,
                (statusCode, bodyStream, headers) -> processResponse(statusCode, bodyStream, headers, responseType, relativePath, context));
    }

    /**
     * Corresponds to the HTTP GET method.
     *
     * @param relativePath The path to call, relative to the base URI.
     * @param requestHeaders An optional list of request headers.
     * @param requestParameters An optional set of request parameters.
     * @param bodyHandler The handler for the response body.
     * @param context The optional call context to use.
     * @throws CommunicationException when an exception occurred communicating with the Worldline Acquiring platform
     * @throws ResponseException when an error response was received from the Worldline Acquiring platform
     */
    public void get(String relativePath, List<RequestHeader> requestHeaders, ParamRequest requestParameters,
            BodyHandler bodyHandler, CallContext context) {

        URI uri = toAbsoluteURI(relativePath, requestParameters);

        if (requestHeaders == null) {
            requestHeaders = new ArrayList<>();
        }

        addGenericHeaders("GET", uri, requestHeaders, context);

        connection.get(uri, requestHeaders, (statusCode, bodyStream, headers) -> {
            processResponse(statusCode, bodyStream, headers, bodyHandler, relativePath, context);
            return null;
        });
    }

    /**
     * Corresponds to the HTTP DELETE method.
     *
     * @param relativePath The path to call, relative to the base URI.
     * @param requestHeaders An optional list of request headers.
     * @param requestParameters An optional set of request parameters.
     * @param responseType The type of response to return.
     * @param context The optional call context to use.
     * @throws CommunicationException when an exception occurred communicating with the Worldline Acquiring platform
     * @throws ResponseException when an error response was received from the Worldline Acquiring platform
     */
    public <O> O delete(String relativePath, List<RequestHeader> requestHeaders, ParamRequest requestParameters,
            Class<O> responseType, CallContext context) {

        URI uri = toAbsoluteURI(relativePath, requestParameters);

        if (requestHeaders == null) {
            requestHeaders = new ArrayList<>();
        }

        addGenericHeaders("DELETE", uri, requestHeaders, context);

        return connection.delete(uri, requestHeaders,
                (statusCode, bodyStream, headers) -> processResponse(statusCode, bodyStream, headers, responseType, relativePath, context));
    }

    /**
     * Corresponds to the HTTP DELETE method.
     *
     * @param relativePath The path to call, relative to the base URI.
     * @param requestHeaders An optional list of request headers.
     * @param requestParameters An optional set of request parameters.
     * @param bodyHandler The handler for the response body.
     * @param context The optional call context to use.
     * @throws CommunicationException when an exception occurred communicating with the Worldline Acquiring platform
     * @throws ResponseException when an error response was received from the Worldline Acquiring platform
     */
    public void delete(String relativePath, List<RequestHeader> requestHeaders, ParamRequest requestParameters,
            BodyHandler bodyHandler, CallContext context) {

        URI uri = toAbsoluteURI(relativePath, requestParameters);

        if (requestHeaders == null) {
            requestHeaders = new ArrayList<>();
        }

        addGenericHeaders("DELETE", uri, requestHeaders, context);

        connection.delete(uri, requestHeaders, (statusCode, bodyStream, headers) -> {
            processResponse(statusCode, bodyStream, headers, bodyHandler, relativePath, context);
            return null;
        });
    }

    /**
     * Corresponds to the HTTP POST method.
     *
     * @param relativePath The path to call, relative to the base URI.
     * @param requestHeaders An optional list of request headers.
     * @param requestParameters An optional set of request parameters.
     * @param requestBody The optional request body to send.
     * @param responseType The type of response to return.
     * @param context The optional call context to use.
     * @throws CommunicationException when an exception occurred communicating with the Worldline Acquiring platform
     * @throws ResponseException when an error response was received from the Worldline Acquiring platform
     */
    public <O> O post(String relativePath, List<RequestHeader> requestHeaders, ParamRequest requestParameters, Object requestBody,
            Class<O> responseType, CallContext context) {

        if (requestBody instanceof MultipartFormDataObject) {
            return post(relativePath, requestHeaders, requestParameters, (MultipartFormDataObject) requestBody, responseType, context);
        }
        if (requestBody instanceof MultipartFormDataRequest) {
            MultipartFormDataObject multipart = ((MultipartFormDataRequest) requestBody).toMultipartFormDataObject();
            return post(relativePath, requestHeaders, requestParameters, multipart, responseType, context);
        }

        URI uri = toAbsoluteURI(relativePath, requestParameters);

        if (requestHeaders == null) {
            requestHeaders = new ArrayList<>();
        }

        String requestJson = null;
        if (requestBody != null) {
            requestHeaders.add(new RequestHeader(CONTENT_TYPE_HEADER, CONTENT_TYPE_JSON));
            requestJson = marshaller.marshal(requestBody);
        }

        addGenericHeaders("POST", uri, requestHeaders, context);

        return connection.post(uri, requestHeaders, requestJson,
                (statusCode, bodyStream, headers) -> processResponse(statusCode, bodyStream, headers, responseType, relativePath, context));
    }

    private <O> O post(String relativePath, List<RequestHeader> requestHeaders, ParamRequest requestParameters, MultipartFormDataObject multipart,
            Class<O> responseType, CallContext context) {

        URI uri = toAbsoluteURI(relativePath, requestParameters);

        if (requestHeaders == null) {
            requestHeaders = new ArrayList<>();
        }

        requestHeaders.add(new RequestHeader(CONTENT_TYPE_HEADER, multipart.getContentType()));

        addGenericHeaders("POST", uri, requestHeaders, context);

        return connection.post(uri, requestHeaders, multipart,
                (statusCode, bodyStream, headers) -> processResponse(statusCode, bodyStream, headers, responseType, relativePath, context));
    }

    /**
     * Corresponds to the HTTP POST method.
     *
     * @param relativePath The path to call, relative to the base URI.
     * @param requestHeaders An optional list of request headers.
     * @param requestParameters An optional set of request parameters.
     * @param requestBody The optional request body to send.
     * @param bodyHandler The handler for the response body.
     * @param context The optional call context to use.
     * @throws CommunicationException when an exception occurred communicating with the Worldline Acquiring platform
     * @throws ResponseException when an error response was received from the Worldline Acquiring platform
     */
    public void post(String relativePath, List<RequestHeader> requestHeaders, ParamRequest requestParameters, Object requestBody,
            BodyHandler bodyHandler, CallContext context) {

        if (requestBody instanceof MultipartFormDataObject) {
            post(relativePath, requestHeaders, requestParameters, (MultipartFormDataObject) requestBody, bodyHandler, context);
            return;
        }
        if (requestBody instanceof MultipartFormDataRequest) {
            MultipartFormDataObject multipart = ((MultipartFormDataRequest) requestBody).toMultipartFormDataObject();
            post(relativePath, requestHeaders, requestParameters, multipart, bodyHandler, context);
            return;
        }

        URI uri = toAbsoluteURI(relativePath, requestParameters);

        if (requestHeaders == null) {
            requestHeaders = new ArrayList<>();
        }

        String requestJson = null;
        if (requestBody != null) {
            requestHeaders.add(new RequestHeader(CONTENT_TYPE_HEADER, CONTENT_TYPE_JSON));
            requestJson = marshaller.marshal(requestBody);
        }

        addGenericHeaders("POST", uri, requestHeaders, context);

        connection.post(uri, requestHeaders, requestJson, (statusCode, bodyStream, headers) -> {
            processResponse(statusCode, bodyStream, headers, bodyHandler, relativePath, context);
            return null;
        });
    }

    private void post(String relativePath, List<RequestHeader> requestHeaders, ParamRequest requestParameters, MultipartFormDataObject multipart,
            BodyHandler bodyHandler, CallContext context) {

        URI uri = toAbsoluteURI(relativePath, requestParameters);

        if (requestHeaders == null) {
            requestHeaders = new ArrayList<>();
        }

        requestHeaders.add(new RequestHeader(CONTENT_TYPE_HEADER, multipart.getContentType()));

        addGenericHeaders("POST", uri, requestHeaders, context);

        connection.post(uri, requestHeaders, multipart, (statusCode, bodyStream, headers) -> {
            processResponse(statusCode, bodyStream, headers, bodyHandler, relativePath, context);
            return null;
        });
    }

    /**
     * Corresponds to the HTTP PUT method.
     *
     * @param relativePath The path to call, relative to the base URI.
     * @param requestHeaders An optional list of request headers.
     * @param requestParameters An optional set of request parameters.
     * @param requestBody The optional request body to send.
     * @param responseType The type of response to return.
     * @param context The optional call context to use.
     * @throws CommunicationException when an exception occurred communicating with the Worldline Acquiring platform
     * @throws ResponseException when an error response was received from the Worldline Acquiring platform
     */
    public <O> O put(String relativePath, List<RequestHeader> requestHeaders, ParamRequest requestParameters, Object requestBody,
            Class<O> responseType, CallContext context) {

        if (requestBody instanceof MultipartFormDataObject) {
            return put(relativePath, requestHeaders, requestParameters, (MultipartFormDataObject) requestBody, responseType, context);
        }
        if (requestBody instanceof MultipartFormDataRequest) {
            MultipartFormDataObject multipart = ((MultipartFormDataRequest) requestBody).toMultipartFormDataObject();
            return put(relativePath, requestHeaders, requestParameters, multipart, responseType, context);
        }

        URI uri = toAbsoluteURI(relativePath, requestParameters);

        if (requestHeaders == null) {
            requestHeaders = new ArrayList<>();
        }

        String requestJson = null;
        if (requestBody != null) {
            requestHeaders.add(new RequestHeader(CONTENT_TYPE_HEADER, CONTENT_TYPE_JSON));
            requestJson = marshaller.marshal(requestBody);
        }

        addGenericHeaders("PUT", uri, requestHeaders, context);

        return connection.put(uri, requestHeaders, requestJson,
                (statusCode, bodyStream, headers) -> processResponse(statusCode, bodyStream, headers, responseType, relativePath, context));
    }

    private <O> O put(String relativePath, List<RequestHeader> requestHeaders, ParamRequest requestParameters, MultipartFormDataObject multipart,
            Class<O> responseType, CallContext context) {

        URI uri = toAbsoluteURI(relativePath, requestParameters);

        if (requestHeaders == null) {
            requestHeaders = new ArrayList<>();
        }

        requestHeaders.add(new RequestHeader(CONTENT_TYPE_HEADER, multipart.getContentType()));

        addGenericHeaders("PUT", uri, requestHeaders, context);

        return connection.put(uri, requestHeaders, multipart,
                (statusCode, bodyStream, headers) -> processResponse(statusCode, bodyStream, headers, responseType, relativePath, context));
    }

    /**
     * Corresponds to the HTTP PUT method.
     *
     * @param relativePath The path to call, relative to the base URI.
     * @param requestHeaders An optional list of request headers.
     * @param requestParameters An optional set of request parameters.
     * @param requestBody The optional request body to send.
     * @param bodyHandler The handler for the response body.
     * @param context The optional call context to use.
     * @throws CommunicationException when an exception occurred communicating with the Worldline Acquiring platform
     * @throws ResponseException when an error response was received from the Worldline Acquiring platform
     */
    public void put(String relativePath, List<RequestHeader> requestHeaders, ParamRequest requestParameters, Object requestBody,
            BodyHandler bodyHandler, CallContext context) {

        if (requestBody instanceof MultipartFormDataObject) {
            put(relativePath, requestHeaders, requestParameters, (MultipartFormDataObject) requestBody, bodyHandler, context);
            return;
        }
        if (requestBody instanceof MultipartFormDataRequest) {
            MultipartFormDataObject multipart = ((MultipartFormDataRequest) requestBody).toMultipartFormDataObject();
            put(relativePath, requestHeaders, requestParameters, multipart, bodyHandler, context);
            return;
        }

        URI uri = toAbsoluteURI(relativePath, requestParameters);

        if (requestHeaders == null) {
            requestHeaders = new ArrayList<>();
        }

        String requestJson = null;
        if (requestBody != null) {
            requestHeaders.add(new RequestHeader(CONTENT_TYPE_HEADER, CONTENT_TYPE_JSON));
            requestJson = marshaller.marshal(requestBody);
        }

        addGenericHeaders("PUT", uri, requestHeaders, context);

        connection.put(uri, requestHeaders, requestJson, (statusCode, bodyStream, headers) -> {
            processResponse(statusCode, bodyStream, headers, bodyHandler, relativePath, context);
            return null;
        });
    }

    private void put(String relativePath, List<RequestHeader> requestHeaders, ParamRequest requestParameters, MultipartFormDataObject multipart,
            BodyHandler bodyHandler, CallContext context) {

        URI uri = toAbsoluteURI(relativePath, requestParameters);

        if (requestHeaders == null) {
            requestHeaders = new ArrayList<>();
        }

        requestHeaders.add(new RequestHeader(CONTENT_TYPE_HEADER, multipart.getContentType()));

        addGenericHeaders("PUT", uri, requestHeaders, context);

        connection.put(uri, requestHeaders, multipart, (statusCode, bodyStream, headers) -> {
            processResponse(statusCode, bodyStream, headers, bodyHandler, relativePath, context);
            return null;
        });
    }

    /**
     * @return The {@link Marshaller} object associated with this communicator. Never {@code null}.
     */
    public Marshaller getMarshaller() {
        return marshaller;
    }

    private URI toAbsoluteURI(String relativePath, ParamRequest requestParameters) {
        List<RequestParam> requestParameterList = requestParameters == null ? null : requestParameters.toRequestParameters();
        return toAbsoluteURI(relativePath, requestParameterList);
    }

    protected URI toAbsoluteURI(String relativePath, List<RequestParam> requestParameters) {
        String absolutePath;
        if (relativePath.startsWith("/")) {
            absolutePath = relativePath;
        } else {
            absolutePath = "/" + relativePath;
        }

        URIBuilder uriBuilder = new URIBuilder()
                .setScheme(apiEndpoint.getScheme())
                .setHost(apiEndpoint.getHost())
                .setPort(apiEndpoint.getPort())
                .setPath(absolutePath);

        if (requestParameters != null) {
            for (RequestParam nvp : requestParameters) {
                uriBuilder.addParameter(nvp.getName(), nvp.getValue());
            }
        }

        try {
            return uriBuilder.build();
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Unable to construct URI", e);
        }
    }

    /**
     * Adds the necessary headers to the given list of headers. This includes the authorization header, which uses
     * other headers, so when you need to override this method, make sure to call {@code super.addGenericHeaders}
     * at the <i>end</i> of your overridden method.
     */
    @SuppressWarnings("unused")
    protected void addGenericHeaders(String httpMethod, URI uri, List<RequestHeader> requestHeaders, CallContext context) {
        requestHeaders.addAll(metadataProvider.getServerMetadataHeaders());

        requestHeaders.add(new RequestHeader("Date", getHeaderDateString()));

        // no context specific headers at this time

        String authorization = authenticator.getAuthorization(httpMethod, uri, requestHeaders);
        requestHeaders.add(new RequestHeader("Authorization", authorization));
        requestHeaders.add(new RequestHeader("Trace-Id", UUID.randomUUID().toString()));
    }

    /**
     * Returns the date in the preferred format for the HTTP date header (RFC1123).
     */
    protected static String getHeaderDateString() {
        return ZonedDateTime.now(ZoneOffset.UTC).format(DateTimeFormatter.RFC_1123_DATE_TIME);
    }

    protected <O> O processResponse(int statusCode, InputStream bodyStream, List<ResponseHeader> headers, Class<O> responseType,
            String requestPath, CallContext context) {

        if (context != null) {
            updateContext(headers, context);
        }
        throwExceptionIfNecessary(statusCode, bodyStream, headers, requestPath);

        return marshaller.unmarshal(bodyStream, responseType);
    }

    protected void processResponse(int statusCode, InputStream bodyStream, List<ResponseHeader> headers, BodyHandler bodyHandler,
            String requestPath, CallContext context) {

        if (context != null) {
            updateContext(headers, context);
        }
        throwExceptionIfNecessary(statusCode, bodyStream, headers, requestPath);

        try {
            bodyHandler.handleBody(bodyStream, headers);
        } catch (IOException e) {
            throw new BodyHandlerException(e);
        }
    }

    /**
     * Updates the given call context based on the contents of the given response.
     */
    @SuppressWarnings("unused")
    protected static void updateContext(List<ResponseHeader> headers, CallContext context) {
        // no context specific headers at this time
    }

    /**
     * Checks the status code and headers for errors and throws an exception if necessary.
     */
    protected static void throwExceptionIfNecessary(int statusCode, InputStream bodyStream, List<ResponseHeader> headers, String requestPath) {
        // status codes in the 100 or 300 range are not expected
        if (statusCode < 200 || statusCode >= 300) {
            String body = toString(bodyStream);

            if (body != null && !body.isEmpty() && !isJson(headers)) {
                ResponseException cause = new ResponseException(statusCode, body, headers);
                if (statusCode == HttpStatus.SC_NOT_FOUND) {
                    throw new NotFoundException("The requested resource was not found; invalid path: " + requestPath, cause);
                }
                throw new CommunicationException(cause);
            }
            throw new ResponseException(statusCode, body, headers);
        }
    }

    private static String toString(InputStream bodyStream) {
        try (Reader reader = new InputStreamReader(bodyStream, CHARSET)) {
            StringBuilder body = new StringBuilder();
            char[] buffer = new char[4096];
            int len;
            while ((len = reader.read(buffer)) != -1) {
                body.append(buffer, 0, len);
            }
            return body.toString();
        } catch (IOException e) {
            throw new CommunicationException(e);
        }
    }

    private static boolean isJson(List<ResponseHeader> headers) {
        String contentType = ResponseHeader.getHeaderValue(headers, CONTENT_TYPE_HEADER);
        return contentType == null || isJson(contentType);
    }

    private static boolean isJson(String contentType) {
        if (CONTENT_TYPE_JSON.equalsIgnoreCase(contentType) || CONTENT_TYPE_PROBLEM_JSON.equalsIgnoreCase(contentType)) {
            return true;
        }
        String lowerCaseContentType = contentType.toLowerCase();
        return lowerCaseContentType.startsWith(CONTENT_TYPE_JSON) || lowerCaseContentType.startsWith(CONTENT_TYPE_PROBLEM_JSON);
    }

    /**
     * Utility method that delegates the call to this communicator's connection if that's an instance of
     * {@link PooledConnection}. If not this method does nothing.
     *
     * @see PooledConnection#closeIdleConnections(long, TimeUnit)
     */
    public void closeIdleConnections(long idleTime, TimeUnit timeUnit) {
        if (connection instanceof PooledConnection) {
            ((PooledConnection) connection).closeIdleConnections(idleTime, timeUnit);
        }
    }

    /**
     * Utility method that delegates the call to this communicator's connection if that's an instance of
     * {@link PooledConnection}. If not this method does nothing.
     *
     * @see PooledConnection#closeExpiredConnections()
     */
    public void closeExpiredConnections() {
        if (connection instanceof PooledConnection) {
            ((PooledConnection) connection).closeExpiredConnections();
        }
    }

    @Override
    public void setBodyObfuscator(BodyObfuscator bodyObfuscator) {
        connection.setBodyObfuscator(bodyObfuscator);
    }

    @Override
    public void setHeaderObfuscator(HeaderObfuscator headerObfuscator) {
        connection.setHeaderObfuscator(headerObfuscator);
    }

    @Override
    public void enableLogging(CommunicatorLogger communicatorLogger) {
        connection.enableLogging(communicatorLogger);
    }

    @Override
    public void disableLogging() {
        connection.disableLogging();
    }
}
