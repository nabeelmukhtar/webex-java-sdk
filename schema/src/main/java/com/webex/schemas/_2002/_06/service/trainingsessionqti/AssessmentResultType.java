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
 * <p>Java class for assessment_resultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assessment_resultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asi_metadata" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqti}asi_metadata_assessment_resultType" minOccurs="0"/>
 *         &lt;element name="asi_description" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqti}asi_descriptionType" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqti}dateType"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="outcomes" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqti}outcomes_assessment_resultType"/>
 *         &lt;element ref="{http://www.webex.com/schemas/2002/06/service/trainingsessionqti}num_sections"/>
 *         &lt;element name="section_result" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqti}section_resultType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="asi_title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ident_ref" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
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

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "asi_metadata")
    protected AsiMetadataAssessmentResultType asiMetadata;
    @XmlElement(name = "asi_description")
    protected AsiDescriptionType asiDescription;
    @XmlElement(required = true)
    protected DateType date;
    @XmlElement(required = true)
    protected String duration;
    @XmlElement(required = true)
    protected OutcomesAssessmentResultType outcomes;
    @XmlElement(name = "num_sections", required = true)
    protected String numSections;
    @XmlElement(name = "section_result", required = true)
    protected SectionResultType sectionResult;
    @XmlAttribute(name = "asi_title")
    protected String asiTitle;
    @XmlAttribute(name = "ident_ref")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long identRef;

    /**
     * Gets the value of the asiMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link AsiMetadataAssessmentResultType }
     *     
     */
    public AsiMetadataAssessmentResultType getAsiMetadata() {
        return asiMetadata;
    }

    /**
     * Sets the value of the asiMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsiMetadataAssessmentResultType }
     *     
     */
    public void setAsiMetadata(AsiMetadataAssessmentResultType value) {
        this.asiMetadata = value;
    }

    /**
     * Gets the value of the asiDescription property.
     * 
     * @return
     *     possible object is
     *     {@link AsiDescriptionType }
     *     
     */
    public AsiDescriptionType getAsiDescription() {
        return asiDescription;
    }

    /**
     * Sets the value of the asiDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsiDescriptionType }
     *     
     */
    public void setAsiDescription(AsiDescriptionType value) {
        this.asiDescription = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setDate(DateType value) {
        this.date = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the outcomes property.
     * 
     * @return
     *     possible object is
     *     {@link OutcomesAssessmentResultType }
     *     
     */
    public OutcomesAssessmentResultType getOutcomes() {
        return outcomes;
    }

    /**
     * Sets the value of the outcomes property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutcomesAssessmentResultType }
     *     
     */
    public void setOutcomes(OutcomesAssessmentResultType value) {
        this.outcomes = value;
    }

    /**
     * Gets the value of the numSections property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumSections() {
        return numSections;
    }

    /**
     * Sets the value of the numSections property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumSections(String value) {
        this.numSections = value;
    }

    /**
     * Gets the value of the sectionResult property.
     * 
     * @return
     *     possible object is
     *     {@link SectionResultType }
     *     
     */
    public SectionResultType getSectionResult() {
        return sectionResult;
    }

    /**
     * Sets the value of the sectionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionResultType }
     *     
     */
    public void setSectionResult(SectionResultType value) {
        this.sectionResult = value;
    }

    /**
     * Gets the value of the asiTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsiTitle() {
        return asiTitle;
    }

    /**
     * Sets the value of the asiTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsiTitle(String value) {
        this.asiTitle = value;
    }

    /**
     * Gets the value of the identRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getIdentRef() {
        return identRef;
    }

    /**
     * Sets the value of the identRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentRef(Long value) {
        this.identRef = value;
    }

}
