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
 * <p>Java class for test_variableType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="test_variableType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="variable_test" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}variable_testType"/>
 *         &lt;element name="and_test" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}and_testType"/>
 *         &lt;element name="or_test" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}or_testType"/>
 *         &lt;element name="not_test" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}not_testType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "test_variableType", propOrder = {
    "variableTest",
    "andTest",
    "orTest",
    "notTest"
})
public class TestVariableType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "variable_test")
    protected VariableTestType variableTest;
    @XmlElement(name = "and_test")
    protected AndTestType andTest;
    @XmlElement(name = "or_test")
    protected OrTestType orTest;
    @XmlElement(name = "not_test")
    protected NotTestType notTest;

    /**
     * Gets the value of the variableTest property.
     * 
     * @return
     *     possible object is
     *     {@link VariableTestType }
     *     
     */
    public VariableTestType getVariableTest() {
        return variableTest;
    }

    /**
     * Sets the value of the variableTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableTestType }
     *     
     */
    public void setVariableTest(VariableTestType value) {
        this.variableTest = value;
    }

    /**
     * Gets the value of the andTest property.
     * 
     * @return
     *     possible object is
     *     {@link AndTestType }
     *     
     */
    public AndTestType getAndTest() {
        return andTest;
    }

    /**
     * Sets the value of the andTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AndTestType }
     *     
     */
    public void setAndTest(AndTestType value) {
        this.andTest = value;
    }

    /**
     * Gets the value of the orTest property.
     * 
     * @return
     *     possible object is
     *     {@link OrTestType }
     *     
     */
    public OrTestType getOrTest() {
        return orTest;
    }

    /**
     * Sets the value of the orTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrTestType }
     *     
     */
    public void setOrTest(OrTestType value) {
        this.orTest = value;
    }

    /**
     * Gets the value of the notTest property.
     * 
     * @return
     *     possible object is
     *     {@link NotTestType }
     *     
     */
    public NotTestType getNotTest() {
        return notTest;
    }

    /**
     * Sets the value of the notTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotTestType }
     *     
     */
    public void setNotTest(NotTestType value) {
        this.notTest = value;
    }

}
