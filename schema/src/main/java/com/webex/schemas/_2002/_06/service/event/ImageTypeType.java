
package com.webex.schemas._2002._06.service.event;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for imageTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="imageTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="JPG"/>
 *     &lt;enumeration value="GIF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "imageTypeType")
@XmlEnum
public enum ImageTypeType {

    JPG,
    GIF;

    public String value() {
        return name();
    }

    public static ImageTypeType fromValue(String v) {
        return valueOf(v);
    }

}
