
package com.webex.schemas._2002._06.service.site;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for limitsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="limitsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STRICT"/>
 *     &lt;enumeration value="WARN_EXCEED"/>
 *     &lt;enumeration value="NONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "limitsType")
@XmlEnum
public enum LimitsType {

    STRICT,
    WARN_EXCEED,
    NONE;

    public String value() {
        return name();
    }

    public static LimitsType fromValue(String v) {
        return valueOf(v);
    }

}
