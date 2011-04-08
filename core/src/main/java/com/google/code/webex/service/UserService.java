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

import com.webex.schemas._2002._06.service.user.CreateUser;
import com.webex.schemas._2002._06.service.user.GetUserResponse;
import com.webex.schemas._2002._06.service.user.ImageForType;
import com.webex.schemas._2002._06.service.user.SessionTemplateType;
import com.webex.schemas._2002._06.service.user.SetUser;
import com.webex.schemas._2002._06.service.user.TemplateTypeType;
import com.webex.schemas._2002._06.service.user.UserSummaryInstanceType;

/**
 * @author nmukhtar
 *
 */
public interface UserService extends WebExService {
	public String authenticateUser(String samlResponse);
	public Long createUser(CreateUser user);
	public void deleteUser(List<String> webExIds, boolean syncWebOffice);
	public void deleteSessionTemplates(List<SessionTemplateType> sessionTemplates, TemplateTypeType templateType);
	public String getLoginTicket();
	public String getLoginUrl(String webExId, String callbackUrl);
	public String getLogoutUrl(String webExId, String callbackUrl);
	public GetUserResponse getUser(String webExId);
	
	public List<UserSummaryInstanceType> getUserSummaryList();
	
	public void setUser(SetUser user);
	public void uploadPmrImage(ImageForType imageFor, byte[] imageData);
}
