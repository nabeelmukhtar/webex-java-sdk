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
 * <p>Java class for getTestInformationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTestInformationResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/trainingsession}scheduledTestInstanceType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeLimit" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numQuestions" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="numSubmitted" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="numStarted" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="numSubmittedUnscroed" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="numSubmittedUnscored" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="submittedTest" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}submittedTestType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="maxScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
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

    private final static long serialVersionUID = 2461660169443089969L;
    protected String description;
    @XmlElement(required = true)
    protected String startDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long timeLimit;
    @XmlElement(required = true)
    protected String author;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long numQuestions;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long numSubmitted;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long numStarted;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long numSubmittedUnscroed;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long numSubmittedUnscored;
    protected List<SubmittedTestType> submittedTest;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long maxScore;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the timeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getTimeLimit() {
        return timeLimit;
    }

    /**
     * Sets the value of the timeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeLimit(Long value) {
        this.timeLimit = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the numQuestions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getNumQuestions() {
        return numQuestions;
    }

    /**
     * Sets the value of the numQuestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumQuestions(Long value) {
        this.numQuestions = value;
    }

    /**
     * Gets the value of the numSubmitted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getNumSubmitted() {
        return numSubmitted;
    }

    /**
     * Sets the value of the numSubmitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumSubmitted(Long value) {
        this.numSubmitted = value;
    }

    /**
     * Gets the value of the numStarted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getNumStarted() {
        return numStarted;
    }

    /**
     * Sets the value of the numStarted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumStarted(Long value) {
        this.numStarted = value;
    }

    /**
     * Gets the value of the numSubmittedUnscroed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getNumSubmittedUnscroed() {
        return numSubmittedUnscroed;
    }

    /**
     * Sets the value of the numSubmittedUnscroed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumSubmittedUnscroed(Long value) {
        this.numSubmittedUnscroed = value;
    }

    /**
     * Gets the value of the numSubmittedUnscored property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getNumSubmittedUnscored() {
        return numSubmittedUnscored;
    }

    /**
     * Sets the value of the numSubmittedUnscored property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumSubmittedUnscored(Long value) {
        this.numSubmittedUnscored = value;
    }

    /**
     * Gets the value of the submittedTest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the submittedTest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubmittedTest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubmittedTestType }
     * 
     * 
     */
    public List<SubmittedTestType> getSubmittedTest() {
        if (submittedTest == null) {
            submittedTest = new ArrayList<SubmittedTestType>();
        }
        return this.submittedTest;
    }

    /**
     * Gets the value of the maxScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getMaxScore() {
        return maxScore;
    }

    /**
     * Sets the value of the maxScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxScore(Long value) {
        this.maxScore = value;
    }

}
