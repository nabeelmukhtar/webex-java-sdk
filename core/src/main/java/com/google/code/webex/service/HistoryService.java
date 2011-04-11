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

import com.webex.schemas._2002._06.common.PsoFieldsType;
import com.webex.schemas._2002._06.service.history.CreationTimeScopeType;
import com.webex.schemas._2002._06.service.history.EndTimeScopeType;
import com.webex.schemas._2002._06.service.history.EventAttendeeHistoryInstanceType;
import com.webex.schemas._2002._06.service.history.EventSessionHistoryInstanceType;
import com.webex.schemas._2002._06.service.history.MeetingAttendeeHistoryInstanceType;
import com.webex.schemas._2002._06.service.history.MeetingUsageHistoryInstanceType;
import com.webex.schemas._2002._06.service.history.RecordAccessDetailHistoryType;
import com.webex.schemas._2002._06.service.history.RecordAccessHistoryInstanceType;
import com.webex.schemas._2002._06.service.history.SalesAttendeeHistoryInstanceType;
import com.webex.schemas._2002._06.service.history.SalesSessionHistoryInstanceType;
import com.webex.schemas._2002._06.service.history.StartTimeScopeType;
import com.webex.schemas._2002._06.service.history.StartTimeValueType;
import com.webex.schemas._2002._06.service.history.SupportAttendeeHistoryInstanceType;
import com.webex.schemas._2002._06.service.history.SupportSessionHistoryInstanceType;
import com.webex.schemas._2002._06.service.history.TrainSessionHistoryInstanceType;
import com.webex.schemas._2002._06.service.history.TrainingAttendeeHistoryInstanceType;
import com.webex.schemas._2002._06.service.history.ViewTimeScopeType;

/**
 * The Interface HistoryService.
 */
public interface HistoryService extends WebExService {
	
	/**
	 * Gets the event attendee history.
	 * 
	 * @param startTimeScope the start time scope
	 * @param endTimeScope the end time scope
	 * @param sessionKey the session key
	 * @param confName the conf name
	 * @param confID the conf id
	 * @param attendeeStats the attendee stats
	 * 
	 * @return the event attendee history
	 */
	public List<EventAttendeeHistoryInstanceType> getEventAttendeeHistory(StartTimeScopeType startTimeScope, EndTimeScopeType endTimeScope, Long sessionKey, String confName, Long confID, Boolean attendeeStats);
	
	/**
	 * Gets the event session history.
	 * 
	 * @param hostWebExID the host web ex id
	 * @param confName the conf name
	 * @param startTimeScope the start time scope
	 * @param endTimeScope the end time scope
	 * @param sessionKey the session key
	 * @param confID the conf id
	 * @param timeZoneID the time zone id
	 * 
	 * @return the event session history
	 */
	public List<EventSessionHistoryInstanceType> getEventSessionHistory(String hostWebExID, String confName, StartTimeValueType startTimeScope, EndTimeScopeType endTimeScope, Long sessionKey, Long confID, Integer timeZoneID);
	
	/**
	 * Gets the meeting attendee history.
	 * 
	 * @param meetingKey the meeting key
	 * @param startTimeScope the start time scope
	 * @param endTimeScope the end time scope
	 * @param confName the conf name
	 * @param confID the conf id
	 * @param inclAudioOnly the incl audio only
	 * 
	 * @return the meeting attendee history
	 */
	public List<MeetingAttendeeHistoryInstanceType> getMeetingAttendeeHistory(Long meetingKey, StartTimeValueType startTimeScope, EndTimeScopeType endTimeScope, String confName, Long confID, Boolean inclAudioOnly);
	
	/**
	 * Gets the meeting usage history.
	 * 
	 * @param confName the conf name
	 * @param meetingKey the meeting key
	 * @param hostWebExID the host web ex id
	 * @param confID the conf id
	 * @param inclAudioOnly the incl audio only
	 * @param timeZoneID the time zone id
	 * @param startTimeScope the start time scope
	 * @param endTimeScope the end time scope
	 * 
	 * @return the meeting usage history
	 */
	public List<MeetingUsageHistoryInstanceType> getMeetingUsageHistory(String confName, Long meetingKey, String hostWebExID, Long confID, Boolean inclAudioOnly, Integer timeZoneID, StartTimeScopeType startTimeScope, EndTimeScopeType endTimeScope);
	
	/**
	 * Gets the record access detail history.
	 * 
	 * @param recordID the record id
	 * @param timeZoneID the time zone id
	 * @param returnRegFields the return reg fields
	 * 
	 * @return the record access detail history
	 */
	public List<RecordAccessDetailHistoryType> getRecordAccessDetailHistory(Long recordID, Integer timeZoneID, Boolean returnRegFields);
	
	/**
	 * Gets the record access history.
	 * 
	 * @param creationTimeScope the creation time scope
	 * @param viewTimeScope the view time scope
	 * @param timeZoneID the time zone id
	 * @param recordName the record name
	 * @param hostWebExID the host web ex id
	 * 
	 * @return the record access history
	 */
	public List<RecordAccessHistoryInstanceType> getRecordAccessHistory(CreationTimeScopeType creationTimeScope, ViewTimeScopeType viewTimeScope, Integer timeZoneID, String recordName, String hostWebExID);
	
	/**
	 * Gets the sales attendee history.
	 * 
	 * @param meetingKey the meeting key
	 * @param startTimeScope the start time scope
	 * @param endTimeScope the end time scope
	 * @param confName the conf name
	 * @param confID the conf id
	 * @param timeZoneID the time zone id
	 * @param inclAudioOnly the incl audio only
	 * 
	 * @return the sales attendee history
	 */
	public List<SalesAttendeeHistoryInstanceType> getSalesAttendeeHistory(Long meetingKey, StartTimeValueType startTimeScope, EndTimeScopeType endTimeScope, String confName, Long confID, Long timeZoneID, Boolean inclAudioOnly);
	
	/**
	 * Gets the sales session history.
	 * 
	 * @param confName the conf name
	 * @param meetingKey the meeting key
	 * @param hostWebExID the host web ex id
	 * @param confID the conf id
	 * @param inclAudioOnly the incl audio only
	 * @param timeZoneID the time zone id
	 * @param startTimeScope the start time scope
	 * @param endTimeScope the end time scope
	 * @param account the account
	 * @param opportunity the opportunity
	 * 
	 * @return the sales session history
	 */
	public List<SalesSessionHistoryInstanceType> getSalesSessionHistory(String confName, Long meetingKey, String hostWebExID, Long confID, Boolean inclAudioOnly, Integer timeZoneID, StartTimeScopeType startTimeScope, EndTimeScopeType endTimeScope, String account, String opportunity);
	
	/**
	 * Gets the support attendee history.
	 * 
	 * @param sessionKey the session key
	 * @param startTimeScope the start time scope
	 * @param endTimeScope the end time scope
	 * @param confID the conf id
	 * 
	 * @return the support attendee history
	 */
	public List<SupportAttendeeHistoryInstanceType> getSupportAttendeeHistory(Long sessionKey, StartTimeScopeType startTimeScope, EndTimeScopeType endTimeScope, Long confID);
	
	/**
	 * Gets the support session history.
	 * 
	 * @param sessionKey the session key
	 * @param hostWebExID the host web ex id
	 * @param startTimeScope the start time scope
	 * @param endTimeScope the end time scope
	 * @param confID the conf id
	 * @param timeZoneID the time zone id
	 * 
	 * @return the support session history
	 */
	public List<SupportSessionHistoryInstanceType> getSupportSessionHistory(Long sessionKey, String hostWebExID, StartTimeValueType startTimeScope, EndTimeScopeType endTimeScope, Long confID, Integer timeZoneID);
	
	/**
	 * Gets the training attendee history.
	 * 
	 * @param sessionKey the session key
	 * @param startTimeScope the start time scope
	 * @param endTimeScope the end time scope
	 * @param confID the conf id
	 * @param timeZoneID the time zone id
	 * 
	 * @return the training attendee history
	 */
	public List<TrainingAttendeeHistoryInstanceType> getTrainingAttendeeHistory(Long sessionKey, StartTimeScopeType startTimeScope, EndTimeScopeType endTimeScope, Long confID, Integer timeZoneID);
	
	/**
	 * Gets the training session history.
	 * 
	 * @param sessionKey the session key
	 * @param confName the conf name
	 * @param startTimeScope the start time scope
	 * @param endTimeScope the end time scope
	 * @param hostWebExID the host web ex id
	 * @param confID the conf id
	 * @param timeZoneID the time zone id
	 * @param returnPSOFields the return pso fields
	 * @param psoFields the pso fields
	 * 
	 * @return the training session history
	 */
	public List<TrainSessionHistoryInstanceType> getTrainingSessionHistory(Long sessionKey, String confName, StartTimeScopeType startTimeScope, EndTimeScopeType endTimeScope, String hostWebExID, Long confID, Integer timeZoneID, Boolean returnPSOFields, PsoFieldsType psoFields);

}
