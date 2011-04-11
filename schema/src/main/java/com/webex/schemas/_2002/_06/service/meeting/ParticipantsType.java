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

package com.webex.schemas._2002._06.service.meeting;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.attendee.AttendeeType;


/**
 * <p>Java class for participantsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="participantsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maxUserNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="attendees" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="attendee" type="{http://www.webex.com/schemas/2002/06/service/attendee}attendeeType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "participantsType", propOrder = {
    "maxUserNumber",
    "attendees"
})
public class ParticipantsType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected Long maxUserNumber;
    protected ParticipantsType.Attendees attendees;

    /**
     * Gets the value of the maxUserNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxUserNumber() {
        return maxUserNumber;
    }

    /**
     * Sets the value of the maxUserNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxUserNumber(Long value) {
        this.maxUserNumber = value;
    }

    /**
     * Gets the value of the attendees property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantsType.Attendees }
     *     
     */
    public ParticipantsType.Attendees getAttendees() {
        return attendees;
    }

    /**
     * Sets the value of the attendees property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantsType.Attendees }
     *     
     */
    public void setAttendees(ParticipantsType.Attendees value) {
        this.attendees = value;
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
     *         &lt;element name="attendee" type="{http://www.webex.com/schemas/2002/06/service/attendee}attendeeType" maxOccurs="unbounded" minOccurs="0"/>
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
        "attendee"
    })
    public static class Attendees
        implements Serializable
    {

        private final static long serialVersionUID = 2461660169443089969L;
        protected List<AttendeeType> attendee;

        /**
         * Gets the value of the attendee property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attendee property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttendee().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttendeeType }
         * 
         * 
         */
        public List<AttendeeType> getAttendee() {
            if (attendee == null) {
                attendee = new ArrayList<AttendeeType>();
            }
            return this.attendee;
        }

    }

}
