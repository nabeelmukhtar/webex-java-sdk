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

package com.webex.schemas._2002._06.service.trainingsession;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class GetTestInformationResponse.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTestInformationResponse", propOrder = {
    "description",
    "startDate",
    "timeLimit",
    "author",
    "numQuestions",
    "numSubmitted",
    "numStarted",
    "numSubmittedUnscroed",
    "numSubmittedUnscored",
    "submittedTest",
    "maxScore"
})
public class GetTestInformationResponse
    extends ScheduledTestInstanceType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The description. */
    protected String description;
    
    /** The start date. */
    @XmlElement(required = true)
    protected String startDate;
    
    /** The time limit. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long timeLimit;
    
    /** The author. */
    @XmlElement(required = true)
    protected String author;
    
    /** The num questions. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long numQuestions;
    
    /** The num submitted. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long numSubmitted;
    
    /** The num started. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long numStarted;
    
    /** The num submitted unscroed. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long numSubmittedUnscroed;
    
    /** The num submitted unscored. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long numSubmittedUnscored;
    
    /** The submitted test. */
    protected List<SubmittedTestType> submittedTest;
    
    /** The max score. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long maxScore;

    /**
     * Gets the description.
     * 
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description.
     * 
     * @param value the new description
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the start date.
     * 
     * @return the start date
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the start date.
     * 
     * @param value the new start date
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the time limit.
     * 
     * @return the time limit
     */
    public Long getTimeLimit() {
        return timeLimit;
    }

    /**
     * Sets the time limit.
     * 
     * @param value the new time limit
     */
    public void setTimeLimit(Long value) {
        this.timeLimit = value;
    }

    /**
     * Gets the author.
     * 
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author.
     * 
     * @param value the new author
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the num questions.
     * 
     * @return the num questions
     */
    public Long getNumQuestions() {
        return numQuestions;
    }

    /**
     * Sets the num questions.
     * 
     * @param value the new num questions
     */
    public void setNumQuestions(Long value) {
        this.numQuestions = value;
    }

    /**
     * Gets the num submitted.
     * 
     * @return the num submitted
     */
    public Long getNumSubmitted() {
        return numSubmitted;
    }

    /**
     * Sets the num submitted.
     * 
     * @param value the new num submitted
     */
    public void setNumSubmitted(Long value) {
        this.numSubmitted = value;
    }

    /**
     * Gets the num started.
     * 
     * @return the num started
     */
    public Long getNumStarted() {
        return numStarted;
    }

    /**
     * Sets the num started.
     * 
     * @param value the new num started
     */
    public void setNumStarted(Long value) {
        this.numStarted = value;
    }

    /**
     * Gets the num submitted unscroed.
     * 
     * @return the num submitted unscroed
     */
    public Long getNumSubmittedUnscroed() {
        return numSubmittedUnscroed;
    }

    /**
     * Sets the num submitted unscroed.
     * 
     * @param value the new num submitted unscroed
     */
    public void setNumSubmittedUnscroed(Long value) {
        this.numSubmittedUnscroed = value;
    }

    /**
     * Gets the num submitted unscored.
     * 
     * @return the num submitted unscored
     */
    public Long getNumSubmittedUnscored() {
        return numSubmittedUnscored;
    }

    /**
     * Sets the num submitted unscored.
     * 
     * @param value the new num submitted unscored
     */
    public void setNumSubmittedUnscored(Long value) {
        this.numSubmittedUnscored = value;
    }

    /**
     * Gets the submitted test.
     * 
     * @return the submitted test
     */
    public List<SubmittedTestType> getSubmittedTest() {
        if (submittedTest == null) {
            submittedTest = new ArrayList<SubmittedTestType>();
        }
        return this.submittedTest;
    }

    /**
     * Gets the max score.
     * 
     * @return the max score
     */
    public Long getMaxScore() {
        return maxScore;
    }

    /**
     * Sets the max score.
     * 
     * @param value the new max score
     */
    public void setMaxScore(Long value) {
        this.maxScore = value;
    }

}
