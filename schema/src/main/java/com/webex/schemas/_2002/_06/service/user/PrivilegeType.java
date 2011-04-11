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

package com.webex.schemas._2002._06.service.user;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class PrivilegeType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "privilegeType", propOrder = {
    "host",
    "teleConfCallOut",
    "teleConfCallOutInternational",
    "teleConfCallIn",
    "teleConfTollFreeCallIn",
    "siteAdmin",
    "voiceOverIp",
    "roSiteAdmin",
    "labAdmin",
    "otherTelephony",
    "teleConfCallInInternational",
    "attendeeOnly",
    "recordingEditor",
    "meetingAssist"
})
public class PrivilegeType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The host. */
    protected Boolean host;
    
    /** The tele conf call out. */
    protected Boolean teleConfCallOut;
    
    /** The tele conf call out international. */
    protected Boolean teleConfCallOutInternational;
    
    /** The tele conf call in. */
    protected Boolean teleConfCallIn;
    
    /** The tele conf toll free call in. */
    protected Boolean teleConfTollFreeCallIn;
    
    /** The site admin. */
    protected Boolean siteAdmin;
    
    /** The voice over ip. */
    protected Boolean voiceOverIp;
    
    /** The ro site admin. */
    protected Boolean roSiteAdmin;
    
    /** The lab admin. */
    protected Boolean labAdmin;
    
    /** The other telephony. */
    @XmlElement(defaultValue = "true")
    protected Boolean otherTelephony;
    
    /** The tele conf call in international. */
    protected Boolean teleConfCallInInternational;
    
    /** The attendee only. */
    protected Boolean attendeeOnly;
    
    /** The recording editor. */
    protected Boolean recordingEditor;
    
    /** The meeting assist. */
    protected Boolean meetingAssist;

    /**
     * Checks if is host.
     * 
     * @return the boolean
     */
    public Boolean isHost() {
        return host;
    }

    /**
     * Sets the host.
     * 
     * @param value the new host
     */
    public void setHost(Boolean value) {
        this.host = value;
    }

    /**
     * Checks if is tele conf call out.
     * 
     * @return the boolean
     */
    public Boolean isTeleConfCallOut() {
        return teleConfCallOut;
    }

    /**
     * Sets the tele conf call out.
     * 
     * @param value the new tele conf call out
     */
    public void setTeleConfCallOut(Boolean value) {
        this.teleConfCallOut = value;
    }

    /**
     * Checks if is tele conf call out international.
     * 
     * @return the boolean
     */
    public Boolean isTeleConfCallOutInternational() {
        return teleConfCallOutInternational;
    }

    /**
     * Sets the tele conf call out international.
     * 
     * @param value the new tele conf call out international
     */
    public void setTeleConfCallOutInternational(Boolean value) {
        this.teleConfCallOutInternational = value;
    }

    /**
     * Checks if is tele conf call in.
     * 
     * @return the boolean
     */
    public Boolean isTeleConfCallIn() {
        return teleConfCallIn;
    }

    /**
     * Sets the tele conf call in.
     * 
     * @param value the new tele conf call in
     */
    public void setTeleConfCallIn(Boolean value) {
        this.teleConfCallIn = value;
    }

    /**
     * Checks if is tele conf toll free call in.
     * 
     * @return the boolean
     */
    public Boolean isTeleConfTollFreeCallIn() {
        return teleConfTollFreeCallIn;
    }

    /**
     * Sets the tele conf toll free call in.
     * 
     * @param value the new tele conf toll free call in
     */
    public void setTeleConfTollFreeCallIn(Boolean value) {
        this.teleConfTollFreeCallIn = value;
    }

    /**
     * Checks if is site admin.
     * 
     * @return the boolean
     */
    public Boolean isSiteAdmin() {
        return siteAdmin;
    }

    /**
     * Sets the site admin.
     * 
     * @param value the new site admin
     */
    public void setSiteAdmin(Boolean value) {
        this.siteAdmin = value;
    }

    /**
     * Checks if is voice over ip.
     * 
     * @return the boolean
     */
    public Boolean isVoiceOverIp() {
        return voiceOverIp;
    }

    /**
     * Sets the voice over ip.
     * 
     * @param value the new voice over ip
     */
    public void setVoiceOverIp(Boolean value) {
        this.voiceOverIp = value;
    }

    /**
     * Checks if is ro site admin.
     * 
     * @return the boolean
     */
    public Boolean isRoSiteAdmin() {
        return roSiteAdmin;
    }

    /**
     * Sets the ro site admin.
     * 
     * @param value the new ro site admin
     */
    public void setRoSiteAdmin(Boolean value) {
        this.roSiteAdmin = value;
    }

    /**
     * Checks if is lab admin.
     * 
     * @return the boolean
     */
    public Boolean isLabAdmin() {
        return labAdmin;
    }

    /**
     * Sets the lab admin.
     * 
     * @param value the new lab admin
     */
    public void setLabAdmin(Boolean value) {
        this.labAdmin = value;
    }

    /**
     * Checks if is other telephony.
     * 
     * @return the boolean
     */
    public Boolean isOtherTelephony() {
        return otherTelephony;
    }

    /**
     * Sets the other telephony.
     * 
     * @param value the new other telephony
     */
    public void setOtherTelephony(Boolean value) {
        this.otherTelephony = value;
    }

    /**
     * Checks if is tele conf call in international.
     * 
     * @return the boolean
     */
    public Boolean isTeleConfCallInInternational() {
        return teleConfCallInInternational;
    }

    /**
     * Sets the tele conf call in international.
     * 
     * @param value the new tele conf call in international
     */
    public void setTeleConfCallInInternational(Boolean value) {
        this.teleConfCallInInternational = value;
    }

    /**
     * Checks if is attendee only.
     * 
     * @return the boolean
     */
    public Boolean isAttendeeOnly() {
        return attendeeOnly;
    }

    /**
     * Sets the attendee only.
     * 
     * @param value the new attendee only
     */
    public void setAttendeeOnly(Boolean value) {
        this.attendeeOnly = value;
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

}
