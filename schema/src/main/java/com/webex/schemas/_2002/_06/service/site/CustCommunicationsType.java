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
 * <p>Java class for custCommunicationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="custCommunicationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="displayType" type="{http://www.webex.com/schemas/2002/06/service/site}displayTypeType" minOccurs="0"/>
 *         &lt;element name="displayMethod" type="{http://www.webex.com/schemas/2002/06/service/site}displayMethodType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "custCommunicationsType", propOrder = {
    "displayType",
    "displayMethod"
})
public class CustCommunicationsType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected DisplayTypeType displayType;
    protected DisplayMethodType displayMethod;

    /**
     * Gets the value of the displayType property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayTypeType }
     *     
     */
    public DisplayTypeType getDisplayType() {
        return displayType;
    }

    /**
     * Sets the value of the displayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayTypeType }
     *     
     */
    public void setDisplayType(DisplayTypeType value) {
        this.displayType = value;
    }

    /**
     * Gets the value of the displayMethod property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayMethodType }
     *     
     */
    public DisplayMethodType getDisplayMethod() {
        return displayMethod;
    }

    /**
     * Sets the value of the displayMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayMethodType }
     *     
     */
    public void setDisplayMethod(DisplayMethodType value) {
        this.displayMethod = value;
    }

}
