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

package com.webex.schemas._2002._06.service.user;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class GetUserResponse.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserResponse", propOrder = {
    "salesCenter",
    "peExpired",
    "peActive",
    "passwordExpires",
    "passwordDaysLeft",
    "schedulingTemplates",
    "serviceSessionTypes",
    "scheduleFor"
})
public class GetUserResponse
    extends UserInstanceType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The sales center. */
    protected SalesCenterInstanceType salesCenter;
    
    /** The pe expired. */
    protected Boolean peExpired;
    
    /** The pe active. */
    protected Boolean peActive;
    
    /** The password expires. */
    protected Boolean passwordExpires;
    
    /** The password days left. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long passwordDaysLeft;
    
    /** The scheduling templates. */
    protected GetUserResponse.SchedulingTemplates schedulingTemplates;
    
    /** The service session types. */
    protected List<GetUserResponse.ServiceSessionTypes> serviceSessionTypes;
    
    /** The schedule for. */
    protected GetUserResponse.ScheduleFor scheduleFor;

    /**
     * Gets the sales center.
     * 
     * @return the sales center
     */
    public SalesCenterInstanceType getSalesCenter() {
        return salesCenter;
    }

    /**
     * Sets the sales center.
     * 
     * @param value the new sales center
     */
    public void setSalesCenter(SalesCenterInstanceType value) {
        this.salesCenter = value;
    }

    /**
     * Checks if is pe expired.
     * 
     * @return the boolean
     */
    public Boolean isPeExpired() {
        return peExpired;
    }

    /**
     * Sets the pe expired.
     * 
     * @param value the new pe expired
     */
    public void setPeExpired(Boolean value) {
        this.peExpired = value;
    }

    /**
     * Checks if is pe active.
     * 
     * @return the boolean
     */
    public Boolean isPeActive() {
        return peActive;
    }

    /**
     * Sets the pe active.
     * 
     * @param value the new pe active
     */
    public void setPeActive(Boolean value) {
        this.peActive = value;
    }

    /**
     * Checks if is password expires.
     * 
     * @return the boolean
     */
    public Boolean isPasswordExpires() {
        return passwordExpires;
    }

    /**
     * Sets the password expires.
     * 
     * @param value the new password expires
     */
    public void setPasswordExpires(Boolean value) {
        this.passwordExpires = value;
    }

    /**
     * Gets the password days left.
     * 
     * @return the password days left
     */
    public Long getPasswordDaysLeft() {
        return passwordDaysLeft;
    }

    /**
     * Sets the password days left.
     * 
     * @param value the new password days left
     */
    public void setPasswordDaysLeft(Long value) {
        this.passwordDaysLeft = value;
    }

    /**
     * Gets the scheduling templates.
     * 
     * @return the scheduling templates
     */
    public GetUserResponse.SchedulingTemplates getSchedulingTemplates() {
        return schedulingTemplates;
    }

    /**
     * Sets the scheduling templates.
     * 
     * @param value the new scheduling templates
     */
    public void setSchedulingTemplates(GetUserResponse.SchedulingTemplates value) {
        this.schedulingTemplates = value;
    }

    /**
     * Gets the service session types.
     * 
     * @return the service session types
     */
    public List<GetUserResponse.ServiceSessionTypes> getServiceSessionTypes() {
        if (serviceSessionTypes == null) {
            serviceSessionTypes = new ArrayList<GetUserResponse.ServiceSessionTypes>();
        }
        return this.serviceSessionTypes;
    }

    /**
     * Gets the schedule for.
     * 
     * @return the schedule for
     */
    public GetUserResponse.ScheduleFor getScheduleFor() {
        return scheduleFor;
    }

    /**
     * Sets the schedule for.
     * 
     * @param value the new schedule for
     */
    public void setScheduleFor(GetUserResponse.ScheduleFor value) {
        this.scheduleFor = value;
    }


    /**
     * The Class ScheduleFor.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "webExID"
    })
    public static class ScheduleFor
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The web ex id. */
        protected List<String> webExID;

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

    }


    /**
     * The Class SchedulingTemplates.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sessionTemplate"
    })
    public static class SchedulingTemplates
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The session template. */
        protected List<SessionTemplateSummaryType> sessionTemplate;

        /**
         * Gets the session template.
         * 
         * @return the session template
         */
        public List<SessionTemplateSummaryType> getSessionTemplate() {
            if (sessionTemplate == null) {
                sessionTemplate = new ArrayList<SessionTemplateSummaryType>();
            }
            return this.sessionTemplate;
        }

    }


    /**
     * The Class ServiceSessionTypes.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "label",
        "value"
    })
    public static class ServiceSessionTypes
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The label. */
        @XmlElement(required = true)
        protected String label;
        
        /** The value. */
        @XmlElement(required = true)
        protected String value;

        /**
         * Gets the label.
         * 
         * @return the label
         */
        public String getLabel() {
            return label;
        }

        /**
         * Sets the label.
         * 
         * @param value the new label
         */
        public void setLabel(String value) {
            this.label = value;
        }

        /**
         * Gets the value.
         * 
         * @return the value
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value.
         * 
         * @param value the new value
         */
        public void setValue(String value) {
            this.value = value;
        }

    }

}
