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

package com.webex.schemas._2002._06.service.event;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class SourceType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sourceType", propOrder = {
    "leadSourceID",
    "count",
    "avgLeadScore"
})
public class SourceType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The lead source id. */
    @XmlElement(required = true)
    protected String leadSourceID;
    
    /** The count. */
    protected long count;
    
    /** The avg lead score. */
    protected float avgLeadScore;

    /**
     * Gets the lead source id.
     * 
     * @return the lead source id
     */
    public String getLeadSourceID() {
        return leadSourceID;
    }

    /**
     * Sets the lead source id.
     * 
     * @param value the new lead source id
     */
    public void setLeadSourceID(String value) {
        this.leadSourceID = value;
    }

    /**
     * Gets the count.
     * 
     * @return the count
     */
    public long getCount() {
        return count;
    }

    /**
     * Sets the count.
     * 
     * @param value the new count
     */
    public void setCount(long value) {
        this.count = value;
    }

    /**
     * Gets the avg lead score.
     * 
     * @return the avg lead score
     */
    public float getAvgLeadScore() {
        return avgLeadScore;
    }

    /**
     * Sets the avg lead score.
     * 
     * @param value the new avg lead score
     */
    public void setAvgLeadScore(float value) {
        this.avgLeadScore = value;
    }

}
