
package com.webex.schemas._2002._06.service.history;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orderScHisByType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="orderScHisByType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONFID"/>
 *     &lt;enumeration value="SESSIONSTARTTIME"/>
 *     &lt;enumeration value="CONFNAME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "orderScHisByType")
@XmlEnum
public enum OrderScHisByType {

    CONFID,
    SESSIONSTARTTIME,
    CONFNAME;

    public String value() {
        return name();
    }

    public static OrderScHisByType fromValue(String v) {
        return valueOf(v);
    }

}
