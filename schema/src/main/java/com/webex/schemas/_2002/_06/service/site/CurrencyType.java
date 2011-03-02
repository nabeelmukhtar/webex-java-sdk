
package com.webex.schemas._2002._06.service.site;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for currencyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="currencyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="US Dollars"/>
 *     &lt;enumeration value="Australian Dollars"/>
 *     &lt;enumeration value="Canadian Dollars"/>
 *     &lt;enumeration value="British Pounds"/>
 *     &lt;enumeration value="Euros"/>
 *     &lt;enumeration value="French Francs"/>
 *     &lt;enumeration value="Deutschmarks"/>
 *     &lt;enumeration value="Hong Kong Dollars"/>
 *     &lt;enumeration value="Italian Lira"/>
 *     &lt;enumeration value="Japanese Yen"/>
 *     &lt;enumeration value="New Zealand Dollars"/>
 *     &lt;enumeration value="Swiss Francs"/>
 *     &lt;enumeration value="Korean Won"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "currencyType")
@XmlEnum
public enum CurrencyType {

    @XmlEnumValue("US Dollars")
    US_DOLLARS("US Dollars"),
    @XmlEnumValue("Australian Dollars")
    AUSTRALIAN_DOLLARS("Australian Dollars"),
    @XmlEnumValue("Canadian Dollars")
    CANADIAN_DOLLARS("Canadian Dollars"),
    @XmlEnumValue("British Pounds")
    BRITISH_POUNDS("British Pounds"),
    @XmlEnumValue("Euros")
    EUROS("Euros"),
    @XmlEnumValue("French Francs")
    FRENCH_FRANCS("French Francs"),
    @XmlEnumValue("Deutschmarks")
    DEUTSCHMARKS("Deutschmarks"),
    @XmlEnumValue("Hong Kong Dollars")
    HONG_KONG_DOLLARS("Hong Kong Dollars"),
    @XmlEnumValue("Italian Lira")
    ITALIAN_LIRA("Italian Lira"),
    @XmlEnumValue("Japanese Yen")
    JAPANESE_YEN("Japanese Yen"),
    @XmlEnumValue("New Zealand Dollars")
    NEW_ZEALAND_DOLLARS("New Zealand Dollars"),
    @XmlEnumValue("Swiss Francs")
    SWISS_FRANCS("Swiss Francs"),
    @XmlEnumValue("Korean Won")
    KOREAN_WON("Korean Won");
    private final String value;

    CurrencyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CurrencyType fromValue(String v) {
        for (CurrencyType c: CurrencyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
