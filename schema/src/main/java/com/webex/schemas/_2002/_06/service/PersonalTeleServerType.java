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
 * The Class PersonalTeleServerType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personalTeleServerType", propOrder = {
    "enableServer",
    "tollLabel",
    "tollFreeLabel"
})
public class PersonalTeleServerType
    extends CallInNumType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The enable server. */
    protected Boolean enableServer;
    
    /** The toll label. */
    protected String tollLabel;
    
    /** The toll free label. */
    protected String tollFreeLabel;

    /**
     * Checks if is enable server.
     * 
     * @return the boolean
     */
    public Boolean isEnableServer() {
        return enableServer;
    }

    /**
     * Sets the enable server.
     * 
     * @param value the new enable server
     */
    public void setEnableServer(Boolean value) {
        this.enableServer = value;
    }

    /**
     * Gets the toll label.
     * 
     * @return the toll label
     */
    public String getTollLabel() {
        return tollLabel;
    }

    /**
     * Sets the toll label.
     * 
     * @param value the new toll label
     */
    public void setTollLabel(String value) {
        this.tollLabel = value;
    }

    /**
     * Gets the toll free label.
     * 
     * @return the toll free label
     */
    public String getTollFreeLabel() {
        return tollFreeLabel;
    }

    /**
     * Sets the toll free label.
     * 
     * @param value the new toll free label
     */
    public void setTollFreeLabel(String value) {
        this.tollFreeLabel = value;
    }

}
