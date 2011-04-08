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
 * <p>Java class for orderMCHisByType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="orderMCHisByType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONFNAME"/>
 *     &lt;enumeration value="STARTTIME"/>
 *     &lt;enumeration value="TOTALATTENDEE"/>
 *     &lt;enumeration value="HOSTNAME"/>
 *     &lt;enumeration value="ASSISTREQUEST"/>
 *     &lt;enumeration value="ASSISTCONFIRM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "orderMCHisByType")
@XmlEnum
public enum OrderMCHisByType {

    CONFNAME,
    STARTTIME,
    TOTALATTENDEE,
    HOSTNAME,
    ASSISTREQUEST,
    ASSISTCONFIRM;

    public String value() {
        return name();
    }

    public static OrderMCHisByType fromValue(String v) {
        return valueOf(v);
    }

}
