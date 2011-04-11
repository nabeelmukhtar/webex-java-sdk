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
 * The Class MenuType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "menuType", propOrder = {
    "userGuides",
    "downloads",
    "training",
    "contactUs",
    "supportMyResources"
})
public class MenuType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The user guides. */
    protected UrlType userGuides;
    
    /** The downloads. */
    protected UrlType downloads;
    
    /** The training. */
    protected UrlType training;
    
    /** The contact us. */
    protected UrlType contactUs;
    
    /** The support my resources. */
    protected Boolean supportMyResources;

    /**
     * Gets the user guides.
     * 
     * @return the user guides
     */
    public UrlType getUserGuides() {
        return userGuides;
    }

    /**
     * Sets the user guides.
     * 
     * @param value the new user guides
     */
    public void setUserGuides(UrlType value) {
        this.userGuides = value;
    }

    /**
     * Gets the downloads.
     * 
     * @return the downloads
     */
    public UrlType getDownloads() {
        return downloads;
    }

    /**
     * Sets the downloads.
     * 
     * @param value the new downloads
     */
    public void setDownloads(UrlType value) {
        this.downloads = value;
    }

    /**
     * Gets the training.
     * 
     * @return the training
     */
    public UrlType getTraining() {
        return training;
    }

    /**
     * Sets the training.
     * 
     * @param value the new training
     */
    public void setTraining(UrlType value) {
        this.training = value;
    }

    /**
     * Gets the contact us.
     * 
     * @return the contact us
     */
    public UrlType getContactUs() {
        return contactUs;
    }

    /**
     * Sets the contact us.
     * 
     * @param value the new contact us
     */
    public void setContactUs(UrlType value) {
        this.contactUs = value;
    }

    /**
     * Checks if is support my resources.
     * 
     * @return the boolean
     */
    public Boolean isSupportMyResources() {
        return supportMyResources;
    }

    /**
     * Sets the support my resources.
     * 
     * @param value the new support my resources
     */
    public void setSupportMyResources(Boolean value) {
        this.supportMyResources = value;
    }

}
