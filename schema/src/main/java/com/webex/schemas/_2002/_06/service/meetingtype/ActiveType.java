
package com.webex.schemas._2002._06.service.meetingtype;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for activeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="activeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVATED"/>
 *     &lt;enumeration value="DEACTIVATED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "activeType")
@XmlEnum
public enum ActiveType {

    ACTIVATED,
    DEACTIVATED;

    public String value() {
        return name();
    }

    public static ActiveType fromValue(String v) {
        return valueOf(v);
    }

}
