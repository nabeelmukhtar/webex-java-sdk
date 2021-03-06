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

package com.webex.schemas._2002._06.service.ep;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.webex.schemas._2002._06.common.ServiceTypeType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.LstControlType;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for lstsummarySession complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lstsummarySession">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="listControl" type="{http://www.webex.com/schemas/2002/06/service}lstControlType" minOccurs="0"/>
 *         &lt;element name="order" type="{http://www.webex.com/schemas/2002/06/service/ep}orderType" minOccurs="0"/>
 *         &lt;element name="dateScope" type="{http://www.webex.com/schemas/2002/06/service/ep}dateScopeType" minOccurs="0"/>
 *         &lt;element name="sessionTypes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sessionType" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="serviceTypes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="serviceType" type="{http://www.webex.com/schemas/2002/06/common}serviceTypeType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="sessionKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="hostWebExID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hostEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.webex.com/schemas/2002/06/service/ep}statusType" minOccurs="0"/>
 *         &lt;element name="recurrence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="invited" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="confID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="confName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inclAudioOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="returnPSOFields" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="returnAssistFields" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lstsummarySession", propOrder = {
    "listControl",
    "order",
    "dateScope",
    "sessionTypes",
    "serviceTypes",
    "sessionKey",
    "hostWebExID",
    "hostEmail",
    "status",
    "recurrence",
    "invited",
    "confID",
    "confName",
    "inclAudioOnly",
    "returnPSOFields",
    "returnAssistFields"
})
public class LstsummarySession
    extends BodyContentType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected LstControlType listControl;
    protected OrderType order;
    protected DateScopeType dateScope;
    protected LstsummarySession.SessionTypes sessionTypes;
    protected LstsummarySession.ServiceTypes serviceTypes;
    protected Long sessionKey;
    protected String hostWebExID;
    protected String hostEmail;
    protected StatusType status;
    protected Boolean recurrence;
    protected Boolean invited;
    protected Long confID;
    protected String confName;
    protected Boolean inclAudioOnly;
    protected Boolean returnPSOFields;
    @XmlElement(defaultValue = "false")
    protected Boolean returnAssistFields;

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
     * Gets the value of the dateScope property.
     * 
     * @return
     *     possible object is
     *     {@link DateScopeType }
     *     
     */
    public DateScopeType getDateScope() {
        return dateScope;
    }

    /**
     * Sets the value of the dateScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateScopeType }
     *     
     */
    public void setDateScope(DateScopeType value) {
        this.dateScope = value;
    }

    /**
     * Gets the value of the sessionTypes property.
     * 
     * @return
     *     possible object is
     *     {@link LstsummarySession.SessionTypes }
     *     
     */
    public LstsummarySession.SessionTypes getSessionTypes() {
        return sessionTypes;
    }

    /**
     * Sets the value of the sessionTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link LstsummarySession.SessionTypes }
     *     
     */
    public void setSessionTypes(LstsummarySession.SessionTypes value) {
        this.sessionTypes = value;
    }

    /**
     * Gets the value of the serviceTypes property.
     * 
     * @return
     *     possible object is
     *     {@link LstsummarySession.ServiceTypes }
     *     
     */
    public LstsummarySession.ServiceTypes getServiceTypes() {
        return serviceTypes;
    }

    /**
     * Sets the value of the serviceTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link LstsummarySession.ServiceTypes }
     *     
     */
    public void setServiceTypes(LstsummarySession.ServiceTypes value) {
        this.serviceTypes = value;
    }

    /**
     * Gets the value of the sessionKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSessionKey() {
        return sessionKey;
    }

    /**
     * Sets the value of the sessionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSessionKey(Long value) {
        this.sessionKey = value;
    }

    /**
     * Gets the value of the hostWebExID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostWebExID() {
        return hostWebExID;
    }

    /**
     * Sets the value of the hostWebExID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostWebExID(String value) {
        this.hostWebExID = value;
    }

    /**
     * Gets the value of the hostEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostEmail() {
        return hostEmail;
    }

    /**
     * Sets the value of the hostEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostEmail(String value) {
        this.hostEmail = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the recurrence property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecurrence() {
        return recurrence;
    }

    /**
     * Sets the value of the recurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecurrence(Boolean value) {
        this.recurrence = value;
    }

    /**
     * Gets the value of the invited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInvited() {
        return invited;
    }

    /**
     * Sets the value of the invited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInvited(Boolean value) {
        this.invited = value;
    }

    /**
     * Gets the value of the confID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConfID() {
        return confID;
    }

    /**
     * Sets the value of the confID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConfID(Long value) {
        this.confID = value;
    }

    /**
     * Gets the value of the confName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfName() {
        return confName;
    }

    /**
     * Sets the value of the confName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfName(String value) {
        this.confName = value;
    }

    /**
     * Gets the value of the inclAudioOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInclAudioOnly() {
        return inclAudioOnly;
    }

    /**
     * Sets the value of the inclAudioOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInclAudioOnly(Boolean value) {
        this.inclAudioOnly = value;
    }

    /**
     * Gets the value of the returnPSOFields property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnPSOFields() {
        return returnPSOFields;
    }

    /**
     * Sets the value of the returnPSOFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnPSOFields(Boolean value) {
        this.returnPSOFields = value;
    }

    /**
     * Gets the value of the returnAssistFields property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnAssistFields() {
        return returnAssistFields;
    }

    /**
     * Sets the value of the returnAssistFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnAssistFields(Boolean value) {
        this.returnAssistFields = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="serviceType" type="{http://www.webex.com/schemas/2002/06/common}serviceTypeType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "serviceType"
    })
    public static class ServiceTypes
        implements Serializable
    {

        private final static long serialVersionUID = 2461660169443089969L;
        protected List<ServiceTypeType> serviceType;

        /**
         * Gets the value of the serviceType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceTypeType }
         * 
         * 
         */
        public List<ServiceTypeType> getServiceType() {
            if (serviceType == null) {
                serviceType = new ArrayList<ServiceTypeType>();
            }
            return this.serviceType;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="sessionType" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sessionType"
    })
    public static class SessionTypes
        implements Serializable
    {

        private final static long serialVersionUID = 2461660169443089969L;
        @XmlElement(type = String.class)
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "integer")
        protected List<Long> sessionType;

        /**
         * Gets the value of the sessionType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sessionType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSessionType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<Long> getSessionType() {
            if (sessionType == null) {
                sessionType = new ArrayList<Long>();
            }
            return this.sessionType;
        }

    }

}
