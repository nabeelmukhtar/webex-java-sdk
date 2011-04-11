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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class GradeType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gradeType", propOrder = {
    "gradeValue"
})
public class GradeType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The grade value. */
    @XmlElement(name = "grade_value", required = true)
    protected String gradeValue;
    
    /** The varname. */
    @XmlAttribute
    protected String varname;
    
    /** The members. */
    @XmlAttribute
    protected String members;

    /**
     * Gets the grade value.
     * 
     * @return the grade value
     */
    public String getGradeValue() {
        return gradeValue;
    }

    /**
     * Sets the grade value.
     * 
     * @param value the new grade value
     */
    public void setGradeValue(String value) {
        this.gradeValue = value;
    }

    /**
     * Gets the varname.
     * 
     * @return the varname
     */
    public String getVarname() {
        if (varname == null) {
            return "GRADE";
        } else {
            return varname;
        }
    }

    /**
     * Sets the varname.
     * 
     * @param value the new varname
     */
    public void setVarname(String value) {
        this.varname = value;
    }

    /**
     * Gets the members.
     * 
     * @return the members
     */
    public String getMembers() {
        return members;
    }

    /**
     * Sets the members.
     * 
     * @param value the new members
     */
    public void setMembers(String value) {
        this.members = value;
    }

}
