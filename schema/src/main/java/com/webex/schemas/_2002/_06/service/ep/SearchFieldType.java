
package com.webex.schemas._2002._06.service.ep;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchFieldType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="searchFieldType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONFNAME"/>
 *     &lt;enumeration value="HOSTNAME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "searchFieldType")
@XmlEnum
public enum SearchFieldType {

    CONFNAME,
    HOSTNAME;

    public String value() {
        return name();
    }

    public static SearchFieldType fromValue(String v) {
        return valueOf(v);
    }

}
