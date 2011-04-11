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
 * The Class ItemmetadataType.
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

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The qtimetadata. */
    protected List<QtimetadataType> qtimetadata;
    
    /** The qmd computerscored. */
    @XmlElement(name = "qmd_computerscored")
    protected String qmdComputerscored;
    
    /** The qmd feedbackpermitted. */
    @XmlElement(name = "qmd_feedbackpermitted")
    protected String qmdFeedbackpermitted;
    
    /** The qmd hintspermitted. */
    @XmlElement(name = "qmd_hintspermitted")
    protected String qmdHintspermitted;
    
    /** The qmd itemtype. */
    @XmlElement(name = "qmd_itemtype")
    protected String qmdItemtype;
    
    /** The qmd levelofdifficulty. */
    @XmlElement(name = "qmd_levelofdifficulty")
    protected String qmdLevelofdifficulty;
    
    /** The qmd maximumscore. */
    @XmlElement(name = "qmd_maximumscore")
    protected String qmdMaximumscore;
    
    /** The qmd renderingtype. */
    @XmlElement(name = "qmd_renderingtype")
    protected List<String> qmdRenderingtype;
    
    /** The qmd responsetype. */
    @XmlElement(name = "qmd_responsetype")
    protected List<String> qmdResponsetype;
    
    /** The qmd scoringpermitted. */
    @XmlElement(name = "qmd_scoringpermitted")
    protected String qmdScoringpermitted;
    
    /** The qmd solutionspermitted. */
    @XmlElement(name = "qmd_solutionspermitted")
    protected String qmdSolutionspermitted;
    
    /** The qmd status. */
    @XmlElement(name = "qmd_status")
    protected String qmdStatus;
    
    /** The qmd timedependence. */
    @XmlElement(name = "qmd_timedependence")
    protected String qmdTimedependence;
    
    /** The qmd timelimit. */
    @XmlElement(name = "qmd_timelimit")
    protected String qmdTimelimit;
    
    /** The qmd toolvendor. */
    @XmlElement(name = "qmd_toolvendor")
    protected String qmdToolvendor;
    
    /** The qmd topic. */
    @XmlElement(name = "qmd_topic")
    protected String qmdTopic;
    
    /** The qmd weighting. */
    @XmlElement(name = "qmd_weighting")
    protected String qmdWeighting;
    
    /** The qmd material. */
    @XmlElement(name = "qmd_material")
    protected List<String> qmdMaterial;
    
    /** The qmd typeofsolution. */
    @XmlElement(name = "qmd_typeofsolution")
    protected String qmdTypeofsolution;

    /**
     * Gets the qtimetadata.
     * 
     * @return the qtimetadata
     */
    public List<QtimetadataType> getQtimetadata() {
        if (qtimetadata == null) {
            qtimetadata = new ArrayList<QtimetadataType>();
        }
        return this.qtimetadata;
    }

    /**
     * Gets the qmd computerscored.
     * 
     * @return the qmd computerscored
     */
    public String getQmdComputerscored() {
        return qmdComputerscored;
    }

    /**
     * Sets the qmd computerscored.
     * 
     * @param value the new qmd computerscored
     */
    public void setQmdComputerscored(String value) {
        this.qmdComputerscored = value;
    }

    /**
     * Gets the qmd feedbackpermitted.
     * 
     * @return the qmd feedbackpermitted
     */
    public String getQmdFeedbackpermitted() {
        return qmdFeedbackpermitted;
    }

    /**
     * Sets the qmd feedbackpermitted.
     * 
     * @param value the new qmd feedbackpermitted
     */
    public void setQmdFeedbackpermitted(String value) {
        this.qmdFeedbackpermitted = value;
    }

    /**
     * Gets the qmd hintspermitted.
     * 
     * @return the qmd hintspermitted
     */
    public String getQmdHintspermitted() {
        return qmdHintspermitted;
    }

    /**
     * Sets the qmd hintspermitted.
     * 
     * @param value the new qmd hintspermitted
     */
    public void setQmdHintspermitted(String value) {
        this.qmdHintspermitted = value;
    }

    /**
     * Gets the qmd itemtype.
     * 
     * @return the qmd itemtype
     */
    public String getQmdItemtype() {
        return qmdItemtype;
    }

    /**
     * Sets the qmd itemtype.
     * 
     * @param value the new qmd itemtype
     */
    public void setQmdItemtype(String value) {
        this.qmdItemtype = value;
    }

    /**
     * Gets the qmd levelofdifficulty.
     * 
     * @return the qmd levelofdifficulty
     */
    public String getQmdLevelofdifficulty() {
        return qmdLevelofdifficulty;
    }

    /**
     * Sets the qmd levelofdifficulty.
     * 
     * @param value the new qmd levelofdifficulty
     */
    public void setQmdLevelofdifficulty(String value) {
        this.qmdLevelofdifficulty = value;
    }

    /**
     * Gets the qmd maximumscore.
     * 
     * @return the qmd maximumscore
     */
    public String getQmdMaximumscore() {
        return qmdMaximumscore;
    }

    /**
     * Sets the qmd maximumscore.
     * 
     * @param value the new qmd maximumscore
     */
    public void setQmdMaximumscore(String value) {
        this.qmdMaximumscore = value;
    }

    /**
     * Gets the qmd renderingtype.
     * 
     * @return the qmd renderingtype
     */
    public List<String> getQmdRenderingtype() {
        if (qmdRenderingtype == null) {
            qmdRenderingtype = new ArrayList<String>();
        }
        return this.qmdRenderingtype;
    }

    /**
     * Gets the qmd responsetype.
     * 
     * @return the qmd responsetype
     */
    public List<String> getQmdResponsetype() {
        if (qmdResponsetype == null) {
            qmdResponsetype = new ArrayList<String>();
        }
        return this.qmdResponsetype;
    }

    /**
     * Gets the qmd scoringpermitted.
     * 
     * @return the qmd scoringpermitted
     */
    public String getQmdScoringpermitted() {
        return qmdScoringpermitted;
    }

    /**
     * Sets the qmd scoringpermitted.
     * 
     * @param value the new qmd scoringpermitted
     */
    public void setQmdScoringpermitted(String value) {
        this.qmdScoringpermitted = value;
    }

    /**
     * Gets the qmd solutionspermitted.
     * 
     * @return the qmd solutionspermitted
     */
    public String getQmdSolutionspermitted() {
        return qmdSolutionspermitted;
    }

    /**
     * Sets the qmd solutionspermitted.
     * 
     * @param value the new qmd solutionspermitted
     */
    public void setQmdSolutionspermitted(String value) {
        this.qmdSolutionspermitted = value;
    }

    /**
     * Gets the qmd status.
     * 
     * @return the qmd status
     */
    public String getQmdStatus() {
        return qmdStatus;
    }

    /**
     * Sets the qmd status.
     * 
     * @param value the new qmd status
     */
    public void setQmdStatus(String value) {
        this.qmdStatus = value;
    }

    /**
     * Gets the qmd timedependence.
     * 
     * @return the qmd timedependence
     */
    public String getQmdTimedependence() {
        return qmdTimedependence;
    }

    /**
     * Sets the qmd timedependence.
     * 
     * @param value the new qmd timedependence
     */
    public void setQmdTimedependence(String value) {
        this.qmdTimedependence = value;
    }

    /**
     * Gets the qmd timelimit.
     * 
     * @return the qmd timelimit
     */
    public String getQmdTimelimit() {
        return qmdTimelimit;
    }

    /**
     * Sets the qmd timelimit.
     * 
     * @param value the new qmd timelimit
     */
    public void setQmdTimelimit(String value) {
        this.qmdTimelimit = value;
    }

    /**
     * Gets the qmd toolvendor.
     * 
     * @return the qmd toolvendor
     */
    public String getQmdToolvendor() {
        return qmdToolvendor;
    }

    /**
     * Sets the qmd toolvendor.
     * 
     * @param value the new qmd toolvendor
     */
    public void setQmdToolvendor(String value) {
        this.qmdToolvendor = value;
    }

    /**
     * Gets the qmd topic.
     * 
     * @return the qmd topic
     */
    public String getQmdTopic() {
        return qmdTopic;
    }

    /**
     * Sets the qmd topic.
     * 
     * @param value the new qmd topic
     */
    public void setQmdTopic(String value) {
        this.qmdTopic = value;
    }

    /**
     * Gets the qmd weighting.
     * 
     * @return the qmd weighting
     */
    public String getQmdWeighting() {
        return qmdWeighting;
    }

    /**
     * Sets the qmd weighting.
     * 
     * @param value the new qmd weighting
     */
    public void setQmdWeighting(String value) {
        this.qmdWeighting = value;
    }

    /**
     * Gets the qmd material.
     * 
     * @return the qmd material
     */
    public List<String> getQmdMaterial() {
        if (qmdMaterial == null) {
            qmdMaterial = new ArrayList<String>();
        }
        return this.qmdMaterial;
    }

    /**
     * Gets the qmd typeofsolution.
     * 
     * @return the qmd typeofsolution
     */
    public String getQmdTypeofsolution() {
        return qmdTypeofsolution;
    }

    /**
     * Sets the qmd typeofsolution.
     * 
     * @param value the new qmd typeofsolution
     */
    public void setQmdTypeofsolution(String value) {
        this.qmdTypeofsolution = value;
    }

}
