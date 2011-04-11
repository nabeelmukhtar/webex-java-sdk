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
 * The Class ToolsType.
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

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The business directory. */
    protected Boolean businessDirectory;
    
    /** The office calendar. */
    protected Boolean officeCalendar;
    
    /** The meeting calendar. */
    protected Boolean meetingCalendar;
    
    /** The display on call assist link. */
    protected Boolean displayOnCallAssistLink;
    
    /** The display profile link. */
    @XmlElement(defaultValue = "false")
    protected Boolean displayProfileLink;
    
    /** The recording and playback. */
    protected Boolean recordingAndPlayback;
    
    /** The recording editor. */
    protected Boolean recordingEditor;
    
    /** The publish recordings. */
    protected Boolean publishRecordings;
    
    /** The instant meeting. */
    protected Boolean instantMeeting;
    
    /** The emails. */
    protected Boolean emails;
    
    /** The outlook integration. */
    protected Boolean outlookIntegration;
    
    /** The wireless access. */
    protected Boolean wirelessAccess;
    
    /** The allow public access. */
    protected Boolean allowPublicAccess;
    
    /** The ssl. */
    protected Boolean ssl;
    
    /** The e2 e. */
    @XmlElement(name = "e2e")
    protected Boolean e2E;
    
    /** The hands on lab. */
    protected Boolean handsOnLab;
    
    /** The hol max labs. */
    protected Long holMaxLabs;
    
    /** The hol max computers. */
    protected Long holMaxComputers;
    
    /** The user lock down. */
    protected Boolean userLockDown;
    
    /** The meeting assist. */
    protected Boolean meetingAssist;
    
    /** The sms. */
    protected Boolean sms;
    
    /** The encryption. */
    protected String encryption;
    
    /** The internal meeting. */
    protected Boolean internalMeeting;

    /**
     * Checks if is business directory.
     * 
     * @return the boolean
     */
    public Boolean isBusinessDirectory() {
        return businessDirectory;
    }

    /**
     * Sets the business directory.
     * 
     * @param value the new business directory
     */
    public void setBusinessDirectory(Boolean value) {
        this.businessDirectory = value;
    }

    /**
     * Checks if is office calendar.
     * 
     * @return the boolean
     */
    public Boolean isOfficeCalendar() {
        return officeCalendar;
    }

    /**
     * Sets the office calendar.
     * 
     * @param value the new office calendar
     */
    public void setOfficeCalendar(Boolean value) {
        this.officeCalendar = value;
    }

    /**
     * Checks if is meeting calendar.
     * 
     * @return the boolean
     */
    public Boolean isMeetingCalendar() {
        return meetingCalendar;
    }

    /**
     * Sets the meeting calendar.
     * 
     * @param value the new meeting calendar
     */
    public void setMeetingCalendar(Boolean value) {
        this.meetingCalendar = value;
    }

    /**
     * Checks if is display on call assist link.
     * 
     * @return the boolean
     */
    public Boolean isDisplayOnCallAssistLink() {
        return displayOnCallAssistLink;
    }

    /**
     * Sets the display on call assist link.
     * 
     * @param value the new display on call assist link
     */
    public void setDisplayOnCallAssistLink(Boolean value) {
        this.displayOnCallAssistLink = value;
    }

    /**
     * Checks if is display profile link.
     * 
     * @return the boolean
     */
    public Boolean isDisplayProfileLink() {
        return displayProfileLink;
    }

    /**
     * Sets the display profile link.
     * 
     * @param value the new display profile link
     */
    public void setDisplayProfileLink(Boolean value) {
        this.displayProfileLink = value;
    }

    /**
     * Checks if is recording and playback.
     * 
     * @return the boolean
     */
    public Boolean isRecordingAndPlayback() {
        return recordingAndPlayback;
    }

    /**
     * Sets the recording and playback.
     * 
     * @param value the new recording and playback
     */
    public void setRecordingAndPlayback(Boolean value) {
        this.recordingAndPlayback = value;
    }

    /**
     * Checks if is recording editor.
     * 
     * @return the boolean
     */
    public Boolean isRecordingEditor() {
        return recordingEditor;
    }

    /**
     * Sets the recording editor.
     * 
     * @param value the new recording editor
     */
    public void setRecordingEditor(Boolean value) {
        this.recordingEditor = value;
    }

    /**
     * Checks if is publish recordings.
     * 
     * @return the boolean
     */
    public Boolean isPublishRecordings() {
        return publishRecordings;
    }

    /**
     * Sets the publish recordings.
     * 
     * @param value the new publish recordings
     */
    public void setPublishRecordings(Boolean value) {
        this.publishRecordings = value;
    }

    /**
     * Checks if is instant meeting.
     * 
     * @return the boolean
     */
    public Boolean isInstantMeeting() {
        return instantMeeting;
    }

    /**
     * Sets the instant meeting.
     * 
     * @param value the new instant meeting
     */
    public void setInstantMeeting(Boolean value) {
        this.instantMeeting = value;
    }

    /**
     * Checks if is emails.
     * 
     * @return the boolean
     */
    public Boolean isEmails() {
        return emails;
    }

    /**
     * Sets the emails.
     * 
     * @param value the new emails
     */
    public void setEmails(Boolean value) {
        this.emails = value;
    }

    /**
     * Checks if is outlook integration.
     * 
     * @return the boolean
     */
    public Boolean isOutlookIntegration() {
        return outlookIntegration;
    }

    /**
     * Sets the outlook integration.
     * 
     * @param value the new outlook integration
     */
    public void setOutlookIntegration(Boolean value) {
        this.outlookIntegration = value;
    }

    /**
     * Checks if is wireless access.
     * 
     * @return the boolean
     */
    public Boolean isWirelessAccess() {
        return wirelessAccess;
    }

    /**
     * Sets the wireless access.
     * 
     * @param value the new wireless access
     */
    public void setWirelessAccess(Boolean value) {
        this.wirelessAccess = value;
    }

    /**
     * Checks if is allow public access.
     * 
     * @return the boolean
     */
    public Boolean isAllowPublicAccess() {
        return allowPublicAccess;
    }

    /**
     * Sets the allow public access.
     * 
     * @param value the new allow public access
     */
    public void setAllowPublicAccess(Boolean value) {
        this.allowPublicAccess = value;
    }

    /**
     * Checks if is ssl.
     * 
     * @return the boolean
     */
    public Boolean isSsl() {
        return ssl;
    }

    /**
     * Sets the ssl.
     * 
     * @param value the new ssl
     */
    public void setSsl(Boolean value) {
        this.ssl = value;
    }

    /**
     * Checks if is e2 e.
     * 
     * @return the boolean
     */
    public Boolean isE2E() {
        return e2E;
    }

    /**
     * Sets the e2 e.
     * 
     * @param value the new e2 e
     */
    public void setE2E(Boolean value) {
        this.e2E = value;
    }

    /**
     * Checks if is hands on lab.
     * 
     * @return the boolean
     */
    public Boolean isHandsOnLab() {
        return handsOnLab;
    }

    /**
     * Sets the hands on lab.
     * 
     * @param value the new hands on lab
     */
    public void setHandsOnLab(Boolean value) {
        this.handsOnLab = value;
    }

    /**
     * Gets the hol max labs.
     * 
     * @return the hol max labs
     */
    public Long getHolMaxLabs() {
        return holMaxLabs;
    }

    /**
     * Sets the hol max labs.
     * 
     * @param value the new hol max labs
     */
    public void setHolMaxLabs(Long value) {
        this.holMaxLabs = value;
    }

    /**
     * Gets the hol max computers.
     * 
     * @return the hol max computers
     */
    public Long getHolMaxComputers() {
        return holMaxComputers;
    }

    /**
     * Sets the hol max computers.
     * 
     * @param value the new hol max computers
     */
    public void setHolMaxComputers(Long value) {
        this.holMaxComputers = value;
    }

    /**
     * Checks if is user lock down.
     * 
     * @return the boolean
     */
    public Boolean isUserLockDown() {
        return userLockDown;
    }

    /**
     * Sets the user lock down.
     * 
     * @param value the new user lock down
     */
    public void setUserLockDown(Boolean value) {
        this.userLockDown = value;
    }

    /**
     * Checks if is meeting assist.
     * 
     * @return the boolean
     */
    public Boolean isMeetingAssist() {
        return meetingAssist;
    }

    /**
     * Sets the meeting assist.
     * 
     * @param value the new meeting assist
     */
    public void setMeetingAssist(Boolean value) {
        this.meetingAssist = value;
    }

    /**
     * Checks if is sms.
     * 
     * @return the boolean
     */
    public Boolean isSms() {
        return sms;
    }

    /**
     * Sets the sms.
     * 
     * @param value the new sms
     */
    public void setSms(Boolean value) {
        this.sms = value;
    }

    /**
     * Gets the encryption.
     * 
     * @return the encryption
     */
    public String getEncryption() {
        return encryption;
    }

    /**
     * Sets the encryption.
     * 
     * @param value the new encryption
     */
    public void setEncryption(String value) {
        this.encryption = value;
    }

    /**
     * Checks if is internal meeting.
     * 
     * @return the boolean
     */
    public Boolean isInternalMeeting() {
        return internalMeeting;
    }

    /**
     * Sets the internal meeting.
     * 
     * @param value the new internal meeting
     */
    public void setInternalMeeting(Boolean value) {
        this.internalMeeting = value;
    }

}
