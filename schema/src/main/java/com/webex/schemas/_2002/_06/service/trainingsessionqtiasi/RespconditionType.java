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
 * The Class RespconditionType.
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

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The conditionvar. */
    @XmlElement(required = true)
    protected ConditionvarType conditionvar;
    
    /** The setvar. */
    @XmlElement(required = true)
    protected SetvarType setvar;
    
    /** The displayfeedback. */
    protected DisplayfeedbackType displayfeedback;

    /**
     * Gets the conditionvar.
     * 
     * @return the conditionvar
     */
    public ConditionvarType getConditionvar() {
        return conditionvar;
    }

    /**
     * Sets the conditionvar.
     * 
     * @param value the new conditionvar
     */
    public void setConditionvar(ConditionvarType value) {
        this.conditionvar = value;
    }

    /**
     * Gets the setvar.
     * 
     * @return the setvar
     */
    public SetvarType getSetvar() {
        return setvar;
    }

    /**
     * Sets the setvar.
     * 
     * @param value the new setvar
     */
    public void setSetvar(SetvarType value) {
        this.setvar = value;
    }

    /**
     * Gets the displayfeedback.
     * 
     * @return the displayfeedback
     */
    public DisplayfeedbackType getDisplayfeedback() {
        return displayfeedback;
    }

    /**
     * Sets the displayfeedback.
     * 
     * @param value the new displayfeedback
     */
    public void setDisplayfeedback(DisplayfeedbackType value) {
        this.displayfeedback = value;
    }

}
