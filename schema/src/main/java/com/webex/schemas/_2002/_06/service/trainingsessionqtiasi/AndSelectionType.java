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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for and_selectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="and_selectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
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
@XmlType(name = "and_selectionType", propOrder = {
    "selectionMetadataOrAndSelectionOrOrSelection"
})
public class AndSelectionType implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElements({
        @XmlElement(name = "not_selection", type = NotSelectionType.class),
        @XmlElement(name = "or_selection", type = OrSelectionType.class),
        @XmlElement(name = "and_selection", type = AndSelectionType.class),
        @XmlElement(name = "selection_metadata", type = SelectionMetadataType.class)
    })
    protected List<Object> selectionMetadataOrAndSelectionOrOrSelection;

    /**
     * Gets the value of the selectionMetadataOrAndSelectionOrOrSelection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionMetadataOrAndSelectionOrOrSelection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionMetadataOrAndSelectionOrOrSelection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotSelectionType }
     * {@link OrSelectionType }
     * {@link AndSelectionType }
     * {@link SelectionMetadataType }
     * 
     * 
     */
    public List<Object> getSelectionMetadataOrAndSelectionOrOrSelection() {
        if (selectionMetadataOrAndSelectionOrOrSelection == null) {
            selectionMetadataOrAndSelectionOrOrSelection = new ArrayList<Object>();
        }
        return this.selectionMetadataOrAndSelectionOrOrSelection;
    }

}
