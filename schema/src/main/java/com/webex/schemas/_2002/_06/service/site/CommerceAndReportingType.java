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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for commerceAndReportingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="commerceAndReportingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trackingCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="siteAdminReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="subScriptionService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isECommmerce" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="conferencePrice" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="callInPrice" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="callInTollFreePrice" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="callOutPrice" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="voIPPrice" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="creditCardAuthorRetries" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="customereCommerce" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isLocalTax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="localTaxName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localTaxtRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="holReport" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commerceAndReportingType", propOrder = {
    "trackingCode",
    "siteAdminReport",
    "subScriptionService",
    "isECommmerce",
    "conferencePrice",
    "callInPrice",
    "callInTollFreePrice",
    "callOutPrice",
    "voIPPrice",
    "creditCardAuthorRetries",
    "customereCommerce",
    "isLocalTax",
    "localTaxName",
    "localTaxtRate",
    "holReport"
})
public class CommerceAndReportingType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected Boolean trackingCode;
    protected Boolean siteAdminReport;
    protected Boolean subScriptionService;
    protected Boolean isECommmerce;
    protected Float conferencePrice;
    protected Float callInPrice;
    protected Float callInTollFreePrice;
    protected Float callOutPrice;
    protected Float voIPPrice;
    protected Long creditCardAuthorRetries;
    protected Boolean customereCommerce;
    protected Boolean isLocalTax;
    protected String localTaxName;
    protected Float localTaxtRate;
    protected Long holReport;

    /**
     * Gets the value of the trackingCode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrackingCode() {
        return trackingCode;
    }

    /**
     * Sets the value of the trackingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrackingCode(Boolean value) {
        this.trackingCode = value;
    }

    /**
     * Gets the value of the siteAdminReport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSiteAdminReport() {
        return siteAdminReport;
    }

    /**
     * Sets the value of the siteAdminReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSiteAdminReport(Boolean value) {
        this.siteAdminReport = value;
    }

    /**
     * Gets the value of the subScriptionService property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubScriptionService() {
        return subScriptionService;
    }

    /**
     * Sets the value of the subScriptionService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubScriptionService(Boolean value) {
        this.subScriptionService = value;
    }

    /**
     * Gets the value of the isECommmerce property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsECommmerce() {
        return isECommmerce;
    }

    /**
     * Sets the value of the isECommmerce property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsECommmerce(Boolean value) {
        this.isECommmerce = value;
    }

    /**
     * Gets the value of the conferencePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getConferencePrice() {
        return conferencePrice;
    }

    /**
     * Sets the value of the conferencePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setConferencePrice(Float value) {
        this.conferencePrice = value;
    }

    /**
     * Gets the value of the callInPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCallInPrice() {
        return callInPrice;
    }

    /**
     * Sets the value of the callInPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCallInPrice(Float value) {
        this.callInPrice = value;
    }

    /**
     * Gets the value of the callInTollFreePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCallInTollFreePrice() {
        return callInTollFreePrice;
    }

    /**
     * Sets the value of the callInTollFreePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCallInTollFreePrice(Float value) {
        this.callInTollFreePrice = value;
    }

    /**
     * Gets the value of the callOutPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCallOutPrice() {
        return callOutPrice;
    }

    /**
     * Sets the value of the callOutPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCallOutPrice(Float value) {
        this.callOutPrice = value;
    }

    /**
     * Gets the value of the voIPPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVoIPPrice() {
        return voIPPrice;
    }

    /**
     * Sets the value of the voIPPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVoIPPrice(Float value) {
        this.voIPPrice = value;
    }

    /**
     * Gets the value of the creditCardAuthorRetries property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreditCardAuthorRetries() {
        return creditCardAuthorRetries;
    }

    /**
     * Sets the value of the creditCardAuthorRetries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreditCardAuthorRetries(Long value) {
        this.creditCardAuthorRetries = value;
    }

    /**
     * Gets the value of the customereCommerce property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomereCommerce() {
        return customereCommerce;
    }

    /**
     * Sets the value of the customereCommerce property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomereCommerce(Boolean value) {
        this.customereCommerce = value;
    }

    /**
     * Gets the value of the isLocalTax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLocalTax() {
        return isLocalTax;
    }

    /**
     * Sets the value of the isLocalTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLocalTax(Boolean value) {
        this.isLocalTax = value;
    }

    /**
     * Gets the value of the localTaxName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalTaxName() {
        return localTaxName;
    }

    /**
     * Sets the value of the localTaxName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalTaxName(String value) {
        this.localTaxName = value;
    }

    /**
     * Gets the value of the localTaxtRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLocalTaxtRate() {
        return localTaxtRate;
    }

    /**
     * Sets the value of the localTaxtRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLocalTaxtRate(Float value) {
        this.localTaxtRate = value;
    }

    /**
     * Gets the value of the holReport property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHolReport() {
        return holReport;
    }

    /**
     * Sets the value of the holReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHolReport(Long value) {
        this.holReport = value;
    }

}
