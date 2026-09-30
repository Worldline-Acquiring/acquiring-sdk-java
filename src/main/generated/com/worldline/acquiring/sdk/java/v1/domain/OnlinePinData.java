/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class OnlinePinData {

    private String encryptedPinBlock;

    private Integer pinBlockFormat;

    private PinEncryptionData pinEncryptionData;

    /**
     * Encrypted data containing a PIN
     */
    public String getEncryptedPinBlock() {
        return encryptedPinBlock;
    }

    /**
     * Encrypted data containing a PIN
     */
    public void setEncryptedPinBlock(String value) {
        this.encryptedPinBlock = value;
    }

    /**
     * Encrypted data containing a PIN
     */
    public OnlinePinData withEncryptedPinBlock(String value) {
        this.encryptedPinBlock = value;
        return this;
    }

    /**
     * ISO 9564 based PIN block format.
     * <p>
     * Worldline acquiring only supports the following format:
     * <ul>
     *   <li>4 - ISO-4</li>
     * </ul>
     * <p>
     * Bambora acquiring supports the following formats:
     * <ul>
     *   <li>0 - ISO 9564-1 Format 0 (Standard PIN block format with PAN XOR, commonly used with 3DES / DUKPT).</li>
     *   <li>1 - ISO 9564-1 Format 1 (PIN block with transaction sequence/random number).</li>
     *   <li>2 - ISO 9564-1 Format 2 (Primarily used for offline/smart cards).</li>
     *   <li>3 - ISO 9564-1 Format 3 (Similar to Format 0 with random fill digits).</li>
     *   <li>4 - ISO 9564-1 Format 4 (AES-256 encrypted PIN block format, required for modern Online PIN / Tap on Mobile CVM solutions).</li>
     * </ul>
     */
    public Integer getPinBlockFormat() {
        return pinBlockFormat;
    }

    /**
     * ISO 9564 based PIN block format.
     * <p>
     * Worldline acquiring only supports the following format:
     * <ul>
     *   <li>4 - ISO-4</li>
     * </ul>
     * <p>
     * Bambora acquiring supports the following formats:
     * <ul>
     *   <li>0 - ISO 9564-1 Format 0 (Standard PIN block format with PAN XOR, commonly used with 3DES / DUKPT).</li>
     *   <li>1 - ISO 9564-1 Format 1 (PIN block with transaction sequence/random number).</li>
     *   <li>2 - ISO 9564-1 Format 2 (Primarily used for offline/smart cards).</li>
     *   <li>3 - ISO 9564-1 Format 3 (Similar to Format 0 with random fill digits).</li>
     *   <li>4 - ISO 9564-1 Format 4 (AES-256 encrypted PIN block format, required for modern Online PIN / Tap on Mobile CVM solutions).</li>
     * </ul>
     */
    public void setPinBlockFormat(Integer value) {
        this.pinBlockFormat = value;
    }

    /**
     * ISO 9564 based PIN block format.
     * <p>
     * Worldline acquiring only supports the following format:
     * <ul>
     *   <li>4 - ISO-4</li>
     * </ul>
     * <p>
     * Bambora acquiring supports the following formats:
     * <ul>
     *   <li>0 - ISO 9564-1 Format 0 (Standard PIN block format with PAN XOR, commonly used with 3DES / DUKPT).</li>
     *   <li>1 - ISO 9564-1 Format 1 (PIN block with transaction sequence/random number).</li>
     *   <li>2 - ISO 9564-1 Format 2 (Primarily used for offline/smart cards).</li>
     *   <li>3 - ISO 9564-1 Format 3 (Similar to Format 0 with random fill digits).</li>
     *   <li>4 - ISO 9564-1 Format 4 (AES-256 encrypted PIN block format, required for modern Online PIN / Tap on Mobile CVM solutions).</li>
     * </ul>
     */
    public OnlinePinData withPinBlockFormat(Integer value) {
        this.pinBlockFormat = value;
        return this;
    }

    /**
     * PIN encryption details used for the {@code encryptedPinBlock}.
     * <p>
     * The following variants are supported:
     * <ul>
     *   <li>AES_UKPT - Used in combination with Worldline acquirers</li>
     *   <li>DUKPT - Used in combination with the Bambora acquirer</li>
     *   <li>ZPK - Zone PIN Key, used in combination with the Bambora acquirer</li>
     * </ul>
     */
    public PinEncryptionData getPinEncryptionData() {
        return pinEncryptionData;
    }

    /**
     * PIN encryption details used for the {@code encryptedPinBlock}.
     * <p>
     * The following variants are supported:
     * <ul>
     *   <li>AES_UKPT - Used in combination with Worldline acquirers</li>
     *   <li>DUKPT - Used in combination with the Bambora acquirer</li>
     *   <li>ZPK - Zone PIN Key, used in combination with the Bambora acquirer</li>
     * </ul>
     */
    public void setPinEncryptionData(PinEncryptionData value) {
        this.pinEncryptionData = value;
    }

    /**
     * PIN encryption details used for the {@code encryptedPinBlock}.
     * <p>
     * The following variants are supported:
     * <ul>
     *   <li>AES_UKPT - Used in combination with Worldline acquirers</li>
     *   <li>DUKPT - Used in combination with the Bambora acquirer</li>
     *   <li>ZPK - Zone PIN Key, used in combination with the Bambora acquirer</li>
     * </ul>
     */
    public OnlinePinData withPinEncryptionData(PinEncryptionData value) {
        this.pinEncryptionData = value;
        return this;
    }
}
