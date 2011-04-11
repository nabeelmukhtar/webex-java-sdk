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

package com.webex.schemas._2002._06.service;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class MeetingAssistType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meetingAssistType", propOrder = {
    "assistRequest",
    "assistConfirm"
})
public class MeetingAssistType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The assist request. */
    protected AssistRequestType assistRequest;
    
    /** The assist confirm. */
    protected AssistConfirmedType assistConfirm;

    /**
     * Gets the assist request.
     * 
     * @return the assist request
     */
    public AssistRequestType getAssistRequest() {
        return assistRequest;
    }

    /**
     * Sets the assist request.
     * 
     * @param value the new assist request
     */
    public void setAssistRequest(AssistRequestType value) {
        this.assistRequest = value;
    }

    /**
     * Gets the assist confirm.
     * 
     * @return the assist confirm
     */
    public AssistConfirmedType getAssistConfirm() {
        return assistConfirm;
    }

    /**
     * Sets the assist confirm.
     * 
     * @param value the new assist confirm
     */
    public void setAssistConfirm(AssistConfirmedType value) {
        this.assistConfirm = value;
    }

}
