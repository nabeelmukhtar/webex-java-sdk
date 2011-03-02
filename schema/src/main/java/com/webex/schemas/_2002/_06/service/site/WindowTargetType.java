
package com.webex.schemas._2002._06.service.site;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for windowTargetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="windowTargetType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEW"/>
 *     &lt;enumeration value="MAIN"/>
 *     &lt;enumeration value="PARENT"/>
 *     &lt;enumeration value="TOP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "windowTargetType")
@XmlEnum
public enum WindowTargetType {

    NEW,
    MAIN,
    PARENT,
    TOP;

    public String value() {
        return name();
    }

    public static WindowTargetType fromValue(String v) {
        return valueOf(v);
    }

}
