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

package com.webex.schemas._2002._06.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for callInNumType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="callInNumType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tollNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tollFreeNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intlLocalNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="globalNum" type="{http://www.webex.com/schemas/2002/06/service}globalCallInNumType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "callInNumType", propOrder = {
    "tollNum",
    "tollFreeNum",
    "intlLocalNum",
    "globalNum"
})
@XmlSeeAlso({
    PersonalTeleServerType.class,
    com.webex.schemas._2002._06.service.ep.GetSessionInfoResponse.Telephony.CallInNum.class
})
public class CallInNumType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected String tollNum;
    protected String tollFreeNum;
    protected String intlLocalNum;
    protected List<GlobalCallInNumType> globalNum;

    /**
     * Gets the value of the tollNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTollNum() {
        return tollNum;
    }

    /**
     * Sets the value of the tollNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTollNum(String value) {
        this.tollNum = value;
    }

    /**
     * Gets the value of the tollFreeNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTollFreeNum() {
        return tollFreeNum;
    }

    /**
     * Sets the value of the tollFreeNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTollFreeNum(String value) {
        this.tollFreeNum = value;
    }

    /**
     * Gets the value of the intlLocalNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntlLocalNum() {
        return intlLocalNum;
    }

    /**
     * Sets the value of the intlLocalNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntlLocalNum(String value) {
        this.intlLocalNum = value;
    }

    /**
     * Gets the value of the globalNum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the globalNum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalNum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalCallInNumType }
     * 
     * 
     */
    public List<GlobalCallInNumType> getGlobalNum() {
        if (globalNum == null) {
            globalNum = new ArrayList<GlobalCallInNumType>();
        }
        return this.globalNum;
    }

}
