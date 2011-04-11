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
 * The Enum AttendeeListViewType.
 */
@XmlType(name = "attendeeListViewType")
@XmlEnum
public enum AttendeeListViewType {

    /** The ALL. */
    ALL("ALL"),
    
    /** The HOS t_ presente r_ panelists. */
    @XmlEnumValue("HOST,PRESENTER,PANELISTS")
    HOST_PRESENTER_PANELISTS("HOST,PRESENTER,PANELISTS");
    
    /** The value. */
    private final String value;

    /**
     * Instantiates a new attendee list view type.
     * 
     * @param v the v
     */
    AttendeeListViewType(String v) {
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
     * @return the attendee list view type
     */
    public static AttendeeListViewType fromValue(String v) {
        for (AttendeeListViewType c: AttendeeListViewType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
