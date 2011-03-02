
package com.webex.schemas._2002._06.service.history;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for participantTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="participantTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HOST"/>
 *     &lt;enumeration value="ATTENDEE"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "participantTypeType")
@XmlEnum
public enum ParticipantTypeType {

    HOST,
    ATTENDEE,
    OTHER;

    public String value() {
        return name();
    }

    public static ParticipantTypeType fromValue(String v) {
        return valueOf(v);
    }

}
