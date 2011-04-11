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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class MeetingInstanceType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meetingInstanceType", propOrder = {
    "meetingkey",
    "status",
    "hostJoined",
    "participantsJoined"
})
@XmlSeeAlso({
    SetMeeting.class,
    GetMeetingResponse.class
})
public class MeetingInstanceType
    extends MeetingType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The meetingkey. */
    protected long meetingkey;
    
    /** The status. */
    protected String status;
    
    /** The host joined. */
    protected Boolean hostJoined;
    
    /** The participants joined. */
    protected Boolean participantsJoined;

    /**
     * Gets the meetingkey.
     * 
     * @return the meetingkey
     */
    public long getMeetingkey() {
        return meetingkey;
    }

    /**
     * Sets the meetingkey.
     * 
     * @param value the new meetingkey
     */
    public void setMeetingkey(long value) {
        this.meetingkey = value;
    }

    /**
     * Gets the status.
     * 
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status.
     * 
     * @param value the new status
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Checks if is host joined.
     * 
     * @return the boolean
     */
    public Boolean isHostJoined() {
        return hostJoined;
    }

    /**
     * Sets the host joined.
     * 
     * @param value the new host joined
     */
    public void setHostJoined(Boolean value) {
        this.hostJoined = value;
    }

    /**
     * Checks if is participants joined.
     * 
     * @return the boolean
     */
    public Boolean isParticipantsJoined() {
        return participantsJoined;
    }

    /**
     * Sets the participants joined.
     * 
     * @param value the new participants joined
     */
    public void setParticipantsJoined(Boolean value) {
        this.participantsJoined = value;
    }

}
