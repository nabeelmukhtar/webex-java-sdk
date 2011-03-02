
package com.webex.schemas._2002._06.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for browserType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="browserType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IE5X"/>
 *     &lt;enumeration value="NAX6X"/>
 *     &lt;enumeration value="NAX4X"/>
 *     &lt;enumeration value="IE4X"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "browserType")
@XmlEnum
public enum BrowserType {

    @XmlEnumValue("IE5X")
    IE_5_X("IE5X"),
    @XmlEnumValue("NAX6X")
    NAX_6_X("NAX6X"),
    @XmlEnumValue("NAX4X")
    NAX_4_X("NAX4X"),
    @XmlEnumValue("IE4X")
    IE_4_X("IE4X");
    private final String value;

    BrowserType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BrowserType fromValue(String v) {
        for (BrowserType c: BrowserType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
