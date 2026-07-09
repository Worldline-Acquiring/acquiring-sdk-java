/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class AmountBreakdownData {

    private AmountData cashbackAmount;

    private AmountData tipAmount;

    /**
     * Optional amount of cashback for card-present transactions.
     * <p>
     * The amount specified is included in the total transaction {@code amount}, the information is provided
     * for data enrichment and reconciliation purposes.
     * <p>
     * Only supported in some regions with restrictions, depending on local regulation and card scheme rules.
     * Please check with your Worldline contact if you are allowed to use this field.
     */
    public AmountData getCashbackAmount() {
        return cashbackAmount;
    }

    /**
     * Optional amount of cashback for card-present transactions.
     * <p>
     * The amount specified is included in the total transaction {@code amount}, the information is provided
     * for data enrichment and reconciliation purposes.
     * <p>
     * Only supported in some regions with restrictions, depending on local regulation and card scheme rules.
     * Please check with your Worldline contact if you are allowed to use this field.
     */
    public void setCashbackAmount(AmountData value) {
        this.cashbackAmount = value;
    }

    /**
     * Optional amount of cashback for card-present transactions.
     * <p>
     * The amount specified is included in the total transaction {@code amount}, the information is provided
     * for data enrichment and reconciliation purposes.
     * <p>
     * Only supported in some regions with restrictions, depending on local regulation and card scheme rules.
     * Please check with your Worldline contact if you are allowed to use this field.
     */
    public AmountBreakdownData withCashbackAmount(AmountData value) {
        this.cashbackAmount = value;
        return this;
    }

    /**
     * Optional amount of tip.
     * <p>
     * The amount specified is included in the total transaction {@code amount}, the information is provided
     * for data enrichment and reconciliation purposes.
     */
    public AmountData getTipAmount() {
        return tipAmount;
    }

    /**
     * Optional amount of tip.
     * <p>
     * The amount specified is included in the total transaction {@code amount}, the information is provided
     * for data enrichment and reconciliation purposes.
     */
    public void setTipAmount(AmountData value) {
        this.tipAmount = value;
    }

    /**
     * Optional amount of tip.
     * <p>
     * The amount specified is included in the total transaction {@code amount}, the information is provided
     * for data enrichment and reconciliation purposes.
     */
    public AmountBreakdownData withTipAmount(AmountData value) {
        this.tipAmount = value;
        return this;
    }
}
