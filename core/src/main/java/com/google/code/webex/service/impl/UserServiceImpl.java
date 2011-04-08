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

import com.google.code.webex.service.UserService;
import com.google.code.webex.service.util.ApplicationConstants;
import com.google.code.webex.service.util.Base64;
import com.google.code.webex.service.util.WebExUrls;
import com.google.code.webex.service.util.WebExUrls.WebExUrlBuilder;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.LstControlType;
import com.webex.schemas._2002._06.service.MessageType;
import com.webex.schemas._2002._06.service.user.AuthenticateUser;
import com.webex.schemas._2002._06.service.user.AuthenticateUserResponse;
import com.webex.schemas._2002._06.service.user.CreateUser;
import com.webex.schemas._2002._06.service.user.CreateUserResponse;
import com.webex.schemas._2002._06.service.user.DelSessionTemplates;
import com.webex.schemas._2002._06.service.user.DelUser;
import com.webex.schemas._2002._06.service.user.GetLoginTicket;
import com.webex.schemas._2002._06.service.user.GetLoginTicketResponse;
import com.webex.schemas._2002._06.service.user.GetUser;
import com.webex.schemas._2002._06.service.user.GetUserResponse;
import com.webex.schemas._2002._06.service.user.GetloginurlUser;
import com.webex.schemas._2002._06.service.user.GetloginurlUserResponse;
import com.webex.schemas._2002._06.service.user.GetlogouturlUser;
import com.webex.schemas._2002._06.service.user.GetlogouturlUserResponse;
import com.webex.schemas._2002._06.service.user.ImageForType;
import com.webex.schemas._2002._06.service.user.LstsummaryUser;
import com.webex.schemas._2002._06.service.user.LstsummaryUserResponse;
import com.webex.schemas._2002._06.service.user.ObjectFactory;
import com.webex.schemas._2002._06.service.user.OrderByType;
import com.webex.schemas._2002._06.service.user.OrderType;
import com.webex.schemas._2002._06.service.user.SessionTemplateType;
import com.webex.schemas._2002._06.service.user.SetUser;
import com.webex.schemas._2002._06.service.user.TemplateTypeType;
import com.webex.schemas._2002._06.service.user.UploadPMRImage;
import com.webex.schemas._2002._06.service.user.UserSummaryInstanceType;

public class UserServiceImpl extends WebExJaxbService implements
	UserService {

	public UserServiceImpl(String webExId, String password,
			Long siteId, String siteName, String partnerId) {
		super(webExId, password, siteId, siteName, partnerId);
	}

	@Override
	public String authenticateUser(String samlResponse) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		AuthenticateUser authenticateUser = factory.createAuthenticateUser();
		authenticateUser.setSamlResponse(samlResponse);
		MessageType request = createRequest(authenticateUser);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((AuthenticateUserResponse) bodyContents.get(0)).getSessionTicket();			
		}
		return null;
	}

	@Override
	public Long createUser(CreateUser user) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		MessageType request = createRequest(user);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));

		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((CreateUserResponse) bodyContents.get(0)).getUserId();			
		}
		return null;
	}

	@Override
	public void deleteUser(List<String> webExIds, boolean syncWebOffice) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		DelUser delUser = factory.createDelUser();
		delUser.getWebExId().addAll(webExIds);
		delUser.setSyncWebOffice(syncWebOffice);
		MessageType request = createRequest(delUser);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
		}
	}

	@Override
	public void deleteSessionTemplates(List<SessionTemplateType> sessionTemplates, TemplateTypeType templateType) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		DelSessionTemplates delSessionTemplates = factory.createDelSessionTemplates();
		delSessionTemplates.getSessionTemplate().addAll(sessionTemplates);
		MessageType request = createRequest(delSessionTemplates);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
		}
	}

	@Override
	public String getLoginTicket() {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		GetLoginTicket getLoginTicket = factory.createGetLoginTicket();
		MessageType request = createRequest(getLoginTicket);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((GetLoginTicketResponse) bodyContents.get(0)).getTicket();			
		}
		return null;
	}

	@Override
	public String getLoginUrl(String webExId, String callbackUrl) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		GetloginurlUser getLoginUrl = factory.createGetloginurlUser();
		getLoginUrl.setWebExID(webExId);
		getLoginUrl.setBackURL(callbackUrl);
		MessageType request = createRequest(getLoginUrl);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((GetloginurlUserResponse) bodyContents.get(0)).getUserLoginURL();			
		}
		return null;
	}

	@Override
	public String getLogoutUrl(String webExId, String callbackUrl) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		GetlogouturlUser getLogoutUrl = factory.createGetlogouturlUser();
		getLogoutUrl.setWebExID(webExId);
		getLogoutUrl.setBackURL(callbackUrl);
		MessageType request = createRequest(getLogoutUrl);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((GetlogouturlUserResponse) bodyContents.get(0)).getUserLogoutURL();			
		}
		return null;
	}

	@Override
	public GetUserResponse getUser(String webExId) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		GetUser getUser = factory.createGetUser();
		getUser.setWebExId(webExId);
		MessageType request = createRequest(getUser);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((GetUserResponse) bodyContents.get(0));			
		}
		return null;
	}

	@Override
	public List<UserSummaryInstanceType> getUserSummaryList() {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		LstsummaryUser summaryUser = factory.createLstsummaryUser();
		LstControlType listControl = new com.webex.schemas._2002._06.service.ObjectFactory().createLstControlType();
		summaryUser.setListControl(listControl);
		listControl.setMaximumNum(5L);
		OrderType order = factory.createOrderType();
		summaryUser.setOrder(order);
		order.getOrderBy().add(OrderByType.FIRSTNAME);
		
		MessageType request = createRequest(summaryUser);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((LstsummaryUserResponse) bodyContents.get(0)).getUser();			
		}
		return new ArrayList<UserSummaryInstanceType>();
	}

	@Override
	public void setUser(SetUser user) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		MessageType request = createRequest(user);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));

		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
		}
	}

	@Override
	public void uploadPmrImage(ImageForType imageFor, byte[] imageData) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		UploadPMRImage uploadPmrImage = factory.createUploadPMRImage();
		uploadPmrImage.setImageFor(imageFor);
		uploadPmrImage.setImageData(Base64.encodeBytesToBytes(imageData));
		MessageType request = createRequest(uploadPmrImage);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
		}
	}
}
