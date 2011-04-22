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
 * The Class MeetingServiceTest.
 */
public class MeetingServiceTest extends WebExServiceTest {

	/** The service. */
	private MeetingService service;

	/* (non-Javadoc)
	 * @see com.google.code.webex.service.WebExServiceTest#setUp()
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
		service = factory.createMeetingService();
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
	 * Test get meeting summaries.
	 */
	@Test
	public void testGetMeetingSummaries() {
		fail("Not yet implemented");
	}

	/**
	 * Test create meeting.
	 */
	@Test
	public void testCreateMeeting() {
		fail("Not yet implemented");
	}

	/**
	 * Test create teleconference session.
	 */
	@Test
	public void testCreateTeleconferenceSession() {
		fail("Not yet implemented");
	}

	/**
	 * Test delete meeting.
	 */
	@Test
	public void testDeleteMeeting() {
		fail("Not yet implemented");
	}

	/**
	 * Test get meeting host url.
	 */
	@Test
	public void testGetMeetingHostUrl() {
		fail("Not yet implemented");
	}

	/**
	 * Test get meeting join url.
	 */
	@Test
	public void testGetMeetingJoinUrl() {
		fail("Not yet implemented");
	}

	/**
	 * Test get meeting.
	 */
	@Test
	public void testGetMeeting() {
		fail("Not yet implemented");
	}

	/**
	 * Test get teleconference session.
	 */
	@Test
	public void testGetTeleconferenceSession() {
		fail("Not yet implemented");
	}

	/**
	 * Test set meeting.
	 */
	@Test
	public void testSetMeeting() {
		fail("Not yet implemented");
	}

	/**
	 * Test set teleconference session.
	 */
	@Test
	public void testSetTeleconferenceSession() {
		fail("Not yet implemented");
	}

}
