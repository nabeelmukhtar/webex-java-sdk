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
 * @author nmukhtar
 *
 */
public interface GeneralSessionService extends WebExService {
	public List<Long> createContacts(List<ContactType> contacts);
	public Long createDistributionList(String name, String description, List<Long> contactIds);
	public Integer deleteRecording(Integer recordingId);
	public void deleteSession(Long sessionKey, boolean sendEmail);
	public String getApiVersion();
	public List<DistListInstanceType> getDistributionLists(Long distListID, String name, AddressTypeType addressType, String hostWebExID);
	public List<LstOpenSessionResponse.Services> getOpenSessions(ServiceTypeType... serviceTypes);
	// TODO-NM: Some parameters remaining
	public List<RecordingType> getRecordings(String hostWebExID, Long sessionKey, boolean returnSessionDetails);
	public List<SessionSummaryInstanceType> getSessionSummaries(LstsummarySession sessionRequest);
	public void setDistributionList(Long distListID, String name, String description, List<Long> contactIds, ContactOperationType operationType);
	public GetOneClickSettingsResponse getOneClickSettings(String hostWebExID);
	public void setupOneClickSettings(SetupOneClickSettings oneClickSettings);
	public GetSessionInfoResponse getSessionInfo(long sessionKey, String sessionPassword);
	public List<ContactType> getContacts(Long distListID, String distListName, AddressTypeType addressType, String hostWebExID);
	public Integer setRecordingInfo(SetRecordingInfo recordingInfo);
}
