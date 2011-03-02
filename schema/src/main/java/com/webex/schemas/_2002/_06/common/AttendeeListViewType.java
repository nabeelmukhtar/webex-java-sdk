
package com.webex.schemas._2002._06.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for attendeeListViewType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="attendeeListViewType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="HOST,PRESENTER,PANELISTS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "attendeeListViewType")
@XmlEnum
public enum AttendeeListViewType {

    ALL("ALL"),
    @XmlEnumValue("HOST,PRESENTER,PANELISTS")
    HOST_PRESENTER_PANELISTS("HOST,PRESENTER,PANELISTS");
    private final String value;

    AttendeeListViewType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AttendeeListViewType fromValue(String v) {
        for (AttendeeListViewType c: AttendeeListViewType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
