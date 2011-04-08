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
 * <p>Java class for serviceTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="serviceTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MeetingCenter"/>
 *     &lt;enumeration value="EventCenter"/>
 *     &lt;enumeration value="TrainingCenter"/>
 *     &lt;enumeration value="SupportCenter"/>
 *     &lt;enumeration value="SalesCenter"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "serviceTypeType")
@XmlEnum
public enum ServiceTypeType {

    @XmlEnumValue("MeetingCenter")
    MEETING_CENTER("MeetingCenter"),
    @XmlEnumValue("EventCenter")
    EVENT_CENTER("EventCenter"),
    @XmlEnumValue("TrainingCenter")
    TRAINING_CENTER("TrainingCenter"),
    @XmlEnumValue("SupportCenter")
    SUPPORT_CENTER("SupportCenter"),
    @XmlEnumValue("SalesCenter")
    SALES_CENTER("SalesCenter");
    private final String value;

    ServiceTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceTypeType fromValue(String v) {
        for (ServiceTypeType c: ServiceTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
