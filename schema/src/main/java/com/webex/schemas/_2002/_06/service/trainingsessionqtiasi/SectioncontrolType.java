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
 * The Class SectioncontrolType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sectioncontrolType", propOrder = {
    "qticomment"
})
public class SectioncontrolType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The qticomment. */
    protected QticommentType qticomment;
    
    /** The feedbackswitch. */
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String feedbackswitch;
    
    /** The hintswitch. */
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String hintswitch;
    
    /** The solutionswitch. */
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String solutionswitch;
    
    /** The view. */
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String view;

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
     * Gets the feedbackswitch.
     * 
     * @return the feedbackswitch
     */
    public String getFeedbackswitch() {
        if (feedbackswitch == null) {
            return "Yes";
        } else {
            return feedbackswitch;
        }
    }

    /**
     * Sets the feedbackswitch.
     * 
     * @param value the new feedbackswitch
     */
    public void setFeedbackswitch(String value) {
        this.feedbackswitch = value;
    }

    /**
     * Gets the hintswitch.
     * 
     * @return the hintswitch
     */
    public String getHintswitch() {
        if (hintswitch == null) {
            return "Yes";
        } else {
            return hintswitch;
        }
    }

    /**
     * Sets the hintswitch.
     * 
     * @param value the new hintswitch
     */
    public void setHintswitch(String value) {
        this.hintswitch = value;
    }

    /**
     * Gets the solutionswitch.
     * 
     * @return the solutionswitch
     */
    public String getSolutionswitch() {
        if (solutionswitch == null) {
            return "Yes";
        } else {
            return solutionswitch;
        }
    }

    /**
     * Sets the solutionswitch.
     * 
     * @param value the new solutionswitch
     */
    public void setSolutionswitch(String value) {
        this.solutionswitch = value;
    }

    /**
     * Gets the view.
     * 
     * @return the view
     */
    public String getView() {
        if (view == null) {
            return "All";
        } else {
            return view;
        }
    }

    /**
     * Sets the view.
     * 
     * @param value the new view
     */
    public void setView(String value) {
        this.view = value;
    }

}
