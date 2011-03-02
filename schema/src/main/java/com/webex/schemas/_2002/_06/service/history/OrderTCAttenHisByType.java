
package com.webex.schemas._2002._06.service.history;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orderTCAttenHisByType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="orderTCAttenHisByType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NAME"/>
 *     &lt;enumeration value="STARTTIME"/>
 *     &lt;enumeration value="COMPANY"/>
 *     &lt;enumeration value="COUNTRY"/>
 *     &lt;enumeration value="STATE"/>
 *     &lt;enumeration value="CITY"/>
 *     &lt;enumeration value="CONFID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "orderTCAttenHisByType")
@XmlEnum
public enum OrderTCAttenHisByType {

    NAME,
    STARTTIME,
    COMPANY,
    COUNTRY,
    STATE,
    CITY,
    CONFID;

    public String value() {
        return name();
    }

    public static OrderTCAttenHisByType fromValue(String v) {
        return valueOf(v);
    }

}
