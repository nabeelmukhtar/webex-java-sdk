
package com.webex.schemas._2002._06.service.user;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for imageForType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="imageForType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Photo"/>
 *     &lt;enumeration value="Header"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "imageForType")
@XmlEnum
public enum ImageForType {

    @XmlEnumValue("Photo")
    PHOTO("Photo"),
    @XmlEnumValue("Header")
    HEADER("Header");
    private final String value;

    ImageForType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImageForType fromValue(String v) {
        for (ImageForType c: ImageForType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
