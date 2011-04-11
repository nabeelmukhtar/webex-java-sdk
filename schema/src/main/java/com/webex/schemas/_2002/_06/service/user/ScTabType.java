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

package com.webex.schemas._2002._06.service.user;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * The Enum ScTabType.
 */
@XmlType(name = "scTabType")
@XmlEnum
public enum ScTabType {

    /** The TOOLS. */
    @XmlEnumValue("Tools")
    TOOLS("Tools"),
    
    /** The DESKTOP. */
    @XmlEnumValue("Desktop")
    DESKTOP("Desktop"),
    
    /** The APPLICATION. */
    @XmlEnumValue("Application")
    APPLICATION("Application"),
    
    /** The SESSION. */
    @XmlEnumValue("Session")
    SESSION("Session");
    
    /** The value. */
    private final String value;

    /**
     * Instantiates a new sc tab type.
     * 
     * @param v the v
     */
    ScTabType(String v) {
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
     * @return the sc tab type
     */
    public static ScTabType fromValue(String v) {
        for (ScTabType c: ScTabType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
