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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class RenderFibType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "render_fibType", propOrder = {
    "responseLabel"
})
public class RenderFibType implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The response label. */
    @XmlElement(name = "response_label", required = true)
    protected ResponseLabelType responseLabel;
    
    /** The fibtype. */
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fibtype;
    
    /** The prompt. */
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String prompt;
    
    /** The maxchars. */
    @XmlAttribute
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long maxchars;

    /**
     * Gets the response label.
     * 
     * @return the response label
     */
    public ResponseLabelType getResponseLabel() {
        return responseLabel;
    }

    /**
     * Sets the response label.
     * 
     * @param value the new response label
     */
    public void setResponseLabel(ResponseLabelType value) {
        this.responseLabel = value;
    }

    /**
     * Gets the fibtype.
     * 
     * @return the fibtype
     */
    public String getFibtype() {
        if (fibtype == null) {
            return "String";
        } else {
            return fibtype;
        }
    }

    /**
     * Sets the fibtype.
     * 
     * @param value the new fibtype
     */
    public void setFibtype(String value) {
        this.fibtype = value;
    }

    /**
     * Gets the prompt.
     * 
     * @return the prompt
     */
    public String getPrompt() {
        if (prompt == null) {
            return "Box";
        } else {
            return prompt;
        }
    }

    /**
     * Sets the prompt.
     * 
     * @param value the new prompt
     */
    public void setPrompt(String value) {
        this.prompt = value;
    }

    /**
     * Gets the maxchars.
     * 
     * @return the maxchars
     */
    public Long getMaxchars() {
        return maxchars;
    }

    /**
     * Sets the maxchars.
     * 
     * @param value the new maxchars
     */
    public void setMaxchars(Long value) {
        this.maxchars = value;
    }

}
