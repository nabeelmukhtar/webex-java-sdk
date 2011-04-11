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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The Class ResponseFormType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "response_formType", propOrder = {
    "correctResponse"
})
public class ResponseFormType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The correct response. */
    @XmlElement(name = "correct_response", required = true)
    protected List<CorrectResponseType> correctResponse;
    
    /** The cardinality. */
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cardinality;
    
    /** The response type. */
    @XmlAttribute(name = "response_type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String responseType;
    
    /** The render type. */
    @XmlAttribute(name = "render_type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String renderType;

    /**
     * Gets the correct response.
     * 
     * @return the correct response
     */
    public List<CorrectResponseType> getCorrectResponse() {
        if (correctResponse == null) {
            correctResponse = new ArrayList<CorrectResponseType>();
        }
        return this.correctResponse;
    }

    /**
     * Gets the cardinality.
     * 
     * @return the cardinality
     */
    public String getCardinality() {
        if (cardinality == null) {
            return "single";
        } else {
            return cardinality;
        }
    }

    /**
     * Sets the cardinality.
     * 
     * @param value the new cardinality
     */
    public void setCardinality(String value) {
        this.cardinality = value;
    }

    /**
     * Gets the response type.
     * 
     * @return the response type
     */
    public String getResponseType() {
        if (responseType == null) {
            return "lid";
        } else {
            return responseType;
        }
    }

    /**
     * Sets the response type.
     * 
     * @param value the new response type
     */
    public void setResponseType(String value) {
        this.responseType = value;
    }

    /**
     * Gets the render type.
     * 
     * @return the render type
     */
    public String getRenderType() {
        if (renderType == null) {
            return "choice";
        } else {
            return renderType;
        }
    }

    /**
     * Sets the render type.
     * 
     * @param value the new render type
     */
    public void setRenderType(String value) {
        this.renderType = value;
    }

}
