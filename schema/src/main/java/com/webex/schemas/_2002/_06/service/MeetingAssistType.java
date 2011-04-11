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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for meetingAssistType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meetingAssistType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assistRequest" type="{http://www.webex.com/schemas/2002/06/service}assistRequestType" minOccurs="0"/>
 *         &lt;element name="assistConfirm" type="{http://www.webex.com/schemas/2002/06/service}assistConfirmedType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meetingAssistType", propOrder = {
    "assistRequest",
    "assistConfirm"
})
public class MeetingAssistType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected AssistRequestType assistRequest;
    protected AssistConfirmedType assistConfirm;

    /**
     * Gets the value of the assistRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AssistRequestType }
     *     
     */
    public AssistRequestType getAssistRequest() {
        return assistRequest;
    }

    /**
     * Sets the value of the assistRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssistRequestType }
     *     
     */
    public void setAssistRequest(AssistRequestType value) {
        this.assistRequest = value;
    }

    /**
     * Gets the value of the assistConfirm property.
     * 
     * @return
     *     possible object is
     *     {@link AssistConfirmedType }
     *     
     */
    public AssistConfirmedType getAssistConfirm() {
        return assistConfirm;
    }

    /**
     * Sets the value of the assistConfirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssistConfirmedType }
     *     
     */
    public void setAssistConfirm(AssistConfirmedType value) {
        this.assistConfirm = value;
    }

}
