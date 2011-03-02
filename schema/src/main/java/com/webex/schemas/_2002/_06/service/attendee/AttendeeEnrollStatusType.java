
package com.webex.schemas._2002._06.service.attendee;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for attendeeEnrollStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="attendeeEnrollStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="APPROVED"/>
 *     &lt;enumeration value="REJECTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "attendeeEnrollStatusType")
@XmlEnum
public enum AttendeeEnrollStatusType {

    PENDING,
    APPROVED,
    REJECTED;

    public String value() {
        return name();
    }

    public static AttendeeEnrollStatusType fromValue(String v) {
        return valueOf(v);
    }

}
