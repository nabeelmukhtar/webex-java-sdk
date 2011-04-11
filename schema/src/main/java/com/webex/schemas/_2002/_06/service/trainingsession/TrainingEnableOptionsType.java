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
 * The Class TrainingEnableOptionsType.
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

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The chat. */
    @XmlElement(defaultValue = "false")
    protected Boolean chat;
    
    /** The poll. */
    @XmlElement(defaultValue = "false")
    protected Boolean poll;
    
    /** The audio video. */
    protected Boolean audioVideo;
    
    /** The file share. */
    protected Boolean fileShare;
    
    /** The presentation. */
    protected Boolean presentation;
    
    /** The application share. */
    protected Boolean applicationShare;
    
    /** The desktop share. */
    protected Boolean desktopShare;
    
    /** The web tour. */
    @XmlElement(defaultValue = "false")
    protected Boolean webTour;
    
    /** The training session record. */
    protected Boolean trainingSessionRecord;
    
    /** The annotation. */
    protected Boolean annotation;
    
    /** The import document. */
    protected Boolean importDocument;
    
    /** The save document. */
    protected Boolean saveDocument;
    
    /** The print document. */
    protected Boolean printDocument;
    
    /** The pointer. */
    protected Boolean pointer;
    
    /** The switch page. */
    protected Boolean switchPage;
    
    /** The full screen. */
    protected Boolean fullScreen;
    
    /** The thumbnail. */
    protected Boolean thumbnail;
    
    /** The zoom. */
    protected Boolean zoom;
    
    /** The copy page. */
    protected Boolean copyPage;
    
    /** The rc app share. */
    protected Boolean rcAppShare;
    
    /** The rc desktop share. */
    protected Boolean rcDesktopShare;
    
    /** The rc web tour. */
    protected Boolean rcWebTour;
    
    /** The attendee record training session. */
    protected Boolean attendeeRecordTrainingSession;
    
    /** The voip. */
    protected Boolean voip;
    
    /** The fax into training session. */
    protected Boolean faxIntoTrainingSession;
    
    /** The auto delete after meeting end. */
    protected Boolean autoDeleteAfterMeetingEnd;
    
    /** The display quick start host. */
    protected Boolean displayQuickStartHost;
    
    /** The display quick start attendees. */
    protected Boolean displayQuickStartAttendees;
    
    /** The support qand a. */
    protected Boolean supportQandA;
    
    /** The support feedback. */
    protected Boolean supportFeedback;
    
    /** The support breakout sessions. */
    protected Boolean supportBreakoutSessions;
    
    /** The support remote computer. */
    protected Boolean supportRemoteComputer;
    
    /** The support share web content. */
    protected Boolean supportShareWebContent;
    
    /** The support ucf rich media. */
    protected Boolean supportUCFRichMedia;
    
    /** The network based record. */
    protected Boolean networkBasedRecord;
    
    /** The presenter breakout session. */
    protected Boolean presenterBreakoutSession;
    
    /** The attendee breakout session. */
    protected Boolean attendeeBreakoutSession;
    
    /** The support panelists. */
    protected Boolean supportPanelists;
    
    /** The mute on entry. */
    protected Boolean muteOnEntry;
    
    /** The multi video. */
    protected Boolean multiVideo;
    
    /** The very large sess. */
    protected Boolean veryLargeSess;

    /**
     * Checks if is chat.
     * 
     * @return the boolean
     */
    public Boolean isChat() {
        return chat;
    }

    /**
     * Sets the chat.
     * 
     * @param value the new chat
     */
    public void setChat(Boolean value) {
        this.chat = value;
    }

    /**
     * Checks if is poll.
     * 
     * @return the boolean
     */
    public Boolean isPoll() {
        return poll;
    }

    /**
     * Sets the poll.
     * 
     * @param value the new poll
     */
    public void setPoll(Boolean value) {
        this.poll = value;
    }

    /**
     * Checks if is audio video.
     * 
     * @return the boolean
     */
    public Boolean isAudioVideo() {
        return audioVideo;
    }

    /**
     * Sets the audio video.
     * 
     * @param value the new audio video
     */
    public void setAudioVideo(Boolean value) {
        this.audioVideo = value;
    }

    /**
     * Checks if is file share.
     * 
     * @return the boolean
     */
    public Boolean isFileShare() {
        return fileShare;
    }

    /**
     * Sets the file share.
     * 
     * @param value the new file share
     */
    public void setFileShare(Boolean value) {
        this.fileShare = value;
    }

    /**
     * Checks if is presentation.
     * 
     * @return the boolean
     */
    public Boolean isPresentation() {
        return presentation;
    }

    /**
     * Sets the presentation.
     * 
     * @param value the new presentation
     */
    public void setPresentation(Boolean value) {
        this.presentation = value;
    }

    /**
     * Checks if is application share.
     * 
     * @return the boolean
     */
    public Boolean isApplicationShare() {
        return applicationShare;
    }

    /**
     * Sets the application share.
     * 
     * @param value the new application share
     */
    public void setApplicationShare(Boolean value) {
        this.applicationShare = value;
    }

    /**
     * Checks if is desktop share.
     * 
     * @return the boolean
     */
    public Boolean isDesktopShare() {
        return desktopShare;
    }

    /**
     * Sets the desktop share.
     * 
     * @param value the new desktop share
     */
    public void setDesktopShare(Boolean value) {
        this.desktopShare = value;
    }

    /**
     * Checks if is web tour.
     * 
     * @return the boolean
     */
    public Boolean isWebTour() {
        return webTour;
    }

    /**
     * Sets the web tour.
     * 
     * @param value the new web tour
     */
    public void setWebTour(Boolean value) {
        this.webTour = value;
    }

    /**
     * Checks if is training session record.
     * 
     * @return the boolean
     */
    public Boolean isTrainingSessionRecord() {
        return trainingSessionRecord;
    }

    /**
     * Sets the training session record.
     * 
     * @param value the new training session record
     */
    public void setTrainingSessionRecord(Boolean value) {
        this.trainingSessionRecord = value;
    }

    /**
     * Checks if is annotation.
     * 
     * @return the boolean
     */
    public Boolean isAnnotation() {
        return annotation;
    }

    /**
     * Sets the annotation.
     * 
     * @param value the new annotation
     */
    public void setAnnotation(Boolean value) {
        this.annotation = value;
    }

    /**
     * Checks if is import document.
     * 
     * @return the boolean
     */
    public Boolean isImportDocument() {
        return importDocument;
    }

    /**
     * Sets the import document.
     * 
     * @param value the new import document
     */
    public void setImportDocument(Boolean value) {
        this.importDocument = value;
    }

    /**
     * Checks if is save document.
     * 
     * @return the boolean
     */
    public Boolean isSaveDocument() {
        return saveDocument;
    }

    /**
     * Sets the save document.
     * 
     * @param value the new save document
     */
    public void setSaveDocument(Boolean value) {
        this.saveDocument = value;
    }

    /**
     * Checks if is print document.
     * 
     * @return the boolean
     */
    public Boolean isPrintDocument() {
        return printDocument;
    }

    /**
     * Sets the prints the document.
     * 
     * @param value the new prints the document
     */
    public void setPrintDocument(Boolean value) {
        this.printDocument = value;
    }

    /**
     * Checks if is pointer.
     * 
     * @return the boolean
     */
    public Boolean isPointer() {
        return pointer;
    }

    /**
     * Sets the pointer.
     * 
     * @param value the new pointer
     */
    public void setPointer(Boolean value) {
        this.pointer = value;
    }

    /**
     * Checks if is switch page.
     * 
     * @return the boolean
     */
    public Boolean isSwitchPage() {
        return switchPage;
    }

    /**
     * Sets the switch page.
     * 
     * @param value the new switch page
     */
    public void setSwitchPage(Boolean value) {
        this.switchPage = value;
    }

    /**
     * Checks if is full screen.
     * 
     * @return the boolean
     */
    public Boolean isFullScreen() {
        return fullScreen;
    }

    /**
     * Sets the full screen.
     * 
     * @param value the new full screen
     */
    public void setFullScreen(Boolean value) {
        this.fullScreen = value;
    }

    /**
     * Checks if is thumbnail.
     * 
     * @return the boolean
     */
    public Boolean isThumbnail() {
        return thumbnail;
    }

    /**
     * Sets the thumbnail.
     * 
     * @param value the new thumbnail
     */
    public void setThumbnail(Boolean value) {
        this.thumbnail = value;
    }

    /**
     * Checks if is zoom.
     * 
     * @return the boolean
     */
    public Boolean isZoom() {
        return zoom;
    }

    /**
     * Sets the zoom.
     * 
     * @param value the new zoom
     */
    public void setZoom(Boolean value) {
        this.zoom = value;
    }

    /**
     * Checks if is copy page.
     * 
     * @return the boolean
     */
    public Boolean isCopyPage() {
        return copyPage;
    }

    /**
     * Sets the copy page.
     * 
     * @param value the new copy page
     */
    public void setCopyPage(Boolean value) {
        this.copyPage = value;
    }

    /**
     * Checks if is rc app share.
     * 
     * @return the boolean
     */
    public Boolean isRcAppShare() {
        return rcAppShare;
    }

    /**
     * Sets the rc app share.
     * 
     * @param value the new rc app share
     */
    public void setRcAppShare(Boolean value) {
        this.rcAppShare = value;
    }

    /**
     * Checks if is rc desktop share.
     * 
     * @return the boolean
     */
    public Boolean isRcDesktopShare() {
        return rcDesktopShare;
    }

    /**
     * Sets the rc desktop share.
     * 
     * @param value the new rc desktop share
     */
    public void setRcDesktopShare(Boolean value) {
        this.rcDesktopShare = value;
    }

    /**
     * Checks if is rc web tour.
     * 
     * @return the boolean
     */
    public Boolean isRcWebTour() {
        return rcWebTour;
    }

    /**
     * Sets the rc web tour.
     * 
     * @param value the new rc web tour
     */
    public void setRcWebTour(Boolean value) {
        this.rcWebTour = value;
    }

    /**
     * Checks if is attendee record training session.
     * 
     * @return the boolean
     */
    public Boolean isAttendeeRecordTrainingSession() {
        return attendeeRecordTrainingSession;
    }

    /**
     * Sets the attendee record training session.
     * 
     * @param value the new attendee record training session
     */
    public void setAttendeeRecordTrainingSession(Boolean value) {
        this.attendeeRecordTrainingSession = value;
    }

    /**
     * Checks if is voip.
     * 
     * @return the boolean
     */
    public Boolean isVoip() {
        return voip;
    }

    /**
     * Sets the voip.
     * 
     * @param value the new voip
     */
    public void setVoip(Boolean value) {
        this.voip = value;
    }

    /**
     * Checks if is fax into training session.
     * 
     * @return the boolean
     */
    public Boolean isFaxIntoTrainingSession() {
        return faxIntoTrainingSession;
    }

    /**
     * Sets the fax into training session.
     * 
     * @param value the new fax into training session
     */
    public void setFaxIntoTrainingSession(Boolean value) {
        this.faxIntoTrainingSession = value;
    }

    /**
     * Checks if is auto delete after meeting end.
     * 
     * @return the boolean
     */
    public Boolean isAutoDeleteAfterMeetingEnd() {
        return autoDeleteAfterMeetingEnd;
    }

    /**
     * Sets the auto delete after meeting end.
     * 
     * @param value the new auto delete after meeting end
     */
    public void setAutoDeleteAfterMeetingEnd(Boolean value) {
        this.autoDeleteAfterMeetingEnd = value;
    }

    /**
     * Checks if is display quick start host.
     * 
     * @return the boolean
     */
    public Boolean isDisplayQuickStartHost() {
        return displayQuickStartHost;
    }

    /**
     * Sets the display quick start host.
     * 
     * @param value the new display quick start host
     */
    public void setDisplayQuickStartHost(Boolean value) {
        this.displayQuickStartHost = value;
    }

    /**
     * Checks if is display quick start attendees.
     * 
     * @return the boolean
     */
    public Boolean isDisplayQuickStartAttendees() {
        return displayQuickStartAttendees;
    }

    /**
     * Sets the display quick start attendees.
     * 
     * @param value the new display quick start attendees
     */
    public void setDisplayQuickStartAttendees(Boolean value) {
        this.displayQuickStartAttendees = value;
    }

    /**
     * Checks if is support qand a.
     * 
     * @return the boolean
     */
    public Boolean isSupportQandA() {
        return supportQandA;
    }

    /**
     * Sets the support qand a.
     * 
     * @param value the new support qand a
     */
    public void setSupportQandA(Boolean value) {
        this.supportQandA = value;
    }

    /**
     * Checks if is support feedback.
     * 
     * @return the boolean
     */
    public Boolean isSupportFeedback() {
        return supportFeedback;
    }

    /**
     * Sets the support feedback.
     * 
     * @param value the new support feedback
     */
    public void setSupportFeedback(Boolean value) {
        this.supportFeedback = value;
    }

    /**
     * Checks if is support breakout sessions.
     * 
     * @return the boolean
     */
    public Boolean isSupportBreakoutSessions() {
        return supportBreakoutSessions;
    }

    /**
     * Sets the support breakout sessions.
     * 
     * @param value the new support breakout sessions
     */
    public void setSupportBreakoutSessions(Boolean value) {
        this.supportBreakoutSessions = value;
    }

    /**
     * Checks if is support remote computer.
     * 
     * @return the boolean
     */
    public Boolean isSupportRemoteComputer() {
        return supportRemoteComputer;
    }

    /**
     * Sets the support remote computer.
     * 
     * @param value the new support remote computer
     */
    public void setSupportRemoteComputer(Boolean value) {
        this.supportRemoteComputer = value;
    }

    /**
     * Checks if is support share web content.
     * 
     * @return the boolean
     */
    public Boolean isSupportShareWebContent() {
        return supportShareWebContent;
    }

    /**
     * Sets the support share web content.
     * 
     * @param value the new support share web content
     */
    public void setSupportShareWebContent(Boolean value) {
        this.supportShareWebContent = value;
    }

    /**
     * Checks if is support ucf rich media.
     * 
     * @return the boolean
     */
    public Boolean isSupportUCFRichMedia() {
        return supportUCFRichMedia;
    }

    /**
     * Sets the support ucf rich media.
     * 
     * @param value the new support ucf rich media
     */
    public void setSupportUCFRichMedia(Boolean value) {
        this.supportUCFRichMedia = value;
    }

    /**
     * Checks if is network based record.
     * 
     * @return the boolean
     */
    public Boolean isNetworkBasedRecord() {
        return networkBasedRecord;
    }

    /**
     * Sets the network based record.
     * 
     * @param value the new network based record
     */
    public void setNetworkBasedRecord(Boolean value) {
        this.networkBasedRecord = value;
    }

    /**
     * Checks if is presenter breakout session.
     * 
     * @return the boolean
     */
    public Boolean isPresenterBreakoutSession() {
        return presenterBreakoutSession;
    }

    /**
     * Sets the presenter breakout session.
     * 
     * @param value the new presenter breakout session
     */
    public void setPresenterBreakoutSession(Boolean value) {
        this.presenterBreakoutSession = value;
    }

    /**
     * Checks if is attendee breakout session.
     * 
     * @return the boolean
     */
    public Boolean isAttendeeBreakoutSession() {
        return attendeeBreakoutSession;
    }

    /**
     * Sets the attendee breakout session.
     * 
     * @param value the new attendee breakout session
     */
    public void setAttendeeBreakoutSession(Boolean value) {
        this.attendeeBreakoutSession = value;
    }

    /**
     * Checks if is support panelists.
     * 
     * @return the boolean
     */
    public Boolean isSupportPanelists() {
        return supportPanelists;
    }

    /**
     * Sets the support panelists.
     * 
     * @param value the new support panelists
     */
    public void setSupportPanelists(Boolean value) {
        this.supportPanelists = value;
    }

    /**
     * Checks if is mute on entry.
     * 
     * @return the boolean
     */
    public Boolean isMuteOnEntry() {
        return muteOnEntry;
    }

    /**
     * Sets the mute on entry.
     * 
     * @param value the new mute on entry
     */
    public void setMuteOnEntry(Boolean value) {
        this.muteOnEntry = value;
    }

    /**
     * Checks if is multi video.
     * 
     * @return the boolean
     */
    public Boolean isMultiVideo() {
        return multiVideo;
    }

    /**
     * Sets the multi video.
     * 
     * @param value the new multi video
     */
    public void setMultiVideo(Boolean value) {
        this.multiVideo = value;
    }

    /**
     * Checks if is very large sess.
     * 
     * @return the boolean
     */
    public Boolean isVeryLargeSess() {
        return veryLargeSess;
    }

    /**
     * Sets the very large sess.
     * 
     * @param value the new very large sess
     */
    public void setVeryLargeSess(Boolean value) {
        this.veryLargeSess = value;
    }

}
