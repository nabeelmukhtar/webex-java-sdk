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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class FlowLabelType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flow_labelType", propOrder = {
    "flowLabelOrResponseLabel"
})
public class FlowLabelType implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The flow label or response label. */
    @XmlElements({
        @XmlElement(name = "response_label", type = ResponseLabelType.class),
        @XmlElement(name = "flow_label", type = FlowLabelType.class)
    })
    protected List<Object> flowLabelOrResponseLabel;
    
    /** The clazz. */
    @XmlAttribute(name = "class")
    protected String clazz;

    /**
     * Gets the flow label or response label.
     * 
     * @return the flow label or response label
     */
    public List<Object> getFlowLabelOrResponseLabel() {
        if (flowLabelOrResponseLabel == null) {
            flowLabelOrResponseLabel = new ArrayList<Object>();
        }
        return this.flowLabelOrResponseLabel;
    }

    /**
     * Gets the clazz.
     * 
     * @return the clazz
     */
    public String getClazz() {
        if (clazz == null) {
            return "Block";
        } else {
            return clazz;
        }
    }

    /**
     * Sets the clazz.
     * 
     * @param value the new clazz
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

}
