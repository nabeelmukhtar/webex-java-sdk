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
 * <p>Java class for tspServerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tspServerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enableAdaptor" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="serverIP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mpAudio" type="{http://www.webex.com/schemas/2002/06/service/site}mpAudioType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="globalCallInNumURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
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

    private final static long serialVersionUID = 2461660169443089969L;
    protected boolean enableAdaptor;
    @XmlElement(required = true)
    protected String serverIP;
    protected List<MpAudioType> mpAudio;
    protected String globalCallInNumURL;

    /**
     * Gets the value of the enableAdaptor property.
     * 
     */
    public boolean isEnableAdaptor() {
        return enableAdaptor;
    }

    /**
     * Sets the value of the enableAdaptor property.
     * 
     */
    public void setEnableAdaptor(boolean value) {
        this.enableAdaptor = value;
    }

    /**
     * Gets the value of the serverIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerIP() {
        return serverIP;
    }

    /**
     * Sets the value of the serverIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerIP(String value) {
        this.serverIP = value;
    }

    /**
     * Gets the value of the mpAudio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mpAudio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMpAudio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MpAudioType }
     * 
     * 
     */
    public List<MpAudioType> getMpAudio() {
        if (mpAudio == null) {
            mpAudio = new ArrayList<MpAudioType>();
        }
        return this.mpAudio;
    }

    /**
     * Gets the value of the globalCallInNumURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalCallInNumURL() {
        return globalCallInNumURL;
    }

    /**
     * Sets the value of the globalCallInNumURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalCallInNumURL(String value) {
        this.globalCallInNumURL = value;
    }

}
