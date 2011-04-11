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

package com.webex.schemas._2002._06.service.trainingsessionqti;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for response_formType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="response_formType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="correct_response" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqti}correct_responseType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="cardinality" default="single">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="single"/>
 *             &lt;enumeration value="multiple"/>
 *             &lt;enumeration value="ordered"/>
 *             &lt;enumeration value="extension"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="response_type" default="lid">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="lid"/>
 *             &lt;enumeration value="xy"/>
 *             &lt;enumeration value="str"/>
 *             &lt;enumeration value="num"/>
 *             &lt;enumeration value="grp"/>
 *             &lt;enumeration value="extension"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="render_type" default="choice">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="choice"/>
 *             &lt;enumeration value="hotspot"/>
 *             &lt;enumeration value="slider"/>
 *             &lt;enumeration value="fib"/>
 *             &lt;enumeration value="extension"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "response_formType", propOrder = {
    "correctResponse"
})
public class ResponseFormType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "correct_response", required = true)
    protected List<CorrectResponseType> correctResponse;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cardinality;
    @XmlAttribute(name = "response_type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String responseType;
    @XmlAttribute(name = "render_type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String renderType;

    /**
     * Gets the value of the correctResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correctResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrectResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorrectResponseType }
     * 
     * 
     */
    public List<CorrectResponseType> getCorrectResponse() {
        if (correctResponse == null) {
            correctResponse = new ArrayList<CorrectResponseType>();
        }
        return this.correctResponse;
    }

    /**
     * Gets the value of the cardinality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardinality() {
        if (cardinality == null) {
            return "single";
        } else {
            return cardinality;
        }
    }

    /**
     * Sets the value of the cardinality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardinality(String value) {
        this.cardinality = value;
    }

    /**
     * Gets the value of the responseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseType() {
        if (responseType == null) {
            return "lid";
        } else {
            return responseType;
        }
    }

    /**
     * Sets the value of the responseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseType(String value) {
        this.responseType = value;
    }

    /**
     * Gets the value of the renderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenderType() {
        if (renderType == null) {
            return "choice";
        } else {
            return renderType;
        }
    }

    /**
     * Sets the value of the renderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenderType(String value) {
        this.renderType = value;
    }

}
