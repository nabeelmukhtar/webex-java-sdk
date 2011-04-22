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
 * The Class HistoryServiceTest.
 */
public class HistoryServiceTest extends WebExServiceTest {

	/** The service. */
	private HistoryService service;

	/* (non-Javadoc)
	 * @see com.google.code.webex.service.WebExServiceTest#setUp()
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
		service = factory.createHistoryService();
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
	 * Test get event attendee history.
	 */
	@Test
	public void testGetEventAttendeeHistory() {
		fail("Not yet implemented");
	}

	/**
	 * Test get event session history.
	 */
	@Test
	public void testGetEventSessionHistory() {
		fail("Not yet implemented");
	}

	/**
	 * Test get meeting attendee history.
	 */
	@Test
	public void testGetMeetingAttendeeHistory() {
		fail("Not yet implemented");
	}

	/**
	 * Test get meeting usage history.
	 */
	@Test
	public void testGetMeetingUsageHistory() {
		fail("Not yet implemented");
	}

	/**
	 * Test get record access detail history.
	 */
	@Test
	public void testGetRecordAccessDetailHistory() {
		fail("Not yet implemented");
	}

	/**
	 * Test get record access history.
	 */
	@Test
	public void testGetRecordAccessHistory() {
		fail("Not yet implemented");
	}

	/**
	 * Test get sales attendee history.
	 */
	@Test
	public void testGetSalesAttendeeHistory() {
		fail("Not yet implemented");
	}

	/**
	 * Test get sales session history.
	 */
	@Test
	public void testGetSalesSessionHistory() {
		fail("Not yet implemented");
	}

	/**
	 * Test get support attendee history.
	 */
	@Test
	public void testGetSupportAttendeeHistory() {
		fail("Not yet implemented");
	}

	/**
	 * Test get support session history.
	 */
	@Test
	public void testGetSupportSessionHistory() {
		fail("Not yet implemented");
	}

	/**
	 * Test get training attendee history.
	 */
	@Test
	public void testGetTrainingAttendeeHistory() {
		fail("Not yet implemented");
	}

	/**
	 * Test get training session history.
	 */
	@Test
	public void testGetTrainingSessionHistory() {
		fail("Not yet implemented");
	}

}
