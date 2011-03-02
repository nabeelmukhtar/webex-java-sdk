
package com.webex.schemas._2002._06.service.history;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orderRecAccHisByType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="orderRecAccHisByType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RECORDID"/>
 *     &lt;enumeration value="UPLOADTIME"/>
 *     &lt;enumeration value="RECORDNAME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "orderRecAccHisByType")
@XmlEnum
public enum OrderRecAccHisByType {

    RECORDID,
    UPLOADTIME,
    RECORDNAME;

    public String value() {
        return name();
    }

    public static OrderRecAccHisByType fromValue(String v) {
        return valueOf(v);
    }

}
