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
 * <p>Java class for languageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="languageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ENGLISH"/>
 *     &lt;enumeration value="INTERNATIONAL ENGLISH"/>
 *     &lt;enumeration value="SIMPLIFIED CHINESE"/>
 *     &lt;enumeration value="TRADITIONAL CHINESE"/>
 *     &lt;enumeration value="JAPANESE"/>
 *     &lt;enumeration value="KOREAN"/>
 *     &lt;enumeration value="FRENCH"/>
 *     &lt;enumeration value="CANADIAN FRENCH"/>
 *     &lt;enumeration value="GERMAN"/>
 *     &lt;enumeration value="ITALIAN"/>
 *     &lt;enumeration value="CASTILIAN SPANISH"/>
 *     &lt;enumeration value="LATIN AMERICAN SPANISH"/>
 *     &lt;enumeration value="SWEDISH"/>
 *     &lt;enumeration value="DUTCH"/>
 *     &lt;enumeration value="BRAZILIAN PORTUGUESE"/>
 *     &lt;enumeration value="PORTUGUESE"/>
 *     &lt;enumeration value="SPANISH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "languageType")
@XmlEnum
public enum LanguageType {

    ENGLISH("ENGLISH"),
    @XmlEnumValue("INTERNATIONAL ENGLISH")
    INTERNATIONAL_ENGLISH("INTERNATIONAL ENGLISH"),
    @XmlEnumValue("SIMPLIFIED CHINESE")
    SIMPLIFIED_CHINESE("SIMPLIFIED CHINESE"),
    @XmlEnumValue("TRADITIONAL CHINESE")
    TRADITIONAL_CHINESE("TRADITIONAL CHINESE"),
    JAPANESE("JAPANESE"),
    KOREAN("KOREAN"),
    FRENCH("FRENCH"),
    @XmlEnumValue("CANADIAN FRENCH")
    CANADIAN_FRENCH("CANADIAN FRENCH"),
    GERMAN("GERMAN"),
    ITALIAN("ITALIAN"),
    @XmlEnumValue("CASTILIAN SPANISH")
    CASTILIAN_SPANISH("CASTILIAN SPANISH"),
    @XmlEnumValue("LATIN AMERICAN SPANISH")
    LATIN_AMERICAN_SPANISH("LATIN AMERICAN SPANISH"),
    SWEDISH("SWEDISH"),
    DUTCH("DUTCH"),
    @XmlEnumValue("BRAZILIAN PORTUGUESE")
    BRAZILIAN_PORTUGUESE("BRAZILIAN PORTUGUESE"),
    PORTUGUESE("PORTUGUESE"),
    SPANISH("SPANISH");
    private final String value;

    LanguageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LanguageType fromValue(String v) {
        for (LanguageType c: LanguageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
