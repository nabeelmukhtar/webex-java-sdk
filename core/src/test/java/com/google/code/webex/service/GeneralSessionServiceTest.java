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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The Class GeneralSessionServiceTest.
 */
public class GeneralSessionServiceTest extends WebExServiceTest {

	/** The service. */
	private GeneralSessionService service;

	/* (non-Javadoc)
	 * @see com.google.code.webex.service.WebExServiceTest#setUp()
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
		service = factory.createGeneralSessionService();
	}

	/* (non-Javadoc)
	 * @see com.google.code.webex.service.WebExServiceTest#tearDown()
	 */
	@After
	public void tearDown() throws Exception {
		super.tearDown();
		service = null;
	}

	/**
	 * Test create contacts.
	 */
	@Test
	public void testCreateContacts() {
		fail("Not yet implemented");
	}

	/**
	 * Test create distribution list.
	 */
	@Test
	public void testCreateDistributionList() {
		fail("Not yet implemented");
	}

	/**
	 * Test delete recording.
	 */
	@Test
	public void testDeleteRecording() {
		fail("Not yet implemented");
	}

	/**
	 * Test delete session.
	 */
	@Test
	public void testDeleteSession() {
		fail("Not yet implemented");
	}

	/**
	 * Test get api version.
	 */
	@Test
	public void testGetApiVersion() {
		fail("Not yet implemented");
	}

	/**
	 * Test get distribution lists.
	 */
	@Test
	public void testGetDistributionLists() {
		fail("Not yet implemented");
	}

	/**
	 * Test get open sessions.
	 */
	@Test
	public void testGetOpenSessions() {
		fail("Not yet implemented");
	}

	/**
	 * Test get recordings.
	 */
	@Test
	public void testGetRecordings() {
		fail("Not yet implemented");
	}

	/**
	 * Test get session summaries.
	 */
	@Test
	public void testGetSessionSummaries() {
		fail("Not yet implemented");
	}

	/**
	 * Test set distribution list.
	 */
	@Test
	public void testSetDistributionList() {
		fail("Not yet implemented");
	}

	/**
	 * Test get one click settings.
	 */
	@Test
	public void testGetOneClickSettings() {
		fail("Not yet implemented");
	}

	/**
	 * Test setup one click settings.
	 */
	@Test
	public void testSetupOneClickSettings() {
		fail("Not yet implemented");
	}

	/**
	 * Test get session info.
	 */
	@Test
	public void testGetSessionInfo() {
		fail("Not yet implemented");
	}

	/**
	 * Test get contacts.
	 */
	@Test
	public void testGetContacts() {
		fail("Not yet implemented");
	}

	/**
	 * Test set recording info.
	 */
	@Test
	public void testSetRecordingInfo() {
		fail("Not yet implemented");
	}

}
