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
 * The Class RecordingType.
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

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The recording id. */
    protected int recordingID;
    
    /** The host web ex id. */
    @XmlElement(required = true)
    protected String hostWebExID;
    
    /** The name. */
    @XmlElement(required = true)
    protected String name;
    
    /** The description. */
    @XmlElement(required = true)
    protected String description;
    
    /** The create time. */
    @XmlElement(required = true)
    protected String createTime;
    
    /** The time zone id. */
    protected int timeZoneID;
    
    /** The size. */
    protected float size;
    
    /** The stream url. */
    @XmlElement(required = true)
    protected String streamURL;
    
    /** The file url. */
    @XmlElement(required = true)
    protected String fileURL;
    
    /** The session key. */
    protected Long sessionKey;
    
    /** The tracking code. */
    protected TrackingType trackingCode;
    
    /** The recording type. */
    protected int recordingType;
    
    /** The duration. */
    protected long duration;
    
    /** The author. */
    protected String author;
    
    /** The listing. */
    protected ListingType listing;
    
    /** The format. */
    @XmlElement(required = true)
    protected String format;
    
    /** The service type. */
    protected ServiceTypeType serviceType;
    
    /** The password req. */
    protected Boolean passwordReq;
    
    /** The register req. */
    protected Boolean registerReq;
    
    /** The panelist. */
    protected String panelist;
    
    /** The post recording survey. */
    protected Boolean postRecordingSurvey;
    
    /** The conf id. */
    protected Long confID;

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
     * Gets the host web ex id.
     * 
     * @return the host web ex id
     */
    public String getHostWebExID() {
        return hostWebExID;
    }

    /**
     * Sets the host web ex id.
     * 
     * @param value the new host web ex id
     */
    public void setHostWebExID(String value) {
        this.hostWebExID = value;
    }

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     * 
     * @param value the new name
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the creates the time.
     * 
     * @return the creates the time
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * Sets the creates the time.
     * 
     * @param value the new creates the time
     */
    public void setCreateTime(String value) {
        this.createTime = value;
    }

    /**
     * Gets the time zone id.
     * 
     * @return the time zone id
     */
    public int getTimeZoneID() {
        return timeZoneID;
    }

    /**
     * Sets the time zone id.
     * 
     * @param value the new time zone id
     */
    public void setTimeZoneID(int value) {
        this.timeZoneID = value;
    }

    /**
     * Gets the size.
     * 
     * @return the size
     */
    public float getSize() {
        return size;
    }

    /**
     * Sets the size.
     * 
     * @param value the new size
     */
    public void setSize(float value) {
        this.size = value;
    }

    /**
     * Gets the stream url.
     * 
     * @return the stream url
     */
    public String getStreamURL() {
        return streamURL;
    }

    /**
     * Sets the stream url.
     * 
     * @param value the new stream url
     */
    public void setStreamURL(String value) {
        this.streamURL = value;
    }

    /**
     * Gets the file url.
     * 
     * @return the file url
     */
    public String getFileURL() {
        return fileURL;
    }

    /**
     * Sets the file url.
     * 
     * @param value the new file url
     */
    public void setFileURL(String value) {
        this.fileURL = value;
    }

    /**
     * Gets the session key.
     * 
     * @return the session key
     */
    public Long getSessionKey() {
        return sessionKey;
    }

    /**
     * Sets the session key.
     * 
     * @param value the new session key
     */
    public void setSessionKey(Long value) {
        this.sessionKey = value;
    }

    /**
     * Gets the tracking code.
     * 
     * @return the tracking code
     */
    public TrackingType getTrackingCode() {
        return trackingCode;
    }

    /**
     * Sets the tracking code.
     * 
     * @param value the new tracking code
     */
    public void setTrackingCode(TrackingType value) {
        this.trackingCode = value;
    }

    /**
     * Gets the recording type.
     * 
     * @return the recording type
     */
    public int getRecordingType() {
        return recordingType;
    }

    /**
     * Sets the recording type.
     * 
     * @param value the new recording type
     */
    public void setRecordingType(int value) {
        this.recordingType = value;
    }

    /**
     * Gets the duration.
     * 
     * @return the duration
     */
    public long getDuration() {
        return duration;
    }

    /**
     * Sets the duration.
     * 
     * @param value the new duration
     */
    public void setDuration(long value) {
        this.duration = value;
    }

    /**
     * Gets the author.
     * 
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author.
     * 
     * @param value the new author
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the listing.
     * 
     * @return the listing
     */
    public ListingType getListing() {
        return listing;
    }

    /**
     * Sets the listing.
     * 
     * @param value the new listing
     */
    public void setListing(ListingType value) {
        this.listing = value;
    }

    /**
     * Gets the format.
     * 
     * @return the format
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the format.
     * 
     * @param value the new format
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the service type.
     * 
     * @return the service type
     */
    public ServiceTypeType getServiceType() {
        return serviceType;
    }

    /**
     * Sets the service type.
     * 
     * @param value the new service type
     */
    public void setServiceType(ServiceTypeType value) {
        this.serviceType = value;
    }

    /**
     * Checks if is password req.
     * 
     * @return the boolean
     */
    public Boolean isPasswordReq() {
        return passwordReq;
    }

    /**
     * Sets the password req.
     * 
     * @param value the new password req
     */
    public void setPasswordReq(Boolean value) {
        this.passwordReq = value;
    }

    /**
     * Checks if is register req.
     * 
     * @return the boolean
     */
    public Boolean isRegisterReq() {
        return registerReq;
    }

    /**
     * Sets the register req.
     * 
     * @param value the new register req
     */
    public void setRegisterReq(Boolean value) {
        this.registerReq = value;
    }

    /**
     * Gets the panelist.
     * 
     * @return the panelist
     */
    public String getPanelist() {
        return panelist;
    }

    /**
     * Sets the panelist.
     * 
     * @param value the new panelist
     */
    public void setPanelist(String value) {
        this.panelist = value;
    }

    /**
     * Checks if is post recording survey.
     * 
     * @return the boolean
     */
    public Boolean isPostRecordingSurvey() {
        return postRecordingSurvey;
    }

    /**
     * Sets the post recording survey.
     * 
     * @param value the new post recording survey
     */
    public void setPostRecordingSurvey(Boolean value) {
        this.postRecordingSurvey = value;
    }

    /**
     * Gets the conf id.
     * 
     * @return the conf id
     */
    public Long getConfID() {
        return confID;
    }

    /**
     * Sets the conf id.
     * 
     * @param value the new conf id
     */
    public void setConfID(Long value) {
        this.confID = value;
    }

}
