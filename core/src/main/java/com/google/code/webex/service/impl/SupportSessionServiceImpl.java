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

import com.google.code.webex.service.SupportSessionService;
import com.google.code.webex.service.util.ApplicationConstants;
import com.google.code.webex.service.util.WebExUrls;
import com.google.code.webex.service.util.WebExUrls.WebExUrlBuilder;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.MessageType;
import com.webex.schemas._2002._06.service.attendee.FeedbackSessionType;
import com.webex.schemas._2002._06.service.attendee.GetFeedbackInfo;
import com.webex.schemas._2002._06.service.attendee.GetFeedbackInfoResponse;
import com.webex.schemas._2002._06.service.supportsession.CreateSupportSession;
import com.webex.schemas._2002._06.service.supportsession.CreateSupportSessionResponse;

/**
 * The Class SupportSessionServiceImpl.
 */
public class SupportSessionServiceImpl extends WebExJaxbService implements
	SupportSessionService {

	/**
	 * Instantiates a new support session service impl.
	 * 
	 * @param webExId the web ex id
	 * @param password the password
	 * @param siteId the site id
	 * @param siteName the site name
	 * @param partnerId the partner id
	 */
	public SupportSessionServiceImpl(String webExId, String password,
			Long siteId, String siteName, String partnerId) {
		super(webExId, password, siteId, siteName, partnerId);
	}

	/* (non-Javadoc)
	 * @see com.google.code.webex.service.SupportSessionService#createSupportSession(com.webex.schemas._2002._06.service.supportsession.CreateSupportSession)
	 */
	@Override
	public Long createSupportSession(CreateSupportSession session) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		MessageType request = createRequest(session);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((CreateSupportSessionResponse) bodyContents.get(0)).getSessionKey();			
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see com.google.code.webex.service.SupportSessionService#getFeedbackInformation(long)
	 */
	@Override
	public List<FeedbackSessionType> getFeedbackInformation(long confID) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		com.webex.schemas._2002._06.service.attendee.ObjectFactory factory = new com.webex.schemas._2002._06.service.attendee.ObjectFactory();
		GetFeedbackInfo feedbackInfo = factory.createGetFeedbackInfo();
		feedbackInfo.setConfID(confID);
		MessageType request = createRequest(feedbackInfo);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((GetFeedbackInfoResponse) bodyContents.get(0)).getSession();			
		}
		return new ArrayList<FeedbackSessionType>();
	}
}
