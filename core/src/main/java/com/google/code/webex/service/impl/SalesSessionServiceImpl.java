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

import com.google.code.webex.service.SalesSessionService;
import com.google.code.webex.service.util.ApplicationConstants;
import com.google.code.webex.service.util.WebExUrls;
import com.google.code.webex.service.util.WebExUrls.WebExUrlBuilder;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.MessageType;
import com.webex.schemas._2002._06.service.sales.AccountInstanceType;
import com.webex.schemas._2002._06.service.sales.AccountType;
import com.webex.schemas._2002._06.service.sales.AddProducts;
import com.webex.schemas._2002._06.service.sales.AddProductsResponse;
import com.webex.schemas._2002._06.service.sales.CreateAccount;
import com.webex.schemas._2002._06.service.sales.CreateAccountResponse;
import com.webex.schemas._2002._06.service.sales.CreateOpportunity;
import com.webex.schemas._2002._06.service.sales.CreateOpportunityResponse;
import com.webex.schemas._2002._06.service.sales.CreateSalesSession;
import com.webex.schemas._2002._06.service.sales.CreateSalesSessionResponse;
import com.webex.schemas._2002._06.service.sales.DateScopeType;
import com.webex.schemas._2002._06.service.sales.DelSalesSession;
import com.webex.schemas._2002._06.service.sales.DelSalesSessionResponse;
import com.webex.schemas._2002._06.service.sales.GetSalesSession;
import com.webex.schemas._2002._06.service.sales.GetSalesSessionResponse;
import com.webex.schemas._2002._06.service.sales.ICalendarURL;
import com.webex.schemas._2002._06.service.sales.LstAccounts;
import com.webex.schemas._2002._06.service.sales.LstAccountsResponse;
import com.webex.schemas._2002._06.service.sales.LstOpportunities;
import com.webex.schemas._2002._06.service.sales.LstOpportunitiesResponse;
import com.webex.schemas._2002._06.service.sales.LstProducts;
import com.webex.schemas._2002._06.service.sales.LstProductsResponse;
import com.webex.schemas._2002._06.service.sales.LstsummarySalesSession;
import com.webex.schemas._2002._06.service.sales.LstsummarySalesSessionResponse;
import com.webex.schemas._2002._06.service.sales.ObjectFactory;
import com.webex.schemas._2002._06.service.sales.OpptyInstanceType;
import com.webex.schemas._2002._06.service.sales.OpptyType;
import com.webex.schemas._2002._06.service.sales.ProductInstanceType;
import com.webex.schemas._2002._06.service.sales.ProductType;
import com.webex.schemas._2002._06.service.sales.SalesSessionSummaryInstanceType;
import com.webex.schemas._2002._06.service.sales.SetAccount;
import com.webex.schemas._2002._06.service.sales.SetAccountResponse;
import com.webex.schemas._2002._06.service.sales.SetOpportunity;
import com.webex.schemas._2002._06.service.sales.SetOpportunityResponse;
import com.webex.schemas._2002._06.service.sales.SetProducts;
import com.webex.schemas._2002._06.service.sales.SetProductsResponse;
import com.webex.schemas._2002._06.service.sales.SetSalesSession;
import com.webex.schemas._2002._06.service.sales.SetSalesSessionResponse;
import com.webex.schemas._2002._06.service.sales.LstOpportunitiesResponse.Opportunity;
import com.webex.schemas._2002._06.service.sales.SetAccount.Account;

public class SalesSessionServiceImpl extends WebExJaxbService implements
	SalesSessionService {

	public SalesSessionServiceImpl(String webExId, String password,
			Long siteId, String siteName, String partnerId) {
		super(webExId, password, siteId, siteName, partnerId);
	}

	@Override
	public List<Long> addProducts(List<ProductType> products) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		AddProducts addProducts = factory.createAddProducts();
		addProducts.getProduct().addAll(products);
		
		MessageType request = createRequest(addProducts);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((AddProductsResponse) bodyContents.get(0)).getProdID();			
		}
		return new ArrayList<Long>();
	}

	@Override
	public Long createAccount(String webExID, AccountType account) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		CreateAccount createAccount = factory.createCreateAccount();
		createAccount.setWebExID(webExID);
		createAccount.setAccount(account);
		
		MessageType request = createRequest(createAccount);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((CreateAccountResponse) bodyContents.get(0)).getIntAccountID();			
		}
		return null;
	}

	@Override
	public Long createOpportunity(String webExID, OpptyType opportunity) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		CreateOpportunity createOpportunity = factory.createCreateOpportunity();
		createOpportunity.setWebExID(webExID);
		createOpportunity.setOpportunity(opportunity);
		
		MessageType request = createRequest(createOpportunity);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((CreateOpportunityResponse) bodyContents.get(0)).getIntOpptyID();			
		}
		return null;
	}

	@Override
	public CreateSalesSessionResponse createSalesSession(
			CreateSalesSession salesSession) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		MessageType request = createRequest(salesSession);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((CreateSalesSessionResponse) bodyContents.get(0));			
		}
		return null;
	}

	@Override
	public ICalendarURL deleteSalesSession(long meetingKey) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		DelSalesSession deleteSession = factory.createDelSalesSession();
		deleteSession.setMeetingKey(meetingKey);
		
		MessageType request = createRequest(deleteSession);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((DelSalesSessionResponse) bodyContents.get(0)).getICalendarURL();			
		}
		return null;
	}

	@Override
	public GetSalesSessionResponse getSalesSession(long meetingKey) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		GetSalesSession getSession = factory.createGetSalesSession();
		getSession.setMeetingKey(meetingKey);
		
		MessageType request = createRequest(getSession);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((GetSalesSessionResponse) bodyContents.get(0));			
		}
		return null;
	}

	@Override
	public List<AccountInstanceType> getAccounts(String webExID,
			Long intAccountID, String extAccountID, Long extSystemID,
			Boolean returnOppty) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		LstAccounts accounts = factory.createLstAccounts();
		accounts.setWebExID(webExID);
		accounts.setIntAccountID(intAccountID);
		accounts.setExtAccountID(extAccountID);
		accounts.setExtSystemID(extSystemID);
		accounts.setReturnOppty(returnOppty);
		
		MessageType request = createRequest(accounts);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((LstAccountsResponse) bodyContents.get(0)).getAccount();			
		}
		return new ArrayList<AccountInstanceType>();
	}

	@Override
	public List<Opportunity> getOpportunities(String webExID,
			Long intAccountID, String extAccountID, Long intOpptyID,
			String extOpptyID, Long extSystemID) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		LstOpportunities opportunities = factory.createLstOpportunities();
		opportunities.setWebExID(webExID);
		opportunities.setIntAccountID(intAccountID);
		opportunities.setExtAccountID(extAccountID);
		opportunities.setIntOpptyID(intOpptyID);
		opportunities.setExtOpptyID(extOpptyID);
		opportunities.setExtSystemID(extSystemID);
		
		MessageType request = createRequest(opportunities);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((LstOpportunitiesResponse) bodyContents.get(0)).getOpportunity();			
		}
		return new ArrayList<Opportunity>();
	}

	@Override
	public List<ProductInstanceType> getProducts(String name, List<Long> prodIDs) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		LstProducts products = factory.createLstProducts();
		products.setName(name);
		products.getProdID().addAll(prodIDs);
		
		MessageType request = createRequest(products);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((LstProductsResponse) bodyContents.get(0)).getProduct();			
		}
		return new ArrayList<ProductInstanceType>();
	}

	@Override
	public List<SalesSessionSummaryInstanceType> getSalesSessionSummaries(
			DateScopeType dateScope, Long meetingKey, String hostWebExID,
			String account, String opportunity) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		LstsummarySalesSession sessionSummaries = factory.createLstsummarySalesSession();
		sessionSummaries.setDateScope(dateScope);
		sessionSummaries.setMeetingKey(meetingKey);
		sessionSummaries.setHostWebExID(hostWebExID);
		sessionSummaries.setAccount(account);
		sessionSummaries.setOpportunity(opportunity);
		
		MessageType request = createRequest(sessionSummaries);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((LstsummarySalesSessionResponse) bodyContents.get(0)).getSalesSession();			
		}
		return new ArrayList<SalesSessionSummaryInstanceType>();
	}

	@Override
	public Long setAccount(String webExID, Account account) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		SetAccount setAccount = factory.createSetAccount();
		setAccount.setWebExID(webExID);
		setAccount.setAccount(account);
		
		MessageType request = createRequest(setAccount);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((SetAccountResponse) bodyContents.get(0)).getIntAccountID();			
		}
		return null;
	}

	@Override
	public Long setOpportunity(String webExID, OpptyInstanceType opportunity) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		SetOpportunity setOpportunity = factory.createSetOpportunity();
		setOpportunity.setWebExID(webExID);
		setOpportunity.setOpportunity(opportunity);
		
		MessageType request = createRequest(setOpportunity);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((SetOpportunityResponse) bodyContents.get(0)).getIntOpptyID();			
		}
		return null;
	}

	@Override
	public List<Long> setProducts(List<ProductInstanceType> products) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		SetProducts setProducts = factory.createSetProducts();
		setProducts.getProduct().addAll(products);
		
		MessageType request = createRequest(setProducts);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((SetProductsResponse) bodyContents.get(0)).getProdID();			
		}
		return new ArrayList<Long>();
	}

	@Override
	public ICalendarURL setSalesSession(SetSalesSession salesSession) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		
		MessageType request = createRequest(salesSession);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((SetSalesSessionResponse) bodyContents.get(0)).getICalendarURL();			
		}
		return null;
	}
}
