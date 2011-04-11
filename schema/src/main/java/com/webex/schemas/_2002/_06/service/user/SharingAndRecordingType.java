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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.RecordingType;
import com.webex.schemas._2002._06.common.SharingViewType;


/**
 * <p>Java class for sharingAndRecordingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sharingAndRecordingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sharingView" type="{http://www.webex.com/schemas/2002/06/common}sharingViewType" minOccurs="0"/>
 *         &lt;element name="sharingColor" type="{http://www.webex.com/schemas/2002/06/common}sharingColorType" minOccurs="0"/>
 *         &lt;element name="recording" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="enforce" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="type" type="{http://www.webex.com/schemas/2002/06/common}recordingType" minOccurs="0"/>
 *                   &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sharingAndRecordingType", propOrder = {
    "sharingView",
    "sharingColor",
    "recording"
})
@XmlSeeAlso({
    com.webex.schemas._2002._06.service.user.UserType.RemoteSupport.class
})
public class SharingAndRecordingType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected SharingViewType sharingView;
    protected String sharingColor;
    protected SharingAndRecordingType.Recording recording;

    /**
     * Gets the value of the sharingView property.
     * 
     * @return
     *     possible object is
     *     {@link SharingViewType }
     *     
     */
    public SharingViewType getSharingView() {
        return sharingView;
    }

    /**
     * Sets the value of the sharingView property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharingViewType }
     *     
     */
    public void setSharingView(SharingViewType value) {
        this.sharingView = value;
    }

    /**
     * Gets the value of the sharingColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharingColor() {
        return sharingColor;
    }

    /**
     * Sets the value of the sharingColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharingColor(String value) {
        this.sharingColor = value;
    }

    /**
     * Gets the value of the recording property.
     * 
     * @return
     *     possible object is
     *     {@link SharingAndRecordingType.Recording }
     *     
     */
    public SharingAndRecordingType.Recording getRecording() {
        return recording;
    }

    /**
     * Sets the value of the recording property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharingAndRecordingType.Recording }
     *     
     */
    public void setRecording(SharingAndRecordingType.Recording value) {
        this.recording = value;
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
     *         &lt;element name="enforce" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="type" type="{http://www.webex.com/schemas/2002/06/common}recordingType" minOccurs="0"/>
     *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "enforce",
        "type",
        "location"
    })
    public static class Recording
        implements Serializable
    {

        private final static long serialVersionUID = 2461660169443089969L;
        protected boolean enforce;
        protected RecordingType type;
        protected String location;

        /**
         * Gets the value of the enforce property.
         * 
         */
        public boolean isEnforce() {
            return enforce;
        }

        /**
         * Sets the value of the enforce property.
         * 
         */
        public void setEnforce(boolean value) {
            this.enforce = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link RecordingType }
         *     
         */
        public RecordingType getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link RecordingType }
         *     
         */
        public void setType(RecordingType value) {
            this.type = value;
        }

        /**
         * Gets the value of the location property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocation() {
            return location;
        }

        /**
         * Sets the value of the location property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocation(String value) {
            this.location = value;
        }

    }

}
