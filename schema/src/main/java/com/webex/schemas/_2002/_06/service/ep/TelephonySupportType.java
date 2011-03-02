
package com.webex.schemas._2002._06.service.ep;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for telephonySupportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="telephonySupportType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="CALLIN"/>
 *     &lt;enumeration value="CALLBACK"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "telephonySupportType")
@XmlEnum
public enum TelephonySupportType {

    NONE,
    CALLIN,
    CALLBACK,
    OTHER;

    public String value() {
        return name();
    }

    public static TelephonySupportType fromValue(String v) {
        return valueOf(v);
    }

}
