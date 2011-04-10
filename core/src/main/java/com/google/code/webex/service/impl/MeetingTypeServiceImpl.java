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

import com.google.code.webex.service.MeetingTypeService;
import com.google.code.webex.service.util.ApplicationConstants;
import com.google.code.webex.service.util.WebExUrls;
import com.google.code.webex.service.util.WebExUrls.WebExUrlBuilder;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.MessageType;
import com.webex.schemas._2002._06.service.meetingtype.GetMeetingType;
import com.webex.schemas._2002._06.service.meetingtype.GetMeetingTypeResponse;
import com.webex.schemas._2002._06.service.meetingtype.LstMeetingType;
import com.webex.schemas._2002._06.service.meetingtype.LstMeetingTypeResponse;
import com.webex.schemas._2002._06.service.meetingtype.MeetingTypeInstanceType;
import com.webex.schemas._2002._06.service.meetingtype.ObjectFactory;

public class MeetingTypeServiceImpl extends WebExJaxbService implements
	MeetingTypeService {

	public MeetingTypeServiceImpl(String webExId, String password,
			Long siteId, String siteName, String partnerId) {
		super(webExId, password, siteId, siteName, partnerId);
	}

	@Override
	public GetMeetingTypeResponse getMeetingType(Long meetingTypeID) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		GetMeetingType meetingType = factory.createGetMeetingType();
		meetingType.setMeetingTypeID(meetingTypeID);
		MessageType request = createRequest(meetingType);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((GetMeetingTypeResponse) bodyContents.get(0));			
		}
		
		return null;
	}

	@Override
	public List<MeetingTypeInstanceType> getMeetingTypes(
			List<Long> meetingTypeIDs) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		LstMeetingType meetingType = factory.createLstMeetingType();
		meetingType.getMeetingTypeID().addAll(meetingTypeIDs);
		MessageType request = createRequest(meetingType);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((LstMeetingTypeResponse) bodyContents.get(0)).getMeetingType();			
		}
		return new ArrayList<MeetingTypeInstanceType>();
	}
}
