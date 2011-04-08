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

package com.webex.schemas._2002._06.service.attendee;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for attendeeInstanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="attendeeInstanceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/attendee}attendeeType">
 *       &lt;sequence>
 *         &lt;element name="attendeeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="confID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.webex.com/schemas/2002/06/service/attendee}attendeeStatusType" minOccurs="0"/>
 *         &lt;element name="registerID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attendeeInstanceType", propOrder = {
    "attendeeId",
    "confID",
    "status",
    "registerID"
})
public class AttendeeInstanceType
    extends AttendeeType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected long attendeeId;
    protected Long confID;
    protected AttendeeStatusType status;
    protected Long registerID;

    /**
     * Gets the value of the attendeeId property.
     * 
     */
    public long getAttendeeId() {
        return attendeeId;
    }

    /**
     * Sets the value of the attendeeId property.
     * 
     */
    public void setAttendeeId(long value) {
        this.attendeeId = value;
    }

    /**
     * Gets the value of the confID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConfID() {
        return confID;
    }

    /**
     * Sets the value of the confID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConfID(Long value) {
        this.confID = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AttendeeStatusType }
     *     
     */
    public AttendeeStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttendeeStatusType }
     *     
     */
    public void setStatus(AttendeeStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the registerID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRegisterID() {
        return registerID;
    }

    /**
     * Sets the value of the registerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRegisterID(Long value) {
        this.registerID = value;
    }

}
