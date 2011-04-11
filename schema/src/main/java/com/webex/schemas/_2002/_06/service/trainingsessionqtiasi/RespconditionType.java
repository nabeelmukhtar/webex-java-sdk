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
 * <p>Java class for respconditionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="respconditionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conditionvar" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}conditionvarType"/>
 *         &lt;element name="setvar" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}setvarType"/>
 *         &lt;element name="displayfeedback" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}displayfeedbackType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respconditionType", propOrder = {
    "conditionvar",
    "setvar",
    "displayfeedback"
})
public class RespconditionType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected ConditionvarType conditionvar;
    @XmlElement(required = true)
    protected SetvarType setvar;
    protected DisplayfeedbackType displayfeedback;

    /**
     * Gets the value of the conditionvar property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionvarType }
     *     
     */
    public ConditionvarType getConditionvar() {
        return conditionvar;
    }

    /**
     * Sets the value of the conditionvar property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionvarType }
     *     
     */
    public void setConditionvar(ConditionvarType value) {
        this.conditionvar = value;
    }

    /**
     * Gets the value of the setvar property.
     * 
     * @return
     *     possible object is
     *     {@link SetvarType }
     *     
     */
    public SetvarType getSetvar() {
        return setvar;
    }

    /**
     * Sets the value of the setvar property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetvarType }
     *     
     */
    public void setSetvar(SetvarType value) {
        this.setvar = value;
    }

    /**
     * Gets the value of the displayfeedback property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayfeedbackType }
     *     
     */
    public DisplayfeedbackType getDisplayfeedback() {
        return displayfeedback;
    }

    /**
     * Sets the value of the displayfeedback property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayfeedbackType }
     *     
     */
    public void setDisplayfeedback(DisplayfeedbackType value) {
        this.displayfeedback = value;
    }

}
