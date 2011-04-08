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

package com.webex.schemas._2002._06.service.ep;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listControlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listControlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startFrom" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="maximumNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listControlType", propOrder = {
    "startFrom",
    "maximumNum"
})
public class ListControlType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected long startFrom;
    protected Long maximumNum;

    /**
     * Gets the value of the startFrom property.
     * 
     */
    public long getStartFrom() {
        return startFrom;
    }

    /**
     * Sets the value of the startFrom property.
     * 
     */
    public void setStartFrom(long value) {
        this.startFrom = value;
    }

    /**
     * Gets the value of the maximumNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaximumNum() {
        return maximumNum;
    }

    /**
     * Sets the value of the maximumNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaximumNum(Long value) {
        this.maximumNum = value;
    }

}
