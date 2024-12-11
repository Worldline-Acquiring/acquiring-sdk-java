/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

import java.util.List;

public class TerminalData {

    private Boolean allowSingleTap;

    private List<String> cardReadingCapabilities;

    private String cardholderActivatedTerminalLevel;

    private Boolean isAttendedTerminal;

    private String pinEntryCapability;

    private String terminalId;

    private String terminalLocation;

    /**
     * Indicate whether the terminal allow one single tap for a contactless transaction
     * followed by a PIN entry if the contactless transaction is refused
     */
    public Boolean getAllowSingleTap() {
        return allowSingleTap;
    }

    /**
     * Indicate whether the terminal allow one single tap for a contactless transaction
     * followed by a PIN entry if the contactless transaction is refused
     */
    public void setAllowSingleTap(Boolean value) {
        this.allowSingleTap = value;
    }

    /**
     * Indicate whether the terminal allow one single tap for a contactless transaction
     * followed by a PIN entry if the contactless transaction is refused
     */
    public TerminalData withAllowSingleTap(Boolean value) {
        this.allowSingleTap = value;
        return this;
    }

    /**
     * Card reading capabilities of the terminal.
     */
    public List<String> getCardReadingCapabilities() {
        return cardReadingCapabilities;
    }

    /**
     * Card reading capabilities of the terminal.
     */
    public void setCardReadingCapabilities(List<String> value) {
        this.cardReadingCapabilities = value;
    }

    /**
     * Card reading capabilities of the terminal.
     */
    public TerminalData withCardReadingCapabilities(List<String> value) {
        this.cardReadingCapabilities = value;
        return this;
    }

    /**
     * Level of security for a terminal activated with the use of a card (Cardholder Activated Terminal)
     */
    public String getCardholderActivatedTerminalLevel() {
        return cardholderActivatedTerminalLevel;
    }

    /**
     * Level of security for a terminal activated with the use of a card (Cardholder Activated Terminal)
     */
    public void setCardholderActivatedTerminalLevel(String value) {
        this.cardholderActivatedTerminalLevel = value;
    }

    /**
     * Level of security for a terminal activated with the use of a card (Cardholder Activated Terminal)
     */
    public TerminalData withCardholderActivatedTerminalLevel(String value) {
        this.cardholderActivatedTerminalLevel = value;
        return this;
    }

    /**
     * Indicate whether the terminal is attended or not
     */
    public Boolean getIsAttendedTerminal() {
        return isAttendedTerminal;
    }

    /**
     * Indicate whether the terminal is attended or not
     */
    public void setIsAttendedTerminal(Boolean value) {
        this.isAttendedTerminal = value;
    }

    /**
     * Indicate whether the terminal is attended or not
     */
    public TerminalData withIsAttendedTerminal(Boolean value) {
        this.isAttendedTerminal = value;
        return this;
    }

    /**
     * The capabilities of the terminal to enter the PIN
     * <ul>
     *   <li>UNKNOWN : Unspecified or unknown</li>
     *   <li>PRESENT : Terminal has PIN entry capability</li>
     *   <li>ABSENT : Terminal does not have PIN entry capability</li>
     *   <li>MPOS_SOFTWARE_BASED_PIN : Mobile POS with PIN entry capability</li>
     *   <li>NOT_OPERATIVE : Terminal has PIN entry capability but PIN pad is not currently operative</li>
     * </ul>
     */
    public String getPinEntryCapability() {
        return pinEntryCapability;
    }

    /**
     * The capabilities of the terminal to enter the PIN
     * <ul>
     *   <li>UNKNOWN : Unspecified or unknown</li>
     *   <li>PRESENT : Terminal has PIN entry capability</li>
     *   <li>ABSENT : Terminal does not have PIN entry capability</li>
     *   <li>MPOS_SOFTWARE_BASED_PIN : Mobile POS with PIN entry capability</li>
     *   <li>NOT_OPERATIVE : Terminal has PIN entry capability but PIN pad is not currently operative</li>
     * </ul>
     */
    public void setPinEntryCapability(String value) {
        this.pinEntryCapability = value;
    }

    /**
     * The capabilities of the terminal to enter the PIN
     * <ul>
     *   <li>UNKNOWN : Unspecified or unknown</li>
     *   <li>PRESENT : Terminal has PIN entry capability</li>
     *   <li>ABSENT : Terminal does not have PIN entry capability</li>
     *   <li>MPOS_SOFTWARE_BASED_PIN : Mobile POS with PIN entry capability</li>
     *   <li>NOT_OPERATIVE : Terminal has PIN entry capability but PIN pad is not currently operative</li>
     * </ul>
     */
    public TerminalData withPinEntryCapability(String value) {
        this.pinEntryCapability = value;
        return this;
    }

    /**
     * The identifier of the terminal
     */
    public String getTerminalId() {
        return terminalId;
    }

    /**
     * The identifier of the terminal
     */
    public void setTerminalId(String value) {
        this.terminalId = value;
    }

    /**
     * The identifier of the terminal
     */
    public TerminalData withTerminalId(String value) {
        this.terminalId = value;
        return this;
    }

    /**
     * The location of the terminal
     */
    public String getTerminalLocation() {
        return terminalLocation;
    }

    /**
     * The location of the terminal
     */
    public void setTerminalLocation(String value) {
        this.terminalLocation = value;
    }

    /**
     * The location of the terminal
     */
    public TerminalData withTerminalLocation(String value) {
        this.terminalLocation = value;
        return this;
    }
}
