
package com.webex.schemas._2002._06.service.user;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for scRequestType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="scRequestType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DESK_VIEW"/>
 *     &lt;enumeration value="DESK_CTRL"/>
 *     &lt;enumeration value="APP_VIEW"/>
 *     &lt;enumeration value="APP_CTRL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "scRequestType")
@XmlEnum
public enum ScRequestType {

    DESK_VIEW,
    DESK_CTRL,
    APP_VIEW,
    APP_CTRL;

    public String value() {
        return name();
    }

    public static ScRequestType fromValue(String v) {
        return valueOf(v);
    }

}
