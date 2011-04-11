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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for render_choiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="render_choiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="response_label" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}response_labelType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="minnumber">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;minInclusive value="0"/>
 *             &lt;maxInclusive value="99"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="maxnumber">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;minInclusive value="1"/>
 *             &lt;maxInclusive value="99"/>
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
@XmlType(name = "render_choiceType", propOrder = {
    "responseLabel"
})
public class RenderChoiceType implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "response_label", required = true)
    protected List<ResponseLabelType> responseLabel;
    @XmlAttribute
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long minnumber;
    @XmlAttribute
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long maxnumber;

    /**
     * Gets the value of the responseLabel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseLabel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseLabelType }
     * 
     * 
     */
    public List<ResponseLabelType> getResponseLabel() {
        if (responseLabel == null) {
            responseLabel = new ArrayList<ResponseLabelType>();
        }
        return this.responseLabel;
    }

    /**
     * Gets the value of the minnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getMinnumber() {
        return minnumber;
    }

    /**
     * Sets the value of the minnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinnumber(Long value) {
        this.minnumber = value;
    }

    /**
     * Gets the value of the maxnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getMaxnumber() {
        return maxnumber;
    }

    /**
     * Sets the value of the maxnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxnumber(Long value) {
        this.maxnumber = value;
    }

}
