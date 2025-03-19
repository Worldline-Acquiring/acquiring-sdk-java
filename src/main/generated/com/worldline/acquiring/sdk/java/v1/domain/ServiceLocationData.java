/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class ServiceLocationData {

    private ServiceLocationAddress address;

    private GeoCoordinates geoCoordinates;

    /**
     * Address where the cardholder received the service
     */
    public ServiceLocationAddress getAddress() {
        return address;
    }

    /**
     * Address where the cardholder received the service
     */
    public void setAddress(ServiceLocationAddress value) {
        this.address = value;
    }

    /**
     * Address where the cardholder received the service
     */
    public ServiceLocationData withAddress(ServiceLocationAddress value) {
        this.address = value;
        return this;
    }

    /**
     * Geographical coordinates where the cardholder received the service.
     * Geographical coordinates in decimal degree (DD) format Latitude,Longitude where Latitude and Longitude
     * are floating point numbers with the unit degree. Integer and decimal digits are separated by a dot. East
     * and north are indicated by positive numbers whereas west and south have negative ones.
     */
    public GeoCoordinates getGeoCoordinates() {
        return geoCoordinates;
    }

    /**
     * Geographical coordinates where the cardholder received the service.
     * Geographical coordinates in decimal degree (DD) format Latitude,Longitude where Latitude and Longitude
     * are floating point numbers with the unit degree. Integer and decimal digits are separated by a dot. East
     * and north are indicated by positive numbers whereas west and south have negative ones.
     */
    public void setGeoCoordinates(GeoCoordinates value) {
        this.geoCoordinates = value;
    }

    /**
     * Geographical coordinates where the cardholder received the service.
     * Geographical coordinates in decimal degree (DD) format Latitude,Longitude where Latitude and Longitude
     * are floating point numbers with the unit degree. Integer and decimal digits are separated by a dot. East
     * and north are indicated by positive numbers whereas west and south have negative ones.
     */
    public ServiceLocationData withGeoCoordinates(GeoCoordinates value) {
        this.geoCoordinates = value;
        return this;
    }
}
