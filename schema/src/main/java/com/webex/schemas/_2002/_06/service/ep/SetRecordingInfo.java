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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * The Class SetRecordingInfo.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setRecordingInfo", propOrder = {
    "recording",
    "isServiceRecording",
    "basic",
    "playback",
    "fileAccess"
})
public class SetRecordingInfo
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The recording. */
    @XmlElement(required = true)
    protected SetRecordingInfo.Recording recording;
    
    /** The is service recording. */
    protected Boolean isServiceRecording;
    
    /** The basic. */
    protected RecordingBasicType basic;
    
    /** The playback. */
    protected RecordingPlaybackType playback;
    
    /** The file access. */
    protected RecordingFileAccessType fileAccess;

    /**
     * Gets the recording.
     * 
     * @return the recording
     */
    public SetRecordingInfo.Recording getRecording() {
        return recording;
    }

    /**
     * Sets the recording.
     * 
     * @param value the new recording
     */
    public void setRecording(SetRecordingInfo.Recording value) {
        this.recording = value;
    }

    /**
     * Checks if is is service recording.
     * 
     * @return the boolean
     */
    public Boolean isIsServiceRecording() {
        return isServiceRecording;
    }

    /**
     * Sets the checks if is service recording.
     * 
     * @param value the new checks if is service recording
     */
    public void setIsServiceRecording(Boolean value) {
        this.isServiceRecording = value;
    }

    /**
     * Gets the basic.
     * 
     * @return the basic
     */
    public RecordingBasicType getBasic() {
        return basic;
    }

    /**
     * Sets the basic.
     * 
     * @param value the new basic
     */
    public void setBasic(RecordingBasicType value) {
        this.basic = value;
    }

    /**
     * Gets the playback.
     * 
     * @return the playback
     */
    public RecordingPlaybackType getPlayback() {
        return playback;
    }

    /**
     * Sets the playback.
     * 
     * @param value the new playback
     */
    public void setPlayback(RecordingPlaybackType value) {
        this.playback = value;
    }

    /**
     * Gets the file access.
     * 
     * @return the file access
     */
    public RecordingFileAccessType getFileAccess() {
        return fileAccess;
    }

    /**
     * Sets the file access.
     * 
     * @param value the new file access
     */
    public void setFileAccess(RecordingFileAccessType value) {
        this.fileAccess = value;
    }


    /**
     * The Class Recording.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "recordingID",
        "description",
        "password"
    })
    public static class Recording
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The recording id. */
        protected int recordingID;
        
        /** The description. */
        protected String description;
        
        /** The password. */
        protected String password;

        /**
         * Gets the recording id.
         * 
         * @return the recording id
         */
        public int getRecordingID() {
            return recordingID;
        }

        /**
         * Sets the recording id.
         * 
         * @param value the new recording id
         */
        public void setRecordingID(int value) {
            this.recordingID = value;
        }

        /**
         * Gets the description.
         * 
         * @return the description
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the description.
         * 
         * @param value the new description
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the password.
         * 
         * @return the password
         */
        public String getPassword() {
            return password;
        }

        /**
         * Sets the password.
         * 
         * @param value the new password
         */
        public void setPassword(String value) {
            this.password = value;
        }

    }

}
