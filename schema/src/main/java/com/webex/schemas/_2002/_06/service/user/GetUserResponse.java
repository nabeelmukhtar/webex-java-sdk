
package com.webex.schemas._2002._06.service.user;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUserResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUserResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/user}userInstanceType">
 *       &lt;sequence>
 *         &lt;element name="salesCenter" type="{http://www.webex.com/schemas/2002/06/service/user}salesCenterInstanceType" minOccurs="0"/>
 *         &lt;element name="peExpired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="peActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="passwordExpires" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="passwordDaysLeft" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="schedulingTemplates" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sessionTemplate" type="{http://www.webex.com/schemas/2002/06/service/user}sessionTemplateSummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="serviceSessionTypes" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="scheduleFor" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="webExID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "getUserResponse", propOrder = {
    "salesCenter",
    "peExpired",
    "peActive",
    "passwordExpires",
    "passwordDaysLeft",
    "schedulingTemplates",
    "serviceSessionTypes",
    "scheduleFor"
})
public class GetUserResponse
    extends UserInstanceType
{

    protected SalesCenterInstanceType salesCenter;
    protected Boolean peExpired;
    protected Boolean peActive;
    protected Boolean passwordExpires;
    protected BigInteger passwordDaysLeft;
    protected GetUserResponse.SchedulingTemplates schedulingTemplates;
    protected List<GetUserResponse.ServiceSessionTypes> serviceSessionTypes;
    protected GetUserResponse.ScheduleFor scheduleFor;

    /**
     * Gets the value of the salesCenter property.
     * 
     * @return
     *     possible object is
     *     {@link SalesCenterInstanceType }
     *     
     */
    public SalesCenterInstanceType getSalesCenter() {
        return salesCenter;
    }

    /**
     * Sets the value of the salesCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesCenterInstanceType }
     *     
     */
    public void setSalesCenter(SalesCenterInstanceType value) {
        this.salesCenter = value;
    }

    /**
     * Gets the value of the peExpired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPeExpired() {
        return peExpired;
    }

    /**
     * Sets the value of the peExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPeExpired(Boolean value) {
        this.peExpired = value;
    }

    /**
     * Gets the value of the peActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPeActive() {
        return peActive;
    }

    /**
     * Sets the value of the peActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPeActive(Boolean value) {
        this.peActive = value;
    }

    /**
     * Gets the value of the passwordExpires property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPasswordExpires() {
        return passwordExpires;
    }

    /**
     * Sets the value of the passwordExpires property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPasswordExpires(Boolean value) {
        this.passwordExpires = value;
    }

    /**
     * Gets the value of the passwordDaysLeft property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPasswordDaysLeft() {
        return passwordDaysLeft;
    }

    /**
     * Sets the value of the passwordDaysLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPasswordDaysLeft(BigInteger value) {
        this.passwordDaysLeft = value;
    }

    /**
     * Gets the value of the schedulingTemplates property.
     * 
     * @return
     *     possible object is
     *     {@link GetUserResponse.SchedulingTemplates }
     *     
     */
    public GetUserResponse.SchedulingTemplates getSchedulingTemplates() {
        return schedulingTemplates;
    }

    /**
     * Sets the value of the schedulingTemplates property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetUserResponse.SchedulingTemplates }
     *     
     */
    public void setSchedulingTemplates(GetUserResponse.SchedulingTemplates value) {
        this.schedulingTemplates = value;
    }

    /**
     * Gets the value of the serviceSessionTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceSessionTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceSessionTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetUserResponse.ServiceSessionTypes }
     * 
     * 
     */
    public List<GetUserResponse.ServiceSessionTypes> getServiceSessionTypes() {
        if (serviceSessionTypes == null) {
            serviceSessionTypes = new ArrayList<GetUserResponse.ServiceSessionTypes>();
        }
        return this.serviceSessionTypes;
    }

    /**
     * Gets the value of the scheduleFor property.
     * 
     * @return
     *     possible object is
     *     {@link GetUserResponse.ScheduleFor }
     *     
     */
    public GetUserResponse.ScheduleFor getScheduleFor() {
        return scheduleFor;
    }

    /**
     * Sets the value of the scheduleFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetUserResponse.ScheduleFor }
     *     
     */
    public void setScheduleFor(GetUserResponse.ScheduleFor value) {
        this.scheduleFor = value;
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
     *         &lt;element name="webExID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "webExID"
    })
    public static class ScheduleFor {

        protected List<String> webExID;

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
     *         &lt;element name="sessionTemplate" type="{http://www.webex.com/schemas/2002/06/service/user}sessionTemplateSummaryType" maxOccurs="unbounded" minOccurs="0"/>
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
        "sessionTemplate"
    })
    public static class SchedulingTemplates {

        protected List<SessionTemplateSummaryType> sessionTemplate;

        /**
         * Gets the value of the sessionTemplate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sessionTemplate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSessionTemplate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SessionTemplateSummaryType }
         * 
         * 
         */
        public List<SessionTemplateSummaryType> getSessionTemplate() {
            if (sessionTemplate == null) {
                sessionTemplate = new ArrayList<SessionTemplateSummaryType>();
            }
            return this.sessionTemplate;
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
     *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "label",
        "value"
    })
    public static class ServiceSessionTypes {

        @XmlElement(required = true)
        protected String label;
        @XmlElement(required = true)
        protected String value;

        /**
         * Gets the value of the label property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLabel() {
            return label;
        }

        /**
         * Sets the value of the label property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLabel(String value) {
            this.label = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

    }

}
