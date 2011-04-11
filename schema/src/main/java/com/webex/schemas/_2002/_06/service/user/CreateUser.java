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
 * <p>Java class for createUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createUser">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/user}userType">
 *       &lt;sequence>
 *         &lt;element name="salesCenter" type="{http://www.webex.com/schemas/2002/06/service/user}salesCenterType" minOccurs="0"/>
 *         &lt;element name="syncWebOffice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sendWelcome" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="validateFormat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createUser", propOrder = {
    "salesCenter",
    "syncWebOffice",
    "sendWelcome",
    "validateFormat"
})
public class CreateUser
    extends UserType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected SalesCenterType salesCenter;
    protected Boolean syncWebOffice;
    protected Boolean sendWelcome;
    protected Boolean validateFormat;

    /**
     * Gets the value of the salesCenter property.
     * 
     * @return
     *     possible object is
     *     {@link SalesCenterType }
     *     
     */
    public SalesCenterType getSalesCenter() {
        return salesCenter;
    }

    /**
     * Sets the value of the salesCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesCenterType }
     *     
     */
    public void setSalesCenter(SalesCenterType value) {
        this.salesCenter = value;
    }

    /**
     * Gets the value of the syncWebOffice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSyncWebOffice() {
        return syncWebOffice;
    }

    /**
     * Sets the value of the syncWebOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSyncWebOffice(Boolean value) {
        this.syncWebOffice = value;
    }

    /**
     * Gets the value of the sendWelcome property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendWelcome() {
        return sendWelcome;
    }

    /**
     * Sets the value of the sendWelcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendWelcome(Boolean value) {
        this.sendWelcome = value;
    }

    /**
     * Gets the value of the validateFormat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidateFormat() {
        return validateFormat;
    }

    /**
     * Sets the value of the validateFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidateFormat(Boolean value) {
        this.validateFormat = value;
    }

}
