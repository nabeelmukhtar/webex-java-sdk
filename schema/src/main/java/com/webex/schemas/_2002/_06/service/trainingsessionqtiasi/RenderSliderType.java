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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The Class RenderSliderType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "render_sliderType", propOrder = {
    "materialOrMaterialRefOrResponseLabel",
    "responseNa"
})
public class RenderSliderType implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The material or material ref or response label. */
    @XmlElements({
        @XmlElement(name = "flow_label", type = FlowLabelType.class),
        @XmlElement(name = "response_label", type = ResponseLabelType.class),
        @XmlElement(name = "material", type = MaterialType.class),
        @XmlElement(name = "material_ref", type = MaterialRefType.class)
    })
    protected List<Serializable> materialOrMaterialRefOrResponseLabel;
    
    /** The response na. */
    @XmlElement(name = "response_na")
    protected ResponseNaType responseNa;
    
    /** The orientation. */
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String orientation;
    
    /** The lowerbound. */
    @XmlAttribute(required = true)
    protected String lowerbound;
    
    /** The upperbound. */
    @XmlAttribute(required = true)
    protected String upperbound;
    
    /** The step. */
    @XmlAttribute
    protected String step;
    
    /** The startval. */
    @XmlAttribute
    protected String startval;
    
    /** The steplabel. */
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String steplabel;
    
    /** The maxnumber. */
    @XmlAttribute
    protected String maxnumber;
    
    /** The minnumber. */
    @XmlAttribute
    protected String minnumber;

    /**
     * Gets the material or material ref or response label.
     * 
     * @return the material or material ref or response label
     */
    public List<Serializable> getMaterialOrMaterialRefOrResponseLabel() {
        if (materialOrMaterialRefOrResponseLabel == null) {
            materialOrMaterialRefOrResponseLabel = new ArrayList<Serializable>();
        }
        return this.materialOrMaterialRefOrResponseLabel;
    }

    /**
     * Gets the response na.
     * 
     * @return the response na
     */
    public ResponseNaType getResponseNa() {
        return responseNa;
    }

    /**
     * Sets the response na.
     * 
     * @param value the new response na
     */
    public void setResponseNa(ResponseNaType value) {
        this.responseNa = value;
    }

    /**
     * Gets the orientation.
     * 
     * @return the orientation
     */
    public String getOrientation() {
        if (orientation == null) {
            return "Horizontal";
        } else {
            return orientation;
        }
    }

    /**
     * Sets the orientation.
     * 
     * @param value the new orientation
     */
    public void setOrientation(String value) {
        this.orientation = value;
    }

    /**
     * Gets the lowerbound.
     * 
     * @return the lowerbound
     */
    public String getLowerbound() {
        return lowerbound;
    }

    /**
     * Sets the lowerbound.
     * 
     * @param value the new lowerbound
     */
    public void setLowerbound(String value) {
        this.lowerbound = value;
    }

    /**
     * Gets the upperbound.
     * 
     * @return the upperbound
     */
    public String getUpperbound() {
        return upperbound;
    }

    /**
     * Sets the upperbound.
     * 
     * @param value the new upperbound
     */
    public void setUpperbound(String value) {
        this.upperbound = value;
    }

    /**
     * Gets the step.
     * 
     * @return the step
     */
    public String getStep() {
        return step;
    }

    /**
     * Sets the step.
     * 
     * @param value the new step
     */
    public void setStep(String value) {
        this.step = value;
    }

    /**
     * Gets the startval.
     * 
     * @return the startval
     */
    public String getStartval() {
        return startval;
    }

    /**
     * Sets the startval.
     * 
     * @param value the new startval
     */
    public void setStartval(String value) {
        this.startval = value;
    }

    /**
     * Gets the steplabel.
     * 
     * @return the steplabel
     */
    public String getSteplabel() {
        if (steplabel == null) {
            return "No";
        } else {
            return steplabel;
        }
    }

    /**
     * Sets the steplabel.
     * 
     * @param value the new steplabel
     */
    public void setSteplabel(String value) {
        this.steplabel = value;
    }

    /**
     * Gets the maxnumber.
     * 
     * @return the maxnumber
     */
    public String getMaxnumber() {
        return maxnumber;
    }

    /**
     * Sets the maxnumber.
     * 
     * @param value the new maxnumber
     */
    public void setMaxnumber(String value) {
        this.maxnumber = value;
    }

    /**
     * Gets the minnumber.
     * 
     * @return the minnumber
     */
    public String getMinnumber() {
        return minnumber;
    }

    /**
     * Sets the minnumber.
     * 
     * @param value the new minnumber
     */
    public void setMinnumber(String value) {
        this.minnumber = value;
    }

}
