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
 * <p>Java class for regQandAType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="regQandAType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regQ" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "regQandAType", propOrder = {
    "regQ",
    "regA"
})
public class RegQandAType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected String regQ;
    @XmlElement(required = true)
    protected String regA;

    /**
     * Gets the value of the regQ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegQ() {
        return regQ;
    }

    /**
     * Sets the value of the regQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegQ(String value) {
        this.regQ = value;
    }

    /**
     * Gets the value of the regA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegA() {
        return regA;
    }

    /**
     * Sets the value of the regA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegA(String value) {
        this.regA = value;
    }

}
