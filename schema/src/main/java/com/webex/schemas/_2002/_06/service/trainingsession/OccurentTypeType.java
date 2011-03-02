
package com.webex.schemas._2002._06.service.trainingsession;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for occurentTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="occurentTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WEEKLY"/>
 *     &lt;enumeration value="DAILY"/>
 *     &lt;enumeration value="NO_REPEAT"/>
 *     &lt;enumeration value="CONSTANT"/>
 *     &lt;enumeration value="MONTHLY"/>
 *     &lt;enumeration value="IRREGULARLY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "occurentTypeType")
@XmlEnum
public enum OccurentTypeType {

    WEEKLY,
    DAILY,
    NO_REPEAT,
    CONSTANT,
    MONTHLY,
    IRREGULARLY;

    public String value() {
        return name();
    }

    public static OccurentTypeType fromValue(String v) {
        return valueOf(v);
    }

}
