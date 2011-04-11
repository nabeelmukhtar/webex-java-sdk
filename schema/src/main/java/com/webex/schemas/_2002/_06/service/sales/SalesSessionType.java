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

package com.webex.schemas._2002._06.service.sales;

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
 * The Class SalesSessionType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salesSessionType", propOrder = {
    "accessControl",
    "metaData",
    "schedule",
    "enableOptions",
    "telephony",
    "tracking",
    "repeat",
    "remind",
    "prospects",
    "salesTeam",
    "attendeeOptions"
})
@XmlSeeAlso({
    CreateSalesSession.class,
    SalesSessionInstanceType.class
})
public class SalesSessionType
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
    
    /** The enable options. */
    protected EnableOptionsType enableOptions;
    
    /** The telephony. */
    protected TelephonyType telephony;
    
    /** The tracking. */
    protected TrackingType tracking;
    
    /** The repeat. */
    protected RepeatType repeat;
    
    /** The remind. */
    protected RemindType remind;
    
    /** The prospects. */
    protected SalesSessionType.Prospects prospects;
    
    /** The sales team. */
    protected SalesSessionType.SalesTeam salesTeam;
    
    /** The attendee options. */
    protected AttendeeOptionsType attendeeOptions;

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
     * Gets the prospects.
     * 
     * @return the prospects
     */
    public SalesSessionType.Prospects getProspects() {
        return prospects;
    }

    /**
     * Sets the prospects.
     * 
     * @param value the new prospects
     */
    public void setProspects(SalesSessionType.Prospects value) {
        this.prospects = value;
    }

    /**
     * Gets the sales team.
     * 
     * @return the sales team
     */
    public SalesSessionType.SalesTeam getSalesTeam() {
        return salesTeam;
    }

    /**
     * Sets the sales team.
     * 
     * @param value the new sales team
     */
    public void setSalesTeam(SalesSessionType.SalesTeam value) {
        this.salesTeam = value;
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
     * The Class Prospects.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "prospect"
    })
    public static class Prospects
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The prospect. */
        protected List<ProspectType> prospect;

        /**
         * Gets the prospect.
         * 
         * @return the prospect
         */
        public List<ProspectType> getProspect() {
            if (prospect == null) {
                prospect = new ArrayList<ProspectType>();
            }
            return this.prospect;
        }

    }


    /**
     * The Class SalesTeam.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "webExID",
        "email",
        "altHosts"
    })
    public static class SalesTeam
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The web ex id. */
        protected List<String> webExID;
        
        /** The email. */
        protected List<String> email;
        
        /** The alt hosts. */
        protected AlternateHostType altHosts;

        /**
         * Gets the web ex id.
         * 
         * @return the web ex id
         */
        public List<String> getWebExID() {
            if (webExID == null) {
                webExID = new ArrayList<String>();
            }
            return this.webExID;
        }

        /**
         * Gets the email.
         * 
         * @return the email
         */
        public List<String> getEmail() {
            if (email == null) {
                email = new ArrayList<String>();
            }
            return this.email;
        }

        /**
         * Gets the alt hosts.
         * 
         * @return the alt hosts
         */
        public AlternateHostType getAltHosts() {
            return altHosts;
        }

        /**
         * Sets the alt hosts.
         * 
         * @param value the new alt hosts
         */
        public void setAltHosts(AlternateHostType value) {
            this.altHosts = value;
        }

    }

}
