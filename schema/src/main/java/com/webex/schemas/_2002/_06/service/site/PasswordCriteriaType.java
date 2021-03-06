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

package com.webex.schemas._2002._06.service.site;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for passwordCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="passwordCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mixedCase" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="minLength" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="minAlpha" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="minNumeric" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="minSpecial" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="disallowWebTextSessions" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="disallowWebTextAccounts" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="disallowList" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="disallowValue" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passwordCriteriaType", propOrder = {
    "mixedCase",
    "minLength",
    "minAlpha",
    "minNumeric",
    "minSpecial",
    "disallowWebTextSessions",
    "disallowWebTextAccounts",
    "disallowList",
    "disallowValue"
})
public class PasswordCriteriaType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected boolean mixedCase;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long minLength;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long minAlpha;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long minNumeric;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long minSpecial;
    protected boolean disallowWebTextSessions;
    protected boolean disallowWebTextAccounts;
    protected boolean disallowList;
    protected List<String> disallowValue;

    /**
     * Gets the value of the mixedCase property.
     * 
     */
    public boolean isMixedCase() {
        return mixedCase;
    }

    /**
     * Sets the value of the mixedCase property.
     * 
     */
    public void setMixedCase(boolean value) {
        this.mixedCase = value;
    }

    /**
     * Gets the value of the minLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getMinLength() {
        return minLength;
    }

    /**
     * Sets the value of the minLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinLength(Long value) {
        this.minLength = value;
    }

    /**
     * Gets the value of the minAlpha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getMinAlpha() {
        return minAlpha;
    }

    /**
     * Sets the value of the minAlpha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinAlpha(Long value) {
        this.minAlpha = value;
    }

    /**
     * Gets the value of the minNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getMinNumeric() {
        return minNumeric;
    }

    /**
     * Sets the value of the minNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinNumeric(Long value) {
        this.minNumeric = value;
    }

    /**
     * Gets the value of the minSpecial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getMinSpecial() {
        return minSpecial;
    }

    /**
     * Sets the value of the minSpecial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinSpecial(Long value) {
        this.minSpecial = value;
    }

    /**
     * Gets the value of the disallowWebTextSessions property.
     * 
     */
    public boolean isDisallowWebTextSessions() {
        return disallowWebTextSessions;
    }

    /**
     * Sets the value of the disallowWebTextSessions property.
     * 
     */
    public void setDisallowWebTextSessions(boolean value) {
        this.disallowWebTextSessions = value;
    }

    /**
     * Gets the value of the disallowWebTextAccounts property.
     * 
     */
    public boolean isDisallowWebTextAccounts() {
        return disallowWebTextAccounts;
    }

    /**
     * Sets the value of the disallowWebTextAccounts property.
     * 
     */
    public void setDisallowWebTextAccounts(boolean value) {
        this.disallowWebTextAccounts = value;
    }

    /**
     * Gets the value of the disallowList property.
     * 
     */
    public boolean isDisallowList() {
        return disallowList;
    }

    /**
     * Sets the value of the disallowList property.
     * 
     */
    public void setDisallowList(boolean value) {
        this.disallowList = value;
    }

    /**
     * Gets the value of the disallowValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disallowValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisallowValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDisallowValue() {
        if (disallowValue == null) {
            disallowValue = new ArrayList<String>();
        }
        return this.disallowValue;
    }

}
