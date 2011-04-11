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

package com.webex.schemas._2002._06.service.trainingsessionqti;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The Class ControlType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "controlType", propOrder = {
    "value"
})
public class ControlType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The value. */
    @XmlValue
    protected String value;
    
    /** The hint switch. */
    @XmlAttribute(name = "hint_switch")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String hintSwitch;
    
    /** The solution switch. */
    @XmlAttribute(name = "solution_switch")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String solutionSwitch;
    
    /** The feedback switch. */
    @XmlAttribute(name = "feedback_switch")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String feedbackSwitch;

    /**
     * Gets the value.
     * 
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value.
     * 
     * @param value the new value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the hint switch.
     * 
     * @return the hint switch
     */
    public String getHintSwitch() {
        if (hintSwitch == null) {
            return "No";
        } else {
            return hintSwitch;
        }
    }

    /**
     * Sets the hint switch.
     * 
     * @param value the new hint switch
     */
    public void setHintSwitch(String value) {
        this.hintSwitch = value;
    }

    /**
     * Gets the solution switch.
     * 
     * @return the solution switch
     */
    public String getSolutionSwitch() {
        if (solutionSwitch == null) {
            return "No";
        } else {
            return solutionSwitch;
        }
    }

    /**
     * Sets the solution switch.
     * 
     * @param value the new solution switch
     */
    public void setSolutionSwitch(String value) {
        this.solutionSwitch = value;
    }

    /**
     * Gets the feedback switch.
     * 
     * @return the feedback switch
     */
    public String getFeedbackSwitch() {
        if (feedbackSwitch == null) {
            return "No";
        } else {
            return feedbackSwitch;
        }
    }

    /**
     * Sets the feedback switch.
     * 
     * @param value the new feedback switch
     */
    public void setFeedbackSwitch(String value) {
        this.feedbackSwitch = value;
    }

}
