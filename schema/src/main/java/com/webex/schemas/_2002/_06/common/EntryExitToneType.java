
package com.webex.schemas._2002._06.common;

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
 *     &lt;enumeration value="NOTONE"/>
 *     &lt;enumeration value="BEEP"/>
 *     &lt;enumeration value="ANNOUNCENAME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "entryExitToneType")
@XmlEnum
public enum EntryExitToneType {

    NOTONE,
    BEEP,
    ANNOUNCENAME;

    public String value() {
        return name();
    }

    public static EntryExitToneType fromValue(String v) {
        return valueOf(v);
    }

}
