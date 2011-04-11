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
 * The Interface MeetingAttendeeService.
 */
public interface MeetingAttendeeService extends WebExService {
	
	/**
	 * Creates the meeting attendee.
	 * 
	 * @param attendee the attendee
	 * 
	 * @return the creates the meeting attendee response
	 */
	public CreateMeetingAttendeeResponse createMeetingAttendee(CreateMeetingAttendee attendee);
	
	/**
	 * Delete meeting attendees.
	 * 
	 * @param attendeeIDs the attendee i ds
	 * @param attendeeEmail the attendee email
	 * @param sendEmail the send email
	 */
	public void deleteMeetingAttendees(List<Long> attendeeIDs, List<AttendeeEmailType> attendeeEmail, Boolean sendEmail);
	
	/**
	 * Gets the enrollment information.
	 * 
	 * @param confID the conf id
	 * @param sessionKey the session key
	 * 
	 * @return the enrollment information
	 */
	public List<EnrollSessionType> getEnrollmentInformation(Long confID, Long sessionKey);
	
	/**
	 * Gets the meeting attendees.
	 * 
	 * @param meetingKey the meeting key
	 * @param sessionKey the session key
	 * @param joinStatus the join status
	 * @param confID the conf id
	 * @param inclHistory the incl history
	 * 
	 * @return the meeting attendees
	 */
	public List<AttendeeInstanceType> getMeetingAttendees(Long meetingKey, Long sessionKey, JoinStatusType joinStatus, Long confID, Boolean inclHistory);
	
	/**
	 * Register meeting attendees.
	 * 
	 * @param attendees the attendees
	 * 
	 * @return the list< register meeting attendee response. register>
	 */
	public List<RegisterMeetingAttendeeResponse.Register> registerMeetingAttendees(List<RegisterAttendeeType> attendees);

}
