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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class SubmittedTestType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "submittedTestType", propOrder = {
    "name",
    "email",
    "submitDate",
    "score",
    "grade",
    "registerID"
})
public class SubmittedTestType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The name. */
    @XmlElement(required = true)
    protected String name;
    
    /** The email. */
    @XmlElement(required = true)
    protected String email;
    
    /** The submit date. */
    @XmlElement(required = true)
    protected String submitDate;
    
    /** The score. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long score;
    
    /** The grade. */
    @XmlElement(required = true)
    protected String grade;
    
    /** The register id. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long registerID;

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     * 
     * @param value the new name
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the email.
     * 
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email.
     * 
     * @param value the new email
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the submit date.
     * 
     * @return the submit date
     */
    public String getSubmitDate() {
        return submitDate;
    }

    /**
     * Sets the submit date.
     * 
     * @param value the new submit date
     */
    public void setSubmitDate(String value) {
        this.submitDate = value;
    }

    /**
     * Gets the score.
     * 
     * @return the score
     */
    public Long getScore() {
        return score;
    }

    /**
     * Sets the score.
     * 
     * @param value the new score
     */
    public void setScore(Long value) {
        this.score = value;
    }

    /**
     * Gets the grade.
     * 
     * @return the grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * Sets the grade.
     * 
     * @param value the new grade
     */
    public void setGrade(String value) {
        this.grade = value;
    }

    /**
     * Gets the register id.
     * 
     * @return the register id
     */
    public Long getRegisterID() {
        return registerID;
    }

    /**
     * Sets the register id.
     * 
     * @param value the new register id
     */
    public void setRegisterID(Long value) {
        this.registerID = value;
    }

}
