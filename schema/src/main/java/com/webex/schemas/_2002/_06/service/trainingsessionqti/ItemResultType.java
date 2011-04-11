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

package com.webex.schemas._2002._06.service.trainingsessionqti;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class ItemResultType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item_resultType", propOrder = {
    "asiMetadata",
    "response",
    "outcomes",
    "feedbackDisplayed"
})
public class ItemResultType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The asi metadata. */
    @XmlElement(name = "asi_metadata")
    protected AsiMetadataItemResultType asiMetadata;
    
    /** The response. */
    @XmlElement(required = true)
    protected List<ResponseType> response;
    
    /** The outcomes. */
    @XmlElement(required = true)
    protected OutcomesItemResultType outcomes;
    
    /** The feedback displayed. */
    @XmlElement(name = "feedback_displayed")
    protected FeedbackDisplayedType feedbackDisplayed;

    /**
     * Gets the asi metadata.
     * 
     * @return the asi metadata
     */
    public AsiMetadataItemResultType getAsiMetadata() {
        return asiMetadata;
    }

    /**
     * Sets the asi metadata.
     * 
     * @param value the new asi metadata
     */
    public void setAsiMetadata(AsiMetadataItemResultType value) {
        this.asiMetadata = value;
    }

    /**
     * Gets the response.
     * 
     * @return the response
     */
    public List<ResponseType> getResponse() {
        if (response == null) {
            response = new ArrayList<ResponseType>();
        }
        return this.response;
    }

    /**
     * Gets the outcomes.
     * 
     * @return the outcomes
     */
    public OutcomesItemResultType getOutcomes() {
        return outcomes;
    }

    /**
     * Sets the outcomes.
     * 
     * @param value the new outcomes
     */
    public void setOutcomes(OutcomesItemResultType value) {
        this.outcomes = value;
    }

    /**
     * Gets the feedback displayed.
     * 
     * @return the feedback displayed
     */
    public FeedbackDisplayedType getFeedbackDisplayed() {
        return feedbackDisplayed;
    }

    /**
     * Sets the feedback displayed.
     * 
     * @param value the new feedback displayed
     */
    public void setFeedbackDisplayed(FeedbackDisplayedType value) {
        this.feedbackDisplayed = value;
    }

}
