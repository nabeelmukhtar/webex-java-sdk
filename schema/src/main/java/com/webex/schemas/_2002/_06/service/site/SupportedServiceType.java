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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class SupportedServiceType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supportedServiceType", propOrder = {
    "enabled",
    "pageVersion",
    "clientVersion"
})
@XmlSeeAlso({
    com.webex.schemas._2002._06.service.site.SupportedServicesType.SupportCenter.class,
    com.webex.schemas._2002._06.service.site.SupportedServicesType.EventCenter.class
})
public class SupportedServiceType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The enabled. */
    protected boolean enabled;
    
    /** The page version. */
    @XmlElement(required = true)
    protected String pageVersion;
    
    /** The client version. */
    @XmlElement(required = true)
    protected String clientVersion;

    /**
     * Checks if is enabled.
     * 
     * @return true, if is enabled
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the enabled.
     * 
     * @param value the new enabled
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the page version.
     * 
     * @return the page version
     */
    public String getPageVersion() {
        return pageVersion;
    }

    /**
     * Sets the page version.
     * 
     * @param value the new page version
     */
    public void setPageVersion(String value) {
        this.pageVersion = value;
    }

    /**
     * Gets the client version.
     * 
     * @return the client version
     */
    public String getClientVersion() {
        return clientVersion;
    }

    /**
     * Sets the client version.
     * 
     * @param value the new client version
     */
    public void setClientVersion(String value) {
        this.clientVersion = value;
    }

}
