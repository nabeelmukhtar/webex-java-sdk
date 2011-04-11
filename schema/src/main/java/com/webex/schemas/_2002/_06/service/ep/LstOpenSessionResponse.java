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

package com.webex.schemas._2002._06.service.ep;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.ServiceTypeType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.MatchingRecordsType;


/**
 * The Class LstOpenSessionResponse.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lstOpenSessionResponse", propOrder = {
    "matchingRecords",
    "services"
})
public class LstOpenSessionResponse
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The matching records. */
    protected MatchingRecordsType matchingRecords;
    
    /** The services. */
    protected List<LstOpenSessionResponse.Services> services;

    /**
     * Gets the matching records.
     * 
     * @return the matching records
     */
    public MatchingRecordsType getMatchingRecords() {
        return matchingRecords;
    }

    /**
     * Sets the matching records.
     * 
     * @param value the new matching records
     */
    public void setMatchingRecords(MatchingRecordsType value) {
        this.matchingRecords = value;
    }

    /**
     * Gets the services.
     * 
     * @return the services
     */
    public List<LstOpenSessionResponse.Services> getServices() {
        if (services == null) {
            services = new ArrayList<LstOpenSessionResponse.Services>();
        }
        return this.services;
    }


    /**
     * The Class Services.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "serviceType",
        "sessions"
    })
    public static class Services
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The service type. */
        @XmlElement(required = true)
        protected ServiceTypeType serviceType;
        
        /** The sessions. */
        protected List<OpenSessionType> sessions;

        /**
         * Gets the service type.
         * 
         * @return the service type
         */
        public ServiceTypeType getServiceType() {
            return serviceType;
        }

        /**
         * Sets the service type.
         * 
         * @param value the new service type
         */
        public void setServiceType(ServiceTypeType value) {
            this.serviceType = value;
        }

        /**
         * Gets the sessions.
         * 
         * @return the sessions
         */
        public List<OpenSessionType> getSessions() {
            if (sessions == null) {
                sessions = new ArrayList<OpenSessionType>();
            }
            return this.sessions;
        }

    }

}
