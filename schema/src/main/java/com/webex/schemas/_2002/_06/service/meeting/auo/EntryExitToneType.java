//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.28 at 12:47:45 PM GMT+05:00 
//


package com.webex.schemas._2002._06.service.meeting.auo;

import javax.xml.bind.annotation.XmlEnum;


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
