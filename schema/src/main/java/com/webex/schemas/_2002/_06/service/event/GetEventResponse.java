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

package com.webex.schemas._2002._06.service.event;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getEventResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getEventResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/event}eventInstanceType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enrollment" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentInstanceType" minOccurs="0"/>
 *         &lt;element name="enrollmentForm" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentFormGetType" minOccurs="0"/>
 *         &lt;element name="hostKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="guestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hostType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEventResponse", propOrder = {
    "status",
    "enrollment",
    "enrollmentForm",
    "hostKey",
    "eventID",
    "guestToken",
    "hostType"
})
public class GetEventResponse
    extends EventInstanceType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String status;
    protected EnrollmentInstanceType enrollment;
    protected EnrollmentFormGetType enrollmentForm;
    protected String hostKey;
    protected Long eventID;
    protected String guestToken;
    protected String hostType;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the enrollment property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentInstanceType }
     *     
     */
    public EnrollmentInstanceType getEnrollment() {
        return enrollment;
    }

    /**
     * Sets the value of the enrollment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentInstanceType }
     *     
     */
    public void setEnrollment(EnrollmentInstanceType value) {
        this.enrollment = value;
    }

    /**
     * Gets the value of the enrollmentForm property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentFormGetType }
     *     
     */
    public EnrollmentFormGetType getEnrollmentForm() {
        return enrollmentForm;
    }

    /**
     * Sets the value of the enrollmentForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentFormGetType }
     *     
     */
    public void setEnrollmentForm(EnrollmentFormGetType value) {
        this.enrollmentForm = value;
    }

    /**
     * Gets the value of the hostKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostKey() {
        return hostKey;
    }

    /**
     * Sets the value of the hostKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostKey(String value) {
        this.hostKey = value;
    }

    /**
     * Gets the value of the eventID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEventID() {
        return eventID;
    }

    /**
     * Sets the value of the eventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEventID(Long value) {
        this.eventID = value;
    }

    /**
     * Gets the value of the guestToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestToken() {
        return guestToken;
    }

    /**
     * Sets the value of the guestToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestToken(String value) {
        this.guestToken = value;
    }

    /**
     * Gets the value of the hostType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostType() {
        return hostType;
    }

    /**
     * Sets the value of the hostType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostType(String value) {
        this.hostType = value;
    }

}
