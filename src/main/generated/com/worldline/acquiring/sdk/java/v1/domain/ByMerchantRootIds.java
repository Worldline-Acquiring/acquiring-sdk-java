/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

import java.util.List;

public class ByMerchantRootIds extends MerchantScope {

    public static final String MERCHANT_SCOPE_TYPE = "BY_MERCHANT_ROOT_IDS";

    private List<MerchantRootIdItem> merchantRootIds;

    public ByMerchantRootIds() {
        this.merchantScopeType = MERCHANT_SCOPE_TYPE;
    }

    public List<MerchantRootIdItem> getMerchantRootIds() {
        return merchantRootIds;
    }

    public void setMerchantRootIds(List<MerchantRootIdItem> value) {
        this.merchantRootIds = value;
    }

    public ByMerchantRootIds withMerchantRootIds(List<MerchantRootIdItem> value) {
        this.merchantRootIds = value;
        return this;
    }
}
