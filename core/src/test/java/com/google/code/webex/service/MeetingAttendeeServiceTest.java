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
 * The Class MeetingAttendeeServiceTest.
 */
public class MeetingAttendeeServiceTest extends WebExServiceTest {

	/** The service. */
	private MeetingAttendeeService service;

	/* (non-Javadoc)
	 * @see com.google.code.webex.service.WebExServiceTest#setUp()
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
		service = factory.createMeetingAttendeeService();
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
	 * Test create meeting attendee.
	 */
	@Test
	public void testCreateMeetingAttendee() {
		fail("Not yet implemented");
	}

	/**
	 * Test delete meeting attendees.
	 */
	@Test
	public void testDeleteMeetingAttendees() {
		fail("Not yet implemented");
	}

	/**
	 * Test get enrollment information.
	 */
	@Test
	public void testGetEnrollmentInformation() {
		fail("Not yet implemented");
	}

	/**
	 * Test get meeting attendees.
	 */
	@Test
	public void testGetMeetingAttendees() {
		fail("Not yet implemented");
	}

	/**
	 * Test register meeting attendees.
	 */
	@Test
	public void testRegisterMeetingAttendees() {
		fail("Not yet implemented");
	}

}
