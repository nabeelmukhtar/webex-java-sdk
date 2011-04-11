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
 * The Class OptionsType.
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

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The support app share. */
    @XmlElement(defaultValue = "true")
    protected Boolean supportAppShare;
    
    /** The support app share remote. */
    @XmlElement(defaultValue = "true")
    protected Boolean supportAppShareRemote;
    
    /** The support attendee registration. */
    @XmlElement(defaultValue = "true")
    protected Boolean supportAttendeeRegistration;
    
    /** The support remote web tour. */
    protected Boolean supportRemoteWebTour;
    
    /** The support web tour. */
    protected Boolean supportWebTour;
    
    /** The support file share. */
    protected Boolean supportFileShare;
    
    /** The support chat. */
    @XmlElement(defaultValue = "true")
    protected Boolean supportChat;
    
    /** The support cobrowse site. */
    @XmlElement(defaultValue = "true")
    protected Boolean supportCobrowseSite;
    
    /** The support corporate offices site. */
    @XmlElement(defaultValue = "true")
    protected Boolean supportCorporateOfficesSite;
    
    /** The support desktop share. */
    @XmlElement(defaultValue = "true")
    protected Boolean supportDesktopShare;
    
    /** The support desktop share remote. */
    @XmlElement(defaultValue = "true")
    protected Boolean supportDesktopShareRemote;
    
    /** The support file transfer. */
    @XmlElement(defaultValue = "true")
    protected Boolean supportFileTransfer;
    
    /** The support international call out. */
    @XmlElement(defaultValue = "true")
    protected Boolean supportInternationalCallOut;
    
    /** The support java client. */
    @XmlElement(defaultValue = "true")
    protected Boolean supportJavaClient;
    
    /** The support mac client. */
    @XmlElement(defaultValue = "true")
    protected Boolean supportMacClient;
    
    /** The support meeting center site. */
    @XmlElement(defaultValue = "true")
    protected Boolean supportMeetingCenterSite;
    
    /** The support meeting record. */
    @XmlElement(defaultValue = "true")
    protected Boolean supportMeetingRecord;
    
    /** The support multiple meeting. */
    @XmlElement(defaultValue = "false")
    protected Boolean supportMultipleMeeting;
    
    /** The support on call site. */
    @XmlElement(defaultValue = "true")
    protected Boolean supportOnCallSite;
    
    /** The support on stage site. */
    @XmlElement(defaultValue = "true")
    protected Boolean supportOnStageSite;
    
    /** The support partner offices site. */
    @XmlElement(defaultValue = "true")
    protected Boolean supportPartnerOfficesSite;
    
    /** The support poll. */
    @XmlElement(defaultValue = "true")
    protected Boolean supportPoll;
    
    /** The support presentation. */
    @XmlElement(defaultValue = "true")
    protected Boolean supportPresentation;
    
    /** The support solaris client. */
    @XmlElement(defaultValue = "true")
    protected Boolean supportSolarisClient;
    
    /** The support ssl. */
    @XmlElement(defaultValue = "true")
    protected Boolean supportSSL;
    
    /** The support e2 e. */
    protected Boolean supportE2E;
    
    /** The support pki. */
    protected Boolean supportPKI;
    
    /** The support teleconf call in. */
    @XmlElement(defaultValue = "true")
    protected Boolean supportTeleconfCallIn;
    
    /** The support teleconf call out. */
    @XmlElement(defaultValue = "true")
    protected Boolean supportTeleconfCallOut;
    
    /** The support toll free call in. */
    @XmlElement(defaultValue = "true")
    protected Boolean supportTollFreeCallIn;
    
    /** The support video. */
    @XmlElement(defaultValue = "true")
    protected Boolean supportVideo;
    
    /** The support vo ip. */
    @XmlElement(defaultValue = "true")
    protected Boolean supportVoIP;
    
    /** The support web ex com site. */
    @XmlElement(defaultValue = "true")
    protected Boolean supportWebExComSite;
    
    /** The support windows client. */
    @XmlElement(defaultValue = "true")
    protected Boolean supportWindowsClient;
    
    /** The support quick start attendees. */
    protected Boolean supportQuickStartAttendees;
    
    /** The support quick start host. */
    protected Boolean supportQuickStartHost;

    /**
     * Checks if is support app share.
     * 
     * @return the boolean
     */
    public Boolean isSupportAppShare() {
        return supportAppShare;
    }

    /**
     * Sets the support app share.
     * 
     * @param value the new support app share
     */
    public void setSupportAppShare(Boolean value) {
        this.supportAppShare = value;
    }

    /**
     * Checks if is support app share remote.
     * 
     * @return the boolean
     */
    public Boolean isSupportAppShareRemote() {
        return supportAppShareRemote;
    }

    /**
     * Sets the support app share remote.
     * 
     * @param value the new support app share remote
     */
    public void setSupportAppShareRemote(Boolean value) {
        this.supportAppShareRemote = value;
    }

    /**
     * Checks if is support attendee registration.
     * 
     * @return the boolean
     */
    public Boolean isSupportAttendeeRegistration() {
        return supportAttendeeRegistration;
    }

    /**
     * Sets the support attendee registration.
     * 
     * @param value the new support attendee registration
     */
    public void setSupportAttendeeRegistration(Boolean value) {
        this.supportAttendeeRegistration = value;
    }

    /**
     * Checks if is support remote web tour.
     * 
     * @return the boolean
     */
    public Boolean isSupportRemoteWebTour() {
        return supportRemoteWebTour;
    }

    /**
     * Sets the support remote web tour.
     * 
     * @param value the new support remote web tour
     */
    public void setSupportRemoteWebTour(Boolean value) {
        this.supportRemoteWebTour = value;
    }

    /**
     * Checks if is support web tour.
     * 
     * @return the boolean
     */
    public Boolean isSupportWebTour() {
        return supportWebTour;
    }

    /**
     * Sets the support web tour.
     * 
     * @param value the new support web tour
     */
    public void setSupportWebTour(Boolean value) {
        this.supportWebTour = value;
    }

    /**
     * Checks if is support file share.
     * 
     * @return the boolean
     */
    public Boolean isSupportFileShare() {
        return supportFileShare;
    }

    /**
     * Sets the support file share.
     * 
     * @param value the new support file share
     */
    public void setSupportFileShare(Boolean value) {
        this.supportFileShare = value;
    }

    /**
     * Checks if is support chat.
     * 
     * @return the boolean
     */
    public Boolean isSupportChat() {
        return supportChat;
    }

    /**
     * Sets the support chat.
     * 
     * @param value the new support chat
     */
    public void setSupportChat(Boolean value) {
        this.supportChat = value;
    }

    /**
     * Checks if is support cobrowse site.
     * 
     * @return the boolean
     */
    public Boolean isSupportCobrowseSite() {
        return supportCobrowseSite;
    }

    /**
     * Sets the support cobrowse site.
     * 
     * @param value the new support cobrowse site
     */
    public void setSupportCobrowseSite(Boolean value) {
        this.supportCobrowseSite = value;
    }

    /**
     * Checks if is support corporate offices site.
     * 
     * @return the boolean
     */
    public Boolean isSupportCorporateOfficesSite() {
        return supportCorporateOfficesSite;
    }

    /**
     * Sets the support corporate offices site.
     * 
     * @param value the new support corporate offices site
     */
    public void setSupportCorporateOfficesSite(Boolean value) {
        this.supportCorporateOfficesSite = value;
    }

    /**
     * Checks if is support desktop share.
     * 
     * @return the boolean
     */
    public Boolean isSupportDesktopShare() {
        return supportDesktopShare;
    }

    /**
     * Sets the support desktop share.
     * 
     * @param value the new support desktop share
     */
    public void setSupportDesktopShare(Boolean value) {
        this.supportDesktopShare = value;
    }

    /**
     * Checks if is support desktop share remote.
     * 
     * @return the boolean
     */
    public Boolean isSupportDesktopShareRemote() {
        return supportDesktopShareRemote;
    }

    /**
     * Sets the support desktop share remote.
     * 
     * @param value the new support desktop share remote
     */
    public void setSupportDesktopShareRemote(Boolean value) {
        this.supportDesktopShareRemote = value;
    }

    /**
     * Checks if is support file transfer.
     * 
     * @return the boolean
     */
    public Boolean isSupportFileTransfer() {
        return supportFileTransfer;
    }

    /**
     * Sets the support file transfer.
     * 
     * @param value the new support file transfer
     */
    public void setSupportFileTransfer(Boolean value) {
        this.supportFileTransfer = value;
    }

    /**
     * Checks if is support international call out.
     * 
     * @return the boolean
     */
    public Boolean isSupportInternationalCallOut() {
        return supportInternationalCallOut;
    }

    /**
     * Sets the support international call out.
     * 
     * @param value the new support international call out
     */
    public void setSupportInternationalCallOut(Boolean value) {
        this.supportInternationalCallOut = value;
    }

    /**
     * Checks if is support java client.
     * 
     * @return the boolean
     */
    public Boolean isSupportJavaClient() {
        return supportJavaClient;
    }

    /**
     * Sets the support java client.
     * 
     * @param value the new support java client
     */
    public void setSupportJavaClient(Boolean value) {
        this.supportJavaClient = value;
    }

    /**
     * Checks if is support mac client.
     * 
     * @return the boolean
     */
    public Boolean isSupportMacClient() {
        return supportMacClient;
    }

    /**
     * Sets the support mac client.
     * 
     * @param value the new support mac client
     */
    public void setSupportMacClient(Boolean value) {
        this.supportMacClient = value;
    }

    /**
     * Checks if is support meeting center site.
     * 
     * @return the boolean
     */
    public Boolean isSupportMeetingCenterSite() {
        return supportMeetingCenterSite;
    }

    /**
     * Sets the support meeting center site.
     * 
     * @param value the new support meeting center site
     */
    public void setSupportMeetingCenterSite(Boolean value) {
        this.supportMeetingCenterSite = value;
    }

    /**
     * Checks if is support meeting record.
     * 
     * @return the boolean
     */
    public Boolean isSupportMeetingRecord() {
        return supportMeetingRecord;
    }

    /**
     * Sets the support meeting record.
     * 
     * @param value the new support meeting record
     */
    public void setSupportMeetingRecord(Boolean value) {
        this.supportMeetingRecord = value;
    }

    /**
     * Checks if is support multiple meeting.
     * 
     * @return the boolean
     */
    public Boolean isSupportMultipleMeeting() {
        return supportMultipleMeeting;
    }

    /**
     * Sets the support multiple meeting.
     * 
     * @param value the new support multiple meeting
     */
    public void setSupportMultipleMeeting(Boolean value) {
        this.supportMultipleMeeting = value;
    }

    /**
     * Checks if is support on call site.
     * 
     * @return the boolean
     */
    public Boolean isSupportOnCallSite() {
        return supportOnCallSite;
    }

    /**
     * Sets the support on call site.
     * 
     * @param value the new support on call site
     */
    public void setSupportOnCallSite(Boolean value) {
        this.supportOnCallSite = value;
    }

    /**
     * Checks if is support on stage site.
     * 
     * @return the boolean
     */
    public Boolean isSupportOnStageSite() {
        return supportOnStageSite;
    }

    /**
     * Sets the support on stage site.
     * 
     * @param value the new support on stage site
     */
    public void setSupportOnStageSite(Boolean value) {
        this.supportOnStageSite = value;
    }

    /**
     * Checks if is support partner offices site.
     * 
     * @return the boolean
     */
    public Boolean isSupportPartnerOfficesSite() {
        return supportPartnerOfficesSite;
    }

    /**
     * Sets the support partner offices site.
     * 
     * @param value the new support partner offices site
     */
    public void setSupportPartnerOfficesSite(Boolean value) {
        this.supportPartnerOfficesSite = value;
    }

    /**
     * Checks if is support poll.
     * 
     * @return the boolean
     */
    public Boolean isSupportPoll() {
        return supportPoll;
    }

    /**
     * Sets the support poll.
     * 
     * @param value the new support poll
     */
    public void setSupportPoll(Boolean value) {
        this.supportPoll = value;
    }

    /**
     * Checks if is support presentation.
     * 
     * @return the boolean
     */
    public Boolean isSupportPresentation() {
        return supportPresentation;
    }

    /**
     * Sets the support presentation.
     * 
     * @param value the new support presentation
     */
    public void setSupportPresentation(Boolean value) {
        this.supportPresentation = value;
    }

    /**
     * Checks if is support solaris client.
     * 
     * @return the boolean
     */
    public Boolean isSupportSolarisClient() {
        return supportSolarisClient;
    }

    /**
     * Sets the support solaris client.
     * 
     * @param value the new support solaris client
     */
    public void setSupportSolarisClient(Boolean value) {
        this.supportSolarisClient = value;
    }

    /**
     * Checks if is support ssl.
     * 
     * @return the boolean
     */
    public Boolean isSupportSSL() {
        return supportSSL;
    }

    /**
     * Sets the support ssl.
     * 
     * @param value the new support ssl
     */
    public void setSupportSSL(Boolean value) {
        this.supportSSL = value;
    }

    /**
     * Checks if is support e2 e.
     * 
     * @return the boolean
     */
    public Boolean isSupportE2E() {
        return supportE2E;
    }

    /**
     * Sets the support e2 e.
     * 
     * @param value the new support e2 e
     */
    public void setSupportE2E(Boolean value) {
        this.supportE2E = value;
    }

    /**
     * Checks if is support pki.
     * 
     * @return the boolean
     */
    public Boolean isSupportPKI() {
        return supportPKI;
    }

    /**
     * Sets the support pki.
     * 
     * @param value the new support pki
     */
    public void setSupportPKI(Boolean value) {
        this.supportPKI = value;
    }

    /**
     * Checks if is support teleconf call in.
     * 
     * @return the boolean
     */
    public Boolean isSupportTeleconfCallIn() {
        return supportTeleconfCallIn;
    }

    /**
     * Sets the support teleconf call in.
     * 
     * @param value the new support teleconf call in
     */
    public void setSupportTeleconfCallIn(Boolean value) {
        this.supportTeleconfCallIn = value;
    }

    /**
     * Checks if is support teleconf call out.
     * 
     * @return the boolean
     */
    public Boolean isSupportTeleconfCallOut() {
        return supportTeleconfCallOut;
    }

    /**
     * Sets the support teleconf call out.
     * 
     * @param value the new support teleconf call out
     */
    public void setSupportTeleconfCallOut(Boolean value) {
        this.supportTeleconfCallOut = value;
    }

    /**
     * Checks if is support toll free call in.
     * 
     * @return the boolean
     */
    public Boolean isSupportTollFreeCallIn() {
        return supportTollFreeCallIn;
    }

    /**
     * Sets the support toll free call in.
     * 
     * @param value the new support toll free call in
     */
    public void setSupportTollFreeCallIn(Boolean value) {
        this.supportTollFreeCallIn = value;
    }

    /**
     * Checks if is support video.
     * 
     * @return the boolean
     */
    public Boolean isSupportVideo() {
        return supportVideo;
    }

    /**
     * Sets the support video.
     * 
     * @param value the new support video
     */
    public void setSupportVideo(Boolean value) {
        this.supportVideo = value;
    }

    /**
     * Checks if is support vo ip.
     * 
     * @return the boolean
     */
    public Boolean isSupportVoIP() {
        return supportVoIP;
    }

    /**
     * Sets the support vo ip.
     * 
     * @param value the new support vo ip
     */
    public void setSupportVoIP(Boolean value) {
        this.supportVoIP = value;
    }

    /**
     * Checks if is support web ex com site.
     * 
     * @return the boolean
     */
    public Boolean isSupportWebExComSite() {
        return supportWebExComSite;
    }

    /**
     * Sets the support web ex com site.
     * 
     * @param value the new support web ex com site
     */
    public void setSupportWebExComSite(Boolean value) {
        this.supportWebExComSite = value;
    }

    /**
     * Checks if is support windows client.
     * 
     * @return the boolean
     */
    public Boolean isSupportWindowsClient() {
        return supportWindowsClient;
    }

    /**
     * Sets the support windows client.
     * 
     * @param value the new support windows client
     */
    public void setSupportWindowsClient(Boolean value) {
        this.supportWindowsClient = value;
    }

    /**
     * Checks if is support quick start attendees.
     * 
     * @return the boolean
     */
    public Boolean isSupportQuickStartAttendees() {
        return supportQuickStartAttendees;
    }

    /**
     * Sets the support quick start attendees.
     * 
     * @param value the new support quick start attendees
     */
    public void setSupportQuickStartAttendees(Boolean value) {
        this.supportQuickStartAttendees = value;
    }

    /**
     * Checks if is support quick start host.
     * 
     * @return the boolean
     */
    public Boolean isSupportQuickStartHost() {
        return supportQuickStartHost;
    }

    /**
     * Sets the support quick start host.
     * 
     * @param value the new support quick start host
     */
    public void setSupportQuickStartHost(Boolean value) {
        this.supportQuickStartHost = value;
    }

}
