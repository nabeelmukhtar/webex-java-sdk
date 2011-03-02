
package com.webex.schemas._2002._06.service.ep;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contactOperationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="contactOperationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADD"/>
 *     &lt;enumeration value="DELETE"/>
 *     &lt;enumeration value="DELETE_ALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "contactOperationType")
@XmlEnum
public enum ContactOperationType {

    ADD,
    DELETE,
    DELETE_ALL;

    public String value() {
        return name();
    }

    public static ContactOperationType fromValue(String v) {
        return valueOf(v);
    }

}
