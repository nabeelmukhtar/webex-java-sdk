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
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * The Class GetRecordingInfoResponse.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRecordingInfoResponse", propOrder = {
    "basic",
    "playback",
    "fileAccess"
})
public class GetRecordingInfoResponse
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The basic. */
    protected GetRecordingInfoResponse.Basic basic;
    
    /** The playback. */
    protected RecordingPlaybackType playback;
    
    /** The file access. */
    protected GetRecordingInfoResponse.FileAccess fileAccess;

    /**
     * Gets the basic.
     * 
     * @return the basic
     */
    public GetRecordingInfoResponse.Basic getBasic() {
        return basic;
    }

    /**
     * Sets the basic.
     * 
     * @param value the new basic
     */
    public void setBasic(GetRecordingInfoResponse.Basic value) {
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
    public GetRecordingInfoResponse.FileAccess getFileAccess() {
        return fileAccess;
    }

    /**
     * Sets the file access.
     * 
     * @param value the new file access
     */
    public void setFileAccess(GetRecordingInfoResponse.FileAccess value) {
        this.fileAccess = value;
    }


    /**
     * The Class Basic.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "description"
    })
    public static class Basic
        extends RecordingBasicType
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The description. */
        protected String description;

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

    }


    /**
     * The Class FileAccess.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "password"
    })
    public static class FileAccess
        extends RecordingFileAccessType
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The password. */
        protected String password;

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
