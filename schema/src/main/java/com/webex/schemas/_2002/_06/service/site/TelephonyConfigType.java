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
import com.webex.schemas._2002._06.service.PersonalTeleServerType;


/**
 * <p>Java class for telephonyConfigType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="telephonyConfigType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isTSPUsingTelephonyAPI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="serviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="participantAccessCodeLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subscriberAccessCodeLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attendeeIDLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryAdaptorURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secondaryAdaptorURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="internetPhone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="callInTeleconferencing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tollFreeCallinTeleconferencing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="callBackTeleconferencing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="callInNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultTeleServerSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subscribeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subscribePassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultPhoneLines" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultSpeakingLines" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="majorCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="majorAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publicName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hybridTeleconference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="instantHelp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="customerManage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TSRouting" type="{http://www.webex.com/schemas/2002/06/service/site}TSRouting" minOccurs="0"/>
 *         &lt;element name="teleServerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxCallersNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isSpecified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isContinue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="intlCallBackTeleconferencing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="personalTeleconf" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="primaryLargeServer" type="{http://www.webex.com/schemas/2002/06/service}personalTeleServerType" minOccurs="0"/>
 *                   &lt;element name="backup1LargeServer" type="{http://www.webex.com/schemas/2002/06/service}personalTeleServerType" minOccurs="0"/>
 *                   &lt;element name="backup2LargeServer" type="{http://www.webex.com/schemas/2002/06/service}personalTeleServerType" minOccurs="0"/>
 *                   &lt;element name="primarySmallServer" type="{http://www.webex.com/schemas/2002/06/service}personalTeleServerType" minOccurs="0"/>
 *                   &lt;element name="backup1SmallServer" type="{http://www.webex.com/schemas/2002/06/service}personalTeleServerType" minOccurs="0"/>
 *                   &lt;element name="backup2SmallServer" type="{http://www.webex.com/schemas/2002/06/service}personalTeleServerType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="multiMediaPlatform" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="multiMediaHostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="broadcastAudioStream" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tspAdaptorSettings">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="primaryLarge" type="{http://www.webex.com/schemas/2002/06/service/site}tspServerType" minOccurs="0"/>
 *                   &lt;element name="backup1Large" type="{http://www.webex.com/schemas/2002/06/service/site}tspServerType" minOccurs="0"/>
 *                   &lt;element name="backup2Large" type="{http://www.webex.com/schemas/2002/06/service/site}tspServerType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="meetingPlace" type="{http://www.webex.com/schemas/2002/06/service/site}meetingPlaceTelephonyType"/>
 *         &lt;element name="otherTeleServiceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supportAdapterlessTSP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="displayAttendeeID" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="provisionTeleAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="choosePCN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="audioOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="configTollAndTollFreeNum" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="configPrimaryTS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "telephonyConfigType", propOrder = {
    "isTSPUsingTelephonyAPI",
    "serviceName",
    "participantAccessCodeLabel",
    "subscriberAccessCodeLabel",
    "attendeeIDLabel",
    "primaryAdaptorURL",
    "secondaryAdaptorURL",
    "internetPhone",
    "callInTeleconferencing",
    "tollFreeCallinTeleconferencing",
    "callBackTeleconferencing",
    "callInNumber",
    "defaultTeleServerSubject",
    "subscribeName",
    "subscribePassword",
    "defaultPhoneLines",
    "defaultSpeakingLines",
    "majorCountryCode",
    "majorAreaCode",
    "publicName",
    "hybridTeleconference",
    "instantHelp",
    "customerManage",
    "tsRouting",
    "teleServerName",
    "maxCallersNumber",
    "isSpecified",
    "isContinue",
    "intlCallBackTeleconferencing",
    "personalTeleconf",
    "multiMediaPlatform",
    "multiMediaHostName",
    "broadcastAudioStream",
    "tspAdaptorSettings",
    "meetingPlace",
    "otherTeleServiceName",
    "supportAdapterlessTSP",
    "displayAttendeeID",
    "provisionTeleAccount",
    "choosePCN",
    "audioOnly",
    "configTollAndTollFreeNum",
    "configPrimaryTS"
})
public class TelephonyConfigType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected Boolean isTSPUsingTelephonyAPI;
    protected String serviceName;
    protected String participantAccessCodeLabel;
    protected String subscriberAccessCodeLabel;
    protected String attendeeIDLabel;
    protected String primaryAdaptorURL;
    protected String secondaryAdaptorURL;
    protected Boolean internetPhone;
    protected Boolean callInTeleconferencing;
    protected Boolean tollFreeCallinTeleconferencing;
    @XmlElement(defaultValue = "false")
    protected Boolean callBackTeleconferencing;
    protected String callInNumber;
    protected String defaultTeleServerSubject;
    protected String subscribeName;
    protected String subscribePassword;
    protected String defaultPhoneLines;
    protected String defaultSpeakingLines;
    protected String majorCountryCode;
    protected String majorAreaCode;
    protected String publicName;
    protected Boolean hybridTeleconference;
    protected Boolean instantHelp;
    protected Boolean customerManage;
    @XmlElement(name = "TSRouting")
    protected TSRouting tsRouting;
    protected String teleServerName;
    protected Long maxCallersNumber;
    protected Boolean isSpecified;
    protected Boolean isContinue;
    protected Boolean intlCallBackTeleconferencing;
    protected TelephonyConfigType.PersonalTeleconf personalTeleconf;
    protected Boolean multiMediaPlatform;
    protected String multiMediaHostName;
    protected Boolean broadcastAudioStream;
    @XmlElement(required = true)
    protected TelephonyConfigType.TspAdaptorSettings tspAdaptorSettings;
    @XmlElement(required = true)
    protected MeetingPlaceTelephonyType meetingPlace;
    protected String otherTeleServiceName;
    protected Boolean supportAdapterlessTSP;
    protected Boolean displayAttendeeID;
    protected Boolean provisionTeleAccount;
    protected Boolean choosePCN;
    protected Boolean audioOnly;
    protected Boolean configTollAndTollFreeNum;
    protected Boolean configPrimaryTS;

    /**
     * Gets the value of the isTSPUsingTelephonyAPI property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTSPUsingTelephonyAPI() {
        return isTSPUsingTelephonyAPI;
    }

    /**
     * Sets the value of the isTSPUsingTelephonyAPI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTSPUsingTelephonyAPI(Boolean value) {
        this.isTSPUsingTelephonyAPI = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the participantAccessCodeLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantAccessCodeLabel() {
        return participantAccessCodeLabel;
    }

    /**
     * Sets the value of the participantAccessCodeLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantAccessCodeLabel(String value) {
        this.participantAccessCodeLabel = value;
    }

    /**
     * Gets the value of the subscriberAccessCodeLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberAccessCodeLabel() {
        return subscriberAccessCodeLabel;
    }

    /**
     * Sets the value of the subscriberAccessCodeLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberAccessCodeLabel(String value) {
        this.subscriberAccessCodeLabel = value;
    }

    /**
     * Gets the value of the attendeeIDLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendeeIDLabel() {
        return attendeeIDLabel;
    }

    /**
     * Sets the value of the attendeeIDLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendeeIDLabel(String value) {
        this.attendeeIDLabel = value;
    }

    /**
     * Gets the value of the primaryAdaptorURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAdaptorURL() {
        return primaryAdaptorURL;
    }

    /**
     * Sets the value of the primaryAdaptorURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAdaptorURL(String value) {
        this.primaryAdaptorURL = value;
    }

    /**
     * Gets the value of the secondaryAdaptorURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryAdaptorURL() {
        return secondaryAdaptorURL;
    }

    /**
     * Sets the value of the secondaryAdaptorURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryAdaptorURL(String value) {
        this.secondaryAdaptorURL = value;
    }

    /**
     * Gets the value of the internetPhone property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInternetPhone() {
        return internetPhone;
    }

    /**
     * Sets the value of the internetPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInternetPhone(Boolean value) {
        this.internetPhone = value;
    }

    /**
     * Gets the value of the callInTeleconferencing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCallInTeleconferencing() {
        return callInTeleconferencing;
    }

    /**
     * Sets the value of the callInTeleconferencing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCallInTeleconferencing(Boolean value) {
        this.callInTeleconferencing = value;
    }

    /**
     * Gets the value of the tollFreeCallinTeleconferencing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTollFreeCallinTeleconferencing() {
        return tollFreeCallinTeleconferencing;
    }

    /**
     * Sets the value of the tollFreeCallinTeleconferencing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTollFreeCallinTeleconferencing(Boolean value) {
        this.tollFreeCallinTeleconferencing = value;
    }

    /**
     * Gets the value of the callBackTeleconferencing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCallBackTeleconferencing() {
        return callBackTeleconferencing;
    }

    /**
     * Sets the value of the callBackTeleconferencing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCallBackTeleconferencing(Boolean value) {
        this.callBackTeleconferencing = value;
    }

    /**
     * Gets the value of the callInNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallInNumber() {
        return callInNumber;
    }

    /**
     * Sets the value of the callInNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallInNumber(String value) {
        this.callInNumber = value;
    }

    /**
     * Gets the value of the defaultTeleServerSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultTeleServerSubject() {
        return defaultTeleServerSubject;
    }

    /**
     * Sets the value of the defaultTeleServerSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultTeleServerSubject(String value) {
        this.defaultTeleServerSubject = value;
    }

    /**
     * Gets the value of the subscribeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscribeName() {
        return subscribeName;
    }

    /**
     * Sets the value of the subscribeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscribeName(String value) {
        this.subscribeName = value;
    }

    /**
     * Gets the value of the subscribePassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscribePassword() {
        return subscribePassword;
    }

    /**
     * Sets the value of the subscribePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscribePassword(String value) {
        this.subscribePassword = value;
    }

    /**
     * Gets the value of the defaultPhoneLines property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultPhoneLines() {
        return defaultPhoneLines;
    }

    /**
     * Sets the value of the defaultPhoneLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultPhoneLines(String value) {
        this.defaultPhoneLines = value;
    }

    /**
     * Gets the value of the defaultSpeakingLines property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultSpeakingLines() {
        return defaultSpeakingLines;
    }

    /**
     * Sets the value of the defaultSpeakingLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultSpeakingLines(String value) {
        this.defaultSpeakingLines = value;
    }

    /**
     * Gets the value of the majorCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMajorCountryCode() {
        return majorCountryCode;
    }

    /**
     * Sets the value of the majorCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMajorCountryCode(String value) {
        this.majorCountryCode = value;
    }

    /**
     * Gets the value of the majorAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMajorAreaCode() {
        return majorAreaCode;
    }

    /**
     * Sets the value of the majorAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMajorAreaCode(String value) {
        this.majorAreaCode = value;
    }

    /**
     * Gets the value of the publicName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicName() {
        return publicName;
    }

    /**
     * Sets the value of the publicName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicName(String value) {
        this.publicName = value;
    }

    /**
     * Gets the value of the hybridTeleconference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHybridTeleconference() {
        return hybridTeleconference;
    }

    /**
     * Sets the value of the hybridTeleconference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHybridTeleconference(Boolean value) {
        this.hybridTeleconference = value;
    }

    /**
     * Gets the value of the instantHelp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstantHelp() {
        return instantHelp;
    }

    /**
     * Sets the value of the instantHelp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstantHelp(Boolean value) {
        this.instantHelp = value;
    }

    /**
     * Gets the value of the customerManage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomerManage() {
        return customerManage;
    }

    /**
     * Sets the value of the customerManage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomerManage(Boolean value) {
        this.customerManage = value;
    }

    /**
     * Gets the value of the tsRouting property.
     * 
     * @return
     *     possible object is
     *     {@link TSRouting }
     *     
     */
    public TSRouting getTSRouting() {
        return tsRouting;
    }

    /**
     * Sets the value of the tsRouting property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSRouting }
     *     
     */
    public void setTSRouting(TSRouting value) {
        this.tsRouting = value;
    }

    /**
     * Gets the value of the teleServerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeleServerName() {
        return teleServerName;
    }

    /**
     * Sets the value of the teleServerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeleServerName(String value) {
        this.teleServerName = value;
    }

    /**
     * Gets the value of the maxCallersNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxCallersNumber() {
        return maxCallersNumber;
    }

    /**
     * Sets the value of the maxCallersNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxCallersNumber(Long value) {
        this.maxCallersNumber = value;
    }

    /**
     * Gets the value of the isSpecified property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSpecified() {
        return isSpecified;
    }

    /**
     * Sets the value of the isSpecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSpecified(Boolean value) {
        this.isSpecified = value;
    }

    /**
     * Gets the value of the isContinue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsContinue() {
        return isContinue;
    }

    /**
     * Sets the value of the isContinue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsContinue(Boolean value) {
        this.isContinue = value;
    }

    /**
     * Gets the value of the intlCallBackTeleconferencing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntlCallBackTeleconferencing() {
        return intlCallBackTeleconferencing;
    }

    /**
     * Sets the value of the intlCallBackTeleconferencing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntlCallBackTeleconferencing(Boolean value) {
        this.intlCallBackTeleconferencing = value;
    }

    /**
     * Gets the value of the personalTeleconf property.
     * 
     * @return
     *     possible object is
     *     {@link TelephonyConfigType.PersonalTeleconf }
     *     
     */
    public TelephonyConfigType.PersonalTeleconf getPersonalTeleconf() {
        return personalTeleconf;
    }

    /**
     * Sets the value of the personalTeleconf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephonyConfigType.PersonalTeleconf }
     *     
     */
    public void setPersonalTeleconf(TelephonyConfigType.PersonalTeleconf value) {
        this.personalTeleconf = value;
    }

    /**
     * Gets the value of the multiMediaPlatform property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultiMediaPlatform() {
        return multiMediaPlatform;
    }

    /**
     * Sets the value of the multiMediaPlatform property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultiMediaPlatform(Boolean value) {
        this.multiMediaPlatform = value;
    }

    /**
     * Gets the value of the multiMediaHostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiMediaHostName() {
        return multiMediaHostName;
    }

    /**
     * Sets the value of the multiMediaHostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiMediaHostName(String value) {
        this.multiMediaHostName = value;
    }

    /**
     * Gets the value of the broadcastAudioStream property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBroadcastAudioStream() {
        return broadcastAudioStream;
    }

    /**
     * Sets the value of the broadcastAudioStream property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBroadcastAudioStream(Boolean value) {
        this.broadcastAudioStream = value;
    }

    /**
     * Gets the value of the tspAdaptorSettings property.
     * 
     * @return
     *     possible object is
     *     {@link TelephonyConfigType.TspAdaptorSettings }
     *     
     */
    public TelephonyConfigType.TspAdaptorSettings getTspAdaptorSettings() {
        return tspAdaptorSettings;
    }

    /**
     * Sets the value of the tspAdaptorSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephonyConfigType.TspAdaptorSettings }
     *     
     */
    public void setTspAdaptorSettings(TelephonyConfigType.TspAdaptorSettings value) {
        this.tspAdaptorSettings = value;
    }

    /**
     * Gets the value of the meetingPlace property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingPlaceTelephonyType }
     *     
     */
    public MeetingPlaceTelephonyType getMeetingPlace() {
        return meetingPlace;
    }

    /**
     * Sets the value of the meetingPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingPlaceTelephonyType }
     *     
     */
    public void setMeetingPlace(MeetingPlaceTelephonyType value) {
        this.meetingPlace = value;
    }

    /**
     * Gets the value of the otherTeleServiceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTeleServiceName() {
        return otherTeleServiceName;
    }

    /**
     * Sets the value of the otherTeleServiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTeleServiceName(String value) {
        this.otherTeleServiceName = value;
    }

    /**
     * Gets the value of the supportAdapterlessTSP property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportAdapterlessTSP() {
        return supportAdapterlessTSP;
    }

    /**
     * Sets the value of the supportAdapterlessTSP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportAdapterlessTSP(Boolean value) {
        this.supportAdapterlessTSP = value;
    }

    /**
     * Gets the value of the displayAttendeeID property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayAttendeeID() {
        return displayAttendeeID;
    }

    /**
     * Sets the value of the displayAttendeeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayAttendeeID(Boolean value) {
        this.displayAttendeeID = value;
    }

    /**
     * Gets the value of the provisionTeleAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProvisionTeleAccount() {
        return provisionTeleAccount;
    }

    /**
     * Sets the value of the provisionTeleAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProvisionTeleAccount(Boolean value) {
        this.provisionTeleAccount = value;
    }

    /**
     * Gets the value of the choosePCN property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChoosePCN() {
        return choosePCN;
    }

    /**
     * Sets the value of the choosePCN property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChoosePCN(Boolean value) {
        this.choosePCN = value;
    }

    /**
     * Gets the value of the audioOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAudioOnly() {
        return audioOnly;
    }

    /**
     * Sets the value of the audioOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAudioOnly(Boolean value) {
        this.audioOnly = value;
    }

    /**
     * Gets the value of the configTollAndTollFreeNum property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfigTollAndTollFreeNum() {
        return configTollAndTollFreeNum;
    }

    /**
     * Sets the value of the configTollAndTollFreeNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfigTollAndTollFreeNum(Boolean value) {
        this.configTollAndTollFreeNum = value;
    }

    /**
     * Gets the value of the configPrimaryTS property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfigPrimaryTS() {
        return configPrimaryTS;
    }

    /**
     * Sets the value of the configPrimaryTS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfigPrimaryTS(Boolean value) {
        this.configPrimaryTS = value;
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
     *         &lt;element name="primaryLargeServer" type="{http://www.webex.com/schemas/2002/06/service}personalTeleServerType" minOccurs="0"/>
     *         &lt;element name="backup1LargeServer" type="{http://www.webex.com/schemas/2002/06/service}personalTeleServerType" minOccurs="0"/>
     *         &lt;element name="backup2LargeServer" type="{http://www.webex.com/schemas/2002/06/service}personalTeleServerType" minOccurs="0"/>
     *         &lt;element name="primarySmallServer" type="{http://www.webex.com/schemas/2002/06/service}personalTeleServerType" minOccurs="0"/>
     *         &lt;element name="backup1SmallServer" type="{http://www.webex.com/schemas/2002/06/service}personalTeleServerType" minOccurs="0"/>
     *         &lt;element name="backup2SmallServer" type="{http://www.webex.com/schemas/2002/06/service}personalTeleServerType" minOccurs="0"/>
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
        "primaryLargeServer",
        "backup1LargeServer",
        "backup2LargeServer",
        "primarySmallServer",
        "backup1SmallServer",
        "backup2SmallServer"
    })
    public static class PersonalTeleconf
        implements Serializable
    {

        private final static long serialVersionUID = 2461660169443089969L;
        protected PersonalTeleServerType primaryLargeServer;
        protected PersonalTeleServerType backup1LargeServer;
        protected PersonalTeleServerType backup2LargeServer;
        protected PersonalTeleServerType primarySmallServer;
        protected PersonalTeleServerType backup1SmallServer;
        protected PersonalTeleServerType backup2SmallServer;

        /**
         * Gets the value of the primaryLargeServer property.
         * 
         * @return
         *     possible object is
         *     {@link PersonalTeleServerType }
         *     
         */
        public PersonalTeleServerType getPrimaryLargeServer() {
            return primaryLargeServer;
        }

        /**
         * Sets the value of the primaryLargeServer property.
         * 
         * @param value
         *     allowed object is
         *     {@link PersonalTeleServerType }
         *     
         */
        public void setPrimaryLargeServer(PersonalTeleServerType value) {
            this.primaryLargeServer = value;
        }

        /**
         * Gets the value of the backup1LargeServer property.
         * 
         * @return
         *     possible object is
         *     {@link PersonalTeleServerType }
         *     
         */
        public PersonalTeleServerType getBackup1LargeServer() {
            return backup1LargeServer;
        }

        /**
         * Sets the value of the backup1LargeServer property.
         * 
         * @param value
         *     allowed object is
         *     {@link PersonalTeleServerType }
         *     
         */
        public void setBackup1LargeServer(PersonalTeleServerType value) {
            this.backup1LargeServer = value;
        }

        /**
         * Gets the value of the backup2LargeServer property.
         * 
         * @return
         *     possible object is
         *     {@link PersonalTeleServerType }
         *     
         */
        public PersonalTeleServerType getBackup2LargeServer() {
            return backup2LargeServer;
        }

        /**
         * Sets the value of the backup2LargeServer property.
         * 
         * @param value
         *     allowed object is
         *     {@link PersonalTeleServerType }
         *     
         */
        public void setBackup2LargeServer(PersonalTeleServerType value) {
            this.backup2LargeServer = value;
        }

        /**
         * Gets the value of the primarySmallServer property.
         * 
         * @return
         *     possible object is
         *     {@link PersonalTeleServerType }
         *     
         */
        public PersonalTeleServerType getPrimarySmallServer() {
            return primarySmallServer;
        }

        /**
         * Sets the value of the primarySmallServer property.
         * 
         * @param value
         *     allowed object is
         *     {@link PersonalTeleServerType }
         *     
         */
        public void setPrimarySmallServer(PersonalTeleServerType value) {
            this.primarySmallServer = value;
        }

        /**
         * Gets the value of the backup1SmallServer property.
         * 
         * @return
         *     possible object is
         *     {@link PersonalTeleServerType }
         *     
         */
        public PersonalTeleServerType getBackup1SmallServer() {
            return backup1SmallServer;
        }

        /**
         * Sets the value of the backup1SmallServer property.
         * 
         * @param value
         *     allowed object is
         *     {@link PersonalTeleServerType }
         *     
         */
        public void setBackup1SmallServer(PersonalTeleServerType value) {
            this.backup1SmallServer = value;
        }

        /**
         * Gets the value of the backup2SmallServer property.
         * 
         * @return
         *     possible object is
         *     {@link PersonalTeleServerType }
         *     
         */
        public PersonalTeleServerType getBackup2SmallServer() {
            return backup2SmallServer;
        }

        /**
         * Sets the value of the backup2SmallServer property.
         * 
         * @param value
         *     allowed object is
         *     {@link PersonalTeleServerType }
         *     
         */
        public void setBackup2SmallServer(PersonalTeleServerType value) {
            this.backup2SmallServer = value;
        }

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
     *         &lt;element name="primaryLarge" type="{http://www.webex.com/schemas/2002/06/service/site}tspServerType" minOccurs="0"/>
     *         &lt;element name="backup1Large" type="{http://www.webex.com/schemas/2002/06/service/site}tspServerType" minOccurs="0"/>
     *         &lt;element name="backup2Large" type="{http://www.webex.com/schemas/2002/06/service/site}tspServerType" minOccurs="0"/>
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
        "primaryLarge",
        "backup1Large",
        "backup2Large"
    })
    public static class TspAdaptorSettings
        implements Serializable
    {

        private final static long serialVersionUID = 2461660169443089969L;
        protected TspServerType primaryLarge;
        protected TspServerType backup1Large;
        protected TspServerType backup2Large;

        /**
         * Gets the value of the primaryLarge property.
         * 
         * @return
         *     possible object is
         *     {@link TspServerType }
         *     
         */
        public TspServerType getPrimaryLarge() {
            return primaryLarge;
        }

        /**
         * Sets the value of the primaryLarge property.
         * 
         * @param value
         *     allowed object is
         *     {@link TspServerType }
         *     
         */
        public void setPrimaryLarge(TspServerType value) {
            this.primaryLarge = value;
        }

        /**
         * Gets the value of the backup1Large property.
         * 
         * @return
         *     possible object is
         *     {@link TspServerType }
         *     
         */
        public TspServerType getBackup1Large() {
            return backup1Large;
        }

        /**
         * Sets the value of the backup1Large property.
         * 
         * @param value
         *     allowed object is
         *     {@link TspServerType }
         *     
         */
        public void setBackup1Large(TspServerType value) {
            this.backup1Large = value;
        }

        /**
         * Gets the value of the backup2Large property.
         * 
         * @return
         *     possible object is
         *     {@link TspServerType }
         *     
         */
        public TspServerType getBackup2Large() {
            return backup2Large;
        }

        /**
         * Sets the value of the backup2Large property.
         * 
         * @param value
         *     allowed object is
         *     {@link TspServerType }
         *     
         */
        public void setBackup2Large(TspServerType value) {
            this.backup2Large = value;
        }

    }

}
