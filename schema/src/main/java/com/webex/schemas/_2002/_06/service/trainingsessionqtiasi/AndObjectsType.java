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
 * The Class AndObjectsType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "and_objectsType", propOrder = {
    "outcomesMetadataOrAndObjectsOrOrObjects"
})
public class AndObjectsType implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The outcomes metadata or and objects or or objects. */
    @XmlElements({
        @XmlElement(name = "and_objects", type = AndObjectsType.class),
        @XmlElement(name = "not_objects", type = NotObjectsType.class),
        @XmlElement(name = "outcomes_metadata", type = OutcomesMetadataType.class),
        @XmlElement(name = "or_objects", type = OrObjectsType.class)
    })
    protected List<Object> outcomesMetadataOrAndObjectsOrOrObjects;

    /**
     * Gets the outcomes metadata or and objects or or objects.
     * 
     * @return the outcomes metadata or and objects or or objects
     */
    public List<Object> getOutcomesMetadataOrAndObjectsOrOrObjects() {
        if (outcomesMetadataOrAndObjectsOrOrObjects == null) {
            outcomesMetadataOrAndObjectsOrOrObjects = new ArrayList<Object>();
        }
        return this.outcomesMetadataOrAndObjectsOrOrObjects;
    }

}
