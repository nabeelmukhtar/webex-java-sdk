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
 * The Class TrainingSessionServiceTest.
 */
public class TrainingSessionServiceTest extends WebExServiceTest {

	/** The service. */
	private TrainingSessionService service;

	/* (non-Javadoc)
	 * @see com.google.code.webex.service.WebExServiceTest#setUp()
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
		service = factory.createTrainingSessionService();
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
	 * Test check lab availability.
	 */
	@Test
	public void testCheckLabAvailability() {
		fail("Not yet implemented");
	}

	/**
	 * Test create training session.
	 */
	@Test
	public void testCreateTrainingSession() {
		fail("Not yet implemented");
	}

	/**
	 * Test delete training session.
	 */
	@Test
	public void testDeleteTrainingSession() {
		fail("Not yet implemented");
	}

	/**
	 * Test get ims test details.
	 */
	@Test
	public void testGetImsTestDetails() {
		fail("Not yet implemented");
	}

	/**
	 * Test get ims test result.
	 */
	@Test
	public void testGetImsTestResult() {
		fail("Not yet implemented");
	}

	/**
	 * Test get lab information.
	 */
	@Test
	public void testGetLabInformation() {
		fail("Not yet implemented");
	}

	/**
	 * Test get lab schedule.
	 */
	@Test
	public void testGetLabSchedule() {
		fail("Not yet implemented");
	}

	/**
	 * Test get test information.
	 */
	@Test
	public void testGetTestInformation() {
		fail("Not yet implemented");
	}

	/**
	 * Test get training session.
	 */
	@Test
	public void testGetTrainingSession() {
		fail("Not yet implemented");
	}

	/**
	 * Test get scheduled tests.
	 */
	@Test
	public void testGetScheduledTests() {
		fail("Not yet implemented");
	}

	/**
	 * Test get training session summaries.
	 */
	@Test
	public void testGetTrainingSessionSummaries() {
		fail("Not yet implemented");
	}

	/**
	 * Test set training session.
	 */
	@Test
	public void testSetTrainingSession() {
		fail("Not yet implemented");
	}

}
