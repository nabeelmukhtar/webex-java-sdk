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
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * The Class ActivateUser.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "activateUser", propOrder = {
    "userID",
    "webexID"
})
public class ActivateUser
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The user id. */
    protected Long userID;
    
    /** The webex id. */
    protected String webexID;

    /**
     * Gets the user id.
     * 
     * @return the user id
     */
    public Long getUserID() {
        return userID;
    }

    /**
     * Sets the user id.
     * 
     * @param value the new user id
     */
    public void setUserID(Long value) {
        this.userID = value;
    }

    /**
     * Gets the webex id.
     * 
     * @return the webex id
     */
    public String getWebexID() {
        return webexID;
    }

    /**
     * Sets the webex id.
     * 
     * @param value the new webex id
     */
    public void setWebexID(String value) {
        this.webexID = value;
    }

}
