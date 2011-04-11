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
package com.google.code.webex.service;

import java.util.List;

import com.webex.schemas._2002._06.service.sales.AccountInstanceType;
import com.webex.schemas._2002._06.service.sales.AccountType;
import com.webex.schemas._2002._06.service.sales.CreateSalesSession;
import com.webex.schemas._2002._06.service.sales.CreateSalesSessionResponse;
import com.webex.schemas._2002._06.service.sales.DateScopeType;
import com.webex.schemas._2002._06.service.sales.GetSalesSessionResponse;
import com.webex.schemas._2002._06.service.sales.ICalendarURL;
import com.webex.schemas._2002._06.service.sales.LstOpportunitiesResponse;
import com.webex.schemas._2002._06.service.sales.OpptyInstanceType;
import com.webex.schemas._2002._06.service.sales.OpptyType;
import com.webex.schemas._2002._06.service.sales.ProductInstanceType;
import com.webex.schemas._2002._06.service.sales.ProductType;
import com.webex.schemas._2002._06.service.sales.SalesSessionSummaryInstanceType;
import com.webex.schemas._2002._06.service.sales.SetAccount;
import com.webex.schemas._2002._06.service.sales.SetSalesSession;

/**
 * The Interface SalesSessionService.
 */
public interface SalesSessionService extends WebExService {
	
	/**
	 * Adds the products.
	 * 
	 * @param products the products
	 * 
	 * @return the list< long>
	 */
	public List<Long> addProducts(List<ProductType> products);
	
	/**
	 * Creates the account.
	 * 
	 * @param webExID the web ex id
	 * @param account the account
	 * 
	 * @return the long
	 */
	public Long createAccount(String webExID, AccountType account);
	
	/**
	 * Creates the opportunity.
	 * 
	 * @param webExID the web ex id
	 * @param opportunity the opportunity
	 * 
	 * @return the long
	 */
	public Long createOpportunity(String webExID, OpptyType opportunity);
	
	/**
	 * Creates the sales session.
	 * 
	 * @param salesSession the sales session
	 * 
	 * @return the creates the sales session response
	 */
	public CreateSalesSessionResponse createSalesSession(CreateSalesSession salesSession);
	
	/**
	 * Delete sales session.
	 * 
	 * @param meetingKey the meeting key
	 * 
	 * @return the i calendar url
	 */
	public ICalendarURL deleteSalesSession(long meetingKey);
	
	/**
	 * Gets the sales session.
	 * 
	 * @param meetingKey the meeting key
	 * 
	 * @return the sales session
	 */
	public GetSalesSessionResponse getSalesSession(long meetingKey);
	
	/**
	 * Gets the accounts.
	 * 
	 * @param webExID the web ex id
	 * @param intAccountID the int account id
	 * @param extAccountID the ext account id
	 * @param extSystemID the ext system id
	 * @param returnOppty the return oppty
	 * 
	 * @return the accounts
	 */
	public List<AccountInstanceType> getAccounts(String webExID, Long intAccountID, String extAccountID, Long extSystemID, Boolean returnOppty);
	
	/**
	 * Gets the opportunities.
	 * 
	 * @param webExID the web ex id
	 * @param intAccountID the int account id
	 * @param extAccountID the ext account id
	 * @param intOpptyID the int oppty id
	 * @param extOpptyID the ext oppty id
	 * @param extSystemID the ext system id
	 * 
	 * @return the opportunities
	 */
	public List<LstOpportunitiesResponse.Opportunity> getOpportunities(String webExID, Long intAccountID, String extAccountID, Long intOpptyID, String extOpptyID, Long extSystemID);
	
	/**
	 * Gets the products.
	 * 
	 * @param name the name
	 * @param prodIDs the prod i ds
	 * 
	 * @return the products
	 */
	public List<ProductInstanceType> getProducts(String name, List<Long> prodIDs);
	
	/**
	 * Gets the sales session summaries.
	 * 
	 * @param dateScope the date scope
	 * @param meetingKey the meeting key
	 * @param hostWebExID the host web ex id
	 * @param account the account
	 * @param opportunity the opportunity
	 * 
	 * @return the sales session summaries
	 */
	public List<SalesSessionSummaryInstanceType> getSalesSessionSummaries(DateScopeType dateScope, Long meetingKey, String hostWebExID, String account, String opportunity);
	
	/**
	 * Sets the account.
	 * 
	 * @param webExID the web ex id
	 * @param account the account
	 * 
	 * @return the long
	 */
	public Long setAccount(String webExID, SetAccount.Account account);
	
	/**
	 * Sets the opportunity.
	 * 
	 * @param webExID the web ex id
	 * @param opportunity the opportunity
	 * 
	 * @return the long
	 */
	public Long setOpportunity(String webExID, OpptyInstanceType opportunity);
	
	/**
	 * Sets the products.
	 * 
	 * @param products the products
	 * 
	 * @return the list< long>
	 */
	public List<Long> setProducts(List<ProductInstanceType> products);
	
	/**
	 * Sets the sales session.
	 * 
	 * @param salesSession the sales session
	 * 
	 * @return the i calendar url
	 */
	public ICalendarURL setSalesSession(SetSalesSession salesSession);
}
