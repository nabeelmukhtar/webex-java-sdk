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
 * The Interface UserService.
 */
public interface UserService extends WebExService {
	
	/**
	 * Authenticate user.
	 * 
	 * @param samlResponse the saml response
	 * 
	 * @return the string
	 */
	public String authenticateUser(String samlResponse);
	
	/**
	 * Creates the user.
	 * 
	 * @param user the user
	 * 
	 * @return the long
	 */
	public Long createUser(CreateUser user);
	
	/**
	 * Delete user.
	 * 
	 * @param webExIds the web ex ids
	 * @param syncWebOffice the sync web office
	 */
	public void deleteUser(List<String> webExIds, boolean syncWebOffice);
	
	/**
	 * Delete session templates.
	 * 
	 * @param sessionTemplates the session templates
	 * @param templateType the template type
	 */
	public void deleteSessionTemplates(List<SessionTemplateType> sessionTemplates, TemplateTypeType templateType);
	
	/**
	 * Gets the login ticket.
	 * 
	 * @return the login ticket
	 */
	public String getLoginTicket();
	
	/**
	 * Gets the login url.
	 * 
	 * @param webExId the web ex id
	 * @param callbackUrl the callback url
	 * 
	 * @return the login url
	 */
	public String getLoginUrl(String webExId, String callbackUrl);
	
	/**
	 * Gets the logout url.
	 * 
	 * @param webExId the web ex id
	 * @param callbackUrl the callback url
	 * 
	 * @return the logout url
	 */
	public String getLogoutUrl(String webExId, String callbackUrl);
	
	/**
	 * Gets the user.
	 * 
	 * @param webExId the web ex id
	 * 
	 * @return the user
	 */
	public GetUserResponse getUser(String webExId);
	
	/**
	 * Gets the user summary list.
	 * 
	 * @return the user summary list
	 */
	public List<UserSummaryInstanceType> getUserSummaryList();
	
	/**
	 * Sets the user.
	 * 
	 * @param user the new user
	 */
	public void setUser(SetUser user);
	
	/**
	 * Upload pmr image.
	 * 
	 * @param imageFor the image for
	 * @param imageData the image data
	 */
	public void uploadPmrImage(ImageForType imageFor, byte[] imageData);
}
