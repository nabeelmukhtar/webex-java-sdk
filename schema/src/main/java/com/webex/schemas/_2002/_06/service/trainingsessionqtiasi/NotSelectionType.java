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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class NotSelectionType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "not_selectionType", propOrder = {
    "selectionMetadata",
    "andSelection",
    "orSelection",
    "notSelection"
})
public class NotSelectionType implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The selection metadata. */
    @XmlElement(name = "selection_metadata")
    protected SelectionMetadataType selectionMetadata;
    
    /** The and selection. */
    @XmlElement(name = "and_selection")
    protected AndSelectionType andSelection;
    
    /** The or selection. */
    @XmlElement(name = "or_selection")
    protected OrSelectionType orSelection;
    
    /** The not selection. */
    @XmlElement(name = "not_selection")
    protected NotSelectionType notSelection;

    /**
     * Gets the selection metadata.
     * 
     * @return the selection metadata
     */
    public SelectionMetadataType getSelectionMetadata() {
        return selectionMetadata;
    }

    /**
     * Sets the selection metadata.
     * 
     * @param value the new selection metadata
     */
    public void setSelectionMetadata(SelectionMetadataType value) {
        this.selectionMetadata = value;
    }

    /**
     * Gets the and selection.
     * 
     * @return the and selection
     */
    public AndSelectionType getAndSelection() {
        return andSelection;
    }

    /**
     * Sets the and selection.
     * 
     * @param value the new and selection
     */
    public void setAndSelection(AndSelectionType value) {
        this.andSelection = value;
    }

    /**
     * Gets the or selection.
     * 
     * @return the or selection
     */
    public OrSelectionType getOrSelection() {
        return orSelection;
    }

    /**
     * Sets the or selection.
     * 
     * @param value the new or selection
     */
    public void setOrSelection(OrSelectionType value) {
        this.orSelection = value;
    }

    /**
     * Gets the not selection.
     * 
     * @return the not selection
     */
    public NotSelectionType getNotSelection() {
        return notSelection;
    }

    /**
     * Sets the not selection.
     * 
     * @param value the new not selection
     */
    public void setNotSelection(NotSelectionType value) {
        this.notSelection = value;
    }

}
