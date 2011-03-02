
package com.webex.schemas._2002._06.service.meeting.auo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entryExitToneType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="entryExitToneType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BEEP"/>
 *     &lt;enumeration value="ANNOUNCENAME"/>
 *     &lt;enumeration value="NOTONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "entryExitToneType")
@XmlEnum
public enum EntryExitToneType {

    BEEP,
    ANNOUNCENAME,
    NOTONE;

    public String value() {
        return name();
    }

    public static EntryExitToneType fromValue(String v) {
        return valueOf(v);
    }

}
