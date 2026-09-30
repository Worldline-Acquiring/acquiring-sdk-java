/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.disputedocuments;

import java.util.Map;
import java.util.TreeMap;

import com.worldline.acquiring.sdk.java.ApiResource;
import com.worldline.acquiring.sdk.java.BodyHandler;
import com.worldline.acquiring.sdk.java.CallContext;
import com.worldline.acquiring.sdk.java.communication.ResponseException;
import com.worldline.acquiring.sdk.java.v1.ApiException;
import com.worldline.acquiring.sdk.java.v1.AuthorizationException;
import com.worldline.acquiring.sdk.java.v1.ExceptionFactory;
import com.worldline.acquiring.sdk.java.v1.PlatformException;
import com.worldline.acquiring.sdk.java.v1.ReferenceException;
import com.worldline.acquiring.sdk.java.v1.ValidationException;
import com.worldline.acquiring.sdk.java.v1.domain.ApiPaymentErrorResponse;
import com.worldline.acquiring.sdk.java.v1.domain.UploadDocumentResponse;

/**
 * DisputeDocuments client. Thread-safe.
 */
public class DisputeDocumentsClient extends ApiResource {

    private static final ExceptionFactory EXCEPTION_FACTORY = new ExceptionFactory();

    public DisputeDocumentsClient(ApiResource parent, Map<String, String> pathContext) {
        super(parent, pathContext);
    }

    /**
     * Resource /dispute-management/v1/documents
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Dispute-Documents/operation/uploadDisputeDocument">Upload Dispute Document</a>
     *
     * @param body UploadDisputeDocumentRequest
     * @return UploadDocumentResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public UploadDocumentResponse uploadDisputeDocument(UploadDisputeDocumentRequest body) {
        return uploadDisputeDocument(body, null);
    }

    /**
     * Resource /dispute-management/v1/documents
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Dispute-Documents/operation/uploadDisputeDocument">Upload Dispute Document</a>
     *
     * @param body UploadDisputeDocumentRequest
     * @param context CallContext
     * @return UploadDocumentResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public UploadDocumentResponse uploadDisputeDocument(UploadDisputeDocumentRequest body, CallContext context) {
        String uri = instantiateUri("/dispute-management/v1/documents", null);
        try {
            return communicator.post(
                    uri,
                    null,
                    null,
                    body,
                    UploadDocumentResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ApiPaymentErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /dispute-management/v1/disputes/{disputeId}/documents/{documentId}
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Dispute-Documents/operation/getDisputeDocument">Retrieve Dispute Document</a>
     *
     * @param disputeId String
     * @param documentId String
     * @param bodyHandler BodyHandler
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public void getDisputeDocument(String disputeId, String documentId, BodyHandler bodyHandler) {
        getDisputeDocument(disputeId, documentId, bodyHandler, null);
    }

    /**
     * Resource /dispute-management/v1/disputes/{disputeId}/documents/{documentId}
     * - <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Dispute-Documents/operation/getDisputeDocument">Retrieve Dispute Document</a>
     *
     * @param disputeId String
     * @param documentId String
     * @param bodyHandler BodyHandler
     * @param context CallContext
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Acquiring platform,
     *            the Worldline Acquiring platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Acquiring platform returned any other error
     */
    public void getDisputeDocument(String disputeId, String documentId, BodyHandler bodyHandler, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("disputeId", disputeId);
        pathContext.put("documentId", documentId);
        String uri = instantiateUri("/dispute-management/v1/disputes/{disputeId}/documents/{documentId}", pathContext);
        try {
            communicator.get(
                    uri,
                    null,
                    null,
                    bodyHandler,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ApiPaymentErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }
}
