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
 * The Class ConnectIntegrationType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "connectIntegrationType", propOrder = {
    "connectServerURL",
    "connectOrganization",
    "connectNameSpaceID"
})
public class ConnectIntegrationType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The connect server url. */
    protected String connectServerURL;
    
    /** The connect organization. */
    protected String connectOrganization;
    
    /** The connect name space id. */
    protected String connectNameSpaceID;

    /**
     * Gets the connect server url.
     * 
     * @return the connect server url
     */
    public String getConnectServerURL() {
        return connectServerURL;
    }

    /**
     * Sets the connect server url.
     * 
     * @param value the new connect server url
     */
    public void setConnectServerURL(String value) {
        this.connectServerURL = value;
    }

    /**
     * Gets the connect organization.
     * 
     * @return the connect organization
     */
    public String getConnectOrganization() {
        return connectOrganization;
    }

    /**
     * Sets the connect organization.
     * 
     * @param value the new connect organization
     */
    public void setConnectOrganization(String value) {
        this.connectOrganization = value;
    }

    /**
     * Gets the connect name space id.
     * 
     * @return the connect name space id
     */
    public String getConnectNameSpaceID() {
        return connectNameSpaceID;
    }

    /**
     * Sets the connect name space id.
     * 
     * @param value the new connect name space id
     */
    public void setConnectNameSpaceID(String value) {
        this.connectNameSpaceID = value;
    }

}
