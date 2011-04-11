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

package com.webex.schemas._2002._06.service.trainingsession;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.session.DateScopeType;


/**
 * The Class LstScheduledTests.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lstScheduledTests", propOrder = {
    "dateScope",
    "sessionKey",
    "status",
    "author"
})
public class LstScheduledTests
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The date scope. */
    protected DateScopeType dateScope;
    
    /** The session key. */
    protected Long sessionKey;
    
    /** The status. */
    protected TestStatusType status;
    
    /** The author. */
    protected String author;

    /**
     * Gets the date scope.
     * 
     * @return the date scope
     */
    public DateScopeType getDateScope() {
        return dateScope;
    }

    /**
     * Sets the date scope.
     * 
     * @param value the new date scope
     */
    public void setDateScope(DateScopeType value) {
        this.dateScope = value;
    }

    /**
     * Gets the session key.
     * 
     * @return the session key
     */
    public Long getSessionKey() {
        return sessionKey;
    }

    /**
     * Sets the session key.
     * 
     * @param value the new session key
     */
    public void setSessionKey(Long value) {
        this.sessionKey = value;
    }

    /**
     * Gets the status.
     * 
     * @return the status
     */
    public TestStatusType getStatus() {
        return status;
    }

    /**
     * Sets the status.
     * 
     * @param value the new status
     */
    public void setStatus(TestStatusType value) {
        this.status = value;
    }

    /**
     * Gets the author.
     * 
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author.
     * 
     * @param value the new author
     */
    public void setAuthor(String value) {
        this.author = value;
    }

}
