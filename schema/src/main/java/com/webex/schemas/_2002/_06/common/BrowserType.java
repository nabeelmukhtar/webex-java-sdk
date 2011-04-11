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

package com.webex.schemas._2002._06.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * The Enum BrowserType.
 */
@XmlType(name = "browserType")
@XmlEnum
public enum BrowserType {

    /** The I e_5_ x. */
    @XmlEnumValue("IE5X")
    IE_5_X("IE5X"),
    
    /** The NA x_6_ x. */
    @XmlEnumValue("NAX6X")
    NAX_6_X("NAX6X"),
    
    /** The NA x_4_ x. */
    @XmlEnumValue("NAX4X")
    NAX_4_X("NAX4X"),
    
    /** The I e_4_ x. */
    @XmlEnumValue("IE4X")
    IE_4_X("IE4X");
    
    /** The value. */
    private final String value;

    /**
     * Instantiates a new browser type.
     * 
     * @param v the v
     */
    BrowserType(String v) {
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
     * @return the browser type
     */
    public static BrowserType fromValue(String v) {
        for (BrowserType c: BrowserType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
