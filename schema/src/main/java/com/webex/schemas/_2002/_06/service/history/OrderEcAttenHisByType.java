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

package com.webex.schemas._2002._06.service.history;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * The Enum OrderEcAttenHisByType.
 */
@XmlType(name = "orderEcAttenHisByType")
@XmlEnum
public enum OrderEcAttenHisByType {

    /** The STARTTIME. */
    STARTTIME,
    
    /** The ATTENDEENAME. */
    ATTENDEENAME,
    
    /** The SESSIONKEY. */
    SESSIONKEY,
    
    /** The CONFID. */
    CONFID;

    /**
     * Value.
     * 
     * @return the string
     */
    public String value() {
        return name();
    }

    /**
     * From value.
     * 
     * @param v the v
     * 
     * @return the order ec atten his by type
     */
    public static OrderEcAttenHisByType fromValue(String v) {
        return valueOf(v);
    }

}
