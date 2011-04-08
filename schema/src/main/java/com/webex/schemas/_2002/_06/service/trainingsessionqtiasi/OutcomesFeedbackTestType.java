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
 * <p>Java class for outcomes_feedback_testType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outcomes_feedback_testType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="test_variable" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}test_variableType"/>
 *         &lt;element name="displayfeedback" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}displayfeedbackType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outcomes_feedback_testType", propOrder = {
    "testVariable",
    "displayfeedback"
})
public class OutcomesFeedbackTestType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "test_variable", required = true)
    protected TestVariableType testVariable;
    @XmlElement(required = true)
    protected List<DisplayfeedbackType> displayfeedback;
    @XmlAttribute
    protected String title;

    /**
     * Gets the value of the testVariable property.
     * 
     * @return
     *     possible object is
     *     {@link TestVariableType }
     *     
     */
    public TestVariableType getTestVariable() {
        return testVariable;
    }

    /**
     * Sets the value of the testVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestVariableType }
     *     
     */
    public void setTestVariable(TestVariableType value) {
        this.testVariable = value;
    }

    /**
     * Gets the value of the displayfeedback property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the displayfeedback property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisplayfeedback().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisplayfeedbackType }
     * 
     * 
     */
    public List<DisplayfeedbackType> getDisplayfeedback() {
        if (displayfeedback == null) {
            displayfeedback = new ArrayList<DisplayfeedbackType>();
        }
        return this.displayfeedback;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

}
