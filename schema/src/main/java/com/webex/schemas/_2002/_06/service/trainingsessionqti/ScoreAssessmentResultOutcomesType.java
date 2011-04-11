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
 * <p>Java class for score_assessment_result_outcomesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="score_assessment_result_outcomesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="score_value" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="score_min" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="score_max" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *       &lt;attribute name="varname" type="{http://www.w3.org/2001/XMLSchema}string" default="SCORE" />
 *       &lt;attribute name="vartype" default="Integer">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Integer"/>
 *             &lt;enumeration value="Decimal"/>
 *             &lt;enumeration value="String"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
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

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "score_value", required = true, type = String.class, defaultValue = "0")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long scoreValue;
    @XmlElement(name = "score_min", required = true, type = String.class, defaultValue = "0")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long scoreMin;
    @XmlElement(name = "score_max", required = true, type = String.class, defaultValue = "0")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long scoreMax;
    @XmlAttribute
    protected String varname;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String vartype;

    /**
     * Gets the value of the scoreValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getScoreValue() {
        return scoreValue;
    }

    /**
     * Sets the value of the scoreValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreValue(Long value) {
        this.scoreValue = value;
    }

    /**
     * Gets the value of the scoreMin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getScoreMin() {
        return scoreMin;
    }

    /**
     * Sets the value of the scoreMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreMin(Long value) {
        this.scoreMin = value;
    }

    /**
     * Gets the value of the scoreMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getScoreMax() {
        return scoreMax;
    }

    /**
     * Sets the value of the scoreMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreMax(Long value) {
        this.scoreMax = value;
    }

    /**
     * Gets the value of the varname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVarname() {
        if (varname == null) {
            return "SCORE";
        } else {
            return varname;
        }
    }

    /**
     * Sets the value of the varname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVarname(String value) {
        this.varname = value;
    }

    /**
     * Gets the value of the vartype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVartype() {
        if (vartype == null) {
            return "Integer";
        } else {
            return vartype;
        }
    }

    /**
     * Sets the value of the vartype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVartype(String value) {
        this.vartype = value;
    }

}
