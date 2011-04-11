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
 * The Class NotTestType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "not_testType", propOrder = {
    "variableTest",
    "andTest",
    "orTest",
    "notTest"
})
public class NotTestType implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The variable test. */
    @XmlElement(name = "variable_test")
    protected VariableTestType variableTest;
    
    /** The and test. */
    @XmlElement(name = "and_test")
    protected AndTestType andTest;
    
    /** The or test. */
    @XmlElement(name = "or_test")
    protected OrTestType orTest;
    
    /** The not test. */
    @XmlElement(name = "not_test")
    protected NotTestType notTest;

    /**
     * Gets the variable test.
     * 
     * @return the variable test
     */
    public VariableTestType getVariableTest() {
        return variableTest;
    }

    /**
     * Sets the variable test.
     * 
     * @param value the new variable test
     */
    public void setVariableTest(VariableTestType value) {
        this.variableTest = value;
    }

    /**
     * Gets the and test.
     * 
     * @return the and test
     */
    public AndTestType getAndTest() {
        return andTest;
    }

    /**
     * Sets the and test.
     * 
     * @param value the new and test
     */
    public void setAndTest(AndTestType value) {
        this.andTest = value;
    }

    /**
     * Gets the or test.
     * 
     * @return the or test
     */
    public OrTestType getOrTest() {
        return orTest;
    }

    /**
     * Sets the or test.
     * 
     * @param value the new or test
     */
    public void setOrTest(OrTestType value) {
        this.orTest = value;
    }

    /**
     * Gets the not test.
     * 
     * @return the not test
     */
    public NotTestType getNotTest() {
        return notTest;
    }

    /**
     * Sets the not test.
     * 
     * @param value the new not test
     */
    public void setNotTest(NotTestType value) {
        this.notTest = value;
    }

}
