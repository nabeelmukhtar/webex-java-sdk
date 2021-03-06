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
import com.webex.schemas._2002._06.common.ListingType;
import com.webex.schemas._2002._06.common.ServiceTypeType;
import com.webex.schemas._2002._06.common.TrackingType;


/**
 * <p>Java class for recordingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recordingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recordingID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hostWebExID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeZoneID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="streamURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fileURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sessionKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="trackingCode" type="{http://www.webex.com/schemas/2002/06/common}trackingType" minOccurs="0"/>
 *         &lt;element name="recordingType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listing" type="{http://www.webex.com/schemas/2002/06/common}listingType" minOccurs="0"/>
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceType" type="{http://www.webex.com/schemas/2002/06/common}serviceTypeType" minOccurs="0"/>
 *         &lt;element name="passwordReq" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="registerReq" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="panelist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postRecordingSurvey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="confID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recordingType", propOrder = {
    "recordingID",
    "hostWebExID",
    "name",
    "description",
    "createTime",
    "timeZoneID",
    "size",
    "streamURL",
    "fileURL",
    "sessionKey",
    "trackingCode",
    "recordingType",
    "duration",
    "author",
    "listing",
    "format",
    "serviceType",
    "passwordReq",
    "registerReq",
    "panelist",
    "postRecordingSurvey",
    "confID"
})
public class RecordingType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected int recordingID;
    @XmlElement(required = true)
    protected String hostWebExID;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String createTime;
    protected int timeZoneID;
    protected float size;
    @XmlElement(required = true)
    protected String streamURL;
    @XmlElement(required = true)
    protected String fileURL;
    protected Long sessionKey;
    protected TrackingType trackingCode;
    protected int recordingType;
    protected long duration;
    protected String author;
    protected ListingType listing;
    @XmlElement(required = true)
    protected String format;
    protected ServiceTypeType serviceType;
    protected Boolean passwordReq;
    protected Boolean registerReq;
    protected String panelist;
    protected Boolean postRecordingSurvey;
    protected Long confID;

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
     * Gets the value of the hostWebExID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostWebExID() {
        return hostWebExID;
    }

    /**
     * Sets the value of the hostWebExID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostWebExID(String value) {
        this.hostWebExID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateTime(String value) {
        this.createTime = value;
    }

    /**
     * Gets the value of the timeZoneID property.
     * 
     */
    public int getTimeZoneID() {
        return timeZoneID;
    }

    /**
     * Sets the value of the timeZoneID property.
     * 
     */
    public void setTimeZoneID(int value) {
        this.timeZoneID = value;
    }

    /**
     * Gets the value of the size property.
     * 
     */
    public float getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     */
    public void setSize(float value) {
        this.size = value;
    }

    /**
     * Gets the value of the streamURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreamURL() {
        return streamURL;
    }

    /**
     * Sets the value of the streamURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreamURL(String value) {
        this.streamURL = value;
    }

    /**
     * Gets the value of the fileURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileURL() {
        return fileURL;
    }

    /**
     * Sets the value of the fileURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileURL(String value) {
        this.fileURL = value;
    }

    /**
     * Gets the value of the sessionKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSessionKey() {
        return sessionKey;
    }

    /**
     * Sets the value of the sessionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSessionKey(Long value) {
        this.sessionKey = value;
    }

    /**
     * Gets the value of the trackingCode property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingType }
     *     
     */
    public TrackingType getTrackingCode() {
        return trackingCode;
    }

    /**
     * Sets the value of the trackingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingType }
     *     
     */
    public void setTrackingCode(TrackingType value) {
        this.trackingCode = value;
    }

    /**
     * Gets the value of the recordingType property.
     * 
     */
    public int getRecordingType() {
        return recordingType;
    }

    /**
     * Sets the value of the recordingType property.
     * 
     */
    public void setRecordingType(int value) {
        this.recordingType = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     */
    public long getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     */
    public void setDuration(long value) {
        this.duration = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the listing property.
     * 
     * @return
     *     possible object is
     *     {@link ListingType }
     *     
     */
    public ListingType getListing() {
        return listing;
    }

    /**
     * Sets the value of the listing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingType }
     *     
     */
    public void setListing(ListingType value) {
        this.listing = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceTypeType }
     *     
     */
    public ServiceTypeType getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceTypeType }
     *     
     */
    public void setServiceType(ServiceTypeType value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the passwordReq property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPasswordReq() {
        return passwordReq;
    }

    /**
     * Sets the value of the passwordReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPasswordReq(Boolean value) {
        this.passwordReq = value;
    }

    /**
     * Gets the value of the registerReq property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegisterReq() {
        return registerReq;
    }

    /**
     * Sets the value of the registerReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegisterReq(Boolean value) {
        this.registerReq = value;
    }

    /**
     * Gets the value of the panelist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPanelist() {
        return panelist;
    }

    /**
     * Sets the value of the panelist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPanelist(String value) {
        this.panelist = value;
    }

    /**
     * Gets the value of the postRecordingSurvey property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPostRecordingSurvey() {
        return postRecordingSurvey;
    }

    /**
     * Sets the value of the postRecordingSurvey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPostRecordingSurvey(Boolean value) {
        this.postRecordingSurvey = value;
    }

    /**
     * Gets the value of the confID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConfID() {
        return confID;
    }

    /**
     * Sets the value of the confID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConfID(Long value) {
        this.confID = value;
    }

}
