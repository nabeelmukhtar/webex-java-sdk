
package com.webex.schemas._2002._06.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sharingViewType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="sharingViewType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FS_SCALE"/>
 *     &lt;enumeration value="FS"/>
 *     &lt;enumeration value="WIN_SCALE"/>
 *     &lt;enumeration value="WIN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "sharingViewType")
@XmlEnum
public enum SharingViewType {

    FS_SCALE,
    FS,
    WIN_SCALE,
    WIN;

    public String value() {
        return name();
    }

    public static SharingViewType fromValue(String v) {
        return valueOf(v);
    }

}
