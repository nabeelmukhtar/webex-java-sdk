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

package com.webex.schemas._2002._06.service.history;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.LstControlType;


/**
 * The Class LstmeetingusageHistory.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lstmeetingusageHistory", propOrder = {
    "listControl",
    "order",
    "confName",
    "meetingKey",
    "startTimeScope",
    "hostWebExID",
    "endTimeScope",
    "confID",
    "inclAudioOnly",
    "timeZoneID"
})
@XmlSeeAlso({
    LstsalesSessionHistory.class
})
public class LstmeetingusageHistory
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The list control. */
    protected LstControlType listControl;
    
    /** The order. */
    protected OrderMCHisType order;
    
    /** The conf name. */
    protected String confName;
    
    /** The meeting key. */
    protected Long meetingKey;
    
    /** The start time scope. */
    protected StartTimeScopeType startTimeScope;
    
    /** The host web ex id. */
    protected String hostWebExID;
    
    /** The end time scope. */
    protected EndTimeScopeType endTimeScope;
    
    /** The conf id. */
    protected Long confID;
    
    /** The incl audio only. */
    protected Boolean inclAudioOnly;
    
    /** The time zone id. */
    protected Integer timeZoneID;

    /**
     * Gets the list control.
     * 
     * @return the list control
     */
    public LstControlType getListControl() {
        return listControl;
    }

    /**
     * Sets the list control.
     * 
     * @param value the new list control
     */
    public void setListControl(LstControlType value) {
        this.listControl = value;
    }

    /**
     * Gets the order.
     * 
     * @return the order
     */
    public OrderMCHisType getOrder() {
        return order;
    }

    /**
     * Sets the order.
     * 
     * @param value the new order
     */
    public void setOrder(OrderMCHisType value) {
        this.order = value;
    }

    /**
     * Gets the conf name.
     * 
     * @return the conf name
     */
    public String getConfName() {
        return confName;
    }

    /**
     * Sets the conf name.
     * 
     * @param value the new conf name
     */
    public void setConfName(String value) {
        this.confName = value;
    }

    /**
     * Gets the meeting key.
     * 
     * @return the meeting key
     */
    public Long getMeetingKey() {
        return meetingKey;
    }

    /**
     * Sets the meeting key.
     * 
     * @param value the new meeting key
     */
    public void setMeetingKey(Long value) {
        this.meetingKey = value;
    }

    /**
     * Gets the start time scope.
     * 
     * @return the start time scope
     */
    public StartTimeScopeType getStartTimeScope() {
        return startTimeScope;
    }

    /**
     * Sets the start time scope.
     * 
     * @param value the new start time scope
     */
    public void setStartTimeScope(StartTimeScopeType value) {
        this.startTimeScope = value;
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
     * Gets the end time scope.
     * 
     * @return the end time scope
     */
    public EndTimeScopeType getEndTimeScope() {
        return endTimeScope;
    }

    /**
     * Sets the end time scope.
     * 
     * @param value the new end time scope
     */
    public void setEndTimeScope(EndTimeScopeType value) {
        this.endTimeScope = value;
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

    /**
     * Checks if is incl audio only.
     * 
     * @return the boolean
     */
    public Boolean isInclAudioOnly() {
        return inclAudioOnly;
    }

    /**
     * Sets the incl audio only.
     * 
     * @param value the new incl audio only
     */
    public void setInclAudioOnly(Boolean value) {
        this.inclAudioOnly = value;
    }

    /**
     * Gets the time zone id.
     * 
     * @return the time zone id
     */
    public Integer getTimeZoneID() {
        return timeZoneID;
    }

    /**
     * Sets the time zone id.
     * 
     * @param value the new time zone id
     */
    public void setTimeZoneID(Integer value) {
        this.timeZoneID = value;
    }

}
