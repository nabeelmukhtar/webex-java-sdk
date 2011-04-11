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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.ep.OneClickAccountType;


/**
 * The Class TspAccountType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tspAccountType", propOrder = {
    "tollFreeCallInNumber",
    "tollCallInNumber",
    "subscriberAccessCode",
    "participantAccessCode"
})
@XmlSeeAlso({
    OneClickAccountType.class
})
public class TspAccountType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The toll free call in number. */
    @XmlElement(required = true)
    protected String tollFreeCallInNumber;
    
    /** The toll call in number. */
    @XmlElement(required = true)
    protected String tollCallInNumber;
    
    /** The subscriber access code. */
    protected String subscriberAccessCode;
    
    /** The participant access code. */
    protected String participantAccessCode;

    /**
     * Gets the toll free call in number.
     * 
     * @return the toll free call in number
     */
    public String getTollFreeCallInNumber() {
        return tollFreeCallInNumber;
    }

    /**
     * Sets the toll free call in number.
     * 
     * @param value the new toll free call in number
     */
    public void setTollFreeCallInNumber(String value) {
        this.tollFreeCallInNumber = value;
    }

    /**
     * Gets the toll call in number.
     * 
     * @return the toll call in number
     */
    public String getTollCallInNumber() {
        return tollCallInNumber;
    }

    /**
     * Sets the toll call in number.
     * 
     * @param value the new toll call in number
     */
    public void setTollCallInNumber(String value) {
        this.tollCallInNumber = value;
    }

    /**
     * Gets the subscriber access code.
     * 
     * @return the subscriber access code
     */
    public String getSubscriberAccessCode() {
        return subscriberAccessCode;
    }

    /**
     * Sets the subscriber access code.
     * 
     * @param value the new subscriber access code
     */
    public void setSubscriberAccessCode(String value) {
        this.subscriberAccessCode = value;
    }

    /**
     * Gets the participant access code.
     * 
     * @return the participant access code
     */
    public String getParticipantAccessCode() {
        return participantAccessCode;
    }

    /**
     * Sets the participant access code.
     * 
     * @param value the new participant access code
     */
    public void setParticipantAccessCode(String value) {
        this.participantAccessCode = value;
    }

}
