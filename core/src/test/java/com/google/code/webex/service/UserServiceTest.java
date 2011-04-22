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
 * The Class UserServiceTest.
 */
public class UserServiceTest extends WebExServiceTest {

	/** The service. */
	private UserService service;

	/* (non-Javadoc)
	 * @see com.google.code.webex.service.WebExServiceTest#setUp()
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
		service = factory.createUserService();
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
	 * Test authenticate user.
	 */
	@Test
	public void testAuthenticateUser() {
		fail("Not yet implemented");
	}

	/**
	 * Test create user.
	 */
	@Test
	public void testCreateUser() {
		fail("Not yet implemented");
	}

	/**
	 * Test delete user.
	 */
	@Test
	public void testDeleteUser() {
		fail("Not yet implemented");
	}

	/**
	 * Test delete session templates.
	 */
	@Test
	public void testDeleteSessionTemplates() {
		fail("Not yet implemented");
	}

	/**
	 * Test get login ticket.
	 */
	@Test
	public void testGetLoginTicket() {
		fail("Not yet implemented");
	}

	/**
	 * Test get login url.
	 */
	@Test
	public void testGetLoginUrl() {
		fail("Not yet implemented");
	}

	/**
	 * Test get logout url.
	 */
	@Test
	public void testGetLogoutUrl() {
		fail("Not yet implemented");
	}

	/**
	 * Test get user.
	 */
	@Test
	public void testGetUser() {
		fail("Not yet implemented");
	}

	/**
	 * Test get user summary list.
	 */
	@Test
	public void testGetUserSummaryList() {
		fail("Not yet implemented");
	}

	/**
	 * Test set user.
	 */
	@Test
	public void testSetUser() {
		fail("Not yet implemented");
	}

	/**
	 * Test upload pmr image.
	 */
	@Test
	public void testUploadPmrImage() {
		fail("Not yet implemented");
	}

}
