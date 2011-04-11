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
 * The Class TrainRepeatType.
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

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The repeat type. */
    protected RepeatTypeType repeatType;
    
    /** The expiration date. */
    protected String expirationDate;
    
    /** The day in week. */
    protected TrainRepeatType.DayInWeek dayInWeek;
    
    /** The end after. */
    protected Integer endAfter;
    
    /** The occurence type. */
    protected OccurentTypeType occurenceType;
    
    /** The interval. */
    protected Integer interval;
    
    /** The day in month. */
    protected Long dayInMonth;
    
    /** The week in month. */
    protected Long weekInMonth;
    
    /** The month in year. */
    protected Long monthInYear;
    
    /** The day in year. */
    protected Long dayInYear;
    
    /** The repeat session. */
    protected List<RepeatSessionType> repeatSession;

    /**
     * Gets the repeat type.
     * 
     * @return the repeat type
     */
    public RepeatTypeType getRepeatType() {
        return repeatType;
    }

    /**
     * Sets the repeat type.
     * 
     * @param value the new repeat type
     */
    public void setRepeatType(RepeatTypeType value) {
        this.repeatType = value;
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
     * Gets the day in week.
     * 
     * @return the day in week
     */
    public TrainRepeatType.DayInWeek getDayInWeek() {
        return dayInWeek;
    }

    /**
     * Sets the day in week.
     * 
     * @param value the new day in week
     */
    public void setDayInWeek(TrainRepeatType.DayInWeek value) {
        this.dayInWeek = value;
    }

    /**
     * Gets the end after.
     * 
     * @return the end after
     */
    public Integer getEndAfter() {
        return endAfter;
    }

    /**
     * Sets the end after.
     * 
     * @param value the new end after
     */
    public void setEndAfter(Integer value) {
        this.endAfter = value;
    }

    /**
     * Gets the occurence type.
     * 
     * @return the occurence type
     */
    public OccurentTypeType getOccurenceType() {
        return occurenceType;
    }

    /**
     * Sets the occurence type.
     * 
     * @param value the new occurence type
     */
    public void setOccurenceType(OccurentTypeType value) {
        this.occurenceType = value;
    }

    /**
     * Gets the interval.
     * 
     * @return the interval
     */
    public Integer getInterval() {
        return interval;
    }

    /**
     * Sets the interval.
     * 
     * @param value the new interval
     */
    public void setInterval(Integer value) {
        this.interval = value;
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
     * Gets the day in year.
     * 
     * @return the day in year
     */
    public Long getDayInYear() {
        return dayInYear;
    }

    /**
     * Sets the day in year.
     * 
     * @param value the new day in year
     */
    public void setDayInYear(Long value) {
        this.dayInYear = value;
    }

    /**
     * Gets the repeat session.
     * 
     * @return the repeat session
     */
    public List<RepeatSessionType> getRepeatSession() {
        if (repeatSession == null) {
            repeatSession = new ArrayList<RepeatSessionType>();
        }
        return this.repeatSession;
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
