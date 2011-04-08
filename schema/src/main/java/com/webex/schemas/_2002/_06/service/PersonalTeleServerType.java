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
 * <p>Java class for personalTeleServerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="personalTeleServerType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}callInNumType">
 *       &lt;sequence>
 *         &lt;element name="enableServer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tollLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tollFreeLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
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

    private final static long serialVersionUID = 2461660169443089969L;
    protected Boolean enableServer;
    protected String tollLabel;
    protected String tollFreeLabel;

    /**
     * Gets the value of the enableServer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableServer() {
        return enableServer;
    }

    /**
     * Sets the value of the enableServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableServer(Boolean value) {
        this.enableServer = value;
    }

    /**
     * Gets the value of the tollLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTollLabel() {
        return tollLabel;
    }

    /**
     * Sets the value of the tollLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTollLabel(String value) {
        this.tollLabel = value;
    }

    /**
     * Gets the value of the tollFreeLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTollFreeLabel() {
        return tollFreeLabel;
    }

    /**
     * Sets the value of the tollFreeLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTollFreeLabel(String value) {
        this.tollFreeLabel = value;
    }

}
