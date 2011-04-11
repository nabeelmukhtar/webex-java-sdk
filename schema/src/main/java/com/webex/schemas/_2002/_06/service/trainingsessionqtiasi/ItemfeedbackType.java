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
 * <p>Java class for itemfeedbackType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="itemfeedbackType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flow_mat" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}flow_matType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ident" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="view" default="All">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="All"/>
 *             &lt;enumeration value="Administrator"/>
 *             &lt;enumeration value="AdminAuthority"/>
 *             &lt;enumeration value="Assessor"/>
 *             &lt;enumeration value="Author"/>
 *             &lt;enumeration value="Candidate"/>
 *             &lt;enumeration value="InvigilatorProctor"/>
 *             &lt;enumeration value="Psychometrician"/>
 *             &lt;enumeration value="Scorer"/>
 *             &lt;enumeration value="Tutor"/>
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
@XmlType(name = "itemfeedbackType", propOrder = {
    "flowMat"
})
public class ItemfeedbackType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "flow_mat", required = true)
    protected FlowMatType flowMat;
    @XmlAttribute(required = true)
    protected String ident;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String view;

    /**
     * Gets the value of the flowMat property.
     * 
     * @return
     *     possible object is
     *     {@link FlowMatType }
     *     
     */
    public FlowMatType getFlowMat() {
        return flowMat;
    }

    /**
     * Sets the value of the flowMat property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowMatType }
     *     
     */
    public void setFlowMat(FlowMatType value) {
        this.flowMat = value;
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
     * Gets the value of the view property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getView() {
        if (view == null) {
            return "All";
        } else {
            return view;
        }
    }

    /**
     * Sets the value of the view property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setView(String value) {
        this.view = value;
    }

}
