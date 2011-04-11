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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.ResultTypeType;


/**
 * The Class DelUserStatusType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delUserStatusType", propOrder = {
    "webExId",
    "status"
})
public class DelUserStatusType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The web ex id. */
    @XmlElement(required = true)
    protected String webExId;
    
    /** The status. */
    @XmlElement(required = true)
    protected ResultTypeType status;

    /**
     * Gets the web ex id.
     * 
     * @return the web ex id
     */
    public String getWebExId() {
        return webExId;
    }

    /**
     * Sets the web ex id.
     * 
     * @param value the new web ex id
     */
    public void setWebExId(String value) {
        this.webExId = value;
    }

    /**
     * Gets the status.
     * 
     * @return the status
     */
    public ResultTypeType getStatus() {
        return status;
    }

    /**
     * Sets the status.
     * 
     * @param value the new status
     */
    public void setStatus(ResultTypeType value) {
        this.status = value;
    }

}
