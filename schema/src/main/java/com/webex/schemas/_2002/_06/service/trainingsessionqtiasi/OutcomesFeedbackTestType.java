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
 * The Class OutcomesFeedbackTestType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outcomes_feedback_testType", propOrder = {
    "testVariable",
    "displayfeedback"
})
public class OutcomesFeedbackTestType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The test variable. */
    @XmlElement(name = "test_variable", required = true)
    protected TestVariableType testVariable;
    
    /** The displayfeedback. */
    @XmlElement(required = true)
    protected List<DisplayfeedbackType> displayfeedback;
    
    /** The title. */
    @XmlAttribute
    protected String title;

    /**
     * Gets the test variable.
     * 
     * @return the test variable
     */
    public TestVariableType getTestVariable() {
        return testVariable;
    }

    /**
     * Sets the test variable.
     * 
     * @param value the new test variable
     */
    public void setTestVariable(TestVariableType value) {
        this.testVariable = value;
    }

    /**
     * Gets the displayfeedback.
     * 
     * @return the displayfeedback
     */
    public List<DisplayfeedbackType> getDisplayfeedback() {
        if (displayfeedback == null) {
            displayfeedback = new ArrayList<DisplayfeedbackType>();
        }
        return this.displayfeedback;
    }

    /**
     * Gets the title.
     * 
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title.
     * 
     * @param value the new title
     */
    public void setTitle(String value) {
        this.title = value;
    }

}
