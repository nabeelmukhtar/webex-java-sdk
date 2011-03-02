
package com.webex.schemas._2002._06.service.event;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for approvalConditionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="approvalConditionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONTAINS"/>
 *     &lt;enumeration value="DOESNOT_CONTAIN"/>
 *     &lt;enumeration value="BEGINS_WITH"/>
 *     &lt;enumeration value="ENDS_WITH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "approvalConditionType")
@XmlEnum
public enum ApprovalConditionType {

    CONTAINS,
    DOESNOT_CONTAIN,
    BEGINS_WITH,
    ENDS_WITH;

    public String value() {
        return name();
    }

    public static ApprovalConditionType fromValue(String v) {
        return valueOf(v);
    }

}
