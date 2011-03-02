
package com.webex.schemas._2002._06.service.trainingsession;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for repeatTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="repeatTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SINGLE"/>
 *     &lt;enumeration value="RECURRING_SINGLE"/>
 *     &lt;enumeration value="MULTIPLE_SESSION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "repeatTypeType")
@XmlEnum
public enum RepeatTypeType {

    SINGLE,
    RECURRING_SINGLE,
    MULTIPLE_SESSION;

    public String value() {
        return name();
    }

    public static RepeatTypeType fromValue(String v) {
        return valueOf(v);
    }

}
