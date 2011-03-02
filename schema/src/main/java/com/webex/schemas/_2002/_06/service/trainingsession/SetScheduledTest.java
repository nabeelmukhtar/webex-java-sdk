
package com.webex.schemas._2002._06.service.trainingsession;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for setScheduledTest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setScheduledTest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="sessionKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="testID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="deliveryMethod">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="session">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="true|TRUE"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="website" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}webSiteType"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="timeLimit">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="noLimit">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="true|TRUE"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="withinMinutes">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                         &lt;minInclusive value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="sendReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="attemptLimit">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="noLimit">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="true|TRUE"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="attemptTimes">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                         &lt;minInclusive value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/choice>
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
{

    protected long sessionKey;
    protected long testID;
    @XmlElement(required = true)
    protected SetScheduledTest.DeliveryMethod deliveryMethod;
    @XmlElement(required = true)
    protected SetScheduledTest.TimeLimit timeLimit;
    protected Boolean sendReport;
    @XmlElement(required = true)
    protected SetScheduledTest.AttemptLimit attemptLimit;

    /**
     * Gets the value of the sessionKey property.
     * 
     */
    public long getSessionKey() {
        return sessionKey;
    }

    /**
     * Sets the value of the sessionKey property.
     * 
     */
    public void setSessionKey(long value) {
        this.sessionKey = value;
    }

    /**
     * Gets the value of the testID property.
     * 
     */
    public long getTestID() {
        return testID;
    }

    /**
     * Sets the value of the testID property.
     * 
     */
    public void setTestID(long value) {
        this.testID = value;
    }

    /**
     * Gets the value of the deliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link SetScheduledTest.DeliveryMethod }
     *     
     */
    public SetScheduledTest.DeliveryMethod getDeliveryMethod() {
        return deliveryMethod;
    }

    /**
     * Sets the value of the deliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetScheduledTest.DeliveryMethod }
     *     
     */
    public void setDeliveryMethod(SetScheduledTest.DeliveryMethod value) {
        this.deliveryMethod = value;
    }

    /**
     * Gets the value of the timeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link SetScheduledTest.TimeLimit }
     *     
     */
    public SetScheduledTest.TimeLimit getTimeLimit() {
        return timeLimit;
    }

    /**
     * Sets the value of the timeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetScheduledTest.TimeLimit }
     *     
     */
    public void setTimeLimit(SetScheduledTest.TimeLimit value) {
        this.timeLimit = value;
    }

    /**
     * Gets the value of the sendReport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendReport() {
        return sendReport;
    }

    /**
     * Sets the value of the sendReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendReport(Boolean value) {
        this.sendReport = value;
    }

    /**
     * Gets the value of the attemptLimit property.
     * 
     * @return
     *     possible object is
     *     {@link SetScheduledTest.AttemptLimit }
     *     
     */
    public SetScheduledTest.AttemptLimit getAttemptLimit() {
        return attemptLimit;
    }

    /**
     * Sets the value of the attemptLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetScheduledTest.AttemptLimit }
     *     
     */
    public void setAttemptLimit(SetScheduledTest.AttemptLimit value) {
        this.attemptLimit = value;
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
     *       &lt;choice>
     *         &lt;element name="noLimit">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="true|TRUE"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="attemptTimes">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *               &lt;minInclusive value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "noLimit",
        "attemptTimes"
    })
    public static class AttemptLimit {

        protected String noLimit;
        protected Integer attemptTimes;

        /**
         * Gets the value of the noLimit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNoLimit() {
            return noLimit;
        }

        /**
         * Sets the value of the noLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNoLimit(String value) {
            this.noLimit = value;
        }

        /**
         * Gets the value of the attemptTimes property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getAttemptTimes() {
            return attemptTimes;
        }

        /**
         * Sets the value of the attemptTimes property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setAttemptTimes(Integer value) {
            this.attemptTimes = value;
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
     *       &lt;choice>
     *         &lt;element name="session">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="true|TRUE"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="website" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}webSiteType"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "session",
        "website"
    })
    public static class DeliveryMethod {

        protected String session;
        protected WebSiteType website;

        /**
         * Gets the value of the session property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSession() {
            return session;
        }

        /**
         * Sets the value of the session property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSession(String value) {
            this.session = value;
        }

        /**
         * Gets the value of the website property.
         * 
         * @return
         *     possible object is
         *     {@link WebSiteType }
         *     
         */
        public WebSiteType getWebsite() {
            return website;
        }

        /**
         * Sets the value of the website property.
         * 
         * @param value
         *     allowed object is
         *     {@link WebSiteType }
         *     
         */
        public void setWebsite(WebSiteType value) {
            this.website = value;
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
     *       &lt;choice>
     *         &lt;element name="noLimit">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="true|TRUE"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="withinMinutes">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *               &lt;minInclusive value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "noLimit",
        "withinMinutes"
    })
    public static class TimeLimit {

        protected String noLimit;
        protected Integer withinMinutes;

        /**
         * Gets the value of the noLimit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNoLimit() {
            return noLimit;
        }

        /**
         * Sets the value of the noLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNoLimit(String value) {
            this.noLimit = value;
        }

        /**
         * Gets the value of the withinMinutes property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getWithinMinutes() {
            return withinMinutes;
        }

        /**
         * Sets the value of the withinMinutes property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setWithinMinutes(Integer value) {
            this.withinMinutes = value;
        }

    }

}
