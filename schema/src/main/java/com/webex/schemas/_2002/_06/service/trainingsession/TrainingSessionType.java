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

package com.webex.schemas._2002._06.service.trainingsession;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.PsoFieldsType;
import com.webex.schemas._2002._06.common.TrackingType;
import com.webex.schemas._2002._06.service.MeetingAssistType;
import com.webex.schemas._2002._06.service.session.ParticipantsType;
import com.webex.schemas._2002._06.service.session.RemindType;
import com.webex.schemas._2002._06.service.session.SessionType;
import com.webex.schemas._2002._06.service.session.TelephonyType;


/**
 * <p>Java class for trainingSessionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trainingSessionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/session}sessionType">
 *       &lt;sequence>
 *         &lt;element name="metaData" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}trainingMetaDataType" minOccurs="0"/>
 *         &lt;element name="enableOptions" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}trainingEnableOptionsType" minOccurs="0"/>
 *         &lt;element name="telephony" type="{http://www.webex.com/schemas/2002/06/service/session}telephonyType" minOccurs="0"/>
 *         &lt;element name="tracking" type="{http://www.webex.com/schemas/2002/06/common}trackingType" minOccurs="0"/>
 *         &lt;element name="repeat" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}trainRepeatType" minOccurs="0"/>
 *         &lt;element name="remind" type="{http://www.webex.com/schemas/2002/06/service/session}remindType" minOccurs="0"/>
 *         &lt;element name="presenters" type="{http://www.webex.com/schemas/2002/06/service/session}participantsType" minOccurs="0"/>
 *         &lt;element name="attendees" type="{http://www.webex.com/schemas/2002/06/service/session}participantsType" minOccurs="0"/>
 *         &lt;element name="attendeeOptions" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}attendeeOptionsType" minOccurs="0"/>
 *         &lt;element name="handsOnLab" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}handsOnLabType" minOccurs="0"/>
 *         &lt;element name="psoFields" type="{http://www.webex.com/schemas/2002/06/common}psoFieldsType" minOccurs="0"/>
 *         &lt;element name="assistService" type="{http://www.webex.com/schemas/2002/06/service}meetingAssistType" minOccurs="0"/>
 *         &lt;element name="preAssignBreakout" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="enable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="attendeeAssign" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}attendeeAssignType" minOccurs="0"/>
 *                   &lt;element name="numSessions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="attendeesPerSess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trainingSessionType", propOrder = {
    "metaData",
    "enableOptions",
    "telephony",
    "tracking",
    "repeat",
    "remind",
    "presenters",
    "attendees",
    "attendeeOptions",
    "handsOnLab",
    "psoFields",
    "assistService",
    "preAssignBreakout"
})
@XmlSeeAlso({
    TrainingSessionInstanceType.class,
    CreateTrainingSession.class
})
public class TrainingSessionType
    extends SessionType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected TrainingMetaDataType metaData;
    protected TrainingEnableOptionsType enableOptions;
    protected TelephonyType telephony;
    protected TrackingType tracking;
    protected TrainRepeatType repeat;
    protected RemindType remind;
    protected ParticipantsType presenters;
    protected ParticipantsType attendees;
    protected AttendeeOptionsType attendeeOptions;
    protected HandsOnLabType handsOnLab;
    protected PsoFieldsType psoFields;
    protected MeetingAssistType assistService;
    protected TrainingSessionType.PreAssignBreakout preAssignBreakout;

    /**
     * Gets the value of the metaData property.
     * 
     * @return
     *     possible object is
     *     {@link TrainingMetaDataType }
     *     
     */
    public TrainingMetaDataType getMetaData() {
        return metaData;
    }

    /**
     * Sets the value of the metaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainingMetaDataType }
     *     
     */
    public void setMetaData(TrainingMetaDataType value) {
        this.metaData = value;
    }

    /**
     * Gets the value of the enableOptions property.
     * 
     * @return
     *     possible object is
     *     {@link TrainingEnableOptionsType }
     *     
     */
    public TrainingEnableOptionsType getEnableOptions() {
        return enableOptions;
    }

    /**
     * Sets the value of the enableOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainingEnableOptionsType }
     *     
     */
    public void setEnableOptions(TrainingEnableOptionsType value) {
        this.enableOptions = value;
    }

    /**
     * Gets the value of the telephony property.
     * 
     * @return
     *     possible object is
     *     {@link TelephonyType }
     *     
     */
    public TelephonyType getTelephony() {
        return telephony;
    }

    /**
     * Sets the value of the telephony property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephonyType }
     *     
     */
    public void setTelephony(TelephonyType value) {
        this.telephony = value;
    }

    /**
     * Gets the value of the tracking property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingType }
     *     
     */
    public TrackingType getTracking() {
        return tracking;
    }

    /**
     * Sets the value of the tracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingType }
     *     
     */
    public void setTracking(TrackingType value) {
        this.tracking = value;
    }

    /**
     * Gets the value of the repeat property.
     * 
     * @return
     *     possible object is
     *     {@link TrainRepeatType }
     *     
     */
    public TrainRepeatType getRepeat() {
        return repeat;
    }

    /**
     * Sets the value of the repeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainRepeatType }
     *     
     */
    public void setRepeat(TrainRepeatType value) {
        this.repeat = value;
    }

    /**
     * Gets the value of the remind property.
     * 
     * @return
     *     possible object is
     *     {@link RemindType }
     *     
     */
    public RemindType getRemind() {
        return remind;
    }

    /**
     * Sets the value of the remind property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemindType }
     *     
     */
    public void setRemind(RemindType value) {
        this.remind = value;
    }

    /**
     * Gets the value of the presenters property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantsType }
     *     
     */
    public ParticipantsType getPresenters() {
        return presenters;
    }

    /**
     * Sets the value of the presenters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantsType }
     *     
     */
    public void setPresenters(ParticipantsType value) {
        this.presenters = value;
    }

    /**
     * Gets the value of the attendees property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantsType }
     *     
     */
    public ParticipantsType getAttendees() {
        return attendees;
    }

    /**
     * Sets the value of the attendees property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantsType }
     *     
     */
    public void setAttendees(ParticipantsType value) {
        this.attendees = value;
    }

    /**
     * Gets the value of the attendeeOptions property.
     * 
     * @return
     *     possible object is
     *     {@link AttendeeOptionsType }
     *     
     */
    public AttendeeOptionsType getAttendeeOptions() {
        return attendeeOptions;
    }

    /**
     * Sets the value of the attendeeOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttendeeOptionsType }
     *     
     */
    public void setAttendeeOptions(AttendeeOptionsType value) {
        this.attendeeOptions = value;
    }

    /**
     * Gets the value of the handsOnLab property.
     * 
     * @return
     *     possible object is
     *     {@link HandsOnLabType }
     *     
     */
    public HandsOnLabType getHandsOnLab() {
        return handsOnLab;
    }

    /**
     * Sets the value of the handsOnLab property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandsOnLabType }
     *     
     */
    public void setHandsOnLab(HandsOnLabType value) {
        this.handsOnLab = value;
    }

    /**
     * Gets the value of the psoFields property.
     * 
     * @return
     *     possible object is
     *     {@link PsoFieldsType }
     *     
     */
    public PsoFieldsType getPsoFields() {
        return psoFields;
    }

    /**
     * Sets the value of the psoFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link PsoFieldsType }
     *     
     */
    public void setPsoFields(PsoFieldsType value) {
        this.psoFields = value;
    }

    /**
     * Gets the value of the assistService property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingAssistType }
     *     
     */
    public MeetingAssistType getAssistService() {
        return assistService;
    }

    /**
     * Sets the value of the assistService property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingAssistType }
     *     
     */
    public void setAssistService(MeetingAssistType value) {
        this.assistService = value;
    }

    /**
     * Gets the value of the preAssignBreakout property.
     * 
     * @return
     *     possible object is
     *     {@link TrainingSessionType.PreAssignBreakout }
     *     
     */
    public TrainingSessionType.PreAssignBreakout getPreAssignBreakout() {
        return preAssignBreakout;
    }

    /**
     * Sets the value of the preAssignBreakout property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainingSessionType.PreAssignBreakout }
     *     
     */
    public void setPreAssignBreakout(TrainingSessionType.PreAssignBreakout value) {
        this.preAssignBreakout = value;
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
     *         &lt;element name="enable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="attendeeAssign" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}attendeeAssignType" minOccurs="0"/>
     *         &lt;element name="numSessions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="attendeesPerSess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "enable",
        "attendeeAssign",
        "numSessions",
        "attendeesPerSess"
    })
    public static class PreAssignBreakout
        implements Serializable
    {

        private final static long serialVersionUID = 2461660169443089969L;
        protected Boolean enable;
        protected AttendeeAssignType attendeeAssign;
        protected Integer numSessions;
        protected Integer attendeesPerSess;

        /**
         * Gets the value of the enable property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isEnable() {
            return enable;
        }

        /**
         * Sets the value of the enable property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setEnable(Boolean value) {
            this.enable = value;
        }

        /**
         * Gets the value of the attendeeAssign property.
         * 
         * @return
         *     possible object is
         *     {@link AttendeeAssignType }
         *     
         */
        public AttendeeAssignType getAttendeeAssign() {
            return attendeeAssign;
        }

        /**
         * Sets the value of the attendeeAssign property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttendeeAssignType }
         *     
         */
        public void setAttendeeAssign(AttendeeAssignType value) {
            this.attendeeAssign = value;
        }

        /**
         * Gets the value of the numSessions property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getNumSessions() {
            return numSessions;
        }

        /**
         * Sets the value of the numSessions property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setNumSessions(Integer value) {
            this.numSessions = value;
        }

        /**
         * Gets the value of the attendeesPerSess property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getAttendeesPerSess() {
            return attendeesPerSess;
        }

        /**
         * Sets the value of the attendeesPerSess property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setAttendeesPerSess(Integer value) {
            this.attendeesPerSess = value;
        }

    }

}
