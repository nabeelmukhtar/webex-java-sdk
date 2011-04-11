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

package com.webex.schemas._2002._06.service.ep;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class EnableOptionsType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enableOptionsType", propOrder = {
    "chat",
    "poll",
    "attendeeList",
    "fileShare",
    "presentation",
    "applicationShare",
    "desktopShare",
    "webTour",
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
    "faxIntoMeeting",
    "multiVideo",
    "voip"
})
public class EnableOptionsType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The chat. */
    protected Boolean chat;
    
    /** The poll. */
    protected Boolean poll;
    
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
    protected Boolean webTour;
    
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
    
    /** The fax into meeting. */
    protected Boolean faxIntoMeeting;
    
    /** The multi video. */
    protected Boolean multiVideo;
    
    /** The voip. */
    protected Boolean voip;

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

}
