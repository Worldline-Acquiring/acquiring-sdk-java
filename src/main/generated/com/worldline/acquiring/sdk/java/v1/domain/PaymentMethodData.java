/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class PaymentMethodData extends PaymentMethodDataBase {

    private String issuingCountryCode;

    /**
     * Address country code, ISO 3166 international standard
     */
    public String getIssuingCountryCode() {
        return issuingCountryCode;
    }

    /**
     * Address country code, ISO 3166 international standard
     */
    public void setIssuingCountryCode(String value) {
        this.issuingCountryCode = value;
    }

    /**
     * Address country code, ISO 3166 international standard
     */
    public PaymentMethodData withIssuingCountryCode(String value) {
        this.issuingCountryCode = value;
        return this;
    }

    /**
     * The masked identifier of the card used in the original transaction that led to the dispute.
     * The masked identifier typically includes the first six and last four digits of the card number, with the middle
     * digits replaced by asterisks or other masking characters. Different masking patterns are used for card and non-card
     * payment methods.
     * <ul>
     *   <li>Card: 717171*******1234</li>
     *   <li>Non-Card: DE89****4567</li>
     *   <li>Non-Card: j***@email.com</li>
     * </ul>
     */
    @Override
    public PaymentMethodData withMaskedIdentifier(String value) {
        super.withMaskedIdentifier(value);
        return this;
    }

    /**
     * The card scheme used in the original transaction that led to the dispute.
     * <p>
     * Common values:
     * <ul>
     *   <li>{@code MASTERCARD} (Mastercard)</li>
     *   <li>{@code VISA} (Visa)</li>
     *   <li>{@code JCB} (Japan Credit Bureau)</li>
     *   <li>{@code UNION_PAY} (UnionPay International)</li>
     *   <li>{@code DINERS} (Diners)</li>
     *   <li>{@code EUROPEAN_PAYMENTS_INITIATIVE} (European Payment Initiative (Wero))</li>
     *   <li>{@code CARTE_BANCAIRES} (Cartes Bancaires)</li>
     *   <li>{@code EFTPOS} (EFTPOS (Electronic Funds Transfer at Point of Sale))</li>
     * </ul>
     * <p>
     * Support for new schemes may be introduced without notice. Clients should handle unknown values gracefully.
     */
    @Override
    public PaymentMethodData withScheme(String value) {
        super.withScheme(value);
        return this;
    }

    /**
     * The card scheme brand used in the original transaction that led to the dispute.
     * <p>
     * Possible values are:
     * <ul>
     *   <li>{@code MSI} (Maestro Debit Card)</li>
     *   <li>{@code MCC} (MasterCard Credit Card)</li>
     *   <li>{@code CIR} (Cirrus Debit Card)</li>
     *   <li>{@code DMC} (MasterCard Debit Card)</li>
     *   <li>{@code VISA} (VISA Credit Card)</li>
     *   <li>{@code VPAY} (V PAY)</li>
     *   <li>{@code PLUS} (PLUS)</li>
     *   <li>{@code ELEC} (Visa Electron)</li>
     *   <li>{@code JCB} (JCB)</li>
     *   <li>{@code CUP} (China Union Pay Credit Card)</li>
     *   <li>{@code DINER} (DINERS credit card)</li>
     *   <li>{@code EFTPOS} (EFTPOS, for Australia)</li>
     *   <li>{@code CB} (Cartes Bancaires Domestic Scheme France)</li>
     *   <li>{@code WERO} (European payment solution developed by EPI)</li>
     * </ul>
     */
    @Override
    public PaymentMethodData withSchemeBrand(String value) {
        super.withSchemeBrand(value);
        return this;
    }
}
