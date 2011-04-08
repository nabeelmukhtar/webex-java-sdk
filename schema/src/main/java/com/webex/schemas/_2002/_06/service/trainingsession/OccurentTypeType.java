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

package com.webex.schemas._2002._06.service.trainingsession;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for occurentTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="occurentTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WEEKLY"/>
 *     &lt;enumeration value="DAILY"/>
 *     &lt;enumeration value="NO_REPEAT"/>
 *     &lt;enumeration value="CONSTANT"/>
 *     &lt;enumeration value="MONTHLY"/>
 *     &lt;enumeration value="IRREGULARLY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "occurentTypeType")
@XmlEnum
public enum OccurentTypeType {

    WEEKLY,
    DAILY,
    NO_REPEAT,
    CONSTANT,
    MONTHLY,
    IRREGULARLY;

    public String value() {
        return name();
    }

    public static OccurentTypeType fromValue(String v) {
        return valueOf(v);
    }

}
