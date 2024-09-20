package com.worldline.acquiring.sdk.java.authentication;

/**
 * Indicates an exception regarding the authorization with the Worldline OAuth2 Authorization Server.
 */
@SuppressWarnings("serial")
public class OAuth2Exception extends RuntimeException {

    public OAuth2Exception(String message) {
        super(message);
    }
}
