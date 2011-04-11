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

package com.webex.schemas._2002._06.service.session;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * A factory for creating Object objects.
 */
@XmlRegistry
public class ObjectFactory {

    /** The Constant _ParticipantsTypeParticipants_QNAME. */
    private final static QName _ParticipantsTypeParticipants_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/session", "participants");

    /**
     * Instantiates a new object factory.
     */
    public ObjectFactory() {
    }

    /**
     * Creates a new Object object.
     * 
     * @return the remind type
     */
    public RemindType createRemindType() {
        return new RemindType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the meta data type
     */
    public MetaDataType createMetaDataType() {
        return new MetaDataType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the access control type
     */
    public AccessControlType createAccessControlType() {
        return new AccessControlType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the participant type
     */
    public ParticipantType createParticipantType() {
        return new ParticipantType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the enable options type
     */
    public EnableOptionsType createEnableOptionsType() {
        return new EnableOptionsType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the participants
     */
    public ParticipantsType.Participants createParticipantsTypeParticipants() {
        return new ParticipantsType.Participants();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the schedule type
     */
    public ScheduleType createScheduleType() {
        return new ScheduleType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the session type
     */
    public SessionType createSessionType() {
        return new SessionType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the emails
     */
    public RemindType.Emails createRemindTypeEmails() {
        return new RemindType.Emails();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the participants type
     */
    public ParticipantsType createParticipantsType() {
        return new ParticipantsType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the telephony type
     */
    public TelephonyType createTelephonyType() {
        return new TelephonyType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the date scope type
     */
    public DateScopeType createDateScopeType() {
        return new DateScopeType();
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< participants type. participants>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/session", name = "participants", scope = ParticipantsType.class)
    public JAXBElement<ParticipantsType.Participants> createParticipantsTypeParticipants(ParticipantsType.Participants value) {
        return new JAXBElement<ParticipantsType.Participants>(_ParticipantsTypeParticipants_QNAME, ParticipantsType.Participants.class, ParticipantsType.class, value);
    }

}
