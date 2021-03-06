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

package com.webex.schemas._2002._06.service.trainingsession;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.session.EnableOptionsType;


/**
 * <p>Java class for trainingEnableOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trainingEnableOptionsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/session}enableOptionsType">
 *       &lt;sequence>
 *         &lt;element name="chat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="poll" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="audioVideo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fileShare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="presentation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="applicationShare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="desktopShare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="webTour" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="trainingSessionRecord" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="annotation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="importDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="saveDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="printDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pointer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="switchPage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fullScreen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="thumbnail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="zoom" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="copyPage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rcAppShare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rcDesktopShare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rcWebTour" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="attendeeRecordTrainingSession" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="voip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="faxIntoTrainingSession" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="autoDeleteAfterMeetingEnd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="displayQuickStartHost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="displayQuickStartAttendees" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportQandA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportFeedback" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportBreakoutSessions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportRemoteComputer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportShareWebContent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportUCFRichMedia" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="networkBasedRecord" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="presenterBreakoutSession" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="attendeeBreakoutSession" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportPanelists" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="muteOnEntry" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="multiVideo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="veryLargeSess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trainingEnableOptionsType", propOrder = {
    "chat",
    "poll",
    "audioVideo",
    "fileShare",
    "presentation",
    "applicationShare",
    "desktopShare",
    "webTour",
    "trainingSessionRecord",
    "annotation",
    "importDocument",
    "saveDocument",
    "printDocument",
    "pointer",
    "switchPage",
    "fullScreen",
    "thumbnail",
    "zoom",
    "copyPage",
    "rcAppShare",
    "rcDesktopShare",
    "rcWebTour",
    "attendeeRecordTrainingSession",
    "voip",
    "faxIntoTrainingSession",
    "autoDeleteAfterMeetingEnd",
    "displayQuickStartHost",
    "displayQuickStartAttendees",
    "supportQandA",
    "supportFeedback",
    "supportBreakoutSessions",
    "supportRemoteComputer",
    "supportShareWebContent",
    "supportUCFRichMedia",
    "networkBasedRecord",
    "presenterBreakoutSession",
    "attendeeBreakoutSession",
    "supportPanelists",
    "muteOnEntry",
    "multiVideo",
    "veryLargeSess"
})
public class TrainingEnableOptionsType
    extends EnableOptionsType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(defaultValue = "false")
    protected Boolean chat;
    @XmlElement(defaultValue = "false")
    protected Boolean poll;
    protected Boolean audioVideo;
    protected Boolean fileShare;
    protected Boolean presentation;
    protected Boolean applicationShare;
    protected Boolean desktopShare;
    @XmlElement(defaultValue = "false")
    protected Boolean webTour;
    protected Boolean trainingSessionRecord;
    protected Boolean annotation;
    protected Boolean importDocument;
    protected Boolean saveDocument;
    protected Boolean printDocument;
    protected Boolean pointer;
    protected Boolean switchPage;
    protected Boolean fullScreen;
    protected Boolean thumbnail;
    protected Boolean zoom;
    protected Boolean copyPage;
    protected Boolean rcAppShare;
    protected Boolean rcDesktopShare;
    protected Boolean rcWebTour;
    protected Boolean attendeeRecordTrainingSession;
    protected Boolean voip;
    protected Boolean faxIntoTrainingSession;
    protected Boolean autoDeleteAfterMeetingEnd;
    protected Boolean displayQuickStartHost;
    protected Boolean displayQuickStartAttendees;
    protected Boolean supportQandA;
    protected Boolean supportFeedback;
    protected Boolean supportBreakoutSessions;
    protected Boolean supportRemoteComputer;
    protected Boolean supportShareWebContent;
    protected Boolean supportUCFRichMedia;
    protected Boolean networkBasedRecord;
    protected Boolean presenterBreakoutSession;
    protected Boolean attendeeBreakoutSession;
    protected Boolean supportPanelists;
    protected Boolean muteOnEntry;
    protected Boolean multiVideo;
    protected Boolean veryLargeSess;

    /**
     * Gets the value of the chat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChat() {
        return chat;
    }

    /**
     * Sets the value of the chat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChat(Boolean value) {
        this.chat = value;
    }

    /**
     * Gets the value of the poll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPoll() {
        return poll;
    }

    /**
     * Sets the value of the poll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPoll(Boolean value) {
        this.poll = value;
    }

    /**
     * Gets the value of the audioVideo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAudioVideo() {
        return audioVideo;
    }

    /**
     * Sets the value of the audioVideo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAudioVideo(Boolean value) {
        this.audioVideo = value;
    }

    /**
     * Gets the value of the fileShare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFileShare() {
        return fileShare;
    }

    /**
     * Sets the value of the fileShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFileShare(Boolean value) {
        this.fileShare = value;
    }

    /**
     * Gets the value of the presentation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPresentation() {
        return presentation;
    }

    /**
     * Sets the value of the presentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPresentation(Boolean value) {
        this.presentation = value;
    }

    /**
     * Gets the value of the applicationShare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplicationShare() {
        return applicationShare;
    }

    /**
     * Sets the value of the applicationShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplicationShare(Boolean value) {
        this.applicationShare = value;
    }

    /**
     * Gets the value of the desktopShare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDesktopShare() {
        return desktopShare;
    }

    /**
     * Sets the value of the desktopShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDesktopShare(Boolean value) {
        this.desktopShare = value;
    }

    /**
     * Gets the value of the webTour property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWebTour() {
        return webTour;
    }

    /**
     * Sets the value of the webTour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWebTour(Boolean value) {
        this.webTour = value;
    }

    /**
     * Gets the value of the trainingSessionRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrainingSessionRecord() {
        return trainingSessionRecord;
    }

    /**
     * Sets the value of the trainingSessionRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrainingSessionRecord(Boolean value) {
        this.trainingSessionRecord = value;
    }

    /**
     * Gets the value of the annotation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnnotation() {
        return annotation;
    }

    /**
     * Sets the value of the annotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnnotation(Boolean value) {
        this.annotation = value;
    }

    /**
     * Gets the value of the importDocument property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImportDocument() {
        return importDocument;
    }

    /**
     * Sets the value of the importDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImportDocument(Boolean value) {
        this.importDocument = value;
    }

    /**
     * Gets the value of the saveDocument property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaveDocument() {
        return saveDocument;
    }

    /**
     * Sets the value of the saveDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaveDocument(Boolean value) {
        this.saveDocument = value;
    }

    /**
     * Gets the value of the printDocument property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrintDocument() {
        return printDocument;
    }

    /**
     * Sets the value of the printDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintDocument(Boolean value) {
        this.printDocument = value;
    }

    /**
     * Gets the value of the pointer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPointer() {
        return pointer;
    }

    /**
     * Sets the value of the pointer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPointer(Boolean value) {
        this.pointer = value;
    }

    /**
     * Gets the value of the switchPage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSwitchPage() {
        return switchPage;
    }

    /**
     * Sets the value of the switchPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSwitchPage(Boolean value) {
        this.switchPage = value;
    }

    /**
     * Gets the value of the fullScreen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFullScreen() {
        return fullScreen;
    }

    /**
     * Sets the value of the fullScreen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFullScreen(Boolean value) {
        this.fullScreen = value;
    }

    /**
     * Gets the value of the thumbnail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isThumbnail() {
        return thumbnail;
    }

    /**
     * Sets the value of the thumbnail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setThumbnail(Boolean value) {
        this.thumbnail = value;
    }

    /**
     * Gets the value of the zoom property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZoom() {
        return zoom;
    }

    /**
     * Sets the value of the zoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZoom(Boolean value) {
        this.zoom = value;
    }

    /**
     * Gets the value of the copyPage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCopyPage() {
        return copyPage;
    }

    /**
     * Sets the value of the copyPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCopyPage(Boolean value) {
        this.copyPage = value;
    }

    /**
     * Gets the value of the rcAppShare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRcAppShare() {
        return rcAppShare;
    }

    /**
     * Sets the value of the rcAppShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRcAppShare(Boolean value) {
        this.rcAppShare = value;
    }

    /**
     * Gets the value of the rcDesktopShare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRcDesktopShare() {
        return rcDesktopShare;
    }

    /**
     * Sets the value of the rcDesktopShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRcDesktopShare(Boolean value) {
        this.rcDesktopShare = value;
    }

    /**
     * Gets the value of the rcWebTour property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRcWebTour() {
        return rcWebTour;
    }

    /**
     * Sets the value of the rcWebTour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRcWebTour(Boolean value) {
        this.rcWebTour = value;
    }

    /**
     * Gets the value of the attendeeRecordTrainingSession property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttendeeRecordTrainingSession() {
        return attendeeRecordTrainingSession;
    }

    /**
     * Sets the value of the attendeeRecordTrainingSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttendeeRecordTrainingSession(Boolean value) {
        this.attendeeRecordTrainingSession = value;
    }

    /**
     * Gets the value of the voip property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVoip() {
        return voip;
    }

    /**
     * Sets the value of the voip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVoip(Boolean value) {
        this.voip = value;
    }

    /**
     * Gets the value of the faxIntoTrainingSession property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFaxIntoTrainingSession() {
        return faxIntoTrainingSession;
    }

    /**
     * Sets the value of the faxIntoTrainingSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFaxIntoTrainingSession(Boolean value) {
        this.faxIntoTrainingSession = value;
    }

    /**
     * Gets the value of the autoDeleteAfterMeetingEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoDeleteAfterMeetingEnd() {
        return autoDeleteAfterMeetingEnd;
    }

    /**
     * Sets the value of the autoDeleteAfterMeetingEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoDeleteAfterMeetingEnd(Boolean value) {
        this.autoDeleteAfterMeetingEnd = value;
    }

    /**
     * Gets the value of the displayQuickStartHost property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayQuickStartHost() {
        return displayQuickStartHost;
    }

    /**
     * Sets the value of the displayQuickStartHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayQuickStartHost(Boolean value) {
        this.displayQuickStartHost = value;
    }

    /**
     * Gets the value of the displayQuickStartAttendees property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayQuickStartAttendees() {
        return displayQuickStartAttendees;
    }

    /**
     * Sets the value of the displayQuickStartAttendees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayQuickStartAttendees(Boolean value) {
        this.displayQuickStartAttendees = value;
    }

    /**
     * Gets the value of the supportQandA property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportQandA() {
        return supportQandA;
    }

    /**
     * Sets the value of the supportQandA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportQandA(Boolean value) {
        this.supportQandA = value;
    }

    /**
     * Gets the value of the supportFeedback property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportFeedback() {
        return supportFeedback;
    }

    /**
     * Sets the value of the supportFeedback property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportFeedback(Boolean value) {
        this.supportFeedback = value;
    }

    /**
     * Gets the value of the supportBreakoutSessions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportBreakoutSessions() {
        return supportBreakoutSessions;
    }

    /**
     * Sets the value of the supportBreakoutSessions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportBreakoutSessions(Boolean value) {
        this.supportBreakoutSessions = value;
    }

    /**
     * Gets the value of the supportRemoteComputer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportRemoteComputer() {
        return supportRemoteComputer;
    }

    /**
     * Sets the value of the supportRemoteComputer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportRemoteComputer(Boolean value) {
        this.supportRemoteComputer = value;
    }

    /**
     * Gets the value of the supportShareWebContent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportShareWebContent() {
        return supportShareWebContent;
    }

    /**
     * Sets the value of the supportShareWebContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportShareWebContent(Boolean value) {
        this.supportShareWebContent = value;
    }

    /**
     * Gets the value of the supportUCFRichMedia property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportUCFRichMedia() {
        return supportUCFRichMedia;
    }

    /**
     * Sets the value of the supportUCFRichMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportUCFRichMedia(Boolean value) {
        this.supportUCFRichMedia = value;
    }

    /**
     * Gets the value of the networkBasedRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetworkBasedRecord() {
        return networkBasedRecord;
    }

    /**
     * Sets the value of the networkBasedRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetworkBasedRecord(Boolean value) {
        this.networkBasedRecord = value;
    }

    /**
     * Gets the value of the presenterBreakoutSession property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPresenterBreakoutSession() {
        return presenterBreakoutSession;
    }

    /**
     * Sets the value of the presenterBreakoutSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPresenterBreakoutSession(Boolean value) {
        this.presenterBreakoutSession = value;
    }

    /**
     * Gets the value of the attendeeBreakoutSession property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttendeeBreakoutSession() {
        return attendeeBreakoutSession;
    }

    /**
     * Sets the value of the attendeeBreakoutSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttendeeBreakoutSession(Boolean value) {
        this.attendeeBreakoutSession = value;
    }

    /**
     * Gets the value of the supportPanelists property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportPanelists() {
        return supportPanelists;
    }

    /**
     * Sets the value of the supportPanelists property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportPanelists(Boolean value) {
        this.supportPanelists = value;
    }

    /**
     * Gets the value of the muteOnEntry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMuteOnEntry() {
        return muteOnEntry;
    }

    /**
     * Sets the value of the muteOnEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMuteOnEntry(Boolean value) {
        this.muteOnEntry = value;
    }

    /**
     * Gets the value of the multiVideo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultiVideo() {
        return multiVideo;
    }

    /**
     * Sets the value of the multiVideo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultiVideo(Boolean value) {
        this.multiVideo = value;
    }

    /**
     * Gets the value of the veryLargeSess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVeryLargeSess() {
        return veryLargeSess;
    }

    /**
     * Sets the value of the veryLargeSess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVeryLargeSess(Boolean value) {
        this.veryLargeSess = value;
    }

}
