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
 * <p>Java class for response_strType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="response_strType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="render_fib" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}render_fibType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ident" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rcardinality" default="Single">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Single"/>
 *             &lt;enumeration value="Multiple"/>
 *             &lt;enumeration value="Ordered"/>
 *             &lt;enumeration value="Extension"/>
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
@XmlType(name = "response_strType", propOrder = {
    "renderFib"
})
public class ResponseStrType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "render_fib", required = true)
    protected RenderFibType renderFib;
    @XmlAttribute(required = true)
    protected String ident;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rcardinality;

    /**
     * Gets the value of the renderFib property.
     * 
     * @return
     *     possible object is
     *     {@link RenderFibType }
     *     
     */
    public RenderFibType getRenderFib() {
        return renderFib;
    }

    /**
     * Sets the value of the renderFib property.
     * 
     * @param value
     *     allowed object is
     *     {@link RenderFibType }
     *     
     */
    public void setRenderFib(RenderFibType value) {
        this.renderFib = value;
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

    /**
     * Gets the value of the rcardinality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcardinality() {
        if (rcardinality == null) {
            return "Single";
        } else {
            return rcardinality;
        }
    }

    /**
     * Sets the value of the rcardinality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcardinality(String value) {
        this.rcardinality = value;
    }

}
