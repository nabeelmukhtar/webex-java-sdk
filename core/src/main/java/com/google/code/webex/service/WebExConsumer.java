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

import java.io.Serializable;

/**
 * The Class WebExConsumer.
 */
public class WebExConsumer implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -3469932939653397548L;
	
	/** The web ex id. */
	private String webExId;
	
	/** The password. */
	private String password;
	
	/** The site id. */
	private Long siteId;
	
	/** The site name. */
	private String siteName;
	
	/** The partner id. */
	private String partnerId;
	
	/**
	 * Gets the web ex id.
	 * 
	 * @return the web ex id
	 */
	public String getWebExId() {
		return webExId;
	}

	/**
	 * Sets the web ex id.
	 * 
	 * @param webExId the new web ex id
	 */
	public void setWebExId(String webExId) {
		this.webExId = webExId;
	}

	/**
	 * Gets the password.
	 * 
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 * 
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Gets the site id.
	 * 
	 * @return the site id
	 */
	public Long getSiteId() {
		return siteId;
	}

	/**
	 * Sets the site id.
	 * 
	 * @param siteId the new site id
	 */
	public void setSiteId(Long siteId) {
		this.siteId = siteId;
	}

	/**
	 * Gets the partner id.
	 * 
	 * @return the partner id
	 */
	public String getPartnerId() {
		return partnerId;
	}

	/**
	 * Sets the partner id.
	 * 
	 * @param partnerId the new partner id
	 */
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	/**
	 * Instantiates a new web ex consumer.
	 * 
	 * @param webExId the web ex id
	 * @param password the password
	 * @param siteId the site id
	 * @param siteName the site name
	 * @param partnerId the partner id
	 */
	public WebExConsumer(String webExId, String password, Long siteId, String siteName, String partnerId) {
		this.webExId = webExId;
		this.password = password;
		this.siteId = siteId;
		this.siteName = siteName;
		this.partnerId = partnerId;
	}

	/**
	 * Gets the site name.
	 * 
	 * @return the site name
	 */
	public String getSiteName() {
		return siteName;
	}

	/**
	 * Sets the site name.
	 * 
	 * @param siteName the new site name
	 */
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	
}
