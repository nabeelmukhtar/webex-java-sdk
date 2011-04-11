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
 * The Enum OsType.
 */
@XmlType(name = "osType")
@XmlEnum
public enum OsType {

    /** The WI n_2_ k. */
    @XmlEnumValue("WIN2K")
    WIN_2_K("WIN2K"),
    
    /** The WINNT. */
    WINNT("WINNT"),
    
    /** The WI n_9_ x. */
    @XmlEnumValue("WIN9X")
    WIN_9_X("WIN9X"),
    
    /** The LINUX. */
    LINUX("LINUX"),
    
    /** The HPUX. */
    HPUX("HPUX"),
    
    /** The AIX. */
    AIX("AIX");
    
    /** The value. */
    private final String value;

    /**
     * Instantiates a new os type.
     * 
     * @param v the v
     */
    OsType(String v) {
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
     * @return the os type
     */
    public static OsType fromValue(String v) {
        for (OsType c: OsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
