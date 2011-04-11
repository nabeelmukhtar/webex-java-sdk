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

package com.webex.schemas._2002._06.service.attendee;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class FeedbackDefaultFieldsType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "feedbackDefaultFieldsType", propOrder = {
    "setup",
    "easeOfUse",
    "performance",
    "comment"
})
public class FeedbackDefaultFieldsType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The setup. */
    protected String setup;
    
    /** The ease of use. */
    protected String easeOfUse;
    
    /** The performance. */
    protected String performance;
    
    /** The comment. */
    protected String comment;

    /**
     * Gets the setup.
     * 
     * @return the setup
     */
    public String getSetup() {
        return setup;
    }

    /**
     * Sets the setup.
     * 
     * @param value the new setup
     */
    public void setSetup(String value) {
        this.setup = value;
    }

    /**
     * Gets the ease of use.
     * 
     * @return the ease of use
     */
    public String getEaseOfUse() {
        return easeOfUse;
    }

    /**
     * Sets the ease of use.
     * 
     * @param value the new ease of use
     */
    public void setEaseOfUse(String value) {
        this.easeOfUse = value;
    }

    /**
     * Gets the performance.
     * 
     * @return the performance
     */
    public String getPerformance() {
        return performance;
    }

    /**
     * Sets the performance.
     * 
     * @param value the new performance
     */
    public void setPerformance(String value) {
        this.performance = value;
    }

    /**
     * Gets the comment.
     * 
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the comment.
     * 
     * @param value the new comment
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
