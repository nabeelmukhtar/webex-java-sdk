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
 * <p>Java class for myWebExPageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="myWebExPageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="My Meetings"/>
 *     &lt;enumeration value="My Computers"/>
 *     &lt;enumeration value="My Files:Folders"/>
 *     &lt;enumeration value="My Files:Training Recordings"/>
 *     &lt;enumeration value="My Files:Recorded Events"/>
 *     &lt;enumeration value="My Reports"/>
 *     &lt;enumeration value="My Profile"/>
 *     &lt;enumeration value="My Contacts"/>
 *     &lt;enumeration value="My Workspaces"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "myWebExPageType")
@XmlEnum
public enum MyWebExPageType {

    @XmlEnumValue("My Meetings")
    MY_MEETINGS("My Meetings"),
    @XmlEnumValue("My Computers")
    MY_COMPUTERS("My Computers"),
    @XmlEnumValue("My Files:Folders")
    MY_FILES_FOLDERS("My Files:Folders"),
    @XmlEnumValue("My Files:Training Recordings")
    MY_FILES_TRAINING_RECORDINGS("My Files:Training Recordings"),
    @XmlEnumValue("My Files:Recorded Events")
    MY_FILES_RECORDED_EVENTS("My Files:Recorded Events"),
    @XmlEnumValue("My Reports")
    MY_REPORTS("My Reports"),
    @XmlEnumValue("My Profile")
    MY_PROFILE("My Profile"),
    @XmlEnumValue("My Contacts")
    MY_CONTACTS("My Contacts"),
    @XmlEnumValue("My Workspaces")
    MY_WORKSPACES("My Workspaces");
    private final String value;

    MyWebExPageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MyWebExPageType fromValue(String v) {
        for (MyWebExPageType c: MyWebExPageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
