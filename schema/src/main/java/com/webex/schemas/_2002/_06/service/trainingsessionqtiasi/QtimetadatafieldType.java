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

package com.webex.schemas._2002._06.service.trainingsessionqtiasi;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for qtimetadatafieldType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="qtimetadatafieldType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}fieldlabel"/>
 *         &lt;element ref="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}fieldentry"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qtimetadatafieldType", propOrder = {
    "fieldlabel",
    "fieldentry"
})
public class QtimetadatafieldType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected String fieldlabel;
    @XmlElement(required = true)
    protected String fieldentry;

    /**
     * Gets the value of the fieldlabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldlabel() {
        return fieldlabel;
    }

    /**
     * Sets the value of the fieldlabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldlabel(String value) {
        this.fieldlabel = value;
    }

    /**
     * Gets the value of the fieldentry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldentry() {
        return fieldentry;
    }

    /**
     * Sets the value of the fieldentry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldentry(String value) {
        this.fieldentry = value;
    }

}
