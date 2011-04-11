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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class EmailTemplateType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "emailTemplateType", propOrder = {
    "subject",
    "from",
    "replyTo",
    "content"
})
@XmlSeeAlso({
    com.webex.schemas._2002._06.service.event.EmailTemplatesType.EnrollmentMsgs.PendingEmail.class,
    com.webex.schemas._2002._06.service.event.EmailTemplatesType.EnrollmentMsgs.AcceptedEmail.class,
    com.webex.schemas._2002._06.service.event.EmailTemplatesType.EnrollmentMsgs.RejectedEmail.class,
    com.webex.schemas._2002._06.service.event.EmailTemplatesType.EnrollmentMsgs.EventUpdatedEmail.class,
    com.webex.schemas._2002._06.service.event.EmailTemplatesType.ReminderMsgs.FirstReminder.class,
    com.webex.schemas._2002._06.service.event.EmailTemplatesType.ReminderMsgs.SecondReminder.class,
    com.webex.schemas._2002._06.service.event.EmailTemplatesType.FollowUpMsgs.ThanksForAttending.class,
    com.webex.schemas._2002._06.service.event.EmailTemplatesType.FollowUpMsgs.AbsenteeFollowUp.class
})
public class EmailTemplateType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The subject. */
    protected String subject;
    
    /** The from. */
    protected String from;
    
    /** The reply to. */
    protected String replyTo;
    
    /** The content. */
    protected String content;

    /**
     * Gets the subject.
     * 
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the subject.
     * 
     * @param value the new subject
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the from.
     * 
     * @return the from
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sets the from.
     * 
     * @param value the new from
     */
    public void setFrom(String value) {
        this.from = value;
    }

    /**
     * Gets the reply to.
     * 
     * @return the reply to
     */
    public String getReplyTo() {
        return replyTo;
    }

    /**
     * Sets the reply to.
     * 
     * @param value the new reply to
     */
    public void setReplyTo(String value) {
        this.replyTo = value;
    }

    /**
     * Gets the content.
     * 
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the content.
     * 
     * @param value the new content
     */
    public void setContent(String value) {
        this.content = value;
    }

}
