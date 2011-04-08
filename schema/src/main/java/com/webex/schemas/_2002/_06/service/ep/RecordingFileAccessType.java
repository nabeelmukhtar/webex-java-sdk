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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recordingFileAccessType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recordingFileAccessType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="registration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="attendeeView" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="attendeeDownload" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="endPlayURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recordingFileAccessType", propOrder = {
    "registration",
    "attendeeView",
    "attendeeDownload",
    "endPlayURL"
})
@XmlSeeAlso({
    com.webex.schemas._2002._06.service.ep.GetRecordingInfoResponse.FileAccess.class
})
public class RecordingFileAccessType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected Boolean registration;
    protected Boolean attendeeView;
    protected Boolean attendeeDownload;
    protected String endPlayURL;

    /**
     * Gets the value of the registration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegistration() {
        return registration;
    }

    /**
     * Sets the value of the registration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegistration(Boolean value) {
        this.registration = value;
    }

    /**
     * Gets the value of the attendeeView property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttendeeView() {
        return attendeeView;
    }

    /**
     * Sets the value of the attendeeView property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttendeeView(Boolean value) {
        this.attendeeView = value;
    }

    /**
     * Gets the value of the attendeeDownload property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttendeeDownload() {
        return attendeeDownload;
    }

    /**
     * Sets the value of the attendeeDownload property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttendeeDownload(Boolean value) {
        this.attendeeDownload = value;
    }

    /**
     * Gets the value of the endPlayURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndPlayURL() {
        return endPlayURL;
    }

    /**
     * Sets the value of the endPlayURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndPlayURL(String value) {
        this.endPlayURL = value;
    }

}
