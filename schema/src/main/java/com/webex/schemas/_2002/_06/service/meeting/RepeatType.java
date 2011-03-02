
package com.webex.schemas._2002._06.service.meeting;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.DayOfWeekType;


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
 *         &lt;element name="repeatType" type="{http://www.webex.com/schemas/2002/06/service/meeting}repeatTypeType" minOccurs="0"/>
 *         &lt;element name="interval" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="afterMeetingNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dayInMonth" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="weekInMonth" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="monthInYear" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dayInYear" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "interval",
    "afterMeetingNumber",
    "dayInWeek",
    "expirationDate",
    "dayInMonth",
    "weekInMonth",
    "monthInYear",
    "dayInYear"
})
public class RepeatType {

    protected RepeatTypeType repeatType;
    protected BigInteger interval;
    protected BigInteger afterMeetingNumber;
    protected RepeatType.DayInWeek dayInWeek;
    protected String expirationDate;
    protected Long dayInMonth;
    protected Long weekInMonth;
    protected Long monthInYear;
    protected Long dayInYear;

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
     * Gets the value of the interval property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInterval(BigInteger value) {
        this.interval = value;
    }

    /**
     * Gets the value of the afterMeetingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAfterMeetingNumber() {
        return afterMeetingNumber;
    }

    /**
     * Sets the value of the afterMeetingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAfterMeetingNumber(BigInteger value) {
        this.afterMeetingNumber = value;
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
    public static class DayInWeek {

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
