/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class AesUkptPinEncryptionData extends PinEncryptionData {

    public static final String PIN_ENCRYPTION_TYPE = "AES_UKPT";

    private Integer keyGeneration;

    private String randomValue;

    public AesUkptPinEncryptionData() {
        this.pinEncryptionType = PIN_ENCRYPTION_TYPE;
    }

    /**
     * Generation/Version of the master key that was agreed with the partner
     */
    public Integer getKeyGeneration() {
        return keyGeneration;
    }

    /**
     * Generation/Version of the master key that was agreed with the partner
     */
    public void setKeyGeneration(Integer value) {
        this.keyGeneration = value;
    }

    /**
     * Generation/Version of the master key that was agreed with the partner
     */
    public AesUkptPinEncryptionData withKeyGeneration(Integer value) {
        this.keyGeneration = value;
        return this;
    }

    /**
     * 16-byte binary random value to derive the PIN encryption session key
     */
    public String getRandomValue() {
        return randomValue;
    }

    /**
     * 16-byte binary random value to derive the PIN encryption session key
     */
    public void setRandomValue(String value) {
        this.randomValue = value;
    }

    /**
     * 16-byte binary random value to derive the PIN encryption session key
     */
    public AesUkptPinEncryptionData withRandomValue(String value) {
        this.randomValue = value;
        return this;
    }
}
