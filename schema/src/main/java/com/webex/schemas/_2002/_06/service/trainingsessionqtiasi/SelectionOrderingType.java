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
import javax.xml.bind.annotation.XmlType;


/**
 * The Class SelectionOrderingType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "selection_orderingType", propOrder = {
    "qticomment",
    "sequenceParameter",
    "selection",
    "order"
})
public class SelectionOrderingType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The qticomment. */
    protected QticommentType qticomment;
    
    /** The sequence parameter. */
    @XmlElement(name = "sequence_parameter")
    protected SequenceParameterType sequenceParameter;
    
    /** The selection. */
    protected List<SelectionType> selection;
    
    /** The order. */
    protected OrderType order;
    
    /** The sequence type. */
    @XmlAttribute(name = "sequence_type")
    protected String sequenceType;

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
     * Gets the sequence parameter.
     * 
     * @return the sequence parameter
     */
    public SequenceParameterType getSequenceParameter() {
        return sequenceParameter;
    }

    /**
     * Sets the sequence parameter.
     * 
     * @param value the new sequence parameter
     */
    public void setSequenceParameter(SequenceParameterType value) {
        this.sequenceParameter = value;
    }

    /**
     * Gets the selection.
     * 
     * @return the selection
     */
    public List<SelectionType> getSelection() {
        if (selection == null) {
            selection = new ArrayList<SelectionType>();
        }
        return this.selection;
    }

    /**
     * Gets the order.
     * 
     * @return the order
     */
    public OrderType getOrder() {
        return order;
    }

    /**
     * Sets the order.
     * 
     * @param value the new order
     */
    public void setOrder(OrderType value) {
        this.order = value;
    }

    /**
     * Gets the sequence type.
     * 
     * @return the sequence type
     */
    public String getSequenceType() {
        return sequenceType;
    }

    /**
     * Sets the sequence type.
     * 
     * @param value the new sequence type
     */
    public void setSequenceType(String value) {
        this.sequenceType = value;
    }

}
