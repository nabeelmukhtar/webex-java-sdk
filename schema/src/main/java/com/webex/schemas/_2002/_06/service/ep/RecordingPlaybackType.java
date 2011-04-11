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
 * The Class RecordingPlaybackType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recordingPlaybackType", propOrder = {
    "chat",
    "supportQandA",
    "video",
    "polling",
    "notes",
    "fileShare",
    "attendeeList",
    "toc",
    "range",
    "partialStart",
    "partialEnd",
    "includeNBRcontrols"
})
public class RecordingPlaybackType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The chat. */
    protected Boolean chat;
    
    /** The support qand a. */
    protected Boolean supportQandA;
    
    /** The video. */
    protected Boolean video;
    
    /** The polling. */
    protected Boolean polling;
    
    /** The notes. */
    protected Boolean notes;
    
    /** The file share. */
    protected Boolean fileShare;
    
    /** The attendee list. */
    protected Boolean attendeeList;
    
    /** The toc. */
    protected Boolean toc;
    
    /** The range. */
    protected PlaybackRangeType range;
    
    /** The partial start. */
    protected Long partialStart;
    
    /** The partial end. */
    protected Long partialEnd;
    
    /** The include nb rcontrols. */
    protected Boolean includeNBRcontrols;

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
     * Checks if is video.
     * 
     * @return the boolean
     */
    public Boolean isVideo() {
        return video;
    }

    /**
     * Sets the video.
     * 
     * @param value the new video
     */
    public void setVideo(Boolean value) {
        this.video = value;
    }

    /**
     * Checks if is polling.
     * 
     * @return the boolean
     */
    public Boolean isPolling() {
        return polling;
    }

    /**
     * Sets the polling.
     * 
     * @param value the new polling
     */
    public void setPolling(Boolean value) {
        this.polling = value;
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
     * Checks if is toc.
     * 
     * @return the boolean
     */
    public Boolean isToc() {
        return toc;
    }

    /**
     * Sets the toc.
     * 
     * @param value the new toc
     */
    public void setToc(Boolean value) {
        this.toc = value;
    }

    /**
     * Gets the range.
     * 
     * @return the range
     */
    public PlaybackRangeType getRange() {
        return range;
    }

    /**
     * Sets the range.
     * 
     * @param value the new range
     */
    public void setRange(PlaybackRangeType value) {
        this.range = value;
    }

    /**
     * Gets the partial start.
     * 
     * @return the partial start
     */
    public Long getPartialStart() {
        return partialStart;
    }

    /**
     * Sets the partial start.
     * 
     * @param value the new partial start
     */
    public void setPartialStart(Long value) {
        this.partialStart = value;
    }

    /**
     * Gets the partial end.
     * 
     * @return the partial end
     */
    public Long getPartialEnd() {
        return partialEnd;
    }

    /**
     * Sets the partial end.
     * 
     * @param value the new partial end
     */
    public void setPartialEnd(Long value) {
        this.partialEnd = value;
    }

    /**
     * Checks if is include nb rcontrols.
     * 
     * @return the boolean
     */
    public Boolean isIncludeNBRcontrols() {
        return includeNBRcontrols;
    }

    /**
     * Sets the include nb rcontrols.
     * 
     * @param value the new include nb rcontrols
     */
    public void setIncludeNBRcontrols(Boolean value) {
        this.includeNBRcontrols = value;
    }

}
