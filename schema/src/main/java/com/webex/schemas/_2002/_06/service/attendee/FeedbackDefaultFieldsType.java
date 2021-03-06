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

package com.webex.schemas._2002._06.service.attendee;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for feedbackDefaultFieldsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="feedbackDefaultFieldsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="setup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="easeOfUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="performance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "feedbackDefaultFieldsType", propOrder = {
    "setup",
    "easeOfUse",
    "performance",
    "comment"
})
public class FeedbackDefaultFieldsType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String setup;
    protected String easeOfUse;
    protected String performance;
    protected String comment;

    /**
     * Gets the value of the setup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetup() {
        return setup;
    }

    /**
     * Sets the value of the setup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetup(String value) {
        this.setup = value;
    }

    /**
     * Gets the value of the easeOfUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEaseOfUse() {
        return easeOfUse;
    }

    /**
     * Sets the value of the easeOfUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEaseOfUse(String value) {
        this.easeOfUse = value;
    }

    /**
     * Gets the value of the performance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerformance() {
        return performance;
    }

    /**
     * Sets the value of the performance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerformance(String value) {
        this.performance = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
