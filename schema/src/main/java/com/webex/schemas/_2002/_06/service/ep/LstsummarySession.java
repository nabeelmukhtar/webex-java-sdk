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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.webex.schemas._2002._06.common.ServiceTypeType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.LstControlType;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class LstsummarySession.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lstsummarySession", propOrder = {
    "listControl",
    "order",
    "dateScope",
    "sessionTypes",
    "serviceTypes",
    "sessionKey",
    "hostWebExID",
    "hostEmail",
    "status",
    "recurrence",
    "invited",
    "confID",
    "confName",
    "inclAudioOnly",
    "returnPSOFields",
    "returnAssistFields"
})
public class LstsummarySession
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The list control. */
    protected LstControlType listControl;
    
    /** The order. */
    protected OrderType order;
    
    /** The date scope. */
    protected DateScopeType dateScope;
    
    /** The session types. */
    protected LstsummarySession.SessionTypes sessionTypes;
    
    /** The service types. */
    protected LstsummarySession.ServiceTypes serviceTypes;
    
    /** The session key. */
    protected Long sessionKey;
    
    /** The host web ex id. */
    protected String hostWebExID;
    
    /** The host email. */
    protected String hostEmail;
    
    /** The status. */
    protected StatusType status;
    
    /** The recurrence. */
    protected Boolean recurrence;
    
    /** The invited. */
    protected Boolean invited;
    
    /** The conf id. */
    protected Long confID;
    
    /** The conf name. */
    protected String confName;
    
    /** The incl audio only. */
    protected Boolean inclAudioOnly;
    
    /** The return pso fields. */
    protected Boolean returnPSOFields;
    
    /** The return assist fields. */
    @XmlElement(defaultValue = "false")
    protected Boolean returnAssistFields;

    /**
     * Gets the list control.
     * 
     * @return the list control
     */
    public LstControlType getListControl() {
        return listControl;
    }

    /**
     * Sets the list control.
     * 
     * @param value the new list control
     */
    public void setListControl(LstControlType value) {
        this.listControl = value;
    }

    /**
     * Gets the order.
     * 
     * @return the order
     */
    public OrderType getOrder() {
        return order;
    }

    /**
     * Sets the order.
     * 
     * @param value the new order
     */
    public void setOrder(OrderType value) {
        this.order = value;
    }

    /**
     * Gets the date scope.
     * 
     * @return the date scope
     */
    public DateScopeType getDateScope() {
        return dateScope;
    }

    /**
     * Sets the date scope.
     * 
     * @param value the new date scope
     */
    public void setDateScope(DateScopeType value) {
        this.dateScope = value;
    }

    /**
     * Gets the session types.
     * 
     * @return the session types
     */
    public LstsummarySession.SessionTypes getSessionTypes() {
        return sessionTypes;
    }

    /**
     * Sets the session types.
     * 
     * @param value the new session types
     */
    public void setSessionTypes(LstsummarySession.SessionTypes value) {
        this.sessionTypes = value;
    }

    /**
     * Gets the service types.
     * 
     * @return the service types
     */
    public LstsummarySession.ServiceTypes getServiceTypes() {
        return serviceTypes;
    }

    /**
     * Sets the service types.
     * 
     * @param value the new service types
     */
    public void setServiceTypes(LstsummarySession.ServiceTypes value) {
        this.serviceTypes = value;
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
     * Gets the host email.
     * 
     * @return the host email
     */
    public String getHostEmail() {
        return hostEmail;
    }

    /**
     * Sets the host email.
     * 
     * @param value the new host email
     */
    public void setHostEmail(String value) {
        this.hostEmail = value;
    }

    /**
     * Gets the status.
     * 
     * @return the status
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the status.
     * 
     * @param value the new status
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Checks if is recurrence.
     * 
     * @return the boolean
     */
    public Boolean isRecurrence() {
        return recurrence;
    }

    /**
     * Sets the recurrence.
     * 
     * @param value the new recurrence
     */
    public void setRecurrence(Boolean value) {
        this.recurrence = value;
    }

    /**
     * Checks if is invited.
     * 
     * @return the boolean
     */
    public Boolean isInvited() {
        return invited;
    }

    /**
     * Sets the invited.
     * 
     * @param value the new invited
     */
    public void setInvited(Boolean value) {
        this.invited = value;
    }

    /**
     * Gets the conf id.
     * 
     * @return the conf id
     */
    public Long getConfID() {
        return confID;
    }

    /**
     * Sets the conf id.
     * 
     * @param value the new conf id
     */
    public void setConfID(Long value) {
        this.confID = value;
    }

    /**
     * Gets the conf name.
     * 
     * @return the conf name
     */
    public String getConfName() {
        return confName;
    }

    /**
     * Sets the conf name.
     * 
     * @param value the new conf name
     */
    public void setConfName(String value) {
        this.confName = value;
    }

    /**
     * Checks if is incl audio only.
     * 
     * @return the boolean
     */
    public Boolean isInclAudioOnly() {
        return inclAudioOnly;
    }

    /**
     * Sets the incl audio only.
     * 
     * @param value the new incl audio only
     */
    public void setInclAudioOnly(Boolean value) {
        this.inclAudioOnly = value;
    }

    /**
     * Checks if is return pso fields.
     * 
     * @return the boolean
     */
    public Boolean isReturnPSOFields() {
        return returnPSOFields;
    }

    /**
     * Sets the return pso fields.
     * 
     * @param value the new return pso fields
     */
    public void setReturnPSOFields(Boolean value) {
        this.returnPSOFields = value;
    }

    /**
     * Checks if is return assist fields.
     * 
     * @return the boolean
     */
    public Boolean isReturnAssistFields() {
        return returnAssistFields;
    }

    /**
     * Sets the return assist fields.
     * 
     * @param value the new return assist fields
     */
    public void setReturnAssistFields(Boolean value) {
        this.returnAssistFields = value;
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


    /**
     * The Class SessionTypes.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sessionType"
    })
    public static class SessionTypes
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The session type. */
        @XmlElement(type = String.class)
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "integer")
        protected List<Long> sessionType;

        /**
         * Gets the session type.
         * 
         * @return the session type
         */
        public List<Long> getSessionType() {
            if (sessionType == null) {
                sessionType = new ArrayList<Long>();
            }
            return this.sessionType;
        }

    }

}
