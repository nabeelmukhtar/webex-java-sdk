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
import com.webex.schemas._2002._06.service.ep.OneClickAccountLabelType;


/**
 * The Class TspAccountLabelType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tspAccountLabelType", propOrder = {
    "tollFreeCallInNumberLabel",
    "tollCallInNumberLabel",
    "subscriberAccessCodeLabel",
    "participantAccessCodeLabel"
})
@XmlSeeAlso({
    OneClickAccountLabelType.class
})
public class TspAccountLabelType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The toll free call in number label. */
    @XmlElement(required = true)
    protected String tollFreeCallInNumberLabel;
    
    /** The toll call in number label. */
    @XmlElement(required = true)
    protected String tollCallInNumberLabel;
    
    /** The subscriber access code label. */
    protected String subscriberAccessCodeLabel;
    
    /** The participant access code label. */
    protected String participantAccessCodeLabel;

    /**
     * Gets the toll free call in number label.
     * 
     * @return the toll free call in number label
     */
    public String getTollFreeCallInNumberLabel() {
        return tollFreeCallInNumberLabel;
    }

    /**
     * Sets the toll free call in number label.
     * 
     * @param value the new toll free call in number label
     */
    public void setTollFreeCallInNumberLabel(String value) {
        this.tollFreeCallInNumberLabel = value;
    }

    /**
     * Gets the toll call in number label.
     * 
     * @return the toll call in number label
     */
    public String getTollCallInNumberLabel() {
        return tollCallInNumberLabel;
    }

    /**
     * Sets the toll call in number label.
     * 
     * @param value the new toll call in number label
     */
    public void setTollCallInNumberLabel(String value) {
        this.tollCallInNumberLabel = value;
    }

    /**
     * Gets the subscriber access code label.
     * 
     * @return the subscriber access code label
     */
    public String getSubscriberAccessCodeLabel() {
        return subscriberAccessCodeLabel;
    }

    /**
     * Sets the subscriber access code label.
     * 
     * @param value the new subscriber access code label
     */
    public void setSubscriberAccessCodeLabel(String value) {
        this.subscriberAccessCodeLabel = value;
    }

    /**
     * Gets the participant access code label.
     * 
     * @return the participant access code label
     */
    public String getParticipantAccessCodeLabel() {
        return participantAccessCodeLabel;
    }

    /**
     * Sets the participant access code label.
     * 
     * @param value the new participant access code label
     */
    public void setParticipantAccessCodeLabel(String value) {
        this.participantAccessCodeLabel = value;
    }

}
