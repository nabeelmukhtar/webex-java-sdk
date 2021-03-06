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

package com.webex.schemas._2002._06.service.sales;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.TrackingType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for salesSessionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="salesSessionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="accessControl" type="{http://www.webex.com/schemas/2002/06/service/sales}accessControlType" minOccurs="0"/>
 *         &lt;element name="metaData" type="{http://www.webex.com/schemas/2002/06/service/sales}metaDataType" minOccurs="0"/>
 *         &lt;element name="schedule" type="{http://www.webex.com/schemas/2002/06/service/sales}scheduleType" minOccurs="0"/>
 *         &lt;element name="enableOptions" type="{http://www.webex.com/schemas/2002/06/service/sales}enableOptionsType" minOccurs="0"/>
 *         &lt;element name="telephony" type="{http://www.webex.com/schemas/2002/06/service/sales}telephonyType" minOccurs="0"/>
 *         &lt;element name="tracking" type="{http://www.webex.com/schemas/2002/06/common}trackingType" minOccurs="0"/>
 *         &lt;element name="repeat" type="{http://www.webex.com/schemas/2002/06/service/sales}repeatType" minOccurs="0"/>
 *         &lt;element name="remind" type="{http://www.webex.com/schemas/2002/06/service/sales}remindType" minOccurs="0"/>
 *         &lt;element name="prospects" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="prospect" type="{http://www.webex.com/schemas/2002/06/service/sales}prospectType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="salesTeam" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="webExID" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="128"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="altHosts" type="{http://www.webex.com/schemas/2002/06/service/sales}alternateHostType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="attendeeOptions" type="{http://www.webex.com/schemas/2002/06/service/sales}attendeeOptionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salesSessionType", propOrder = {
    "accessControl",
    "metaData",
    "schedule",
    "enableOptions",
    "telephony",
    "tracking",
    "repeat",
    "remind",
    "prospects",
    "salesTeam",
    "attendeeOptions"
})
@XmlSeeAlso({
    CreateSalesSession.class,
    SalesSessionInstanceType.class
})
public class SalesSessionType
    extends BodyContentType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected AccessControlType accessControl;
    protected MetaDataType metaData;
    protected ScheduleType schedule;
    protected EnableOptionsType enableOptions;
    protected TelephonyType telephony;
    protected TrackingType tracking;
    protected RepeatType repeat;
    protected RemindType remind;
    protected SalesSessionType.Prospects prospects;
    protected SalesSessionType.SalesTeam salesTeam;
    protected AttendeeOptionsType attendeeOptions;

    /**
     * Gets the value of the accessControl property.
     * 
     * @return
     *     possible object is
     *     {@link AccessControlType }
     *     
     */
    public AccessControlType getAccessControl() {
        return accessControl;
    }

    /**
     * Sets the value of the accessControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessControlType }
     *     
     */
    public void setAccessControl(AccessControlType value) {
        this.accessControl = value;
    }

    /**
     * Gets the value of the metaData property.
     * 
     * @return
     *     possible object is
     *     {@link MetaDataType }
     *     
     */
    public MetaDataType getMetaData() {
        return metaData;
    }

    /**
     * Sets the value of the metaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataType }
     *     
     */
    public void setMetaData(MetaDataType value) {
        this.metaData = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleType }
     *     
     */
    public ScheduleType getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleType }
     *     
     */
    public void setSchedule(ScheduleType value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the enableOptions property.
     * 
     * @return
     *     possible object is
     *     {@link EnableOptionsType }
     *     
     */
    public EnableOptionsType getEnableOptions() {
        return enableOptions;
    }

    /**
     * Sets the value of the enableOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnableOptionsType }
     *     
     */
    public void setEnableOptions(EnableOptionsType value) {
        this.enableOptions = value;
    }

    /**
     * Gets the value of the telephony property.
     * 
     * @return
     *     possible object is
     *     {@link TelephonyType }
     *     
     */
    public TelephonyType getTelephony() {
        return telephony;
    }

    /**
     * Sets the value of the telephony property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephonyType }
     *     
     */
    public void setTelephony(TelephonyType value) {
        this.telephony = value;
    }

    /**
     * Gets the value of the tracking property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingType }
     *     
     */
    public TrackingType getTracking() {
        return tracking;
    }

    /**
     * Sets the value of the tracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingType }
     *     
     */
    public void setTracking(TrackingType value) {
        this.tracking = value;
    }

    /**
     * Gets the value of the repeat property.
     * 
     * @return
     *     possible object is
     *     {@link RepeatType }
     *     
     */
    public RepeatType getRepeat() {
        return repeat;
    }

    /**
     * Sets the value of the repeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepeatType }
     *     
     */
    public void setRepeat(RepeatType value) {
        this.repeat = value;
    }

    /**
     * Gets the value of the remind property.
     * 
     * @return
     *     possible object is
     *     {@link RemindType }
     *     
     */
    public RemindType getRemind() {
        return remind;
    }

    /**
     * Sets the value of the remind property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemindType }
     *     
     */
    public void setRemind(RemindType value) {
        this.remind = value;
    }

    /**
     * Gets the value of the prospects property.
     * 
     * @return
     *     possible object is
     *     {@link SalesSessionType.Prospects }
     *     
     */
    public SalesSessionType.Prospects getProspects() {
        return prospects;
    }

    /**
     * Sets the value of the prospects property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesSessionType.Prospects }
     *     
     */
    public void setProspects(SalesSessionType.Prospects value) {
        this.prospects = value;
    }

    /**
     * Gets the value of the salesTeam property.
     * 
     * @return
     *     possible object is
     *     {@link SalesSessionType.SalesTeam }
     *     
     */
    public SalesSessionType.SalesTeam getSalesTeam() {
        return salesTeam;
    }

    /**
     * Sets the value of the salesTeam property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesSessionType.SalesTeam }
     *     
     */
    public void setSalesTeam(SalesSessionType.SalesTeam value) {
        this.salesTeam = value;
    }

    /**
     * Gets the value of the attendeeOptions property.
     * 
     * @return
     *     possible object is
     *     {@link AttendeeOptionsType }
     *     
     */
    public AttendeeOptionsType getAttendeeOptions() {
        return attendeeOptions;
    }

    /**
     * Sets the value of the attendeeOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttendeeOptionsType }
     *     
     */
    public void setAttendeeOptions(AttendeeOptionsType value) {
        this.attendeeOptions = value;
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
     *         &lt;element name="prospect" type="{http://www.webex.com/schemas/2002/06/service/sales}prospectType" maxOccurs="unbounded" minOccurs="0"/>
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
        "prospect"
    })
    public static class Prospects
        implements Serializable
    {

        private final static long serialVersionUID = 2461660169443089969L;
        protected List<ProspectType> prospect;

        /**
         * Gets the value of the prospect property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the prospect property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProspect().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProspectType }
         * 
         * 
         */
        public List<ProspectType> getProspect() {
            if (prospect == null) {
                prospect = new ArrayList<ProspectType>();
            }
            return this.prospect;
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
     *         &lt;element name="webExID" maxOccurs="unbounded" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="128"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="altHosts" type="{http://www.webex.com/schemas/2002/06/service/sales}alternateHostType" minOccurs="0"/>
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
        "webExID",
        "email",
        "altHosts"
    })
    public static class SalesTeam
        implements Serializable
    {

        private final static long serialVersionUID = 2461660169443089969L;
        protected List<String> webExID;
        protected List<String> email;
        protected AlternateHostType altHosts;

        /**
         * Gets the value of the webExID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the webExID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWebExID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getWebExID() {
            if (webExID == null) {
                webExID = new ArrayList<String>();
            }
            return this.webExID;
        }

        /**
         * Gets the value of the email property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the email property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getEmail() {
            if (email == null) {
                email = new ArrayList<String>();
            }
            return this.email;
        }

        /**
         * Gets the value of the altHosts property.
         * 
         * @return
         *     possible object is
         *     {@link AlternateHostType }
         *     
         */
        public AlternateHostType getAltHosts() {
            return altHosts;
        }

        /**
         * Sets the value of the altHosts property.
         * 
         * @param value
         *     allowed object is
         *     {@link AlternateHostType }
         *     
         */
        public void setAltHosts(AlternateHostType value) {
            this.altHosts = value;
        }

    }

}
