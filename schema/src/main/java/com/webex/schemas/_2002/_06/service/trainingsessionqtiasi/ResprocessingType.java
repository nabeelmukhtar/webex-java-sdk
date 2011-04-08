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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resprocessingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resprocessingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outcomes" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}outcomesType"/>
 *         &lt;element name="respcondition" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}respconditionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="scoremodel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resprocessingType", propOrder = {
    "outcomes",
    "respcondition"
})
public class ResprocessingType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected OutcomesType outcomes;
    protected List<RespconditionType> respcondition;
    @XmlAttribute
    protected String scoremodel;

    /**
     * Gets the value of the outcomes property.
     * 
     * @return
     *     possible object is
     *     {@link OutcomesType }
     *     
     */
    public OutcomesType getOutcomes() {
        return outcomes;
    }

    /**
     * Sets the value of the outcomes property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutcomesType }
     *     
     */
    public void setOutcomes(OutcomesType value) {
        this.outcomes = value;
    }

    /**
     * Gets the value of the respcondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the respcondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRespcondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RespconditionType }
     * 
     * 
     */
    public List<RespconditionType> getRespcondition() {
        if (respcondition == null) {
            respcondition = new ArrayList<RespconditionType>();
        }
        return this.respcondition;
    }

    /**
     * Gets the value of the scoremodel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoremodel() {
        return scoremodel;
    }

    /**
     * Sets the value of the scoremodel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoremodel(String value) {
        this.scoremodel = value;
    }

}
