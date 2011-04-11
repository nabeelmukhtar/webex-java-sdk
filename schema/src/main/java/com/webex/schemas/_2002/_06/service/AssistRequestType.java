/*
 * Copyright 2010-2011 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */

package com.webex.schemas._2002._06.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * The Enum AssistRequestType.
 */
@XmlType(name = "assistRequestType")
@XmlEnum
public enum AssistRequestType {

    /** The NONE. */
    @XmlEnumValue("None")
    NONE("None"),
    
    /** The DR y_ run. */
    @XmlEnumValue("Dry Run")
    DRY_RUN("Dry Run"),
    
    /** The CONSULT. */
    @XmlEnumValue("Consult")
    CONSULT("Consult"),
    
    /** The LIV e_ even t_ support. */
    @XmlEnumValue("Live Event Support")
    LIVE_EVENT_SUPPORT("Live Event Support"),
    
    /** The AUDI o_ streaming. */
    @XmlEnumValue("Audio Streaming")
    AUDIO_STREAMING("Audio Streaming"),
    
    /** The VIDEO. */
    @XmlEnumValue("Video")
    VIDEO("Video");
    
    /** The value. */
    private final String value;

    /**
     * Instantiates a new assist request type.
     * 
     * @param v the v
     */
    AssistRequestType(String v) {
        value = v;
    }

    /**
     * Value.
     * 
     * @return the string
     */
    public String value() {
        return value;
    }

    /**
     * From value.
     * 
     * @param v the v
     * 
     * @return the assist request type
     */
    public static AssistRequestType fromValue(String v) {
        for (AssistRequestType c: AssistRequestType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
