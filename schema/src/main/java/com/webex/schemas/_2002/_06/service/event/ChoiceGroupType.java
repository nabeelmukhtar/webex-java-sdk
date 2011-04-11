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

package com.webex.schemas._2002._06.service.event;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class ChoiceGroupType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "choiceGroupType", propOrder = {
    "label",
    "defaultChoice",
    "choice",
    "index"
})
@XmlSeeAlso({
    ChoiceGroupInstanceType.class
})
public class ChoiceGroupType
    extends EnrollmentFieldType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The label. */
    @XmlElement(required = true)
    protected String label;
    
    /** The default choice. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long defaultChoice;
    
    /** The choice. */
    @XmlElement(required = true)
    protected List<ChoiceType> choice;
    
    /** The index. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long index;

    /**
     * Gets the label.
     * 
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the label.
     * 
     * @param value the new label
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the default choice.
     * 
     * @return the default choice
     */
    public Long getDefaultChoice() {
        return defaultChoice;
    }

    /**
     * Sets the default choice.
     * 
     * @param value the new default choice
     */
    public void setDefaultChoice(Long value) {
        this.defaultChoice = value;
    }

    /**
     * Gets the choice.
     * 
     * @return the choice
     */
    public List<ChoiceType> getChoice() {
        if (choice == null) {
            choice = new ArrayList<ChoiceType>();
        }
        return this.choice;
    }

    /**
     * Gets the index.
     * 
     * @return the index
     */
    public Long getIndex() {
        return index;
    }

    /**
     * Sets the index.
     * 
     * @param value the new index
     */
    public void setIndex(Long value) {
        this.index = value;
    }

}
