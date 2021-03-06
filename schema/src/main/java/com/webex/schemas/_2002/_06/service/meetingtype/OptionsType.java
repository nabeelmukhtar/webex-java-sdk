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

package com.webex.schemas._2002._06.service.meetingtype;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for optionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="optionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="supportAppShare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportAppShareRemote" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportAttendeeRegistration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportRemoteWebTour" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportWebTour" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportFileShare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportChat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportCobrowseSite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportCorporateOfficesSite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportDesktopShare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportDesktopShareRemote" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportFileTransfer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportInternationalCallOut" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportJavaClient" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportMacClient" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportMeetingCenterSite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportMeetingRecord" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportMultipleMeeting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportOnCallSite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportOnStageSite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportPartnerOfficesSite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportPoll" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportPresentation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportSolarisClient" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportSSL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportE2E" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportPKI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportTeleconfCallIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportTeleconfCallOut" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportTollFreeCallIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportVideo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportVoIP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportWebExComSite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportWindowsClient" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportQuickStartAttendees" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportQuickStartHost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "optionsType", propOrder = {
    "supportAppShare",
    "supportAppShareRemote",
    "supportAttendeeRegistration",
    "supportRemoteWebTour",
    "supportWebTour",
    "supportFileShare",
    "supportChat",
    "supportCobrowseSite",
    "supportCorporateOfficesSite",
    "supportDesktopShare",
    "supportDesktopShareRemote",
    "supportFileTransfer",
    "supportInternationalCallOut",
    "supportJavaClient",
    "supportMacClient",
    "supportMeetingCenterSite",
    "supportMeetingRecord",
    "supportMultipleMeeting",
    "supportOnCallSite",
    "supportOnStageSite",
    "supportPartnerOfficesSite",
    "supportPoll",
    "supportPresentation",
    "supportSolarisClient",
    "supportSSL",
    "supportE2E",
    "supportPKI",
    "supportTeleconfCallIn",
    "supportTeleconfCallOut",
    "supportTollFreeCallIn",
    "supportVideo",
    "supportVoIP",
    "supportWebExComSite",
    "supportWindowsClient",
    "supportQuickStartAttendees",
    "supportQuickStartHost"
})
public class OptionsType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(defaultValue = "true")
    protected Boolean supportAppShare;
    @XmlElement(defaultValue = "true")
    protected Boolean supportAppShareRemote;
    @XmlElement(defaultValue = "true")
    protected Boolean supportAttendeeRegistration;
    protected Boolean supportRemoteWebTour;
    protected Boolean supportWebTour;
    protected Boolean supportFileShare;
    @XmlElement(defaultValue = "true")
    protected Boolean supportChat;
    @XmlElement(defaultValue = "true")
    protected Boolean supportCobrowseSite;
    @XmlElement(defaultValue = "true")
    protected Boolean supportCorporateOfficesSite;
    @XmlElement(defaultValue = "true")
    protected Boolean supportDesktopShare;
    @XmlElement(defaultValue = "true")
    protected Boolean supportDesktopShareRemote;
    @XmlElement(defaultValue = "true")
    protected Boolean supportFileTransfer;
    @XmlElement(defaultValue = "true")
    protected Boolean supportInternationalCallOut;
    @XmlElement(defaultValue = "true")
    protected Boolean supportJavaClient;
    @XmlElement(defaultValue = "true")
    protected Boolean supportMacClient;
    @XmlElement(defaultValue = "true")
    protected Boolean supportMeetingCenterSite;
    @XmlElement(defaultValue = "true")
    protected Boolean supportMeetingRecord;
    @XmlElement(defaultValue = "false")
    protected Boolean supportMultipleMeeting;
    @XmlElement(defaultValue = "true")
    protected Boolean supportOnCallSite;
    @XmlElement(defaultValue = "true")
    protected Boolean supportOnStageSite;
    @XmlElement(defaultValue = "true")
    protected Boolean supportPartnerOfficesSite;
    @XmlElement(defaultValue = "true")
    protected Boolean supportPoll;
    @XmlElement(defaultValue = "true")
    protected Boolean supportPresentation;
    @XmlElement(defaultValue = "true")
    protected Boolean supportSolarisClient;
    @XmlElement(defaultValue = "true")
    protected Boolean supportSSL;
    protected Boolean supportE2E;
    protected Boolean supportPKI;
    @XmlElement(defaultValue = "true")
    protected Boolean supportTeleconfCallIn;
    @XmlElement(defaultValue = "true")
    protected Boolean supportTeleconfCallOut;
    @XmlElement(defaultValue = "true")
    protected Boolean supportTollFreeCallIn;
    @XmlElement(defaultValue = "true")
    protected Boolean supportVideo;
    @XmlElement(defaultValue = "true")
    protected Boolean supportVoIP;
    @XmlElement(defaultValue = "true")
    protected Boolean supportWebExComSite;
    @XmlElement(defaultValue = "true")
    protected Boolean supportWindowsClient;
    protected Boolean supportQuickStartAttendees;
    protected Boolean supportQuickStartHost;

    /**
     * Gets the value of the supportAppShare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportAppShare() {
        return supportAppShare;
    }

    /**
     * Sets the value of the supportAppShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportAppShare(Boolean value) {
        this.supportAppShare = value;
    }

    /**
     * Gets the value of the supportAppShareRemote property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportAppShareRemote() {
        return supportAppShareRemote;
    }

    /**
     * Sets the value of the supportAppShareRemote property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportAppShareRemote(Boolean value) {
        this.supportAppShareRemote = value;
    }

    /**
     * Gets the value of the supportAttendeeRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportAttendeeRegistration() {
        return supportAttendeeRegistration;
    }

    /**
     * Sets the value of the supportAttendeeRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportAttendeeRegistration(Boolean value) {
        this.supportAttendeeRegistration = value;
    }

    /**
     * Gets the value of the supportRemoteWebTour property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportRemoteWebTour() {
        return supportRemoteWebTour;
    }

    /**
     * Sets the value of the supportRemoteWebTour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportRemoteWebTour(Boolean value) {
        this.supportRemoteWebTour = value;
    }

    /**
     * Gets the value of the supportWebTour property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportWebTour() {
        return supportWebTour;
    }

    /**
     * Sets the value of the supportWebTour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportWebTour(Boolean value) {
        this.supportWebTour = value;
    }

    /**
     * Gets the value of the supportFileShare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportFileShare() {
        return supportFileShare;
    }

    /**
     * Sets the value of the supportFileShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportFileShare(Boolean value) {
        this.supportFileShare = value;
    }

    /**
     * Gets the value of the supportChat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportChat() {
        return supportChat;
    }

    /**
     * Sets the value of the supportChat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportChat(Boolean value) {
        this.supportChat = value;
    }

    /**
     * Gets the value of the supportCobrowseSite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportCobrowseSite() {
        return supportCobrowseSite;
    }

    /**
     * Sets the value of the supportCobrowseSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportCobrowseSite(Boolean value) {
        this.supportCobrowseSite = value;
    }

    /**
     * Gets the value of the supportCorporateOfficesSite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportCorporateOfficesSite() {
        return supportCorporateOfficesSite;
    }

    /**
     * Sets the value of the supportCorporateOfficesSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportCorporateOfficesSite(Boolean value) {
        this.supportCorporateOfficesSite = value;
    }

    /**
     * Gets the value of the supportDesktopShare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportDesktopShare() {
        return supportDesktopShare;
    }

    /**
     * Sets the value of the supportDesktopShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportDesktopShare(Boolean value) {
        this.supportDesktopShare = value;
    }

    /**
     * Gets the value of the supportDesktopShareRemote property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportDesktopShareRemote() {
        return supportDesktopShareRemote;
    }

    /**
     * Sets the value of the supportDesktopShareRemote property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportDesktopShareRemote(Boolean value) {
        this.supportDesktopShareRemote = value;
    }

    /**
     * Gets the value of the supportFileTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportFileTransfer() {
        return supportFileTransfer;
    }

    /**
     * Sets the value of the supportFileTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportFileTransfer(Boolean value) {
        this.supportFileTransfer = value;
    }

    /**
     * Gets the value of the supportInternationalCallOut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportInternationalCallOut() {
        return supportInternationalCallOut;
    }

    /**
     * Sets the value of the supportInternationalCallOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportInternationalCallOut(Boolean value) {
        this.supportInternationalCallOut = value;
    }

    /**
     * Gets the value of the supportJavaClient property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportJavaClient() {
        return supportJavaClient;
    }

    /**
     * Sets the value of the supportJavaClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportJavaClient(Boolean value) {
        this.supportJavaClient = value;
    }

    /**
     * Gets the value of the supportMacClient property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportMacClient() {
        return supportMacClient;
    }

    /**
     * Sets the value of the supportMacClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportMacClient(Boolean value) {
        this.supportMacClient = value;
    }

    /**
     * Gets the value of the supportMeetingCenterSite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportMeetingCenterSite() {
        return supportMeetingCenterSite;
    }

    /**
     * Sets the value of the supportMeetingCenterSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportMeetingCenterSite(Boolean value) {
        this.supportMeetingCenterSite = value;
    }

    /**
     * Gets the value of the supportMeetingRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportMeetingRecord() {
        return supportMeetingRecord;
    }

    /**
     * Sets the value of the supportMeetingRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportMeetingRecord(Boolean value) {
        this.supportMeetingRecord = value;
    }

    /**
     * Gets the value of the supportMultipleMeeting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportMultipleMeeting() {
        return supportMultipleMeeting;
    }

    /**
     * Sets the value of the supportMultipleMeeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportMultipleMeeting(Boolean value) {
        this.supportMultipleMeeting = value;
    }

    /**
     * Gets the value of the supportOnCallSite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportOnCallSite() {
        return supportOnCallSite;
    }

    /**
     * Sets the value of the supportOnCallSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportOnCallSite(Boolean value) {
        this.supportOnCallSite = value;
    }

    /**
     * Gets the value of the supportOnStageSite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportOnStageSite() {
        return supportOnStageSite;
    }

    /**
     * Sets the value of the supportOnStageSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportOnStageSite(Boolean value) {
        this.supportOnStageSite = value;
    }

    /**
     * Gets the value of the supportPartnerOfficesSite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportPartnerOfficesSite() {
        return supportPartnerOfficesSite;
    }

    /**
     * Sets the value of the supportPartnerOfficesSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportPartnerOfficesSite(Boolean value) {
        this.supportPartnerOfficesSite = value;
    }

    /**
     * Gets the value of the supportPoll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportPoll() {
        return supportPoll;
    }

    /**
     * Sets the value of the supportPoll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportPoll(Boolean value) {
        this.supportPoll = value;
    }

    /**
     * Gets the value of the supportPresentation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportPresentation() {
        return supportPresentation;
    }

    /**
     * Sets the value of the supportPresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportPresentation(Boolean value) {
        this.supportPresentation = value;
    }

    /**
     * Gets the value of the supportSolarisClient property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportSolarisClient() {
        return supportSolarisClient;
    }

    /**
     * Sets the value of the supportSolarisClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportSolarisClient(Boolean value) {
        this.supportSolarisClient = value;
    }

    /**
     * Gets the value of the supportSSL property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportSSL() {
        return supportSSL;
    }

    /**
     * Sets the value of the supportSSL property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportSSL(Boolean value) {
        this.supportSSL = value;
    }

    /**
     * Gets the value of the supportE2E property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportE2E() {
        return supportE2E;
    }

    /**
     * Sets the value of the supportE2E property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportE2E(Boolean value) {
        this.supportE2E = value;
    }

    /**
     * Gets the value of the supportPKI property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportPKI() {
        return supportPKI;
    }

    /**
     * Sets the value of the supportPKI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportPKI(Boolean value) {
        this.supportPKI = value;
    }

    /**
     * Gets the value of the supportTeleconfCallIn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportTeleconfCallIn() {
        return supportTeleconfCallIn;
    }

    /**
     * Sets the value of the supportTeleconfCallIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportTeleconfCallIn(Boolean value) {
        this.supportTeleconfCallIn = value;
    }

    /**
     * Gets the value of the supportTeleconfCallOut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportTeleconfCallOut() {
        return supportTeleconfCallOut;
    }

    /**
     * Sets the value of the supportTeleconfCallOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportTeleconfCallOut(Boolean value) {
        this.supportTeleconfCallOut = value;
    }

    /**
     * Gets the value of the supportTollFreeCallIn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportTollFreeCallIn() {
        return supportTollFreeCallIn;
    }

    /**
     * Sets the value of the supportTollFreeCallIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportTollFreeCallIn(Boolean value) {
        this.supportTollFreeCallIn = value;
    }

    /**
     * Gets the value of the supportVideo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportVideo() {
        return supportVideo;
    }

    /**
     * Sets the value of the supportVideo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportVideo(Boolean value) {
        this.supportVideo = value;
    }

    /**
     * Gets the value of the supportVoIP property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportVoIP() {
        return supportVoIP;
    }

    /**
     * Sets the value of the supportVoIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportVoIP(Boolean value) {
        this.supportVoIP = value;
    }

    /**
     * Gets the value of the supportWebExComSite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportWebExComSite() {
        return supportWebExComSite;
    }

    /**
     * Sets the value of the supportWebExComSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportWebExComSite(Boolean value) {
        this.supportWebExComSite = value;
    }

    /**
     * Gets the value of the supportWindowsClient property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportWindowsClient() {
        return supportWindowsClient;
    }

    /**
     * Sets the value of the supportWindowsClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportWindowsClient(Boolean value) {
        this.supportWindowsClient = value;
    }

    /**
     * Gets the value of the supportQuickStartAttendees property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportQuickStartAttendees() {
        return supportQuickStartAttendees;
    }

    /**
     * Sets the value of the supportQuickStartAttendees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportQuickStartAttendees(Boolean value) {
        this.supportQuickStartAttendees = value;
    }

    /**
     * Gets the value of the supportQuickStartHost property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportQuickStartHost() {
        return supportQuickStartHost;
    }

    /**
     * Sets the value of the supportQuickStartHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportQuickStartHost(Boolean value) {
        this.supportQuickStartHost = value;
    }

}
