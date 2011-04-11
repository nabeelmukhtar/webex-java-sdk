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

package com.webex.schemas._2002._06.service.meeting.auo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class TeleconfType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "teleconfType", propOrder = {
    "requestConferenceNumber",
    "accountIndex",
    "extTelephonyDescription",
    "intlLocalCallIn",
    "teleconfLocation"
})
public class TeleconfType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The request conference number. */
    protected Boolean requestConferenceNumber;
    
    /** The account index. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long accountIndex;
    
    /** The ext telephony description. */
    protected String extTelephonyDescription;
    
    /** The intl local call in. */
    protected Boolean intlLocalCallIn;
    
    /** The teleconf location. */
    protected String teleconfLocation;

    /**
     * Checks if is request conference number.
     * 
     * @return the boolean
     */
    public Boolean isRequestConferenceNumber() {
        return requestConferenceNumber;
    }

    /**
     * Sets the request conference number.
     * 
     * @param value the new request conference number
     */
    public void setRequestConferenceNumber(Boolean value) {
        this.requestConferenceNumber = value;
    }

    /**
     * Gets the account index.
     * 
     * @return the account index
     */
    public Long getAccountIndex() {
        return accountIndex;
    }

    /**
     * Sets the account index.
     * 
     * @param value the new account index
     */
    public void setAccountIndex(Long value) {
        this.accountIndex = value;
    }

    /**
     * Gets the ext telephony description.
     * 
     * @return the ext telephony description
     */
    public String getExtTelephonyDescription() {
        return extTelephonyDescription;
    }

    /**
     * Sets the ext telephony description.
     * 
     * @param value the new ext telephony description
     */
    public void setExtTelephonyDescription(String value) {
        this.extTelephonyDescription = value;
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

    /**
     * Gets the teleconf location.
     * 
     * @return the teleconf location
     */
    public String getTeleconfLocation() {
        return teleconfLocation;
    }

    /**
     * Sets the teleconf location.
     * 
     * @param value the new teleconf location
     */
    public void setTeleconfLocation(String value) {
        this.teleconfLocation = value;
    }

}
