
package com.webex.schemas._2002._06.service.attendee;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enrollAttendeeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="enrollAttendeeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attendeeID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="enrollFields" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="defaultFields" type="{http://www.webex.com/schemas/2002/06/service/attendee}enrollDefaultFieldsType" minOccurs="0"/>
 *                   &lt;element name="customFields" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="field" type="{http://www.webex.com/schemas/2002/06/service/attendee}fieldType" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="submitTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.webex.com/schemas/2002/06/service/attendee}attendeeEnrollStatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enrollAttendeeType", propOrder = {
    "attendeeID",
    "enrollFields",
    "domain",
    "ipAddress",
    "submitTime",
    "status"
})
public class EnrollAttendeeType {

    protected long attendeeID;
    protected EnrollAttendeeType.EnrollFields enrollFields;
    protected String domain;
    protected String ipAddress;
    protected String submitTime;
    protected AttendeeEnrollStatusType status;

    /**
     * Gets the value of the attendeeID property.
     * 
     */
    public long getAttendeeID() {
        return attendeeID;
    }

    /**
     * Sets the value of the attendeeID property.
     * 
     */
    public void setAttendeeID(long value) {
        this.attendeeID = value;
    }

    /**
     * Gets the value of the enrollFields property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollAttendeeType.EnrollFields }
     *     
     */
    public EnrollAttendeeType.EnrollFields getEnrollFields() {
        return enrollFields;
    }

    /**
     * Sets the value of the enrollFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollAttendeeType.EnrollFields }
     *     
     */
    public void setEnrollFields(EnrollAttendeeType.EnrollFields value) {
        this.enrollFields = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the submitTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitTime() {
        return submitTime;
    }

    /**
     * Sets the value of the submitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmitTime(String value) {
        this.submitTime = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AttendeeEnrollStatusType }
     *     
     */
    public AttendeeEnrollStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttendeeEnrollStatusType }
     *     
     */
    public void setStatus(AttendeeEnrollStatusType value) {
        this.status = value;
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
     *         &lt;element name="defaultFields" type="{http://www.webex.com/schemas/2002/06/service/attendee}enrollDefaultFieldsType" minOccurs="0"/>
     *         &lt;element name="customFields" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="field" type="{http://www.webex.com/schemas/2002/06/service/attendee}fieldType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
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
    @XmlType(name = "", propOrder = {
        "defaultFields",
        "customFields"
    })
    public static class EnrollFields {

        protected EnrollDefaultFieldsType defaultFields;
        protected EnrollAttendeeType.EnrollFields.CustomFields customFields;

        /**
         * Gets the value of the defaultFields property.
         * 
         * @return
         *     possible object is
         *     {@link EnrollDefaultFieldsType }
         *     
         */
        public EnrollDefaultFieldsType getDefaultFields() {
            return defaultFields;
        }

        /**
         * Sets the value of the defaultFields property.
         * 
         * @param value
         *     allowed object is
         *     {@link EnrollDefaultFieldsType }
         *     
         */
        public void setDefaultFields(EnrollDefaultFieldsType value) {
            this.defaultFields = value;
        }

        /**
         * Gets the value of the customFields property.
         * 
         * @return
         *     possible object is
         *     {@link EnrollAttendeeType.EnrollFields.CustomFields }
         *     
         */
        public EnrollAttendeeType.EnrollFields.CustomFields getCustomFields() {
            return customFields;
        }

        /**
         * Sets the value of the customFields property.
         * 
         * @param value
         *     allowed object is
         *     {@link EnrollAttendeeType.EnrollFields.CustomFields }
         *     
         */
        public void setCustomFields(EnrollAttendeeType.EnrollFields.CustomFields value) {
            this.customFields = value;
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
         *         &lt;element name="field" type="{http://www.webex.com/schemas/2002/06/service/attendee}fieldType" maxOccurs="unbounded" minOccurs="0"/>
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
            "field"
        })
        public static class CustomFields {

            protected List<FieldType> field;

            /**
             * Gets the value of the field property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the field property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getField().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FieldType }
             * 
             * 
             */
            public List<FieldType> getField() {
                if (field == null) {
                    field = new ArrayList<FieldType>();
                }
                return this.field;
            }

        }

    }

}
