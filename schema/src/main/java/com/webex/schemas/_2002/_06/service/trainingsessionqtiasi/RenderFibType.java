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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for render_fibType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="render_fibType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="response_label" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}response_labelType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="fibtype" default="String">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="String"/>
 *             &lt;enumeration value="Integer"/>
 *             &lt;enumeration value="Decimal"/>
 *             &lt;enumeration value="Scientific"/>
 *             &lt;enumeration value="Boolean"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="prompt" default="Box">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Box"/>
 *             &lt;enumeration value="Dashline"/>
 *             &lt;enumeration value="Asterisk"/>
 *             &lt;enumeration value="Underline"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="maxchars" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "render_fibType", propOrder = {
    "responseLabel"
})
public class RenderFibType implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "response_label", required = true)
    protected ResponseLabelType responseLabel;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fibtype;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String prompt;
    @XmlAttribute
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long maxchars;

    /**
     * Gets the value of the responseLabel property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseLabelType }
     *     
     */
    public ResponseLabelType getResponseLabel() {
        return responseLabel;
    }

    /**
     * Sets the value of the responseLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseLabelType }
     *     
     */
    public void setResponseLabel(ResponseLabelType value) {
        this.responseLabel = value;
    }

    /**
     * Gets the value of the fibtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFibtype() {
        if (fibtype == null) {
            return "String";
        } else {
            return fibtype;
        }
    }

    /**
     * Sets the value of the fibtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFibtype(String value) {
        this.fibtype = value;
    }

    /**
     * Gets the value of the prompt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrompt() {
        if (prompt == null) {
            return "Box";
        } else {
            return prompt;
        }
    }

    /**
     * Sets the value of the prompt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrompt(String value) {
        this.prompt = value;
    }

    /**
     * Gets the value of the maxchars property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getMaxchars() {
        return maxchars;
    }

    /**
     * Sets the value of the maxchars property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxchars(Long value) {
        this.maxchars = value;
    }

}
