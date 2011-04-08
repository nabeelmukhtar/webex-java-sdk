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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.LstControlType;


/**
 * <p>Java class for lstsummaryUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lstsummaryUser">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.webex.com/schemas/2002/06/common}emailType" minOccurs="0"/>
 *         &lt;element name="active" type="{http://www.webex.com/schemas/2002/06/service/user}activeType" minOccurs="0"/>
 *         &lt;element name="webExId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listControl" type="{http://www.webex.com/schemas/2002/06/service}lstControlType" minOccurs="0"/>
 *         &lt;element name="order" type="{http://www.webex.com/schemas/2002/06/service/user}orderType" minOccurs="0"/>
 *         &lt;element name="dataScope" type="{http://www.webex.com/schemas/2002/06/service/user}dataScopeType" minOccurs="0"/>
 *         &lt;element name="webACD" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.webex.com/schemas/2002/06/service/user}webACDUserRoleType">
 *                 &lt;sequence>
 *                   &lt;element name="manager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="returnPrefs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lstsummaryUser", propOrder = {
    "firstName",
    "lastName",
    "email",
    "active",
    "webExId",
    "listControl",
    "order",
    "dataScope",
    "webACD"
})
public class LstsummaryUser
    extends BodyContentType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected ActiveType active;
    protected String webExId;
    protected LstControlType listControl;
    protected OrderType order;
    protected DataScopeType dataScope;
    protected LstsummaryUser.WebACD webACD;

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveType }
     *     
     */
    public ActiveType getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveType }
     *     
     */
    public void setActive(ActiveType value) {
        this.active = value;
    }

    /**
     * Gets the value of the webExId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebExId() {
        return webExId;
    }

    /**
     * Sets the value of the webExId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebExId(String value) {
        this.webExId = value;
    }

    /**
     * Gets the value of the listControl property.
     * 
     * @return
     *     possible object is
     *     {@link LstControlType }
     *     
     */
    public LstControlType getListControl() {
        return listControl;
    }

    /**
     * Sets the value of the listControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link LstControlType }
     *     
     */
    public void setListControl(LstControlType value) {
        this.listControl = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link OrderType }
     *     
     */
    public OrderType getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderType }
     *     
     */
    public void setOrder(OrderType value) {
        this.order = value;
    }

    /**
     * Gets the value of the dataScope property.
     * 
     * @return
     *     possible object is
     *     {@link DataScopeType }
     *     
     */
    public DataScopeType getDataScope() {
        return dataScope;
    }

    /**
     * Sets the value of the dataScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataScopeType }
     *     
     */
    public void setDataScope(DataScopeType value) {
        this.dataScope = value;
    }

    /**
     * Gets the value of the webACD property.
     * 
     * @return
     *     possible object is
     *     {@link LstsummaryUser.WebACD }
     *     
     */
    public LstsummaryUser.WebACD getWebACD() {
        return webACD;
    }

    /**
     * Sets the value of the webACD property.
     * 
     * @param value
     *     allowed object is
     *     {@link LstsummaryUser.WebACD }
     *     
     */
    public void setWebACD(LstsummaryUser.WebACD value) {
        this.webACD = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/user}webACDUserRoleType">
     *       &lt;sequence>
     *         &lt;element name="manager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="returnPrefs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "manager",
        "returnPrefs"
    })
    public static class WebACD
        extends WebACDUserRoleType
        implements Serializable
    {

        private final static long serialVersionUID = 2461660169443089969L;
        protected String manager;
        @XmlElement(defaultValue = "true")
        protected Boolean returnPrefs;

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
         * Gets the value of the returnPrefs property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReturnPrefs() {
            return returnPrefs;
        }

        /**
         * Sets the value of the returnPrefs property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReturnPrefs(Boolean value) {
            this.returnPrefs = value;
        }

    }

}
