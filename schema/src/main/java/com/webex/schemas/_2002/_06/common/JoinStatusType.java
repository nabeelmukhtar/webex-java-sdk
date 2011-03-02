
package com.webex.schemas._2002._06.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for joinStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="joinStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REGISTER"/>
 *     &lt;enumeration value="INVITE"/>
 *     &lt;enumeration value="REJECT"/>
 *     &lt;enumeration value="ACCEPT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "joinStatusType")
@XmlEnum
public enum JoinStatusType {

    REGISTER,
    INVITE,
    REJECT,
    ACCEPT;

    public String value() {
        return name();
    }

    public static JoinStatusType fromValue(String v) {
        return valueOf(v);
    }

}
