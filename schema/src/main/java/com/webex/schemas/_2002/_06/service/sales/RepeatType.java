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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.webex.schemas._2002._06.common.DayOfWeekType;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class RepeatType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "repeatType", propOrder = {
    "repeatType",
    "endAfter",
    "expirationDate",
    "interval",
    "dayInWeek",
    "dayInMonth",
    "weekInMonth",
    "monthInYear"
})
public class RepeatType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The repeat type. */
    protected RecurrenceType repeatType;
    
    /** The end after. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long endAfter;
    
    /** The expiration date. */
    protected String expirationDate;
    
    /** The interval. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long interval;
    
    /** The day in week. */
    protected RepeatType.DayInWeek dayInWeek;
    
    /** The day in month. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long dayInMonth;
    
    /** The week in month. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long weekInMonth;
    
    /** The month in year. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long monthInYear;

    /**
     * Gets the repeat type.
     * 
     * @return the repeat type
     */
    public RecurrenceType getRepeatType() {
        return repeatType;
    }

    /**
     * Sets the repeat type.
     * 
     * @param value the new repeat type
     */
    public void setRepeatType(RecurrenceType value) {
        this.repeatType = value;
    }

    /**
     * Gets the end after.
     * 
     * @return the end after
     */
    public Long getEndAfter() {
        return endAfter;
    }

    /**
     * Sets the end after.
     * 
     * @param value the new end after
     */
    public void setEndAfter(Long value) {
        this.endAfter = value;
    }

    /**
     * Gets the expiration date.
     * 
     * @return the expiration date
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the expiration date.
     * 
     * @param value the new expiration date
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the interval.
     * 
     * @return the interval
     */
    public Long getInterval() {
        return interval;
    }

    /**
     * Sets the interval.
     * 
     * @param value the new interval
     */
    public void setInterval(Long value) {
        this.interval = value;
    }

    /**
     * Gets the day in week.
     * 
     * @return the day in week
     */
    public RepeatType.DayInWeek getDayInWeek() {
        return dayInWeek;
    }

    /**
     * Sets the day in week.
     * 
     * @param value the new day in week
     */
    public void setDayInWeek(RepeatType.DayInWeek value) {
        this.dayInWeek = value;
    }

    /**
     * Gets the day in month.
     * 
     * @return the day in month
     */
    public Long getDayInMonth() {
        return dayInMonth;
    }

    /**
     * Sets the day in month.
     * 
     * @param value the new day in month
     */
    public void setDayInMonth(Long value) {
        this.dayInMonth = value;
    }

    /**
     * Gets the week in month.
     * 
     * @return the week in month
     */
    public Long getWeekInMonth() {
        return weekInMonth;
    }

    /**
     * Sets the week in month.
     * 
     * @param value the new week in month
     */
    public void setWeekInMonth(Long value) {
        this.weekInMonth = value;
    }

    /**
     * Gets the month in year.
     * 
     * @return the month in year
     */
    public Long getMonthInYear() {
        return monthInYear;
    }

    /**
     * Sets the month in year.
     * 
     * @param value the new month in year
     */
    public void setMonthInYear(Long value) {
        this.monthInYear = value;
    }


    /**
     * The Class DayInWeek.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "day"
    })
    public static class DayInWeek
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The day. */
        protected List<DayOfWeekType> day;

        /**
         * Gets the day.
         * 
         * @return the day
         */
        public List<DayOfWeekType> getDay() {
            if (day == null) {
                day = new ArrayList<DayOfWeekType>();
            }
            return this.day;
        }

    }

}
