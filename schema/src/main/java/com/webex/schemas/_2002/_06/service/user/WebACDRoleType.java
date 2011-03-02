
package com.webex.schemas._2002._06.service.user;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for webACDRoleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="webACDRoleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AGENT"/>
 *     &lt;enumeration value="MANAGER"/>
 *     &lt;enumeration value="ALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "webACDRoleType")
@XmlEnum
public enum WebACDRoleType {

    AGENT,
    MANAGER,
    ALL;

    public String value() {
        return name();
    }

    public static WebACDRoleType fromValue(String v) {
        return valueOf(v);
    }

}
