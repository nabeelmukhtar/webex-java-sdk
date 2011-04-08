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
 * <p>Java class for eventCenterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eventCenterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="standardFields" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.webex.com/schemas/2002/06/service/event}standardFieldsType">
 *                 &lt;sequence>
 *                   &lt;element name="firstName" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentFieldType"/>
 *                   &lt;element name="lastName" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentFieldType"/>
 *                   &lt;element name="emailAddress" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentFieldType"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="customFields" type="{http://www.webex.com/schemas/2002/06/service/event}customFieldsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventCenterType", propOrder = {
    "standardFields",
    "customFields"
})
public class EventCenterType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected EventCenterType.StandardFields standardFields;
    protected CustomFieldsType customFields;

    /**
     * Gets the value of the standardFields property.
     * 
     * @return
     *     possible object is
     *     {@link EventCenterType.StandardFields }
     *     
     */
    public EventCenterType.StandardFields getStandardFields() {
        return standardFields;
    }

    /**
     * Sets the value of the standardFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventCenterType.StandardFields }
     *     
     */
    public void setStandardFields(EventCenterType.StandardFields value) {
        this.standardFields = value;
    }

    /**
     * Gets the value of the customFields property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldsType }
     *     
     */
    public CustomFieldsType getCustomFields() {
        return customFields;
    }

    /**
     * Sets the value of the customFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldsType }
     *     
     */
    public void setCustomFields(CustomFieldsType value) {
        this.customFields = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/event}standardFieldsType">
     *       &lt;sequence>
     *         &lt;element name="firstName" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentFieldType"/>
     *         &lt;element name="lastName" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentFieldType"/>
     *         &lt;element name="emailAddress" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentFieldType"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
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

        private final static long serialVersionUID = 2461660169443089969L;
        @XmlElement(required = true)
        protected EnrollmentFieldType firstName;
        @XmlElement(required = true)
        protected EnrollmentFieldType lastName;
        @XmlElement(required = true)
        protected EnrollmentFieldType emailAddress;

        /**
         * Gets the value of the firstName property.
         * 
         * @return
         *     possible object is
         *     {@link EnrollmentFieldType }
         *     
         */
        public EnrollmentFieldType getFirstName() {
            return firstName;
        }

        /**
         * Sets the value of the firstName property.
         * 
         * @param value
         *     allowed object is
         *     {@link EnrollmentFieldType }
         *     
         */
        public void setFirstName(EnrollmentFieldType value) {
            this.firstName = value;
        }

        /**
         * Gets the value of the lastName property.
         * 
         * @return
         *     possible object is
         *     {@link EnrollmentFieldType }
         *     
         */
        public EnrollmentFieldType getLastName() {
            return lastName;
        }

        /**
         * Sets the value of the lastName property.
         * 
         * @param value
         *     allowed object is
         *     {@link EnrollmentFieldType }
         *     
         */
        public void setLastName(EnrollmentFieldType value) {
            this.lastName = value;
        }

        /**
         * Gets the value of the emailAddress property.
         * 
         * @return
         *     possible object is
         *     {@link EnrollmentFieldType }
         *     
         */
        public EnrollmentFieldType getEmailAddress() {
            return emailAddress;
        }

        /**
         * Sets the value of the emailAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link EnrollmentFieldType }
         *     
         */
        public void setEmailAddress(EnrollmentFieldType value) {
            this.emailAddress = value;
        }

    }

}
