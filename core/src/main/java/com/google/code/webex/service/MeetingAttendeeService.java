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

import com.webex.schemas._2002._06.service.attendee.AttendeeEmailType;
import com.webex.schemas._2002._06.service.attendee.AttendeeInstanceType;
import com.webex.schemas._2002._06.service.attendee.CreateMeetingAttendee;
import com.webex.schemas._2002._06.service.attendee.CreateMeetingAttendeeResponse;
import com.webex.schemas._2002._06.service.attendee.EnrollSessionType;
import com.webex.schemas._2002._06.service.attendee.JoinStatusType;
import com.webex.schemas._2002._06.service.attendee.RegisterAttendeeType;
import com.webex.schemas._2002._06.service.attendee.RegisterMeetingAttendeeResponse;

/**
 * @author nmukhtar
 *
 */
public interface MeetingAttendeeService extends WebExService {
	public CreateMeetingAttendeeResponse createMeetingAttendee(CreateMeetingAttendee attendee);
	public void deleteMeetingAttendees(List<Long> attendeeIDs, List<AttendeeEmailType> attendeeEmail, Boolean sendEmail);
	public List<EnrollSessionType> getEnrollmentInformation(Long confID, Long sessionKey);
	public List<AttendeeInstanceType> getMeetingAttendees(Long meetingKey, Long sessionKey, JoinStatusType joinStatus, Long confID, Boolean inclHistory);
	public List<RegisterMeetingAttendeeResponse.Register> registerMeetingAttendees(List<RegisterAttendeeType> attendees);

}
