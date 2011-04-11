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
 * The Class OutcomesProcessingType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outcomes_processingType", propOrder = {
    "qticomment",
    "outcomes",
    "objectsCondition",
    "processingParameter",
    "mapOutput",
    "outcomesFeedbackTest"
})
public class OutcomesProcessingType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The qticomment. */
    protected QticommentType qticomment;
    
    /** The outcomes. */
    @XmlElement(required = true)
    protected OutcomesType outcomes;
    
    /** The objects condition. */
    @XmlElement(name = "objects_condition")
    protected List<ObjectsConditionType> objectsCondition;
    
    /** The processing parameter. */
    @XmlElement(name = "processing_parameter")
    protected List<ProcessingParameterType> processingParameter;
    
    /** The map output. */
    @XmlElement(name = "map_output")
    protected List<MapOutputType> mapOutput;
    
    /** The outcomes feedback test. */
    @XmlElement(name = "outcomes_feedback_test")
    protected List<OutcomesFeedbackTestType> outcomesFeedbackTest;
    
    /** The scoremodel. */
    @XmlAttribute
    protected String scoremodel;

    /**
     * Gets the qticomment.
     * 
     * @return the qticomment
     */
    public QticommentType getQticomment() {
        return qticomment;
    }

    /**
     * Sets the qticomment.
     * 
     * @param value the new qticomment
     */
    public void setQticomment(QticommentType value) {
        this.qticomment = value;
    }

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
     * Gets the objects condition.
     * 
     * @return the objects condition
     */
    public List<ObjectsConditionType> getObjectsCondition() {
        if (objectsCondition == null) {
            objectsCondition = new ArrayList<ObjectsConditionType>();
        }
        return this.objectsCondition;
    }

    /**
     * Gets the processing parameter.
     * 
     * @return the processing parameter
     */
    public List<ProcessingParameterType> getProcessingParameter() {
        if (processingParameter == null) {
            processingParameter = new ArrayList<ProcessingParameterType>();
        }
        return this.processingParameter;
    }

    /**
     * Gets the map output.
     * 
     * @return the map output
     */
    public List<MapOutputType> getMapOutput() {
        if (mapOutput == null) {
            mapOutput = new ArrayList<MapOutputType>();
        }
        return this.mapOutput;
    }

    /**
     * Gets the outcomes feedback test.
     * 
     * @return the outcomes feedback test
     */
    public List<OutcomesFeedbackTestType> getOutcomesFeedbackTest() {
        if (outcomesFeedbackTest == null) {
            outcomesFeedbackTest = new ArrayList<OutcomesFeedbackTestType>();
        }
        return this.outcomesFeedbackTest;
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
