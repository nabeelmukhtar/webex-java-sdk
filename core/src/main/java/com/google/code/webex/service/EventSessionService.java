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

import com.webex.schemas._2002._06.service.event.CreateEvent;
import com.webex.schemas._2002._06.service.event.CreateEventResponse;
import com.webex.schemas._2002._06.service.event.DateScopeType;
import com.webex.schemas._2002._06.service.event.EventSummaryInstanceType;
import com.webex.schemas._2002._06.service.event.GetEventResponse;
import com.webex.schemas._2002._06.service.event.ImageTypeType;
import com.webex.schemas._2002._06.service.event.ProgramSummaryType;
import com.webex.schemas._2002._06.service.event.RecordedEventsType;
import com.webex.schemas._2002._06.service.event.SetEvent;

/**
 * @author nmukhtar
 *
 */
public interface EventSessionService extends WebExService {
	public CreateEventResponse createEvent(CreateEvent event);
	public void deleteEvent(long sessionKey);
	public GetEventResponse getEvent(long sessionKey);
	public List<RecordedEventsType> getRecordedEvents(DateScopeType dateScope, String hostWebExID, Long programID);
	public List<EventSummaryInstanceType> getEventSummaries(DateScopeType dateScope, Long sessionKey, String hostWebExID, Long programID, Boolean attendeeStats);
	public List<ProgramSummaryType> getProgramSummaries(Long programID);
	public List<String> sendInvitationEmails(long sessionKey, Boolean attendees, Boolean panelists);
	public void setEvent(SetEvent event);
	public void uploadEventImage(long sessionKey, ImageTypeType imageType, byte[] imageData);
}
