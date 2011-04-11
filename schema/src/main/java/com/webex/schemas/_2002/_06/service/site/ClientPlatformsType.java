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
 * <p>Java class for clientPlatformsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clientPlatformsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="msWindows" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="macOS9" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="macOSX" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sunSolaris" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="linux" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hpUnix" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="java" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="palm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
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

    private final static long serialVersionUID = 2461660169443089969L;
    protected Boolean msWindows;
    protected Boolean macOS9;
    protected Boolean macOSX;
    protected Boolean sunSolaris;
    @XmlElement(defaultValue = "false")
    protected Boolean linux;
    protected Boolean hpUnix;
    protected Boolean java;
    protected Boolean palm;

    /**
     * Gets the value of the msWindows property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMsWindows() {
        return msWindows;
    }

    /**
     * Sets the value of the msWindows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMsWindows(Boolean value) {
        this.msWindows = value;
    }

    /**
     * Gets the value of the macOS9 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMacOS9() {
        return macOS9;
    }

    /**
     * Sets the value of the macOS9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMacOS9(Boolean value) {
        this.macOS9 = value;
    }

    /**
     * Gets the value of the macOSX property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMacOSX() {
        return macOSX;
    }

    /**
     * Sets the value of the macOSX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMacOSX(Boolean value) {
        this.macOSX = value;
    }

    /**
     * Gets the value of the sunSolaris property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSunSolaris() {
        return sunSolaris;
    }

    /**
     * Sets the value of the sunSolaris property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSunSolaris(Boolean value) {
        this.sunSolaris = value;
    }

    /**
     * Gets the value of the linux property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLinux() {
        return linux;
    }

    /**
     * Sets the value of the linux property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLinux(Boolean value) {
        this.linux = value;
    }

    /**
     * Gets the value of the hpUnix property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHpUnix() {
        return hpUnix;
    }

    /**
     * Sets the value of the hpUnix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHpUnix(Boolean value) {
        this.hpUnix = value;
    }

    /**
     * Gets the value of the java property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJava() {
        return java;
    }

    /**
     * Sets the value of the java property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJava(Boolean value) {
        this.java = value;
    }

    /**
     * Gets the value of the palm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPalm() {
        return palm;
    }

    /**
     * Sets the value of the palm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPalm(Boolean value) {
        this.palm = value;
    }

}
