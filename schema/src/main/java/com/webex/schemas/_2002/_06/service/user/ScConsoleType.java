
package com.webex.schemas._2002._06.service.user;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for scConsoleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="scConsoleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEW_CONSL"/>
 *     &lt;enumeration value="OLD_CONSL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "scConsoleType")
@XmlEnum
public enum ScConsoleType {

    NEW_CONSL,
    OLD_CONSL;

    public String value() {
        return name();
    }

    public static ScConsoleType fromValue(String v) {
        return valueOf(v);
    }

}
