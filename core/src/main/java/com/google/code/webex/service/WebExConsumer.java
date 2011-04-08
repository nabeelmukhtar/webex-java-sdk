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
 * The Class UClassifyConsumer.
 */
public class WebExConsumer implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -3469932939653397548L;
	
	/** The read api key. */
	private String webExId;
	
	/** The write api key. */
	private String password;
	
	private Long siteId;
	
	private String siteName;
	
	private String partnerId;
	
	/**
	 * @return the webExId
	 */
	public String getWebExId() {
		return webExId;
	}

	/**
	 * @param webExId the webExId to set
	 */
	public void setWebExId(String webExId) {
		this.webExId = webExId;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the siteId
	 */
	public Long getSiteId() {
		return siteId;
	}

	/**
	 * @param siteId the siteId to set
	 */
	public void setSiteId(Long siteId) {
		this.siteId = siteId;
	}

	/**
	 * @return the partnerId
	 */
	public String getPartnerId() {
		return partnerId;
	}

	/**
	 * @param partnerId the partnerId to set
	 */
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	/**
	 * Instantiates a new u classify consumer.
	 * 
	 * @param readApiKey the read api key
	 * @param writeApiKey the write api key
	 */
	public WebExConsumer(String webExId, String password, Long siteId, String siteName, String partnerId) {
		this.webExId = webExId;
		this.password = password;
		this.siteId = siteId;
		this.siteName = siteName;
		this.partnerId = partnerId;
	}

	/**
	 * @return the siteName
	 */
	public String getSiteName() {
		return siteName;
	}

	/**
	 * @param siteName the siteName to set
	 */
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	
}
