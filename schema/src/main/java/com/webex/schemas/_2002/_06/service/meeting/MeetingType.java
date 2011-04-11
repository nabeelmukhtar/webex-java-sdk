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
import com.webex.schemas._2002._06.common.TrackingType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.MeetingAssistType;


/**
 * The Class MeetingType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meetingType", propOrder = {
    "accessControl",
    "metaData",
    "participants",
    "enableOptions",
    "schedule",
    "telephony",
    "tracking",
    "repeat",
    "remind",
    "attendeeOptions",
    "assistService"
})
@XmlSeeAlso({
    CreateMeeting.class,
    MeetingInstanceType.class
})
public class MeetingType
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The access control. */
    protected AccessControlType accessControl;
    
    /** The meta data. */
    protected MetaDataType metaData;
    
    /** The participants. */
    protected ParticipantsType participants;
    
    /** The enable options. */
    protected EnableOptionsType enableOptions;
    
    /** The schedule. */
    protected ScheduleType schedule;
    
    /** The telephony. */
    protected TelephonyType telephony;
    
    /** The tracking. */
    protected TrackingType tracking;
    
    /** The repeat. */
    protected RepeatType repeat;
    
    /** The remind. */
    protected RemindType remind;
    
    /** The attendee options. */
    protected AttendeeOptionsType attendeeOptions;
    
    /** The assist service. */
    protected MeetingAssistType assistService;

    /**
     * Gets the access control.
     * 
     * @return the access control
     */
    public AccessControlType getAccessControl() {
        return accessControl;
    }

    /**
     * Sets the access control.
     * 
     * @param value the new access control
     */
    public void setAccessControl(AccessControlType value) {
        this.accessControl = value;
    }

    /**
     * Gets the meta data.
     * 
     * @return the meta data
     */
    public MetaDataType getMetaData() {
        return metaData;
    }

    /**
     * Sets the meta data.
     * 
     * @param value the new meta data
     */
    public void setMetaData(MetaDataType value) {
        this.metaData = value;
    }

    /**
     * Gets the participants.
     * 
     * @return the participants
     */
    public ParticipantsType getParticipants() {
        return participants;
    }

    /**
     * Sets the participants.
     * 
     * @param value the new participants
     */
    public void setParticipants(ParticipantsType value) {
        this.participants = value;
    }

    /**
     * Gets the enable options.
     * 
     * @return the enable options
     */
    public EnableOptionsType getEnableOptions() {
        return enableOptions;
    }

    /**
     * Sets the enable options.
     * 
     * @param value the new enable options
     */
    public void setEnableOptions(EnableOptionsType value) {
        this.enableOptions = value;
    }

    /**
     * Gets the schedule.
     * 
     * @return the schedule
     */
    public ScheduleType getSchedule() {
        return schedule;
    }

    /**
     * Sets the schedule.
     * 
     * @param value the new schedule
     */
    public void setSchedule(ScheduleType value) {
        this.schedule = value;
    }

    /**
     * Gets the telephony.
     * 
     * @return the telephony
     */
    public TelephonyType getTelephony() {
        return telephony;
    }

    /**
     * Sets the telephony.
     * 
     * @param value the new telephony
     */
    public void setTelephony(TelephonyType value) {
        this.telephony = value;
    }

    /**
     * Gets the tracking.
     * 
     * @return the tracking
     */
    public TrackingType getTracking() {
        return tracking;
    }

    /**
     * Sets the tracking.
     * 
     * @param value the new tracking
     */
    public void setTracking(TrackingType value) {
        this.tracking = value;
    }

    /**
     * Gets the repeat.
     * 
     * @return the repeat
     */
    public RepeatType getRepeat() {
        return repeat;
    }

    /**
     * Sets the repeat.
     * 
     * @param value the new repeat
     */
    public void setRepeat(RepeatType value) {
        this.repeat = value;
    }

    /**
     * Gets the remind.
     * 
     * @return the remind
     */
    public RemindType getRemind() {
        return remind;
    }

    /**
     * Sets the remind.
     * 
     * @param value the new remind
     */
    public void setRemind(RemindType value) {
        this.remind = value;
    }

    /**
     * Gets the attendee options.
     * 
     * @return the attendee options
     */
    public AttendeeOptionsType getAttendeeOptions() {
        return attendeeOptions;
    }

    /**
     * Sets the attendee options.
     * 
     * @param value the new attendee options
     */
    public void setAttendeeOptions(AttendeeOptionsType value) {
        this.attendeeOptions = value;
    }

    /**
     * Gets the assist service.
     * 
     * @return the assist service
     */
    public MeetingAssistType getAssistService() {
        return assistService;
    }

    /**
     * Sets the assist service.
     * 
     * @param value the new assist service
     */
    public void setAssistService(MeetingAssistType value) {
        this.assistService = value;
    }

}
