
package com.webex.schemas._2002._06.service.trainingsession;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for testStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="testStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_STARTED"/>
 *     &lt;enumeration value="STARTED"/>
 *     &lt;enumeration value="ENDED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "testStatusType")
@XmlEnum
public enum TestStatusType {

    NOT_STARTED,
    STARTED,
    ENDED;

    public String value() {
        return name();
    }

    public static TestStatusType fromValue(String v) {
        return valueOf(v);
    }

}
