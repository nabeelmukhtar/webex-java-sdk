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
 * <p>Java class for getRecordingInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRecordingInfoResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="basic" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.webex.com/schemas/2002/06/service/ep}recordingBasicType">
 *                 &lt;sequence>
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="playback" type="{http://www.webex.com/schemas/2002/06/service/ep}recordingPlaybackType" minOccurs="0"/>
 *         &lt;element name="fileAccess" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.webex.com/schemas/2002/06/service/ep}recordingFileAccessType">
 *                 &lt;sequence>
 *                   &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
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

    private final static long serialVersionUID = 2461660169443089969L;
    protected GetRecordingInfoResponse.Basic basic;
    protected RecordingPlaybackType playback;
    protected GetRecordingInfoResponse.FileAccess fileAccess;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link GetRecordingInfoResponse.Basic }
     *     
     */
    public GetRecordingInfoResponse.Basic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRecordingInfoResponse.Basic }
     *     
     */
    public void setBasic(GetRecordingInfoResponse.Basic value) {
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
     *     {@link GetRecordingInfoResponse.FileAccess }
     *     
     */
    public GetRecordingInfoResponse.FileAccess getFileAccess() {
        return fileAccess;
    }

    /**
     * Sets the value of the fileAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRecordingInfoResponse.FileAccess }
     *     
     */
    public void setFileAccess(GetRecordingInfoResponse.FileAccess value) {
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
     *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/ep}recordingBasicType">
     *       &lt;sequence>
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "description"
    })
    public static class Basic
        extends RecordingBasicType
        implements Serializable
    {

        private final static long serialVersionUID = 2461660169443089969L;
        protected String description;

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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/ep}recordingFileAccessType">
     *       &lt;sequence>
     *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "password"
    })
    public static class FileAccess
        extends RecordingFileAccessType
        implements Serializable
    {

        private final static long serialVersionUID = 2461660169443089969L;
        protected String password;

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
