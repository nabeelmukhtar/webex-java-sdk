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

import com.google.code.webex.service.EventSessionService;
import com.google.code.webex.service.util.ApplicationConstants;
import com.google.code.webex.service.util.Base64;
import com.google.code.webex.service.util.WebExUrls;
import com.google.code.webex.service.util.WebExUrls.WebExUrlBuilder;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.MessageType;
import com.webex.schemas._2002._06.service.event.CreateEvent;
import com.webex.schemas._2002._06.service.event.CreateEventResponse;
import com.webex.schemas._2002._06.service.event.DateScopeType;
import com.webex.schemas._2002._06.service.event.DelEvent;
import com.webex.schemas._2002._06.service.event.EventSummaryInstanceType;
import com.webex.schemas._2002._06.service.event.GetEvent;
import com.webex.schemas._2002._06.service.event.GetEventResponse;
import com.webex.schemas._2002._06.service.event.ImageTypeType;
import com.webex.schemas._2002._06.service.event.LstrecordedEvent;
import com.webex.schemas._2002._06.service.event.LstrecordedEventResponse;
import com.webex.schemas._2002._06.service.event.LstsummaryEvent;
import com.webex.schemas._2002._06.service.event.LstsummaryEventResponse;
import com.webex.schemas._2002._06.service.event.LstsummaryProgram;
import com.webex.schemas._2002._06.service.event.LstsummaryProgramResponse;
import com.webex.schemas._2002._06.service.event.ObjectFactory;
import com.webex.schemas._2002._06.service.event.ProgramSummaryType;
import com.webex.schemas._2002._06.service.event.RecordedEventsType;
import com.webex.schemas._2002._06.service.event.SendInvitationEmail;
import com.webex.schemas._2002._06.service.event.SendInvitationEmailResponse;
import com.webex.schemas._2002._06.service.event.SetEvent;
import com.webex.schemas._2002._06.service.event.UploadEventImage;

public class EventSessionServiceImpl extends WebExJaxbService implements
		EventSessionService {

	public EventSessionServiceImpl(String webExId, String password,
			Long siteId, String siteName, String partnerId) {
		super(webExId, password, siteId, siteName, partnerId);
	}

	@Override
	public CreateEventResponse createEvent(CreateEvent event) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		MessageType request = createRequest(event);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((CreateEventResponse) bodyContents.get(0));			
		}
		
		return null;
	}

	@Override
	public void deleteEvent(long sessionKey) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		DelEvent deleteEvent = factory.createDelEvent();
		deleteEvent.setSessionKey(sessionKey);
		MessageType request = createRequest(deleteEvent);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
		}
	}

	@Override
	public GetEventResponse getEvent(long sessionKey) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		GetEvent getEvent = factory.createGetEvent();
		getEvent.setSessionKey(sessionKey);
		MessageType request = createRequest(getEvent);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((GetEventResponse) bodyContents.get(0));			
		}
		
		return null;
	}

	@Override
	public List<RecordedEventsType> getRecordedEvents(DateScopeType dateScope,
			String hostWebExID, Long programID) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		LstrecordedEvent recordedEvents = factory.createLstrecordedEvent();
		recordedEvents.setDateScope(dateScope);
		recordedEvents.setHostWebExID(hostWebExID);
		recordedEvents.setProgramID(programID);
		MessageType request = createRequest(recordedEvents);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((LstrecordedEventResponse) bodyContents.get(0)).getEvent();			
		}
		return new ArrayList<RecordedEventsType>();
	}

	@Override
	public List<EventSummaryInstanceType> getEventSummaries(
			DateScopeType dateScope, Long sessionKey, String hostWebExID,
			Long programID, Boolean attendeeStats) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		LstsummaryEvent recordedEvents = factory.createLstsummaryEvent();
		recordedEvents.setDateScope(dateScope);
		recordedEvents.setSessionKey(sessionKey);
		recordedEvents.setHostWebExID(hostWebExID);
		recordedEvents.setProgramID(programID);
		recordedEvents.setAttendeeStats(attendeeStats);
		MessageType request = createRequest(recordedEvents);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((LstsummaryEventResponse) bodyContents.get(0)).getEvent();			
		}
		return new ArrayList<EventSummaryInstanceType>();
	}

	@Override
	public List<ProgramSummaryType> getProgramSummaries(Long programID) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		LstsummaryProgram program = factory.createLstsummaryProgram();
		program.setProgramID(programID);
		MessageType request = createRequest(program);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((LstsummaryProgramResponse) bodyContents.get(0)).getProgram();			
		}
		return new ArrayList<ProgramSummaryType>();
	}

	@Override
	public List<String> sendInvitationEmails(long sessionKey,
			Boolean attendees, Boolean panelists) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		SendInvitationEmail invitationEmail = factory.createSendInvitationEmail();
		invitationEmail.setSessionKey(sessionKey);
		invitationEmail.setAttendees(attendees);
		invitationEmail.setPanelists(panelists);
		MessageType request = createRequest(invitationEmail);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((SendInvitationEmailResponse) bodyContents.get(0)).getDeliveredEmail();			
		}
		return new ArrayList<String>();
	}

	@Override
	public void setEvent(SetEvent event) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		MessageType request = createRequest(event);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
		}
	}

	@Override
	public void uploadEventImage(long sessionKey, ImageTypeType imageType,
			byte[] imageData) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		UploadEventImage uploadImage = factory.createUploadEventImage();
		uploadImage.setSessionKey(sessionKey);
		uploadImage.setImageType(imageType);
		uploadImage.setImageData(Base64.encodeBytesToBytes(imageData));
		MessageType request = createRequest(uploadImage);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
		}
	}
}
