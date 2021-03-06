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
package com.google.code.webex.service.examples;

import java.util.List;

import com.google.code.webex.service.MeetingService;
import com.google.code.webex.service.WebExServiceFactory;
import com.google.code.webex.service.constant.TestConstants;
import com.webex.schemas._2002._06.service.meeting.MeetingSummaryInstanceType;

/**
 * The Class MeetingServiceExample.
 */
public class MeetingServiceExample {

    /**
     * The main method.
     * 
     * @param args the arguments
     */
	public static void main(String[] args) {
		final WebExServiceFactory factory = WebExServiceFactory.newInstance(TestConstants.TEST_WEBEX_ID, TestConstants.TEST_PASSWORD, TestConstants.TEST_SITE_ID, TestConstants.TEST_SITE_NAME, TestConstants.TEST_PARTNER_ID);
		MeetingService service = factory.createMeetingService();
		List<MeetingSummaryInstanceType> meetingSummaries = service.getMeetingSummaries();
		for (MeetingSummaryInstanceType meetingSummary : meetingSummaries) {
			System.out.println(meetingSummary.getConfName());
			System.out.println(meetingSummary.getMeetingKey());
			System.out.println(meetingSummary.getMeetingType());
			System.out.println(meetingSummary.getStartDate());
			System.out.println(meetingSummary.getDuration());
			System.out.println(meetingSummary.getListStatus());
		}
	}
	
}
