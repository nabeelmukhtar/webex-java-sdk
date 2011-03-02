
package com.webex.schemas._2002._06.service.meeting;

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
@XmlType(name = "repeatTypeType")
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
