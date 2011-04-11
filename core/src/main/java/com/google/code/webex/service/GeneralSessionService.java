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

import com.webex.schemas._2002._06.common.AddressTypeType;
import com.webex.schemas._2002._06.common.ServiceTypeType;
import com.webex.schemas._2002._06.service.ep.ContactOperationType;
import com.webex.schemas._2002._06.service.ep.ContactType;
import com.webex.schemas._2002._06.service.ep.DistListInstanceType;
import com.webex.schemas._2002._06.service.ep.GetOneClickSettingsResponse;
import com.webex.schemas._2002._06.service.ep.GetSessionInfoResponse;
import com.webex.schemas._2002._06.service.ep.LstOpenSessionResponse;
import com.webex.schemas._2002._06.service.ep.LstsummarySession;
import com.webex.schemas._2002._06.service.ep.RecordingType;
import com.webex.schemas._2002._06.service.ep.SessionSummaryInstanceType;
import com.webex.schemas._2002._06.service.ep.SetRecordingInfo;
import com.webex.schemas._2002._06.service.ep.SetupOneClickSettings;

/**
 * The Interface GeneralSessionService.
 */
public interface GeneralSessionService extends WebExService {
	
	/**
	 * Creates the contacts.
	 * 
	 * @param contacts the contacts
	 * 
	 * @return the list< long>
	 */
	public List<Long> createContacts(List<ContactType> contacts);
	
	/**
	 * Creates the distribution list.
	 * 
	 * @param name the name
	 * @param description the description
	 * @param contactIds the contact ids
	 * 
	 * @return the long
	 */
	public Long createDistributionList(String name, String description, List<Long> contactIds);
	
	/**
	 * Delete recording.
	 * 
	 * @param recordingId the recording id
	 * 
	 * @return the integer
	 */
	public Integer deleteRecording(Integer recordingId);
	
	/**
	 * Delete session.
	 * 
	 * @param sessionKey the session key
	 * @param sendEmail the send email
	 */
	public void deleteSession(Long sessionKey, boolean sendEmail);
	
	/**
	 * Gets the api version.
	 * 
	 * @return the api version
	 */
	public String getApiVersion();
	
	/**
	 * Gets the distribution lists.
	 * 
	 * @param distListID the dist list id
	 * @param name the name
	 * @param addressType the address type
	 * @param hostWebExID the host web ex id
	 * 
	 * @return the distribution lists
	 */
	public List<DistListInstanceType> getDistributionLists(Long distListID, String name, AddressTypeType addressType, String hostWebExID);
	
	/**
	 * Gets the open sessions.
	 * 
	 * @param serviceTypes the service types
	 * 
	 * @return the open sessions
	 */
	public List<LstOpenSessionResponse.Services> getOpenSessions(ServiceTypeType... serviceTypes);
	// TODO-NM: Some parameters remaining
	/**
	 * Gets the recordings.
	 * 
	 * @param hostWebExID the host web ex id
	 * @param sessionKey the session key
	 * @param returnSessionDetails the return session details
	 * 
	 * @return the recordings
	 */
	public List<RecordingType> getRecordings(String hostWebExID, Long sessionKey, boolean returnSessionDetails);
	
	/**
	 * Gets the session summaries.
	 * 
	 * @param sessionRequest the session request
	 * 
	 * @return the session summaries
	 */
	public List<SessionSummaryInstanceType> getSessionSummaries(LstsummarySession sessionRequest);
	
	/**
	 * Sets the distribution list.
	 * 
	 * @param distListID the dist list id
	 * @param name the name
	 * @param description the description
	 * @param contactIds the contact ids
	 * @param operationType the operation type
	 */
	public void setDistributionList(Long distListID, String name, String description, List<Long> contactIds, ContactOperationType operationType);
	
	/**
	 * Gets the one click settings.
	 * 
	 * @param hostWebExID the host web ex id
	 * 
	 * @return the one click settings
	 */
	public GetOneClickSettingsResponse getOneClickSettings(String hostWebExID);
	
	/**
	 * Sets the up one click settings.
	 * 
	 * @param oneClickSettings the new up one click settings
	 */
	public void setupOneClickSettings(SetupOneClickSettings oneClickSettings);
	
	/**
	 * Gets the session info.
	 * 
	 * @param sessionKey the session key
	 * @param sessionPassword the session password
	 * 
	 * @return the session info
	 */
	public GetSessionInfoResponse getSessionInfo(long sessionKey, String sessionPassword);
	
	/**
	 * Gets the contacts.
	 * 
	 * @param distListID the dist list id
	 * @param distListName the dist list name
	 * @param addressType the address type
	 * @param hostWebExID the host web ex id
	 * 
	 * @return the contacts
	 */
	public List<ContactType> getContacts(Long distListID, String distListName, AddressTypeType addressType, String hostWebExID);
	
	/**
	 * Sets the recording info.
	 * 
	 * @param recordingInfo the recording info
	 * 
	 * @return the integer
	 */
	public Integer setRecordingInfo(SetRecordingInfo recordingInfo);
}
