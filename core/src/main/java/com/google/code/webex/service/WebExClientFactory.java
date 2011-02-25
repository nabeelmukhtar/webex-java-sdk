/*
 * Copyright 2010 Nabeel Mukhtar 
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

import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.google.code.webex.service.impl.AsyncWebExClientAdapter;
import com.google.code.webex.service.util.ApplicationConstants;

/**
 * A factory for creating LinkedInApiClient objects.
 * 
 * @author Nabeel Mukhtar
 */
public class WebExClientFactory {

    /** The Constant factoriesMap. */
    private static final Map<WebExConsumer, WebExClientFactory> factoriesMap =
        new ConcurrentHashMap<WebExConsumer, WebExClientFactory>();
    
    /** The task executor. */
    private ExecutorService taskExecutor = Executors.newCachedThreadPool();

    /** The api consumer. */
    private WebExConsumer apiConsumer;

    /** The default client impl. */
    private Constructor<? extends WebExClient> defaultClientImpl;
    
    /**
     * Instantiates a new linked in api client factory.
     * 
     * @param apiConsumer the api consumer
     */
	private WebExClientFactory(WebExConsumer apiConsumer) {
        this.apiConsumer = apiConsumer;
    }
	
    /**
     * Sets the task executor to be used for asynchronous API calls.
     * 
     * @param taskExecutor the task executor
     */
	public void setTaskExecutor(ExecutorService taskExecutor) {
        this.taskExecutor = taskExecutor;
	}

    /**
     * New instance.
     * 
     * @param consumerKey the consumer key
     * @param consumerSecret the consumer secret
     * 
     * @return the linked in api client factory
     */
    public static WebExClientFactory newInstance(String consumerKey, String consumerSecret) {
        return newInstance(new WebExConsumer(consumerKey, consumerSecret));
    }

    /**
     * New instance.
     * 
     * @param apiConsumer the api consumer
     * 
     * @return the linked in api client factory
     */
    public static synchronized WebExClientFactory newInstance(WebExConsumer apiConsumer) {
        WebExClientFactory factory = factoriesMap.get(apiConsumer);

        if (factory == null) {
            factory = new WebExClientFactory(apiConsumer);
            factoriesMap.put(apiConsumer, factory);
        }

        return factory;
    }

    /**
     * Creates a new LinkedInApiClient object.
     * 
     * @return the linked in api client
     */
    @SuppressWarnings("unchecked")
	public WebExClient createUClassifyClient() {
    	try {
    		if (defaultClientImpl == null) {
        		Class<? extends WebExClient> clazz = (Class<? extends WebExClient>) Class.forName(ApplicationConstants.CLIENT_DEFAULT_IMPL);
        		
        		defaultClientImpl = clazz.getConstructor(String.class, String.class);
    		}
			
			final WebExClient client = defaultClientImpl.newInstance(apiConsumer.getReadApiKey(), apiConsumer.getWriteApiKey());

	        return client;
		} catch (Exception e) {
			throw new WebExException(e);
		}
    }

    /**
     * Creates a new LinkedInApiClient object.
     * 
     * @param implClass the impl class
     * 
     * @return the linked in api client
     */
	public WebExClient createUClassifyClient(Class<? extends WebExClient> implClass) {
    	try {
			final WebExClient client = implClass.getConstructor(String.class, String.class).newInstance(apiConsumer.getReadApiKey(), apiConsumer.getWriteApiKey());

	        return client;
		} catch (Exception e) {
			throw new WebExException(e);
		}
    }
    
    /**
     * Creates a new LinkedInApiClient object.
     * 
     * @return the async linked in api client
     */
    public AsyncWebExClient createAsyncUClassifyClient() {
        final WebExClient client = createUClassifyClient();

        return new AsyncWebExClientAdapter(client, taskExecutor);
    }
    
    /**
     * Creates a new LinkedInApiClient object.
     * 
     * @param token the token
     * @param tokenSecret the token secret
     * 
     * @return the linked in api client
     */
    public WebExClient createUClassifyClient(String token, String tokenSecret) {
        return createUClassifyClient();
    }
    
    /**
     * Creates a new LinkedInApiClient object.
     * 
     * @param token the token
     * @param tokenSecret the token secret
     * 
     * @return the async linked in api client
     */
    public AsyncWebExClient createAsyncUClassifyClient(String token, String tokenSecret) {
        return createAsyncUClassifyClient();
    }
}
