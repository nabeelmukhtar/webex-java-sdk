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

package com.webex.schemas._2002._06.service.event;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter2;


/**
 * <p>Java class for checkboxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkboxType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="label">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.webex.com/schemas/2002/06/service/event}checkboxStateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkboxType", propOrder = {
    "label",
    "score",
    "state"
})
public class CheckboxType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected String label;
    @XmlElement(type = String.class, defaultValue = "0")
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "double")
    protected Double score;
    @XmlElement(defaultValue = "CLEARED")
    protected CheckboxStateType state;

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScore(Double value) {
        this.score = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link CheckboxStateType }
     *     
     */
    public CheckboxStateType getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckboxStateType }
     *     
     */
    public void setState(CheckboxStateType value) {
        this.state = value;
    }

}
