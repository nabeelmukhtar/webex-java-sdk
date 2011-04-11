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
 * The Enum MyWebExPageType.
 */
@XmlType(name = "myWebExPageType")
@XmlEnum
public enum MyWebExPageType {

    /** The M y_ meetings. */
    @XmlEnumValue("My Meetings")
    MY_MEETINGS("My Meetings"),
    
    /** The M y_ computers. */
    @XmlEnumValue("My Computers")
    MY_COMPUTERS("My Computers"),
    
    /** The M y_ file s_ folders. */
    @XmlEnumValue("My Files:Folders")
    MY_FILES_FOLDERS("My Files:Folders"),
    
    /** The M y_ file s_ trainin g_ recordings. */
    @XmlEnumValue("My Files:Training Recordings")
    MY_FILES_TRAINING_RECORDINGS("My Files:Training Recordings"),
    
    /** The M y_ file s_ recorde d_ events. */
    @XmlEnumValue("My Files:Recorded Events")
    MY_FILES_RECORDED_EVENTS("My Files:Recorded Events"),
    
    /** The M y_ reports. */
    @XmlEnumValue("My Reports")
    MY_REPORTS("My Reports"),
    
    /** The M y_ profile. */
    @XmlEnumValue("My Profile")
    MY_PROFILE("My Profile"),
    
    /** The M y_ contacts. */
    @XmlEnumValue("My Contacts")
    MY_CONTACTS("My Contacts"),
    
    /** The M y_ workspaces. */
    @XmlEnumValue("My Workspaces")
    MY_WORKSPACES("My Workspaces");
    
    /** The value. */
    private final String value;

    /**
     * Instantiates a new my web ex page type.
     * 
     * @param v the v
     */
    MyWebExPageType(String v) {
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
     * @return the my web ex page type
     */
    public static MyWebExPageType fromValue(String v) {
        for (MyWebExPageType c: MyWebExPageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
