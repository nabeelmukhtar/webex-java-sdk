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

import com.google.code.webex.service.HistoryService;
import com.google.code.webex.service.util.ApplicationConstants;
import com.google.code.webex.service.util.WebExUrls;
import com.google.code.webex.service.util.WebExUrls.WebExUrlBuilder;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.MessageType;
import com.webex.schemas._2002._06.service.history.EndTimeScopeType;
import com.webex.schemas._2002._06.service.history.EventAttendeeHistoryInstanceType;
import com.webex.schemas._2002._06.service.history.EventSessionHistoryInstanceType;
import com.webex.schemas._2002._06.service.history.LsteventattendeeHistory;
import com.webex.schemas._2002._06.service.history.LsteventattendeeHistoryResponse;
import com.webex.schemas._2002._06.service.history.LsteventsessionHistory;
import com.webex.schemas._2002._06.service.history.LsteventsessionHistoryResponse;
import com.webex.schemas._2002._06.service.history.LstmeetingattendeeHistory;
import com.webex.schemas._2002._06.service.history.LstmeetingattendeeHistoryResponse;
import com.webex.schemas._2002._06.service.history.MeetingAttendeeHistoryInstanceType;
import com.webex.schemas._2002._06.service.history.ObjectFactory;
import com.webex.schemas._2002._06.service.history.StartTimeScopeType;
import com.webex.schemas._2002._06.service.history.StartTimeValueType;

public class HistoryServiceImpl extends WebExJaxbService implements
		HistoryService {

	public HistoryServiceImpl(String webExId, String password,
			Long siteId, String siteName, String partnerId) {
		super(webExId, password, siteId, siteName, partnerId);
	}

	@Override
	public List<EventAttendeeHistoryInstanceType> getEventAttendeeHistory(
			StartTimeScopeType startTimeScope, EndTimeScopeType endTimeScope,
			Long sessionKey, String confName, Long confID, Boolean attendeeStats) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		LsteventattendeeHistory history = factory.createLsteventattendeeHistory();
		history.setStartTimeScope(startTimeScope);
		history.setEndTimeScope(endTimeScope);
		history.setSessionKey(sessionKey);
		history.setConfName(confName);
		history.setConfID(confID);
		history.setAttendeeStats(attendeeStats);
		
		MessageType request = createRequest(history);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((LsteventattendeeHistoryResponse) bodyContents.get(0)).getEventAttendeeHistory();			
		}
		
		return new ArrayList<EventAttendeeHistoryInstanceType>();
	}

	@Override
	public List<EventSessionHistoryInstanceType> getEventSessionHistory(
			String hostWebExID, String confName,
			StartTimeValueType startTimeScope, EndTimeScopeType endTimeScope,
			Long sessionKey, Long confID, Integer timeZoneID) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		LsteventsessionHistory history = factory.createLsteventsessionHistory();
		history.setStartTimeScope(startTimeScope);
		history.setEndTimeScope(endTimeScope);
		history.setSessionKey(sessionKey);
		history.setConfName(confName);
		history.setConfID(confID);
		history.setHostWebExID(hostWebExID);
		history.setTimeZoneID(timeZoneID);
		
		MessageType request = createRequest(history);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((LsteventsessionHistoryResponse) bodyContents.get(0)).getEventSessionHistory();			
		}
		
		return new ArrayList<EventSessionHistoryInstanceType>();
	}

	@Override
	public List<MeetingAttendeeHistoryInstanceType> getMeetingAttendeeHistory(
			Long meetingKey, StartTimeValueType startTimeScope,
			EndTimeScopeType endTimeScope, String confName, Long confID,
			Boolean inclAudioOnly) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		LstmeetingattendeeHistory history = factory.createLstmeetingattendeeHistory();
		history.setStartTimeScope(startTimeScope);
		history.setEndTimeScope(endTimeScope);
		history.setMeetingKey(meetingKey);
		history.setConfName(confName);
		history.setConfID(confID);
		history.setInclAudioOnly(inclAudioOnly);
		
		MessageType request = createRequest(history);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((LstmeetingattendeeHistoryResponse) bodyContents.get(0)).getMeetingAttendeeHistory();			
		}
		
		return new ArrayList<MeetingAttendeeHistoryInstanceType>();
	}
}
