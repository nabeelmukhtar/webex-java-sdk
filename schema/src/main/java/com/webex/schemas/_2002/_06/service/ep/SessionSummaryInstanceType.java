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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.webex.schemas._2002._06.common.ListingType;
import com.webex.schemas._2002._06.common.PsoFieldsType;
import com.webex.schemas._2002._06.common.ServiceTypeType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.MeetingAssistType;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for sessionSummaryInstanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sessionSummaryInstanceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="sessionKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="confName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sessionType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="serviceType" type="{http://www.webex.com/schemas/2002/06/common}serviceTypeType"/>
 *         &lt;element name="hostWebExID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hostFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hostLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherHostWebExID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeZoneID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="timeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actualStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="openTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="listStatus" type="{http://www.webex.com/schemas/2002/06/common}listingType"/>
 *         &lt;element name="hostEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passwordReq" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hostJoined" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="participantsJoined" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="confID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="registration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isRecurring" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="altHost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="psoFields" type="{http://www.webex.com/schemas/2002/06/common}psoFieldsType" minOccurs="0"/>
 *         &lt;element name="assistService" type="{http://www.webex.com/schemas/2002/06/service}meetingAssistType" minOccurs="0"/>
 *         &lt;element name="hostType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="audioStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isAudioOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sessionSummaryInstanceType", propOrder = {
    "sessionKey",
    "confName",
    "sessionType",
    "serviceType",
    "hostWebExID",
    "hostFirstName",
    "hostLastName",
    "otherHostWebExID",
    "timeZoneID",
    "timeZone",
    "status",
    "startTime",
    "actualStartTime",
    "openTime",
    "duration",
    "listStatus",
    "hostEmail",
    "passwordReq",
    "hostJoined",
    "participantsJoined",
    "confID",
    "registration",
    "isRecurring",
    "altHost",
    "psoFields",
    "assistService",
    "hostType",
    "audioStatus",
    "isAudioOnly"
})
public class SessionSummaryInstanceType
    extends BodyContentType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected long sessionKey;
    @XmlElement(required = true)
    protected String confName;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long sessionType;
    @XmlElement(required = true)
    protected ServiceTypeType serviceType;
    @XmlElement(required = true)
    protected String hostWebExID;
    protected String hostFirstName;
    protected String hostLastName;
    protected String otherHostWebExID;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long timeZoneID;
    protected String timeZone;
    protected String status;
    @XmlElement(required = true)
    protected String startTime;
    protected String actualStartTime;
    protected Integer openTime;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long duration;
    @XmlElement(required = true)
    protected ListingType listStatus;
    protected String hostEmail;
    protected Boolean passwordReq;
    protected Boolean hostJoined;
    protected Boolean participantsJoined;
    protected long confID;
    protected Boolean registration;
    protected boolean isRecurring;
    protected Boolean altHost;
    protected PsoFieldsType psoFields;
    protected MeetingAssistType assistService;
    protected String hostType;
    protected String audioStatus;
    protected Boolean isAudioOnly;

    /**
     * Gets the value of the sessionKey property.
     * 
     */
    public long getSessionKey() {
        return sessionKey;
    }

    /**
     * Sets the value of the sessionKey property.
     * 
     */
    public void setSessionKey(long value) {
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
     * Gets the value of the sessionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getSessionType() {
        return sessionType;
    }

    /**
     * Sets the value of the sessionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionType(Long value) {
        this.sessionType = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceTypeType }
     *     
     */
    public ServiceTypeType getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceTypeType }
     *     
     */
    public void setServiceType(ServiceTypeType value) {
        this.serviceType = value;
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
     * Gets the value of the hostFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostFirstName() {
        return hostFirstName;
    }

    /**
     * Sets the value of the hostFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostFirstName(String value) {
        this.hostFirstName = value;
    }

    /**
     * Gets the value of the hostLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostLastName() {
        return hostLastName;
    }

    /**
     * Sets the value of the hostLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostLastName(String value) {
        this.hostLastName = value;
    }

    /**
     * Gets the value of the otherHostWebExID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherHostWebExID() {
        return otherHostWebExID;
    }

    /**
     * Sets the value of the otherHostWebExID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherHostWebExID(String value) {
        this.otherHostWebExID = value;
    }

    /**
     * Gets the value of the timeZoneID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getTimeZoneID() {
        return timeZoneID;
    }

    /**
     * Sets the value of the timeZoneID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneID(Long value) {
        this.timeZoneID = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the actualStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualStartTime() {
        return actualStartTime;
    }

    /**
     * Sets the value of the actualStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualStartTime(String value) {
        this.actualStartTime = value;
    }

    /**
     * Gets the value of the openTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOpenTime() {
        return openTime;
    }

    /**
     * Sets the value of the openTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOpenTime(Integer value) {
        this.openTime = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
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
     *     {@link String }
     *     
     */
    public void setDuration(Long value) {
        this.duration = value;
    }

    /**
     * Gets the value of the listStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ListingType }
     *     
     */
    public ListingType getListStatus() {
        return listStatus;
    }

    /**
     * Sets the value of the listStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingType }
     *     
     */
    public void setListStatus(ListingType value) {
        this.listStatus = value;
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
     * Gets the value of the passwordReq property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPasswordReq() {
        return passwordReq;
    }

    /**
     * Sets the value of the passwordReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPasswordReq(Boolean value) {
        this.passwordReq = value;
    }

    /**
     * Gets the value of the hostJoined property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHostJoined() {
        return hostJoined;
    }

    /**
     * Sets the value of the hostJoined property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHostJoined(Boolean value) {
        this.hostJoined = value;
    }

    /**
     * Gets the value of the participantsJoined property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParticipantsJoined() {
        return participantsJoined;
    }

    /**
     * Sets the value of the participantsJoined property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParticipantsJoined(Boolean value) {
        this.participantsJoined = value;
    }

    /**
     * Gets the value of the confID property.
     * 
     */
    public long getConfID() {
        return confID;
    }

    /**
     * Sets the value of the confID property.
     * 
     */
    public void setConfID(long value) {
        this.confID = value;
    }

    /**
     * Gets the value of the registration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegistration() {
        return registration;
    }

    /**
     * Sets the value of the registration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegistration(Boolean value) {
        this.registration = value;
    }

    /**
     * Gets the value of the isRecurring property.
     * 
     */
    public boolean isIsRecurring() {
        return isRecurring;
    }

    /**
     * Sets the value of the isRecurring property.
     * 
     */
    public void setIsRecurring(boolean value) {
        this.isRecurring = value;
    }

    /**
     * Gets the value of the altHost property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAltHost() {
        return altHost;
    }

    /**
     * Sets the value of the altHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAltHost(Boolean value) {
        this.altHost = value;
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
     * Gets the value of the hostType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostType() {
        return hostType;
    }

    /**
     * Sets the value of the hostType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostType(String value) {
        this.hostType = value;
    }

    /**
     * Gets the value of the audioStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioStatus() {
        return audioStatus;
    }

    /**
     * Sets the value of the audioStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioStatus(String value) {
        this.audioStatus = value;
    }

    /**
     * Gets the value of the isAudioOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAudioOnly() {
        return isAudioOnly;
    }

    /**
     * Sets the value of the isAudioOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAudioOnly(Boolean value) {
        this.isAudioOnly = value;
    }

}
