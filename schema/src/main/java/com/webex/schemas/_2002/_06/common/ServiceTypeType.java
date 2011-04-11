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
 * The Enum ServiceTypeType.
 */
@XmlType(name = "serviceTypeType")
@XmlEnum
public enum ServiceTypeType {

    /** The MEETIN g_ center. */
    @XmlEnumValue("MeetingCenter")
    MEETING_CENTER("MeetingCenter"),
    
    /** The EVEN t_ center. */
    @XmlEnumValue("EventCenter")
    EVENT_CENTER("EventCenter"),
    
    /** The TRAININ g_ center. */
    @XmlEnumValue("TrainingCenter")
    TRAINING_CENTER("TrainingCenter"),
    
    /** The SUPPOR t_ center. */
    @XmlEnumValue("SupportCenter")
    SUPPORT_CENTER("SupportCenter"),
    
    /** The SALE s_ center. */
    @XmlEnumValue("SalesCenter")
    SALES_CENTER("SalesCenter");
    
    /** The value. */
    private final String value;

    /**
     * Instantiates a new service type type.
     * 
     * @param v the v
     */
    ServiceTypeType(String v) {
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
     * @return the service type type
     */
    public static ServiceTypeType fromValue(String v) {
        for (ServiceTypeType c: ServiceTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
