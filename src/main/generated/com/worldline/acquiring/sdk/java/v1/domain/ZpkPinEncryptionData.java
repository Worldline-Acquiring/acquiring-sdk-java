/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class ZpkPinEncryptionData extends PinEncryptionData {

    public static final String PIN_ENCRYPTION_TYPE = "ZPK";

    private String zonePinKeyId;

    public ZpkPinEncryptionData() {
        this.pinEncryptionType = PIN_ENCRYPTION_TYPE;
    }

    /**
     * ID of the Zone PIN Key if ZPK encryption is used for the PIN block
     */
    public String getZonePinKeyId() {
        return zonePinKeyId;
    }

    /**
     * ID of the Zone PIN Key if ZPK encryption is used for the PIN block
     */
    public void setZonePinKeyId(String value) {
        this.zonePinKeyId = value;
    }

    /**
     * ID of the Zone PIN Key if ZPK encryption is used for the PIN block
     */
    public ZpkPinEncryptionData withZonePinKeyId(String value) {
        this.zonePinKeyId = value;
        return this;
    }
}
