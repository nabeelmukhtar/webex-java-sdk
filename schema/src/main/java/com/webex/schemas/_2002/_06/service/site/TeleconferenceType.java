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

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class TeleconferenceType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "teleconferenceType", propOrder = {
    "telephonySupport",
    "tollFree",
    "intlLocalCallIn"
})
public class TeleconferenceType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The telephony support. */
    @XmlElement(required = true)
    protected TelephonySupportType telephonySupport;
    
    /** The toll free. */
    protected Boolean tollFree;
    
    /** The intl local call in. */
    protected Boolean intlLocalCallIn;

    /**
     * Gets the telephony support.
     * 
     * @return the telephony support
     */
    public TelephonySupportType getTelephonySupport() {
        return telephonySupport;
    }

    /**
     * Sets the telephony support.
     * 
     * @param value the new telephony support
     */
    public void setTelephonySupport(TelephonySupportType value) {
        this.telephonySupport = value;
    }

    /**
     * Checks if is toll free.
     * 
     * @return the boolean
     */
    public Boolean isTollFree() {
        return tollFree;
    }

    /**
     * Sets the toll free.
     * 
     * @param value the new toll free
     */
    public void setTollFree(Boolean value) {
        this.tollFree = value;
    }

    /**
     * Checks if is intl local call in.
     * 
     * @return the boolean
     */
    public Boolean isIntlLocalCallIn() {
        return intlLocalCallIn;
    }

    /**
     * Sets the intl local call in.
     * 
     * @param value the new intl local call in
     */
    public void setIntlLocalCallIn(Boolean value) {
        this.intlLocalCallIn = value;
    }

}
