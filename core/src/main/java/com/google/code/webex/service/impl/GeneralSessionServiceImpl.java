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
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.MessageType;
import com.webex.schemas._2002._06.service.ep.ContactType;
import com.webex.schemas._2002._06.service.ep.CreateContacts;
import com.webex.schemas._2002._06.service.ep.CreateContactsResponse;
import com.webex.schemas._2002._06.service.ep.CreateDistList;
import com.webex.schemas._2002._06.service.ep.CreateDistListResponse;
import com.webex.schemas._2002._06.service.ep.DelRecording;
import com.webex.schemas._2002._06.service.ep.DelRecordingResponse;
import com.webex.schemas._2002._06.service.ep.DistListWithContactType;
import com.webex.schemas._2002._06.service.ep.ObjectFactory;

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
}
