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
 * The Interface TrainingSessionService.
 */
public interface TrainingSessionService extends WebExService {
	
	/**
	 * Check lab availability.
	 * 
	 * @param labName the lab name
	 * @param timeZoneID the time zone id
	 * @param sessionStartTime the session start time
	 * @param sessionEndTime the session end time
	 * @param numComputers the num computers
	 * 
	 * @return the list< availability lab type>
	 */
	public List<AvailabilityLabType> checkLabAvailability(String labName, int timeZoneID, String sessionStartTime, String sessionEndTime, int numComputers);
	
	/**
	 * Creates the training session.
	 * 
	 * @param trainingSession the training session
	 * 
	 * @return the creates the training session response
	 */
	public CreateTrainingSessionResponse createTrainingSession(CreateTrainingSession trainingSession);
	
	/**
	 * Delete training session.
	 * 
	 * @param sessionKey the session key
	 */
	public void deleteTrainingSession(long sessionKey);
	
	/**
	 * Gets the ims test details.
	 * 
	 * @param testID the test id
	 * 
	 * @return the ims test details
	 */
	public QuestestinteropType getImsTestDetails(Long testID);
	
	/**
	 * Gets the ims test result.
	 * 
	 * @param testID the test id
	 * @param participantEmail the participant email
	 * 
	 * @return the ims test result
	 */
	public QtiResultReportType getImsTestResult(Long testID, String participantEmail);
	
	/**
	 * Gets the lab information.
	 * 
	 * @param labName the lab name
	 * 
	 * @return the lab information
	 */
	public List<LabInfoType> getLabInformation(String labName);
	
	/**
	 * Gets the lab schedule.
	 * 
	 * @param labName the lab name
	 * @param timeZoneID the time zone id
	 * @param sessionStartTime the session start time
	 * @param sessionEndTime the session end time
	 * 
	 * @return the lab schedule
	 */
	public List<ScheduleLabType> getLabSchedule(String labName, int timeZoneID, String sessionStartTime, String sessionEndTime);
	
	/**
	 * Gets the test information.
	 * 
	 * @param testID the test id
	 * 
	 * @return the test information
	 */
	public GetTestInformationResponse getTestInformation(Long testID);
	
	/**
	 * Gets the training session.
	 * 
	 * @param sessionKey the session key
	 * 
	 * @return the training session
	 */
	public GetTrainingSessionResponse getTrainingSession(long sessionKey);
	
	/**
	 * Gets the scheduled tests.
	 * 
	 * @param dateScope the date scope
	 * @param sessionKey the session key
	 * @param status the status
	 * @param author the author
	 * 
	 * @return the scheduled tests
	 */
	public List<ScheduledTestInstanceType> getScheduledTests(DateScopeType dateScope, Long sessionKey, TestStatusType status, String author);
	
	/**
	 * Gets the training session summaries.
	 * 
	 * @param dateScope the date scope
	 * @param sessionKey the session key
	 * @param hostWebExID the host web ex id
	 * 
	 * @return the training session summaries
	 */
	public List<TrainingSessionSummaryInstanceType> getTrainingSessionSummaries(DateScopeType dateScope, Long sessionKey, String hostWebExID);
	
	/**
	 * Sets the training session.
	 * 
	 * @param trainingSession the new training session
	 */
	public void setTrainingSession(SetTrainingSession trainingSession);

}
