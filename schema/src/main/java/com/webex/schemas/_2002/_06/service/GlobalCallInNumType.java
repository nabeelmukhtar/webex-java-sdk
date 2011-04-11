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

package com.webex.schemas._2002._06.service;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class GlobalCallInNumType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "globalCallInNumType", propOrder = {
    "countryAlias",
    "phoneNumber",
    "tollFree"
})
public class GlobalCallInNumType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The country alias. */
    @XmlElement(required = true)
    protected String countryAlias;
    
    /** The phone number. */
    @XmlElement(required = true)
    protected String phoneNumber;
    
    /** The toll free. */
    protected boolean tollFree;

    /**
     * Gets the country alias.
     * 
     * @return the country alias
     */
    public String getCountryAlias() {
        return countryAlias;
    }

    /**
     * Sets the country alias.
     * 
     * @param value the new country alias
     */
    public void setCountryAlias(String value) {
        this.countryAlias = value;
    }

    /**
     * Gets the phone number.
     * 
     * @return the phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the phone number.
     * 
     * @param value the new phone number
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Checks if is toll free.
     * 
     * @return true, if is toll free
     */
    public boolean isTollFree() {
        return tollFree;
    }

    /**
     * Sets the toll free.
     * 
     * @param value the new toll free
     */
    public void setTollFree(boolean value) {
        this.tollFree = value;
    }

}
