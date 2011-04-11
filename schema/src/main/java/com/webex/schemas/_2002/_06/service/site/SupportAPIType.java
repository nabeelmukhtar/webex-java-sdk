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
import javax.xml.bind.annotation.XmlType;


/**
 * The Class SupportAPIType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supportAPIType", propOrder = {
    "autoLogin",
    "aspAndPHPAPI",
    "backwardAPI",
    "xmlAPI",
    "capi",
    "scorm"
})
public class SupportAPIType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The auto login. */
    protected Boolean autoLogin;
    
    /** The asp and phpapi. */
    protected Boolean aspAndPHPAPI;
    
    /** The backward api. */
    protected Boolean backwardAPI;
    
    /** The xml api. */
    protected Boolean xmlAPI;
    
    /** The capi. */
    @XmlElement(name = "cAPI", defaultValue = "false")
    protected Boolean capi;
    
    /** The scorm. */
    protected Boolean scorm;

    /**
     * Checks if is auto login.
     * 
     * @return the boolean
     */
    public Boolean isAutoLogin() {
        return autoLogin;
    }

    /**
     * Sets the auto login.
     * 
     * @param value the new auto login
     */
    public void setAutoLogin(Boolean value) {
        this.autoLogin = value;
    }

    /**
     * Checks if is asp and phpapi.
     * 
     * @return the boolean
     */
    public Boolean isAspAndPHPAPI() {
        return aspAndPHPAPI;
    }

    /**
     * Sets the asp and phpapi.
     * 
     * @param value the new asp and phpapi
     */
    public void setAspAndPHPAPI(Boolean value) {
        this.aspAndPHPAPI = value;
    }

    /**
     * Checks if is backward api.
     * 
     * @return the boolean
     */
    public Boolean isBackwardAPI() {
        return backwardAPI;
    }

    /**
     * Sets the backward api.
     * 
     * @param value the new backward api
     */
    public void setBackwardAPI(Boolean value) {
        this.backwardAPI = value;
    }

    /**
     * Checks if is xml api.
     * 
     * @return the boolean
     */
    public Boolean isXmlAPI() {
        return xmlAPI;
    }

    /**
     * Sets the xml api.
     * 
     * @param value the new xml api
     */
    public void setXmlAPI(Boolean value) {
        this.xmlAPI = value;
    }

    /**
     * Checks if is capi.
     * 
     * @return the boolean
     */
    public Boolean isCAPI() {
        return capi;
    }

    /**
     * Sets the cAPI.
     * 
     * @param value the new cAPI
     */
    public void setCAPI(Boolean value) {
        this.capi = value;
    }

    /**
     * Checks if is scorm.
     * 
     * @return the boolean
     */
    public Boolean isScorm() {
        return scorm;
    }

    /**
     * Sets the scorm.
     * 
     * @param value the new scorm
     */
    public void setScorm(Boolean value) {
        this.scorm = value;
    }

}
