//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.28 at 12:47:51 PM GMT+05:00 
//


package com.webex.schemas._2002._06.service.meeting;

import javax.xml.bind.annotation.XmlEnum;


/**
 * <p>Java class for repeatTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="repeatTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WEEKLY"/>
 *     &lt;enumeration value="DAILY"/>
 *     &lt;enumeration value="NO_REPEAT"/>
 *     &lt;enumeration value="CONSTANT"/>
 *     &lt;enumeration value="MONTHLY"/>
 *     &lt;enumeration value="YEARLY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum RepeatTypeType {

    WEEKLY,
    DAILY,
    NO_REPEAT,
    CONSTANT,
    MONTHLY,
    YEARLY;

    public String value() {
        return name();
    }

    public static RepeatTypeType fromValue(String v) {
        return valueOf(v);
    }

}
