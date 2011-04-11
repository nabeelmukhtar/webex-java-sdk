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
 * <p>Java class for menuType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="menuType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userGuides" type="{http://www.webex.com/schemas/2002/06/service/site}urlType" minOccurs="0"/>
 *         &lt;element name="downloads" type="{http://www.webex.com/schemas/2002/06/service/site}urlType" minOccurs="0"/>
 *         &lt;element name="training" type="{http://www.webex.com/schemas/2002/06/service/site}urlType" minOccurs="0"/>
 *         &lt;element name="contactUs" type="{http://www.webex.com/schemas/2002/06/service/site}urlType" minOccurs="0"/>
 *         &lt;element name="supportMyResources" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
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

    private final static long serialVersionUID = 2461660169443089969L;
    protected UrlType userGuides;
    protected UrlType downloads;
    protected UrlType training;
    protected UrlType contactUs;
    protected Boolean supportMyResources;

    /**
     * Gets the value of the userGuides property.
     * 
     * @return
     *     possible object is
     *     {@link UrlType }
     *     
     */
    public UrlType getUserGuides() {
        return userGuides;
    }

    /**
     * Sets the value of the userGuides property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlType }
     *     
     */
    public void setUserGuides(UrlType value) {
        this.userGuides = value;
    }

    /**
     * Gets the value of the downloads property.
     * 
     * @return
     *     possible object is
     *     {@link UrlType }
     *     
     */
    public UrlType getDownloads() {
        return downloads;
    }

    /**
     * Sets the value of the downloads property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlType }
     *     
     */
    public void setDownloads(UrlType value) {
        this.downloads = value;
    }

    /**
     * Gets the value of the training property.
     * 
     * @return
     *     possible object is
     *     {@link UrlType }
     *     
     */
    public UrlType getTraining() {
        return training;
    }

    /**
     * Sets the value of the training property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlType }
     *     
     */
    public void setTraining(UrlType value) {
        this.training = value;
    }

    /**
     * Gets the value of the contactUs property.
     * 
     * @return
     *     possible object is
     *     {@link UrlType }
     *     
     */
    public UrlType getContactUs() {
        return contactUs;
    }

    /**
     * Sets the value of the contactUs property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlType }
     *     
     */
    public void setContactUs(UrlType value) {
        this.contactUs = value;
    }

    /**
     * Gets the value of the supportMyResources property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportMyResources() {
        return supportMyResources;
    }

    /**
     * Sets the value of the supportMyResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportMyResources(Boolean value) {
        this.supportMyResources = value;
    }

}
