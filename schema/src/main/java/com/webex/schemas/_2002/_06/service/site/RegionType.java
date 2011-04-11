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

package com.webex.schemas._2002._06.service.site;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * The Enum RegionType.
 */
@XmlType(name = "regionType")
@XmlEnum
public enum RegionType {

    /** The U_ s. */
    @XmlEnumValue("U.S.")
    U_S("U.S."),
    
    /** The AUSTRALIA. */
    @XmlEnumValue("Australia")
    AUSTRALIA("Australia"),
    
    /** The CANADA. */
    @XmlEnumValue("Canada")
    CANADA("Canada"),
    
    /** The FRENC h_ canada. */
    @XmlEnumValue("French Canada")
    FRENCH_CANADA("French Canada"),
    
    /** The CHINA. */
    @XmlEnumValue("China")
    CHINA("China"),
    
    /** The GERMANY. */
    @XmlEnumValue("Germany")
    GERMANY("Germany"),
    
    /** The HON g_ kong. */
    @XmlEnumValue("Hong Kong")
    HONG_KONG("Hong Kong"),
    
    /** The ITALY. */
    @XmlEnumValue("Italy")
    ITALY("Italy"),
    
    /** The JAPAN. */
    @XmlEnumValue("Japan")
    JAPAN("Japan"),
    
    /** The KOREA. */
    @XmlEnumValue("Korea")
    KOREA("Korea"),
    
    /** The NE w_ zealand. */
    @XmlEnumValue("New Zealand")
    NEW_ZEALAND("New Zealand"),
    
    /** The SPAIN. */
    @XmlEnumValue("Spain")
    SPAIN("Spain"),
    
    /** The SWEDEN. */
    @XmlEnumValue("Sweden")
    SWEDEN("Sweden"),
    
    /** The SWITZERLAND. */
    @XmlEnumValue("Switzerland")
    SWITZERLAND("Switzerland"),
    
    /** The TAIWAN. */
    @XmlEnumValue("Taiwan")
    TAIWAN("Taiwan"),
    
    /** The U_ k. */
    @XmlEnumValue("U.K.")
    U_K("U.K.");
    
    /** The value. */
    private final String value;

    /**
     * Instantiates a new region type.
     * 
     * @param v the v
     */
    RegionType(String v) {
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
     * @return the region type
     */
    public static RegionType fromValue(String v) {
        for (RegionType c: RegionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
