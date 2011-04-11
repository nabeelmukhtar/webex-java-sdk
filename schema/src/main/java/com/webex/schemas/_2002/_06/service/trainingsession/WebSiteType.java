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

package com.webex.schemas._2002._06.service.trainingsession;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class WebSiteType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "webSiteType", propOrder = {
    "startDate",
    "dueDate",
    "emailAttendee"
})
public class WebSiteType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The start date. */
    @XmlElement(required = true)
    protected String startDate;
    
    /** The due date. */
    @XmlElement(required = true)
    protected String dueDate;
    
    /** The email attendee. */
    protected EmailAttendeeType emailAttendee;

    /**
     * Gets the start date.
     * 
     * @return the start date
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the start date.
     * 
     * @param value the new start date
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the due date.
     * 
     * @return the due date
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Sets the due date.
     * 
     * @param value the new due date
     */
    public void setDueDate(String value) {
        this.dueDate = value;
    }

    /**
     * Gets the email attendee.
     * 
     * @return the email attendee
     */
    public EmailAttendeeType getEmailAttendee() {
        return emailAttendee;
    }

    /**
     * Sets the email attendee.
     * 
     * @param value the new email attendee
     */
    public void setEmailAttendee(EmailAttendeeType value) {
        this.emailAttendee = value;
    }

}
