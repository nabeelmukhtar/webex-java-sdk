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
 * The Class ResprocessingType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resprocessingType", propOrder = {
    "outcomes",
    "respcondition"
})
public class ResprocessingType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The outcomes. */
    @XmlElement(required = true)
    protected OutcomesType outcomes;
    
    /** The respcondition. */
    protected List<RespconditionType> respcondition;
    
    /** The scoremodel. */
    @XmlAttribute
    protected String scoremodel;

    /**
     * Gets the outcomes.
     * 
     * @return the outcomes
     */
    public OutcomesType getOutcomes() {
        return outcomes;
    }

    /**
     * Sets the outcomes.
     * 
     * @param value the new outcomes
     */
    public void setOutcomes(OutcomesType value) {
        this.outcomes = value;
    }

    /**
     * Gets the respcondition.
     * 
     * @return the respcondition
     */
    public List<RespconditionType> getRespcondition() {
        if (respcondition == null) {
            respcondition = new ArrayList<RespconditionType>();
        }
        return this.respcondition;
    }

    /**
     * Gets the scoremodel.
     * 
     * @return the scoremodel
     */
    public String getScoremodel() {
        return scoremodel;
    }

    /**
     * Sets the scoremodel.
     * 
     * @param value the new scoremodel
     */
    public void setScoremodel(String value) {
        this.scoremodel = value;
    }

}
