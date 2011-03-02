
package com.webex.schemas._2002._06.service.history;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for attendeeTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="attendeeTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PROSPECT"/>
 *     &lt;enumeration value="SALESTEAM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "attendeeTypeType")
@XmlEnum
public enum AttendeeTypeType {

    PROSPECT,
    SALESTEAM;

    public String value() {
        return name();
    }

    public static AttendeeTypeType fromValue(String v) {
        return valueOf(v);
    }

}
