
package com.webex.schemas._2002._06.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assistRequestType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="assistRequestType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Dry Run"/>
 *     &lt;enumeration value="Consult"/>
 *     &lt;enumeration value="Live Event Support"/>
 *     &lt;enumeration value="Audio Streaming"/>
 *     &lt;enumeration value="Video"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "assistRequestType")
@XmlEnum
public enum AssistRequestType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Dry Run")
    DRY_RUN("Dry Run"),
    @XmlEnumValue("Consult")
    CONSULT("Consult"),
    @XmlEnumValue("Live Event Support")
    LIVE_EVENT_SUPPORT("Live Event Support"),
    @XmlEnumValue("Audio Streaming")
    AUDIO_STREAMING("Audio Streaming"),
    @XmlEnumValue("Video")
    VIDEO("Video");
    private final String value;

    AssistRequestType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssistRequestType fromValue(String v) {
        for (AssistRequestType c: AssistRequestType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
