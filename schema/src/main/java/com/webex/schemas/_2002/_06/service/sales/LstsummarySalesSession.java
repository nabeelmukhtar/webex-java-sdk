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

package com.webex.schemas._2002._06.service.sales;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.LstControlType;


/**
 * The Class LstsummarySalesSession.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lstsummarySalesSession", propOrder = {
    "listControl",
    "order",
    "dateScope",
    "meetingKey",
    "hostWebExID",
    "account",
    "opportunity"
})
public class LstsummarySalesSession
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The list control. */
    protected LstControlType listControl;
    
    /** The order. */
    protected OrderType order;
    
    /** The date scope. */
    protected DateScopeType dateScope;
    
    /** The meeting key. */
    protected Long meetingKey;
    
    /** The host web ex id. */
    protected String hostWebExID;
    
    /** The account. */
    protected String account;
    
    /** The opportunity. */
    protected String opportunity;

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
     * Gets the date scope.
     * 
     * @return the date scope
     */
    public DateScopeType getDateScope() {
        return dateScope;
    }

    /**
     * Sets the date scope.
     * 
     * @param value the new date scope
     */
    public void setDateScope(DateScopeType value) {
        this.dateScope = value;
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
     * Gets the account.
     * 
     * @return the account
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the account.
     * 
     * @param value the new account
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Gets the opportunity.
     * 
     * @return the opportunity
     */
    public String getOpportunity() {
        return opportunity;
    }

    /**
     * Sets the opportunity.
     * 
     * @param value the new opportunity
     */
    public void setOpportunity(String value) {
        this.opportunity = value;
    }

}
