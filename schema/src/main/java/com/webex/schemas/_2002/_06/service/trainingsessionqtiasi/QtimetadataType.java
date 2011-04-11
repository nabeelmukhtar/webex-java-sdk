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
 * The Class QtimetadataType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qtimetadataType", propOrder = {
    "vocabulary",
    "qtimetadatafield"
})
public class QtimetadataType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The vocabulary. */
    protected VocabularyType vocabulary;
    
    /** The qtimetadatafield. */
    @XmlElement(required = true)
    protected List<QtimetadatafieldType> qtimetadatafield;

    /**
     * Gets the vocabulary.
     * 
     * @return the vocabulary
     */
    public VocabularyType getVocabulary() {
        return vocabulary;
    }

    /**
     * Sets the vocabulary.
     * 
     * @param value the new vocabulary
     */
    public void setVocabulary(VocabularyType value) {
        this.vocabulary = value;
    }

    /**
     * Gets the qtimetadatafield.
     * 
     * @return the qtimetadatafield
     */
    public List<QtimetadatafieldType> getQtimetadatafield() {
        if (qtimetadatafield == null) {
            qtimetadatafield = new ArrayList<QtimetadatafieldType>();
        }
        return this.qtimetadatafield;
    }

}
