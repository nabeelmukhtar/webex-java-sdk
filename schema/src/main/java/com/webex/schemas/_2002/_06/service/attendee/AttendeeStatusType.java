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
 * <p>Java class for attendeeStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="attendeeStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="invited" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="registered" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="rejected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="accepted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attendeeStatusType", propOrder = {
    "invited",
    "registered",
    "rejected",
    "accepted"
})
public class AttendeeStatusType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected boolean invited;
    protected boolean registered;
    protected boolean rejected;
    protected boolean accepted;

    /**
     * Gets the value of the invited property.
     * 
     */
    public boolean isInvited() {
        return invited;
    }

    /**
     * Sets the value of the invited property.
     * 
     */
    public void setInvited(boolean value) {
        this.invited = value;
    }

    /**
     * Gets the value of the registered property.
     * 
     */
    public boolean isRegistered() {
        return registered;
    }

    /**
     * Sets the value of the registered property.
     * 
     */
    public void setRegistered(boolean value) {
        this.registered = value;
    }

    /**
     * Gets the value of the rejected property.
     * 
     */
    public boolean isRejected() {
        return rejected;
    }

    /**
     * Sets the value of the rejected property.
     * 
     */
    public void setRejected(boolean value) {
        this.rejected = value;
    }

    /**
     * Gets the value of the accepted property.
     * 
     */
    public boolean isAccepted() {
        return accepted;
    }

    /**
     * Sets the value of the accepted property.
     * 
     */
    public void setAccepted(boolean value) {
        this.accepted = value;
    }

}
