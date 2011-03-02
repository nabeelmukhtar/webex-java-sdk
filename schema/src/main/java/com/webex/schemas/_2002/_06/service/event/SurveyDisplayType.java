
package com.webex.schemas._2002._06.service.event;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for surveyDisplayType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="surveyDisplayType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_DISPLAY"/>
 *     &lt;enumeration value="POPUP_WINDOW"/>
 *     &lt;enumeration value="MAIN_WINDOW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "surveyDisplayType")
@XmlEnum
public enum SurveyDisplayType {

    NO_DISPLAY,
    POPUP_WINDOW,
    MAIN_WINDOW;

    public String value() {
        return name();
    }

    public static SurveyDisplayType fromValue(String v) {
        return valueOf(v);
    }

}
