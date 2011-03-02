
package com.webex.schemas._2002._06.service.trainingsession;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkboxStateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="checkboxStateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLEARED"/>
 *     &lt;enumeration value="SELECTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "checkboxStateType")
@XmlEnum
public enum CheckboxStateType {

    CLEARED,
    SELECTED;

    public String value() {
        return name();
    }

    public static CheckboxStateType fromValue(String v) {
        return valueOf(v);
    }

}
