/*
 * Copyright 2010 Nabeel Mukhtar 
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
import com.webex.schemas._2002._06.service.meeting.MeetingSummaryInstanceType;

/**
 * The Class ClassifierExample.
 * 
 * @author Nabeel Mukhtar
 */
public class MeetingServiceExample {

    /**
     * The main method.
     * 
     * @param args the args
     */
	public static void main(String[] args) {
		final WebExServiceFactory factory = WebExServiceFactory.newInstance("nabeeltesting", "Olympic99", 243585L, "apidemoeu", "g0webx!");
		MeetingService service = factory.createMeetingService();
		List<MeetingSummaryInstanceType> meetingSummaries = service.getMeetingSummaries();
		for (MeetingSummaryInstanceType meetingSummary : meetingSummaries) {
			System.out.println(meetingSummary.getConfName());
		}
	}
	
}
