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

package com.webex.schemas._2002._06.service.meeting.auo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.webex.schemas._2002._06.common.DayOfWeekType;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for repeatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="repeatType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="repeatType" type="{http://www.webex.com/schemas/2002/06/service/meeting/auo}recurrenceType" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dayInWeek" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="day" type="{http://www.webex.com/schemas/2002/06/common}dayOfWeekType" maxOccurs="7" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dayInMonth" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;maxInclusive value="31"/>
 *               &lt;minInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="interval" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="weekInMonth" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "repeatType", propOrder = {
    "repeatType",
    "expirationDate",
    "dayInWeek",
    "dayInMonth",
    "interval",
    "weekInMonth"
})
public class RepeatType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected RecurrenceType repeatType;
    protected String expirationDate;
    protected RepeatType.DayInWeek dayInWeek;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long dayInMonth;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long interval;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long weekInMonth;

    /**
     * Gets the value of the repeatType property.
     * 
     * @return
     *     possible object is
     *     {@link RecurrenceType }
     *     
     */
    public RecurrenceType getRepeatType() {
        return repeatType;
    }

    /**
     * Sets the value of the repeatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurrenceType }
     *     
     */
    public void setRepeatType(RecurrenceType value) {
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
     *     {@link RepeatType.DayInWeek }
     *     
     */
    public RepeatType.DayInWeek getDayInWeek() {
        return dayInWeek;
    }

    /**
     * Sets the value of the dayInWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepeatType.DayInWeek }
     *     
     */
    public void setDayInWeek(RepeatType.DayInWeek value) {
        this.dayInWeek = value;
    }

    /**
     * Gets the value of the dayInMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
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
     *     {@link String }
     *     
     */
    public void setDayInMonth(Long value) {
        this.dayInMonth = value;
    }

    /**
     * Gets the value of the interval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterval(Long value) {
        this.interval = value;
    }

    /**
     * Gets the value of the weekInMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
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
     *     {@link String }
     *     
     */
    public void setWeekInMonth(Long value) {
        this.weekInMonth = value;
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
     *         &lt;element name="day" type="{http://www.webex.com/schemas/2002/06/common}dayOfWeekType" maxOccurs="7" minOccurs="0"/>
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
