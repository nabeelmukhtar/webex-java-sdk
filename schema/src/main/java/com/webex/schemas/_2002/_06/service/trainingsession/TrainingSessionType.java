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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.PsoFieldsType;
import com.webex.schemas._2002._06.common.TrackingType;
import com.webex.schemas._2002._06.service.MeetingAssistType;
import com.webex.schemas._2002._06.service.session.ParticipantsType;
import com.webex.schemas._2002._06.service.session.RemindType;
import com.webex.schemas._2002._06.service.session.SessionType;
import com.webex.schemas._2002._06.service.session.TelephonyType;


/**
 * The Class TrainingSessionType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trainingSessionType", propOrder = {
    "metaData",
    "enableOptions",
    "telephony",
    "tracking",
    "repeat",
    "remind",
    "presenters",
    "attendees",
    "attendeeOptions",
    "handsOnLab",
    "psoFields",
    "assistService",
    "preAssignBreakout"
})
@XmlSeeAlso({
    TrainingSessionInstanceType.class,
    CreateTrainingSession.class
})
public class TrainingSessionType
    extends SessionType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The meta data. */
    protected TrainingMetaDataType metaData;
    
    /** The enable options. */
    protected TrainingEnableOptionsType enableOptions;
    
    /** The telephony. */
    protected TelephonyType telephony;
    
    /** The tracking. */
    protected TrackingType tracking;
    
    /** The repeat. */
    protected TrainRepeatType repeat;
    
    /** The remind. */
    protected RemindType remind;
    
    /** The presenters. */
    protected ParticipantsType presenters;
    
    /** The attendees. */
    protected ParticipantsType attendees;
    
    /** The attendee options. */
    protected AttendeeOptionsType attendeeOptions;
    
    /** The hands on lab. */
    protected HandsOnLabType handsOnLab;
    
    /** The pso fields. */
    protected PsoFieldsType psoFields;
    
    /** The assist service. */
    protected MeetingAssistType assistService;
    
    /** The pre assign breakout. */
    protected TrainingSessionType.PreAssignBreakout preAssignBreakout;

    /**
     * Gets the meta data.
     * 
     * @return the meta data
     */
    public TrainingMetaDataType getMetaData() {
        return metaData;
    }

    /**
     * Sets the meta data.
     * 
     * @param value the new meta data
     */
    public void setMetaData(TrainingMetaDataType value) {
        this.metaData = value;
    }

    /**
     * Gets the enable options.
     * 
     * @return the enable options
     */
    public TrainingEnableOptionsType getEnableOptions() {
        return enableOptions;
    }

    /**
     * Sets the enable options.
     * 
     * @param value the new enable options
     */
    public void setEnableOptions(TrainingEnableOptionsType value) {
        this.enableOptions = value;
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
    public TrainRepeatType getRepeat() {
        return repeat;
    }

    /**
     * Sets the repeat.
     * 
     * @param value the new repeat
     */
    public void setRepeat(TrainRepeatType value) {
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
     * Gets the presenters.
     * 
     * @return the presenters
     */
    public ParticipantsType getPresenters() {
        return presenters;
    }

    /**
     * Sets the presenters.
     * 
     * @param value the new presenters
     */
    public void setPresenters(ParticipantsType value) {
        this.presenters = value;
    }

    /**
     * Gets the attendees.
     * 
     * @return the attendees
     */
    public ParticipantsType getAttendees() {
        return attendees;
    }

    /**
     * Sets the attendees.
     * 
     * @param value the new attendees
     */
    public void setAttendees(ParticipantsType value) {
        this.attendees = value;
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
     * Gets the hands on lab.
     * 
     * @return the hands on lab
     */
    public HandsOnLabType getHandsOnLab() {
        return handsOnLab;
    }

    /**
     * Sets the hands on lab.
     * 
     * @param value the new hands on lab
     */
    public void setHandsOnLab(HandsOnLabType value) {
        this.handsOnLab = value;
    }

    /**
     * Gets the pso fields.
     * 
     * @return the pso fields
     */
    public PsoFieldsType getPsoFields() {
        return psoFields;
    }

    /**
     * Sets the pso fields.
     * 
     * @param value the new pso fields
     */
    public void setPsoFields(PsoFieldsType value) {
        this.psoFields = value;
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

    /**
     * Gets the pre assign breakout.
     * 
     * @return the pre assign breakout
     */
    public TrainingSessionType.PreAssignBreakout getPreAssignBreakout() {
        return preAssignBreakout;
    }

    /**
     * Sets the pre assign breakout.
     * 
     * @param value the new pre assign breakout
     */
    public void setPreAssignBreakout(TrainingSessionType.PreAssignBreakout value) {
        this.preAssignBreakout = value;
    }


    /**
     * The Class PreAssignBreakout.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "enable",
        "attendeeAssign",
        "numSessions",
        "attendeesPerSess"
    })
    public static class PreAssignBreakout
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The enable. */
        protected Boolean enable;
        
        /** The attendee assign. */
        protected AttendeeAssignType attendeeAssign;
        
        /** The num sessions. */
        protected Integer numSessions;
        
        /** The attendees per sess. */
        protected Integer attendeesPerSess;

        /**
         * Checks if is enable.
         * 
         * @return the boolean
         */
        public Boolean isEnable() {
            return enable;
        }

        /**
         * Sets the enable.
         * 
         * @param value the new enable
         */
        public void setEnable(Boolean value) {
            this.enable = value;
        }

        /**
         * Gets the attendee assign.
         * 
         * @return the attendee assign
         */
        public AttendeeAssignType getAttendeeAssign() {
            return attendeeAssign;
        }

        /**
         * Sets the attendee assign.
         * 
         * @param value the new attendee assign
         */
        public void setAttendeeAssign(AttendeeAssignType value) {
            this.attendeeAssign = value;
        }

        /**
         * Gets the num sessions.
         * 
         * @return the num sessions
         */
        public Integer getNumSessions() {
            return numSessions;
        }

        /**
         * Sets the num sessions.
         * 
         * @param value the new num sessions
         */
        public void setNumSessions(Integer value) {
            this.numSessions = value;
        }

        /**
         * Gets the attendees per sess.
         * 
         * @return the attendees per sess
         */
        public Integer getAttendeesPerSess() {
            return attendeesPerSess;
        }

        /**
         * Sets the attendees per sess.
         * 
         * @param value the new attendees per sess
         */
        public void setAttendeesPerSess(Integer value) {
            this.attendeesPerSess = value;
        }

    }

}
