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

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.google.code.webex.service.impl.EventSessionServiceImpl;
import com.google.code.webex.service.impl.GeneralSessionServiceImpl;
import com.google.code.webex.service.impl.HistoryServiceImpl;
import com.google.code.webex.service.impl.MeetingAttendeeServiceImpl;
import com.google.code.webex.service.impl.MeetingServiceImpl;
import com.google.code.webex.service.impl.MeetingTypeServiceImpl;
import com.google.code.webex.service.impl.SalesSessionServiceImpl;
import com.google.code.webex.service.impl.SiteServiceImpl;
import com.google.code.webex.service.impl.SupportSessionServiceImpl;
import com.google.code.webex.service.impl.TrainingSessionServiceImpl;
import com.google.code.webex.service.impl.UserServiceImpl;

/**
 * A factory for creating WebExService objects.
 */
public class WebExServiceFactory {

    /** The Constant factoriesMap. */
    private static final Map<WebExConsumer, WebExServiceFactory> factoriesMap =
        new ConcurrentHashMap<WebExConsumer, WebExServiceFactory>();
    
    /** The task executor. */
    private ExecutorService taskExecutor = Executors.newCachedThreadPool();

    /** The api consumer. */
    private WebExConsumer apiConsumer;

    /**
     * Instantiates a new web ex service factory.
     * 
     * @param apiConsumer the api consumer
     */
	private WebExServiceFactory(WebExConsumer apiConsumer) {
        this.apiConsumer = apiConsumer;
    }
	
    /**
     * Sets the task executor.
     * 
     * @param taskExecutor the new task executor
     */
	public void setTaskExecutor(ExecutorService taskExecutor) {
        this.taskExecutor = taskExecutor;
	}

    /**
     * New instance.
     * 
     * @param webExId the web ex id
     * @param password the password
     * @param siteId the site id
     * @param siteName the site name
     * @param partnerId the partner id
     * 
     * @return the web ex service factory
     */
    public static WebExServiceFactory newInstance(String webExId, String password, Long siteId, String siteName, String partnerId) {
        return newInstance(new WebExConsumer(webExId, password, siteId, siteName, partnerId));
    }

    /**
     * New instance.
     * 
     * @param apiConsumer the api consumer
     * 
     * @return the web ex service factory
     */
    public static synchronized WebExServiceFactory newInstance(WebExConsumer apiConsumer) {
        WebExServiceFactory factory = factoriesMap.get(apiConsumer);

        if (factory == null) {
            factory = new WebExServiceFactory(apiConsumer);
            factoriesMap.put(apiConsumer, factory);
        }

        return factory;
    }

    /**
     * Creates a new WebExService object.
     * 
     * @return the meeting service
     */
	public MeetingService createMeetingService() {
		return new MeetingServiceImpl(apiConsumer.getWebExId(), apiConsumer.getPassword(), apiConsumer.getSiteId(), apiConsumer.getSiteName(), apiConsumer.getPartnerId());
    }
	
	/**
	 * Creates a new WebExService object.
	 * 
	 * @return the event session service
	 */
	public EventSessionService createEventSessionService() {
		return new EventSessionServiceImpl(apiConsumer.getWebExId(), apiConsumer.getPassword(), apiConsumer.getSiteId(), apiConsumer.getSiteName(), apiConsumer.getPartnerId());
    }
	
	/**
	 * Creates a new WebExService object.
	 * 
	 * @return the general session service
	 */
	public GeneralSessionService createGeneralSessionService() {
		return new GeneralSessionServiceImpl(apiConsumer.getWebExId(), apiConsumer.getPassword(), apiConsumer.getSiteId(), apiConsumer.getSiteName(), apiConsumer.getPartnerId());
    }
	
	/**
	 * Creates a new WebExService object.
	 * 
	 * @return the history service
	 */
	public HistoryService createHistoryService() {
		return new HistoryServiceImpl(apiConsumer.getWebExId(), apiConsumer.getPassword(), apiConsumer.getSiteId(), apiConsumer.getSiteName(), apiConsumer.getPartnerId());
    }
	
	/**
	 * Creates a new WebExService object.
	 * 
	 * @return the meeting attendee service
	 */
	public MeetingAttendeeService createMeetingAttendeeService() {
		return new MeetingAttendeeServiceImpl(apiConsumer.getWebExId(), apiConsumer.getPassword(), apiConsumer.getSiteId(), apiConsumer.getSiteName(), apiConsumer.getPartnerId());
    }
	
	/**
	 * Creates a new WebExService object.
	 * 
	 * @return the meeting type service
	 */
	public MeetingTypeService createMeetingTypeService() {
		return new MeetingTypeServiceImpl(apiConsumer.getWebExId(), apiConsumer.getPassword(), apiConsumer.getSiteId(), apiConsumer.getSiteName(), apiConsumer.getPartnerId());
    }
	
	/**
	 * Creates a new WebExService object.
	 * 
	 * @return the sales session service
	 */
	public SalesSessionService createSalesSessionService() {
		return new SalesSessionServiceImpl(apiConsumer.getWebExId(), apiConsumer.getPassword(), apiConsumer.getSiteId(), apiConsumer.getSiteName(), apiConsumer.getPartnerId());
    }
	
	/**
	 * Creates a new WebExService object.
	 * 
	 * @return the site service
	 */
	public SiteService createSiteService() {
		return new SiteServiceImpl(apiConsumer.getWebExId(), apiConsumer.getPassword(), apiConsumer.getSiteId(), apiConsumer.getSiteName(), apiConsumer.getPartnerId());
    }
	
	/**
	 * Creates a new WebExService object.
	 * 
	 * @return the support session service
	 */
	public SupportSessionService createSupportSessionService() {
		return new SupportSessionServiceImpl(apiConsumer.getWebExId(), apiConsumer.getPassword(), apiConsumer.getSiteId(), apiConsumer.getSiteName(), apiConsumer.getPartnerId());
    }
	
	/**
	 * Creates a new WebExService object.
	 * 
	 * @return the training session service
	 */
	public TrainingSessionService createTrainingSessionService() {
		return new TrainingSessionServiceImpl(apiConsumer.getWebExId(), apiConsumer.getPassword(), apiConsumer.getSiteId(), apiConsumer.getSiteName(), apiConsumer.getPartnerId());
    }
	
	/**
	 * Creates a new WebExService object.
	 * 
	 * @return the user service
	 */
	public UserService createUserService() {
		return new UserServiceImpl(apiConsumer.getWebExId(), apiConsumer.getPassword(), apiConsumer.getSiteId(), apiConsumer.getSiteName(), apiConsumer.getPartnerId());
    }
}
