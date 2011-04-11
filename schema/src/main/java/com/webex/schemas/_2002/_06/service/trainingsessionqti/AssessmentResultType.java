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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class AssessmentResultType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assessment_resultType", propOrder = {
    "asiMetadata",
    "asiDescription",
    "date",
    "duration",
    "outcomes",
    "numSections",
    "sectionResult"
})
public class AssessmentResultType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The asi metadata. */
    @XmlElement(name = "asi_metadata")
    protected AsiMetadataAssessmentResultType asiMetadata;
    
    /** The asi description. */
    @XmlElement(name = "asi_description")
    protected AsiDescriptionType asiDescription;
    
    /** The date. */
    @XmlElement(required = true)
    protected DateType date;
    
    /** The duration. */
    @XmlElement(required = true)
    protected String duration;
    
    /** The outcomes. */
    @XmlElement(required = true)
    protected OutcomesAssessmentResultType outcomes;
    
    /** The num sections. */
    @XmlElement(name = "num_sections", required = true)
    protected String numSections;
    
    /** The section result. */
    @XmlElement(name = "section_result", required = true)
    protected SectionResultType sectionResult;
    
    /** The asi title. */
    @XmlAttribute(name = "asi_title")
    protected String asiTitle;
    
    /** The ident ref. */
    @XmlAttribute(name = "ident_ref")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long identRef;

    /**
     * Gets the asi metadata.
     * 
     * @return the asi metadata
     */
    public AsiMetadataAssessmentResultType getAsiMetadata() {
        return asiMetadata;
    }

    /**
     * Sets the asi metadata.
     * 
     * @param value the new asi metadata
     */
    public void setAsiMetadata(AsiMetadataAssessmentResultType value) {
        this.asiMetadata = value;
    }

    /**
     * Gets the asi description.
     * 
     * @return the asi description
     */
    public AsiDescriptionType getAsiDescription() {
        return asiDescription;
    }

    /**
     * Sets the asi description.
     * 
     * @param value the new asi description
     */
    public void setAsiDescription(AsiDescriptionType value) {
        this.asiDescription = value;
    }

    /**
     * Gets the date.
     * 
     * @return the date
     */
    public DateType getDate() {
        return date;
    }

    /**
     * Sets the date.
     * 
     * @param value the new date
     */
    public void setDate(DateType value) {
        this.date = value;
    }

    /**
     * Gets the duration.
     * 
     * @return the duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the duration.
     * 
     * @param value the new duration
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the outcomes.
     * 
     * @return the outcomes
     */
    public OutcomesAssessmentResultType getOutcomes() {
        return outcomes;
    }

    /**
     * Sets the outcomes.
     * 
     * @param value the new outcomes
     */
    public void setOutcomes(OutcomesAssessmentResultType value) {
        this.outcomes = value;
    }

    /**
     * Gets the num sections.
     * 
     * @return the num sections
     */
    public String getNumSections() {
        return numSections;
    }

    /**
     * Sets the num sections.
     * 
     * @param value the new num sections
     */
    public void setNumSections(String value) {
        this.numSections = value;
    }

    /**
     * Gets the section result.
     * 
     * @return the section result
     */
    public SectionResultType getSectionResult() {
        return sectionResult;
    }

    /**
     * Sets the section result.
     * 
     * @param value the new section result
     */
    public void setSectionResult(SectionResultType value) {
        this.sectionResult = value;
    }

    /**
     * Gets the asi title.
     * 
     * @return the asi title
     */
    public String getAsiTitle() {
        return asiTitle;
    }

    /**
     * Sets the asi title.
     * 
     * @param value the new asi title
     */
    public void setAsiTitle(String value) {
        this.asiTitle = value;
    }

    /**
     * Gets the ident ref.
     * 
     * @return the ident ref
     */
    public Long getIdentRef() {
        return identRef;
    }

    /**
     * Sets the ident ref.
     * 
     * @param value the new ident ref
     */
    public void setIdentRef(Long value) {
        this.identRef = value;
    }

}
