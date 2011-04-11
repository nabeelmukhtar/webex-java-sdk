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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class ScoreAssessmentResultOutcomesType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "score_assessment_result_outcomesType", propOrder = {
    "scoreValue",
    "scoreMin",
    "scoreMax"
})
public class ScoreAssessmentResultOutcomesType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The score value. */
    @XmlElement(name = "score_value", required = true, type = String.class, defaultValue = "0")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long scoreValue;
    
    /** The score min. */
    @XmlElement(name = "score_min", required = true, type = String.class, defaultValue = "0")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long scoreMin;
    
    /** The score max. */
    @XmlElement(name = "score_max", required = true, type = String.class, defaultValue = "0")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long scoreMax;
    
    /** The varname. */
    @XmlAttribute
    protected String varname;
    
    /** The vartype. */
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String vartype;

    /**
     * Gets the score value.
     * 
     * @return the score value
     */
    public Long getScoreValue() {
        return scoreValue;
    }

    /**
     * Sets the score value.
     * 
     * @param value the new score value
     */
    public void setScoreValue(Long value) {
        this.scoreValue = value;
    }

    /**
     * Gets the score min.
     * 
     * @return the score min
     */
    public Long getScoreMin() {
        return scoreMin;
    }

    /**
     * Sets the score min.
     * 
     * @param value the new score min
     */
    public void setScoreMin(Long value) {
        this.scoreMin = value;
    }

    /**
     * Gets the score max.
     * 
     * @return the score max
     */
    public Long getScoreMax() {
        return scoreMax;
    }

    /**
     * Sets the score max.
     * 
     * @param value the new score max
     */
    public void setScoreMax(Long value) {
        this.scoreMax = value;
    }

    /**
     * Gets the varname.
     * 
     * @return the varname
     */
    public String getVarname() {
        if (varname == null) {
            return "SCORE";
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
     * Gets the vartype.
     * 
     * @return the vartype
     */
    public String getVartype() {
        if (vartype == null) {
            return "Integer";
        } else {
            return vartype;
        }
    }

    /**
     * Sets the vartype.
     * 
     * @param value the new vartype
     */
    public void setVartype(String value) {
        this.vartype = value;
    }

}
