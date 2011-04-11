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

package com.webex.schemas._2002._06.service.sales;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enableOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="enableOptionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autoDeleteAfterMeetingEnd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sendEmailByClient" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="displayQuickStartHost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enableOptionsType", propOrder = {
    "autoDeleteAfterMeetingEnd",
    "sendEmailByClient",
    "displayQuickStartHost"
})
public class EnableOptionsType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected Boolean autoDeleteAfterMeetingEnd;
    protected Boolean sendEmailByClient;
    protected Boolean displayQuickStartHost;

    /**
     * Gets the value of the autoDeleteAfterMeetingEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoDeleteAfterMeetingEnd() {
        return autoDeleteAfterMeetingEnd;
    }

    /**
     * Sets the value of the autoDeleteAfterMeetingEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoDeleteAfterMeetingEnd(Boolean value) {
        this.autoDeleteAfterMeetingEnd = value;
    }

    /**
     * Gets the value of the sendEmailByClient property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendEmailByClient() {
        return sendEmailByClient;
    }

    /**
     * Sets the value of the sendEmailByClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendEmailByClient(Boolean value) {
        this.sendEmailByClient = value;
    }

    /**
     * Gets the value of the displayQuickStartHost property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayQuickStartHost() {
        return displayQuickStartHost;
    }

    /**
     * Sets the value of the displayQuickStartHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayQuickStartHost(Boolean value) {
        this.displayQuickStartHost = value;
    }

}
