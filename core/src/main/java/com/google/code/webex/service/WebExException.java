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

import java.util.Date;

/**
 * The Class WebExException.
 */
public class WebExException extends RuntimeException {
	
	/** The status code. */
	private int statusCode;
	
	/** The timestamp. */
	private Date timestamp;

    /** The Constant serialVersionUID. */
	private static final long serialVersionUID = -4345556572105572685L;

	/**
	 * Instantiates a new web ex exception.
	 */
    public WebExException() {
        super();
    }

    /**
     * Instantiates a new web ex exception.
     * 
     * @param message the message
     */
    public WebExException(String message) {
        super(message);
    }

    /**
     * Instantiates a new web ex exception.
     * 
     * @param cause the cause
     */
    public WebExException(Throwable cause) {
        super(cause);
    }

    /**
     * Instantiates a new web ex exception.
     * 
     * @param message the message
     * @param cause the cause
     */
    public WebExException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new web ex exception.
     * 
     * @param message the message
     * @param statusCode the status code
     * @param timestamp the timestamp
     */
    public WebExException(String message, int statusCode, Date timestamp) {
        super(message);
        this.statusCode = statusCode;
        this.timestamp = timestamp;
    }
    
	/**
	 * Gets the status code.
	 * 
	 * @return the status code
	 */
	public int getStatusCode() {
		return statusCode;
	}

	/**
	 * Sets the status code.
	 * 
	 * @param statusCode the new status code
	 */
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * Gets the timestamp.
	 * 
	 * @return the timestamp
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * Sets the timestamp.
	 * 
	 * @param timestamp the new timestamp
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}
