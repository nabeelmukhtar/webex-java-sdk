
package com.webex.schemas._2002._06.service.history;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orderTCHisByType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="orderTCHisByType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONFNAME"/>
 *     &lt;enumeration value="STARTTIME"/>
 *     &lt;enumeration value="TOTALINVITED"/>
 *     &lt;enumeration value="TOTALREGISTERED"/>
 *     &lt;enumeration value="TOTALATTENDEE"/>
 *     &lt;enumeration value="ASSISTREQUEST"/>
 *     &lt;enumeration value="ASSISTCONFIRM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "orderTCHisByType")
@XmlEnum
public enum OrderTCHisByType {

    CONFNAME,
    STARTTIME,
    TOTALINVITED,
    TOTALREGISTERED,
    TOTALATTENDEE,
    ASSISTREQUEST,
    ASSISTCONFIRM;

    public String value() {
        return name();
    }

    public static OrderTCHisByType fromValue(String v) {
        return valueOf(v);
    }

}
