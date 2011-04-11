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
 * The Class ObjectsConditionType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objects_conditionType", propOrder = {
    "qticomment",
    "outcomesMetadata",
    "andObjects",
    "orObjects",
    "notObjects",
    "objectsParameter",
    "mapInput",
    "objectscondExtension"
})
public class ObjectsConditionType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The qticomment. */
    protected QticommentType qticomment;
    
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
    
    /** The objects parameter. */
    @XmlElement(name = "objects_parameter")
    protected List<ObjectsParameterType> objectsParameter;
    
    /** The map input. */
    @XmlElement(name = "map_input")
    protected List<MapInputType> mapInput;
    
    /** The objectscond extension. */
    @XmlElement(name = "objectscond_extension")
    protected String objectscondExtension;

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

    /**
     * Gets the objects parameter.
     * 
     * @return the objects parameter
     */
    public List<ObjectsParameterType> getObjectsParameter() {
        if (objectsParameter == null) {
            objectsParameter = new ArrayList<ObjectsParameterType>();
        }
        return this.objectsParameter;
    }

    /**
     * Gets the map input.
     * 
     * @return the map input
     */
    public List<MapInputType> getMapInput() {
        if (mapInput == null) {
            mapInput = new ArrayList<MapInputType>();
        }
        return this.mapInput;
    }

    /**
     * Gets the objectscond extension.
     * 
     * @return the objectscond extension
     */
    public String getObjectscondExtension() {
        return objectscondExtension;
    }

    /**
     * Sets the objectscond extension.
     * 
     * @param value the new objectscond extension
     */
    public void setObjectscondExtension(String value) {
        this.objectscondExtension = value;
    }

}
