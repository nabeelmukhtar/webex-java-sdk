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
 * <p>Java class for not_selectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="not_selectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="selection_metadata" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}selection_metadataType"/>
 *         &lt;element name="and_selection" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}and_selectionType"/>
 *         &lt;element name="or_selection" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}or_selectionType"/>
 *         &lt;element name="not_selection" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}not_selectionType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
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

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "selection_metadata")
    protected SelectionMetadataType selectionMetadata;
    @XmlElement(name = "and_selection")
    protected AndSelectionType andSelection;
    @XmlElement(name = "or_selection")
    protected OrSelectionType orSelection;
    @XmlElement(name = "not_selection")
    protected NotSelectionType notSelection;

    /**
     * Gets the value of the selectionMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionMetadataType }
     *     
     */
    public SelectionMetadataType getSelectionMetadata() {
        return selectionMetadata;
    }

    /**
     * Sets the value of the selectionMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionMetadataType }
     *     
     */
    public void setSelectionMetadata(SelectionMetadataType value) {
        this.selectionMetadata = value;
    }

    /**
     * Gets the value of the andSelection property.
     * 
     * @return
     *     possible object is
     *     {@link AndSelectionType }
     *     
     */
    public AndSelectionType getAndSelection() {
        return andSelection;
    }

    /**
     * Sets the value of the andSelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link AndSelectionType }
     *     
     */
    public void setAndSelection(AndSelectionType value) {
        this.andSelection = value;
    }

    /**
     * Gets the value of the orSelection property.
     * 
     * @return
     *     possible object is
     *     {@link OrSelectionType }
     *     
     */
    public OrSelectionType getOrSelection() {
        return orSelection;
    }

    /**
     * Sets the value of the orSelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrSelectionType }
     *     
     */
    public void setOrSelection(OrSelectionType value) {
        this.orSelection = value;
    }

    /**
     * Gets the value of the notSelection property.
     * 
     * @return
     *     possible object is
     *     {@link NotSelectionType }
     *     
     */
    public NotSelectionType getNotSelection() {
        return notSelection;
    }

    /**
     * Sets the value of the notSelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotSelectionType }
     *     
     */
    public void setNotSelection(NotSelectionType value) {
        this.notSelection = value;
    }

}
