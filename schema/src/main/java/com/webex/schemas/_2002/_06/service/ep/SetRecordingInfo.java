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
 * <p>Java class for setRecordingInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setRecordingInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="recording">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="recordingID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="isServiceRecording" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="basic" type="{http://www.webex.com/schemas/2002/06/service/ep}recordingBasicType" minOccurs="0"/>
 *         &lt;element name="playback" type="{http://www.webex.com/schemas/2002/06/service/ep}recordingPlaybackType" minOccurs="0"/>
 *         &lt;element name="fileAccess" type="{http://www.webex.com/schemas/2002/06/service/ep}recordingFileAccessType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
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

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected SetRecordingInfo.Recording recording;
    protected Boolean isServiceRecording;
    protected RecordingBasicType basic;
    protected RecordingPlaybackType playback;
    protected RecordingFileAccessType fileAccess;

    /**
     * Gets the value of the recording property.
     * 
     * @return
     *     possible object is
     *     {@link SetRecordingInfo.Recording }
     *     
     */
    public SetRecordingInfo.Recording getRecording() {
        return recording;
    }

    /**
     * Sets the value of the recording property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetRecordingInfo.Recording }
     *     
     */
    public void setRecording(SetRecordingInfo.Recording value) {
        this.recording = value;
    }

    /**
     * Gets the value of the isServiceRecording property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsServiceRecording() {
        return isServiceRecording;
    }

    /**
     * Sets the value of the isServiceRecording property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsServiceRecording(Boolean value) {
        this.isServiceRecording = value;
    }

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link RecordingBasicType }
     *     
     */
    public RecordingBasicType getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordingBasicType }
     *     
     */
    public void setBasic(RecordingBasicType value) {
        this.basic = value;
    }

    /**
     * Gets the value of the playback property.
     * 
     * @return
     *     possible object is
     *     {@link RecordingPlaybackType }
     *     
     */
    public RecordingPlaybackType getPlayback() {
        return playback;
    }

    /**
     * Sets the value of the playback property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordingPlaybackType }
     *     
     */
    public void setPlayback(RecordingPlaybackType value) {
        this.playback = value;
    }

    /**
     * Gets the value of the fileAccess property.
     * 
     * @return
     *     possible object is
     *     {@link RecordingFileAccessType }
     *     
     */
    public RecordingFileAccessType getFileAccess() {
        return fileAccess;
    }

    /**
     * Sets the value of the fileAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordingFileAccessType }
     *     
     */
    public void setFileAccess(RecordingFileAccessType value) {
        this.fileAccess = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="recordingID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
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

        private final static long serialVersionUID = 2461660169443089969L;
        protected int recordingID;
        protected String description;
        protected String password;

        /**
         * Gets the value of the recordingID property.
         * 
         */
        public int getRecordingID() {
            return recordingID;
        }

        /**
         * Sets the value of the recordingID property.
         * 
         */
        public void setRecordingID(int value) {
            this.recordingID = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the password property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassword() {
            return password;
        }

        /**
         * Sets the value of the password property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassword(String value) {
            this.password = value;
        }

    }

}
