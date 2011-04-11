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

package com.webex.schemas._2002._06.service.history;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creationTimeScopeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creationTimeScopeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creationTimeStart" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creationTimeEnd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creationTimeScopeType", propOrder = {
    "creationTimeStart",
    "creationTimeEnd"
})
public class CreationTimeScopeType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected String creationTimeStart;
    @XmlElement(required = true)
    protected String creationTimeEnd;

    /**
     * Gets the value of the creationTimeStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationTimeStart() {
        return creationTimeStart;
    }

    /**
     * Sets the value of the creationTimeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationTimeStart(String value) {
        this.creationTimeStart = value;
    }

    /**
     * Gets the value of the creationTimeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationTimeEnd() {
        return creationTimeEnd;
    }

    /**
     * Sets the value of the creationTimeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationTimeEnd(String value) {
        this.creationTimeEnd = value;
    }

}
