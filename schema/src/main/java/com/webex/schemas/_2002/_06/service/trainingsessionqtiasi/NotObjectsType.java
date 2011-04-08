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
 * <p>Java class for not_objectsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="not_objectsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="outcomes_metadata" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}outcomes_metadataType"/>
 *         &lt;element name="and_objects" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}and_objectsType"/>
 *         &lt;element name="or_objects" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}or_objectsType"/>
 *         &lt;element name="not_objects" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}not_objectsType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "not_objectsType", propOrder = {
    "outcomesMetadata",
    "andObjects",
    "orObjects",
    "notObjects"
})
public class NotObjectsType implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "outcomes_metadata")
    protected OutcomesMetadataType outcomesMetadata;
    @XmlElement(name = "and_objects")
    protected AndObjectsType andObjects;
    @XmlElement(name = "or_objects")
    protected OrObjectsType orObjects;
    @XmlElement(name = "not_objects")
    protected NotObjectsType notObjects;

    /**
     * Gets the value of the outcomesMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link OutcomesMetadataType }
     *     
     */
    public OutcomesMetadataType getOutcomesMetadata() {
        return outcomesMetadata;
    }

    /**
     * Sets the value of the outcomesMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutcomesMetadataType }
     *     
     */
    public void setOutcomesMetadata(OutcomesMetadataType value) {
        this.outcomesMetadata = value;
    }

    /**
     * Gets the value of the andObjects property.
     * 
     * @return
     *     possible object is
     *     {@link AndObjectsType }
     *     
     */
    public AndObjectsType getAndObjects() {
        return andObjects;
    }

    /**
     * Sets the value of the andObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link AndObjectsType }
     *     
     */
    public void setAndObjects(AndObjectsType value) {
        this.andObjects = value;
    }

    /**
     * Gets the value of the orObjects property.
     * 
     * @return
     *     possible object is
     *     {@link OrObjectsType }
     *     
     */
    public OrObjectsType getOrObjects() {
        return orObjects;
    }

    /**
     * Sets the value of the orObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrObjectsType }
     *     
     */
    public void setOrObjects(OrObjectsType value) {
        this.orObjects = value;
    }

    /**
     * Gets the value of the notObjects property.
     * 
     * @return
     *     possible object is
     *     {@link NotObjectsType }
     *     
     */
    public NotObjectsType getNotObjects() {
        return notObjects;
    }

    /**
     * Sets the value of the notObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotObjectsType }
     *     
     */
    public void setNotObjects(NotObjectsType value) {
        this.notObjects = value;
    }

}
