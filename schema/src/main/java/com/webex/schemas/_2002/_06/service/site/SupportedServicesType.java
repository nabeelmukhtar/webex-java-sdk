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

package com.webex.schemas._2002._06.service.site;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class SupportedServicesType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supportedServicesType", propOrder = {
    "meetingCenter",
    "trainingCenter",
    "supportCenter",
    "eventCenter",
    "salesCenter"
})
public class SupportedServicesType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The meeting center. */
    @XmlElement(required = true)
    protected SupportedServiceType meetingCenter;
    
    /** The training center. */
    @XmlElement(required = true)
    protected SupportedServiceType trainingCenter;
    
    /** The support center. */
    @XmlElement(required = true)
    protected SupportedServicesType.SupportCenter supportCenter;
    
    /** The event center. */
    @XmlElement(required = true)
    protected SupportedServicesType.EventCenter eventCenter;
    
    /** The sales center. */
    @XmlElement(required = true)
    protected SupportedServiceType salesCenter;

    /**
     * Gets the meeting center.
     * 
     * @return the meeting center
     */
    public SupportedServiceType getMeetingCenter() {
        return meetingCenter;
    }

    /**
     * Sets the meeting center.
     * 
     * @param value the new meeting center
     */
    public void setMeetingCenter(SupportedServiceType value) {
        this.meetingCenter = value;
    }

    /**
     * Gets the training center.
     * 
     * @return the training center
     */
    public SupportedServiceType getTrainingCenter() {
        return trainingCenter;
    }

    /**
     * Sets the training center.
     * 
     * @param value the new training center
     */
    public void setTrainingCenter(SupportedServiceType value) {
        this.trainingCenter = value;
    }

    /**
     * Gets the support center.
     * 
     * @return the support center
     */
    public SupportedServicesType.SupportCenter getSupportCenter() {
        return supportCenter;
    }

    /**
     * Sets the support center.
     * 
     * @param value the new support center
     */
    public void setSupportCenter(SupportedServicesType.SupportCenter value) {
        this.supportCenter = value;
    }

    /**
     * Gets the event center.
     * 
     * @return the event center
     */
    public SupportedServicesType.EventCenter getEventCenter() {
        return eventCenter;
    }

    /**
     * Sets the event center.
     * 
     * @param value the new event center
     */
    public void setEventCenter(SupportedServicesType.EventCenter value) {
        this.eventCenter = value;
    }

    /**
     * Gets the sales center.
     * 
     * @return the sales center
     */
    public SupportedServiceType getSalesCenter() {
        return salesCenter;
    }

    /**
     * Sets the sales center.
     * 
     * @param value the new sales center
     */
    public void setSalesCenter(SupportedServiceType value) {
        this.salesCenter = value;
    }


    /**
     * The Class EventCenter.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "marketingAddOn"
    })
    public static class EventCenter
        extends SupportedServiceType
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The marketing add on. */
        protected boolean marketingAddOn;

        /**
         * Checks if is marketing add on.
         * 
         * @return true, if is marketing add on
         */
        public boolean isMarketingAddOn() {
            return marketingAddOn;
        }

        /**
         * Sets the marketing add on.
         * 
         * @param value the new marketing add on
         */
        public void setMarketingAddOn(boolean value) {
            this.marketingAddOn = value;
        }

    }


    /**
     * The Class SupportCenter.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "webACD"
    })
    public static class SupportCenter
        extends SupportedServiceType
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The web acd. */
        protected Boolean webACD;

        /**
         * Checks if is web acd.
         * 
         * @return the boolean
         */
        public Boolean isWebACD() {
            return webACD;
        }

        /**
         * Sets the web acd.
         * 
         * @param value the new web acd
         */
        public void setWebACD(Boolean value) {
            this.webACD = value;
        }

    }

}
