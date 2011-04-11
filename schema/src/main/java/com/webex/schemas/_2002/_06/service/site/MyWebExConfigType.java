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
 * <p>Java class for myWebExConfigType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="myWebExConfigType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="myContacts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="myProfile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="myMeetings" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="trainingRecordings" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="folders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eventDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="myReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="myComputer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="personalMeetingPage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="myFilesStorage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="myComputerNumbers" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="enableMyWebExPro" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="myWebExProHostLimit" type="{http://www.webex.com/schemas/2002/06/service/site}limitsType" minOccurs="0"/>
 *         &lt;element name="myWebExProMaxHosts" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="restrictAccessAnyApps" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="restrictAccessAnyAppsNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="addlAccessAnyComputersLimit" type="{http://www.webex.com/schemas/2002/06/service/site}limitsType" minOccurs="0"/>
 *         &lt;element name="addlAccessAnyComputers" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="addlStorageLimit" type="{http://www.webex.com/schemas/2002/06/service/site}limitsType" minOccurs="0"/>
 *         &lt;element name="addlStorage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="myContactsPro" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="myProfilePro" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="myMeetingsPro" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="trainingRecordingsPro" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="foldersPro" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eventDocumentPro" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="myReportPro" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="myComputerPro" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="personalMeetingPagePro" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="myFilesStoragePro" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="myComputerNumbersPro" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PMRheaderBranding" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PMRheaderBrandingLocation" type="{http://www.webex.com/schemas/2002/06/service/site}headerImageLocationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
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

    private final static long serialVersionUID = 2461660169443089969L;
    protected Boolean myContacts;
    protected Boolean myProfile;
    protected Boolean myMeetings;
    protected Boolean trainingRecordings;
    @XmlElement(defaultValue = "false")
    protected Boolean folders;
    protected Boolean eventDocument;
    protected Boolean myReport;
    @XmlElement(defaultValue = "false")
    protected Boolean myComputer;
    protected Boolean personalMeetingPage;
    protected Long myFilesStorage;
    protected Long myComputerNumbers;
    protected Boolean enableMyWebExPro;
    protected LimitsType myWebExProHostLimit;
    protected Long myWebExProMaxHosts;
    protected Boolean restrictAccessAnyApps;
    protected Long restrictAccessAnyAppsNum;
    protected LimitsType addlAccessAnyComputersLimit;
    protected Long addlAccessAnyComputers;
    protected LimitsType addlStorageLimit;
    protected Long addlStorage;
    protected Boolean myContactsPro;
    protected Boolean myProfilePro;
    protected Boolean myMeetingsPro;
    protected Boolean trainingRecordingsPro;
    @XmlElement(defaultValue = "false")
    protected Boolean foldersPro;
    protected Boolean eventDocumentPro;
    protected Boolean myReportPro;
    @XmlElement(defaultValue = "false")
    protected Boolean myComputerPro;
    protected Boolean personalMeetingPagePro;
    protected Long myFilesStoragePro;
    protected Long myComputerNumbersPro;
    @XmlElement(name = "PMRheaderBranding")
    protected Boolean pmRheaderBranding;
    @XmlElement(name = "PMRheaderBrandingLocation")
    protected HeaderImageLocationType pmRheaderBrandingLocation;

    /**
     * Gets the value of the myContacts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMyContacts() {
        return myContacts;
    }

    /**
     * Sets the value of the myContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMyContacts(Boolean value) {
        this.myContacts = value;
    }

    /**
     * Gets the value of the myProfile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMyProfile() {
        return myProfile;
    }

    /**
     * Sets the value of the myProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMyProfile(Boolean value) {
        this.myProfile = value;
    }

    /**
     * Gets the value of the myMeetings property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMyMeetings() {
        return myMeetings;
    }

    /**
     * Sets the value of the myMeetings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMyMeetings(Boolean value) {
        this.myMeetings = value;
    }

    /**
     * Gets the value of the trainingRecordings property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrainingRecordings() {
        return trainingRecordings;
    }

    /**
     * Sets the value of the trainingRecordings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrainingRecordings(Boolean value) {
        this.trainingRecordings = value;
    }

    /**
     * Gets the value of the folders property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFolders() {
        return folders;
    }

    /**
     * Sets the value of the folders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFolders(Boolean value) {
        this.folders = value;
    }

    /**
     * Gets the value of the eventDocument property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEventDocument() {
        return eventDocument;
    }

    /**
     * Sets the value of the eventDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEventDocument(Boolean value) {
        this.eventDocument = value;
    }

    /**
     * Gets the value of the myReport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMyReport() {
        return myReport;
    }

    /**
     * Sets the value of the myReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMyReport(Boolean value) {
        this.myReport = value;
    }

    /**
     * Gets the value of the myComputer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMyComputer() {
        return myComputer;
    }

    /**
     * Sets the value of the myComputer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMyComputer(Boolean value) {
        this.myComputer = value;
    }

    /**
     * Gets the value of the personalMeetingPage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPersonalMeetingPage() {
        return personalMeetingPage;
    }

    /**
     * Sets the value of the personalMeetingPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersonalMeetingPage(Boolean value) {
        this.personalMeetingPage = value;
    }

    /**
     * Gets the value of the myFilesStorage property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMyFilesStorage() {
        return myFilesStorage;
    }

    /**
     * Sets the value of the myFilesStorage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMyFilesStorage(Long value) {
        this.myFilesStorage = value;
    }

    /**
     * Gets the value of the myComputerNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMyComputerNumbers() {
        return myComputerNumbers;
    }

    /**
     * Sets the value of the myComputerNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMyComputerNumbers(Long value) {
        this.myComputerNumbers = value;
    }

    /**
     * Gets the value of the enableMyWebExPro property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableMyWebExPro() {
        return enableMyWebExPro;
    }

    /**
     * Sets the value of the enableMyWebExPro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableMyWebExPro(Boolean value) {
        this.enableMyWebExPro = value;
    }

    /**
     * Gets the value of the myWebExProHostLimit property.
     * 
     * @return
     *     possible object is
     *     {@link LimitsType }
     *     
     */
    public LimitsType getMyWebExProHostLimit() {
        return myWebExProHostLimit;
    }

    /**
     * Sets the value of the myWebExProHostLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitsType }
     *     
     */
    public void setMyWebExProHostLimit(LimitsType value) {
        this.myWebExProHostLimit = value;
    }

    /**
     * Gets the value of the myWebExProMaxHosts property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMyWebExProMaxHosts() {
        return myWebExProMaxHosts;
    }

    /**
     * Sets the value of the myWebExProMaxHosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMyWebExProMaxHosts(Long value) {
        this.myWebExProMaxHosts = value;
    }

    /**
     * Gets the value of the restrictAccessAnyApps property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictAccessAnyApps() {
        return restrictAccessAnyApps;
    }

    /**
     * Sets the value of the restrictAccessAnyApps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictAccessAnyApps(Boolean value) {
        this.restrictAccessAnyApps = value;
    }

    /**
     * Gets the value of the restrictAccessAnyAppsNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRestrictAccessAnyAppsNum() {
        return restrictAccessAnyAppsNum;
    }

    /**
     * Sets the value of the restrictAccessAnyAppsNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRestrictAccessAnyAppsNum(Long value) {
        this.restrictAccessAnyAppsNum = value;
    }

    /**
     * Gets the value of the addlAccessAnyComputersLimit property.
     * 
     * @return
     *     possible object is
     *     {@link LimitsType }
     *     
     */
    public LimitsType getAddlAccessAnyComputersLimit() {
        return addlAccessAnyComputersLimit;
    }

    /**
     * Sets the value of the addlAccessAnyComputersLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitsType }
     *     
     */
    public void setAddlAccessAnyComputersLimit(LimitsType value) {
        this.addlAccessAnyComputersLimit = value;
    }

    /**
     * Gets the value of the addlAccessAnyComputers property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAddlAccessAnyComputers() {
        return addlAccessAnyComputers;
    }

    /**
     * Sets the value of the addlAccessAnyComputers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAddlAccessAnyComputers(Long value) {
        this.addlAccessAnyComputers = value;
    }

    /**
     * Gets the value of the addlStorageLimit property.
     * 
     * @return
     *     possible object is
     *     {@link LimitsType }
     *     
     */
    public LimitsType getAddlStorageLimit() {
        return addlStorageLimit;
    }

    /**
     * Sets the value of the addlStorageLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitsType }
     *     
     */
    public void setAddlStorageLimit(LimitsType value) {
        this.addlStorageLimit = value;
    }

    /**
     * Gets the value of the addlStorage property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAddlStorage() {
        return addlStorage;
    }

    /**
     * Sets the value of the addlStorage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAddlStorage(Long value) {
        this.addlStorage = value;
    }

    /**
     * Gets the value of the myContactsPro property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMyContactsPro() {
        return myContactsPro;
    }

    /**
     * Sets the value of the myContactsPro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMyContactsPro(Boolean value) {
        this.myContactsPro = value;
    }

    /**
     * Gets the value of the myProfilePro property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMyProfilePro() {
        return myProfilePro;
    }

    /**
     * Sets the value of the myProfilePro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMyProfilePro(Boolean value) {
        this.myProfilePro = value;
    }

    /**
     * Gets the value of the myMeetingsPro property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMyMeetingsPro() {
        return myMeetingsPro;
    }

    /**
     * Sets the value of the myMeetingsPro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMyMeetingsPro(Boolean value) {
        this.myMeetingsPro = value;
    }

    /**
     * Gets the value of the trainingRecordingsPro property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrainingRecordingsPro() {
        return trainingRecordingsPro;
    }

    /**
     * Sets the value of the trainingRecordingsPro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrainingRecordingsPro(Boolean value) {
        this.trainingRecordingsPro = value;
    }

    /**
     * Gets the value of the foldersPro property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFoldersPro() {
        return foldersPro;
    }

    /**
     * Sets the value of the foldersPro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFoldersPro(Boolean value) {
        this.foldersPro = value;
    }

    /**
     * Gets the value of the eventDocumentPro property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEventDocumentPro() {
        return eventDocumentPro;
    }

    /**
     * Sets the value of the eventDocumentPro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEventDocumentPro(Boolean value) {
        this.eventDocumentPro = value;
    }

    /**
     * Gets the value of the myReportPro property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMyReportPro() {
        return myReportPro;
    }

    /**
     * Sets the value of the myReportPro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMyReportPro(Boolean value) {
        this.myReportPro = value;
    }

    /**
     * Gets the value of the myComputerPro property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMyComputerPro() {
        return myComputerPro;
    }

    /**
     * Sets the value of the myComputerPro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMyComputerPro(Boolean value) {
        this.myComputerPro = value;
    }

    /**
     * Gets the value of the personalMeetingPagePro property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPersonalMeetingPagePro() {
        return personalMeetingPagePro;
    }

    /**
     * Sets the value of the personalMeetingPagePro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersonalMeetingPagePro(Boolean value) {
        this.personalMeetingPagePro = value;
    }

    /**
     * Gets the value of the myFilesStoragePro property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMyFilesStoragePro() {
        return myFilesStoragePro;
    }

    /**
     * Sets the value of the myFilesStoragePro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMyFilesStoragePro(Long value) {
        this.myFilesStoragePro = value;
    }

    /**
     * Gets the value of the myComputerNumbersPro property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMyComputerNumbersPro() {
        return myComputerNumbersPro;
    }

    /**
     * Sets the value of the myComputerNumbersPro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMyComputerNumbersPro(Long value) {
        this.myComputerNumbersPro = value;
    }

    /**
     * Gets the value of the pmRheaderBranding property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPMRheaderBranding() {
        return pmRheaderBranding;
    }

    /**
     * Sets the value of the pmRheaderBranding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPMRheaderBranding(Boolean value) {
        this.pmRheaderBranding = value;
    }

    /**
     * Gets the value of the pmRheaderBrandingLocation property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderImageLocationType }
     *     
     */
    public HeaderImageLocationType getPMRheaderBrandingLocation() {
        return pmRheaderBrandingLocation;
    }

    /**
     * Sets the value of the pmRheaderBrandingLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderImageLocationType }
     *     
     */
    public void setPMRheaderBrandingLocation(HeaderImageLocationType value) {
        this.pmRheaderBrandingLocation = value;
    }

}
