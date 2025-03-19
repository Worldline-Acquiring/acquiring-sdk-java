/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class ServiceLocationAddress {

    private String city;

    private String countryCode;

    private String countrySubdivisionCode;

    private String postalCode;

    /**
     * Address city
     */
    public String getCity() {
        return city;
    }

    /**
     * Address city
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Address city
     */
    public ServiceLocationAddress withCity(String value) {
        this.city = value;
        return this;
    }

    /**
     * Address country code, ISO 3166 international standard
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Address country code, ISO 3166 international standard
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Address country code, ISO 3166 international standard
     */
    public ServiceLocationAddress withCountryCode(String value) {
        this.countryCode = value;
        return this;
    }

    /**
     * Address country subdivision code, see <a href="https://docs.acquiring.worldline-solutions.com/Features/References/country-subdivision-codes">list</a> for details
     */
    public String getCountrySubdivisionCode() {
        return countrySubdivisionCode;
    }

    /**
     * Address country subdivision code, see <a href="https://docs.acquiring.worldline-solutions.com/Features/References/country-subdivision-codes">list</a> for details
     */
    public void setCountrySubdivisionCode(String value) {
        this.countrySubdivisionCode = value;
    }

    /**
     * Address country subdivision code, see <a href="https://docs.acquiring.worldline-solutions.com/Features/References/country-subdivision-codes">list</a> for details
     */
    public ServiceLocationAddress withCountrySubdivisionCode(String value) {
        this.countrySubdivisionCode = value;
        return this;
    }

    /**
     * Address postal code
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Address postal code
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Address postal code
     */
    public ServiceLocationAddress withPostalCode(String value) {
        this.postalCode = value;
        return this;
    }
}
