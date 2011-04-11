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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The Class ItemfeedbackType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemfeedbackType", propOrder = {
    "flowMat"
})
public class ItemfeedbackType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The flow mat. */
    @XmlElement(name = "flow_mat", required = true)
    protected FlowMatType flowMat;
    
    /** The ident. */
    @XmlAttribute(required = true)
    protected String ident;
    
    /** The view. */
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String view;

    /**
     * Gets the flow mat.
     * 
     * @return the flow mat
     */
    public FlowMatType getFlowMat() {
        return flowMat;
    }

    /**
     * Sets the flow mat.
     * 
     * @param value the new flow mat
     */
    public void setFlowMat(FlowMatType value) {
        this.flowMat = value;
    }

    /**
     * Gets the ident.
     * 
     * @return the ident
     */
    public String getIdent() {
        return ident;
    }

    /**
     * Sets the ident.
     * 
     * @param value the new ident
     */
    public void setIdent(String value) {
        this.ident = value;
    }

    /**
     * Gets the view.
     * 
     * @return the view
     */
    public String getView() {
        if (view == null) {
            return "All";
        } else {
            return view;
        }
    }

    /**
     * Sets the view.
     * 
     * @param value the new view
     */
    public void setView(String value) {
        this.view = value;
    }

}
