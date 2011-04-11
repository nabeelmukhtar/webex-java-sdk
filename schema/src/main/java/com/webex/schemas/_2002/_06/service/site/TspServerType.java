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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class TspServerType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tspServerType", propOrder = {
    "enableAdaptor",
    "serverIP",
    "mpAudio",
    "globalCallInNumURL"
})
public class TspServerType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The enable adaptor. */
    protected boolean enableAdaptor;
    
    /** The server ip. */
    @XmlElement(required = true)
    protected String serverIP;
    
    /** The mp audio. */
    protected List<MpAudioType> mpAudio;
    
    /** The global call in num url. */
    protected String globalCallInNumURL;

    /**
     * Checks if is enable adaptor.
     * 
     * @return true, if is enable adaptor
     */
    public boolean isEnableAdaptor() {
        return enableAdaptor;
    }

    /**
     * Sets the enable adaptor.
     * 
     * @param value the new enable adaptor
     */
    public void setEnableAdaptor(boolean value) {
        this.enableAdaptor = value;
    }

    /**
     * Gets the server ip.
     * 
     * @return the server ip
     */
    public String getServerIP() {
        return serverIP;
    }

    /**
     * Sets the server ip.
     * 
     * @param value the new server ip
     */
    public void setServerIP(String value) {
        this.serverIP = value;
    }

    /**
     * Gets the mp audio.
     * 
     * @return the mp audio
     */
    public List<MpAudioType> getMpAudio() {
        if (mpAudio == null) {
            mpAudio = new ArrayList<MpAudioType>();
        }
        return this.mpAudio;
    }

    /**
     * Gets the global call in num url.
     * 
     * @return the global call in num url
     */
    public String getGlobalCallInNumURL() {
        return globalCallInNumURL;
    }

    /**
     * Sets the global call in num url.
     * 
     * @param value the new global call in num url
     */
    public void setGlobalCallInNumURL(String value) {
        this.globalCallInNumURL = value;
    }

}
