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
 * <p>Java class for itemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="itemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="presentation" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}presentationType"/>
 *         &lt;element name="resprocessing" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}resprocessingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="itemfeedback" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}itemfeedbackType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="qticomment" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}qticommentType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ident" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemType", propOrder = {
    "presentation",
    "resprocessing",
    "itemfeedback",
    "qticomment"
})
public class ItemType implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected PresentationType presentation;
    protected List<ResprocessingType> resprocessing;
    protected List<ItemfeedbackType> itemfeedback;
    protected QticommentType qticomment;
    @XmlAttribute(required = true)
    protected String ident;

    /**
     * Gets the value of the presentation property.
     * 
     * @return
     *     possible object is
     *     {@link PresentationType }
     *     
     */
    public PresentationType getPresentation() {
        return presentation;
    }

    /**
     * Sets the value of the presentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentationType }
     *     
     */
    public void setPresentation(PresentationType value) {
        this.presentation = value;
    }

    /**
     * Gets the value of the resprocessing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resprocessing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResprocessing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResprocessingType }
     * 
     * 
     */
    public List<ResprocessingType> getResprocessing() {
        if (resprocessing == null) {
            resprocessing = new ArrayList<ResprocessingType>();
        }
        return this.resprocessing;
    }

    /**
     * Gets the value of the itemfeedback property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemfeedback property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemfeedback().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemfeedbackType }
     * 
     * 
     */
    public List<ItemfeedbackType> getItemfeedback() {
        if (itemfeedback == null) {
            itemfeedback = new ArrayList<ItemfeedbackType>();
        }
        return this.itemfeedback;
    }

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
     * Gets the value of the ident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdent() {
        return ident;
    }

    /**
     * Sets the value of the ident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdent(String value) {
        this.ident = value;
    }

}
