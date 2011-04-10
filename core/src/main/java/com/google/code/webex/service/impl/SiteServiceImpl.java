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

import com.google.code.webex.service.SiteService;
import com.google.code.webex.service.util.ApplicationConstants;
import com.google.code.webex.service.util.WebExUrls;
import com.google.code.webex.service.util.WebExUrls.WebExUrlBuilder;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.MessageType;
import com.webex.schemas._2002._06.service.site.GetSite;
import com.webex.schemas._2002._06.service.site.GetSiteResponse;
import com.webex.schemas._2002._06.service.site.LstTimeZone;
import com.webex.schemas._2002._06.service.site.LstTimeZoneResponse;
import com.webex.schemas._2002._06.service.site.ObjectFactory;
import com.webex.schemas._2002._06.service.site.SiteType;
import com.webex.schemas._2002._06.service.site.TimeZoneType;

public class SiteServiceImpl extends WebExJaxbService implements
	SiteService {

	public SiteServiceImpl(String webExId, String password,
			Long siteId, String siteName, String partnerId) {
		super(webExId, password, siteId, siteName, partnerId);
	}

	@Override
	public SiteType getSite(boolean eventCenter) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		GetSite getSite = factory.createGetSite();
		getSite.setReturnSettings(factory.createGetSiteReturnSettings());
		getSite.getReturnSettings().setEventCenter(eventCenter);
		MessageType request = createRequest(getSite);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((GetSiteResponse) bodyContents.get(0)).getSiteInstance();			
		}
		
		return null;
	}

	@Override
	public List<TimeZoneType> getTimezones(List<Long> timeZoneID, String date) {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		LstTimeZone getTimeZones = factory.createLstTimeZone();
		getTimeZones.getTimeZoneID().addAll(timeZoneID);
		getTimeZones.setDate(date);
		MessageType request = createRequest(getTimeZones);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((LstTimeZoneResponse) bodyContents.get(0)).getTimeZone();			
		}
		return new ArrayList<TimeZoneType>();
	}
}
