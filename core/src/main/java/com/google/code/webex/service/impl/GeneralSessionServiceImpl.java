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

import com.google.code.webex.service.GeneralSessionService;
import com.google.code.webex.service.util.ApplicationConstants;
import com.google.code.webex.service.util.WebExUrls;
import com.google.code.webex.service.util.WebExUrls.WebExUrlBuilder;
import com.webex.schemas._2002._06.common.AddressTypeType;
import com.webex.schemas._2002._06.common.ServiceTypeType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.MessageType;
import com.webex.schemas._2002._06.service.ep.ContactOperationType;
import com.webex.schemas._2002._06.service.ep.ContactType;
import com.webex.schemas._2002._06.service.ep.CreateContacts;
import com.webex.schemas._2002._06.service.ep.CreateContactsResponse;
import com.webex.schemas._2002._06.service.ep.CreateDistList;
import com.webex.schemas._2002._06.service.ep.CreateDistListResponse;
import com.webex.schemas._2002._06.service.ep.DelRecording;
import com.webex.schemas._2002._06.service.ep.DelRecordingResponse;
import com.webex.schemas._2002._06.service.ep.DelSession;
import com.webex.schemas._2002._06.service.ep.DistListInstanceType;
import com.webex.schemas._2002._06.service.ep.DistListWithContactType;
import com.webex.schemas._2002._06.service.ep.GetAPIVersion;
import com.webex.schemas._2002._06.service.ep.GetAPIVersionResponse;
import com.webex.schemas._2002._06.service.ep.GetOneClickSettings;
import com.webex.schemas._2002._06.service.ep.GetOneClickSettingsResponse;
import com.webex.schemas._2002._06.service.ep.GetSessionInfo;
import com.webex.schemas._2002._06.service.ep.GetSessionInfoResponse;
import com.webex.schemas._2002._06.service.ep.ListControlType;
import com.webex.schemas._2002._06.service.ep.LstContact;
import com.webex.schemas._2002._06.service.ep.LstContactResponse;
import com.webex.schemas._2002._06.service.ep.LstDistList;
import com.webex.schemas._2002._06.service.ep.LstDistListResponse;
import com.webex.schemas._2002._06.service.ep.LstOpenSession;
import com.webex.schemas._2002._06.service.ep.LstOpenSessionResponse;
import com.webex.schemas._2002._06.service.ep.LstRecording;
import com.webex.schemas._2002._06.service.ep.LstRecordingResponse;
import com.webex.schemas._2002._06.service.ep.LstsummarySession;
import com.webex.schemas._2002._06.service.ep.LstsummarySessionResponse;
import com.webex.schemas._2002._06.service.ep.ObjectFactory;
import com.webex.schemas._2002._06.service.ep.RecordingType;
import com.webex.schemas._2002._06.service.ep.SessionSummaryInstanceType;
import com.webex.schemas._2002._06.service.ep.SetDistList;
import com.webex.schemas._2002._06.service.ep.SetRecordingInfo;
import com.webex.schemas._2002._06.service.ep.SetRecordingInfoResponse;
import com.webex.schemas._2002._06.service.ep.SetupOneClickSettings;
import com.webex.schemas._2002._06.service.ep.LstOpenSessionResponse.Services;

public class GeneralSessionServiceImpl extends WebExJaxbService implements
		GeneralSessionService {

	public GeneralSessionServiceImpl(String webExId, String password,
			Long siteId, String siteName, String partnerId) {
		super(webExId, password, siteId, siteName, partnerId);
	}

	@Override
	public List<Long> createContacts(List<ContactType> contacts) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		CreateContacts createContacts = factory.createCreateContacts();
		createContacts.getContact().addAll(contacts);
		MessageType request = createRequest(createContacts);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));

		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((CreateContactsResponse) bodyContents.get(0)).getContactID();			
		}
		return new ArrayList<Long>();
	}

	@Override
	public Long createDistributionList(String name, String description,
			List<Long> contactIds) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		CreateDistList createDistList = factory.createCreateDistList();
		DistListWithContactType createDistListWithContactType = factory.createDistListWithContactType();
		createDistListWithContactType.setName(name);
		createDistListWithContactType.setDesc(description);
		createDistListWithContactType.getContactID().addAll(contactIds);
		createDistList.setDistList(createDistListWithContactType);
		MessageType request = createRequest(createDistList);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));

		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((CreateDistListResponse) bodyContents.get(0)).getDistListID();			
		}
		return null;
	}

	@Override
	public Integer deleteRecording(Integer recordingId) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		DelRecording delRecording = factory.createDelRecording();
		delRecording.setRecordingID(recordingId);
		MessageType request = createRequest(delRecording);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));

		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((DelRecordingResponse) bodyContents.get(0)).getRecordingID();			
		}
		return null;
	}

	@Override
	public void deleteSession(Long sessionKey, boolean sendEmail) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		DelSession delSession = factory.createDelSession();
		delSession.setSessionKey(sessionKey);
		delSession.setSendEmail(sendEmail);
		MessageType request = createRequest(delSession);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));

		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
		}
	}

	@Override
	public String getApiVersion() {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		GetAPIVersion getApiVersion = factory.createGetAPIVersion();
		MessageType request = createRequest(getApiVersion);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));

		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((GetAPIVersionResponse) bodyContents.get(0)).getApiVersion();			
		}
		
		return null;
	}

	@Override
	public List<DistListInstanceType> getDistributionLists(Long distListID,
			String name, AddressTypeType addressType, String hostWebExID) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		LstDistList distList = factory.createLstDistList();
		distList.setDistListID(distListID);
		distList.setName(name);
		distList.setAddressType(addressType);
		distList.setHostWebExID(hostWebExID);
		MessageType request = createRequest(distList);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));

		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((LstDistListResponse) bodyContents.get(0)).getDistList();			
		}
		
		return new ArrayList<DistListInstanceType>();
	}

	@Override
	public List<Services> getOpenSessions(ServiceTypeType... serviceTypes) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		LstOpenSession distSession = factory.createLstOpenSession();
		for (int i = 0; i < serviceTypes.length; i++) {
			distSession.getServiceType().add(serviceTypes[i]);
		}
		MessageType request = createRequest(distSession);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));

		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((LstOpenSessionResponse) bodyContents.get(0)).getServices();			
		}
		
		return new ArrayList<Services>();
	}

	@Override
	public List<RecordingType> getRecordings(String hostWebExID,
			Long sessionKey, boolean returnSessionDetails) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		LstRecording lstRecordings = factory.createLstRecording();
		ListControlType listControl = factory.createListControlType();
		lstRecordings.setListControl(listControl);
		listControl.setMaximumNum(5L);
		
		lstRecordings.setHostWebExID(hostWebExID);
		lstRecordings.setSessionKey(sessionKey);
		lstRecordings.setReturnSessionDetails(returnSessionDetails);
		
		MessageType request = createRequest(lstRecordings);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((LstRecordingResponse) bodyContents.get(0)).getRecording();			
		}
		return new ArrayList<RecordingType>();
	}

	@Override
	public List<SessionSummaryInstanceType> getSessionSummaries(LstsummarySession sessionRequest) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		MessageType request = createRequest(sessionRequest);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((LstsummarySessionResponse) bodyContents.get(0)).getSession();			
		}
		return new ArrayList<SessionSummaryInstanceType>();
	}

	@Override
	public void setDistributionList(Long distListID, String name, String description, List<Long> contactIds, ContactOperationType operationType) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		SetDistList setDistList = factory.createSetDistList();
		SetDistList.DistList distList = factory.createSetDistListDistList();
		distList.setName(name);
		distList.setDesc(description);
		distList.getContactID().addAll(contactIds);
		distList.setContactOperation(operationType);
		setDistList.setDistList(distList);
		MessageType request = createRequest(setDistList);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));

		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
		}
	}

	@Override
	public GetOneClickSettingsResponse getOneClickSettings(String hostWebExID) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		GetOneClickSettings oneClickSettings = factory.createGetOneClickSettings();
		oneClickSettings.setHostWebExID(hostWebExID);
		MessageType request = createRequest(oneClickSettings);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((GetOneClickSettingsResponse) bodyContents.get(0));			
		}
		return null;
	}

	@Override
	public void setupOneClickSettings(SetupOneClickSettings oneClickSettings) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		MessageType request = createRequest(oneClickSettings);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
		}
	}

	@Override
	public GetSessionInfoResponse getSessionInfo(long sessionKey,
			String sessionPassword) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		GetSessionInfo sessionInfo = factory.createGetSessionInfo();
		sessionInfo.setSessionKey(sessionKey);
		sessionInfo.setSessionPassword(sessionPassword);
		MessageType request = createRequest(sessionInfo);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((GetSessionInfoResponse) bodyContents.get(0));			
		}
		return null;
	}

	@Override
	public List<ContactType> getContacts(Long distListID, String distListName,
			AddressTypeType addressType, String hostWebExID) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		LstContact listContacts = factory.createLstContact();
		listContacts.setDistListID(distListID);
		listContacts.setDistListName(distListName);
		listContacts.setAddressType(addressType);
		listContacts.setHostWebExID(hostWebExID);
		MessageType request = createRequest(listContacts);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((LstContactResponse) bodyContents.get(0)).getContact();			
		}
		
		return new ArrayList<ContactType>();
	}

	@Override
	public Integer setRecordingInfo(SetRecordingInfo recordingInfo) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		MessageType request = createRequest(recordingInfo);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((SetRecordingInfoResponse) bodyContents.get(0)).getRecordingID();			
		}
		
		return null;
	}
}
