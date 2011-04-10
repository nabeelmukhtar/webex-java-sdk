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

import com.webex.schemas._2002._06.service.session.DateScopeType;
import com.webex.schemas._2002._06.service.trainingsession.AvailabilityLabType;
import com.webex.schemas._2002._06.service.trainingsession.CreateTrainingSession;
import com.webex.schemas._2002._06.service.trainingsession.CreateTrainingSessionResponse;
import com.webex.schemas._2002._06.service.trainingsession.GetTestInformationResponse;
import com.webex.schemas._2002._06.service.trainingsession.GetTrainingSessionResponse;
import com.webex.schemas._2002._06.service.trainingsession.LabInfoType;
import com.webex.schemas._2002._06.service.trainingsession.ScheduleLabType;
import com.webex.schemas._2002._06.service.trainingsession.ScheduledTestInstanceType;
import com.webex.schemas._2002._06.service.trainingsession.SetTrainingSession;
import com.webex.schemas._2002._06.service.trainingsession.TestStatusType;
import com.webex.schemas._2002._06.service.trainingsession.TrainingSessionSummaryInstanceType;
import com.webex.schemas._2002._06.service.trainingsessionqti.QtiResultReportType;
import com.webex.schemas._2002._06.service.trainingsessionqtiasi.QuestestinteropType;

/**
 * @author nmukhtar
 *
 */
public interface TrainingSessionService extends WebExService {
	public List<AvailabilityLabType> checkLabAvailability(String labName, int timeZoneID, String sessionStartTime, String sessionEndTime, int numComputers);
	public CreateTrainingSessionResponse createTrainingSession(CreateTrainingSession trainingSession);
	public void deleteTrainingSession(long sessionKey);
	public QuestestinteropType getImsTestDetails(Long testID);
	public QtiResultReportType getImsTestResult(Long testID, String participantEmail);
	public List<LabInfoType> getLabInformation(String labName);
	public List<ScheduleLabType> getLabSchedule(String labName, int timeZoneID, String sessionStartTime, String sessionEndTime);
	public GetTestInformationResponse getTestInformation(Long testID);
	public GetTrainingSessionResponse getTrainingSession(long sessionKey);
	public List<ScheduledTestInstanceType> getScheduledTests(DateScopeType dateScope, Long sessionKey, TestStatusType status, String author);
	public List<TrainingSessionSummaryInstanceType> getTrainingSessionSummaries(DateScopeType dateScope, Long sessionKey, String hostWebExID);
	public void setTrainingSession(SetTrainingSession trainingSession);

}
