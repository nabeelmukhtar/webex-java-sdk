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

package com.webex.schemas._2002._06.service.attendee;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class EnrollAttendeeType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enrollAttendeeType", propOrder = {
    "attendeeID",
    "enrollFields",
    "domain",
    "ipAddress",
    "submitTime",
    "status"
})
public class EnrollAttendeeType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The attendee id. */
    protected long attendeeID;
    
    /** The enroll fields. */
    protected EnrollAttendeeType.EnrollFields enrollFields;
    
    /** The domain. */
    protected String domain;
    
    /** The ip address. */
    protected String ipAddress;
    
    /** The submit time. */
    protected String submitTime;
    
    /** The status. */
    protected AttendeeEnrollStatusType status;

    /**
     * Gets the attendee id.
     * 
     * @return the attendee id
     */
    public long getAttendeeID() {
        return attendeeID;
    }

    /**
     * Sets the attendee id.
     * 
     * @param value the new attendee id
     */
    public void setAttendeeID(long value) {
        this.attendeeID = value;
    }

    /**
     * Gets the enroll fields.
     * 
     * @return the enroll fields
     */
    public EnrollAttendeeType.EnrollFields getEnrollFields() {
        return enrollFields;
    }

    /**
     * Sets the enroll fields.
     * 
     * @param value the new enroll fields
     */
    public void setEnrollFields(EnrollAttendeeType.EnrollFields value) {
        this.enrollFields = value;
    }

    /**
     * Gets the domain.
     * 
     * @return the domain
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets the domain.
     * 
     * @param value the new domain
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * Gets the ip address.
     * 
     * @return the ip address
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the ip address.
     * 
     * @param value the new ip address
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the submit time.
     * 
     * @return the submit time
     */
    public String getSubmitTime() {
        return submitTime;
    }

    /**
     * Sets the submit time.
     * 
     * @param value the new submit time
     */
    public void setSubmitTime(String value) {
        this.submitTime = value;
    }

    /**
     * Gets the status.
     * 
     * @return the status
     */
    public AttendeeEnrollStatusType getStatus() {
        return status;
    }

    /**
     * Sets the status.
     * 
     * @param value the new status
     */
    public void setStatus(AttendeeEnrollStatusType value) {
        this.status = value;
    }


    /**
     * The Class EnrollFields.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "defaultFields",
        "customFields"
    })
    public static class EnrollFields
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The default fields. */
        protected EnrollDefaultFieldsType defaultFields;
        
        /** The custom fields. */
        protected EnrollAttendeeType.EnrollFields.CustomFields customFields;

        /**
         * Gets the default fields.
         * 
         * @return the default fields
         */
        public EnrollDefaultFieldsType getDefaultFields() {
            return defaultFields;
        }

        /**
         * Sets the default fields.
         * 
         * @param value the new default fields
         */
        public void setDefaultFields(EnrollDefaultFieldsType value) {
            this.defaultFields = value;
        }

        /**
         * Gets the custom fields.
         * 
         * @return the custom fields
         */
        public EnrollAttendeeType.EnrollFields.CustomFields getCustomFields() {
            return customFields;
        }

        /**
         * Sets the custom fields.
         * 
         * @param value the new custom fields
         */
        public void setCustomFields(EnrollAttendeeType.EnrollFields.CustomFields value) {
            this.customFields = value;
        }


        /**
         * The Class CustomFields.
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "field"
        })
        public static class CustomFields
            implements Serializable
        {

            /** The Constant serialVersionUID. */
            private final static long serialVersionUID = 2461660169443089969L;
            
            /** The field. */
            protected List<FieldType> field;

            /**
             * Gets the field.
             * 
             * @return the field
             */
            public List<FieldType> getField() {
                if (field == null) {
                    field = new ArrayList<FieldType>();
                }
                return this.field;
            }

        }

    }

}
