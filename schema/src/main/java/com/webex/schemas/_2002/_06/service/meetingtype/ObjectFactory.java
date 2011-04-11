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

package com.webex.schemas._2002._06.service.meetingtype;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * A factory for creating Object objects.
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Instantiates a new object factory.
     */
    public ObjectFactory() {
    }

    /**
     * Creates a new Object object.
     * 
     * @return the service types
     */
    public MeetingTypeInstanceType.ServiceTypes createMeetingTypeInstanceTypeServiceTypes() {
        return new MeetingTypeInstanceType.ServiceTypes();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the lst meeting type
     */
    public LstMeetingType createLstMeetingType() {
        return new LstMeetingType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the gets the meeting type response
     */
    public GetMeetingTypeResponse createGetMeetingTypeResponse() {
        return new GetMeetingTypeResponse();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the options type
     */
    public OptionsType createOptionsType() {
        return new OptionsType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the gets the meeting type
     */
    public GetMeetingType createGetMeetingType() {
        return new GetMeetingType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the limits type
     */
    public LimitsType createLimitsType() {
        return new LimitsType();
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
     * @return the meeting type instance type
     */
    public MeetingTypeInstanceType createMeetingTypeInstanceType() {
        return new MeetingTypeInstanceType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the meeting type type ext
     */
    public MeetingTypeTypeExt createMeetingTypeTypeExt() {
        return new MeetingTypeTypeExt();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the phone numbers type
     */
    public PhoneNumbersType createPhoneNumbersType() {
        return new PhoneNumbersType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the lst meeting type response
     */
    public LstMeetingTypeResponse createLstMeetingTypeResponse() {
        return new LstMeetingTypeResponse();
    }

}
