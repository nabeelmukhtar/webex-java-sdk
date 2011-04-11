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

import java.util.Collection;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import com.google.code.webex.service.constant.TestConstants;

/**
 * The Class WebExServiceTest.
 */
public abstract class WebExServiceTest extends TestCase {

    /** The factory. */
    protected WebExServiceFactory factory;

    /** The Constant RESOURCE_MISSING_MESSAGE. */
	protected static final String RESOURCE_MISSING_MESSAGE = "Please define a test %s in TestConstants.properties file."; 
    

    /**
     * Sets the up before class.
     * 
     * @throws Exception the exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {}

    /**
     * Tear down after class.
     * 
     * @throws Exception the exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {}

    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    @Before
    public void setUp() throws Exception {
    	assertNotNull(String.format(RESOURCE_MISSING_MESSAGE, "Read Key"), TestConstants.UCLASSIFY_TEST_READ_KEY);
    	assertNotNull(String.format(RESOURCE_MISSING_MESSAGE, "Write Key"), TestConstants.UCLASSIFY_TEST_WRITE_KEY);
//    	factory =
//            WebExServiceFactory.newInstance(TestConstants.UCLASSIFY_TEST_READ_KEY,
//                TestConstants.UCLASSIFY_TEST_WRITE_KEY);
    }

    /* (non-Javadoc)
     * @see junit.framework.TestCase#tearDown()
     */
    @After
    public void tearDown() throws Exception {
    	factory = null;
    }
    
	/**
	 * Assert not null or empty.
	 * 
	 * @param message the message
	 * @param value the value
	 */
	protected static void assertNotNullOrEmpty(String message, String value) {
		assertNotNull(message, value);
		assertFalse(message, "".equals(value));
	}
	
	/**
	 * Assert not null or empty.
	 * 
	 * @param message the message
	 * @param value the value
	 */
	protected static void assertNotNullOrEmpty(String message, Collection<?> value) {
		assertNotNull(message, value);
		assertFalse(message, value.isEmpty());
	}

	/**
	 * Assert not null or empty.
	 * 
	 * @param message the message
	 * @param value the value
	 */
	protected static void assertNotNullOrEmpty(String message, Map<?, ?> value) {
		assertNotNull(message, value);
		assertFalse(message, value.isEmpty());
	}
}
