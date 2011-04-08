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
 * <p>Java class for materialType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="materialType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mattext" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}mattextType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "materialType", propOrder = {
    "mattext"
})
public class MaterialType implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected MattextType mattext;

    /**
     * Gets the value of the mattext property.
     * 
     * @return
     *     possible object is
     *     {@link MattextType }
     *     
     */
    public MattextType getMattext() {
        return mattext;
    }

    /**
     * Sets the value of the mattext property.
     * 
     * @param value
     *     allowed object is
     *     {@link MattextType }
     *     
     */
    public void setMattext(MattextType value) {
        this.mattext = value;
    }

}
