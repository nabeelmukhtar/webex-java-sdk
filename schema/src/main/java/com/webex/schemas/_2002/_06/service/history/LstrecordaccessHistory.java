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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.LstControlType;


/**
 * The Class LstrecordaccessHistory.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lstrecordaccessHistory", propOrder = {
    "creationTimeScope",
    "viewTimeScope",
    "order",
    "listControl",
    "timeZoneID",
    "recordName",
    "hostWebExID"
})
public class LstrecordaccessHistory
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The creation time scope. */
    protected CreationTimeScopeType creationTimeScope;
    
    /** The view time scope. */
    protected ViewTimeScopeType viewTimeScope;
    
    /** The order. */
    protected OrderRecAccHisType order;
    
    /** The list control. */
    protected LstControlType listControl;
    
    /** The time zone id. */
    @XmlElement(defaultValue = "-1")
    protected Integer timeZoneID;
    
    /** The record name. */
    protected String recordName;
    
    /** The host web ex id. */
    protected String hostWebExID;

    /**
     * Gets the creation time scope.
     * 
     * @return the creation time scope
     */
    public CreationTimeScopeType getCreationTimeScope() {
        return creationTimeScope;
    }

    /**
     * Sets the creation time scope.
     * 
     * @param value the new creation time scope
     */
    public void setCreationTimeScope(CreationTimeScopeType value) {
        this.creationTimeScope = value;
    }

    /**
     * Gets the view time scope.
     * 
     * @return the view time scope
     */
    public ViewTimeScopeType getViewTimeScope() {
        return viewTimeScope;
    }

    /**
     * Sets the view time scope.
     * 
     * @param value the new view time scope
     */
    public void setViewTimeScope(ViewTimeScopeType value) {
        this.viewTimeScope = value;
    }

    /**
     * Gets the order.
     * 
     * @return the order
     */
    public OrderRecAccHisType getOrder() {
        return order;
    }

    /**
     * Sets the order.
     * 
     * @param value the new order
     */
    public void setOrder(OrderRecAccHisType value) {
        this.order = value;
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

    /**
     * Gets the record name.
     * 
     * @return the record name
     */
    public String getRecordName() {
        return recordName;
    }

    /**
     * Sets the record name.
     * 
     * @param value the new record name
     */
    public void setRecordName(String value) {
        this.recordName = value;
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

}
