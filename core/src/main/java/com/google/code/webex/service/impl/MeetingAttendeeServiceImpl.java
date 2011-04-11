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
package com.google.code.webex.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.google.code.webex.service.MeetingAttendeeService;
import com.google.code.webex.service.util.ApplicationConstants;
import com.google.code.webex.service.util.WebExUrls;
import com.google.code.webex.service.util.WebExUrls.WebExUrlBuilder;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.MessageType;
import com.webex.schemas._2002._06.service.attendee.AttendeeEmailType;
import com.webex.schemas._2002._06.service.attendee.AttendeeInstanceType;
import com.webex.schemas._2002._06.service.attendee.CreateMeetingAttendee;
import com.webex.schemas._2002._06.service.attendee.CreateMeetingAttendeeResponse;
import com.webex.schemas._2002._06.service.attendee.DelMeetingAttendee;
import com.webex.schemas._2002._06.service.attendee.EnrollSessionType;
import com.webex.schemas._2002._06.service.attendee.GetEnrollmentInfo;
import com.webex.schemas._2002._06.service.attendee.GetEnrollmentInfoResponse;
import com.webex.schemas._2002._06.service.attendee.JoinStatusType;
import com.webex.schemas._2002._06.service.attendee.LstMeetingAttendee;
import com.webex.schemas._2002._06.service.attendee.LstMeetingAttendeeResponse;
import com.webex.schemas._2002._06.service.attendee.ObjectFactory;
import com.webex.schemas._2002._06.service.attendee.RegisterAttendeeType;
import com.webex.schemas._2002._06.service.attendee.RegisterMeetingAttendee;
import com.webex.schemas._2002._06.service.attendee.RegisterMeetingAttendeeResponse;
import com.webex.schemas._2002._06.service.attendee.RegisterMeetingAttendeeResponse.Register;

/**
 * The Class MeetingAttendeeServiceImpl.
 */
public class MeetingAttendeeServiceImpl extends WebExJaxbService implements
	MeetingAttendeeService {

	/**
	 * Instantiates a new meeting attendee service impl.
	 * 
	 * @param webExId the web ex id
	 * @param password the password
	 * @param siteId the site id
	 * @param siteName the site name
	 * @param partnerId the partner id
	 */
	public MeetingAttendeeServiceImpl(String webExId, String password,
			Long siteId, String siteName, String partnerId) {
		super(webExId, password, siteId, siteName, partnerId);
	}

	/* (non-Javadoc)
	 * @see com.google.code.webex.service.MeetingAttendeeService#createMeetingAttendee(com.webex.schemas._2002._06.service.attendee.CreateMeetingAttendee)
	 */
	@Override
	public CreateMeetingAttendeeResponse createMeetingAttendee(
			CreateMeetingAttendee attendee) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		
		MessageType request = createRequest(attendee);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((CreateMeetingAttendeeResponse) bodyContents.get(0));			
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see com.google.code.webex.service.MeetingAttendeeService#deleteMeetingAttendees(java.util.List, java.util.List, java.lang.Boolean)
	 */
	@Override
	public void deleteMeetingAttendees(List<Long> attendeeIDs,
			List<AttendeeEmailType> attendeeEmail, Boolean sendEmail) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		DelMeetingAttendee delMeetingAttendee = factory.createDelMeetingAttendee();
		delMeetingAttendee.getAttendeeID().addAll(attendeeIDs);
		delMeetingAttendee.getAttendeeEmail().addAll(attendeeEmail);
		delMeetingAttendee.setSendEmail(sendEmail);
		
		MessageType request = createRequest(delMeetingAttendee);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
		}
	}

	/* (non-Javadoc)
	 * @see com.google.code.webex.service.MeetingAttendeeService#getEnrollmentInformation(java.lang.Long, java.lang.Long)
	 */
	@Override
	public List<EnrollSessionType> getEnrollmentInformation(Long confID,
			Long sessionKey) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		GetEnrollmentInfo enrollmentInfo = factory.createGetEnrollmentInfo();
		enrollmentInfo.setConfID(confID);
		enrollmentInfo.setSessionKey(sessionKey);
		
		MessageType request = createRequest(enrollmentInfo);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((GetEnrollmentInfoResponse) bodyContents.get(0)).getSession();			
		}
		
		return new ArrayList<EnrollSessionType>();
	}

	/* (non-Javadoc)
	 * @see com.google.code.webex.service.MeetingAttendeeService#getMeetingAttendees(java.lang.Long, java.lang.Long, com.webex.schemas._2002._06.service.attendee.JoinStatusType, java.lang.Long, java.lang.Boolean)
	 */
	@Override
	public List<AttendeeInstanceType> getMeetingAttendees(Long meetingKey,
			Long sessionKey, JoinStatusType joinStatus, Long confID,
			Boolean inclHistory) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		LstMeetingAttendee attendee = factory.createLstMeetingAttendee();
		attendee.setMeetingKey(meetingKey);
		attendee.setJoinStatus(joinStatus);
		attendee.setConfID(confID);
		attendee.setSessionKey(sessionKey);
		attendee.setInclHistory(inclHistory);
		
		MessageType request = createRequest(attendee);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((LstMeetingAttendeeResponse) bodyContents.get(0)).getAttendee();			
		}
		
		return new ArrayList<AttendeeInstanceType>();
	}

	/* (non-Javadoc)
	 * @see com.google.code.webex.service.MeetingAttendeeService#registerMeetingAttendees(java.util.List)
	 */
	@Override
	public List<Register> registerMeetingAttendees(
			List<RegisterAttendeeType> attendees) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		RegisterMeetingAttendee attendee = factory.createRegisterMeetingAttendee();
		attendee.getAttendees().addAll(attendees);
		
		MessageType request = createRequest(attendee);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((RegisterMeetingAttendeeResponse) bodyContents.get(0)).getRegister();			
		}
		
		return new ArrayList<Register>();
	}
}
