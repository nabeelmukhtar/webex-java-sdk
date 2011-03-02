
package com.webex.schemas._2002._06.service.site;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


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
@XmlType(name = "headerImageLocationType")
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
        throw new IllegalArgumentException(v);
    }

}
