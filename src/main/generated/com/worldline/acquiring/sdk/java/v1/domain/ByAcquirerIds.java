/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

import java.util.List;

public class ByAcquirerIds extends MerchantScope {

    public static final String MERCHANT_SCOPE_TYPE = "BY_ACQUIRER_IDS";

    private List<String> acquirerIds;

    public ByAcquirerIds() {
        this.merchantScopeType = MERCHANT_SCOPE_TYPE;
    }

    public List<String> getAcquirerIds() {
        return acquirerIds;
    }

    public void setAcquirerIds(List<String> value) {
        this.acquirerIds = value;
    }

    public ByAcquirerIds withAcquirerIds(List<String> value) {
        this.acquirerIds = value;
        return this;
    }
}
