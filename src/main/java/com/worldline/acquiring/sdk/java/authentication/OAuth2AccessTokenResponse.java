package com.worldline.acquiring.sdk.java.authentication;

import com.google.gson.annotations.SerializedName;

class OAuth2AccessTokenResponse {

    // Using Gson specific annotations is fine here, because this class will only be handled by DefaultMarshaller

    @SerializedName("access_token")
    private String accessToken;
    @SerializedName("expires_in")
    private Long expiresIn;
    @SerializedName("error")
    private String error;
    @SerializedName("error_description")
    private String errorDescription;

    String getAccessToken() {
        return accessToken;
    }

    void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    Long getExpiresIn() {
        return expiresIn;
    }

    void setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
    }

    String getError() {
        return error;
    }

    void setError(String error) {
        this.error = error;
    }

    String getErrorDescription() {
        return errorDescription;
    }

    void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }
}
