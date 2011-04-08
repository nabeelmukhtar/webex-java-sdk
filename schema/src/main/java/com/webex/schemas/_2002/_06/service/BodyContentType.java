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

package com.webex.schemas._2002._06.service;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.attendee.AttendeeType;
import com.webex.schemas._2002._06.service.attendee.CreateMeetingAttendeeResponse;
import com.webex.schemas._2002._06.service.attendee.DelMeetingAttendee;
import com.webex.schemas._2002._06.service.attendee.DelMeetingAttendeeResponse;
import com.webex.schemas._2002._06.service.attendee.GetEnrollmentInfo;
import com.webex.schemas._2002._06.service.attendee.GetEnrollmentInfoResponse;
import com.webex.schemas._2002._06.service.attendee.GetFeedbackInfo;
import com.webex.schemas._2002._06.service.attendee.GetFeedbackInfoResponse;
import com.webex.schemas._2002._06.service.attendee.LstMeetingAttendee;
import com.webex.schemas._2002._06.service.attendee.LstMeetingAttendeeResponse;
import com.webex.schemas._2002._06.service.attendee.RegisterAttendeeType;
import com.webex.schemas._2002._06.service.attendee.RegisterMeetingAttendee;
import com.webex.schemas._2002._06.service.attendee.RegisterMeetingAttendeeResponse;
import com.webex.schemas._2002._06.service.ep.CreateContacts;
import com.webex.schemas._2002._06.service.ep.CreateContactsResponse;
import com.webex.schemas._2002._06.service.ep.CreateDistList;
import com.webex.schemas._2002._06.service.ep.CreateDistListResponse;
import com.webex.schemas._2002._06.service.ep.DelRecording;
import com.webex.schemas._2002._06.service.ep.DelRecordingResponse;
import com.webex.schemas._2002._06.service.ep.DelSession;
import com.webex.schemas._2002._06.service.ep.DelSessionResponse;
import com.webex.schemas._2002._06.service.ep.GetAPIVersion;
import com.webex.schemas._2002._06.service.ep.GetAPIVersionResponse;
import com.webex.schemas._2002._06.service.ep.GetJoinSessionInfo;
import com.webex.schemas._2002._06.service.ep.GetJoinSessionInfoResponse;
import com.webex.schemas._2002._06.service.ep.GetOneClickSettings;
import com.webex.schemas._2002._06.service.ep.GetOneClickSettingsResponse;
import com.webex.schemas._2002._06.service.ep.GetRecordingInfo;
import com.webex.schemas._2002._06.service.ep.GetRecordingInfoResponse;
import com.webex.schemas._2002._06.service.ep.GetSessionInfo;
import com.webex.schemas._2002._06.service.ep.GetSessionInfoResponse;
import com.webex.schemas._2002._06.service.ep.LstContact;
import com.webex.schemas._2002._06.service.ep.LstContactResponse;
import com.webex.schemas._2002._06.service.ep.LstDistList;
import com.webex.schemas._2002._06.service.ep.LstDistListResponse;
import com.webex.schemas._2002._06.service.ep.LstOpenSession;
import com.webex.schemas._2002._06.service.ep.LstOpenSessionResponse;
import com.webex.schemas._2002._06.service.ep.LstRecording;
import com.webex.schemas._2002._06.service.ep.LstRecordingResponse;
import com.webex.schemas._2002._06.service.ep.LstsummarySession;
import com.webex.schemas._2002._06.service.ep.LstsummarySessionResponse;
import com.webex.schemas._2002._06.service.ep.SessionSummaryInstanceType;
import com.webex.schemas._2002._06.service.ep.SetDistList;
import com.webex.schemas._2002._06.service.ep.SetDistListResponse;
import com.webex.schemas._2002._06.service.ep.SetRecordingInfo;
import com.webex.schemas._2002._06.service.ep.SetRecordingInfoResponse;
import com.webex.schemas._2002._06.service.ep.SetupOneClickSettings;
import com.webex.schemas._2002._06.service.ep.SetupOneClickSettingsResponse;
import com.webex.schemas._2002._06.service.event.CreateEventResponse;
import com.webex.schemas._2002._06.service.event.DelEvent;
import com.webex.schemas._2002._06.service.event.DelEventResponse;
import com.webex.schemas._2002._06.service.event.EventType;
import com.webex.schemas._2002._06.service.event.GetEvent;
import com.webex.schemas._2002._06.service.event.LstrecordedEvent;
import com.webex.schemas._2002._06.service.event.LstrecordedEventResponse;
import com.webex.schemas._2002._06.service.event.LstsummaryEvent;
import com.webex.schemas._2002._06.service.event.LstsummaryEventResponse;
import com.webex.schemas._2002._06.service.event.LstsummaryProgram;
import com.webex.schemas._2002._06.service.event.LstsummaryProgramResponse;
import com.webex.schemas._2002._06.service.event.SendInvitationEmail;
import com.webex.schemas._2002._06.service.event.SendInvitationEmailResponse;
import com.webex.schemas._2002._06.service.event.SetEventResponse;
import com.webex.schemas._2002._06.service.event.UploadEventImage;
import com.webex.schemas._2002._06.service.event.UploadEventImageResponse;
import com.webex.schemas._2002._06.service.history.EventAttendeeHistoryInstanceType;
import com.webex.schemas._2002._06.service.history.EventSessionHistoryInstanceType;
import com.webex.schemas._2002._06.service.history.LsteventattendeeHistory;
import com.webex.schemas._2002._06.service.history.LsteventattendeeHistoryResponse;
import com.webex.schemas._2002._06.service.history.LsteventsessionHistory;
import com.webex.schemas._2002._06.service.history.LsteventsessionHistoryResponse;
import com.webex.schemas._2002._06.service.history.LstmeetingattendeeHistory;
import com.webex.schemas._2002._06.service.history.LstmeetingattendeeHistoryResponse;
import com.webex.schemas._2002._06.service.history.LstmeetingusageHistory;
import com.webex.schemas._2002._06.service.history.LstmeetingusageHistoryResponse;
import com.webex.schemas._2002._06.service.history.LstrecordaccessDetailHistory;
import com.webex.schemas._2002._06.service.history.LstrecordaccessDetailHistoryResponse;
import com.webex.schemas._2002._06.service.history.LstrecordaccessHistory;
import com.webex.schemas._2002._06.service.history.LstrecordaccessHistoryResponse;
import com.webex.schemas._2002._06.service.history.LstsalesAttendeeHistoryResponse;
import com.webex.schemas._2002._06.service.history.LstsalesSessionHistoryResponse;
import com.webex.schemas._2002._06.service.history.LstsupportattendeeHistory;
import com.webex.schemas._2002._06.service.history.LstsupportattendeeHistoryResponse;
import com.webex.schemas._2002._06.service.history.LstsupportsessionHistory;
import com.webex.schemas._2002._06.service.history.LstsupportsessionHistoryResponse;
import com.webex.schemas._2002._06.service.history.LsttrainingattendeeHistory;
import com.webex.schemas._2002._06.service.history.LsttrainingattendeeHistoryResponse;
import com.webex.schemas._2002._06.service.history.LsttrainingsessionHistory;
import com.webex.schemas._2002._06.service.history.LsttrainingsessionHistoryResponse;
import com.webex.schemas._2002._06.service.history.MeetingAttendeeHistoryInstanceType;
import com.webex.schemas._2002._06.service.history.MeetingUsageHistoryInstanceType;
import com.webex.schemas._2002._06.service.history.SupportAttendeeHistoryInstanceType;
import com.webex.schemas._2002._06.service.history.SupportSessionHistoryInstanceType;
import com.webex.schemas._2002._06.service.history.TrainSessionHistoryInstanceType;
import com.webex.schemas._2002._06.service.history.TrainingAttendeeHistoryInstanceType;
import com.webex.schemas._2002._06.service.meeting.CreateMeetingResponse;
import com.webex.schemas._2002._06.service.meeting.DelMeeting;
import com.webex.schemas._2002._06.service.meeting.DelMeetingResponse;
import com.webex.schemas._2002._06.service.meeting.GetMeeting;
import com.webex.schemas._2002._06.service.meeting.GethosturlMeeting;
import com.webex.schemas._2002._06.service.meeting.GethosturlMeetingResponse;
import com.webex.schemas._2002._06.service.meeting.GetjoinurlMeeting;
import com.webex.schemas._2002._06.service.meeting.GetjoinurlMeetingResponse;
import com.webex.schemas._2002._06.service.meeting.LstMeeting;
import com.webex.schemas._2002._06.service.meeting.LstMeetingResponse;
import com.webex.schemas._2002._06.service.meeting.LstsummaryMeeting;
import com.webex.schemas._2002._06.service.meeting.LstsummaryMeetingResponse;
import com.webex.schemas._2002._06.service.meeting.MeetingSummaryInstanceType;
import com.webex.schemas._2002._06.service.meeting.MeetingType;
import com.webex.schemas._2002._06.service.meeting.SetMeetingResponse;
import com.webex.schemas._2002._06.service.meeting.auo.AudioOnlyInstanceType;
import com.webex.schemas._2002._06.service.meeting.auo.AudioOnlyType;
import com.webex.schemas._2002._06.service.meeting.auo.CreateTeleconferenceSessionResponse;
import com.webex.schemas._2002._06.service.meeting.auo.GetTeleconferenceSession;
import com.webex.schemas._2002._06.service.meeting.auo.SetTeleconferenceSessionResponse;
import com.webex.schemas._2002._06.service.meetingtype.GetMeetingType;
import com.webex.schemas._2002._06.service.meetingtype.LstMeetingType;
import com.webex.schemas._2002._06.service.meetingtype.LstMeetingTypeResponse;
import com.webex.schemas._2002._06.service.meetingtype.MeetingTypeTypeExt;
import com.webex.schemas._2002._06.service.sales.AddProducts;
import com.webex.schemas._2002._06.service.sales.AddProductsResponse;
import com.webex.schemas._2002._06.service.sales.CreateAccount;
import com.webex.schemas._2002._06.service.sales.CreateAccountResponse;
import com.webex.schemas._2002._06.service.sales.CreateOpportunity;
import com.webex.schemas._2002._06.service.sales.CreateOpportunityResponse;
import com.webex.schemas._2002._06.service.sales.CreateSalesSessionResponse;
import com.webex.schemas._2002._06.service.sales.DelSalesSession;
import com.webex.schemas._2002._06.service.sales.DelSalesSessionResponse;
import com.webex.schemas._2002._06.service.sales.GetSalesSession;
import com.webex.schemas._2002._06.service.sales.LstAccounts;
import com.webex.schemas._2002._06.service.sales.LstAccountsResponse;
import com.webex.schemas._2002._06.service.sales.LstOpportunities;
import com.webex.schemas._2002._06.service.sales.LstOpportunitiesResponse;
import com.webex.schemas._2002._06.service.sales.LstProducts;
import com.webex.schemas._2002._06.service.sales.LstProductsResponse;
import com.webex.schemas._2002._06.service.sales.LstsummarySalesSession;
import com.webex.schemas._2002._06.service.sales.LstsummarySalesSessionResponse;
import com.webex.schemas._2002._06.service.sales.SalesSessionSummaryInstanceType;
import com.webex.schemas._2002._06.service.sales.SalesSessionType;
import com.webex.schemas._2002._06.service.sales.SetAccount;
import com.webex.schemas._2002._06.service.sales.SetAccountResponse;
import com.webex.schemas._2002._06.service.sales.SetOpportunity;
import com.webex.schemas._2002._06.service.sales.SetOpportunityResponse;
import com.webex.schemas._2002._06.service.sales.SetProducts;
import com.webex.schemas._2002._06.service.sales.SetProductsResponse;
import com.webex.schemas._2002._06.service.sales.SetSalesSessionResponse;
import com.webex.schemas._2002._06.service.session.ParticipantType;
import com.webex.schemas._2002._06.service.session.SessionType;
import com.webex.schemas._2002._06.service.site.GetSite;
import com.webex.schemas._2002._06.service.site.GetSiteResponse;
import com.webex.schemas._2002._06.service.site.GetWebACDQueues;
import com.webex.schemas._2002._06.service.site.GetWebACDQueuesResponse;
import com.webex.schemas._2002._06.service.site.LstTimeZone;
import com.webex.schemas._2002._06.service.site.LstTimeZoneResponse;
import com.webex.schemas._2002._06.service.site.SetSite;
import com.webex.schemas._2002._06.service.site.SetSiteResponse;
import com.webex.schemas._2002._06.service.site.SiteType;
import com.webex.schemas._2002._06.service.supportsession.CreateSupportSessionResponse;
import com.webex.schemas._2002._06.service.supportsession.SupportType;
import com.webex.schemas._2002._06.service.trainingsession.AddScheduledTest;
import com.webex.schemas._2002._06.service.trainingsession.AddScheduledTestResponse;
import com.webex.schemas._2002._06.service.trainingsession.CheckLabAvailability;
import com.webex.schemas._2002._06.service.trainingsession.CheckLabAvailabilityResponse;
import com.webex.schemas._2002._06.service.trainingsession.CopyLibTests;
import com.webex.schemas._2002._06.service.trainingsession.CopyLibTestsResponse;
import com.webex.schemas._2002._06.service.trainingsession.CreateTrainingSessionResponse;
import com.webex.schemas._2002._06.service.trainingsession.DelLibTests;
import com.webex.schemas._2002._06.service.trainingsession.DelLibTestsResponse;
import com.webex.schemas._2002._06.service.trainingsession.DelScheduledTest;
import com.webex.schemas._2002._06.service.trainingsession.DelScheduledTestResponse;
import com.webex.schemas._2002._06.service.trainingsession.DelTrainingSession;
import com.webex.schemas._2002._06.service.trainingsession.DelTrainingSessionResponse;
import com.webex.schemas._2002._06.service.trainingsession.GetIMStestDetails;
import com.webex.schemas._2002._06.service.trainingsession.GetIMStestDetailsResponse;
import com.webex.schemas._2002._06.service.trainingsession.GetIMStestResult;
import com.webex.schemas._2002._06.service.trainingsession.GetIMStestResultResponse;
import com.webex.schemas._2002._06.service.trainingsession.GetLabInfo;
import com.webex.schemas._2002._06.service.trainingsession.GetLabInfoResponse;
import com.webex.schemas._2002._06.service.trainingsession.GetLabSchedule;
import com.webex.schemas._2002._06.service.trainingsession.GetLabScheduleResponse;
import com.webex.schemas._2002._06.service.trainingsession.GetTestInformation;
import com.webex.schemas._2002._06.service.trainingsession.GetTrainingSession;
import com.webex.schemas._2002._06.service.trainingsession.LstLibTests;
import com.webex.schemas._2002._06.service.trainingsession.LstLibTestsResponse;
import com.webex.schemas._2002._06.service.trainingsession.LstScheduledTests;
import com.webex.schemas._2002._06.service.trainingsession.LstScheduledTestsResponse;
import com.webex.schemas._2002._06.service.trainingsession.LstTrainingSession;
import com.webex.schemas._2002._06.service.trainingsession.LstTrainingSessionResponse;
import com.webex.schemas._2002._06.service.trainingsession.LstsummaryTrainingSession;
import com.webex.schemas._2002._06.service.trainingsession.LstsummaryTrainingSessionResponse;
import com.webex.schemas._2002._06.service.trainingsession.ScheduledTestInstanceType;
import com.webex.schemas._2002._06.service.trainingsession.SetScheduledTest;
import com.webex.schemas._2002._06.service.trainingsession.SetScheduledTestResponse;
import com.webex.schemas._2002._06.service.trainingsession.SetTrainingSessionResponse;
import com.webex.schemas._2002._06.service.trainingsession.TrainingSessionSummaryInstanceType;
import com.webex.schemas._2002._06.service.trainingsession.UploadIMStest;
import com.webex.schemas._2002._06.service.trainingsession.UploadIMStestResponse;
import com.webex.schemas._2002._06.service.user.ActivateUser;
import com.webex.schemas._2002._06.service.user.ActivateUserResponse;
import com.webex.schemas._2002._06.service.user.AssignWebACDAgents;
import com.webex.schemas._2002._06.service.user.AssignWebACDAgentsResponse;
import com.webex.schemas._2002._06.service.user.AssignWebACDQueues;
import com.webex.schemas._2002._06.service.user.AssignWebACDQueuesResponse;
import com.webex.schemas._2002._06.service.user.AuthenticateUser;
import com.webex.schemas._2002._06.service.user.AuthenticateUserResponse;
import com.webex.schemas._2002._06.service.user.CreateUserResponse;
import com.webex.schemas._2002._06.service.user.DelSessionTemplates;
import com.webex.schemas._2002._06.service.user.DelSessionTemplatesResponse;
import com.webex.schemas._2002._06.service.user.DelUser;
import com.webex.schemas._2002._06.service.user.DelUserResponse;
import com.webex.schemas._2002._06.service.user.GetLoginTicket;
import com.webex.schemas._2002._06.service.user.GetLoginTicketResponse;
import com.webex.schemas._2002._06.service.user.GetUser;
import com.webex.schemas._2002._06.service.user.GetloginurlUser;
import com.webex.schemas._2002._06.service.user.GetloginurlUserResponse;
import com.webex.schemas._2002._06.service.user.GetlogouturlUser;
import com.webex.schemas._2002._06.service.user.GetlogouturlUserResponse;
import com.webex.schemas._2002._06.service.user.InactivateUser;
import com.webex.schemas._2002._06.service.user.InactivateUserResponse;
import com.webex.schemas._2002._06.service.user.LstUser;
import com.webex.schemas._2002._06.service.user.LstUserResponse;
import com.webex.schemas._2002._06.service.user.LstsummaryUser;
import com.webex.schemas._2002._06.service.user.LstsummaryUserResponse;
import com.webex.schemas._2002._06.service.user.SetUserResponse;
import com.webex.schemas._2002._06.service.user.UploadPMRImage;
import com.webex.schemas._2002._06.service.user.UploadPMRImageResponse;
import com.webex.schemas._2002._06.service.user.UserSummaryInstanceType;
import com.webex.schemas._2002._06.service.user.UserType;


/**
 * <p>Java class for bodyContentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bodyContentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bodyContentType")
@XmlSeeAlso({
    LstMeetingTypeResponse.class,
    LstMeetingType.class,
    MeetingTypeTypeExt.class,
    GetMeetingType.class,
    GetFeedbackInfo.class,
    DelMeetingAttendeeResponse.class,
    LstMeetingAttendeeResponse.class,
    RegisterAttendeeType.class,
    CreateMeetingAttendeeResponse.class,
    LstMeetingAttendee.class,
    RegisterMeetingAttendee.class,
    RegisterMeetingAttendeeResponse.class,
    DelMeetingAttendee.class,
    GetEnrollmentInfo.class,
    GetEnrollmentInfoResponse.class,
    AttendeeType.class,
    GetFeedbackInfoResponse.class,
    SetTeleconferenceSessionResponse.class,
    GetTeleconferenceSession.class,
    AudioOnlyInstanceType.class,
    AudioOnlyType.class,
    CreateTeleconferenceSessionResponse.class,
    DelSessionTemplatesResponse.class,
    CreateUserResponse.class,
    GetlogouturlUser.class,
    DelUser.class,
    GetloginurlUserResponse.class,
    DelUserResponse.class,
    UserSummaryInstanceType.class,
    LstUserResponse.class,
    AssignWebACDQueuesResponse.class,
    LstsummaryUser.class,
    InactivateUser.class,
    AssignWebACDAgentsResponse.class,
    GetLoginTicketResponse.class,
    ActivateUserResponse.class,
    DelSessionTemplates.class,
    AssignWebACDQueues.class,
    InactivateUserResponse.class,
    ActivateUser.class,
    AssignWebACDAgents.class,
    GetloginurlUser.class,
    UploadPMRImage.class,
    GetLoginTicket.class,
    SetUserResponse.class,
    GetUser.class,
    UploadPMRImageResponse.class,
    LstUser.class,
    LstsummaryUserResponse.class,
    GetlogouturlUserResponse.class,
    UserType.class,
    AuthenticateUserResponse.class,
    AuthenticateUser.class,
    LstmeetingattendeeHistoryResponse.class,
    LstrecordaccessHistory.class,
    LstmeetingattendeeHistory.class,
    LsttrainingattendeeHistory.class,
    LstsupportsessionHistoryResponse.class,
    LsteventsessionHistory.class,
    LstsalesSessionHistoryResponse.class,
    LstsupportsessionHistory.class,
    LstrecordaccessDetailHistoryResponse.class,
    MeetingUsageHistoryInstanceType.class,
    LsttrainingsessionHistory.class,
    LsteventattendeeHistoryResponse.class,
    LstmeetingusageHistory.class,
    SupportSessionHistoryInstanceType.class,
    LstmeetingusageHistoryResponse.class,
    LsteventattendeeHistory.class,
    LsteventsessionHistoryResponse.class,
    EventAttendeeHistoryInstanceType.class,
    LstsupportattendeeHistoryResponse.class,
    LsttrainingattendeeHistoryResponse.class,
    TrainSessionHistoryInstanceType.class,
    LsttrainingsessionHistoryResponse.class,
    EventSessionHistoryInstanceType.class,
    LstsupportattendeeHistory.class,
    LstrecordaccessDetailHistory.class,
    SupportAttendeeHistoryInstanceType.class,
    TrainingAttendeeHistoryInstanceType.class,
    MeetingAttendeeHistoryInstanceType.class,
    LstsalesAttendeeHistoryResponse.class,
    LstrecordaccessHistoryResponse.class,
    SupportType.class,
    CreateSupportSessionResponse.class,
    UploadEventImage.class,
    LstrecordedEventResponse.class,
    SendInvitationEmail.class,
    CreateEventResponse.class,
    LstsummaryEventResponse.class,
    DelEvent.class,
    GetEvent.class,
    LstsummaryProgramResponse.class,
    SendInvitationEmailResponse.class,
    SetEventResponse.class,
    UploadEventImageResponse.class,
    LstsummaryEvent.class,
    LstrecordedEvent.class,
    DelEventResponse.class,
    LstsummaryProgram.class,
    EventType.class,
    UploadIMStestResponse.class,
    DelLibTests.class,
    LstTrainingSession.class,
    UploadIMStest.class,
    LstLibTestsResponse.class,
    CheckLabAvailability.class,
    LstsummaryTrainingSession.class,
    LstLibTests.class,
    GetIMStestResultResponse.class,
    GetIMStestDetailsResponse.class,
    GetLabInfo.class,
    LstsummaryTrainingSessionResponse.class,
    AddScheduledTest.class,
    SetTrainingSessionResponse.class,
    GetTrainingSession.class,
    CopyLibTests.class,
    AddScheduledTestResponse.class,
    GetLabInfoResponse.class,
    CopyLibTestsResponse.class,
    SetScheduledTest.class,
    CreateTrainingSessionResponse.class,
    LstTrainingSessionResponse.class,
    DelTrainingSession.class,
    LstScheduledTestsResponse.class,
    GetLabSchedule.class,
    LstScheduledTests.class,
    DelScheduledTest.class,
    GetIMStestDetails.class,
    GetLabScheduleResponse.class,
    GetTestInformation.class,
    SetScheduledTestResponse.class,
    DelLibTestsResponse.class,
    DelScheduledTestResponse.class,
    TrainingSessionSummaryInstanceType.class,
    DelTrainingSessionResponse.class,
    CheckLabAvailabilityResponse.class,
    ScheduledTestInstanceType.class,
    GetIMStestResult.class,
    SessionType.class,
    ParticipantType.class,
    LstMeeting.class,
    LstsummaryMeetingResponse.class,
    GetjoinurlMeetingResponse.class,
    DelMeetingResponse.class,
    MeetingSummaryInstanceType.class,
    CreateMeetingResponse.class,
    LstMeetingResponse.class,
    GethosturlMeeting.class,
    GethosturlMeetingResponse.class,
    LstsummaryMeeting.class,
    SetMeetingResponse.class,
    GetMeeting.class,
    GetjoinurlMeeting.class,
    MeetingType.class,
    DelMeeting.class,
    LstTimeZoneResponse.class,
    SetSiteResponse.class,
    GetWebACDQueuesResponse.class,
    GetSite.class,
    SetSite.class,
    LstTimeZone.class,
    GetWebACDQueues.class,
    SiteType.class,
    GetSiteResponse.class,
    GetSessionInfo.class,
    SetRecordingInfoResponse.class,
    LstsummarySession.class,
    GetRecordingInfoResponse.class,
    LstDistList.class,
    DelRecording.class,
    GetJoinSessionInfo.class,
    DelRecordingResponse.class,
    GetAPIVersionResponse.class,
    GetSessionInfoResponse.class,
    SetDistList.class,
    CreateContactsResponse.class,
    DelSessionResponse.class,
    GetOneClickSettings.class,
    LstOpenSession.class,
    SetupOneClickSettings.class,
    LstRecordingResponse.class,
    LstContactResponse.class,
    GetOneClickSettingsResponse.class,
    SetDistListResponse.class,
    CreateDistList.class,
    CreateContacts.class,
    SetRecordingInfo.class,
    SessionSummaryInstanceType.class,
    GetJoinSessionInfoResponse.class,
    LstRecording.class,
    LstDistListResponse.class,
    LstOpenSessionResponse.class,
    LstContact.class,
    SetupOneClickSettingsResponse.class,
    LstsummarySessionResponse.class,
    DelSession.class,
    GetRecordingInfo.class,
    CreateDistListResponse.class,
    GetAPIVersion.class,
    SetProductsResponse.class,
    CreateAccountResponse.class,
    GetSalesSession.class,
    SalesSessionSummaryInstanceType.class,
    LstsummarySalesSessionResponse.class,
    CreateAccount.class,
    CreateOpportunity.class,
    LstProducts.class,
    SetAccountResponse.class,
    SetOpportunityResponse.class,
    LstAccountsResponse.class,
    LstProductsResponse.class,
    CreateOpportunityResponse.class,
    AddProductsResponse.class,
    SalesSessionType.class,
    DelSalesSession.class,
    LstsummarySalesSession.class,
    SetProducts.class,
    LstOpportunities.class,
    LstAccounts.class,
    SetOpportunity.class,
    DelSalesSessionResponse.class,
    LstOpportunitiesResponse.class,
    CreateSalesSessionResponse.class,
    AddProducts.class,
    SetSalesSessionResponse.class,
    SetAccount.class
})
public class BodyContentType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;

}
