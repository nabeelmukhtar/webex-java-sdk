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
 * The Class ClientPlatformsType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clientPlatformsType", propOrder = {
    "msWindows",
    "macOS9",
    "macOSX",
    "sunSolaris",
    "linux",
    "hpUnix",
    "java",
    "palm"
})
public class ClientPlatformsType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The ms windows. */
    protected Boolean msWindows;
    
    /** The mac o s9. */
    protected Boolean macOS9;
    
    /** The mac osx. */
    protected Boolean macOSX;
    
    /** The sun solaris. */
    protected Boolean sunSolaris;
    
    /** The linux. */
    @XmlElement(defaultValue = "false")
    protected Boolean linux;
    
    /** The hp unix. */
    protected Boolean hpUnix;
    
    /** The java. */
    protected Boolean java;
    
    /** The palm. */
    protected Boolean palm;

    /**
     * Checks if is ms windows.
     * 
     * @return the boolean
     */
    public Boolean isMsWindows() {
        return msWindows;
    }

    /**
     * Sets the ms windows.
     * 
     * @param value the new ms windows
     */
    public void setMsWindows(Boolean value) {
        this.msWindows = value;
    }

    /**
     * Checks if is mac o s9.
     * 
     * @return the boolean
     */
    public Boolean isMacOS9() {
        return macOS9;
    }

    /**
     * Sets the mac o s9.
     * 
     * @param value the new mac o s9
     */
    public void setMacOS9(Boolean value) {
        this.macOS9 = value;
    }

    /**
     * Checks if is mac osx.
     * 
     * @return the boolean
     */
    public Boolean isMacOSX() {
        return macOSX;
    }

    /**
     * Sets the mac osx.
     * 
     * @param value the new mac osx
     */
    public void setMacOSX(Boolean value) {
        this.macOSX = value;
    }

    /**
     * Checks if is sun solaris.
     * 
     * @return the boolean
     */
    public Boolean isSunSolaris() {
        return sunSolaris;
    }

    /**
     * Sets the sun solaris.
     * 
     * @param value the new sun solaris
     */
    public void setSunSolaris(Boolean value) {
        this.sunSolaris = value;
    }

    /**
     * Checks if is linux.
     * 
     * @return the boolean
     */
    public Boolean isLinux() {
        return linux;
    }

    /**
     * Sets the linux.
     * 
     * @param value the new linux
     */
    public void setLinux(Boolean value) {
        this.linux = value;
    }

    /**
     * Checks if is hp unix.
     * 
     * @return the boolean
     */
    public Boolean isHpUnix() {
        return hpUnix;
    }

    /**
     * Sets the hp unix.
     * 
     * @param value the new hp unix
     */
    public void setHpUnix(Boolean value) {
        this.hpUnix = value;
    }

    /**
     * Checks if is java.
     * 
     * @return the boolean
     */
    public Boolean isJava() {
        return java;
    }

    /**
     * Sets the java.
     * 
     * @param value the new java
     */
    public void setJava(Boolean value) {
        this.java = value;
    }

    /**
     * Checks if is palm.
     * 
     * @return the boolean
     */
    public Boolean isPalm() {
        return palm;
    }

    /**
     * Sets the palm.
     * 
     * @param value the new palm
     */
    public void setPalm(Boolean value) {
        this.palm = value;
    }

}
