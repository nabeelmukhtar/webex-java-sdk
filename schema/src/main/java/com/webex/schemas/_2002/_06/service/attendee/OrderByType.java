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

package com.webex.schemas._2002._06.service.attendee;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * The Enum OrderByType.
 */
@XmlType(name = "orderByType")
@XmlEnum
public enum OrderByType {

    /** The CONFID. */
    CONFID("CONFID"),
    
    /** The ATTENDEEID. */
    ATTENDEEID("ATTENDEEID"),
    
    /** The ATTENDEETYPE. */
    ATTENDEETYPE("ATTENDEETYPE"),
    
    /** The ATTENDEENAME. */
    ATTENDEENAME("ATTENDEENAME"),
    
    /** The ATTENDEEWEBEXID. */
    ATTENDEEWEBEXID("ATTENDEEWEBEXID"),
    
    /** The JOINSTATUS. */
    JOINSTATUS("JOINSTATUS"),
    
    /** The EMAIL. */
    EMAIL("EMAIL"),
    
    /** The PHONE. */
    PHONE("PHONE"),
    
    /** The MOBILE. */
    MOBILE("MOBILE"),
    
    /** The FAX. */
    FAX("FAX"),
    
    /** The COMPANY. */
    COMPANY("COMPANY"),
    
    /** The TITLE. */
    TITLE("TITLE"),
    
    /** The URL. */
    URL("URL"),
    
    /** The ADDRES s_1. */
    @XmlEnumValue("ADDRESS1")
    ADDRESS_1("ADDRESS1"),
    
    /** The ADDRES s_2. */
    @XmlEnumValue("ADDRESS2")
    ADDRESS_2("ADDRESS2"),
    
    /** The CITY. */
    CITY("CITY"),
    
    /** The STATE. */
    STATE("STATE"),
    
    /** The ZIPCODE. */
    ZIPCODE("ZIPCODE"),
    
    /** The COUNTRY. */
    COUNTRY("COUNTRY"),
    
    /** The NOTES. */
    NOTES("NOTES"),
    
    /** The ADDRESSTYPE. */
    ADDRESSTYPE("ADDRESSTYPE");
    
    /** The value. */
    private final String value;

    /**
     * Instantiates a new order by type.
     * 
     * @param v the v
     */
    OrderByType(String v) {
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
     * @return the order by type
     */
    public static OrderByType fromValue(String v) {
        for (OrderByType c: OrderByType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
