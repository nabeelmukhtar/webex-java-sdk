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
 * <p>Java class for outcomes_processingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outcomes_processingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="qticomment" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}qticommentType" minOccurs="0"/>
 *         &lt;element name="outcomes" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}outcomesType"/>
 *         &lt;element name="objects_condition" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}objects_conditionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="processing_parameter" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}processing_parameterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="map_output" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}map_outputType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="outcomes_feedback_test" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}outcomes_feedback_testType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="scoremodel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
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

    private final static long serialVersionUID = 2461660169443089969L;
    protected QticommentType qticomment;
    @XmlElement(required = true)
    protected OutcomesType outcomes;
    @XmlElement(name = "objects_condition")
    protected List<ObjectsConditionType> objectsCondition;
    @XmlElement(name = "processing_parameter")
    protected List<ProcessingParameterType> processingParameter;
    @XmlElement(name = "map_output")
    protected List<MapOutputType> mapOutput;
    @XmlElement(name = "outcomes_feedback_test")
    protected List<OutcomesFeedbackTestType> outcomesFeedbackTest;
    @XmlAttribute
    protected String scoremodel;

    /**
     * Gets the value of the qticomment property.
     * 
     * @return
     *     possible object is
     *     {@link QticommentType }
     *     
     */
    public QticommentType getQticomment() {
        return qticomment;
    }

    /**
     * Sets the value of the qticomment property.
     * 
     * @param value
     *     allowed object is
     *     {@link QticommentType }
     *     
     */
    public void setQticomment(QticommentType value) {
        this.qticomment = value;
    }

    /**
     * Gets the value of the outcomes property.
     * 
     * @return
     *     possible object is
     *     {@link OutcomesType }
     *     
     */
    public OutcomesType getOutcomes() {
        return outcomes;
    }

    /**
     * Sets the value of the outcomes property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutcomesType }
     *     
     */
    public void setOutcomes(OutcomesType value) {
        this.outcomes = value;
    }

    /**
     * Gets the value of the objectsCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectsCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectsCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectsConditionType }
     * 
     * 
     */
    public List<ObjectsConditionType> getObjectsCondition() {
        if (objectsCondition == null) {
            objectsCondition = new ArrayList<ObjectsConditionType>();
        }
        return this.objectsCondition;
    }

    /**
     * Gets the value of the processingParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processingParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessingParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessingParameterType }
     * 
     * 
     */
    public List<ProcessingParameterType> getProcessingParameter() {
        if (processingParameter == null) {
            processingParameter = new ArrayList<ProcessingParameterType>();
        }
        return this.processingParameter;
    }

    /**
     * Gets the value of the mapOutput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mapOutput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMapOutput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MapOutputType }
     * 
     * 
     */
    public List<MapOutputType> getMapOutput() {
        if (mapOutput == null) {
            mapOutput = new ArrayList<MapOutputType>();
        }
        return this.mapOutput;
    }

    /**
     * Gets the value of the outcomesFeedbackTest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outcomesFeedbackTest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutcomesFeedbackTest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutcomesFeedbackTestType }
     * 
     * 
     */
    public List<OutcomesFeedbackTestType> getOutcomesFeedbackTest() {
        if (outcomesFeedbackTest == null) {
            outcomesFeedbackTest = new ArrayList<OutcomesFeedbackTestType>();
        }
        return this.outcomesFeedbackTest;
    }

    /**
     * Gets the value of the scoremodel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoremodel() {
        return scoremodel;
    }

    /**
     * Sets the value of the scoremodel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoremodel(String value) {
        this.scoremodel = value;
    }

}
