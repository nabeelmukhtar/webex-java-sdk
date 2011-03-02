
package com.webex.schemas._2002._06.service.trainingsession;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for textboxTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="textboxTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SINGLE_LINE"/>
 *     &lt;enumeration value="MULTI_LINE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "textboxTypeType")
@XmlEnum
public enum TextboxTypeType {

    SINGLE_LINE,
    MULTI_LINE;

    public String value() {
        return name();
    }

    public static TextboxTypeType fromValue(String v) {
        return valueOf(v);
    }

}
