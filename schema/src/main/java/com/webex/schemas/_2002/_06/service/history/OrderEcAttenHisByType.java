
package com.webex.schemas._2002._06.service.history;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orderEcAttenHisByType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="orderEcAttenHisByType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STARTTIME"/>
 *     &lt;enumeration value="ATTENDEENAME"/>
 *     &lt;enumeration value="SESSIONKEY"/>
 *     &lt;enumeration value="CONFID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "orderEcAttenHisByType")
@XmlEnum
public enum OrderEcAttenHisByType {

    STARTTIME,
    ATTENDEENAME,
    SESSIONKEY,
    CONFID;

    public String value() {
        return name();
    }

    public static OrderEcAttenHisByType fromValue(String v) {
        return valueOf(v);
    }

}
