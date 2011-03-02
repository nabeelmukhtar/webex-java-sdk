
package com.webex.schemas._2002._06.service.meeting.auo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recurrenceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="recurrenceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WEEKLY"/>
 *     &lt;enumeration value="DAILY"/>
 *     &lt;enumeration value="NO_REPEAT"/>
 *     &lt;enumeration value="MONTHLY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "recurrenceType")
@XmlEnum
public enum RecurrenceType {

    WEEKLY,
    DAILY,
    NO_REPEAT,
    MONTHLY;

    public String value() {
        return name();
    }

    public static RecurrenceType fromValue(String v) {
        return valueOf(v);
    }

}
