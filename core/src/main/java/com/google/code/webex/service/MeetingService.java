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

import com.webex.schemas._2002._06.service.ICalendarURLType;
import com.webex.schemas._2002._06.service.meeting.CreateMeeting;
import com.webex.schemas._2002._06.service.meeting.CreateMeetingResponse;
import com.webex.schemas._2002._06.service.meeting.GetMeetingResponse;
import com.webex.schemas._2002._06.service.meeting.GetjoinurlMeetingResponse;
import com.webex.schemas._2002._06.service.meeting.MeetingSummaryInstanceType;
import com.webex.schemas._2002._06.service.meeting.SetMeeting;
import com.webex.schemas._2002._06.service.meeting.auo.CreateTeleconferenceSession;
import com.webex.schemas._2002._06.service.meeting.auo.GetTeleconferenceSessionResponse;
import com.webex.schemas._2002._06.service.meeting.auo.SetTeleconferenceSession;

/**
 * The Interface MeetingService.
 */
public interface MeetingService extends WebExService {
	
	/**
	 * Gets the meeting summaries.
	 * 
	 * @return the meeting summaries
	 */
	public List<MeetingSummaryInstanceType> getMeetingSummaries();
	
	/**
	 * Creates the meeting.
	 * 
	 * @param meeting the meeting
	 * 
	 * @return the creates the meeting response
	 */
	public CreateMeetingResponse createMeeting(CreateMeeting meeting);
	
	/**
	 * Creates the teleconference session.
	 * 
	 * @param teleconference the teleconference
	 * 
	 * @return the long
	 */
	public Long createTeleconferenceSession(CreateTeleconferenceSession teleconference);
	
	/**
	 * Delete meeting.
	 * 
	 * @param meetingKey the meeting key
	 * 
	 * @return the i calendar url type
	 */
	public ICalendarURLType deleteMeeting(long meetingKey);
	
	/**
	 * Gets the meeting host url.
	 * 
	 * @param meetingKey the meeting key
	 * @param sessionKey the session key
	 * 
	 * @return the meeting host url
	 */
	public String getMeetingHostUrl(Long meetingKey, Long sessionKey);
	
	/**
	 * Gets the meeting join url.
	 * 
	 * @param meetingKey the meeting key
	 * @param sessionKey the session key
	 * @param attendeeName the attendee name
	 * @param attendeeEmail the attendee email
	 * @param meetingPW the meeting pw
	 * @param regID the reg id
	 * 
	 * @return the meeting join url
	 */
	public GetjoinurlMeetingResponse getMeetingJoinUrl(Long meetingKey, Long sessionKey, String attendeeName, String attendeeEmail, String meetingPW, String regID);
	
	/**
	 * Gets the meeting.
	 * 
	 * @param meetingKey the meeting key
	 * 
	 * @return the meeting
	 */
	public GetMeetingResponse getMeeting(Long meetingKey);
	
	/**
	 * Gets the teleconference session.
	 * 
	 * @param sessionKey the session key
	 * 
	 * @return the teleconference session
	 */
	public GetTeleconferenceSessionResponse getTeleconferenceSession(Long sessionKey);
	
	/**
	 * Sets the meeting.
	 * 
	 * @param setMeeting the set meeting
	 * 
	 * @return the i calendar url type
	 */
	public ICalendarURLType setMeeting(SetMeeting setMeeting);
	
	/**
	 * Sets the teleconference session.
	 * 
	 * @param setSession the new teleconference session
	 */
	public void setTeleconferenceSession(SetTeleconferenceSession setSession);
}
