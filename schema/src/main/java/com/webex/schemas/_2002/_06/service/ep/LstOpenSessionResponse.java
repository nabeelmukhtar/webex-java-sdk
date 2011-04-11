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
import com.webex.schemas._2002._06.service.MatchingRecordsType;


/**
 * <p>Java class for lstOpenSessionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lstOpenSessionResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="matchingRecords" type="{http://www.webex.com/schemas/2002/06/service}matchingRecordsType" minOccurs="0"/>
 *         &lt;element name="services" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="serviceType" type="{http://www.webex.com/schemas/2002/06/common}serviceTypeType"/>
 *                   &lt;element name="sessions" type="{http://www.webex.com/schemas/2002/06/service/ep}openSessionType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "lstOpenSessionResponse", propOrder = {
    "matchingRecords",
    "services"
})
public class LstOpenSessionResponse
    extends BodyContentType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected MatchingRecordsType matchingRecords;
    protected List<LstOpenSessionResponse.Services> services;

    /**
     * Gets the value of the matchingRecords property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingRecordsType }
     *     
     */
    public MatchingRecordsType getMatchingRecords() {
        return matchingRecords;
    }

    /**
     * Sets the value of the matchingRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingRecordsType }
     *     
     */
    public void setMatchingRecords(MatchingRecordsType value) {
        this.matchingRecords = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the services property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LstOpenSessionResponse.Services }
     * 
     * 
     */
    public List<LstOpenSessionResponse.Services> getServices() {
        if (services == null) {
            services = new ArrayList<LstOpenSessionResponse.Services>();
        }
        return this.services;
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
     *         &lt;element name="serviceType" type="{http://www.webex.com/schemas/2002/06/common}serviceTypeType"/>
     *         &lt;element name="sessions" type="{http://www.webex.com/schemas/2002/06/service/ep}openSessionType" maxOccurs="unbounded" minOccurs="0"/>
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
        "serviceType",
        "sessions"
    })
    public static class Services
        implements Serializable
    {

        private final static long serialVersionUID = 2461660169443089969L;
        @XmlElement(required = true)
        protected ServiceTypeType serviceType;
        protected List<OpenSessionType> sessions;

        /**
         * Gets the value of the serviceType property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceTypeType }
         *     
         */
        public ServiceTypeType getServiceType() {
            return serviceType;
        }

        /**
         * Sets the value of the serviceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceTypeType }
         *     
         */
        public void setServiceType(ServiceTypeType value) {
            this.serviceType = value;
        }

        /**
         * Gets the value of the sessions property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sessions property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSessions().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OpenSessionType }
         * 
         * 
         */
        public List<OpenSessionType> getSessions() {
            if (sessions == null) {
                sessions = new ArrayList<OpenSessionType>();
            }
            return this.sessions;
        }

    }

}
