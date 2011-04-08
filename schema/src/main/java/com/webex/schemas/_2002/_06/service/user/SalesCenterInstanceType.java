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

package com.webex.schemas._2002._06.service.user;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for salesCenterInstanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="salesCenterInstanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roles" type="{http://www.webex.com/schemas/2002/06/service/user}salesRoleType" minOccurs="0"/>
 *         &lt;element name="manager" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="smeInfo" type="{http://www.webex.com/schemas/2002/06/service/user}salesSmeInstanceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salesCenterInstanceType", propOrder = {
    "roles",
    "manager",
    "smeInfo"
})
public class SalesCenterInstanceType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected SalesRoleType roles;
    protected String manager;
    protected SalesSmeInstanceType smeInfo;

    /**
     * Gets the value of the roles property.
     * 
     * @return
     *     possible object is
     *     {@link SalesRoleType }
     *     
     */
    public SalesRoleType getRoles() {
        return roles;
    }

    /**
     * Sets the value of the roles property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesRoleType }
     *     
     */
    public void setRoles(SalesRoleType value) {
        this.roles = value;
    }

    /**
     * Gets the value of the manager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManager() {
        return manager;
    }

    /**
     * Sets the value of the manager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManager(String value) {
        this.manager = value;
    }

    /**
     * Gets the value of the smeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SalesSmeInstanceType }
     *     
     */
    public SalesSmeInstanceType getSmeInfo() {
        return smeInfo;
    }

    /**
     * Sets the value of the smeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesSmeInstanceType }
     *     
     */
    public void setSmeInfo(SalesSmeInstanceType value) {
        this.smeInfo = value;
    }

}
