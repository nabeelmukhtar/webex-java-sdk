
package com.webex.schemas._2002._06.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="serviceTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MeetingCenter"/>
 *     &lt;enumeration value="EventCenter"/>
 *     &lt;enumeration value="TrainingCenter"/>
 *     &lt;enumeration value="SupportCenter"/>
 *     &lt;enumeration value="SalesCenter"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "serviceTypeType")
@XmlEnum
public enum ServiceTypeType {

    @XmlEnumValue("MeetingCenter")
    MEETING_CENTER("MeetingCenter"),
    @XmlEnumValue("EventCenter")
    EVENT_CENTER("EventCenter"),
    @XmlEnumValue("TrainingCenter")
    TRAINING_CENTER("TrainingCenter"),
    @XmlEnumValue("SupportCenter")
    SUPPORT_CENTER("SupportCenter"),
    @XmlEnumValue("SalesCenter")
    SALES_CENTER("SalesCenter");
    private final String value;

    ServiceTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceTypeType fromValue(String v) {
        for (ServiceTypeType c: ServiceTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
