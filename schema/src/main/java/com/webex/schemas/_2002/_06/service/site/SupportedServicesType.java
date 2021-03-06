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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for supportedServicesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="supportedServicesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meetingCenter" type="{http://www.webex.com/schemas/2002/06/service/site}supportedServiceType"/>
 *         &lt;element name="trainingCenter" type="{http://www.webex.com/schemas/2002/06/service/site}supportedServiceType"/>
 *         &lt;element name="supportCenter">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.webex.com/schemas/2002/06/service/site}supportedServiceType">
 *                 &lt;sequence>
 *                   &lt;element name="webACD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="eventCenter">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.webex.com/schemas/2002/06/service/site}supportedServiceType">
 *                 &lt;sequence>
 *                   &lt;element name="marketingAddOn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="salesCenter" type="{http://www.webex.com/schemas/2002/06/service/site}supportedServiceType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supportedServicesType", propOrder = {
    "meetingCenter",
    "trainingCenter",
    "supportCenter",
    "eventCenter",
    "salesCenter"
})
public class SupportedServicesType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected SupportedServiceType meetingCenter;
    @XmlElement(required = true)
    protected SupportedServiceType trainingCenter;
    @XmlElement(required = true)
    protected SupportedServicesType.SupportCenter supportCenter;
    @XmlElement(required = true)
    protected SupportedServicesType.EventCenter eventCenter;
    @XmlElement(required = true)
    protected SupportedServiceType salesCenter;

    /**
     * Gets the value of the meetingCenter property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedServiceType }
     *     
     */
    public SupportedServiceType getMeetingCenter() {
        return meetingCenter;
    }

    /**
     * Sets the value of the meetingCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedServiceType }
     *     
     */
    public void setMeetingCenter(SupportedServiceType value) {
        this.meetingCenter = value;
    }

    /**
     * Gets the value of the trainingCenter property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedServiceType }
     *     
     */
    public SupportedServiceType getTrainingCenter() {
        return trainingCenter;
    }

    /**
     * Sets the value of the trainingCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedServiceType }
     *     
     */
    public void setTrainingCenter(SupportedServiceType value) {
        this.trainingCenter = value;
    }

    /**
     * Gets the value of the supportCenter property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedServicesType.SupportCenter }
     *     
     */
    public SupportedServicesType.SupportCenter getSupportCenter() {
        return supportCenter;
    }

    /**
     * Sets the value of the supportCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedServicesType.SupportCenter }
     *     
     */
    public void setSupportCenter(SupportedServicesType.SupportCenter value) {
        this.supportCenter = value;
    }

    /**
     * Gets the value of the eventCenter property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedServicesType.EventCenter }
     *     
     */
    public SupportedServicesType.EventCenter getEventCenter() {
        return eventCenter;
    }

    /**
     * Sets the value of the eventCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedServicesType.EventCenter }
     *     
     */
    public void setEventCenter(SupportedServicesType.EventCenter value) {
        this.eventCenter = value;
    }

    /**
     * Gets the value of the salesCenter property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedServiceType }
     *     
     */
    public SupportedServiceType getSalesCenter() {
        return salesCenter;
    }

    /**
     * Sets the value of the salesCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedServiceType }
     *     
     */
    public void setSalesCenter(SupportedServiceType value) {
        this.salesCenter = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/site}supportedServiceType">
     *       &lt;sequence>
     *         &lt;element name="marketingAddOn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "marketingAddOn"
    })
    public static class EventCenter
        extends SupportedServiceType
        implements Serializable
    {

        private final static long serialVersionUID = 2461660169443089969L;
        protected boolean marketingAddOn;

        /**
         * Gets the value of the marketingAddOn property.
         * 
         */
        public boolean isMarketingAddOn() {
            return marketingAddOn;
        }

        /**
         * Sets the value of the marketingAddOn property.
         * 
         */
        public void setMarketingAddOn(boolean value) {
            this.marketingAddOn = value;
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
     *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/site}supportedServiceType">
     *       &lt;sequence>
     *         &lt;element name="webACD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "webACD"
    })
    public static class SupportCenter
        extends SupportedServiceType
        implements Serializable
    {

        private final static long serialVersionUID = 2461660169443089969L;
        protected Boolean webACD;

        /**
         * Gets the value of the webACD property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isWebACD() {
            return webACD;
        }

        /**
         * Sets the value of the webACD property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setWebACD(Boolean value) {
            this.webACD = value;
        }

    }

}
