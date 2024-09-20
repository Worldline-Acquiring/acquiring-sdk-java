package com.worldline.acquiring.sdk.java.authentication;

class OAuth2AccessToken {

    private final String accessToken;
    private final long expirationTime;

    OAuth2AccessToken(String accessToken, long expirationTime) {
        this.accessToken = accessToken;
        this.expirationTime = expirationTime;
    }

    String getAccessToken() {
        return accessToken;
    }

    long getExpirationTime() {
        return expirationTime;
    }
}
