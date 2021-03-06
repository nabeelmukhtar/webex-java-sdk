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
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.ServiceTypeType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for lstRecording complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lstRecording">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="listControl" type="{http://www.webex.com/schemas/2002/06/service/ep}listControlType" minOccurs="0"/>
 *         &lt;element name="createTimeScope" type="{http://www.webex.com/schemas/2002/06/service/ep}createTimeScopeType" minOccurs="0"/>
 *         &lt;element name="hostWebExID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sessionKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="returnSessionDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="recordName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lstRecording", propOrder = {
    "listControl",
    "createTimeScope",
    "hostWebExID",
    "sessionKey",
    "returnSessionDetails",
    "recordName",
    "serviceTypes"
})
public class LstRecording
    extends BodyContentType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected ListControlType listControl;
    protected CreateTimeScopeType createTimeScope;
    protected String hostWebExID;
    protected Long sessionKey;
    @XmlElement(defaultValue = "false")
    protected Boolean returnSessionDetails;
    protected String recordName;
    protected LstRecording.ServiceTypes serviceTypes;

    /**
     * Gets the value of the listControl property.
     * 
     * @return
     *     possible object is
     *     {@link ListControlType }
     *     
     */
    public ListControlType getListControl() {
        return listControl;
    }

    /**
     * Sets the value of the listControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListControlType }
     *     
     */
    public void setListControl(ListControlType value) {
        this.listControl = value;
    }

    /**
     * Gets the value of the createTimeScope property.
     * 
     * @return
     *     possible object is
     *     {@link CreateTimeScopeType }
     *     
     */
    public CreateTimeScopeType getCreateTimeScope() {
        return createTimeScope;
    }

    /**
     * Sets the value of the createTimeScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateTimeScopeType }
     *     
     */
    public void setCreateTimeScope(CreateTimeScopeType value) {
        this.createTimeScope = value;
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
     * Gets the value of the returnSessionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnSessionDetails() {
        return returnSessionDetails;
    }

    /**
     * Sets the value of the returnSessionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnSessionDetails(Boolean value) {
        this.returnSessionDetails = value;
    }

    /**
     * Gets the value of the recordName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordName() {
        return recordName;
    }

    /**
     * Sets the value of the recordName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordName(String value) {
        this.recordName = value;
    }

    /**
     * Gets the value of the serviceTypes property.
     * 
     * @return
     *     possible object is
     *     {@link LstRecording.ServiceTypes }
     *     
     */
    public LstRecording.ServiceTypes getServiceTypes() {
        return serviceTypes;
    }

    /**
     * Sets the value of the serviceTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link LstRecording.ServiceTypes }
     *     
     */
    public void setServiceTypes(LstRecording.ServiceTypes value) {
        this.serviceTypes = value;
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

}
