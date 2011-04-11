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
 * The Class NotObjectsType.
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

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The outcomes metadata. */
    @XmlElement(name = "outcomes_metadata")
    protected OutcomesMetadataType outcomesMetadata;
    
    /** The and objects. */
    @XmlElement(name = "and_objects")
    protected AndObjectsType andObjects;
    
    /** The or objects. */
    @XmlElement(name = "or_objects")
    protected OrObjectsType orObjects;
    
    /** The not objects. */
    @XmlElement(name = "not_objects")
    protected NotObjectsType notObjects;

    /**
     * Gets the outcomes metadata.
     * 
     * @return the outcomes metadata
     */
    public OutcomesMetadataType getOutcomesMetadata() {
        return outcomesMetadata;
    }

    /**
     * Sets the outcomes metadata.
     * 
     * @param value the new outcomes metadata
     */
    public void setOutcomesMetadata(OutcomesMetadataType value) {
        this.outcomesMetadata = value;
    }

    /**
     * Gets the and objects.
     * 
     * @return the and objects
     */
    public AndObjectsType getAndObjects() {
        return andObjects;
    }

    /**
     * Sets the and objects.
     * 
     * @param value the new and objects
     */
    public void setAndObjects(AndObjectsType value) {
        this.andObjects = value;
    }

    /**
     * Gets the or objects.
     * 
     * @return the or objects
     */
    public OrObjectsType getOrObjects() {
        return orObjects;
    }

    /**
     * Sets the or objects.
     * 
     * @param value the new or objects
     */
    public void setOrObjects(OrObjectsType value) {
        this.orObjects = value;
    }

    /**
     * Gets the not objects.
     * 
     * @return the not objects
     */
    public NotObjectsType getNotObjects() {
        return notObjects;
    }

    /**
     * Sets the not objects.
     * 
     * @param value the new not objects
     */
    public void setNotObjects(NotObjectsType value) {
        this.notObjects = value;
    }

}
