
package com.webex.schemas._2002._06.service.site;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for codeDisplayType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="codeDisplayType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_USED"/>
 *     &lt;enumeration value="OPTIONAL"/>
 *     &lt;enumeration value="REQUIRED"/>
 *     &lt;enumeration value="ADMIN_SET"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "codeDisplayType")
@XmlEnum
public enum CodeDisplayType {

    NOT_USED,
    OPTIONAL,
    REQUIRED,
    ADMIN_SET;

    public String value() {
        return name();
    }

    public static CodeDisplayType fromValue(String v) {
        return valueOf(v);
    }

}
