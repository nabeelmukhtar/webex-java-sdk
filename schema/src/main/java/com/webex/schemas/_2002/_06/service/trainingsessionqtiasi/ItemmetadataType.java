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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for itemmetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="itemmetadataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="qtimetadata" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}qtimetadataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}qmd_computerscored" minOccurs="0"/>
 *         &lt;element ref="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}qmd_feedbackpermitted" minOccurs="0"/>
 *         &lt;element ref="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}qmd_hintspermitted" minOccurs="0"/>
 *         &lt;element ref="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}qmd_itemtype" minOccurs="0"/>
 *         &lt;element ref="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}qmd_levelofdifficulty" minOccurs="0"/>
 *         &lt;element ref="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}qmd_maximumscore" minOccurs="0"/>
 *         &lt;element ref="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}qmd_renderingtype" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}qmd_responsetype" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}qmd_scoringpermitted" minOccurs="0"/>
 *         &lt;element ref="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}qmd_solutionspermitted" minOccurs="0"/>
 *         &lt;element ref="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}qmd_status" minOccurs="0"/>
 *         &lt;element ref="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}qmd_timedependence" minOccurs="0"/>
 *         &lt;element ref="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}qmd_timelimit" minOccurs="0"/>
 *         &lt;element ref="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}qmd_toolvendor" minOccurs="0"/>
 *         &lt;element ref="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}qmd_topic" minOccurs="0"/>
 *         &lt;element ref="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}qmd_weighting" minOccurs="0"/>
 *         &lt;element ref="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}qmd_material" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}qmd_typeofsolution" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemmetadataType", propOrder = {
    "qtimetadata",
    "qmdComputerscored",
    "qmdFeedbackpermitted",
    "qmdHintspermitted",
    "qmdItemtype",
    "qmdLevelofdifficulty",
    "qmdMaximumscore",
    "qmdRenderingtype",
    "qmdResponsetype",
    "qmdScoringpermitted",
    "qmdSolutionspermitted",
    "qmdStatus",
    "qmdTimedependence",
    "qmdTimelimit",
    "qmdToolvendor",
    "qmdTopic",
    "qmdWeighting",
    "qmdMaterial",
    "qmdTypeofsolution"
})
public class ItemmetadataType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<QtimetadataType> qtimetadata;
    @XmlElement(name = "qmd_computerscored")
    protected String qmdComputerscored;
    @XmlElement(name = "qmd_feedbackpermitted")
    protected String qmdFeedbackpermitted;
    @XmlElement(name = "qmd_hintspermitted")
    protected String qmdHintspermitted;
    @XmlElement(name = "qmd_itemtype")
    protected String qmdItemtype;
    @XmlElement(name = "qmd_levelofdifficulty")
    protected String qmdLevelofdifficulty;
    @XmlElement(name = "qmd_maximumscore")
    protected String qmdMaximumscore;
    @XmlElement(name = "qmd_renderingtype")
    protected List<String> qmdRenderingtype;
    @XmlElement(name = "qmd_responsetype")
    protected List<String> qmdResponsetype;
    @XmlElement(name = "qmd_scoringpermitted")
    protected String qmdScoringpermitted;
    @XmlElement(name = "qmd_solutionspermitted")
    protected String qmdSolutionspermitted;
    @XmlElement(name = "qmd_status")
    protected String qmdStatus;
    @XmlElement(name = "qmd_timedependence")
    protected String qmdTimedependence;
    @XmlElement(name = "qmd_timelimit")
    protected String qmdTimelimit;
    @XmlElement(name = "qmd_toolvendor")
    protected String qmdToolvendor;
    @XmlElement(name = "qmd_topic")
    protected String qmdTopic;
    @XmlElement(name = "qmd_weighting")
    protected String qmdWeighting;
    @XmlElement(name = "qmd_material")
    protected List<String> qmdMaterial;
    @XmlElement(name = "qmd_typeofsolution")
    protected String qmdTypeofsolution;

    /**
     * Gets the value of the qtimetadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qtimetadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQtimetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QtimetadataType }
     * 
     * 
     */
    public List<QtimetadataType> getQtimetadata() {
        if (qtimetadata == null) {
            qtimetadata = new ArrayList<QtimetadataType>();
        }
        return this.qtimetadata;
    }

    /**
     * Gets the value of the qmdComputerscored property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQmdComputerscored() {
        return qmdComputerscored;
    }

    /**
     * Sets the value of the qmdComputerscored property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQmdComputerscored(String value) {
        this.qmdComputerscored = value;
    }

    /**
     * Gets the value of the qmdFeedbackpermitted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQmdFeedbackpermitted() {
        return qmdFeedbackpermitted;
    }

    /**
     * Sets the value of the qmdFeedbackpermitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQmdFeedbackpermitted(String value) {
        this.qmdFeedbackpermitted = value;
    }

    /**
     * Gets the value of the qmdHintspermitted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQmdHintspermitted() {
        return qmdHintspermitted;
    }

    /**
     * Sets the value of the qmdHintspermitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQmdHintspermitted(String value) {
        this.qmdHintspermitted = value;
    }

    /**
     * Gets the value of the qmdItemtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQmdItemtype() {
        return qmdItemtype;
    }

    /**
     * Sets the value of the qmdItemtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQmdItemtype(String value) {
        this.qmdItemtype = value;
    }

    /**
     * Gets the value of the qmdLevelofdifficulty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQmdLevelofdifficulty() {
        return qmdLevelofdifficulty;
    }

    /**
     * Sets the value of the qmdLevelofdifficulty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQmdLevelofdifficulty(String value) {
        this.qmdLevelofdifficulty = value;
    }

    /**
     * Gets the value of the qmdMaximumscore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQmdMaximumscore() {
        return qmdMaximumscore;
    }

    /**
     * Sets the value of the qmdMaximumscore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQmdMaximumscore(String value) {
        this.qmdMaximumscore = value;
    }

    /**
     * Gets the value of the qmdRenderingtype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qmdRenderingtype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQmdRenderingtype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getQmdRenderingtype() {
        if (qmdRenderingtype == null) {
            qmdRenderingtype = new ArrayList<String>();
        }
        return this.qmdRenderingtype;
    }

    /**
     * Gets the value of the qmdResponsetype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qmdResponsetype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQmdResponsetype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getQmdResponsetype() {
        if (qmdResponsetype == null) {
            qmdResponsetype = new ArrayList<String>();
        }
        return this.qmdResponsetype;
    }

    /**
     * Gets the value of the qmdScoringpermitted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQmdScoringpermitted() {
        return qmdScoringpermitted;
    }

    /**
     * Sets the value of the qmdScoringpermitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQmdScoringpermitted(String value) {
        this.qmdScoringpermitted = value;
    }

    /**
     * Gets the value of the qmdSolutionspermitted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQmdSolutionspermitted() {
        return qmdSolutionspermitted;
    }

    /**
     * Sets the value of the qmdSolutionspermitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQmdSolutionspermitted(String value) {
        this.qmdSolutionspermitted = value;
    }

    /**
     * Gets the value of the qmdStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQmdStatus() {
        return qmdStatus;
    }

    /**
     * Sets the value of the qmdStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQmdStatus(String value) {
        this.qmdStatus = value;
    }

    /**
     * Gets the value of the qmdTimedependence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQmdTimedependence() {
        return qmdTimedependence;
    }

    /**
     * Sets the value of the qmdTimedependence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQmdTimedependence(String value) {
        this.qmdTimedependence = value;
    }

    /**
     * Gets the value of the qmdTimelimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQmdTimelimit() {
        return qmdTimelimit;
    }

    /**
     * Sets the value of the qmdTimelimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQmdTimelimit(String value) {
        this.qmdTimelimit = value;
    }

    /**
     * Gets the value of the qmdToolvendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQmdToolvendor() {
        return qmdToolvendor;
    }

    /**
     * Sets the value of the qmdToolvendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQmdToolvendor(String value) {
        this.qmdToolvendor = value;
    }

    /**
     * Gets the value of the qmdTopic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQmdTopic() {
        return qmdTopic;
    }

    /**
     * Sets the value of the qmdTopic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQmdTopic(String value) {
        this.qmdTopic = value;
    }

    /**
     * Gets the value of the qmdWeighting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQmdWeighting() {
        return qmdWeighting;
    }

    /**
     * Sets the value of the qmdWeighting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQmdWeighting(String value) {
        this.qmdWeighting = value;
    }

    /**
     * Gets the value of the qmdMaterial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qmdMaterial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQmdMaterial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getQmdMaterial() {
        if (qmdMaterial == null) {
            qmdMaterial = new ArrayList<String>();
        }
        return this.qmdMaterial;
    }

    /**
     * Gets the value of the qmdTypeofsolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQmdTypeofsolution() {
        return qmdTypeofsolution;
    }

    /**
     * Sets the value of the qmdTypeofsolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQmdTypeofsolution(String value) {
        this.qmdTypeofsolution = value;
    }

}
