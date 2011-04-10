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

import com.webex.schemas._2002._06.service.attendee.FeedbackSessionType;
import com.webex.schemas._2002._06.service.supportsession.CreateSupportSession;

/**
 * @author nmukhtar
 *
 */
public interface SupportSessionService extends WebExService {
	public Long createSupportSession(CreateSupportSession session);
	public List<FeedbackSessionType> getFeedbackInformation(long confID);
}
