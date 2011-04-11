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
 * The Class MyWebExConfigType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "myWebExConfigType", propOrder = {
    "myContacts",
    "myProfile",
    "myMeetings",
    "trainingRecordings",
    "folders",
    "eventDocument",
    "myReport",
    "myComputer",
    "personalMeetingPage",
    "myFilesStorage",
    "myComputerNumbers",
    "enableMyWebExPro",
    "myWebExProHostLimit",
    "myWebExProMaxHosts",
    "restrictAccessAnyApps",
    "restrictAccessAnyAppsNum",
    "addlAccessAnyComputersLimit",
    "addlAccessAnyComputers",
    "addlStorageLimit",
    "addlStorage",
    "myContactsPro",
    "myProfilePro",
    "myMeetingsPro",
    "trainingRecordingsPro",
    "foldersPro",
    "eventDocumentPro",
    "myReportPro",
    "myComputerPro",
    "personalMeetingPagePro",
    "myFilesStoragePro",
    "myComputerNumbersPro",
    "pmRheaderBranding",
    "pmRheaderBrandingLocation"
})
public class MyWebExConfigType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The my contacts. */
    protected Boolean myContacts;
    
    /** The my profile. */
    protected Boolean myProfile;
    
    /** The my meetings. */
    protected Boolean myMeetings;
    
    /** The training recordings. */
    protected Boolean trainingRecordings;
    
    /** The folders. */
    @XmlElement(defaultValue = "false")
    protected Boolean folders;
    
    /** The event document. */
    protected Boolean eventDocument;
    
    /** The my report. */
    protected Boolean myReport;
    
    /** The my computer. */
    @XmlElement(defaultValue = "false")
    protected Boolean myComputer;
    
    /** The personal meeting page. */
    protected Boolean personalMeetingPage;
    
    /** The my files storage. */
    protected Long myFilesStorage;
    
    /** The my computer numbers. */
    protected Long myComputerNumbers;
    
    /** The enable my web ex pro. */
    protected Boolean enableMyWebExPro;
    
    /** The my web ex pro host limit. */
    protected LimitsType myWebExProHostLimit;
    
    /** The my web ex pro max hosts. */
    protected Long myWebExProMaxHosts;
    
    /** The restrict access any apps. */
    protected Boolean restrictAccessAnyApps;
    
    /** The restrict access any apps num. */
    protected Long restrictAccessAnyAppsNum;
    
    /** The addl access any computers limit. */
    protected LimitsType addlAccessAnyComputersLimit;
    
    /** The addl access any computers. */
    protected Long addlAccessAnyComputers;
    
    /** The addl storage limit. */
    protected LimitsType addlStorageLimit;
    
    /** The addl storage. */
    protected Long addlStorage;
    
    /** The my contacts pro. */
    protected Boolean myContactsPro;
    
    /** The my profile pro. */
    protected Boolean myProfilePro;
    
    /** The my meetings pro. */
    protected Boolean myMeetingsPro;
    
    /** The training recordings pro. */
    protected Boolean trainingRecordingsPro;
    
    /** The folders pro. */
    @XmlElement(defaultValue = "false")
    protected Boolean foldersPro;
    
    /** The event document pro. */
    protected Boolean eventDocumentPro;
    
    /** The my report pro. */
    protected Boolean myReportPro;
    
    /** The my computer pro. */
    @XmlElement(defaultValue = "false")
    protected Boolean myComputerPro;
    
    /** The personal meeting page pro. */
    protected Boolean personalMeetingPagePro;
    
    /** The my files storage pro. */
    protected Long myFilesStoragePro;
    
    /** The my computer numbers pro. */
    protected Long myComputerNumbersPro;
    
    /** The pm rheader branding. */
    @XmlElement(name = "PMRheaderBranding")
    protected Boolean pmRheaderBranding;
    
    /** The pm rheader branding location. */
    @XmlElement(name = "PMRheaderBrandingLocation")
    protected HeaderImageLocationType pmRheaderBrandingLocation;

    /**
     * Checks if is my contacts.
     * 
     * @return the boolean
     */
    public Boolean isMyContacts() {
        return myContacts;
    }

    /**
     * Sets the my contacts.
     * 
     * @param value the new my contacts
     */
    public void setMyContacts(Boolean value) {
        this.myContacts = value;
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
     * Checks if is folders.
     * 
     * @return the boolean
     */
    public Boolean isFolders() {
        return folders;
    }

    /**
     * Sets the folders.
     * 
     * @param value the new folders
     */
    public void setFolders(Boolean value) {
        this.folders = value;
    }

    /**
     * Checks if is event document.
     * 
     * @return the boolean
     */
    public Boolean isEventDocument() {
        return eventDocument;
    }

    /**
     * Sets the event document.
     * 
     * @param value the new event document
     */
    public void setEventDocument(Boolean value) {
        this.eventDocument = value;
    }

    /**
     * Checks if is my report.
     * 
     * @return the boolean
     */
    public Boolean isMyReport() {
        return myReport;
    }

    /**
     * Sets the my report.
     * 
     * @param value the new my report
     */
    public void setMyReport(Boolean value) {
        this.myReport = value;
    }

    /**
     * Checks if is my computer.
     * 
     * @return the boolean
     */
    public Boolean isMyComputer() {
        return myComputer;
    }

    /**
     * Sets the my computer.
     * 
     * @param value the new my computer
     */
    public void setMyComputer(Boolean value) {
        this.myComputer = value;
    }

    /**
     * Checks if is personal meeting page.
     * 
     * @return the boolean
     */
    public Boolean isPersonalMeetingPage() {
        return personalMeetingPage;
    }

    /**
     * Sets the personal meeting page.
     * 
     * @param value the new personal meeting page
     */
    public void setPersonalMeetingPage(Boolean value) {
        this.personalMeetingPage = value;
    }

    /**
     * Gets the my files storage.
     * 
     * @return the my files storage
     */
    public Long getMyFilesStorage() {
        return myFilesStorage;
    }

    /**
     * Sets the my files storage.
     * 
     * @param value the new my files storage
     */
    public void setMyFilesStorage(Long value) {
        this.myFilesStorage = value;
    }

    /**
     * Gets the my computer numbers.
     * 
     * @return the my computer numbers
     */
    public Long getMyComputerNumbers() {
        return myComputerNumbers;
    }

    /**
     * Sets the my computer numbers.
     * 
     * @param value the new my computer numbers
     */
    public void setMyComputerNumbers(Long value) {
        this.myComputerNumbers = value;
    }

    /**
     * Checks if is enable my web ex pro.
     * 
     * @return the boolean
     */
    public Boolean isEnableMyWebExPro() {
        return enableMyWebExPro;
    }

    /**
     * Sets the enable my web ex pro.
     * 
     * @param value the new enable my web ex pro
     */
    public void setEnableMyWebExPro(Boolean value) {
        this.enableMyWebExPro = value;
    }

    /**
     * Gets the my web ex pro host limit.
     * 
     * @return the my web ex pro host limit
     */
    public LimitsType getMyWebExProHostLimit() {
        return myWebExProHostLimit;
    }

    /**
     * Sets the my web ex pro host limit.
     * 
     * @param value the new my web ex pro host limit
     */
    public void setMyWebExProHostLimit(LimitsType value) {
        this.myWebExProHostLimit = value;
    }

    /**
     * Gets the my web ex pro max hosts.
     * 
     * @return the my web ex pro max hosts
     */
    public Long getMyWebExProMaxHosts() {
        return myWebExProMaxHosts;
    }

    /**
     * Sets the my web ex pro max hosts.
     * 
     * @param value the new my web ex pro max hosts
     */
    public void setMyWebExProMaxHosts(Long value) {
        this.myWebExProMaxHosts = value;
    }

    /**
     * Checks if is restrict access any apps.
     * 
     * @return the boolean
     */
    public Boolean isRestrictAccessAnyApps() {
        return restrictAccessAnyApps;
    }

    /**
     * Sets the restrict access any apps.
     * 
     * @param value the new restrict access any apps
     */
    public void setRestrictAccessAnyApps(Boolean value) {
        this.restrictAccessAnyApps = value;
    }

    /**
     * Gets the restrict access any apps num.
     * 
     * @return the restrict access any apps num
     */
    public Long getRestrictAccessAnyAppsNum() {
        return restrictAccessAnyAppsNum;
    }

    /**
     * Sets the restrict access any apps num.
     * 
     * @param value the new restrict access any apps num
     */
    public void setRestrictAccessAnyAppsNum(Long value) {
        this.restrictAccessAnyAppsNum = value;
    }

    /**
     * Gets the addl access any computers limit.
     * 
     * @return the addl access any computers limit
     */
    public LimitsType getAddlAccessAnyComputersLimit() {
        return addlAccessAnyComputersLimit;
    }

    /**
     * Sets the addl access any computers limit.
     * 
     * @param value the new addl access any computers limit
     */
    public void setAddlAccessAnyComputersLimit(LimitsType value) {
        this.addlAccessAnyComputersLimit = value;
    }

    /**
     * Gets the addl access any computers.
     * 
     * @return the addl access any computers
     */
    public Long getAddlAccessAnyComputers() {
        return addlAccessAnyComputers;
    }

    /**
     * Sets the addl access any computers.
     * 
     * @param value the new addl access any computers
     */
    public void setAddlAccessAnyComputers(Long value) {
        this.addlAccessAnyComputers = value;
    }

    /**
     * Gets the addl storage limit.
     * 
     * @return the addl storage limit
     */
    public LimitsType getAddlStorageLimit() {
        return addlStorageLimit;
    }

    /**
     * Sets the addl storage limit.
     * 
     * @param value the new addl storage limit
     */
    public void setAddlStorageLimit(LimitsType value) {
        this.addlStorageLimit = value;
    }

    /**
     * Gets the addl storage.
     * 
     * @return the addl storage
     */
    public Long getAddlStorage() {
        return addlStorage;
    }

    /**
     * Sets the addl storage.
     * 
     * @param value the new addl storage
     */
    public void setAddlStorage(Long value) {
        this.addlStorage = value;
    }

    /**
     * Checks if is my contacts pro.
     * 
     * @return the boolean
     */
    public Boolean isMyContactsPro() {
        return myContactsPro;
    }

    /**
     * Sets the my contacts pro.
     * 
     * @param value the new my contacts pro
     */
    public void setMyContactsPro(Boolean value) {
        this.myContactsPro = value;
    }

    /**
     * Checks if is my profile pro.
     * 
     * @return the boolean
     */
    public Boolean isMyProfilePro() {
        return myProfilePro;
    }

    /**
     * Sets the my profile pro.
     * 
     * @param value the new my profile pro
     */
    public void setMyProfilePro(Boolean value) {
        this.myProfilePro = value;
    }

    /**
     * Checks if is my meetings pro.
     * 
     * @return the boolean
     */
    public Boolean isMyMeetingsPro() {
        return myMeetingsPro;
    }

    /**
     * Sets the my meetings pro.
     * 
     * @param value the new my meetings pro
     */
    public void setMyMeetingsPro(Boolean value) {
        this.myMeetingsPro = value;
    }

    /**
     * Checks if is training recordings pro.
     * 
     * @return the boolean
     */
    public Boolean isTrainingRecordingsPro() {
        return trainingRecordingsPro;
    }

    /**
     * Sets the training recordings pro.
     * 
     * @param value the new training recordings pro
     */
    public void setTrainingRecordingsPro(Boolean value) {
        this.trainingRecordingsPro = value;
    }

    /**
     * Checks if is folders pro.
     * 
     * @return the boolean
     */
    public Boolean isFoldersPro() {
        return foldersPro;
    }

    /**
     * Sets the folders pro.
     * 
     * @param value the new folders pro
     */
    public void setFoldersPro(Boolean value) {
        this.foldersPro = value;
    }

    /**
     * Checks if is event document pro.
     * 
     * @return the boolean
     */
    public Boolean isEventDocumentPro() {
        return eventDocumentPro;
    }

    /**
     * Sets the event document pro.
     * 
     * @param value the new event document pro
     */
    public void setEventDocumentPro(Boolean value) {
        this.eventDocumentPro = value;
    }

    /**
     * Checks if is my report pro.
     * 
     * @return the boolean
     */
    public Boolean isMyReportPro() {
        return myReportPro;
    }

    /**
     * Sets the my report pro.
     * 
     * @param value the new my report pro
     */
    public void setMyReportPro(Boolean value) {
        this.myReportPro = value;
    }

    /**
     * Checks if is my computer pro.
     * 
     * @return the boolean
     */
    public Boolean isMyComputerPro() {
        return myComputerPro;
    }

    /**
     * Sets the my computer pro.
     * 
     * @param value the new my computer pro
     */
    public void setMyComputerPro(Boolean value) {
        this.myComputerPro = value;
    }

    /**
     * Checks if is personal meeting page pro.
     * 
     * @return the boolean
     */
    public Boolean isPersonalMeetingPagePro() {
        return personalMeetingPagePro;
    }

    /**
     * Sets the personal meeting page pro.
     * 
     * @param value the new personal meeting page pro
     */
    public void setPersonalMeetingPagePro(Boolean value) {
        this.personalMeetingPagePro = value;
    }

    /**
     * Gets the my files storage pro.
     * 
     * @return the my files storage pro
     */
    public Long getMyFilesStoragePro() {
        return myFilesStoragePro;
    }

    /**
     * Sets the my files storage pro.
     * 
     * @param value the new my files storage pro
     */
    public void setMyFilesStoragePro(Long value) {
        this.myFilesStoragePro = value;
    }

    /**
     * Gets the my computer numbers pro.
     * 
     * @return the my computer numbers pro
     */
    public Long getMyComputerNumbersPro() {
        return myComputerNumbersPro;
    }

    /**
     * Sets the my computer numbers pro.
     * 
     * @param value the new my computer numbers pro
     */
    public void setMyComputerNumbersPro(Long value) {
        this.myComputerNumbersPro = value;
    }

    /**
     * Checks if is pm rheader branding.
     * 
     * @return the boolean
     */
    public Boolean isPMRheaderBranding() {
        return pmRheaderBranding;
    }

    /**
     * Sets the pM rheader branding.
     * 
     * @param value the new pM rheader branding
     */
    public void setPMRheaderBranding(Boolean value) {
        this.pmRheaderBranding = value;
    }

    /**
     * Gets the pM rheader branding location.
     * 
     * @return the pM rheader branding location
     */
    public HeaderImageLocationType getPMRheaderBrandingLocation() {
        return pmRheaderBrandingLocation;
    }

    /**
     * Sets the pM rheader branding location.
     * 
     * @param value the new pM rheader branding location
     */
    public void setPMRheaderBrandingLocation(HeaderImageLocationType value) {
        this.pmRheaderBrandingLocation = value;
    }

}
