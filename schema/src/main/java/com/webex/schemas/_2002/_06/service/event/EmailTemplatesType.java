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

package com.webex.schemas._2002._06.service.event;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class EmailTemplatesType.
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
public class EmailTemplatesType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The format. */
    @XmlElement(defaultValue = "TEXT")
    protected FormatType format;
    
    /** The invitation msgs. */
    protected EmailTemplatesType.InvitationMsgs invitationMsgs;
    
    /** The enrollment msgs. */
    protected EmailTemplatesType.EnrollmentMsgs enrollmentMsgs;
    
    /** The reminder msgs. */
    protected EmailTemplatesType.ReminderMsgs reminderMsgs;
    
    /** The follow up msgs. */
    protected EmailTemplatesType.FollowUpMsgs followUpMsgs;
    
    /** The i calendar. */
    protected Boolean iCalendar;

    /**
     * Gets the format.
     * 
     * @return the format
     */
    public FormatType getFormat() {
        return format;
    }

    /**
     * Sets the format.
     * 
     * @param value the new format
     */
    public void setFormat(FormatType value) {
        this.format = value;
    }

    /**
     * Gets the invitation msgs.
     * 
     * @return the invitation msgs
     */
    public EmailTemplatesType.InvitationMsgs getInvitationMsgs() {
        return invitationMsgs;
    }

    /**
     * Sets the invitation msgs.
     * 
     * @param value the new invitation msgs
     */
    public void setInvitationMsgs(EmailTemplatesType.InvitationMsgs value) {
        this.invitationMsgs = value;
    }

    /**
     * Gets the enrollment msgs.
     * 
     * @return the enrollment msgs
     */
    public EmailTemplatesType.EnrollmentMsgs getEnrollmentMsgs() {
        return enrollmentMsgs;
    }

    /**
     * Sets the enrollment msgs.
     * 
     * @param value the new enrollment msgs
     */
    public void setEnrollmentMsgs(EmailTemplatesType.EnrollmentMsgs value) {
        this.enrollmentMsgs = value;
    }

    /**
     * Gets the reminder msgs.
     * 
     * @return the reminder msgs
     */
    public EmailTemplatesType.ReminderMsgs getReminderMsgs() {
        return reminderMsgs;
    }

    /**
     * Sets the reminder msgs.
     * 
     * @param value the new reminder msgs
     */
    public void setReminderMsgs(EmailTemplatesType.ReminderMsgs value) {
        this.reminderMsgs = value;
    }

    /**
     * Gets the follow up msgs.
     * 
     * @return the follow up msgs
     */
    public EmailTemplatesType.FollowUpMsgs getFollowUpMsgs() {
        return followUpMsgs;
    }

    /**
     * Sets the follow up msgs.
     * 
     * @param value the new follow up msgs
     */
    public void setFollowUpMsgs(EmailTemplatesType.FollowUpMsgs value) {
        this.followUpMsgs = value;
    }

    /**
     * Checks if is i calendar.
     * 
     * @return the boolean
     */
    public Boolean isICalendar() {
        return iCalendar;
    }

    /**
     * Sets the i calendar.
     * 
     * @param value the new i calendar
     */
    public void setICalendar(Boolean value) {
        this.iCalendar = value;
    }


    /**
     * The Class EnrollmentMsgs.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pendingEmail",
        "acceptedEmail",
        "rejectedEmail",
        "eventUpdatedEmail"
    })
    public static class EnrollmentMsgs
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The pending email. */
        protected EmailTemplatesType.EnrollmentMsgs.PendingEmail pendingEmail;
        
        /** The accepted email. */
        protected EmailTemplatesType.EnrollmentMsgs.AcceptedEmail acceptedEmail;
        
        /** The rejected email. */
        protected EmailTemplatesType.EnrollmentMsgs.RejectedEmail rejectedEmail;
        
        /** The event updated email. */
        protected EmailTemplatesType.EnrollmentMsgs.EventUpdatedEmail eventUpdatedEmail;

        /**
         * Gets the pending email.
         * 
         * @return the pending email
         */
        public EmailTemplatesType.EnrollmentMsgs.PendingEmail getPendingEmail() {
            return pendingEmail;
        }

        /**
         * Sets the pending email.
         * 
         * @param value the new pending email
         */
        public void setPendingEmail(EmailTemplatesType.EnrollmentMsgs.PendingEmail value) {
            this.pendingEmail = value;
        }

        /**
         * Gets the accepted email.
         * 
         * @return the accepted email
         */
        public EmailTemplatesType.EnrollmentMsgs.AcceptedEmail getAcceptedEmail() {
            return acceptedEmail;
        }

        /**
         * Sets the accepted email.
         * 
         * @param value the new accepted email
         */
        public void setAcceptedEmail(EmailTemplatesType.EnrollmentMsgs.AcceptedEmail value) {
            this.acceptedEmail = value;
        }

        /**
         * Gets the rejected email.
         * 
         * @return the rejected email
         */
        public EmailTemplatesType.EnrollmentMsgs.RejectedEmail getRejectedEmail() {
            return rejectedEmail;
        }

        /**
         * Sets the rejected email.
         * 
         * @param value the new rejected email
         */
        public void setRejectedEmail(EmailTemplatesType.EnrollmentMsgs.RejectedEmail value) {
            this.rejectedEmail = value;
        }

        /**
         * Gets the event updated email.
         * 
         * @return the event updated email
         */
        public EmailTemplatesType.EnrollmentMsgs.EventUpdatedEmail getEventUpdatedEmail() {
            return eventUpdatedEmail;
        }

        /**
         * Sets the event updated email.
         * 
         * @param value the new event updated email
         */
        public void setEventUpdatedEmail(EmailTemplatesType.EnrollmentMsgs.EventUpdatedEmail value) {
            this.eventUpdatedEmail = value;
        }


        /**
         * The Class AcceptedEmail.
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "send"
        })
        public static class AcceptedEmail
            extends EmailTemplateType
            implements Serializable
        {

            /** The Constant serialVersionUID. */
            private final static long serialVersionUID = 2461660169443089969L;
            
            /** The send. */
            @XmlElement(defaultValue = "true")
            protected Boolean send;

            /**
             * Checks if is send.
             * 
             * @return the boolean
             */
            public Boolean isSend() {
                return send;
            }

            /**
             * Sets the send.
             * 
             * @param value the new send
             */
            public void setSend(Boolean value) {
                this.send = value;
            }

        }


        /**
         * The Class EventUpdatedEmail.
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class EventUpdatedEmail
            extends EmailTemplateType
            implements Serializable
        {

            /** The Constant serialVersionUID. */
            private final static long serialVersionUID = 2461660169443089969L;

        }


        /**
         * The Class PendingEmail.
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "send"
        })
        public static class PendingEmail
            extends EmailTemplateType
            implements Serializable
        {

            /** The Constant serialVersionUID. */
            private final static long serialVersionUID = 2461660169443089969L;
            
            /** The send. */
            @XmlElement(defaultValue = "true")
            protected Boolean send;

            /**
             * Checks if is send.
             * 
             * @return the boolean
             */
            public Boolean isSend() {
                return send;
            }

            /**
             * Sets the send.
             * 
             * @param value the new send
             */
            public void setSend(Boolean value) {
                this.send = value;
            }

        }


        /**
         * The Class RejectedEmail.
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "send"
        })
        public static class RejectedEmail
            extends EmailTemplateType
            implements Serializable
        {

            /** The Constant serialVersionUID. */
            private final static long serialVersionUID = 2461660169443089969L;
            
            /** The send. */
            @XmlElement(defaultValue = "true")
            protected Boolean send;

            /**
             * Checks if is send.
             * 
             * @return the boolean
             */
            public Boolean isSend() {
                return send;
            }

            /**
             * Sets the send.
             * 
             * @param value the new send
             */
            public void setSend(Boolean value) {
                this.send = value;
            }

        }

    }


    /**
     * The Class FollowUpMsgs.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "thanksForAttending",
        "absenteeFollowUp"
    })
    public static class FollowUpMsgs
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The thanks for attending. */
        protected EmailTemplatesType.FollowUpMsgs.ThanksForAttending thanksForAttending;
        
        /** The absentee follow up. */
        protected EmailTemplatesType.FollowUpMsgs.AbsenteeFollowUp absenteeFollowUp;

        /**
         * Gets the thanks for attending.
         * 
         * @return the thanks for attending
         */
        public EmailTemplatesType.FollowUpMsgs.ThanksForAttending getThanksForAttending() {
            return thanksForAttending;
        }

        /**
         * Sets the thanks for attending.
         * 
         * @param value the new thanks for attending
         */
        public void setThanksForAttending(EmailTemplatesType.FollowUpMsgs.ThanksForAttending value) {
            this.thanksForAttending = value;
        }

        /**
         * Gets the absentee follow up.
         * 
         * @return the absentee follow up
         */
        public EmailTemplatesType.FollowUpMsgs.AbsenteeFollowUp getAbsenteeFollowUp() {
            return absenteeFollowUp;
        }

        /**
         * Sets the absentee follow up.
         * 
         * @param value the new absentee follow up
         */
        public void setAbsenteeFollowUp(EmailTemplatesType.FollowUpMsgs.AbsenteeFollowUp value) {
            this.absenteeFollowUp = value;
        }


        /**
         * The Class AbsenteeFollowUp.
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "send",
            "sendDateTime"
        })
        public static class AbsenteeFollowUp
            extends EmailTemplateType
            implements Serializable
        {

            /** The Constant serialVersionUID. */
            private final static long serialVersionUID = 2461660169443089969L;
            
            /** The send. */
            @XmlElement(defaultValue = "true")
            protected Boolean send;
            
            /** The send date time. */
            protected String sendDateTime;

            /**
             * Checks if is send.
             * 
             * @return the boolean
             */
            public Boolean isSend() {
                return send;
            }

            /**
             * Sets the send.
             * 
             * @param value the new send
             */
            public void setSend(Boolean value) {
                this.send = value;
            }

            /**
             * Gets the send date time.
             * 
             * @return the send date time
             */
            public String getSendDateTime() {
                return sendDateTime;
            }

            /**
             * Sets the send date time.
             * 
             * @param value the new send date time
             */
            public void setSendDateTime(String value) {
                this.sendDateTime = value;
            }

        }


        /**
         * The Class ThanksForAttending.
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "send",
            "sendDateTime"
        })
        public static class ThanksForAttending
            extends EmailTemplateType
            implements Serializable
        {

            /** The Constant serialVersionUID. */
            private final static long serialVersionUID = 2461660169443089969L;
            
            /** The send. */
            protected Boolean send;
            
            /** The send date time. */
            protected String sendDateTime;

            /**
             * Checks if is send.
             * 
             * @return the boolean
             */
            public Boolean isSend() {
                return send;
            }

            /**
             * Sets the send.
             * 
             * @param value the new send
             */
            public void setSend(Boolean value) {
                this.send = value;
            }

            /**
             * Gets the send date time.
             * 
             * @return the send date time
             */
            public String getSendDateTime() {
                return sendDateTime;
            }

            /**
             * Sets the send date time.
             * 
             * @param value the new send date time
             */
            public void setSendDateTime(String value) {
                this.sendDateTime = value;
            }

        }

    }


    /**
     * The Class InvitationMsgs.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "participantsEmail",
        "panelistsEmail"
    })
    public static class InvitationMsgs
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The participants email. */
        protected EmailTemplateType participantsEmail;
        
        /** The panelists email. */
        protected EmailTemplateType panelistsEmail;

        /**
         * Gets the participants email.
         * 
         * @return the participants email
         */
        public EmailTemplateType getParticipantsEmail() {
            return participantsEmail;
        }

        /**
         * Sets the participants email.
         * 
         * @param value the new participants email
         */
        public void setParticipantsEmail(EmailTemplateType value) {
            this.participantsEmail = value;
        }

        /**
         * Gets the panelists email.
         * 
         * @return the panelists email
         */
        public EmailTemplateType getPanelistsEmail() {
            return panelistsEmail;
        }

        /**
         * Sets the panelists email.
         * 
         * @param value the new panelists email
         */
        public void setPanelistsEmail(EmailTemplateType value) {
            this.panelistsEmail = value;
        }

    }


    /**
     * The Class ReminderMsgs.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "firstReminder",
        "secondReminder"
    })
    public static class ReminderMsgs
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The first reminder. */
        protected EmailTemplatesType.ReminderMsgs.FirstReminder firstReminder;
        
        /** The second reminder. */
        protected EmailTemplatesType.ReminderMsgs.SecondReminder secondReminder;

        /**
         * Gets the first reminder.
         * 
         * @return the first reminder
         */
        public EmailTemplatesType.ReminderMsgs.FirstReminder getFirstReminder() {
            return firstReminder;
        }

        /**
         * Sets the first reminder.
         * 
         * @param value the new first reminder
         */
        public void setFirstReminder(EmailTemplatesType.ReminderMsgs.FirstReminder value) {
            this.firstReminder = value;
        }

        /**
         * Gets the second reminder.
         * 
         * @return the second reminder
         */
        public EmailTemplatesType.ReminderMsgs.SecondReminder getSecondReminder() {
            return secondReminder;
        }

        /**
         * Sets the second reminder.
         * 
         * @param value the new second reminder
         */
        public void setSecondReminder(EmailTemplatesType.ReminderMsgs.SecondReminder value) {
            this.secondReminder = value;
        }


        /**
         * The Class FirstReminder.
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "send",
            "sendDateTime"
        })
        public static class FirstReminder
            extends EmailTemplateType
            implements Serializable
        {

            /** The Constant serialVersionUID. */
            private final static long serialVersionUID = 2461660169443089969L;
            
            /** The send. */
            protected Boolean send;
            
            /** The send date time. */
            protected String sendDateTime;

            /**
             * Checks if is send.
             * 
             * @return the boolean
             */
            public Boolean isSend() {
                return send;
            }

            /**
             * Sets the send.
             * 
             * @param value the new send
             */
            public void setSend(Boolean value) {
                this.send = value;
            }

            /**
             * Gets the send date time.
             * 
             * @return the send date time
             */
            public String getSendDateTime() {
                return sendDateTime;
            }

            /**
             * Sets the send date time.
             * 
             * @param value the new send date time
             */
            public void setSendDateTime(String value) {
                this.sendDateTime = value;
            }

        }


        /**
         * The Class SecondReminder.
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "send",
            "sendDateTime"
        })
        public static class SecondReminder
            extends EmailTemplateType
            implements Serializable
        {

            /** The Constant serialVersionUID. */
            private final static long serialVersionUID = 2461660169443089969L;
            
            /** The send. */
            protected Boolean send;
            
            /** The send date time. */
            protected String sendDateTime;

            /**
             * Checks if is send.
             * 
             * @return the boolean
             */
            public Boolean isSend() {
                return send;
            }

            /**
             * Sets the send.
             * 
             * @param value the new send
             */
            public void setSend(Boolean value) {
                this.send = value;
            }

            /**
             * Gets the send date time.
             * 
             * @return the send date time
             */
            public String getSendDateTime() {
                return sendDateTime;
            }

            /**
             * Sets the send date time.
             * 
             * @param value the new send date time
             */
            public void setSendDateTime(String value) {
                this.sendDateTime = value;
            }

        }

    }

}
