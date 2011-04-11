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


/**
 * The Class LstRecording.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lstRecording", propOrder = {
    "listControl",
    "createTimeScope",
    "hostWebExID",
    "sessionKey",
    "returnSessionDetails",
    "recordName",
    "serviceTypes"
})
public class LstRecording
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The list control. */
    protected ListControlType listControl;
    
    /** The create time scope. */
    protected CreateTimeScopeType createTimeScope;
    
    /** The host web ex id. */
    protected String hostWebExID;
    
    /** The session key. */
    protected Long sessionKey;
    
    /** The return session details. */
    @XmlElement(defaultValue = "false")
    protected Boolean returnSessionDetails;
    
    /** The record name. */
    protected String recordName;
    
    /** The service types. */
    protected LstRecording.ServiceTypes serviceTypes;

    /**
     * Gets the list control.
     * 
     * @return the list control
     */
    public ListControlType getListControl() {
        return listControl;
    }

    /**
     * Sets the list control.
     * 
     * @param value the new list control
     */
    public void setListControl(ListControlType value) {
        this.listControl = value;
    }

    /**
     * Gets the creates the time scope.
     * 
     * @return the creates the time scope
     */
    public CreateTimeScopeType getCreateTimeScope() {
        return createTimeScope;
    }

    /**
     * Sets the creates the time scope.
     * 
     * @param value the new creates the time scope
     */
    public void setCreateTimeScope(CreateTimeScopeType value) {
        this.createTimeScope = value;
    }

    /**
     * Gets the host web ex id.
     * 
     * @return the host web ex id
     */
    public String getHostWebExID() {
        return hostWebExID;
    }

    /**
     * Sets the host web ex id.
     * 
     * @param value the new host web ex id
     */
    public void setHostWebExID(String value) {
        this.hostWebExID = value;
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
     * Checks if is return session details.
     * 
     * @return the boolean
     */
    public Boolean isReturnSessionDetails() {
        return returnSessionDetails;
    }

    /**
     * Sets the return session details.
     * 
     * @param value the new return session details
     */
    public void setReturnSessionDetails(Boolean value) {
        this.returnSessionDetails = value;
    }

    /**
     * Gets the record name.
     * 
     * @return the record name
     */
    public String getRecordName() {
        return recordName;
    }

    /**
     * Sets the record name.
     * 
     * @param value the new record name
     */
    public void setRecordName(String value) {
        this.recordName = value;
    }

    /**
     * Gets the service types.
     * 
     * @return the service types
     */
    public LstRecording.ServiceTypes getServiceTypes() {
        return serviceTypes;
    }

    /**
     * Sets the service types.
     * 
     * @param value the new service types
     */
    public void setServiceTypes(LstRecording.ServiceTypes value) {
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
