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
 * @author nmukhtar
 *
 */
public interface MeetingService extends WebExService {
	
	public List<MeetingSummaryInstanceType> getMeetingSummaries();
	public CreateMeetingResponse createMeeting(CreateMeeting meeting);
	public Long createTeleconferenceSession(CreateTeleconferenceSession teleconference);
	public ICalendarURLType deleteMeeting(long meetingKey);
	public String getMeetingHostUrl(Long meetingKey, Long sessionKey);
	public GetjoinurlMeetingResponse getMeetingJoinUrl(Long meetingKey, Long sessionKey, String attendeeName, String attendeeEmail, String meetingPW, String regID);
	public GetMeetingResponse getMeeting(Long meetingKey);
	public GetTeleconferenceSessionResponse getTeleconferenceSession(Long sessionKey);
	public ICalendarURLType setMeeting(SetMeeting setMeeting);
	public void setTeleconferenceSession(SetTeleconferenceSession setSession);
}
