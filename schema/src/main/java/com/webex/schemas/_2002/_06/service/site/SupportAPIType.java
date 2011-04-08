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
 * <p>Java class for supportAPIType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="supportAPIType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autoLogin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="aspAndPHPAPI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="backwardAPI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="xmlAPI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cAPI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="scorm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
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

    private final static long serialVersionUID = 2461660169443089969L;
    protected Boolean autoLogin;
    protected Boolean aspAndPHPAPI;
    protected Boolean backwardAPI;
    protected Boolean xmlAPI;
    @XmlElement(name = "cAPI", defaultValue = "false")
    protected Boolean capi;
    protected Boolean scorm;

    /**
     * Gets the value of the autoLogin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoLogin() {
        return autoLogin;
    }

    /**
     * Sets the value of the autoLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoLogin(Boolean value) {
        this.autoLogin = value;
    }

    /**
     * Gets the value of the aspAndPHPAPI property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAspAndPHPAPI() {
        return aspAndPHPAPI;
    }

    /**
     * Sets the value of the aspAndPHPAPI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAspAndPHPAPI(Boolean value) {
        this.aspAndPHPAPI = value;
    }

    /**
     * Gets the value of the backwardAPI property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBackwardAPI() {
        return backwardAPI;
    }

    /**
     * Sets the value of the backwardAPI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBackwardAPI(Boolean value) {
        this.backwardAPI = value;
    }

    /**
     * Gets the value of the xmlAPI property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXmlAPI() {
        return xmlAPI;
    }

    /**
     * Sets the value of the xmlAPI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setXmlAPI(Boolean value) {
        this.xmlAPI = value;
    }

    /**
     * Gets the value of the capi property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCAPI() {
        return capi;
    }

    /**
     * Sets the value of the capi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCAPI(Boolean value) {
        this.capi = value;
    }

    /**
     * Gets the value of the scorm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScorm() {
        return scorm;
    }

    /**
     * Sets the value of the scorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScorm(Boolean value) {
        this.scorm = value;
    }

}
