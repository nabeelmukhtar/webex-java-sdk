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

import com.google.code.webex.service.TrainingSessionService;
import com.google.code.webex.service.util.ApplicationConstants;
import com.google.code.webex.service.util.WebExUrls;
import com.google.code.webex.service.util.WebExUrls.WebExUrlBuilder;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.MessageType;
import com.webex.schemas._2002._06.service.session.DateScopeType;
import com.webex.schemas._2002._06.service.trainingsession.AvailabilityLabType;
import com.webex.schemas._2002._06.service.trainingsession.CheckLabAvailability;
import com.webex.schemas._2002._06.service.trainingsession.CheckLabAvailabilityResponse;
import com.webex.schemas._2002._06.service.trainingsession.CreateTrainingSession;
import com.webex.schemas._2002._06.service.trainingsession.CreateTrainingSessionResponse;
import com.webex.schemas._2002._06.service.trainingsession.DelTrainingSession;
import com.webex.schemas._2002._06.service.trainingsession.GetIMStestDetails;
import com.webex.schemas._2002._06.service.trainingsession.GetIMStestDetailsResponse;
import com.webex.schemas._2002._06.service.trainingsession.GetIMStestResult;
import com.webex.schemas._2002._06.service.trainingsession.GetIMStestResultResponse;
import com.webex.schemas._2002._06.service.trainingsession.GetLabInfo;
import com.webex.schemas._2002._06.service.trainingsession.GetLabInfoResponse;
import com.webex.schemas._2002._06.service.trainingsession.GetLabSchedule;
import com.webex.schemas._2002._06.service.trainingsession.GetLabScheduleResponse;
import com.webex.schemas._2002._06.service.trainingsession.GetTestInformation;
import com.webex.schemas._2002._06.service.trainingsession.GetTestInformationResponse;
import com.webex.schemas._2002._06.service.trainingsession.GetTrainingSession;
import com.webex.schemas._2002._06.service.trainingsession.GetTrainingSessionResponse;
import com.webex.schemas._2002._06.service.trainingsession.LabInfoType;
import com.webex.schemas._2002._06.service.trainingsession.LstScheduledTests;
import com.webex.schemas._2002._06.service.trainingsession.LstScheduledTestsResponse;
import com.webex.schemas._2002._06.service.trainingsession.LstsummaryTrainingSession;
import com.webex.schemas._2002._06.service.trainingsession.LstsummaryTrainingSessionResponse;
import com.webex.schemas._2002._06.service.trainingsession.ObjectFactory;
import com.webex.schemas._2002._06.service.trainingsession.ScheduleLabType;
import com.webex.schemas._2002._06.service.trainingsession.ScheduledTestInstanceType;
import com.webex.schemas._2002._06.service.trainingsession.SetTrainingSession;
import com.webex.schemas._2002._06.service.trainingsession.TestStatusType;
import com.webex.schemas._2002._06.service.trainingsession.TrainingSessionSummaryInstanceType;
import com.webex.schemas._2002._06.service.trainingsessionqti.QtiResultReportType;
import com.webex.schemas._2002._06.service.trainingsessionqtiasi.QuestestinteropType;

public class TrainingSessionServiceImpl extends WebExJaxbService implements
	TrainingSessionService {

	public TrainingSessionServiceImpl(String webExId, String password,
			Long siteId, String siteName, String partnerId) {
		super(webExId, password, siteId, siteName, partnerId);
	}

	@Override
	public List<AvailabilityLabType> checkLabAvailability(String labName,
			int timeZoneID, String sessionStartTime, String sessionEndTime,
			int numComputers) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		CheckLabAvailability labAvailability = factory.createCheckLabAvailability();
		labAvailability.setLabName(labName);
		labAvailability.setTimeZoneID(timeZoneID);
		labAvailability.setSessionStartTime(sessionStartTime);
		labAvailability.setSessionEndTime(sessionEndTime);
		labAvailability.setNumComputers(numComputers);
		MessageType request = createRequest(labAvailability);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((CheckLabAvailabilityResponse) bodyContents.get(0)).getAvailabilityLabs();			
		}
		return new ArrayList<AvailabilityLabType>();
	}

	@Override
	public CreateTrainingSessionResponse createTrainingSession(
			CreateTrainingSession trainingSession) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		MessageType request = createRequest(trainingSession);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((CreateTrainingSessionResponse) bodyContents.get(0));			
		}
		return null;
	}

	@Override
	public void deleteTrainingSession(long sessionKey) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		DelTrainingSession deleteSession = factory.createDelTrainingSession();
		deleteSession.setSessionKey(sessionKey);
		MessageType request = createRequest(deleteSession);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
		}
	}

	@Override
	public QuestestinteropType getImsTestDetails(Long testID) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		GetIMStestDetails getImsDetails = factory.createGetIMStestDetails();
		getImsDetails.setTestID(testID);
		MessageType request = createRequest(getImsDetails);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((GetIMStestDetailsResponse) bodyContents.get(0)).getQuestestinterop();			
		}
		return null;
	}

	@Override
	public QtiResultReportType getImsTestResult(Long testID,
			String participantEmail) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		GetIMStestResult getImsResults = factory.createGetIMStestResult();
		getImsResults.setTestID(testID);
		getImsResults.setParticipantEmail(participantEmail);
		MessageType request = createRequest(getImsResults);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((GetIMStestResultResponse) bodyContents.get(0)).getQtiResultReport();			
		}
		return null;
	}

	@Override
	public List<LabInfoType> getLabInformation(String labName) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		GetLabInfo getLabInfo = factory.createGetLabInfo();
		getLabInfo.setLabName(labName);
		MessageType request = createRequest(getLabInfo);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((GetLabInfoResponse) bodyContents.get(0)).getLabInfo();			
		}
		return new ArrayList<LabInfoType>();
	}

	@Override
	public List<ScheduleLabType> getLabSchedule(String labName, int timeZoneID,
			String sessionStartTime, String sessionEndTime) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		GetLabSchedule getLabSchedule = factory.createGetLabSchedule();
		getLabSchedule.setLabName(labName);
		getLabSchedule.setTimeZoneID(timeZoneID);
		getLabSchedule.setSessionStartTime(sessionStartTime);
		getLabSchedule.setSessionEndTime(sessionEndTime);
		MessageType request = createRequest(getLabSchedule);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((GetLabScheduleResponse) bodyContents.get(0)).getScheduledLabs();			
		}
		return new ArrayList<ScheduleLabType>();
	}

	@Override
	public GetTestInformationResponse getTestInformation(Long testID) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		GetTestInformation getTestInformation = factory.createGetTestInformation();
		getTestInformation.setTestID(testID);
		MessageType request = createRequest(getTestInformation);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((GetTestInformationResponse) bodyContents.get(0));			
		}
		
		return null;
	}

	@Override
	public GetTrainingSessionResponse getTrainingSession(long sessionKey) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		GetTrainingSession getTrainingSession = factory.createGetTrainingSession();
		getTrainingSession.setSessionKey(sessionKey);
		MessageType request = createRequest(getTrainingSession);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((GetTrainingSessionResponse) bodyContents.get(0));			
		}
		
		return null;
	}

	@Override
	public List<ScheduledTestInstanceType> getScheduledTests(
			DateScopeType dateScope, Long sessionKey, TestStatusType status,
			String author) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		LstScheduledTests scheduledTests = factory.createLstScheduledTests();
		scheduledTests.setDateScope(dateScope);
		scheduledTests.setSessionKey(sessionKey);
		scheduledTests.setStatus(status);
		scheduledTests.setAuthor(author);
		MessageType request = createRequest(scheduledTests);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((LstScheduledTestsResponse) bodyContents.get(0)).getTest();			
		}
		return new ArrayList<ScheduledTestInstanceType>();
	}

	@Override
	public List<TrainingSessionSummaryInstanceType> getTrainingSessionSummaries(
			DateScopeType dateScope, Long sessionKey, String hostWebExID) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		LstsummaryTrainingSession sessionSummaries = factory.createLstsummaryTrainingSession();
		sessionSummaries.setDateScope(dateScope);
		sessionSummaries.setSessionKey(sessionKey);
		sessionSummaries.setHostWebExID(hostWebExID);
		MessageType request = createRequest(sessionSummaries);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((LstsummaryTrainingSessionResponse) bodyContents.get(0)).getTrainingSession();			
		}
		return new ArrayList<TrainingSessionSummaryInstanceType>();
	}

	@Override
	public void setTrainingSession(SetTrainingSession trainingSession) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		MessageType request = createRequest(trainingSession);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
		}
	}
}
