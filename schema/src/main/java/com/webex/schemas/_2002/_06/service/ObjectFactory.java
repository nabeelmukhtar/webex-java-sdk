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

package com.webex.schemas._2002._06.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * A factory for creating Object objects.
 */
@XmlRegistry
public class ObjectFactory {

    /** The Constant _Message_QNAME. */
    private final static QName _Message_QNAME = new QName("http://www.webex.com/schemas/2002/06/service", "message");

    /**
     * Instantiates a new object factory.
     */
    public ObjectFactory() {
    }

    /**
     * Creates a new Object object.
     * 
     * @return the personal tele server type
     */
    public PersonalTeleServerType createPersonalTeleServerType() {
        return new PersonalTeleServerType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the body content type
     */
    public BodyContentType createBodyContentType() {
        return new BodyContentType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the global call in num type
     */
    public GlobalCallInNumType createGlobalCallInNumType() {
        return new GlobalCallInNumType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the response type
     */
    public ResponseType createResponseType() {
        return new ResponseType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the matching records type
     */
    public MatchingRecordsType createMatchingRecordsType() {
        return new MatchingRecordsType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the meeting assist type
     */
    public MeetingAssistType createMeetingAssistType() {
        return new MeetingAssistType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the tsp account type
     */
    public TspAccountType createTspAccountType() {
        return new TspAccountType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the body
     */
    public MessageType.Body createMessageTypeBody() {
        return new MessageType.Body();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the lst control type
     */
    public LstControlType createLstControlType() {
        return new LstControlType();
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
     * @return the call in num type
     */
    public CallInNumType createCallInNumType() {
        return new CallInNumType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the order type
     */
    public OrderType createOrderType() {
        return new OrderType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the sub errors
     */
    public ResponseType.SubErrors createResponseTypeSubErrors() {
        return new ResponseType.SubErrors();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the list control type
     */
    public ListControlType createListControlType() {
        return new ListControlType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the message type
     */
    public MessageType createMessageType() {
        return new MessageType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the header
     */
    public MessageType.Header createMessageTypeHeader() {
        return new MessageType.Header();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the security context type
     */
    public SecurityContextType createSecurityContextType() {
        return new SecurityContextType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the tsp account label type
     */
    public TspAccountLabelType createTspAccountLabelType() {
        return new TspAccountLabelType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the sub error type
     */
    public SubErrorType createSubErrorType() {
        return new SubErrorType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the i calendar url type
     */
    public ICalendarURLType createICalendarURLType() {
        return new ICalendarURLType();
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< message type>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service", name = "message")
    public JAXBElement<MessageType> createMessage(MessageType value) {
        return new JAXBElement<MessageType>(_Message_QNAME, MessageType.class, null, value);
    }

}
