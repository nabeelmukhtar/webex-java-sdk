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

package com.webex.schemas._2002._06.service.meeting.auo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.TrackingType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * The Class AudioOnlyInstanceType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "audioOnlyInstanceType", propOrder = {
    "accessControl",
    "metaData",
    "schedule",
    "teleconference",
    "tracking",
    "repeat",
    "remind",
    "fullAccessAttendees",
    "limitedAccessAttendees",
    "attendeeOptions",
    "telephony",
    "hostType"
})
@XmlSeeAlso({
    GetTeleconferenceSessionResponse.class
})
public class AudioOnlyInstanceType
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The access control. */
    protected AccessControlType accessControl;
    
    /** The meta data. */
    protected MetaDataType metaData;
    
    /** The schedule. */
    protected ScheduleType schedule;
    
    /** The teleconference. */
    protected TeleconfInstanceType teleconference;
    
    /** The tracking. */
    protected TrackingType tracking;
    
    /** The repeat. */
    protected RepeatType repeat;
    
    /** The remind. */
    protected RemindType remind;
    
    /** The full access attendees. */
    protected AudioOnlyInstanceType.FullAccessAttendees fullAccessAttendees;
    
    /** The limited access attendees. */
    protected AudioOnlyInstanceType.LimitedAccessAttendees limitedAccessAttendees;
    
    /** The attendee options. */
    protected AttendeeOptionsType attendeeOptions;
    
    /** The telephony. */
    protected TelephonyType telephony;
    
    /** The host type. */
    protected String hostType;

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
     * Gets the teleconference.
     * 
     * @return the teleconference
     */
    public TeleconfInstanceType getTeleconference() {
        return teleconference;
    }

    /**
     * Sets the teleconference.
     * 
     * @param value the new teleconference
     */
    public void setTeleconference(TeleconfInstanceType value) {
        this.teleconference = value;
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
     * Gets the full access attendees.
     * 
     * @return the full access attendees
     */
    public AudioOnlyInstanceType.FullAccessAttendees getFullAccessAttendees() {
        return fullAccessAttendees;
    }

    /**
     * Sets the full access attendees.
     * 
     * @param value the new full access attendees
     */
    public void setFullAccessAttendees(AudioOnlyInstanceType.FullAccessAttendees value) {
        this.fullAccessAttendees = value;
    }

    /**
     * Gets the limited access attendees.
     * 
     * @return the limited access attendees
     */
    public AudioOnlyInstanceType.LimitedAccessAttendees getLimitedAccessAttendees() {
        return limitedAccessAttendees;
    }

    /**
     * Sets the limited access attendees.
     * 
     * @param value the new limited access attendees
     */
    public void setLimitedAccessAttendees(AudioOnlyInstanceType.LimitedAccessAttendees value) {
        this.limitedAccessAttendees = value;
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
     * Gets the host type.
     * 
     * @return the host type
     */
    public String getHostType() {
        return hostType;
    }

    /**
     * Sets the host type.
     * 
     * @param value the new host type
     */
    public void setHostType(String value) {
        this.hostType = value;
    }


    /**
     * The Class FullAccessAttendees.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "attendee"
    })
    public static class FullAccessAttendees
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The attendee. */
        protected List<AttendeeType> attendee;

        /**
         * Gets the attendee.
         * 
         * @return the attendee
         */
        public List<AttendeeType> getAttendee() {
            if (attendee == null) {
                attendee = new ArrayList<AttendeeType>();
            }
            return this.attendee;
        }

    }


    /**
     * The Class LimitedAccessAttendees.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "attendee"
    })
    public static class LimitedAccessAttendees
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The attendee. */
        protected List<AttendeeType> attendee;

        /**
         * Gets the attendee.
         * 
         * @return the attendee
         */
        public List<AttendeeType> getAttendee() {
            if (attendee == null) {
                attendee = new ArrayList<AttendeeType>();
            }
            return this.attendee;
        }

    }

}
