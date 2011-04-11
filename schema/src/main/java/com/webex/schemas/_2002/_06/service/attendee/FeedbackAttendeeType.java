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
 * <p>Java class for feedbackAttendeeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="feedbackAttendeeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attendeeID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="feedbackFields" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="defaultFields" type="{http://www.webex.com/schemas/2002/06/service/attendee}feedbackDefaultFieldsType" minOccurs="0"/>
 *                   &lt;element name="customFields" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="field" type="{http://www.webex.com/schemas/2002/06/service/attendee}fieldType" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "feedbackAttendeeType", propOrder = {
    "attendeeID",
    "feedbackFields"
})
public class FeedbackAttendeeType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected long attendeeID;
    protected FeedbackAttendeeType.FeedbackFields feedbackFields;

    /**
     * Gets the value of the attendeeID property.
     * 
     */
    public long getAttendeeID() {
        return attendeeID;
    }

    /**
     * Sets the value of the attendeeID property.
     * 
     */
    public void setAttendeeID(long value) {
        this.attendeeID = value;
    }

    /**
     * Gets the value of the feedbackFields property.
     * 
     * @return
     *     possible object is
     *     {@link FeedbackAttendeeType.FeedbackFields }
     *     
     */
    public FeedbackAttendeeType.FeedbackFields getFeedbackFields() {
        return feedbackFields;
    }

    /**
     * Sets the value of the feedbackFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedbackAttendeeType.FeedbackFields }
     *     
     */
    public void setFeedbackFields(FeedbackAttendeeType.FeedbackFields value) {
        this.feedbackFields = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="defaultFields" type="{http://www.webex.com/schemas/2002/06/service/attendee}feedbackDefaultFieldsType" minOccurs="0"/>
     *         &lt;element name="customFields" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="field" type="{http://www.webex.com/schemas/2002/06/service/attendee}fieldType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "defaultFields",
        "customFields"
    })
    public static class FeedbackFields
        implements Serializable
    {

        private final static long serialVersionUID = 2461660169443089969L;
        protected FeedbackDefaultFieldsType defaultFields;
        protected FeedbackAttendeeType.FeedbackFields.CustomFields customFields;

        /**
         * Gets the value of the defaultFields property.
         * 
         * @return
         *     possible object is
         *     {@link FeedbackDefaultFieldsType }
         *     
         */
        public FeedbackDefaultFieldsType getDefaultFields() {
            return defaultFields;
        }

        /**
         * Sets the value of the defaultFields property.
         * 
         * @param value
         *     allowed object is
         *     {@link FeedbackDefaultFieldsType }
         *     
         */
        public void setDefaultFields(FeedbackDefaultFieldsType value) {
            this.defaultFields = value;
        }

        /**
         * Gets the value of the customFields property.
         * 
         * @return
         *     possible object is
         *     {@link FeedbackAttendeeType.FeedbackFields.CustomFields }
         *     
         */
        public FeedbackAttendeeType.FeedbackFields.CustomFields getCustomFields() {
            return customFields;
        }

        /**
         * Sets the value of the customFields property.
         * 
         * @param value
         *     allowed object is
         *     {@link FeedbackAttendeeType.FeedbackFields.CustomFields }
         *     
         */
        public void setCustomFields(FeedbackAttendeeType.FeedbackFields.CustomFields value) {
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
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="field" type="{http://www.webex.com/schemas/2002/06/service/attendee}fieldType" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "field"
        })
        public static class CustomFields
            implements Serializable
        {

            private final static long serialVersionUID = 2461660169443089969L;
            protected List<FieldType> field;

            /**
             * Gets the value of the field property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the field property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getField().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FieldType }
             * 
             * 
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
