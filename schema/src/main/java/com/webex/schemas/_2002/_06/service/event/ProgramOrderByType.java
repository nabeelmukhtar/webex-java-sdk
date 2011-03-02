
package com.webex.schemas._2002._06.service.event;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for programOrderByType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="programOrderByType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PROGRAMNAME"/>
 *     &lt;enumeration value="HOSTWEBEXID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "programOrderByType")
@XmlEnum
public enum ProgramOrderByType {

    PROGRAMNAME,
    HOSTWEBEXID;

    public String value() {
        return name();
    }

    public static ProgramOrderByType fromValue(String v) {
        return valueOf(v);
    }

}
