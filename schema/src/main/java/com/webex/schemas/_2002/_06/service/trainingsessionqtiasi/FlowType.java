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
 * The Class FlowType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flowType", propOrder = {
    "material",
    "responseLid",
    "responseStr"
})
public class FlowType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The material. */
    @XmlElement(required = true)
    protected List<MaterialType> material;
    
    /** The response lid. */
    @XmlElement(name = "response_lid")
    protected List<ResponseLidType> responseLid;
    
    /** The response str. */
    @XmlElement(name = "response_str")
    protected List<ResponseStrType> responseStr;

    /**
     * Gets the material.
     * 
     * @return the material
     */
    public List<MaterialType> getMaterial() {
        if (material == null) {
            material = new ArrayList<MaterialType>();
        }
        return this.material;
    }

    /**
     * Gets the response lid.
     * 
     * @return the response lid
     */
    public List<ResponseLidType> getResponseLid() {
        if (responseLid == null) {
            responseLid = new ArrayList<ResponseLidType>();
        }
        return this.responseLid;
    }

    /**
     * Gets the response str.
     * 
     * @return the response str
     */
    public List<ResponseStrType> getResponseStr() {
        if (responseStr == null) {
            responseStr = new ArrayList<ResponseStrType>();
        }
        return this.responseStr;
    }

}
