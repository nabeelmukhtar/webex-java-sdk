
package com.webex.schemas._2002._06.service.trainingsession;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for testDeliveryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="testDeliveryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WEBSITE"/>
 *     &lt;enumeration value="IN_SESSION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "testDeliveryType")
@XmlEnum
public enum TestDeliveryType {

    WEBSITE,
    IN_SESSION;

    public String value() {
        return name();
    }

    public static TestDeliveryType fromValue(String v) {
        return valueOf(v);
    }

}
