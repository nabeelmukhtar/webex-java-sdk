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
 * The Class ResourceRestrictionsType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resourceRestrictionsType", propOrder = {
    "isLicenseManager",
    "concurrentLicense",
    "fileFolderCapacity",
    "maxConcurrentEvents",
    "archiveStorageLimit"
})
public class ResourceRestrictionsType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The is license manager. */
    protected boolean isLicenseManager;
    
    /** The concurrent license. */
    protected Long concurrentLicense;
    
    /** The file folder capacity. */
    protected Long fileFolderCapacity;
    
    /** The max concurrent events. */
    protected Long maxConcurrentEvents;
    
    /** The archive storage limit. */
    protected Long archiveStorageLimit;

    /**
     * Checks if is checks if is license manager.
     * 
     * @return true, if is checks if is license manager
     */
    public boolean isIsLicenseManager() {
        return isLicenseManager;
    }

    /**
     * Sets the checks if is license manager.
     * 
     * @param value the new checks if is license manager
     */
    public void setIsLicenseManager(boolean value) {
        this.isLicenseManager = value;
    }

    /**
     * Gets the concurrent license.
     * 
     * @return the concurrent license
     */
    public Long getConcurrentLicense() {
        return concurrentLicense;
    }

    /**
     * Sets the concurrent license.
     * 
     * @param value the new concurrent license
     */
    public void setConcurrentLicense(Long value) {
        this.concurrentLicense = value;
    }

    /**
     * Gets the file folder capacity.
     * 
     * @return the file folder capacity
     */
    public Long getFileFolderCapacity() {
        return fileFolderCapacity;
    }

    /**
     * Sets the file folder capacity.
     * 
     * @param value the new file folder capacity
     */
    public void setFileFolderCapacity(Long value) {
        this.fileFolderCapacity = value;
    }

    /**
     * Gets the max concurrent events.
     * 
     * @return the max concurrent events
     */
    public Long getMaxConcurrentEvents() {
        return maxConcurrentEvents;
    }

    /**
     * Sets the max concurrent events.
     * 
     * @param value the new max concurrent events
     */
    public void setMaxConcurrentEvents(Long value) {
        this.maxConcurrentEvents = value;
    }

    /**
     * Gets the archive storage limit.
     * 
     * @return the archive storage limit
     */
    public Long getArchiveStorageLimit() {
        return archiveStorageLimit;
    }

    /**
     * Sets the archive storage limit.
     * 
     * @param value the new archive storage limit
     */
    public void setArchiveStorageLimit(Long value) {
        this.archiveStorageLimit = value;
    }

}
