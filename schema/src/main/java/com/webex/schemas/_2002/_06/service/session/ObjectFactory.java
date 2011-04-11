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
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webex.schemas._2002._06.service.session package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ParticipantsTypeParticipants_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/session", "participants");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webex.schemas._2002._06.service.session
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DateScopeType }
     * 
     */
    public DateScopeType createDateScopeType() {
        return new DateScopeType();
    }

    /**
     * Create an instance of {@link RemindType.Emails }
     * 
     */
    public RemindType.Emails createRemindTypeEmails() {
        return new RemindType.Emails();
    }

    /**
     * Create an instance of {@link ScheduleType }
     * 
     */
    public ScheduleType createScheduleType() {
        return new ScheduleType();
    }

    /**
     * Create an instance of {@link RemindType }
     * 
     */
    public RemindType createRemindType() {
        return new RemindType();
    }

    /**
     * Create an instance of {@link EnableOptionsType }
     * 
     */
    public EnableOptionsType createEnableOptionsType() {
        return new EnableOptionsType();
    }

    /**
     * Create an instance of {@link MetaDataType }
     * 
     */
    public MetaDataType createMetaDataType() {
        return new MetaDataType();
    }

    /**
     * Create an instance of {@link TelephonyType }
     * 
     */
    public TelephonyType createTelephonyType() {
        return new TelephonyType();
    }

    /**
     * Create an instance of {@link ParticipantsType.Participants }
     * 
     */
    public ParticipantsType.Participants createParticipantsTypeParticipants() {
        return new ParticipantsType.Participants();
    }

    /**
     * Create an instance of {@link AccessControlType }
     * 
     */
    public AccessControlType createAccessControlType() {
        return new AccessControlType();
    }

    /**
     * Create an instance of {@link SessionType }
     * 
     */
    public SessionType createSessionType() {
        return new SessionType();
    }

    /**
     * Create an instance of {@link ParticipantType }
     * 
     */
    public ParticipantType createParticipantType() {
        return new ParticipantType();
    }

    /**
     * Create an instance of {@link ParticipantsType }
     * 
     */
    public ParticipantsType createParticipantsType() {
        return new ParticipantsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParticipantsType.Participants }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/session", name = "participants", scope = ParticipantsType.class)
    public JAXBElement<ParticipantsType.Participants> createParticipantsTypeParticipants(ParticipantsType.Participants value) {
        return new JAXBElement<ParticipantsType.Participants>(_ParticipantsTypeParticipants_QNAME, ParticipantsType.Participants.class, ParticipantsType.class, value);
    }

}
