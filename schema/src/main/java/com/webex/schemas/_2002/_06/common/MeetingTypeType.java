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
 * <p>Java class for meetingTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="meetingTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INITIAL"/>
 *     &lt;enumeration value="FRE"/>
 *     &lt;enumeration value="STD"/>
 *     &lt;enumeration value="PRO"/>
 *     &lt;enumeration value="STANDARD_SUB"/>
 *     &lt;enumeration value="PRO_SUB"/>
 *     &lt;enumeration value="PPU"/>
 *     &lt;enumeration value="ONCALL"/>
 *     &lt;enumeration value="ONTOUR"/>
 *     &lt;enumeration value="ONSTAGE"/>
 *     &lt;enumeration value="ACCESS_ANYWHERE"/>
 *     &lt;enumeration value="COB"/>
 *     &lt;enumeration value="OCS"/>
 *     &lt;enumeration value="ONS"/>
 *     &lt;enumeration value="RAS"/>
 *     &lt;enumeration value="SC3"/>
 *     &lt;enumeration value="SOP"/>
 *     &lt;enumeration value="SOS"/>
 *     &lt;enumeration value="TRS"/>
 *     &lt;enumeration value="CUSTOM"/>
 *     &lt;enumeration value="SMT"/>
 *     &lt;enumeration value="SAC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "meetingTypeType")
@XmlEnum
public enum MeetingTypeType {

    INITIAL("INITIAL"),
    FRE("FRE"),
    STD("STD"),
    PRO("PRO"),
    STANDARD_SUB("STANDARD_SUB"),
    PRO_SUB("PRO_SUB"),
    PPU("PPU"),
    ONCALL("ONCALL"),
    ONTOUR("ONTOUR"),
    ONSTAGE("ONSTAGE"),
    ACCESS_ANYWHERE("ACCESS_ANYWHERE"),
    COB("COB"),
    OCS("OCS"),
    ONS("ONS"),
    RAS("RAS"),
    @XmlEnumValue("SC3")
    SC_3("SC3"),
    SOP("SOP"),
    SOS("SOS"),
    TRS("TRS"),
    CUSTOM("CUSTOM"),
    SMT("SMT"),
    SAC("SAC");
    private final String value;

    MeetingTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeetingTypeType fromValue(String v) {
        for (MeetingTypeType c: MeetingTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
