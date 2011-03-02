
package com.webex.schemas._2002._06.service.event;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for approvalActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="approvalActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REJECT"/>
 *     &lt;enumeration value="APPROVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "approvalActionType")
@XmlEnum
public enum ApprovalActionType {

    REJECT,
    APPROVE;

    public String value() {
        return name();
    }

    public static ApprovalActionType fromValue(String v) {
        return valueOf(v);
    }

}
