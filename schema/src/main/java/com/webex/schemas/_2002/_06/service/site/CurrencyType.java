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
 * The Enum CurrencyType.
 */
@XmlType(name = "currencyType")
@XmlEnum
public enum CurrencyType {

    /** The U s_ dollars. */
    @XmlEnumValue("US Dollars")
    US_DOLLARS("US Dollars"),
    
    /** The AUSTRALIA n_ dollars. */
    @XmlEnumValue("Australian Dollars")
    AUSTRALIAN_DOLLARS("Australian Dollars"),
    
    /** The CANADIA n_ dollars. */
    @XmlEnumValue("Canadian Dollars")
    CANADIAN_DOLLARS("Canadian Dollars"),
    
    /** The BRITIS h_ pounds. */
    @XmlEnumValue("British Pounds")
    BRITISH_POUNDS("British Pounds"),
    
    /** The EUROS. */
    @XmlEnumValue("Euros")
    EUROS("Euros"),
    
    /** The FRENC h_ francs. */
    @XmlEnumValue("French Francs")
    FRENCH_FRANCS("French Francs"),
    
    /** The DEUTSCHMARKS. */
    @XmlEnumValue("Deutschmarks")
    DEUTSCHMARKS("Deutschmarks"),
    
    /** The HON g_ kon g_ dollars. */
    @XmlEnumValue("Hong Kong Dollars")
    HONG_KONG_DOLLARS("Hong Kong Dollars"),
    
    /** The ITALIA n_ lira. */
    @XmlEnumValue("Italian Lira")
    ITALIAN_LIRA("Italian Lira"),
    
    /** The JAPANES e_ yen. */
    @XmlEnumValue("Japanese Yen")
    JAPANESE_YEN("Japanese Yen"),
    
    /** The NE w_ zealan d_ dollars. */
    @XmlEnumValue("New Zealand Dollars")
    NEW_ZEALAND_DOLLARS("New Zealand Dollars"),
    
    /** The SWIS s_ francs. */
    @XmlEnumValue("Swiss Francs")
    SWISS_FRANCS("Swiss Francs"),
    
    /** The KOREA n_ won. */
    @XmlEnumValue("Korean Won")
    KOREAN_WON("Korean Won");
    
    /** The value. */
    private final String value;

    /**
     * Instantiates a new currency type.
     * 
     * @param v the v
     */
    CurrencyType(String v) {
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
     * @return the currency type
     */
    public static CurrencyType fromValue(String v) {
        for (CurrencyType c: CurrencyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
