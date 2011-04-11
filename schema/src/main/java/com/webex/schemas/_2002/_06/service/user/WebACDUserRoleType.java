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

package com.webex.schemas._2002._06.service.user;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class WebACDUserRoleType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "webACDUserRoleType", propOrder = {
    "isAgent",
    "isMgr"
})
@XmlSeeAlso({
    com.webex.schemas._2002._06.service.user.LstsummaryUser.WebACD.class,
    com.webex.schemas._2002._06.service.user.UserType.WebACDPrefs.class
})
public class WebACDUserRoleType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The is agent. */
    protected Boolean isAgent;
    
    /** The is mgr. */
    protected Boolean isMgr;

    /**
     * Checks if is is agent.
     * 
     * @return the boolean
     */
    public Boolean isIsAgent() {
        return isAgent;
    }

    /**
     * Sets the checks if is agent.
     * 
     * @param value the new checks if is agent
     */
    public void setIsAgent(Boolean value) {
        this.isAgent = value;
    }

    /**
     * Checks if is is mgr.
     * 
     * @return the boolean
     */
    public Boolean isIsMgr() {
        return isMgr;
    }

    /**
     * Sets the checks if is mgr.
     * 
     * @param value the new checks if is mgr
     */
    public void setIsMgr(Boolean value) {
        this.isMgr = value;
    }

}
