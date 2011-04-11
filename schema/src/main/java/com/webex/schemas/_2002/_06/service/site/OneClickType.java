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

package com.webex.schemas._2002._06.service.site;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class OneClickType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oneClickType", propOrder = {
    "allowJoinUnlistMeeting",
    "requireApproveJoin"
})
public class OneClickType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The allow join unlist meeting. */
    protected Boolean allowJoinUnlistMeeting;
    
    /** The require approve join. */
    protected Boolean requireApproveJoin;

    /**
     * Checks if is allow join unlist meeting.
     * 
     * @return the boolean
     */
    public Boolean isAllowJoinUnlistMeeting() {
        return allowJoinUnlistMeeting;
    }

    /**
     * Sets the allow join unlist meeting.
     * 
     * @param value the new allow join unlist meeting
     */
    public void setAllowJoinUnlistMeeting(Boolean value) {
        this.allowJoinUnlistMeeting = value;
    }

    /**
     * Checks if is require approve join.
     * 
     * @return the boolean
     */
    public Boolean isRequireApproveJoin() {
        return requireApproveJoin;
    }

    /**
     * Sets the require approve join.
     * 
     * @param value the new require approve join
     */
    public void setRequireApproveJoin(Boolean value) {
        this.requireApproveJoin = value;
    }

}
