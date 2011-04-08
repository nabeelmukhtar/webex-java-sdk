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

package com.webex.schemas._2002._06.service.user;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.webex.schemas._2002._06.common.ServiceTypeType;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for sessionOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sessionOptionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="defaultSessionType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="defaultServiceType" type="{http://www.webex.com/schemas/2002/06/common}serviceTypeType" minOccurs="0"/>
 *         &lt;element name="autoDeleteAfterMeetingEnd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="displayQuickStartHost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="displayQuickStartAttendees" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sessionOptionsType", propOrder = {
    "defaultSessionType",
    "defaultServiceType",
    "autoDeleteAfterMeetingEnd",
    "displayQuickStartHost",
    "displayQuickStartAttendees"
})
public class SessionOptionsType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long defaultSessionType;
    protected ServiceTypeType defaultServiceType;
    protected Boolean autoDeleteAfterMeetingEnd;
    protected Boolean displayQuickStartHost;
    protected Boolean displayQuickStartAttendees;

    /**
     * Gets the value of the defaultSessionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getDefaultSessionType() {
        return defaultSessionType;
    }

    /**
     * Sets the value of the defaultSessionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultSessionType(Long value) {
        this.defaultSessionType = value;
    }

    /**
     * Gets the value of the defaultServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceTypeType }
     *     
     */
    public ServiceTypeType getDefaultServiceType() {
        return defaultServiceType;
    }

    /**
     * Sets the value of the defaultServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceTypeType }
     *     
     */
    public void setDefaultServiceType(ServiceTypeType value) {
        this.defaultServiceType = value;
    }

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

    /**
     * Gets the value of the displayQuickStartAttendees property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayQuickStartAttendees() {
        return displayQuickStartAttendees;
    }

    /**
     * Sets the value of the displayQuickStartAttendees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayQuickStartAttendees(Boolean value) {
        this.displayQuickStartAttendees = value;
    }

}
