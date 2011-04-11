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


/**
 * The Class GetSalesSessionResponse.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSalesSessionResponse", propOrder = {
    "status",
    "hostKey",
    "eventID",
    "guestToken",
    "hostType"
})
public class GetSalesSessionResponse
    extends SalesSessionInstanceType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The status. */
    protected String status;
    
    /** The host key. */
    protected String hostKey;
    
    /** The event id. */
    protected Long eventID;
    
    /** The guest token. */
    protected String guestToken;
    
    /** The host type. */
    protected String hostType;

    /**
     * Gets the status.
     * 
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status.
     * 
     * @param value the new status
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the host key.
     * 
     * @return the host key
     */
    public String getHostKey() {
        return hostKey;
    }

    /**
     * Sets the host key.
     * 
     * @param value the new host key
     */
    public void setHostKey(String value) {
        this.hostKey = value;
    }

    /**
     * Gets the event id.
     * 
     * @return the event id
     */
    public Long getEventID() {
        return eventID;
    }

    /**
     * Sets the event id.
     * 
     * @param value the new event id
     */
    public void setEventID(Long value) {
        this.eventID = value;
    }

    /**
     * Gets the guest token.
     * 
     * @return the guest token
     */
    public String getGuestToken() {
        return guestToken;
    }

    /**
     * Sets the guest token.
     * 
     * @param value the new guest token
     */
    public void setGuestToken(String value) {
        this.guestToken = value;
    }

    /**
     * Gets the host type.
     * 
     * @return the host type
     */
    public String getHostType() {
        return hostType;
    }

    /**
     * Sets the host type.
     * 
     * @param value the new host type
     */
    public void setHostType(String value) {
        this.hostType = value;
    }

}
