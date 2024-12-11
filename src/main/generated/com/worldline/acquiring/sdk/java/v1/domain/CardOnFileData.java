/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class CardOnFileData {

    private InitialCardOnFileData initialCardOnFileData;

    private Boolean isInitialTransaction;

    private SubsequentCardOnFileData subsequentCardOnFileData;

    public InitialCardOnFileData getInitialCardOnFileData() {
        return initialCardOnFileData;
    }

    public void setInitialCardOnFileData(InitialCardOnFileData value) {
        this.initialCardOnFileData = value;
    }

    public CardOnFileData withInitialCardOnFileData(InitialCardOnFileData value) {
        this.initialCardOnFileData = value;
        return this;
    }

    /**
     * Indicate whether this is the initial Card on File transaction or not
     */
    public Boolean getIsInitialTransaction() {
        return isInitialTransaction;
    }

    /**
     * Indicate whether this is the initial Card on File transaction or not
     */
    public void setIsInitialTransaction(Boolean value) {
        this.isInitialTransaction = value;
    }

    /**
     * Indicate whether this is the initial Card on File transaction or not
     */
    public CardOnFileData withIsInitialTransaction(Boolean value) {
        this.isInitialTransaction = value;
        return this;
    }

    public SubsequentCardOnFileData getSubsequentCardOnFileData() {
        return subsequentCardOnFileData;
    }

    public void setSubsequentCardOnFileData(SubsequentCardOnFileData value) {
        this.subsequentCardOnFileData = value;
    }

    public CardOnFileData withSubsequentCardOnFileData(SubsequentCardOnFileData value) {
        this.subsequentCardOnFileData = value;
        return this;
    }
}
