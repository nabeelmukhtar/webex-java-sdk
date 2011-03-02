
package com.webex.schemas._2002._06.service.user;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for scClientType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="scClientType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MULTI_SESS"/>
 *     &lt;enumeration value="SINGLE_SESS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "scClientType")
@XmlEnum
public enum ScClientType {

    MULTI_SESS,
    SINGLE_SESS;

    public String value() {
        return name();
    }

    public static ScClientType fromValue(String v) {
        return valueOf(v);
    }

}
