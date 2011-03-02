
package com.webex.schemas._2002._06.service.user;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for scTabType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="scTabType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Tools"/>
 *     &lt;enumeration value="Desktop"/>
 *     &lt;enumeration value="Application"/>
 *     &lt;enumeration value="Session"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "scTabType")
@XmlEnum
public enum ScTabType {

    @XmlEnumValue("Tools")
    TOOLS("Tools"),
    @XmlEnumValue("Desktop")
    DESKTOP("Desktop"),
    @XmlEnumValue("Application")
    APPLICATION("Application"),
    @XmlEnumValue("Session")
    SESSION("Session");
    private final String value;

    ScTabType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScTabType fromValue(String v) {
        for (ScTabType c: ScTabType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
