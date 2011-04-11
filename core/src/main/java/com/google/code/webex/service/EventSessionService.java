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
 * The Interface EventSessionService.
 */
public interface EventSessionService extends WebExService {
	
	/**
	 * Creates the event.
	 * 
	 * @param event the event
	 * 
	 * @return the creates the event response
	 */
	public CreateEventResponse createEvent(CreateEvent event);
	
	/**
	 * Delete event.
	 * 
	 * @param sessionKey the session key
	 */
	public void deleteEvent(long sessionKey);
	
	/**
	 * Gets the event.
	 * 
	 * @param sessionKey the session key
	 * 
	 * @return the event
	 */
	public GetEventResponse getEvent(long sessionKey);
	
	/**
	 * Gets the recorded events.
	 * 
	 * @param dateScope the date scope
	 * @param hostWebExID the host web ex id
	 * @param programID the program id
	 * 
	 * @return the recorded events
	 */
	public List<RecordedEventsType> getRecordedEvents(DateScopeType dateScope, String hostWebExID, Long programID);
	
	/**
	 * Gets the event summaries.
	 * 
	 * @param dateScope the date scope
	 * @param sessionKey the session key
	 * @param hostWebExID the host web ex id
	 * @param programID the program id
	 * @param attendeeStats the attendee stats
	 * 
	 * @return the event summaries
	 */
	public List<EventSummaryInstanceType> getEventSummaries(DateScopeType dateScope, Long sessionKey, String hostWebExID, Long programID, Boolean attendeeStats);
	
	/**
	 * Gets the program summaries.
	 * 
	 * @param programID the program id
	 * 
	 * @return the program summaries
	 */
	public List<ProgramSummaryType> getProgramSummaries(Long programID);
	
	/**
	 * Send invitation emails.
	 * 
	 * @param sessionKey the session key
	 * @param attendees the attendees
	 * @param panelists the panelists
	 * 
	 * @return the list< string>
	 */
	public List<String> sendInvitationEmails(long sessionKey, Boolean attendees, Boolean panelists);
	
	/**
	 * Sets the event.
	 * 
	 * @param event the new event
	 */
	public void setEvent(SetEvent event);
	
	/**
	 * Upload event image.
	 * 
	 * @param sessionKey the session key
	 * @param imageType the image type
	 * @param imageData the image data
	 */
	public void uploadEventImage(long sessionKey, ImageTypeType imageType, byte[] imageData);
}
