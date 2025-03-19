/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

import java.math.BigDecimal;

public class GeoCoordinates {

    private BigDecimal latitude;

    private BigDecimal longitude;

    /**
     * Latitude of the service location
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * Latitude of the service location
     */
    public void setLatitude(BigDecimal value) {
        this.latitude = value;
    }

    /**
     * Latitude of the service location
     */
    public GeoCoordinates withLatitude(BigDecimal value) {
        this.latitude = value;
        return this;
    }

    /**
     * Longitude of the service location
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * Longitude of the service location
     */
    public void setLongitude(BigDecimal value) {
        this.longitude = value;
    }

    /**
     * Longitude of the service location
     */
    public GeoCoordinates withLongitude(BigDecimal value) {
        this.longitude = value;
        return this;
    }
}
