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
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.LstControlType;


/**
 * The Class LstsupportattendeeHistory.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lstsupportattendeeHistory", propOrder = {
    "sessionKey",
    "listControl",
    "order",
    "startTimeScope",
    "endTimeScope",
    "confID"
})
public class LstsupportattendeeHistory
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The session key. */
    protected Long sessionKey;
    
    /** The list control. */
    protected LstControlType listControl;
    
    /** The order. */
    protected OrderScAttenHisType order;
    
    /** The start time scope. */
    protected StartTimeScopeType startTimeScope;
    
    /** The end time scope. */
    protected EndTimeScopeType endTimeScope;
    
    /** The conf id. */
    protected Long confID;

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
    public OrderScAttenHisType getOrder() {
        return order;
    }

    /**
     * Sets the order.
     * 
     * @param value the new order
     */
    public void setOrder(OrderScAttenHisType value) {
        this.order = value;
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

}
