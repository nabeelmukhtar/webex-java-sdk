
package com.webex.schemas._2002._06.service.site;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for directoryServiceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="directoryServiceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WithoutIntegration"/>
 *     &lt;enumeration value="Integration"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "directoryServiceType")
@XmlEnum
public enum DirectoryServiceType {

    @XmlEnumValue("WithoutIntegration")
    WITHOUT_INTEGRATION("WithoutIntegration"),
    @XmlEnumValue("Integration")
    INTEGRATION("Integration");
    private final String value;

    DirectoryServiceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DirectoryServiceType fromValue(String v) {
        for (DirectoryServiceType c: DirectoryServiceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
