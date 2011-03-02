
package com.webex.schemas._2002._06.service.attendee;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orderByType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="orderByType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONFID"/>
 *     &lt;enumeration value="ATTENDEEID"/>
 *     &lt;enumeration value="ATTENDEETYPE"/>
 *     &lt;enumeration value="ATTENDEENAME"/>
 *     &lt;enumeration value="ATTENDEEWEBEXID"/>
 *     &lt;enumeration value="JOINSTATUS"/>
 *     &lt;enumeration value="EMAIL"/>
 *     &lt;enumeration value="PHONE"/>
 *     &lt;enumeration value="MOBILE"/>
 *     &lt;enumeration value="FAX"/>
 *     &lt;enumeration value="COMPANY"/>
 *     &lt;enumeration value="TITLE"/>
 *     &lt;enumeration value="URL"/>
 *     &lt;enumeration value="ADDRESS1"/>
 *     &lt;enumeration value="ADDRESS2"/>
 *     &lt;enumeration value="CITY"/>
 *     &lt;enumeration value="STATE"/>
 *     &lt;enumeration value="ZIPCODE"/>
 *     &lt;enumeration value="COUNTRY"/>
 *     &lt;enumeration value="NOTES"/>
 *     &lt;enumeration value="ADDRESSTYPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "orderByType")
@XmlEnum
public enum OrderByType {

    CONFID("CONFID"),
    ATTENDEEID("ATTENDEEID"),
    ATTENDEETYPE("ATTENDEETYPE"),
    ATTENDEENAME("ATTENDEENAME"),
    ATTENDEEWEBEXID("ATTENDEEWEBEXID"),
    JOINSTATUS("JOINSTATUS"),
    EMAIL("EMAIL"),
    PHONE("PHONE"),
    MOBILE("MOBILE"),
    FAX("FAX"),
    COMPANY("COMPANY"),
    TITLE("TITLE"),
    URL("URL"),
    @XmlEnumValue("ADDRESS1")
    ADDRESS_1("ADDRESS1"),
    @XmlEnumValue("ADDRESS2")
    ADDRESS_2("ADDRESS2"),
    CITY("CITY"),
    STATE("STATE"),
    ZIPCODE("ZIPCODE"),
    COUNTRY("COUNTRY"),
    NOTES("NOTES"),
    ADDRESSTYPE("ADDRESSTYPE");
    private final String value;

    OrderByType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderByType fromValue(String v) {
        for (OrderByType c: OrderByType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
