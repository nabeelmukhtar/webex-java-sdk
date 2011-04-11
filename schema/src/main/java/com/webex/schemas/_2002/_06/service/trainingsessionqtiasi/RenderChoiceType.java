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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class RenderChoiceType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "render_choiceType", propOrder = {
    "responseLabel"
})
public class RenderChoiceType implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The response label. */
    @XmlElement(name = "response_label", required = true)
    protected List<ResponseLabelType> responseLabel;
    
    /** The minnumber. */
    @XmlAttribute
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long minnumber;
    
    /** The maxnumber. */
    @XmlAttribute
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long maxnumber;

    /**
     * Gets the response label.
     * 
     * @return the response label
     */
    public List<ResponseLabelType> getResponseLabel() {
        if (responseLabel == null) {
            responseLabel = new ArrayList<ResponseLabelType>();
        }
        return this.responseLabel;
    }

    /**
     * Gets the minnumber.
     * 
     * @return the minnumber
     */
    public Long getMinnumber() {
        return minnumber;
    }

    /**
     * Sets the minnumber.
     * 
     * @param value the new minnumber
     */
    public void setMinnumber(Long value) {
        this.minnumber = value;
    }

    /**
     * Gets the maxnumber.
     * 
     * @return the maxnumber
     */
    public Long getMaxnumber() {
        return maxnumber;
    }

    /**
     * Sets the maxnumber.
     * 
     * @param value the new maxnumber
     */
    public void setMaxnumber(Long value) {
        this.maxnumber = value;
    }

}
