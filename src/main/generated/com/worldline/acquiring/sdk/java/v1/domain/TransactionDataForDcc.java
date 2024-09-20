/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

import java.time.ZonedDateTime;

public class TransactionDataForDcc {

    private AmountData amount;

    private ZonedDateTime transactionTimestamp;

    private String transactionType;

    /**
     * Amount for the operation.
     */
    public AmountData getAmount() {
        return amount;
    }

    /**
     * Amount for the operation.
     */
    public void setAmount(AmountData value) {
        this.amount = value;
    }

    /**
     * The date and time of the transaction
     */
    public ZonedDateTime getTransactionTimestamp() {
        return transactionTimestamp;
    }

    /**
     * The date and time of the transaction
     */
    public void setTransactionTimestamp(ZonedDateTime value) {
        this.transactionTimestamp = value;
    }

    /**
     * The transaction type
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * The transaction type
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }
}
