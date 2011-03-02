
package com.webex.schemas._2002._06.service.history;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orderScAttenHisByType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="orderScAttenHisByType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ATTENDEENAME"/>
 *     &lt;enumeration value="STARTTIME"/>
 *     &lt;enumeration value="SESSIONKEY"/>
 *     &lt;enumeration value="CONFID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "orderScAttenHisByType")
@XmlEnum
public enum OrderScAttenHisByType {

    ATTENDEENAME,
    STARTTIME,
    SESSIONKEY,
    CONFID;

    public String value() {
        return name();
    }

    public static OrderScAttenHisByType fromValue(String v) {
        return valueOf(v);
    }

}
