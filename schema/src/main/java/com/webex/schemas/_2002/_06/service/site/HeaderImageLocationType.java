//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.28 at 12:47:51 PM GMT+05:00 
//


package com.webex.schemas._2002._06.service.site;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for headerImageLocationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="headerImageLocationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Above"/>
 *     &lt;enumeration value="Replace"/>
 *     &lt;enumeration value="Below"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum HeaderImageLocationType {

    @XmlEnumValue("Above")
    ABOVE("Above"),
    @XmlEnumValue("Replace")
    REPLACE("Replace"),
    @XmlEnumValue("Below")
    BELOW("Below");
    private final String value;

    HeaderImageLocationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HeaderImageLocationType fromValue(String v) {
        for (HeaderImageLocationType c: HeaderImageLocationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
