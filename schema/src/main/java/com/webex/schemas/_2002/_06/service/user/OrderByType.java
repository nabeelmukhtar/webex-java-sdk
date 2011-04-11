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
 * The Enum OrderByType.
 */
@XmlType(name = "orderByType")
@XmlEnum
public enum OrderByType {

    /** The UID. */
    UID("UID"),
    
    /** The WEBEXID. */
    WEBEXID("WEBEXID"),
    
    /** The FIRSTNAME. */
    FIRSTNAME("FIRSTNAME"),
    
    /** The LASTNAME. */
    LASTNAME("LASTNAME"),
    
    /** The EMAIL. */
    EMAIL("EMAIL"),
    
    /** The ACTIVE. */
    ACTIVE("ACTIVE"),
    
    /** The REGDATE. */
    REGDATE("REGDATE"),
    
    /** The REGEXPDATE. */
    REGEXPDATE("REGEXPDATE"),
    
    /** The PRIVILEGE. */
    PRIVILEGE("PRIVILEGE"),
    
    /** The PERSONALURL. */
    PERSONALURL("PERSONALURL"),
    
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
    
    /** The PHON e_1. */
    @XmlEnumValue("PHONE1")
    PHONE_1("PHONE1"),
    
    /** The PHON e_2. */
    @XmlEnumValue("PHONE2")
    PHONE_2("PHONE2"),
    
    /** The MOBIL e_1. */
    @XmlEnumValue("MOBILE1")
    MOBILE_1("MOBILE1"),
    
    /** The MOBIL e_2. */
    @XmlEnumValue("MOBILE2")
    MOBILE_2("MOBILE2"),
    
    /** The FAX. */
    FAX("FAX"),
    
    /** The PAGER. */
    PAGER("PAGER"),
    
    /** The EMAI l_2. */
    @XmlEnumValue("EMAIL2")
    EMAIL_2("EMAIL2"),
    
    /** The DIVISION. */
    DIVISION("DIVISION"),
    
    /** The DEPARTMENT. */
    DEPARTMENT("DEPARTMENT"),
    
    /** The PROJECT. */
    PROJECT("PROJECT"),
    
    /** The OTHER. */
    OTHER("OTHER"),
    
    /** The TIMEZONE. */
    TIMEZONE("TIMEZONE"),
    
    /** The OFFICENAME. */
    OFFICENAME("OFFICENAME"),
    
    /** The OFFICETITLE. */
    OFFICETITLE("OFFICETITLE"),
    
    /** The OFFICEURL. */
    OFFICEURL("OFFICEURL"),
    
    /** The CATEGORYID. */
    CATEGORYID("CATEGORYID"),
    
    /** The VISITCOUNT. */
    VISITCOUNT("VISITCOUNT");
    
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
