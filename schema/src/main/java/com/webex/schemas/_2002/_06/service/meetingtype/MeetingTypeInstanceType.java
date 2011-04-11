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

package com.webex.schemas._2002._06.service.meetingtype;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.webex.schemas._2002._06.common.ServiceTypeType;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class MeetingTypeInstanceType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meetingTypeInstanceType", propOrder = {
    "meetingTypeID",
    "serviceTypes"
})
@XmlSeeAlso({
    GetMeetingTypeResponse.class
})
public class MeetingTypeInstanceType
    extends MeetingTypeTypeExt
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The meeting type id. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long meetingTypeID;
    
    /** The service types. */
    @XmlElement(required = true)
    protected MeetingTypeInstanceType.ServiceTypes serviceTypes;

    /**
     * Gets the meeting type id.
     * 
     * @return the meeting type id
     */
    public Long getMeetingTypeID() {
        return meetingTypeID;
    }

    /**
     * Sets the meeting type id.
     * 
     * @param value the new meeting type id
     */
    public void setMeetingTypeID(Long value) {
        this.meetingTypeID = value;
    }

    /**
     * Gets the service types.
     * 
     * @return the service types
     */
    public MeetingTypeInstanceType.ServiceTypes getServiceTypes() {
        return serviceTypes;
    }

    /**
     * Sets the service types.
     * 
     * @param value the new service types
     */
    public void setServiceTypes(MeetingTypeInstanceType.ServiceTypes value) {
        this.serviceTypes = value;
    }


    /**
     * The Class ServiceTypes.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "serviceType"
    })
    public static class ServiceTypes
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The service type. */
        protected List<ServiceTypeType> serviceType;

        /**
         * Gets the service type.
         * 
         * @return the service type
         */
        public List<ServiceTypeType> getServiceType() {
            if (serviceType == null) {
                serviceType = new ArrayList<ServiceTypeType>();
            }
            return this.serviceType;
        }

    }

}
