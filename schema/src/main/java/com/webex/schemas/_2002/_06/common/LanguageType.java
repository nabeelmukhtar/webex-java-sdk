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
 * The Enum LanguageType.
 */
@XmlType(name = "languageType")
@XmlEnum
public enum LanguageType {

    /** The ENGLISH. */
    ENGLISH("ENGLISH"),
    
    /** The INTERNATIONA l_ english. */
    @XmlEnumValue("INTERNATIONAL ENGLISH")
    INTERNATIONAL_ENGLISH("INTERNATIONAL ENGLISH"),
    
    /** The SIMPLIFIE d_ chinese. */
    @XmlEnumValue("SIMPLIFIED CHINESE")
    SIMPLIFIED_CHINESE("SIMPLIFIED CHINESE"),
    
    /** The TRADITIONA l_ chinese. */
    @XmlEnumValue("TRADITIONAL CHINESE")
    TRADITIONAL_CHINESE("TRADITIONAL CHINESE"),
    
    /** The JAPANESE. */
    JAPANESE("JAPANESE"),
    
    /** The KOREAN. */
    KOREAN("KOREAN"),
    
    /** The FRENCH. */
    FRENCH("FRENCH"),
    
    /** The CANADIA n_ french. */
    @XmlEnumValue("CANADIAN FRENCH")
    CANADIAN_FRENCH("CANADIAN FRENCH"),
    
    /** The GERMAN. */
    GERMAN("GERMAN"),
    
    /** The ITALIAN. */
    ITALIAN("ITALIAN"),
    
    /** The CASTILIA n_ spanish. */
    @XmlEnumValue("CASTILIAN SPANISH")
    CASTILIAN_SPANISH("CASTILIAN SPANISH"),
    
    /** The LATI n_ america n_ spanish. */
    @XmlEnumValue("LATIN AMERICAN SPANISH")
    LATIN_AMERICAN_SPANISH("LATIN AMERICAN SPANISH"),
    
    /** The SWEDISH. */
    SWEDISH("SWEDISH"),
    
    /** The DUTCH. */
    DUTCH("DUTCH"),
    
    /** The BRAZILIA n_ portuguese. */
    @XmlEnumValue("BRAZILIAN PORTUGUESE")
    BRAZILIAN_PORTUGUESE("BRAZILIAN PORTUGUESE"),
    
    /** The PORTUGUESE. */
    PORTUGUESE("PORTUGUESE"),
    
    /** The SPANISH. */
    SPANISH("SPANISH");
    
    /** The value. */
    private final String value;

    /**
     * Instantiates a new language type.
     * 
     * @param v the v
     */
    LanguageType(String v) {
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
     * @return the language type
     */
    public static LanguageType fromValue(String v) {
        for (LanguageType c: LanguageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
