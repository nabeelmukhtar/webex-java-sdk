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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The Class HintType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hintType", propOrder = {
    "qticomment",
    "hintmaterial"
})
public class HintType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The qticomment. */
    protected QticommentType qticomment;
    
    /** The hintmaterial. */
    @XmlElement(required = true)
    protected List<HintmaterialType> hintmaterial;
    
    /** The feedbackstyle. */
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String feedbackstyle;

    /**
     * Gets the qticomment.
     * 
     * @return the qticomment
     */
    public QticommentType getQticomment() {
        return qticomment;
    }

    /**
     * Sets the qticomment.
     * 
     * @param value the new qticomment
     */
    public void setQticomment(QticommentType value) {
        this.qticomment = value;
    }

    /**
     * Gets the hintmaterial.
     * 
     * @return the hintmaterial
     */
    public List<HintmaterialType> getHintmaterial() {
        if (hintmaterial == null) {
            hintmaterial = new ArrayList<HintmaterialType>();
        }
        return this.hintmaterial;
    }

    /**
     * Gets the feedbackstyle.
     * 
     * @return the feedbackstyle
     */
    public String getFeedbackstyle() {
        if (feedbackstyle == null) {
            return "Complete";
        } else {
            return feedbackstyle;
        }
    }

    /**
     * Sets the feedbackstyle.
     * 
     * @param value the new feedbackstyle
     */
    public void setFeedbackstyle(String value) {
        this.feedbackstyle = value;
    }

}
