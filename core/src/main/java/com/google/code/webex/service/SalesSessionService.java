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
 * @author nmukhtar
 *
 */
public interface SalesSessionService extends WebExService {
	public List<Long> addProducts(List<ProductType> products);
	public Long createAccount(String webExID, AccountType account);
	public Long createOpportunity(String webExID, OpptyType opportunity);
	public CreateSalesSessionResponse createSalesSession(CreateSalesSession salesSession);
	public ICalendarURL deleteSalesSession(long meetingKey);
	public GetSalesSessionResponse getSalesSession(long meetingKey);
	public List<AccountInstanceType> getAccounts(String webExID, Long intAccountID, String extAccountID, Long extSystemID, Boolean returnOppty);
	public List<LstOpportunitiesResponse.Opportunity> getOpportunities(String webExID, Long intAccountID, String extAccountID, Long intOpptyID, String extOpptyID, Long extSystemID);
	public List<ProductInstanceType> getProducts(String name, List<Long> prodIDs);
	public List<SalesSessionSummaryInstanceType> getSalesSessionSummaries(DateScopeType dateScope, Long meetingKey, String hostWebExID, String account, String opportunity);
	public Long setAccount(String webExID, SetAccount.Account account);
	public Long setOpportunity(String webExID, OpptyInstanceType opportunity);
	public List<Long> setProducts(List<ProductInstanceType> products);
	public ICalendarURL setSalesSession(SetSalesSession salesSession);
}
