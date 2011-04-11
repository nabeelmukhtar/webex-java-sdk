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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.TrackingType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.MeetingAssistType;


/**
 * The Class EventType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventType", propOrder = {
    "accessControl",
    "metaData",
    "schedule",
    "telephony",
    "tracking",
    "remind",
    "panelists",
    "attendees",
    "extOptions",
    "emailTemplates",
    "assistService"
})
@XmlSeeAlso({
    CreateEvent.class,
    EventInstanceType.class
})
public class EventType
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
    
    /** The telephony. */
    protected TelephonyType telephony;
    
    /** The tracking. */
    protected TrackingType tracking;
    
    /** The remind. */
    protected RemindType remind;
    
    /** The panelists. */
    protected PanelistsType panelists;
    
    /** The attendees. */
    protected AttendeesType attendees;
    
    /** The ext options. */
    protected ExtOptionsType extOptions;
    
    /** The email templates. */
    protected EmailTemplatesType emailTemplates;
    
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
     * Gets the panelists.
     * 
     * @return the panelists
     */
    public PanelistsType getPanelists() {
        return panelists;
    }

    /**
     * Sets the panelists.
     * 
     * @param value the new panelists
     */
    public void setPanelists(PanelistsType value) {
        this.panelists = value;
    }

    /**
     * Gets the attendees.
     * 
     * @return the attendees
     */
    public AttendeesType getAttendees() {
        return attendees;
    }

    /**
     * Sets the attendees.
     * 
     * @param value the new attendees
     */
    public void setAttendees(AttendeesType value) {
        this.attendees = value;
    }

    /**
     * Gets the ext options.
     * 
     * @return the ext options
     */
    public ExtOptionsType getExtOptions() {
        return extOptions;
    }

    /**
     * Sets the ext options.
     * 
     * @param value the new ext options
     */
    public void setExtOptions(ExtOptionsType value) {
        this.extOptions = value;
    }

    /**
     * Gets the email templates.
     * 
     * @return the email templates
     */
    public EmailTemplatesType getEmailTemplates() {
        return emailTemplates;
    }

    /**
     * Sets the email templates.
     * 
     * @param value the new email templates
     */
    public void setEmailTemplates(EmailTemplatesType value) {
        this.emailTemplates = value;
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
