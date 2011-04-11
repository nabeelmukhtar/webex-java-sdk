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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for response_xyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="response_xyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="material" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}materialType"/>
 *           &lt;element name="material_ref" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}material_refType"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="render_choice" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}render_choiceType"/>
 *           &lt;element name="render_hotspot" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}render_hotspotType"/>
 *           &lt;element name="render_slider" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}render_sliderType"/>
 *           &lt;element name="render_fib" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}render_fibType"/>
 *           &lt;element ref="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}render_extension"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="material" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}materialType"/>
 *           &lt;element name="material_ref" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}material_refType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="rcardinality" default="Single">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Single"/>
 *             &lt;enumeration value="Multiple"/>
 *             &lt;enumeration value="Ordered"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="rtiming" default="No">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ident" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "response_xyType", propOrder = {
    "content"
})
public class ResponseXyType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElementRefs({
        @XmlElementRef(name = "material_ref", namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi", type = JAXBElement.class),
        @XmlElementRef(name = "render_fib", namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi", type = JAXBElement.class),
        @XmlElementRef(name = "render_slider", namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi", type = JAXBElement.class),
        @XmlElementRef(name = "render_extension", namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi", type = JAXBElement.class),
        @XmlElementRef(name = "render_choice", namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi", type = JAXBElement.class),
        @XmlElementRef(name = "material", namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi", type = JAXBElement.class),
        @XmlElementRef(name = "render_hotspot", namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi", type = JAXBElement.class)
    })
    protected List<JAXBElement<? extends Serializable>> content;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rcardinality;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rtiming;
    @XmlAttribute(required = true)
    protected String ident;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Material" is used by two different parts of a schema. See: 
     * line 1415 of file:/E:/workspace/opensource/webex-java-sdk/schema/src/main/resources/com/webex/schemas/2002/06/service/training/training_ims_qtiasiv1p2.xsd
     * line 1404 of file:/E:/workspace/opensource/webex-java-sdk/schema/src/main/resources/com/webex/schemas/2002/06/service/training/training_ims_qtiasiv1p2.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link MaterialRefType }{@code >}
     * {@link JAXBElement }{@code <}{@link RenderFibType }{@code >}
     * {@link JAXBElement }{@code <}{@link RenderSliderType }{@code >}
     * {@link JAXBElement }{@code <}{@link RenderExtensionType }{@code >}
     * {@link JAXBElement }{@code <}{@link RenderChoiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link MaterialType }{@code >}
     * {@link JAXBElement }{@code <}{@link RenderHotspotType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.content;
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

    /**
     * Gets the value of the rtiming property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtiming() {
        if (rtiming == null) {
            return "No";
        } else {
            return rtiming;
        }
    }

    /**
     * Sets the value of the rtiming property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtiming(String value) {
        this.rtiming = value;
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
