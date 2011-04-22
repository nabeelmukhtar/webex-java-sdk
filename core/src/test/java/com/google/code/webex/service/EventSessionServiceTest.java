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
 * The Class EventSessionServiceTest.
 */
public class EventSessionServiceTest extends WebExServiceTest {
	
	/** The service. */
	private EventSessionService service;

	/* (non-Javadoc)
	 * @see com.google.code.webex.service.WebExServiceTest#setUp()
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
		service = factory.createEventSessionService();
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
	 * Test create event.
	 */
	@Test
	public void testCreateEvent() {
		fail("Not yet implemented");
	}

	/**
	 * Test delete event.
	 */
	@Test
	public void testDeleteEvent() {
		fail("Not yet implemented");
	}

	/**
	 * Test get event.
	 */
	@Test
	public void testGetEvent() {
		fail("Not yet implemented");
	}

	/**
	 * Test get recorded events.
	 */
	@Test
	public void testGetRecordedEvents() {
		fail("Not yet implemented");
	}

	/**
	 * Test get event summaries.
	 */
	@Test
	public void testGetEventSummaries() {
		fail("Not yet implemented");
	}

	/**
	 * Test get program summaries.
	 */
	@Test
	public void testGetProgramSummaries() {
		fail("Not yet implemented");
	}

	/**
	 * Test send invitation emails.
	 */
	@Test
	public void testSendInvitationEmails() {
		fail("Not yet implemented");
	}

	/**
	 * Test set event.
	 */
	@Test
	public void testSetEvent() {
		fail("Not yet implemented");
	}

	/**
	 * Test upload event image.
	 */
	@Test
	public void testUploadEventImage() {
		fail("Not yet implemented");
	}

}
