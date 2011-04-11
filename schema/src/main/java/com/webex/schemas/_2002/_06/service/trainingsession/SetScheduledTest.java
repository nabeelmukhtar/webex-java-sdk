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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * The Class SetScheduledTest.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setScheduledTest", propOrder = {
    "sessionKey",
    "testID",
    "deliveryMethod",
    "timeLimit",
    "sendReport",
    "attemptLimit"
})
public class SetScheduledTest
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The session key. */
    protected long sessionKey;
    
    /** The test id. */
    protected long testID;
    
    /** The delivery method. */
    @XmlElement(required = true)
    protected SetScheduledTest.DeliveryMethod deliveryMethod;
    
    /** The time limit. */
    @XmlElement(required = true)
    protected SetScheduledTest.TimeLimit timeLimit;
    
    /** The send report. */
    protected Boolean sendReport;
    
    /** The attempt limit. */
    @XmlElement(required = true)
    protected SetScheduledTest.AttemptLimit attemptLimit;

    /**
     * Gets the session key.
     * 
     * @return the session key
     */
    public long getSessionKey() {
        return sessionKey;
    }

    /**
     * Sets the session key.
     * 
     * @param value the new session key
     */
    public void setSessionKey(long value) {
        this.sessionKey = value;
    }

    /**
     * Gets the test id.
     * 
     * @return the test id
     */
    public long getTestID() {
        return testID;
    }

    /**
     * Sets the test id.
     * 
     * @param value the new test id
     */
    public void setTestID(long value) {
        this.testID = value;
    }

    /**
     * Gets the delivery method.
     * 
     * @return the delivery method
     */
    public SetScheduledTest.DeliveryMethod getDeliveryMethod() {
        return deliveryMethod;
    }

    /**
     * Sets the delivery method.
     * 
     * @param value the new delivery method
     */
    public void setDeliveryMethod(SetScheduledTest.DeliveryMethod value) {
        this.deliveryMethod = value;
    }

    /**
     * Gets the time limit.
     * 
     * @return the time limit
     */
    public SetScheduledTest.TimeLimit getTimeLimit() {
        return timeLimit;
    }

    /**
     * Sets the time limit.
     * 
     * @param value the new time limit
     */
    public void setTimeLimit(SetScheduledTest.TimeLimit value) {
        this.timeLimit = value;
    }

    /**
     * Checks if is send report.
     * 
     * @return the boolean
     */
    public Boolean isSendReport() {
        return sendReport;
    }

    /**
     * Sets the send report.
     * 
     * @param value the new send report
     */
    public void setSendReport(Boolean value) {
        this.sendReport = value;
    }

    /**
     * Gets the attempt limit.
     * 
     * @return the attempt limit
     */
    public SetScheduledTest.AttemptLimit getAttemptLimit() {
        return attemptLimit;
    }

    /**
     * Sets the attempt limit.
     * 
     * @param value the new attempt limit
     */
    public void setAttemptLimit(SetScheduledTest.AttemptLimit value) {
        this.attemptLimit = value;
    }


    /**
     * The Class AttemptLimit.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "noLimit",
        "attemptTimes"
    })
    public static class AttemptLimit
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The no limit. */
        protected String noLimit;
        
        /** The attempt times. */
        protected Integer attemptTimes;

        /**
         * Gets the no limit.
         * 
         * @return the no limit
         */
        public String getNoLimit() {
            return noLimit;
        }

        /**
         * Sets the no limit.
         * 
         * @param value the new no limit
         */
        public void setNoLimit(String value) {
            this.noLimit = value;
        }

        /**
         * Gets the attempt times.
         * 
         * @return the attempt times
         */
        public Integer getAttemptTimes() {
            return attemptTimes;
        }

        /**
         * Sets the attempt times.
         * 
         * @param value the new attempt times
         */
        public void setAttemptTimes(Integer value) {
            this.attemptTimes = value;
        }

    }


    /**
     * The Class DeliveryMethod.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "session",
        "website"
    })
    public static class DeliveryMethod
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The session. */
        protected String session;
        
        /** The website. */
        protected WebSiteType website;

        /**
         * Gets the session.
         * 
         * @return the session
         */
        public String getSession() {
            return session;
        }

        /**
         * Sets the session.
         * 
         * @param value the new session
         */
        public void setSession(String value) {
            this.session = value;
        }

        /**
         * Gets the website.
         * 
         * @return the website
         */
        public WebSiteType getWebsite() {
            return website;
        }

        /**
         * Sets the website.
         * 
         * @param value the new website
         */
        public void setWebsite(WebSiteType value) {
            this.website = value;
        }

    }


    /**
     * The Class TimeLimit.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "noLimit",
        "withinMinutes"
    })
    public static class TimeLimit
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The no limit. */
        protected String noLimit;
        
        /** The within minutes. */
        protected Integer withinMinutes;

        /**
         * Gets the no limit.
         * 
         * @return the no limit
         */
        public String getNoLimit() {
            return noLimit;
        }

        /**
         * Sets the no limit.
         * 
         * @param value the new no limit
         */
        public void setNoLimit(String value) {
            this.noLimit = value;
        }

        /**
         * Gets the within minutes.
         * 
         * @return the within minutes
         */
        public Integer getWithinMinutes() {
            return withinMinutes;
        }

        /**
         * Sets the within minutes.
         * 
         * @param value the new within minutes
         */
        public void setWithinMinutes(Integer value) {
            this.withinMinutes = value;
        }

    }

}
