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
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webex.schemas._2002._06.service package. 
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

    private final static QName _Message_QNAME = new QName("http://www.webex.com/schemas/2002/06/service", "message");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webex.schemas._2002._06.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PersonalTeleServerType }
     * 
     */
    public PersonalTeleServerType createPersonalTeleServerType() {
        return new PersonalTeleServerType();
    }

    /**
     * Create an instance of {@link BodyContentType }
     * 
     */
    public BodyContentType createBodyContentType() {
        return new BodyContentType();
    }

    /**
     * Create an instance of {@link GlobalCallInNumType }
     * 
     */
    public GlobalCallInNumType createGlobalCallInNumType() {
        return new GlobalCallInNumType();
    }

    /**
     * Create an instance of {@link ResponseType }
     * 
     */
    public ResponseType createResponseType() {
        return new ResponseType();
    }

    /**
     * Create an instance of {@link MatchingRecordsType }
     * 
     */
    public MatchingRecordsType createMatchingRecordsType() {
        return new MatchingRecordsType();
    }

    /**
     * Create an instance of {@link MeetingAssistType }
     * 
     */
    public MeetingAssistType createMeetingAssistType() {
        return new MeetingAssistType();
    }

    /**
     * Create an instance of {@link TspAccountType }
     * 
     */
    public TspAccountType createTspAccountType() {
        return new TspAccountType();
    }

    /**
     * Create an instance of {@link MessageType.Body }
     * 
     */
    public MessageType.Body createMessageTypeBody() {
        return new MessageType.Body();
    }

    /**
     * Create an instance of {@link LstControlType }
     * 
     */
    public LstControlType createLstControlType() {
        return new LstControlType();
    }

    /**
     * Create an instance of {@link DateScopeType }
     * 
     */
    public DateScopeType createDateScopeType() {
        return new DateScopeType();
    }

    /**
     * Create an instance of {@link CallInNumType }
     * 
     */
    public CallInNumType createCallInNumType() {
        return new CallInNumType();
    }

    /**
     * Create an instance of {@link OrderType }
     * 
     */
    public OrderType createOrderType() {
        return new OrderType();
    }

    /**
     * Create an instance of {@link ResponseType.SubErrors }
     * 
     */
    public ResponseType.SubErrors createResponseTypeSubErrors() {
        return new ResponseType.SubErrors();
    }

    /**
     * Create an instance of {@link ListControlType }
     * 
     */
    public ListControlType createListControlType() {
        return new ListControlType();
    }

    /**
     * Create an instance of {@link MessageType }
     * 
     */
    public MessageType createMessageType() {
        return new MessageType();
    }

    /**
     * Create an instance of {@link MessageType.Header }
     * 
     */
    public MessageType.Header createMessageTypeHeader() {
        return new MessageType.Header();
    }

    /**
     * Create an instance of {@link SecurityContextType }
     * 
     */
    public SecurityContextType createSecurityContextType() {
        return new SecurityContextType();
    }

    /**
     * Create an instance of {@link TspAccountLabelType }
     * 
     */
    public TspAccountLabelType createTspAccountLabelType() {
        return new TspAccountLabelType();
    }

    /**
     * Create an instance of {@link SubErrorType }
     * 
     */
    public SubErrorType createSubErrorType() {
        return new SubErrorType();
    }

    /**
     * Create an instance of {@link ICalendarURLType }
     * 
     */
    public ICalendarURLType createICalendarURLType() {
        return new ICalendarURLType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service", name = "message")
    public JAXBElement<MessageType> createMessage(MessageType value) {
        return new JAXBElement<MessageType>(_Message_QNAME, MessageType.class, null, value);
    }

}
