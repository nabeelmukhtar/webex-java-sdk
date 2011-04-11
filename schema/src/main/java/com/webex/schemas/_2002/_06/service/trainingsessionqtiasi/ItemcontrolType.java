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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for itemcontrolType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="itemcontrolType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="qticomment" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}qticommentType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="feedbackswitch" default="Yes">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="hintswitch" default="Yes">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="solutionswitch" default="Yes">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="view" default="All">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="All"/>
 *             &lt;enumeration value="Administrator"/>
 *             &lt;enumeration value="AdminAuthority"/>
 *             &lt;enumeration value="Assessor"/>
 *             &lt;enumeration value="Author"/>
 *             &lt;enumeration value="Candidate"/>
 *             &lt;enumeration value="InvigilatorProctor"/>
 *             &lt;enumeration value="Psychometrician"/>
 *             &lt;enumeration value="Scorer"/>
 *             &lt;enumeration value="Tutor"/>
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
@XmlType(name = "itemcontrolType", propOrder = {
    "qticomment"
})
public class ItemcontrolType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected QticommentType qticomment;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String feedbackswitch;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String hintswitch;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String solutionswitch;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String view;

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
     * Gets the value of the feedbackswitch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedbackswitch() {
        if (feedbackswitch == null) {
            return "Yes";
        } else {
            return feedbackswitch;
        }
    }

    /**
     * Sets the value of the feedbackswitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedbackswitch(String value) {
        this.feedbackswitch = value;
    }

    /**
     * Gets the value of the hintswitch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHintswitch() {
        if (hintswitch == null) {
            return "Yes";
        } else {
            return hintswitch;
        }
    }

    /**
     * Sets the value of the hintswitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHintswitch(String value) {
        this.hintswitch = value;
    }

    /**
     * Gets the value of the solutionswitch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolutionswitch() {
        if (solutionswitch == null) {
            return "Yes";
        } else {
            return solutionswitch;
        }
    }

    /**
     * Sets the value of the solutionswitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolutionswitch(String value) {
        this.solutionswitch = value;
    }

    /**
     * Gets the value of the view property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getView() {
        if (view == null) {
            return "All";
        } else {
            return view;
        }
    }

    /**
     * Sets the value of the view property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setView(String value) {
        this.view = value;
    }

}
