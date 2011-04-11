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
import javax.xml.bind.annotation.XmlType;


/**
 * The Class MywebexType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mywebexType", propOrder = {
    "isMyWebExPro",
    "myContact",
    "myProfile",
    "myMeetings",
    "myFolders",
    "trainingRecordings",
    "recordedEvents",
    "totalStorageSize",
    "myReports",
    "myComputer",
    "personalMeetingRoom",
    "myPartnerLinks",
    "myWorkspaces"
})
public class MywebexType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The is my web ex pro. */
    protected Boolean isMyWebExPro;
    
    /** The my contact. */
    protected Boolean myContact;
    
    /** The my profile. */
    protected Boolean myProfile;
    
    /** The my meetings. */
    protected Boolean myMeetings;
    
    /** The my folders. */
    protected Boolean myFolders;
    
    /** The training recordings. */
    protected Boolean trainingRecordings;
    
    /** The recorded events. */
    protected Boolean recordedEvents;
    
    /** The total storage size. */
    protected Long totalStorageSize;
    
    /** The my reports. */
    protected Boolean myReports;
    
    /** The my computer. */
    protected Long myComputer;
    
    /** The personal meeting room. */
    protected Boolean personalMeetingRoom;
    
    /** The my partner links. */
    protected Boolean myPartnerLinks;
    
    /** The my workspaces. */
    protected Boolean myWorkspaces;

    /**
     * Checks if is is my web ex pro.
     * 
     * @return the boolean
     */
    public Boolean isIsMyWebExPro() {
        return isMyWebExPro;
    }

    /**
     * Sets the checks if is my web ex pro.
     * 
     * @param value the new checks if is my web ex pro
     */
    public void setIsMyWebExPro(Boolean value) {
        this.isMyWebExPro = value;
    }

    /**
     * Checks if is my contact.
     * 
     * @return the boolean
     */
    public Boolean isMyContact() {
        return myContact;
    }

    /**
     * Sets the my contact.
     * 
     * @param value the new my contact
     */
    public void setMyContact(Boolean value) {
        this.myContact = value;
    }

    /**
     * Checks if is my profile.
     * 
     * @return the boolean
     */
    public Boolean isMyProfile() {
        return myProfile;
    }

    /**
     * Sets the my profile.
     * 
     * @param value the new my profile
     */
    public void setMyProfile(Boolean value) {
        this.myProfile = value;
    }

    /**
     * Checks if is my meetings.
     * 
     * @return the boolean
     */
    public Boolean isMyMeetings() {
        return myMeetings;
    }

    /**
     * Sets the my meetings.
     * 
     * @param value the new my meetings
     */
    public void setMyMeetings(Boolean value) {
        this.myMeetings = value;
    }

    /**
     * Checks if is my folders.
     * 
     * @return the boolean
     */
    public Boolean isMyFolders() {
        return myFolders;
    }

    /**
     * Sets the my folders.
     * 
     * @param value the new my folders
     */
    public void setMyFolders(Boolean value) {
        this.myFolders = value;
    }

    /**
     * Checks if is training recordings.
     * 
     * @return the boolean
     */
    public Boolean isTrainingRecordings() {
        return trainingRecordings;
    }

    /**
     * Sets the training recordings.
     * 
     * @param value the new training recordings
     */
    public void setTrainingRecordings(Boolean value) {
        this.trainingRecordings = value;
    }

    /**
     * Checks if is recorded events.
     * 
     * @return the boolean
     */
    public Boolean isRecordedEvents() {
        return recordedEvents;
    }

    /**
     * Sets the recorded events.
     * 
     * @param value the new recorded events
     */
    public void setRecordedEvents(Boolean value) {
        this.recordedEvents = value;
    }

    /**
     * Gets the total storage size.
     * 
     * @return the total storage size
     */
    public Long getTotalStorageSize() {
        return totalStorageSize;
    }

    /**
     * Sets the total storage size.
     * 
     * @param value the new total storage size
     */
    public void setTotalStorageSize(Long value) {
        this.totalStorageSize = value;
    }

    /**
     * Checks if is my reports.
     * 
     * @return the boolean
     */
    public Boolean isMyReports() {
        return myReports;
    }

    /**
     * Sets the my reports.
     * 
     * @param value the new my reports
     */
    public void setMyReports(Boolean value) {
        this.myReports = value;
    }

    /**
     * Gets the my computer.
     * 
     * @return the my computer
     */
    public Long getMyComputer() {
        return myComputer;
    }

    /**
     * Sets the my computer.
     * 
     * @param value the new my computer
     */
    public void setMyComputer(Long value) {
        this.myComputer = value;
    }

    /**
     * Checks if is personal meeting room.
     * 
     * @return the boolean
     */
    public Boolean isPersonalMeetingRoom() {
        return personalMeetingRoom;
    }

    /**
     * Sets the personal meeting room.
     * 
     * @param value the new personal meeting room
     */
    public void setPersonalMeetingRoom(Boolean value) {
        this.personalMeetingRoom = value;
    }

    /**
     * Checks if is my partner links.
     * 
     * @return the boolean
     */
    public Boolean isMyPartnerLinks() {
        return myPartnerLinks;
    }

    /**
     * Sets the my partner links.
     * 
     * @param value the new my partner links
     */
    public void setMyPartnerLinks(Boolean value) {
        this.myPartnerLinks = value;
    }

    /**
     * Checks if is my workspaces.
     * 
     * @return the boolean
     */
    public Boolean isMyWorkspaces() {
        return myWorkspaces;
    }

    /**
     * Sets the my workspaces.
     * 
     * @param value the new my workspaces
     */
    public void setMyWorkspaces(Boolean value) {
        this.myWorkspaces = value;
    }

}
