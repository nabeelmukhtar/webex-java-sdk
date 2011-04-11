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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class ResultType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultType", propOrder = {
    "context",
    "assessmentResult"
})
public class ResultType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The context. */
    @XmlElement(required = true)
    protected ContextType context;
    
    /** The assessment result. */
    @XmlElement(name = "assessment_result", required = true)
    protected AssessmentResultType assessmentResult;

    /**
     * Gets the context.
     * 
     * @return the context
     */
    public ContextType getContext() {
        return context;
    }

    /**
     * Sets the context.
     * 
     * @param value the new context
     */
    public void setContext(ContextType value) {
        this.context = value;
    }

    /**
     * Gets the assessment result.
     * 
     * @return the assessment result
     */
    public AssessmentResultType getAssessmentResult() {
        return assessmentResult;
    }

    /**
     * Sets the assessment result.
     * 
     * @param value the new assessment result
     */
    public void setAssessmentResult(AssessmentResultType value) {
        this.assessmentResult = value;
    }

}
