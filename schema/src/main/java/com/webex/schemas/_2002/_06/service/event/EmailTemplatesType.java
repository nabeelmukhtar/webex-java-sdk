
package com.webex.schemas._2002._06.service.event;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for emailTemplatesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="emailTemplatesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="format" type="{http://www.webex.com/schemas/2002/06/service/event}formatType" minOccurs="0"/>
 *         &lt;element name="invitationMsgs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="participantsEmail" type="{http://www.webex.com/schemas/2002/06/service/event}emailTemplateType" minOccurs="0"/>
 *                   &lt;element name="panelistsEmail" type="{http://www.webex.com/schemas/2002/06/service/event}emailTemplateType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="enrollmentMsgs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="pendingEmail" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.webex.com/schemas/2002/06/service/event}emailTemplateType">
 *                           &lt;sequence>
 *                             &lt;element name="send" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="acceptedEmail" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.webex.com/schemas/2002/06/service/event}emailTemplateType">
 *                           &lt;sequence>
 *                             &lt;element name="send" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="rejectedEmail" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.webex.com/schemas/2002/06/service/event}emailTemplateType">
 *                           &lt;sequence>
 *                             &lt;element name="send" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="eventUpdatedEmail" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.webex.com/schemas/2002/06/service/event}emailTemplateType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="reminderMsgs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="firstReminder" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.webex.com/schemas/2002/06/service/event}emailTemplateType">
 *                           &lt;sequence>
 *                             &lt;element name="send" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="sendDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="secondReminder" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.webex.com/schemas/2002/06/service/event}emailTemplateType">
 *                           &lt;sequence>
 *                             &lt;element name="send" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="sendDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="followUpMsgs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="thanksForAttending" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.webex.com/schemas/2002/06/service/event}emailTemplateType">
 *                           &lt;sequence>
 *                             &lt;element name="send" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="sendDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="absenteeFollowUp" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.webex.com/schemas/2002/06/service/event}emailTemplateType">
 *                           &lt;sequence>
 *                             &lt;element name="send" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="sendDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="iCalendar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "emailTemplatesType", propOrder = {
    "format",
    "invitationMsgs",
    "enrollmentMsgs",
    "reminderMsgs",
    "followUpMsgs",
    "iCalendar"
})
public class EmailTemplatesType {

    @XmlElement(defaultValue = "TEXT")
    protected FormatType format;
    protected EmailTemplatesType.InvitationMsgs invitationMsgs;
    protected EmailTemplatesType.EnrollmentMsgs enrollmentMsgs;
    protected EmailTemplatesType.ReminderMsgs reminderMsgs;
    protected EmailTemplatesType.FollowUpMsgs followUpMsgs;
    protected Boolean iCalendar;

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link FormatType }
     *     
     */
    public FormatType getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormatType }
     *     
     */
    public void setFormat(FormatType value) {
        this.format = value;
    }

    /**
     * Gets the value of the invitationMsgs property.
     * 
     * @return
     *     possible object is
     *     {@link EmailTemplatesType.InvitationMsgs }
     *     
     */
    public EmailTemplatesType.InvitationMsgs getInvitationMsgs() {
        return invitationMsgs;
    }

    /**
     * Sets the value of the invitationMsgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailTemplatesType.InvitationMsgs }
     *     
     */
    public void setInvitationMsgs(EmailTemplatesType.InvitationMsgs value) {
        this.invitationMsgs = value;
    }

    /**
     * Gets the value of the enrollmentMsgs property.
     * 
     * @return
     *     possible object is
     *     {@link EmailTemplatesType.EnrollmentMsgs }
     *     
     */
    public EmailTemplatesType.EnrollmentMsgs getEnrollmentMsgs() {
        return enrollmentMsgs;
    }

    /**
     * Sets the value of the enrollmentMsgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailTemplatesType.EnrollmentMsgs }
     *     
     */
    public void setEnrollmentMsgs(EmailTemplatesType.EnrollmentMsgs value) {
        this.enrollmentMsgs = value;
    }

    /**
     * Gets the value of the reminderMsgs property.
     * 
     * @return
     *     possible object is
     *     {@link EmailTemplatesType.ReminderMsgs }
     *     
     */
    public EmailTemplatesType.ReminderMsgs getReminderMsgs() {
        return reminderMsgs;
    }

    /**
     * Sets the value of the reminderMsgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailTemplatesType.ReminderMsgs }
     *     
     */
    public void setReminderMsgs(EmailTemplatesType.ReminderMsgs value) {
        this.reminderMsgs = value;
    }

    /**
     * Gets the value of the followUpMsgs property.
     * 
     * @return
     *     possible object is
     *     {@link EmailTemplatesType.FollowUpMsgs }
     *     
     */
    public EmailTemplatesType.FollowUpMsgs getFollowUpMsgs() {
        return followUpMsgs;
    }

    /**
     * Sets the value of the followUpMsgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailTemplatesType.FollowUpMsgs }
     *     
     */
    public void setFollowUpMsgs(EmailTemplatesType.FollowUpMsgs value) {
        this.followUpMsgs = value;
    }

    /**
     * Gets the value of the iCalendar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isICalendar() {
        return iCalendar;
    }

    /**
     * Sets the value of the iCalendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setICalendar(Boolean value) {
        this.iCalendar = value;
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
     *         &lt;element name="pendingEmail" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.webex.com/schemas/2002/06/service/event}emailTemplateType">
     *                 &lt;sequence>
     *                   &lt;element name="send" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="acceptedEmail" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.webex.com/schemas/2002/06/service/event}emailTemplateType">
     *                 &lt;sequence>
     *                   &lt;element name="send" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="rejectedEmail" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.webex.com/schemas/2002/06/service/event}emailTemplateType">
     *                 &lt;sequence>
     *                   &lt;element name="send" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="eventUpdatedEmail" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.webex.com/schemas/2002/06/service/event}emailTemplateType">
     *               &lt;/extension>
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
        "pendingEmail",
        "acceptedEmail",
        "rejectedEmail",
        "eventUpdatedEmail"
    })
    public static class EnrollmentMsgs {

        protected EmailTemplatesType.EnrollmentMsgs.PendingEmail pendingEmail;
        protected EmailTemplatesType.EnrollmentMsgs.AcceptedEmail acceptedEmail;
        protected EmailTemplatesType.EnrollmentMsgs.RejectedEmail rejectedEmail;
        protected EmailTemplatesType.EnrollmentMsgs.EventUpdatedEmail eventUpdatedEmail;

        /**
         * Gets the value of the pendingEmail property.
         * 
         * @return
         *     possible object is
         *     {@link EmailTemplatesType.EnrollmentMsgs.PendingEmail }
         *     
         */
        public EmailTemplatesType.EnrollmentMsgs.PendingEmail getPendingEmail() {
            return pendingEmail;
        }

        /**
         * Sets the value of the pendingEmail property.
         * 
         * @param value
         *     allowed object is
         *     {@link EmailTemplatesType.EnrollmentMsgs.PendingEmail }
         *     
         */
        public void setPendingEmail(EmailTemplatesType.EnrollmentMsgs.PendingEmail value) {
            this.pendingEmail = value;
        }

        /**
         * Gets the value of the acceptedEmail property.
         * 
         * @return
         *     possible object is
         *     {@link EmailTemplatesType.EnrollmentMsgs.AcceptedEmail }
         *     
         */
        public EmailTemplatesType.EnrollmentMsgs.AcceptedEmail getAcceptedEmail() {
            return acceptedEmail;
        }

        /**
         * Sets the value of the acceptedEmail property.
         * 
         * @param value
         *     allowed object is
         *     {@link EmailTemplatesType.EnrollmentMsgs.AcceptedEmail }
         *     
         */
        public void setAcceptedEmail(EmailTemplatesType.EnrollmentMsgs.AcceptedEmail value) {
            this.acceptedEmail = value;
        }

        /**
         * Gets the value of the rejectedEmail property.
         * 
         * @return
         *     possible object is
         *     {@link EmailTemplatesType.EnrollmentMsgs.RejectedEmail }
         *     
         */
        public EmailTemplatesType.EnrollmentMsgs.RejectedEmail getRejectedEmail() {
            return rejectedEmail;
        }

        /**
         * Sets the value of the rejectedEmail property.
         * 
         * @param value
         *     allowed object is
         *     {@link EmailTemplatesType.EnrollmentMsgs.RejectedEmail }
         *     
         */
        public void setRejectedEmail(EmailTemplatesType.EnrollmentMsgs.RejectedEmail value) {
            this.rejectedEmail = value;
        }

        /**
         * Gets the value of the eventUpdatedEmail property.
         * 
         * @return
         *     possible object is
         *     {@link EmailTemplatesType.EnrollmentMsgs.EventUpdatedEmail }
         *     
         */
        public EmailTemplatesType.EnrollmentMsgs.EventUpdatedEmail getEventUpdatedEmail() {
            return eventUpdatedEmail;
        }

        /**
         * Sets the value of the eventUpdatedEmail property.
         * 
         * @param value
         *     allowed object is
         *     {@link EmailTemplatesType.EnrollmentMsgs.EventUpdatedEmail }
         *     
         */
        public void setEventUpdatedEmail(EmailTemplatesType.EnrollmentMsgs.EventUpdatedEmail value) {
            this.eventUpdatedEmail = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/event}emailTemplateType">
         *       &lt;sequence>
         *         &lt;element name="send" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "send"
        })
        public static class AcceptedEmail
            extends EmailTemplateType
        {

            @XmlElement(defaultValue = "true")
            protected Boolean send;

            /**
             * Gets the value of the send property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSend() {
                return send;
            }

            /**
             * Sets the value of the send property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSend(Boolean value) {
                this.send = value;
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
         *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/event}emailTemplateType">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class EventUpdatedEmail
            extends EmailTemplateType
        {


        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/event}emailTemplateType">
         *       &lt;sequence>
         *         &lt;element name="send" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "send"
        })
        public static class PendingEmail
            extends EmailTemplateType
        {

            @XmlElement(defaultValue = "true")
            protected Boolean send;

            /**
             * Gets the value of the send property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSend() {
                return send;
            }

            /**
             * Sets the value of the send property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSend(Boolean value) {
                this.send = value;
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
         *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/event}emailTemplateType">
         *       &lt;sequence>
         *         &lt;element name="send" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "send"
        })
        public static class RejectedEmail
            extends EmailTemplateType
        {

            @XmlElement(defaultValue = "true")
            protected Boolean send;

            /**
             * Gets the value of the send property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSend() {
                return send;
            }

            /**
             * Sets the value of the send property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSend(Boolean value) {
                this.send = value;
            }

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
     *         &lt;element name="thanksForAttending" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.webex.com/schemas/2002/06/service/event}emailTemplateType">
     *                 &lt;sequence>
     *                   &lt;element name="send" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="sendDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="absenteeFollowUp" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.webex.com/schemas/2002/06/service/event}emailTemplateType">
     *                 &lt;sequence>
     *                   &lt;element name="send" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="sendDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
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
        "thanksForAttending",
        "absenteeFollowUp"
    })
    public static class FollowUpMsgs {

        protected EmailTemplatesType.FollowUpMsgs.ThanksForAttending thanksForAttending;
        protected EmailTemplatesType.FollowUpMsgs.AbsenteeFollowUp absenteeFollowUp;

        /**
         * Gets the value of the thanksForAttending property.
         * 
         * @return
         *     possible object is
         *     {@link EmailTemplatesType.FollowUpMsgs.ThanksForAttending }
         *     
         */
        public EmailTemplatesType.FollowUpMsgs.ThanksForAttending getThanksForAttending() {
            return thanksForAttending;
        }

        /**
         * Sets the value of the thanksForAttending property.
         * 
         * @param value
         *     allowed object is
         *     {@link EmailTemplatesType.FollowUpMsgs.ThanksForAttending }
         *     
         */
        public void setThanksForAttending(EmailTemplatesType.FollowUpMsgs.ThanksForAttending value) {
            this.thanksForAttending = value;
        }

        /**
         * Gets the value of the absenteeFollowUp property.
         * 
         * @return
         *     possible object is
         *     {@link EmailTemplatesType.FollowUpMsgs.AbsenteeFollowUp }
         *     
         */
        public EmailTemplatesType.FollowUpMsgs.AbsenteeFollowUp getAbsenteeFollowUp() {
            return absenteeFollowUp;
        }

        /**
         * Sets the value of the absenteeFollowUp property.
         * 
         * @param value
         *     allowed object is
         *     {@link EmailTemplatesType.FollowUpMsgs.AbsenteeFollowUp }
         *     
         */
        public void setAbsenteeFollowUp(EmailTemplatesType.FollowUpMsgs.AbsenteeFollowUp value) {
            this.absenteeFollowUp = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/event}emailTemplateType">
         *       &lt;sequence>
         *         &lt;element name="send" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="sendDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "send",
            "sendDateTime"
        })
        public static class AbsenteeFollowUp
            extends EmailTemplateType
        {

            @XmlElement(defaultValue = "true")
            protected Boolean send;
            protected String sendDateTime;

            /**
             * Gets the value of the send property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSend() {
                return send;
            }

            /**
             * Sets the value of the send property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSend(Boolean value) {
                this.send = value;
            }

            /**
             * Gets the value of the sendDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSendDateTime() {
                return sendDateTime;
            }

            /**
             * Sets the value of the sendDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSendDateTime(String value) {
                this.sendDateTime = value;
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
         *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/event}emailTemplateType">
         *       &lt;sequence>
         *         &lt;element name="send" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="sendDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "send",
            "sendDateTime"
        })
        public static class ThanksForAttending
            extends EmailTemplateType
        {

            protected Boolean send;
            protected String sendDateTime;

            /**
             * Gets the value of the send property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSend() {
                return send;
            }

            /**
             * Sets the value of the send property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSend(Boolean value) {
                this.send = value;
            }

            /**
             * Gets the value of the sendDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSendDateTime() {
                return sendDateTime;
            }

            /**
             * Sets the value of the sendDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSendDateTime(String value) {
                this.sendDateTime = value;
            }

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
     *         &lt;element name="participantsEmail" type="{http://www.webex.com/schemas/2002/06/service/event}emailTemplateType" minOccurs="0"/>
     *         &lt;element name="panelistsEmail" type="{http://www.webex.com/schemas/2002/06/service/event}emailTemplateType" minOccurs="0"/>
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
        "participantsEmail",
        "panelistsEmail"
    })
    public static class InvitationMsgs {

        protected EmailTemplateType participantsEmail;
        protected EmailTemplateType panelistsEmail;

        /**
         * Gets the value of the participantsEmail property.
         * 
         * @return
         *     possible object is
         *     {@link EmailTemplateType }
         *     
         */
        public EmailTemplateType getParticipantsEmail() {
            return participantsEmail;
        }

        /**
         * Sets the value of the participantsEmail property.
         * 
         * @param value
         *     allowed object is
         *     {@link EmailTemplateType }
         *     
         */
        public void setParticipantsEmail(EmailTemplateType value) {
            this.participantsEmail = value;
        }

        /**
         * Gets the value of the panelistsEmail property.
         * 
         * @return
         *     possible object is
         *     {@link EmailTemplateType }
         *     
         */
        public EmailTemplateType getPanelistsEmail() {
            return panelistsEmail;
        }

        /**
         * Sets the value of the panelistsEmail property.
         * 
         * @param value
         *     allowed object is
         *     {@link EmailTemplateType }
         *     
         */
        public void setPanelistsEmail(EmailTemplateType value) {
            this.panelistsEmail = value;
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
     *         &lt;element name="firstReminder" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.webex.com/schemas/2002/06/service/event}emailTemplateType">
     *                 &lt;sequence>
     *                   &lt;element name="send" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="sendDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="secondReminder" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.webex.com/schemas/2002/06/service/event}emailTemplateType">
     *                 &lt;sequence>
     *                   &lt;element name="send" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="sendDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
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
        "firstReminder",
        "secondReminder"
    })
    public static class ReminderMsgs {

        protected EmailTemplatesType.ReminderMsgs.FirstReminder firstReminder;
        protected EmailTemplatesType.ReminderMsgs.SecondReminder secondReminder;

        /**
         * Gets the value of the firstReminder property.
         * 
         * @return
         *     possible object is
         *     {@link EmailTemplatesType.ReminderMsgs.FirstReminder }
         *     
         */
        public EmailTemplatesType.ReminderMsgs.FirstReminder getFirstReminder() {
            return firstReminder;
        }

        /**
         * Sets the value of the firstReminder property.
         * 
         * @param value
         *     allowed object is
         *     {@link EmailTemplatesType.ReminderMsgs.FirstReminder }
         *     
         */
        public void setFirstReminder(EmailTemplatesType.ReminderMsgs.FirstReminder value) {
            this.firstReminder = value;
        }

        /**
         * Gets the value of the secondReminder property.
         * 
         * @return
         *     possible object is
         *     {@link EmailTemplatesType.ReminderMsgs.SecondReminder }
         *     
         */
        public EmailTemplatesType.ReminderMsgs.SecondReminder getSecondReminder() {
            return secondReminder;
        }

        /**
         * Sets the value of the secondReminder property.
         * 
         * @param value
         *     allowed object is
         *     {@link EmailTemplatesType.ReminderMsgs.SecondReminder }
         *     
         */
        public void setSecondReminder(EmailTemplatesType.ReminderMsgs.SecondReminder value) {
            this.secondReminder = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/event}emailTemplateType">
         *       &lt;sequence>
         *         &lt;element name="send" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="sendDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "send",
            "sendDateTime"
        })
        public static class FirstReminder
            extends EmailTemplateType
        {

            protected Boolean send;
            protected String sendDateTime;

            /**
             * Gets the value of the send property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSend() {
                return send;
            }

            /**
             * Sets the value of the send property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSend(Boolean value) {
                this.send = value;
            }

            /**
             * Gets the value of the sendDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSendDateTime() {
                return sendDateTime;
            }

            /**
             * Sets the value of the sendDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSendDateTime(String value) {
                this.sendDateTime = value;
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
         *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/event}emailTemplateType">
         *       &lt;sequence>
         *         &lt;element name="send" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="sendDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "send",
            "sendDateTime"
        })
        public static class SecondReminder
            extends EmailTemplateType
        {

            protected Boolean send;
            protected String sendDateTime;

            /**
             * Gets the value of the send property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSend() {
                return send;
            }

            /**
             * Sets the value of the send property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSend(Boolean value) {
                this.send = value;
            }

            /**
             * Gets the value of the sendDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSendDateTime() {
                return sendDateTime;
            }

            /**
             * Sets the value of the sendDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSendDateTime(String value) {
                this.sendDateTime = value;
            }

        }

    }

}
