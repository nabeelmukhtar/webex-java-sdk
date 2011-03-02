
package com.webex.schemas._2002._06.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for webACDActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="webACDActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ASSIGN"/>
 *     &lt;enumeration value="UNASSIGN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "webACDActionType")
@XmlEnum
public enum WebACDActionType {

    ASSIGN,
    UNASSIGN;

    public String value() {
        return name();
    }

    public static WebACDActionType fromValue(String v) {
        return valueOf(v);
    }

}
