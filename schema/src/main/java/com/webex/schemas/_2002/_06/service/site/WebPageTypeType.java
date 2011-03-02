
package com.webex.schemas._2002._06.service.site;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for webPageTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="webPageTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="J2EE"/>
 *     &lt;enumeration value="PHP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "webPageTypeType")
@XmlEnum
public enum WebPageTypeType {

    @XmlEnumValue("J2EE")
    J_2_EE("J2EE"),
    PHP("PHP");
    private final String value;

    WebPageTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WebPageTypeType fromValue(String v) {
        for (WebPageTypeType c: WebPageTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
