/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.disputedocuments;

import com.worldline.acquiring.sdk.java.communication.MultipartFormDataObject;
import com.worldline.acquiring.sdk.java.communication.MultipartFormDataRequest;
import com.worldline.acquiring.sdk.java.domain.UploadableFile;

/**
 * Multipart/form-data parameters for
 * <a href="https://docs.acquiring.worldline-solutions.com/api-reference#tag/Dispute-Documents/operation/uploadDisputeDocument">Upload Dispute Document</a>
 */
public class UploadDisputeDocumentRequest implements MultipartFormDataRequest {

    private UploadableFile file;

    /**
     * The file to upload as evidence. The file must be provided in the multipart form data of the request.
     */
    public UploadableFile getFile() {
        return file;
    }

    /**
     * The file to upload as evidence. The file must be provided in the multipart form data of the request.
     */
    public void setFile(UploadableFile value) {
        this.file = value;
    }

    @Override
    public MultipartFormDataObject toMultipartFormDataObject() {
        MultipartFormDataObject result = new MultipartFormDataObject();
        if (file != null) {
            result.addFile("file", file);
        }
        return result;
    }
}
