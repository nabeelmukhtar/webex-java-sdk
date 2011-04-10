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
import com.webex.schemas._2002._06.common.PsoFieldsType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.MessageType;
import com.webex.schemas._2002._06.service.history.CreationTimeScopeType;
import com.webex.schemas._2002._06.service.history.EndTimeScopeType;
import com.webex.schemas._2002._06.service.history.EventAttendeeHistoryInstanceType;
import com.webex.schemas._2002._06.service.history.EventSessionHistoryInstanceType;
import com.webex.schemas._2002._06.service.history.LsteventattendeeHistory;
import com.webex.schemas._2002._06.service.history.LsteventattendeeHistoryResponse;
import com.webex.schemas._2002._06.service.history.LsteventsessionHistory;
import com.webex.schemas._2002._06.service.history.LsteventsessionHistoryResponse;
import com.webex.schemas._2002._06.service.history.LstmeetingattendeeHistory;
import com.webex.schemas._2002._06.service.history.LstmeetingattendeeHistoryResponse;
import com.webex.schemas._2002._06.service.history.LstmeetingusageHistory;
import com.webex.schemas._2002._06.service.history.LstmeetingusageHistoryResponse;
import com.webex.schemas._2002._06.service.history.LstrecordaccessDetailHistory;
import com.webex.schemas._2002._06.service.history.LstrecordaccessDetailHistoryResponse;
import com.webex.schemas._2002._06.service.history.LstrecordaccessHistory;
import com.webex.schemas._2002._06.service.history.LstrecordaccessHistoryResponse;
import com.webex.schemas._2002._06.service.history.LstsalesAttendeeHistory;
import com.webex.schemas._2002._06.service.history.LstsalesAttendeeHistoryResponse;
import com.webex.schemas._2002._06.service.history.LstsalesSessionHistory;
import com.webex.schemas._2002._06.service.history.LstsalesSessionHistoryResponse;
import com.webex.schemas._2002._06.service.history.LstsupportattendeeHistory;
import com.webex.schemas._2002._06.service.history.LstsupportattendeeHistoryResponse;
import com.webex.schemas._2002._06.service.history.LstsupportsessionHistory;
import com.webex.schemas._2002._06.service.history.LstsupportsessionHistoryResponse;
import com.webex.schemas._2002._06.service.history.LsttrainingattendeeHistory;
import com.webex.schemas._2002._06.service.history.LsttrainingattendeeHistoryResponse;
import com.webex.schemas._2002._06.service.history.LsttrainingsessionHistory;
import com.webex.schemas._2002._06.service.history.LsttrainingsessionHistoryResponse;
import com.webex.schemas._2002._06.service.history.MeetingAttendeeHistoryInstanceType;
import com.webex.schemas._2002._06.service.history.MeetingUsageHistoryInstanceType;
import com.webex.schemas._2002._06.service.history.ObjectFactory;
import com.webex.schemas._2002._06.service.history.RecordAccessDetailHistoryType;
import com.webex.schemas._2002._06.service.history.RecordAccessHistoryInstanceType;
import com.webex.schemas._2002._06.service.history.SalesAttendeeHistoryInstanceType;
import com.webex.schemas._2002._06.service.history.SalesSessionHistoryInstanceType;
import com.webex.schemas._2002._06.service.history.StartTimeScopeType;
import com.webex.schemas._2002._06.service.history.StartTimeValueType;
import com.webex.schemas._2002._06.service.history.SupportAttendeeHistoryInstanceType;
import com.webex.schemas._2002._06.service.history.SupportSessionHistoryInstanceType;
import com.webex.schemas._2002._06.service.history.TrainSessionHistoryInstanceType;
import com.webex.schemas._2002._06.service.history.TrainingAttendeeHistoryInstanceType;
import com.webex.schemas._2002._06.service.history.ViewTimeScopeType;

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

	@Override
	public List<MeetingUsageHistoryInstanceType> getMeetingUsageHistory(
			String confName, Long meetingKey, String hostWebExID, Long confID,
			Boolean inclAudioOnly, Integer timeZoneID,
			StartTimeScopeType startTimeScope, EndTimeScopeType endTimeScope) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		LstmeetingusageHistory history = factory.createLstmeetingusageHistory();
		history.setStartTimeScope(startTimeScope);
		history.setEndTimeScope(endTimeScope);
		history.setMeetingKey(meetingKey);
		history.setConfName(confName);
		history.setConfID(confID);
		history.setInclAudioOnly(inclAudioOnly);
		history.setHostWebExID(hostWebExID);
		history.setTimeZoneID(timeZoneID);
		
		MessageType request = createRequest(history);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((LstmeetingusageHistoryResponse) bodyContents.get(0)).getMeetingUsageHistory();			
		}
		
		return new ArrayList<MeetingUsageHistoryInstanceType>();
	}

	@Override
	public List<RecordAccessDetailHistoryType> getRecordAccessDetailHistory(
			Long recordID, Integer timeZoneID, Boolean returnRegFields) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		LstrecordaccessDetailHistory history = factory.createLstrecordaccessDetailHistory();
		history.setRecordID(recordID);
		history.setTimeZoneID(timeZoneID);
		history.setReturnRegFields(returnRegFields);
		
		MessageType request = createRequest(history);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((LstrecordaccessDetailHistoryResponse) bodyContents.get(0)).getRecordDetail();			
		}
		
		return new ArrayList<RecordAccessDetailHistoryType>();
	}

	@Override
	public List<RecordAccessHistoryInstanceType> getRecordAccessHistory(
			CreationTimeScopeType creationTimeScope,
			ViewTimeScopeType viewTimeScope, Integer timeZoneID,
			String recordName, String hostWebExID) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		LstrecordaccessHistory history = factory.createLstrecordaccessHistory();
		history.setCreationTimeScope(creationTimeScope);
		history.setViewTimeScope(viewTimeScope);
		history.setTimeZoneID(timeZoneID);
		history.setRecordName(recordName);
		history.setHostWebExID(hostWebExID);
		
		MessageType request = createRequest(history);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((LstrecordaccessHistoryResponse) bodyContents.get(0)).getRecordAccessHistory();			
		}
		
		return new ArrayList<RecordAccessHistoryInstanceType>();
	}

	@Override
	public List<SalesAttendeeHistoryInstanceType> getSalesAttendeeHistory(
			Long meetingKey, StartTimeValueType startTimeScope,
			EndTimeScopeType endTimeScope, String confName, Long confID,
			Long timeZoneID, Boolean inclAudioOnly) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		LstsalesAttendeeHistory history = factory.createLstsalesAttendeeHistory();
		history.setStartTimeScope(startTimeScope);
		history.setEndTimeScope(endTimeScope);
		history.setMeetingKey(meetingKey);
		history.setConfName(confName);
		history.setConfID(confID);
		history.setInclAudioOnly(inclAudioOnly);
		history.setTimeZoneID(timeZoneID);
		
		MessageType request = createRequest(history);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((LstsalesAttendeeHistoryResponse) bodyContents.get(0)).getSalesAttendeeHistory();			
		}
		
		return new ArrayList<SalesAttendeeHistoryInstanceType>();
	}

	@Override
	public List<SalesSessionHistoryInstanceType> getSalesSessionHistory(
			String confName, Long meetingKey, String hostWebExID, Long confID,
			Boolean inclAudioOnly, Integer timeZoneID,
			StartTimeScopeType startTimeScope, EndTimeScopeType endTimeScope,
			String account, String opportunity) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		LstsalesSessionHistory history = factory.createLstsalesSessionHistory();
		history.setStartTimeScope(startTimeScope);
		history.setEndTimeScope(endTimeScope);
		history.setMeetingKey(meetingKey);
		history.setConfName(confName);
		history.setConfID(confID);
		history.setInclAudioOnly(inclAudioOnly);
		history.setHostWebExID(hostWebExID);
		history.setTimeZoneID(timeZoneID);
		history.setAccount(account);
		history.setOpportunity(opportunity);
		
		MessageType request = createRequest(history);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((LstsalesSessionHistoryResponse) bodyContents.get(0)).getSalesSessionHistory();			
		}
		
		return new ArrayList<SalesSessionHistoryInstanceType>();
	}

	@Override
	public List<SupportAttendeeHistoryInstanceType> getSupportAttendeeHistory(
			Long sessionKey, StartTimeScopeType startTimeScope,
			EndTimeScopeType endTimeScope, Long confID) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		LstsupportattendeeHistory history = factory.createLstsupportattendeeHistory();
		history.setSessionKey(sessionKey);
		history.setStartTimeScope(startTimeScope);
		history.setEndTimeScope(endTimeScope);
		history.setConfID(confID);
		
		MessageType request = createRequest(history);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((LstsupportattendeeHistoryResponse) bodyContents.get(0)).getSupportAttendeeHistory();			
		}
		
		return new ArrayList<SupportAttendeeHistoryInstanceType>();
	}

	@Override
	public List<SupportSessionHistoryInstanceType> getSupportSessionHistory(
			Long sessionKey, String hostWebExID,
			StartTimeValueType startTimeScope, EndTimeScopeType endTimeScope,
			Long confID, Integer timeZoneID) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		LstsupportsessionHistory history = factory.createLstsupportsessionHistory();
		history.setSessionKey(sessionKey);
		history.setHostWebExID(hostWebExID);
		history.setStartTimeScope(startTimeScope);
		history.setEndTimeScope(endTimeScope);
		history.setConfID(confID);
		history.setTimeZoneID(timeZoneID);
		
		MessageType request = createRequest(history);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((LstsupportsessionHistoryResponse) bodyContents.get(0)).getSupportSessionHistory();			
		}
		
		return new ArrayList<SupportSessionHistoryInstanceType>();
	}

	@Override
	public List<TrainingAttendeeHistoryInstanceType> getTrainingAttendeeHistory(
			Long sessionKey, StartTimeScopeType startTimeScope,
			EndTimeScopeType endTimeScope, Long confID, Integer timeZoneID) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		LsttrainingattendeeHistory history = factory.createLsttrainingattendeeHistory();
		history.setSessionKey(sessionKey);
		history.setStartTimeScope(startTimeScope);
		history.setEndTimeScope(endTimeScope);
		history.setConfID(confID);
		history.setTimeZoneID(timeZoneID);
		
		MessageType request = createRequest(history);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((LsttrainingattendeeHistoryResponse) bodyContents.get(0)).getTrainingAttendeeHistory();			
		}
		
		return new ArrayList<TrainingAttendeeHistoryInstanceType>();
	}

	@Override
	public List<TrainSessionHistoryInstanceType> getTrainingSessionHistory(
			Long sessionKey, String confName,
			StartTimeScopeType startTimeScope, EndTimeScopeType endTimeScope,
			String hostWebExID, Long confID, Integer timeZoneID,
			Boolean returnPSOFields, PsoFieldsType psoFields) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		LsttrainingsessionHistory history = factory.createLsttrainingsessionHistory();
		history.setSessionKey(sessionKey);
		history.setConfName(confName);
		history.setStartTimeScope(startTimeScope);
		history.setEndTimeScope(endTimeScope);
		history.setHostWebExID(hostWebExID);
		history.setConfID(confID);
		history.setTimeZoneID(timeZoneID);
		history.setReturnPSOFields(returnPSOFields);
		history.setPsoFields(psoFields);
		
		MessageType request = createRequest(history);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((LsttrainingsessionHistoryResponse) bodyContents.get(0)).getTrainingSessionHistory();			
		}
		
		return new ArrayList<TrainSessionHistoryInstanceType>();
	}
}
