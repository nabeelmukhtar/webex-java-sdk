
package com.webex.schemas._2002._06.service.event;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orderByType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="orderByType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EVENTNAME"/>
 *     &lt;enumeration value="STARTTIME"/>
 *     &lt;enumeration value="HOSTWEBEXID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "orderByType")
@XmlEnum
public enum OrderByType {

    EVENTNAME,
    STARTTIME,
    HOSTWEBEXID;

    public String value() {
        return name();
    }

    public static OrderByType fromValue(String v) {
        return valueOf(v);
    }

}
