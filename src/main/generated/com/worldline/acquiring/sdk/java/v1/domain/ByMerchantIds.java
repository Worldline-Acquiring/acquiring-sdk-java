/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

import java.util.List;

public class ByMerchantIds extends MerchantScope {

    public static final String MERCHANT_SCOPE_TYPE = "BY_MERCHANT_IDS";

    private List<MerchantIdItem> merchantIds;

    public ByMerchantIds() {
        this.merchantScopeType = MERCHANT_SCOPE_TYPE;
    }

    public List<MerchantIdItem> getMerchantIds() {
        return merchantIds;
    }

    public void setMerchantIds(List<MerchantIdItem> value) {
        this.merchantIds = value;
    }

    public ByMerchantIds withMerchantIds(List<MerchantIdItem> value) {
        this.merchantIds = value;
        return this;
    }
}
