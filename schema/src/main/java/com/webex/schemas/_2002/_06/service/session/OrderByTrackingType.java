
package com.webex.schemas._2002._06.service.session;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orderByTrackingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="orderByTrackingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HOSTWEBEXID"/>
 *     &lt;enumeration value="CONFNAME"/>
 *     &lt;enumeration value="STARTTIME"/>
 *     &lt;enumeration value="TRACKINGCODE1"/>
 *     &lt;enumeration value="TRACKINGCODE2"/>
 *     &lt;enumeration value="TRACKINGCODE3"/>
 *     &lt;enumeration value="TRACKINGCODE4"/>
 *     &lt;enumeration value="TRACKINGCODE5"/>
 *     &lt;enumeration value="TRACKINGCODE6"/>
 *     &lt;enumeration value="TRACKINGCODE7"/>
 *     &lt;enumeration value="TRACKINGCODE8"/>
 *     &lt;enumeration value="TRACKINGCODE9"/>
 *     &lt;enumeration value="TRACKINGCODE10"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "orderByTrackingType")
@XmlEnum
public enum OrderByTrackingType {

    HOSTWEBEXID("HOSTWEBEXID"),
    CONFNAME("CONFNAME"),
    STARTTIME("STARTTIME"),
    @XmlEnumValue("TRACKINGCODE1")
    TRACKINGCODE_1("TRACKINGCODE1"),
    @XmlEnumValue("TRACKINGCODE2")
    TRACKINGCODE_2("TRACKINGCODE2"),
    @XmlEnumValue("TRACKINGCODE3")
    TRACKINGCODE_3("TRACKINGCODE3"),
    @XmlEnumValue("TRACKINGCODE4")
    TRACKINGCODE_4("TRACKINGCODE4"),
    @XmlEnumValue("TRACKINGCODE5")
    TRACKINGCODE_5("TRACKINGCODE5"),
    @XmlEnumValue("TRACKINGCODE6")
    TRACKINGCODE_6("TRACKINGCODE6"),
    @XmlEnumValue("TRACKINGCODE7")
    TRACKINGCODE_7("TRACKINGCODE7"),
    @XmlEnumValue("TRACKINGCODE8")
    TRACKINGCODE_8("TRACKINGCODE8"),
    @XmlEnumValue("TRACKINGCODE9")
    TRACKINGCODE_9("TRACKINGCODE9"),
    @XmlEnumValue("TRACKINGCODE10")
    TRACKINGCODE_10("TRACKINGCODE10");
    private final String value;

    OrderByTrackingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderByTrackingType fromValue(String v) {
        for (OrderByTrackingType c: OrderByTrackingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
