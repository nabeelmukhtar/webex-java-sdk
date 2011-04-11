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

package com.webex.schemas._2002._06.service.attendee;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.LstControlType;


/**
 * The Class LstMeetingAttendee.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lstMeetingAttendee", propOrder = {
    "listControl",
    "order",
    "meetingKey",
    "sessionKey",
    "joinStatus",
    "confID",
    "inclHistory"
})
public class LstMeetingAttendee
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The list control. */
    protected LstControlType listControl;
    
    /** The order. */
    protected OrderType order;
    
    /** The meeting key. */
    protected Long meetingKey;
    
    /** The session key. */
    protected Long sessionKey;
    
    /** The join status. */
    protected JoinStatusType joinStatus;
    
    /** The conf id. */
    protected Long confID;
    
    /** The incl history. */
    protected Boolean inclHistory;

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
    public OrderType getOrder() {
        return order;
    }

    /**
     * Sets the order.
     * 
     * @param value the new order
     */
    public void setOrder(OrderType value) {
        this.order = value;
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
     * Gets the join status.
     * 
     * @return the join status
     */
    public JoinStatusType getJoinStatus() {
        return joinStatus;
    }

    /**
     * Sets the join status.
     * 
     * @param value the new join status
     */
    public void setJoinStatus(JoinStatusType value) {
        this.joinStatus = value;
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
     * Checks if is incl history.
     * 
     * @return the boolean
     */
    public Boolean isInclHistory() {
        return inclHistory;
    }

    /**
     * Sets the incl history.
     * 
     * @param value the new incl history
     */
    public void setInclHistory(Boolean value) {
        this.inclHistory = value;
    }

}
