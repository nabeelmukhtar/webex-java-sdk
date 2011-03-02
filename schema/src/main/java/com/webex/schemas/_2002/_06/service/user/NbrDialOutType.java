
package com.webex.schemas._2002._06.service.user;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nbrDialOutType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="nbrDialOutType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TOLL_FREE"/>
 *     &lt;enumeration value="TOLL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "nbrDialOutType")
@XmlEnum
public enum NbrDialOutType {

    TOLL_FREE,
    TOLL;

    public String value() {
        return name();
    }

    public static NbrDialOutType fromValue(String v) {
        return valueOf(v);
    }

}
