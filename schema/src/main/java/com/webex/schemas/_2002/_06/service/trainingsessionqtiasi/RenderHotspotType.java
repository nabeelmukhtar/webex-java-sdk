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
 * The Class RenderHotspotType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "render_hotspotType", propOrder = {
    "materialOrMaterialRefOrResponseLabel",
    "responseNa"
})
public class RenderHotspotType implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The material or material ref or response label. */
    @XmlElements({
        @XmlElement(name = "material", type = MaterialType.class),
        @XmlElement(name = "response_label", type = ResponseLabelType.class),
        @XmlElement(name = "flow_label", type = FlowLabelType.class),
        @XmlElement(name = "material_ref", type = MaterialRefType.class)
    })
    protected List<Serializable> materialOrMaterialRefOrResponseLabel;
    
    /** The response na. */
    @XmlElement(name = "response_na")
    protected ResponseNaType responseNa;
    
    /** The maxnumber. */
    @XmlAttribute
    protected String maxnumber;
    
    /** The minnumber. */
    @XmlAttribute
    protected String minnumber;
    
    /** The showdraw. */
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String showdraw;

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

    /**
     * Gets the showdraw.
     * 
     * @return the showdraw
     */
    public String getShowdraw() {
        if (showdraw == null) {
            return "No";
        } else {
            return showdraw;
        }
    }

    /**
     * Sets the showdraw.
     * 
     * @param value the new showdraw
     */
    public void setShowdraw(String value) {
        this.showdraw = value;
    }

}
