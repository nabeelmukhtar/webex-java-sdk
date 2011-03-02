
package com.webex.schemas._2002._06.service.ep;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for matchMethodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="matchMethodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXACT"/>
 *     &lt;enumeration value="STARTWITH"/>
 *     &lt;enumeration value="CONTAIN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "matchMethodType")
@XmlEnum
public enum MatchMethodType {

    EXACT,
    STARTWITH,
    CONTAIN;

    public String value() {
        return name();
    }

    public static MatchMethodType fromValue(String v) {
        return valueOf(v);
    }

}
