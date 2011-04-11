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


/**
 * The Class ItemType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemType", propOrder = {
    "presentation",
    "resprocessing",
    "itemfeedback",
    "qticomment"
})
public class ItemType implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The presentation. */
    @XmlElement(required = true)
    protected PresentationType presentation;
    
    /** The resprocessing. */
    protected List<ResprocessingType> resprocessing;
    
    /** The itemfeedback. */
    protected List<ItemfeedbackType> itemfeedback;
    
    /** The qticomment. */
    protected QticommentType qticomment;
    
    /** The ident. */
    @XmlAttribute(required = true)
    protected String ident;

    /**
     * Gets the presentation.
     * 
     * @return the presentation
     */
    public PresentationType getPresentation() {
        return presentation;
    }

    /**
     * Sets the presentation.
     * 
     * @param value the new presentation
     */
    public void setPresentation(PresentationType value) {
        this.presentation = value;
    }

    /**
     * Gets the resprocessing.
     * 
     * @return the resprocessing
     */
    public List<ResprocessingType> getResprocessing() {
        if (resprocessing == null) {
            resprocessing = new ArrayList<ResprocessingType>();
        }
        return this.resprocessing;
    }

    /**
     * Gets the itemfeedback.
     * 
     * @return the itemfeedback
     */
    public List<ItemfeedbackType> getItemfeedback() {
        if (itemfeedback == null) {
            itemfeedback = new ArrayList<ItemfeedbackType>();
        }
        return this.itemfeedback;
    }

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
     * Gets the ident.
     * 
     * @return the ident
     */
    public String getIdent() {
        return ident;
    }

    /**
     * Sets the ident.
     * 
     * @param value the new ident
     */
    public void setIdent(String value) {
        this.ident = value;
    }

}
