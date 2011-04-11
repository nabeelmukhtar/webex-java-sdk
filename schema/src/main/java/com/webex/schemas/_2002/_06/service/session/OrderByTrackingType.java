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

package com.webex.schemas._2002._06.service.session;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * The Enum OrderByTrackingType.
 */
@XmlType(name = "orderByTrackingType")
@XmlEnum
public enum OrderByTrackingType {

    /** The HOSTWEBEXID. */
    HOSTWEBEXID("HOSTWEBEXID"),
    
    /** The CONFNAME. */
    CONFNAME("CONFNAME"),
    
    /** The STARTTIME. */
    STARTTIME("STARTTIME"),
    
    /** The TRACKINGCOD e_1. */
    @XmlEnumValue("TRACKINGCODE1")
    TRACKINGCODE_1("TRACKINGCODE1"),
    
    /** The TRACKINGCOD e_2. */
    @XmlEnumValue("TRACKINGCODE2")
    TRACKINGCODE_2("TRACKINGCODE2"),
    
    /** The TRACKINGCOD e_3. */
    @XmlEnumValue("TRACKINGCODE3")
    TRACKINGCODE_3("TRACKINGCODE3"),
    
    /** The TRACKINGCOD e_4. */
    @XmlEnumValue("TRACKINGCODE4")
    TRACKINGCODE_4("TRACKINGCODE4"),
    
    /** The TRACKINGCOD e_5. */
    @XmlEnumValue("TRACKINGCODE5")
    TRACKINGCODE_5("TRACKINGCODE5"),
    
    /** The TRACKINGCOD e_6. */
    @XmlEnumValue("TRACKINGCODE6")
    TRACKINGCODE_6("TRACKINGCODE6"),
    
    /** The TRACKINGCOD e_7. */
    @XmlEnumValue("TRACKINGCODE7")
    TRACKINGCODE_7("TRACKINGCODE7"),
    
    /** The TRACKINGCOD e_8. */
    @XmlEnumValue("TRACKINGCODE8")
    TRACKINGCODE_8("TRACKINGCODE8"),
    
    /** The TRACKINGCOD e_9. */
    @XmlEnumValue("TRACKINGCODE9")
    TRACKINGCODE_9("TRACKINGCODE9"),
    
    /** The TRACKINGCOD e_10. */
    @XmlEnumValue("TRACKINGCODE10")
    TRACKINGCODE_10("TRACKINGCODE10");
    
    /** The value. */
    private final String value;

    /**
     * Instantiates a new order by tracking type.
     * 
     * @param v the v
     */
    OrderByTrackingType(String v) {
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
     * @return the order by tracking type
     */
    public static OrderByTrackingType fromValue(String v) {
        for (OrderByTrackingType c: OrderByTrackingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
