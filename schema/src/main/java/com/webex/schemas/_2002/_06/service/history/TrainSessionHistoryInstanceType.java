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

package com.webex.schemas._2002._06.service.history;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.webex.schemas._2002._06.common.PsoFieldsType;
import com.webex.schemas._2002._06.common.TrackingType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.MeetingAssistType;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for trainSessionHistoryInstanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trainSessionHistoryInstanceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="sessionKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="confName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sessionStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sessionEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="totalAttendee" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="totalRegistered" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="totalInvited" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="timezone" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="trackingCode" type="{http://www.webex.com/schemas/2002/06/common}trackingType" minOccurs="0"/>
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="hostWebExID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hostEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalPeopleMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalCallInMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalCallInTolllfreeMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalCallOutDomestic" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalCallOutInternational" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalVoipMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalParticipants" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalParticipantsVoip" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="totalParticipantsCallIn" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="totalParticipantsCallOut" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="confID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="peakAttendee" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="psoFields" type="{http://www.webex.com/schemas/2002/06/common}psoFieldsType" minOccurs="0"/>
 *         &lt;element name="assistService" type="{http://www.webex.com/schemas/2002/06/service}meetingAssistType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trainSessionHistoryInstanceType", propOrder = {
    "sessionKey",
    "confName",
    "sessionStartTime",
    "sessionEndTime",
    "duration",
    "totalAttendee",
    "totalRegistered",
    "totalInvited",
    "timezone",
    "trackingCode",
    "userID",
    "hostWebExID",
    "hostEmail",
    "totalPeopleMinutes",
    "totalCallInMinutes",
    "totalCallInTolllfreeMinutes",
    "totalCallOutDomestic",
    "totalCallOutInternational",
    "totalVoipMinutes",
    "totalParticipants",
    "totalParticipantsVoip",
    "totalParticipantsCallIn",
    "totalParticipantsCallOut",
    "confID",
    "peakAttendee",
    "psoFields",
    "assistService"
})
public class TrainSessionHistoryInstanceType
    extends BodyContentType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected Long sessionKey;
    protected String confName;
    protected String sessionStartTime;
    protected String sessionEndTime;
    protected Long duration;
    protected Long totalAttendee;
    protected Long totalRegistered;
    protected Long totalInvited;
    protected Long timezone;
    protected TrackingType trackingCode;
    protected Integer userID;
    protected String hostWebExID;
    protected String hostEmail;
    protected Integer totalPeopleMinutes;
    protected Integer totalCallInMinutes;
    protected Integer totalCallInTolllfreeMinutes;
    protected Integer totalCallOutDomestic;
    protected Integer totalCallOutInternational;
    protected Integer totalVoipMinutes;
    protected Integer totalParticipants;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long totalParticipantsVoip;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long totalParticipantsCallIn;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long totalParticipantsCallOut;
    protected Long confID;
    protected Long peakAttendee;
    protected PsoFieldsType psoFields;
    protected MeetingAssistType assistService;

    /**
     * Gets the value of the sessionKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSessionKey() {
        return sessionKey;
    }

    /**
     * Sets the value of the sessionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSessionKey(Long value) {
        this.sessionKey = value;
    }

    /**
     * Gets the value of the confName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfName() {
        return confName;
    }

    /**
     * Sets the value of the confName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfName(String value) {
        this.confName = value;
    }

    /**
     * Gets the value of the sessionStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionStartTime() {
        return sessionStartTime;
    }

    /**
     * Sets the value of the sessionStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionStartTime(String value) {
        this.sessionStartTime = value;
    }

    /**
     * Gets the value of the sessionEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionEndTime() {
        return sessionEndTime;
    }

    /**
     * Sets the value of the sessionEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionEndTime(String value) {
        this.sessionEndTime = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDuration(Long value) {
        this.duration = value;
    }

    /**
     * Gets the value of the totalAttendee property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalAttendee() {
        return totalAttendee;
    }

    /**
     * Sets the value of the totalAttendee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalAttendee(Long value) {
        this.totalAttendee = value;
    }

    /**
     * Gets the value of the totalRegistered property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalRegistered() {
        return totalRegistered;
    }

    /**
     * Sets the value of the totalRegistered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalRegistered(Long value) {
        this.totalRegistered = value;
    }

    /**
     * Gets the value of the totalInvited property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalInvited() {
        return totalInvited;
    }

    /**
     * Sets the value of the totalInvited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalInvited(Long value) {
        this.totalInvited = value;
    }

    /**
     * Gets the value of the timezone property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimezone() {
        return timezone;
    }

    /**
     * Sets the value of the timezone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimezone(Long value) {
        this.timezone = value;
    }

    /**
     * Gets the value of the trackingCode property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingType }
     *     
     */
    public TrackingType getTrackingCode() {
        return trackingCode;
    }

    /**
     * Sets the value of the trackingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingType }
     *     
     */
    public void setTrackingCode(TrackingType value) {
        this.trackingCode = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserID(Integer value) {
        this.userID = value;
    }

    /**
     * Gets the value of the hostWebExID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostWebExID() {
        return hostWebExID;
    }

    /**
     * Sets the value of the hostWebExID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostWebExID(String value) {
        this.hostWebExID = value;
    }

    /**
     * Gets the value of the hostEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostEmail() {
        return hostEmail;
    }

    /**
     * Sets the value of the hostEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostEmail(String value) {
        this.hostEmail = value;
    }

    /**
     * Gets the value of the totalPeopleMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalPeopleMinutes() {
        return totalPeopleMinutes;
    }

    /**
     * Sets the value of the totalPeopleMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalPeopleMinutes(Integer value) {
        this.totalPeopleMinutes = value;
    }

    /**
     * Gets the value of the totalCallInMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalCallInMinutes() {
        return totalCallInMinutes;
    }

    /**
     * Sets the value of the totalCallInMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalCallInMinutes(Integer value) {
        this.totalCallInMinutes = value;
    }

    /**
     * Gets the value of the totalCallInTolllfreeMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalCallInTolllfreeMinutes() {
        return totalCallInTolllfreeMinutes;
    }

    /**
     * Sets the value of the totalCallInTolllfreeMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalCallInTolllfreeMinutes(Integer value) {
        this.totalCallInTolllfreeMinutes = value;
    }

    /**
     * Gets the value of the totalCallOutDomestic property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalCallOutDomestic() {
        return totalCallOutDomestic;
    }

    /**
     * Sets the value of the totalCallOutDomestic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalCallOutDomestic(Integer value) {
        this.totalCallOutDomestic = value;
    }

    /**
     * Gets the value of the totalCallOutInternational property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalCallOutInternational() {
        return totalCallOutInternational;
    }

    /**
     * Sets the value of the totalCallOutInternational property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalCallOutInternational(Integer value) {
        this.totalCallOutInternational = value;
    }

    /**
     * Gets the value of the totalVoipMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalVoipMinutes() {
        return totalVoipMinutes;
    }

    /**
     * Sets the value of the totalVoipMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalVoipMinutes(Integer value) {
        this.totalVoipMinutes = value;
    }

    /**
     * Gets the value of the totalParticipants property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalParticipants() {
        return totalParticipants;
    }

    /**
     * Sets the value of the totalParticipants property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalParticipants(Integer value) {
        this.totalParticipants = value;
    }

    /**
     * Gets the value of the totalParticipantsVoip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getTotalParticipantsVoip() {
        return totalParticipantsVoip;
    }

    /**
     * Sets the value of the totalParticipantsVoip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalParticipantsVoip(Long value) {
        this.totalParticipantsVoip = value;
    }

    /**
     * Gets the value of the totalParticipantsCallIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getTotalParticipantsCallIn() {
        return totalParticipantsCallIn;
    }

    /**
     * Sets the value of the totalParticipantsCallIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalParticipantsCallIn(Long value) {
        this.totalParticipantsCallIn = value;
    }

    /**
     * Gets the value of the totalParticipantsCallOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getTotalParticipantsCallOut() {
        return totalParticipantsCallOut;
    }

    /**
     * Sets the value of the totalParticipantsCallOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalParticipantsCallOut(Long value) {
        this.totalParticipantsCallOut = value;
    }

    /**
     * Gets the value of the confID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConfID() {
        return confID;
    }

    /**
     * Sets the value of the confID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConfID(Long value) {
        this.confID = value;
    }

    /**
     * Gets the value of the peakAttendee property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPeakAttendee() {
        return peakAttendee;
    }

    /**
     * Sets the value of the peakAttendee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPeakAttendee(Long value) {
        this.peakAttendee = value;
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

}
