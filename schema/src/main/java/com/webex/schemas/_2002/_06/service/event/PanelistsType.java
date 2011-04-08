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

package com.webex.schemas._2002._06.service.event;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.PersonType;


/**
 * <p>Java class for panelistsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="panelistsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="panelistPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="panelist" type="{http://www.webex.com/schemas/2002/06/common}personType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="panelistsInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "panelistsType", propOrder = {
    "panelistPassword",
    "panelist",
    "panelistsInfo"
})
public class PanelistsType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String panelistPassword;
    protected List<PersonType> panelist;
    protected String panelistsInfo;

    /**
     * Gets the value of the panelistPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPanelistPassword() {
        return panelistPassword;
    }

    /**
     * Sets the value of the panelistPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPanelistPassword(String value) {
        this.panelistPassword = value;
    }

    /**
     * Gets the value of the panelist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the panelist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPanelist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonType }
     * 
     * 
     */
    public List<PersonType> getPanelist() {
        if (panelist == null) {
            panelist = new ArrayList<PersonType>();
        }
        return this.panelist;
    }

    /**
     * Gets the value of the panelistsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPanelistsInfo() {
        return panelistsInfo;
    }

    /**
     * Sets the value of the panelistsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPanelistsInfo(String value) {
        this.panelistsInfo = value;
    }

}
