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


/**
 * <p>Java class for toolsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="toolsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="businessDirectory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="officeCalendar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="meetingCalendar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="displayOnCallAssistLink" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="displayProfileLink" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="recordingAndPlayback" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="recordingEditor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="publishRecordings" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="instantMeeting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="emails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="outlookIntegration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="wirelessAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowPublicAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ssl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="e2e" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="handsOnLab" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="holMaxLabs" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="holMaxComputers" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="userLockDown" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="meetingAssist" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sms" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="encryption" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="NONE"/>
 *               &lt;enumeration value="E2E"/>
 *               &lt;enumeration value="PKI"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="internalMeeting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "toolsType", propOrder = {
    "businessDirectory",
    "officeCalendar",
    "meetingCalendar",
    "displayOnCallAssistLink",
    "displayProfileLink",
    "recordingAndPlayback",
    "recordingEditor",
    "publishRecordings",
    "instantMeeting",
    "emails",
    "outlookIntegration",
    "wirelessAccess",
    "allowPublicAccess",
    "ssl",
    "e2E",
    "handsOnLab",
    "holMaxLabs",
    "holMaxComputers",
    "userLockDown",
    "meetingAssist",
    "sms",
    "encryption",
    "internalMeeting"
})
public class ToolsType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected Boolean businessDirectory;
    protected Boolean officeCalendar;
    protected Boolean meetingCalendar;
    protected Boolean displayOnCallAssistLink;
    @XmlElement(defaultValue = "false")
    protected Boolean displayProfileLink;
    protected Boolean recordingAndPlayback;
    protected Boolean recordingEditor;
    protected Boolean publishRecordings;
    protected Boolean instantMeeting;
    protected Boolean emails;
    protected Boolean outlookIntegration;
    protected Boolean wirelessAccess;
    protected Boolean allowPublicAccess;
    protected Boolean ssl;
    @XmlElement(name = "e2e")
    protected Boolean e2E;
    protected Boolean handsOnLab;
    protected Long holMaxLabs;
    protected Long holMaxComputers;
    protected Boolean userLockDown;
    protected Boolean meetingAssist;
    protected Boolean sms;
    protected String encryption;
    protected Boolean internalMeeting;

    /**
     * Gets the value of the businessDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBusinessDirectory() {
        return businessDirectory;
    }

    /**
     * Sets the value of the businessDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBusinessDirectory(Boolean value) {
        this.businessDirectory = value;
    }

    /**
     * Gets the value of the officeCalendar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfficeCalendar() {
        return officeCalendar;
    }

    /**
     * Sets the value of the officeCalendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfficeCalendar(Boolean value) {
        this.officeCalendar = value;
    }

    /**
     * Gets the value of the meetingCalendar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMeetingCalendar() {
        return meetingCalendar;
    }

    /**
     * Sets the value of the meetingCalendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMeetingCalendar(Boolean value) {
        this.meetingCalendar = value;
    }

    /**
     * Gets the value of the displayOnCallAssistLink property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayOnCallAssistLink() {
        return displayOnCallAssistLink;
    }

    /**
     * Sets the value of the displayOnCallAssistLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayOnCallAssistLink(Boolean value) {
        this.displayOnCallAssistLink = value;
    }

    /**
     * Gets the value of the displayProfileLink property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayProfileLink() {
        return displayProfileLink;
    }

    /**
     * Sets the value of the displayProfileLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayProfileLink(Boolean value) {
        this.displayProfileLink = value;
    }

    /**
     * Gets the value of the recordingAndPlayback property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecordingAndPlayback() {
        return recordingAndPlayback;
    }

    /**
     * Sets the value of the recordingAndPlayback property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecordingAndPlayback(Boolean value) {
        this.recordingAndPlayback = value;
    }

    /**
     * Gets the value of the recordingEditor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecordingEditor() {
        return recordingEditor;
    }

    /**
     * Sets the value of the recordingEditor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecordingEditor(Boolean value) {
        this.recordingEditor = value;
    }

    /**
     * Gets the value of the publishRecordings property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPublishRecordings() {
        return publishRecordings;
    }

    /**
     * Sets the value of the publishRecordings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPublishRecordings(Boolean value) {
        this.publishRecordings = value;
    }

    /**
     * Gets the value of the instantMeeting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstantMeeting() {
        return instantMeeting;
    }

    /**
     * Sets the value of the instantMeeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstantMeeting(Boolean value) {
        this.instantMeeting = value;
    }

    /**
     * Gets the value of the emails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmails() {
        return emails;
    }

    /**
     * Sets the value of the emails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmails(Boolean value) {
        this.emails = value;
    }

    /**
     * Gets the value of the outlookIntegration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutlookIntegration() {
        return outlookIntegration;
    }

    /**
     * Sets the value of the outlookIntegration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutlookIntegration(Boolean value) {
        this.outlookIntegration = value;
    }

    /**
     * Gets the value of the wirelessAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWirelessAccess() {
        return wirelessAccess;
    }

    /**
     * Sets the value of the wirelessAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWirelessAccess(Boolean value) {
        this.wirelessAccess = value;
    }

    /**
     * Gets the value of the allowPublicAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowPublicAccess() {
        return allowPublicAccess;
    }

    /**
     * Sets the value of the allowPublicAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowPublicAccess(Boolean value) {
        this.allowPublicAccess = value;
    }

    /**
     * Gets the value of the ssl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSsl() {
        return ssl;
    }

    /**
     * Sets the value of the ssl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSsl(Boolean value) {
        this.ssl = value;
    }

    /**
     * Gets the value of the e2E property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isE2E() {
        return e2E;
    }

    /**
     * Sets the value of the e2E property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setE2E(Boolean value) {
        this.e2E = value;
    }

    /**
     * Gets the value of the handsOnLab property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHandsOnLab() {
        return handsOnLab;
    }

    /**
     * Sets the value of the handsOnLab property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHandsOnLab(Boolean value) {
        this.handsOnLab = value;
    }

    /**
     * Gets the value of the holMaxLabs property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHolMaxLabs() {
        return holMaxLabs;
    }

    /**
     * Sets the value of the holMaxLabs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHolMaxLabs(Long value) {
        this.holMaxLabs = value;
    }

    /**
     * Gets the value of the holMaxComputers property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHolMaxComputers() {
        return holMaxComputers;
    }

    /**
     * Sets the value of the holMaxComputers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHolMaxComputers(Long value) {
        this.holMaxComputers = value;
    }

    /**
     * Gets the value of the userLockDown property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserLockDown() {
        return userLockDown;
    }

    /**
     * Sets the value of the userLockDown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserLockDown(Boolean value) {
        this.userLockDown = value;
    }

    /**
     * Gets the value of the meetingAssist property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMeetingAssist() {
        return meetingAssist;
    }

    /**
     * Sets the value of the meetingAssist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMeetingAssist(Boolean value) {
        this.meetingAssist = value;
    }

    /**
     * Gets the value of the sms property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSms() {
        return sms;
    }

    /**
     * Sets the value of the sms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSms(Boolean value) {
        this.sms = value;
    }

    /**
     * Gets the value of the encryption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryption() {
        return encryption;
    }

    /**
     * Sets the value of the encryption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryption(String value) {
        this.encryption = value;
    }

    /**
     * Gets the value of the internalMeeting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInternalMeeting() {
        return internalMeeting;
    }

    /**
     * Sets the value of the internalMeeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInternalMeeting(Boolean value) {
        this.internalMeeting = value;
    }

}
