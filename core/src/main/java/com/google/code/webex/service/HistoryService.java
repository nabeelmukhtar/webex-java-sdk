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
 * @author nmukhtar
 *
 */
public interface HistoryService extends WebExService {
	public List<EventAttendeeHistoryInstanceType> getEventAttendeeHistory(StartTimeScopeType startTimeScope, EndTimeScopeType endTimeScope, Long sessionKey, String confName, Long confID, Boolean attendeeStats);
	public List<EventSessionHistoryInstanceType> getEventSessionHistory(String hostWebExID, String confName, StartTimeValueType startTimeScope, EndTimeScopeType endTimeScope, Long sessionKey, Long confID, Integer timeZoneID);
	public List<MeetingAttendeeHistoryInstanceType> getMeetingAttendeeHistory(Long meetingKey, StartTimeValueType startTimeScope, EndTimeScopeType endTimeScope, String confName, Long confID, Boolean inclAudioOnly);
	public List<MeetingUsageHistoryInstanceType> getMeetingUsageHistory(String confName, Long meetingKey, String hostWebExID, Long confID, Boolean inclAudioOnly, Integer timeZoneID, StartTimeScopeType startTimeScope, EndTimeScopeType endTimeScope);
	public List<RecordAccessDetailHistoryType> getRecordAccessDetailHistory(Long recordID, Integer timeZoneID, Boolean returnRegFields);
	public List<RecordAccessHistoryInstanceType> getRecordAccessHistory(CreationTimeScopeType creationTimeScope, ViewTimeScopeType viewTimeScope, Integer timeZoneID, String recordName, String hostWebExID);
	public List<SalesAttendeeHistoryInstanceType> getSalesAttendeeHistory(Long meetingKey, StartTimeValueType startTimeScope, EndTimeScopeType endTimeScope, String confName, Long confID, Long timeZoneID, Boolean inclAudioOnly);
	public List<SalesSessionHistoryInstanceType> getSalesSessionHistory(String confName, Long meetingKey, String hostWebExID, Long confID, Boolean inclAudioOnly, Integer timeZoneID, StartTimeScopeType startTimeScope, EndTimeScopeType endTimeScope, String account, String opportunity);
	public List<SupportAttendeeHistoryInstanceType> getSupportAttendeeHistory(Long sessionKey, StartTimeScopeType startTimeScope, EndTimeScopeType endTimeScope, Long confID);
	public List<SupportSessionHistoryInstanceType> getSupportSessionHistory(Long sessionKey, String hostWebExID, StartTimeValueType startTimeScope, EndTimeScopeType endTimeScope, Long confID, Integer timeZoneID);
	public List<TrainingAttendeeHistoryInstanceType> getTrainingAttendeeHistory(Long sessionKey, StartTimeScopeType startTimeScope, EndTimeScopeType endTimeScope, Long confID, Integer timeZoneID);
	public List<TrainSessionHistoryInstanceType> getTrainingSessionHistory(Long sessionKey, String confName, StartTimeScopeType startTimeScope, EndTimeScopeType endTimeScope, String hostWebExID, Long confID, Integer timeZoneID, Boolean returnPSOFields, PsoFieldsType psoFields);

}
