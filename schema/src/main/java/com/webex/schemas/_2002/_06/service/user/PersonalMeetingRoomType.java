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

package com.webex.schemas._2002._06.service.user;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for personalMeetingRoomType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="personalMeetingRoomType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="welcomeMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="photoURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="headerImageBranding" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="headerImageURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personalMeetingRoomType", propOrder = {
    "welcomeMessage",
    "photoURL",
    "headerImageBranding",
    "headerImageURL"
})
public class PersonalMeetingRoomType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String welcomeMessage;
    protected String photoURL;
    protected Boolean headerImageBranding;
    protected String headerImageURL;

    /**
     * Gets the value of the welcomeMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    /**
     * Sets the value of the welcomeMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWelcomeMessage(String value) {
        this.welcomeMessage = value;
    }

    /**
     * Gets the value of the photoURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoURL() {
        return photoURL;
    }

    /**
     * Sets the value of the photoURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoURL(String value) {
        this.photoURL = value;
    }

    /**
     * Gets the value of the headerImageBranding property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHeaderImageBranding() {
        return headerImageBranding;
    }

    /**
     * Sets the value of the headerImageBranding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHeaderImageBranding(Boolean value) {
        this.headerImageBranding = value;
    }

    /**
     * Gets the value of the headerImageURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderImageURL() {
        return headerImageURL;
    }

    /**
     * Sets the value of the headerImageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderImageURL(String value) {
        this.headerImageURL = value;
    }

}
