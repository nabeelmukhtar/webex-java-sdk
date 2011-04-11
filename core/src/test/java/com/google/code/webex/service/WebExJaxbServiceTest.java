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

import com.google.code.webex.service.constant.TestConstants;

/**
 * The Class WebExJaxbServiceTest.
 */
public class WebExJaxbServiceTest extends WebExServiceTest {
	
	/** The client. */
	private WebExService client;
	
	/* (non-Javadoc)
	 * @see com.google.code.webex.service.WebExServiceTest#setUp()
	 */
	public void setUp() throws Exception {
		super.setUp();
//		client = factory.createUClassifyClient(WebExJaxbService.class);
	}

	/* (non-Javadoc)
	 * @see com.google.code.webex.service.WebExServiceTest#tearDown()
	 */
	public void tearDown() throws Exception {
		super.tearDown();
		assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Classifier Name"), TestConstants.TEST_CLASSIFIER_NAME);
		client = null;
	}
}
