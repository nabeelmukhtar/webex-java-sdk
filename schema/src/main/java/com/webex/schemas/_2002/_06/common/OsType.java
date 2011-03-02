
package com.webex.schemas._2002._06.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for osType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="osType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WIN2K"/>
 *     &lt;enumeration value="WINNT"/>
 *     &lt;enumeration value="WIN9X"/>
 *     &lt;enumeration value="LINUX"/>
 *     &lt;enumeration value="HPUX"/>
 *     &lt;enumeration value="AIX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "osType")
@XmlEnum
public enum OsType {

    @XmlEnumValue("WIN2K")
    WIN_2_K("WIN2K"),
    WINNT("WINNT"),
    @XmlEnumValue("WIN9X")
    WIN_9_X("WIN9X"),
    LINUX("LINUX"),
    HPUX("HPUX"),
    AIX("AIX");
    private final String value;

    OsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OsType fromValue(String v) {
        for (OsType c: OsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
