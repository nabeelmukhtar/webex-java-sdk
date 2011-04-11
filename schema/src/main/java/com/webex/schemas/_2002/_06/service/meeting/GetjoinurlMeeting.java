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

package com.webex.schemas._2002._06.service.meeting;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * The Class GetjoinurlMeeting.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getjoinurlMeeting", propOrder = {
    "meetingKey",
    "sessionKey",
    "attendeeName",
    "attendeeEmail",
    "meetingPW",
    "regID"
})
public class GetjoinurlMeeting
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The meeting key. */
    protected Long meetingKey;
    
    /** The session key. */
    protected Long sessionKey;
    
    /** The attendee name. */
    protected String attendeeName;
    
    /** The attendee email. */
    protected String attendeeEmail;
    
    /** The meeting pw. */
    protected String meetingPW;
    
    /** The reg id. */
    @XmlElement(name = "RegID")
    protected String regID;

    /**
     * Gets the meeting key.
     * 
     * @return the meeting key
     */
    public Long getMeetingKey() {
        return meetingKey;
    }

    /**
     * Sets the meeting key.
     * 
     * @param value the new meeting key
     */
    public void setMeetingKey(Long value) {
        this.meetingKey = value;
    }

    /**
     * Gets the session key.
     * 
     * @return the session key
     */
    public Long getSessionKey() {
        return sessionKey;
    }

    /**
     * Sets the session key.
     * 
     * @param value the new session key
     */
    public void setSessionKey(Long value) {
        this.sessionKey = value;
    }

    /**
     * Gets the attendee name.
     * 
     * @return the attendee name
     */
    public String getAttendeeName() {
        return attendeeName;
    }

    /**
     * Sets the attendee name.
     * 
     * @param value the new attendee name
     */
    public void setAttendeeName(String value) {
        this.attendeeName = value;
    }

    /**
     * Gets the attendee email.
     * 
     * @return the attendee email
     */
    public String getAttendeeEmail() {
        return attendeeEmail;
    }

    /**
     * Sets the attendee email.
     * 
     * @param value the new attendee email
     */
    public void setAttendeeEmail(String value) {
        this.attendeeEmail = value;
    }

    /**
     * Gets the meeting pw.
     * 
     * @return the meeting pw
     */
    public String getMeetingPW() {
        return meetingPW;
    }

    /**
     * Sets the meeting pw.
     * 
     * @param value the new meeting pw
     */
    public void setMeetingPW(String value) {
        this.meetingPW = value;
    }

    /**
     * Gets the reg id.
     * 
     * @return the reg id
     */
    public String getRegID() {
        return regID;
    }

    /**
     * Sets the reg id.
     * 
     * @param value the new reg id
     */
    public void setRegID(String value) {
        this.regID = value;
    }

}
