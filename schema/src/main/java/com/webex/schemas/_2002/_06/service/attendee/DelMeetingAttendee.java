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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * The Class DelMeetingAttendee.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delMeetingAttendee", propOrder = {
    "attendeeID",
    "attendeeEmail",
    "sendEmail"
})
public class DelMeetingAttendee
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The attendee id. */
    @XmlElement(type = Long.class)
    protected List<Long> attendeeID;
    
    /** The attendee email. */
    protected List<AttendeeEmailType> attendeeEmail;
    
    /** The send email. */
    protected Boolean sendEmail;

    /**
     * Gets the attendee id.
     * 
     * @return the attendee id
     */
    public List<Long> getAttendeeID() {
        if (attendeeID == null) {
            attendeeID = new ArrayList<Long>();
        }
        return this.attendeeID;
    }

    /**
     * Gets the attendee email.
     * 
     * @return the attendee email
     */
    public List<AttendeeEmailType> getAttendeeEmail() {
        if (attendeeEmail == null) {
            attendeeEmail = new ArrayList<AttendeeEmailType>();
        }
        return this.attendeeEmail;
    }

    /**
     * Checks if is send email.
     * 
     * @return the boolean
     */
    public Boolean isSendEmail() {
        return sendEmail;
    }

    /**
     * Sets the send email.
     * 
     * @param value the new send email
     */
    public void setSendEmail(Boolean value) {
        this.sendEmail = value;
    }

}
