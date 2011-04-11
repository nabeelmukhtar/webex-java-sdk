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
import com.webex.schemas._2002._06.service.event.CustomFieldsType;
import com.webex.schemas._2002._06.service.event.EnrollmentFieldType;
import com.webex.schemas._2002._06.service.event.StandardFieldsType;


/**
 * The Class EventCenterType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventCenterType", propOrder = {
    "standardFields",
    "customFields"
})
public class EventCenterType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The standard fields. */
    protected EventCenterType.StandardFields standardFields;
    
    /** The custom fields. */
    protected CustomFieldsType customFields;

    /**
     * Gets the standard fields.
     * 
     * @return the standard fields
     */
    public EventCenterType.StandardFields getStandardFields() {
        return standardFields;
    }

    /**
     * Sets the standard fields.
     * 
     * @param value the new standard fields
     */
    public void setStandardFields(EventCenterType.StandardFields value) {
        this.standardFields = value;
    }

    /**
     * Gets the custom fields.
     * 
     * @return the custom fields
     */
    public CustomFieldsType getCustomFields() {
        return customFields;
    }

    /**
     * Sets the custom fields.
     * 
     * @param value the new custom fields
     */
    public void setCustomFields(CustomFieldsType value) {
        this.customFields = value;
    }


    /**
     * The Class StandardFields.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "firstName",
        "lastName",
        "emailAddress"
    })
    public static class StandardFields
        extends StandardFieldsType
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The first name. */
        @XmlElement(required = true)
        protected EnrollmentFieldType firstName;
        
        /** The last name. */
        @XmlElement(required = true)
        protected EnrollmentFieldType lastName;
        
        /** The email address. */
        @XmlElement(required = true)
        protected EnrollmentFieldType emailAddress;

        /**
         * Gets the first name.
         * 
         * @return the first name
         */
        public EnrollmentFieldType getFirstName() {
            return firstName;
        }

        /**
         * Sets the first name.
         * 
         * @param value the new first name
         */
        public void setFirstName(EnrollmentFieldType value) {
            this.firstName = value;
        }

        /**
         * Gets the last name.
         * 
         * @return the last name
         */
        public EnrollmentFieldType getLastName() {
            return lastName;
        }

        /**
         * Sets the last name.
         * 
         * @param value the new last name
         */
        public void setLastName(EnrollmentFieldType value) {
            this.lastName = value;
        }

        /**
         * Gets the email address.
         * 
         * @return the email address
         */
        public EnrollmentFieldType getEmailAddress() {
            return emailAddress;
        }

        /**
         * Sets the email address.
         * 
         * @param value the new email address
         */
        public void setEmailAddress(EnrollmentFieldType value) {
            this.emailAddress = value;
        }

    }

}
