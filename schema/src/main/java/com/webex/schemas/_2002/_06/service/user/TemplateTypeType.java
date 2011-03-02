
package com.webex.schemas._2002._06.service.user;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for templateTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="templateTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="User"/>
 *     &lt;enumeration value="Site"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "templateTypeType")
@XmlEnum
public enum TemplateTypeType {

    @XmlEnumValue("User")
    USER("User"),
    @XmlEnumValue("Site")
    SITE("Site");
    private final String value;

    TemplateTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TemplateTypeType fromValue(String v) {
        for (TemplateTypeType c: TemplateTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
