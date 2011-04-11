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

package com.webex.schemas._2002._06.service.meeting;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class EnableOptionsType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enableOptionsType", propOrder = {
    "chat",
    "poll",
    "audioVideo",
    "attendeeList",
    "fileShare",
    "presentation",
    "applicationShare",
    "desktopShare",
    "webTour",
    "meetingRecord",
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
    "javaClient",
    "nativeClient",
    "attendeeRecordMeeting",
    "voip",
    "faxIntoMeeting",
    "enableReg",
    "supportQandA",
    "supportFeedback",
    "supportBreakoutSessions",
    "supportPanelists",
    "supportRemoteComputer",
    "supportShareWebContent",
    "supportUCFWebPages",
    "supportUCFRichMedia",
    "autoDeleteAfterMeetingEnd",
    "viewAnyDoc",
    "viewAnyPage",
    "allowContactPrivate",
    "chatHost",
    "chatPresenter",
    "chatAllAttendees",
    "multiVideo",
    "notes",
    "closedCaptions",
    "singleNote",
    "sendFeedback",
    "displayQuickStartHost",
    "displayQuickStartAttendees",
    "supportE2E",
    "supportPKI"
})
public class EnableOptionsType
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
    
    /** The attendee list. */
    protected Boolean attendeeList;
    
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
    
    /** The meeting record. */
    protected Boolean meetingRecord;
    
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
    
    /** The java client. */
    protected Boolean javaClient;
    
    /** The native client. */
    protected Boolean nativeClient;
    
    /** The attendee record meeting. */
    protected Boolean attendeeRecordMeeting;
    
    /** The voip. */
    protected Boolean voip;
    
    /** The fax into meeting. */
    protected Boolean faxIntoMeeting;
    
    /** The enable reg. */
    protected Boolean enableReg;
    
    /** The support qand a. */
    protected Boolean supportQandA;
    
    /** The support feedback. */
    protected Boolean supportFeedback;
    
    /** The support breakout sessions. */
    protected Boolean supportBreakoutSessions;
    
    /** The support panelists. */
    protected Boolean supportPanelists;
    
    /** The support remote computer. */
    protected Boolean supportRemoteComputer;
    
    /** The support share web content. */
    protected Boolean supportShareWebContent;
    
    /** The support ucf web pages. */
    protected Boolean supportUCFWebPages;
    
    /** The support ucf rich media. */
    protected Boolean supportUCFRichMedia;
    
    /** The auto delete after meeting end. */
    protected Boolean autoDeleteAfterMeetingEnd;
    
    /** The view any doc. */
    protected Boolean viewAnyDoc;
    
    /** The view any page. */
    protected Boolean viewAnyPage;
    
    /** The allow contact private. */
    protected Boolean allowContactPrivate;
    
    /** The chat host. */
    protected Boolean chatHost;
    
    /** The chat presenter. */
    protected Boolean chatPresenter;
    
    /** The chat all attendees. */
    protected Boolean chatAllAttendees;
    
    /** The multi video. */
    protected Boolean multiVideo;
    
    /** The notes. */
    protected Boolean notes;
    
    /** The closed captions. */
    protected Boolean closedCaptions;
    
    /** The single note. */
    protected Boolean singleNote;
    
    /** The send feedback. */
    protected Boolean sendFeedback;
    
    /** The display quick start host. */
    protected Boolean displayQuickStartHost;
    
    /** The display quick start attendees. */
    protected Boolean displayQuickStartAttendees;
    
    /** The support e2 e. */
    protected Boolean supportE2E;
    
    /** The support pki. */
    protected Boolean supportPKI;

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
     * Checks if is attendee list.
     * 
     * @return the boolean
     */
    public Boolean isAttendeeList() {
        return attendeeList;
    }

    /**
     * Sets the attendee list.
     * 
     * @param value the new attendee list
     */
    public void setAttendeeList(Boolean value) {
        this.attendeeList = value;
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
     * Checks if is meeting record.
     * 
     * @return the boolean
     */
    public Boolean isMeetingRecord() {
        return meetingRecord;
    }

    /**
     * Sets the meeting record.
     * 
     * @param value the new meeting record
     */
    public void setMeetingRecord(Boolean value) {
        this.meetingRecord = value;
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
     * Checks if is java client.
     * 
     * @return the boolean
     */
    public Boolean isJavaClient() {
        return javaClient;
    }

    /**
     * Sets the java client.
     * 
     * @param value the new java client
     */
    public void setJavaClient(Boolean value) {
        this.javaClient = value;
    }

    /**
     * Checks if is native client.
     * 
     * @return the boolean
     */
    public Boolean isNativeClient() {
        return nativeClient;
    }

    /**
     * Sets the native client.
     * 
     * @param value the new native client
     */
    public void setNativeClient(Boolean value) {
        this.nativeClient = value;
    }

    /**
     * Checks if is attendee record meeting.
     * 
     * @return the boolean
     */
    public Boolean isAttendeeRecordMeeting() {
        return attendeeRecordMeeting;
    }

    /**
     * Sets the attendee record meeting.
     * 
     * @param value the new attendee record meeting
     */
    public void setAttendeeRecordMeeting(Boolean value) {
        this.attendeeRecordMeeting = value;
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
     * Checks if is fax into meeting.
     * 
     * @return the boolean
     */
    public Boolean isFaxIntoMeeting() {
        return faxIntoMeeting;
    }

    /**
     * Sets the fax into meeting.
     * 
     * @param value the new fax into meeting
     */
    public void setFaxIntoMeeting(Boolean value) {
        this.faxIntoMeeting = value;
    }

    /**
     * Checks if is enable reg.
     * 
     * @return the boolean
     */
    public Boolean isEnableReg() {
        return enableReg;
    }

    /**
     * Sets the enable reg.
     * 
     * @param value the new enable reg
     */
    public void setEnableReg(Boolean value) {
        this.enableReg = value;
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
     * Checks if is support ucf web pages.
     * 
     * @return the boolean
     */
    public Boolean isSupportUCFWebPages() {
        return supportUCFWebPages;
    }

    /**
     * Sets the support ucf web pages.
     * 
     * @param value the new support ucf web pages
     */
    public void setSupportUCFWebPages(Boolean value) {
        this.supportUCFWebPages = value;
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
     * Checks if is view any doc.
     * 
     * @return the boolean
     */
    public Boolean isViewAnyDoc() {
        return viewAnyDoc;
    }

    /**
     * Sets the view any doc.
     * 
     * @param value the new view any doc
     */
    public void setViewAnyDoc(Boolean value) {
        this.viewAnyDoc = value;
    }

    /**
     * Checks if is view any page.
     * 
     * @return the boolean
     */
    public Boolean isViewAnyPage() {
        return viewAnyPage;
    }

    /**
     * Sets the view any page.
     * 
     * @param value the new view any page
     */
    public void setViewAnyPage(Boolean value) {
        this.viewAnyPage = value;
    }

    /**
     * Checks if is allow contact private.
     * 
     * @return the boolean
     */
    public Boolean isAllowContactPrivate() {
        return allowContactPrivate;
    }

    /**
     * Sets the allow contact private.
     * 
     * @param value the new allow contact private
     */
    public void setAllowContactPrivate(Boolean value) {
        this.allowContactPrivate = value;
    }

    /**
     * Checks if is chat host.
     * 
     * @return the boolean
     */
    public Boolean isChatHost() {
        return chatHost;
    }

    /**
     * Sets the chat host.
     * 
     * @param value the new chat host
     */
    public void setChatHost(Boolean value) {
        this.chatHost = value;
    }

    /**
     * Checks if is chat presenter.
     * 
     * @return the boolean
     */
    public Boolean isChatPresenter() {
        return chatPresenter;
    }

    /**
     * Sets the chat presenter.
     * 
     * @param value the new chat presenter
     */
    public void setChatPresenter(Boolean value) {
        this.chatPresenter = value;
    }

    /**
     * Checks if is chat all attendees.
     * 
     * @return the boolean
     */
    public Boolean isChatAllAttendees() {
        return chatAllAttendees;
    }

    /**
     * Sets the chat all attendees.
     * 
     * @param value the new chat all attendees
     */
    public void setChatAllAttendees(Boolean value) {
        this.chatAllAttendees = value;
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
     * Checks if is notes.
     * 
     * @return the boolean
     */
    public Boolean isNotes() {
        return notes;
    }

    /**
     * Sets the notes.
     * 
     * @param value the new notes
     */
    public void setNotes(Boolean value) {
        this.notes = value;
    }

    /**
     * Checks if is closed captions.
     * 
     * @return the boolean
     */
    public Boolean isClosedCaptions() {
        return closedCaptions;
    }

    /**
     * Sets the closed captions.
     * 
     * @param value the new closed captions
     */
    public void setClosedCaptions(Boolean value) {
        this.closedCaptions = value;
    }

    /**
     * Checks if is single note.
     * 
     * @return the boolean
     */
    public Boolean isSingleNote() {
        return singleNote;
    }

    /**
     * Sets the single note.
     * 
     * @param value the new single note
     */
    public void setSingleNote(Boolean value) {
        this.singleNote = value;
    }

    /**
     * Checks if is send feedback.
     * 
     * @return the boolean
     */
    public Boolean isSendFeedback() {
        return sendFeedback;
    }

    /**
     * Sets the send feedback.
     * 
     * @param value the new send feedback
     */
    public void setSendFeedback(Boolean value) {
        this.sendFeedback = value;
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

}
