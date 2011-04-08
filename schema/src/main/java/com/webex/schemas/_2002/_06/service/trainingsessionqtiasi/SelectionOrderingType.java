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
 * <p>Java class for selection_orderingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="selection_orderingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="qticomment" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}qticommentType" minOccurs="0"/>
 *         &lt;element name="sequence_parameter" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}sequence_parameterType" minOccurs="0"/>
 *         &lt;element name="selection" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}selectionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="order" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}orderType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="sequence_type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
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

    private final static long serialVersionUID = 2461660169443089969L;
    protected QticommentType qticomment;
    @XmlElement(name = "sequence_parameter")
    protected SequenceParameterType sequenceParameter;
    protected List<SelectionType> selection;
    protected OrderType order;
    @XmlAttribute(name = "sequence_type")
    protected String sequenceType;

    /**
     * Gets the value of the qticomment property.
     * 
     * @return
     *     possible object is
     *     {@link QticommentType }
     *     
     */
    public QticommentType getQticomment() {
        return qticomment;
    }

    /**
     * Sets the value of the qticomment property.
     * 
     * @param value
     *     allowed object is
     *     {@link QticommentType }
     *     
     */
    public void setQticomment(QticommentType value) {
        this.qticomment = value;
    }

    /**
     * Gets the value of the sequenceParameter property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceParameterType }
     *     
     */
    public SequenceParameterType getSequenceParameter() {
        return sequenceParameter;
    }

    /**
     * Sets the value of the sequenceParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceParameterType }
     *     
     */
    public void setSequenceParameter(SequenceParameterType value) {
        this.sequenceParameter = value;
    }

    /**
     * Gets the value of the selection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionType }
     * 
     * 
     */
    public List<SelectionType> getSelection() {
        if (selection == null) {
            selection = new ArrayList<SelectionType>();
        }
        return this.selection;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link OrderType }
     *     
     */
    public OrderType getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderType }
     *     
     */
    public void setOrder(OrderType value) {
        this.order = value;
    }

    /**
     * Gets the value of the sequenceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceType() {
        return sequenceType;
    }

    /**
     * Sets the value of the sequenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceType(String value) {
        this.sequenceType = value;
    }

}
