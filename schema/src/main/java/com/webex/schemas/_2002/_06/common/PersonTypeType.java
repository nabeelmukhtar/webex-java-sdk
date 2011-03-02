
package com.webex.schemas._2002._06.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for personTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="personTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VISITOR"/>
 *     &lt;enumeration value="MEMBER"/>
 *     &lt;enumeration value="PANELIST"/>
 *     &lt;enumeration value="SME"/>
 *     &lt;enumeration value="SALESTEAM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "personTypeType")
@XmlEnum
public enum PersonTypeType {

    VISITOR,
    MEMBER,
    PANELIST,
    SME,
    SALESTEAM;

    public String value() {
        return name();
    }

    public static PersonTypeType fromValue(String v) {
        return valueOf(v);
    }

}
