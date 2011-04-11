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
 * The Class LockDownPTType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lockDownPTType", propOrder = {
    "lockDown",
    "version"
})
public class LockDownPTType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The lock down. */
    protected Boolean lockDown;
    
    /** The version. */
    protected String version;

    /**
     * Checks if is lock down.
     * 
     * @return the boolean
     */
    public Boolean isLockDown() {
        return lockDown;
    }

    /**
     * Sets the lock down.
     * 
     * @param value the new lock down
     */
    public void setLockDown(Boolean value) {
        this.lockDown = value;
    }

    /**
     * Gets the version.
     * 
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the version.
     * 
     * @param value the new version
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
