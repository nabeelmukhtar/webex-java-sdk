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

package com.webex.schemas._2002._06.service.meetingtype;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * The Class MeetingTypeTypeExt.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meetingTypeTypeExt", propOrder = {
    "productCodePrefix",
    "active",
    "name",
    "displayName",
    "limits",
    "options",
    "phoneNumbers"
})
@XmlSeeAlso({
    MeetingTypeInstanceType.class
})
public class MeetingTypeTypeExt
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The product code prefix. */
    @XmlElement(required = true)
    protected String productCodePrefix;
    
    /** The active. */
    @XmlElement(required = true)
    protected ActiveType active;
    
    /** The name. */
    @XmlElement(required = true)
    protected String name;
    
    /** The display name. */
    protected String displayName;
    
    /** The limits. */
    protected LimitsType limits;
    
    /** The options. */
    @XmlElement(required = true)
    protected OptionsType options;
    
    /** The phone numbers. */
    @XmlElement(required = true)
    protected PhoneNumbersType phoneNumbers;

    /**
     * Gets the product code prefix.
     * 
     * @return the product code prefix
     */
    public String getProductCodePrefix() {
        return productCodePrefix;
    }

    /**
     * Sets the product code prefix.
     * 
     * @param value the new product code prefix
     */
    public void setProductCodePrefix(String value) {
        this.productCodePrefix = value;
    }

    /**
     * Gets the active.
     * 
     * @return the active
     */
    public ActiveType getActive() {
        return active;
    }

    /**
     * Sets the active.
     * 
     * @param value the new active
     */
    public void setActive(ActiveType value) {
        this.active = value;
    }

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     * 
     * @param value the new name
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the display name.
     * 
     * @return the display name
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the display name.
     * 
     * @param value the new display name
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the limits.
     * 
     * @return the limits
     */
    public LimitsType getLimits() {
        return limits;
    }

    /**
     * Sets the limits.
     * 
     * @param value the new limits
     */
    public void setLimits(LimitsType value) {
        this.limits = value;
    }

    /**
     * Gets the options.
     * 
     * @return the options
     */
    public OptionsType getOptions() {
        return options;
    }

    /**
     * Sets the options.
     * 
     * @param value the new options
     */
    public void setOptions(OptionsType value) {
        this.options = value;
    }

    /**
     * Gets the phone numbers.
     * 
     * @return the phone numbers
     */
    public PhoneNumbersType getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * Sets the phone numbers.
     * 
     * @param value the new phone numbers
     */
    public void setPhoneNumbers(PhoneNumbersType value) {
        this.phoneNumbers = value;
    }

}
