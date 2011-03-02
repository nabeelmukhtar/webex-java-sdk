
package com.webex.schemas._2002._06.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tspAccessCodeOrderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tspAccessCodeOrderType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUBSCRIBER_1ST"/>
 *     &lt;enumeration value="PARTICIPANT_1ST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tspAccessCodeOrderType")
@XmlEnum
public enum TspAccessCodeOrderType {

    @XmlEnumValue("SUBSCRIBER_1ST")
    SUBSCRIBER_1_ST("SUBSCRIBER_1ST"),
    @XmlEnumValue("PARTICIPANT_1ST")
    PARTICIPANT_1_ST("PARTICIPANT_1ST");
    private final String value;

    TspAccessCodeOrderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TspAccessCodeOrderType fromValue(String v) {
        for (TspAccessCodeOrderType c: TspAccessCodeOrderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
