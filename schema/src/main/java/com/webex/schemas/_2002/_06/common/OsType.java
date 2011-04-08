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
 * <p>Java class for osType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="osType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WIN2K"/>
 *     &lt;enumeration value="WINNT"/>
 *     &lt;enumeration value="WIN9X"/>
 *     &lt;enumeration value="LINUX"/>
 *     &lt;enumeration value="HPUX"/>
 *     &lt;enumeration value="AIX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "osType")
@XmlEnum
public enum OsType {

    @XmlEnumValue("WIN2K")
    WIN_2_K("WIN2K"),
    WINNT("WINNT"),
    @XmlEnumValue("WIN9X")
    WIN_9_X("WIN9X"),
    LINUX("LINUX"),
    HPUX("HPUX"),
    AIX("AIX");
    private final String value;

    OsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OsType fromValue(String v) {
        for (OsType c: OsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
