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

package com.webex.schemas._2002._06.service.trainingsession;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.DayOfWeekType;


/**
 * <p>Java class for trainRepeatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trainRepeatType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="repeatType" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}repeatTypeType" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dayInWeek" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="day" type="{http://www.webex.com/schemas/2002/06/common}dayOfWeekType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="endAfter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="occurenceType" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}occurentTypeType" minOccurs="0"/>
 *         &lt;element name="interval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dayInMonth" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="weekInMonth" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="monthInYear" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dayInYear" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="repeatSession" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}repeatSessionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trainRepeatType", propOrder = {
    "repeatType",
    "expirationDate",
    "dayInWeek",
    "endAfter",
    "occurenceType",
    "interval",
    "dayInMonth",
    "weekInMonth",
    "monthInYear",
    "dayInYear",
    "repeatSession"
})
public class TrainRepeatType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected RepeatTypeType repeatType;
    protected String expirationDate;
    protected TrainRepeatType.DayInWeek dayInWeek;
    protected Integer endAfter;
    protected OccurentTypeType occurenceType;
    protected Integer interval;
    protected Long dayInMonth;
    protected Long weekInMonth;
    protected Long monthInYear;
    protected Long dayInYear;
    protected List<RepeatSessionType> repeatSession;

    /**
     * Gets the value of the repeatType property.
     * 
     * @return
     *     possible object is
     *     {@link RepeatTypeType }
     *     
     */
    public RepeatTypeType getRepeatType() {
        return repeatType;
    }

    /**
     * Sets the value of the repeatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepeatTypeType }
     *     
     */
    public void setRepeatType(RepeatTypeType value) {
        this.repeatType = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the dayInWeek property.
     * 
     * @return
     *     possible object is
     *     {@link TrainRepeatType.DayInWeek }
     *     
     */
    public TrainRepeatType.DayInWeek getDayInWeek() {
        return dayInWeek;
    }

    /**
     * Sets the value of the dayInWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainRepeatType.DayInWeek }
     *     
     */
    public void setDayInWeek(TrainRepeatType.DayInWeek value) {
        this.dayInWeek = value;
    }

    /**
     * Gets the value of the endAfter property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEndAfter() {
        return endAfter;
    }

    /**
     * Sets the value of the endAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEndAfter(Integer value) {
        this.endAfter = value;
    }

    /**
     * Gets the value of the occurenceType property.
     * 
     * @return
     *     possible object is
     *     {@link OccurentTypeType }
     *     
     */
    public OccurentTypeType getOccurenceType() {
        return occurenceType;
    }

    /**
     * Sets the value of the occurenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OccurentTypeType }
     *     
     */
    public void setOccurenceType(OccurentTypeType value) {
        this.occurenceType = value;
    }

    /**
     * Gets the value of the interval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInterval(Integer value) {
        this.interval = value;
    }

    /**
     * Gets the value of the dayInMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDayInMonth() {
        return dayInMonth;
    }

    /**
     * Sets the value of the dayInMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDayInMonth(Long value) {
        this.dayInMonth = value;
    }

    /**
     * Gets the value of the weekInMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWeekInMonth() {
        return weekInMonth;
    }

    /**
     * Sets the value of the weekInMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWeekInMonth(Long value) {
        this.weekInMonth = value;
    }

    /**
     * Gets the value of the monthInYear property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMonthInYear() {
        return monthInYear;
    }

    /**
     * Sets the value of the monthInYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMonthInYear(Long value) {
        this.monthInYear = value;
    }

    /**
     * Gets the value of the dayInYear property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDayInYear() {
        return dayInYear;
    }

    /**
     * Sets the value of the dayInYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDayInYear(Long value) {
        this.dayInYear = value;
    }

    /**
     * Gets the value of the repeatSession property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repeatSession property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepeatSession().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepeatSessionType }
     * 
     * 
     */
    public List<RepeatSessionType> getRepeatSession() {
        if (repeatSession == null) {
            repeatSession = new ArrayList<RepeatSessionType>();
        }
        return this.repeatSession;
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
     *         &lt;element name="day" type="{http://www.webex.com/schemas/2002/06/common}dayOfWeekType" maxOccurs="unbounded" minOccurs="0"/>
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
        "day"
    })
    public static class DayInWeek
        implements Serializable
    {

        private final static long serialVersionUID = 2461660169443089969L;
        protected List<DayOfWeekType> day;

        /**
         * Gets the value of the day property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the day property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDay().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DayOfWeekType }
         * 
         * 
         */
        public List<DayOfWeekType> getDay() {
            if (day == null) {
                day = new ArrayList<DayOfWeekType>();
            }
            return this.day;
        }

    }

}
