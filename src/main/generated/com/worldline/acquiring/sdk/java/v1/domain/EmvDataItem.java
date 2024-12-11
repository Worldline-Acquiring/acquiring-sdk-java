/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class EmvDataItem {

    private String tag;

    private String value;

    /**
     * EMV tag
     */
    public String getTag() {
        return tag;
    }

    /**
     * EMV tag
     */
    public void setTag(String value) {
        this.tag = value;
    }

    /**
     * EMV tag
     */
    public EmvDataItem withTag(String value) {
        this.tag = value;
        return this;
    }

    /**
     * EMV value encoded in base64
     */
    public String getValue() {
        return value;
    }

    /**
     * EMV value encoded in base64
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * EMV value encoded in base64
     */
    public EmvDataItem withValue(String value) {
        this.value = value;
        return this;
    }
}
