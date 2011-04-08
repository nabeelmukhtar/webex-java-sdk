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
 * <p>Java class for mywebexType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mywebexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isMyWebExPro" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="myContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="myProfile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="myMeetings" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="myFolders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="trainingRecordings" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="recordedEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="totalStorageSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="myReports" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="myComputer" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="personalMeetingRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="myPartnerLinks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="myWorkspaces" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
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

    private final static long serialVersionUID = 2461660169443089969L;
    protected Boolean isMyWebExPro;
    protected Boolean myContact;
    protected Boolean myProfile;
    protected Boolean myMeetings;
    protected Boolean myFolders;
    protected Boolean trainingRecordings;
    protected Boolean recordedEvents;
    protected Long totalStorageSize;
    protected Boolean myReports;
    protected Long myComputer;
    protected Boolean personalMeetingRoom;
    protected Boolean myPartnerLinks;
    protected Boolean myWorkspaces;

    /**
     * Gets the value of the isMyWebExPro property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMyWebExPro() {
        return isMyWebExPro;
    }

    /**
     * Sets the value of the isMyWebExPro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMyWebExPro(Boolean value) {
        this.isMyWebExPro = value;
    }

    /**
     * Gets the value of the myContact property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMyContact() {
        return myContact;
    }

    /**
     * Sets the value of the myContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMyContact(Boolean value) {
        this.myContact = value;
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
     * Gets the value of the myFolders property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMyFolders() {
        return myFolders;
    }

    /**
     * Sets the value of the myFolders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMyFolders(Boolean value) {
        this.myFolders = value;
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
     * Gets the value of the recordedEvents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecordedEvents() {
        return recordedEvents;
    }

    /**
     * Sets the value of the recordedEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecordedEvents(Boolean value) {
        this.recordedEvents = value;
    }

    /**
     * Gets the value of the totalStorageSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalStorageSize() {
        return totalStorageSize;
    }

    /**
     * Sets the value of the totalStorageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalStorageSize(Long value) {
        this.totalStorageSize = value;
    }

    /**
     * Gets the value of the myReports property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMyReports() {
        return myReports;
    }

    /**
     * Sets the value of the myReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMyReports(Boolean value) {
        this.myReports = value;
    }

    /**
     * Gets the value of the myComputer property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMyComputer() {
        return myComputer;
    }

    /**
     * Sets the value of the myComputer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMyComputer(Long value) {
        this.myComputer = value;
    }

    /**
     * Gets the value of the personalMeetingRoom property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPersonalMeetingRoom() {
        return personalMeetingRoom;
    }

    /**
     * Sets the value of the personalMeetingRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersonalMeetingRoom(Boolean value) {
        this.personalMeetingRoom = value;
    }

    /**
     * Gets the value of the myPartnerLinks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMyPartnerLinks() {
        return myPartnerLinks;
    }

    /**
     * Sets the value of the myPartnerLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMyPartnerLinks(Boolean value) {
        this.myPartnerLinks = value;
    }

    /**
     * Gets the value of the myWorkspaces property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMyWorkspaces() {
        return myWorkspaces;
    }

    /**
     * Sets the value of the myWorkspaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMyWorkspaces(Boolean value) {
        this.myWorkspaces = value;
    }

}
