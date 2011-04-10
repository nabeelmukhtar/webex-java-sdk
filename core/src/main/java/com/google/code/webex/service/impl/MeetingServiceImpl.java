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

import com.google.code.webex.service.MeetingService;
import com.google.code.webex.service.util.ApplicationConstants;
import com.google.code.webex.service.util.WebExUrls;
import com.google.code.webex.service.util.WebExUrls.WebExUrlBuilder;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.ICalendarURLType;
import com.webex.schemas._2002._06.service.LstControlType;
import com.webex.schemas._2002._06.service.MessageType;
import com.webex.schemas._2002._06.service.meeting.CreateMeeting;
import com.webex.schemas._2002._06.service.meeting.CreateMeetingResponse;
import com.webex.schemas._2002._06.service.meeting.DelMeeting;
import com.webex.schemas._2002._06.service.meeting.DelMeetingResponse;
import com.webex.schemas._2002._06.service.meeting.GetMeeting;
import com.webex.schemas._2002._06.service.meeting.GetMeetingResponse;
import com.webex.schemas._2002._06.service.meeting.GethosturlMeeting;
import com.webex.schemas._2002._06.service.meeting.GethosturlMeetingResponse;
import com.webex.schemas._2002._06.service.meeting.GetjoinurlMeeting;
import com.webex.schemas._2002._06.service.meeting.GetjoinurlMeetingResponse;
import com.webex.schemas._2002._06.service.meeting.LstsummaryMeeting;
import com.webex.schemas._2002._06.service.meeting.LstsummaryMeetingResponse;
import com.webex.schemas._2002._06.service.meeting.MeetingSummaryInstanceType;
import com.webex.schemas._2002._06.service.meeting.ObjectFactory;
import com.webex.schemas._2002._06.service.meeting.OrderByType;
import com.webex.schemas._2002._06.service.meeting.OrderType;
import com.webex.schemas._2002._06.service.meeting.SetMeeting;
import com.webex.schemas._2002._06.service.meeting.SetMeetingResponse;
import com.webex.schemas._2002._06.service.meeting.auo.CreateTeleconferenceSession;
import com.webex.schemas._2002._06.service.meeting.auo.CreateTeleconferenceSessionResponse;
import com.webex.schemas._2002._06.service.meeting.auo.GetTeleconferenceSession;
import com.webex.schemas._2002._06.service.meeting.auo.GetTeleconferenceSessionResponse;
import com.webex.schemas._2002._06.service.meeting.auo.SetTeleconferenceSession;

public class MeetingServiceImpl extends WebExJaxbService implements
	MeetingService {

	public MeetingServiceImpl(String webExId, String password,
			Long siteId, String siteName, String partnerId) {
		super(webExId, password, siteId, siteName, partnerId);
	}

	@Override
	public List<MeetingSummaryInstanceType> getMeetingSummaries() {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		LstsummaryMeeting summaryMeeting = factory.createLstsummaryMeeting();
		LstControlType listControl = new com.webex.schemas._2002._06.service.ObjectFactory().createLstControlType();
		summaryMeeting.setListControl(listControl);
		listControl.setMaximumNum(5L);
		OrderType order = factory.createOrderType();
		summaryMeeting.setOrder(order);
		order.getOrderBy().add(OrderByType.STARTTIME);
		
		MessageType request = createRequest(summaryMeeting);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((LstsummaryMeetingResponse) bodyContents.get(0)).getMeeting();			
		}
		return new ArrayList<MeetingSummaryInstanceType>();
	}

	@Override
	public CreateMeetingResponse createMeeting(CreateMeeting meeting) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		MessageType request = createRequest(meeting);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((CreateMeetingResponse) bodyContents.get(0));			
		}
		return null;
	}

	@Override
	public Long createTeleconferenceSession(
			CreateTeleconferenceSession teleconference) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		MessageType request = createRequest(teleconference);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((CreateTeleconferenceSessionResponse) bodyContents.get(0)).getSessionKey();			
		}
		return null;
	}

	@Override
	public ICalendarURLType deleteMeeting(long meetingKey) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		DelMeeting delMeeting = factory.createDelMeeting();
		delMeeting.setMeetingKey(meetingKey);
		MessageType request = createRequest(delMeeting);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((DelMeetingResponse) bodyContents.get(0)).getICalendarURL();			
		}
		return null;
	}

	@Override
	public String getMeetingHostUrl(Long meetingKey, Long sessionKey) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		GethosturlMeeting getHostUrl = factory.createGethosturlMeeting();
		getHostUrl.setSessionKey(sessionKey);
		getHostUrl.setMeetingKey(meetingKey);
		MessageType request = createRequest(getHostUrl);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((GethosturlMeetingResponse) bodyContents.get(0)).getHostMeetingURL();			
		}
		return null;
	}

	@Override
	public GetjoinurlMeetingResponse getMeetingJoinUrl(Long meetingKey,
			Long sessionKey, String attendeeName, String attendeeEmail,
			String meetingPW, String regID) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		GetjoinurlMeeting getJoinUrl = factory.createGetjoinurlMeeting();
		getJoinUrl.setSessionKey(sessionKey);
		getJoinUrl.setMeetingKey(meetingKey);
		getJoinUrl.setAttendeeName(attendeeName);
		getJoinUrl.setAttendeeEmail(attendeeEmail);
		getJoinUrl.setMeetingPW(meetingPW);
		getJoinUrl.setRegID(regID);
		MessageType request = createRequest(getJoinUrl);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((GetjoinurlMeetingResponse) bodyContents.get(0));			
		}
		return null;
	}

	@Override
	public GetMeetingResponse getMeeting(Long meetingKey) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		GetMeeting getMeeting = factory.createGetMeeting();
		getMeeting.setMeetingKey(meetingKey);
		MessageType request = createRequest(getMeeting);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((GetMeetingResponse) bodyContents.get(0));			
		}
		return null;
	}

	@Override
	public GetTeleconferenceSessionResponse getTeleconferenceSession(
			Long sessionKey) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		com.webex.schemas._2002._06.service.meeting.auo.ObjectFactory factory = new com.webex.schemas._2002._06.service.meeting.auo.ObjectFactory();
		GetTeleconferenceSession getTeleconferenceSession = factory.createGetTeleconferenceSession();
		getTeleconferenceSession.setSessionKey(sessionKey);
		MessageType request = createRequest(getTeleconferenceSession);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((GetTeleconferenceSessionResponse) bodyContents.get(0));			
		}
		return null;
	}

	@Override
	public ICalendarURLType setMeeting(SetMeeting setMeeting) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		MessageType request = createRequest(setMeeting);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((SetMeetingResponse) bodyContents.get(0)).getICalendarURL();			
		}
		return null;
	}

	@Override
	public void setTeleconferenceSession(SetTeleconferenceSession setSession) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		MessageType request = createRequest(setSession);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
		}
	}
}
