/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class DukptPinEncryptionData extends PinEncryptionData {

    public static final String PIN_ENCRYPTION_TYPE = "DUKPT";

    private String keySerialNumber;

    public DukptPinEncryptionData() {
        this.pinEncryptionType = PIN_ENCRYPTION_TYPE;
    }

    /**
     * Key Serial Number (KSN) if DUKPT encryption is used for the PIN block (3DES: 10 b, AES: 12 b)
     */
    public String getKeySerialNumber() {
        return keySerialNumber;
    }

    /**
     * Key Serial Number (KSN) if DUKPT encryption is used for the PIN block (3DES: 10 b, AES: 12 b)
     */
    public void setKeySerialNumber(String value) {
        this.keySerialNumber = value;
    }

    /**
     * Key Serial Number (KSN) if DUKPT encryption is used for the PIN block (3DES: 10 b, AES: 12 b)
     */
    public DukptPinEncryptionData withKeySerialNumber(String value) {
        this.keySerialNumber = value;
        return this;
    }
}
