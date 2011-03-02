
package com.webex.schemas._2002._06.service.meeting.auo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="listingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PUBLIC"/>
 *     &lt;enumeration value="PRIVATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "listingType")
@XmlEnum
public enum ListingType {

    PUBLIC,
    PRIVATE;

    public String value() {
        return name();
    }

    public static ListingType fromValue(String v) {
        return valueOf(v);
    }

}
