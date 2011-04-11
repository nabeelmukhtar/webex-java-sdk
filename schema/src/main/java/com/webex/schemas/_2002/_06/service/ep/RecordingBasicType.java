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

package com.webex.schemas._2002._06.service.ep;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.ListingType;


/**
 * The Class RecordingBasicType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recordingBasicType", propOrder = {
    "topic",
    "listing",
    "presenter",
    "email",
    "agenda"
})
@XmlSeeAlso({
    com.webex.schemas._2002._06.service.ep.GetRecordingInfoResponse.Basic.class
})
public class RecordingBasicType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The topic. */
    protected String topic;
    
    /** The listing. */
    protected ListingType listing;
    
    /** The presenter. */
    protected String presenter;
    
    /** The email. */
    protected String email;
    
    /** The agenda. */
    protected String agenda;

    /**
     * Gets the topic.
     * 
     * @return the topic
     */
    public String getTopic() {
        return topic;
    }

    /**
     * Sets the topic.
     * 
     * @param value the new topic
     */
    public void setTopic(String value) {
        this.topic = value;
    }

    /**
     * Gets the listing.
     * 
     * @return the listing
     */
    public ListingType getListing() {
        return listing;
    }

    /**
     * Sets the listing.
     * 
     * @param value the new listing
     */
    public void setListing(ListingType value) {
        this.listing = value;
    }

    /**
     * Gets the presenter.
     * 
     * @return the presenter
     */
    public String getPresenter() {
        return presenter;
    }

    /**
     * Sets the presenter.
     * 
     * @param value the new presenter
     */
    public void setPresenter(String value) {
        this.presenter = value;
    }

    /**
     * Gets the email.
     * 
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email.
     * 
     * @param value the new email
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the agenda.
     * 
     * @return the agenda
     */
    public String getAgenda() {
        return agenda;
    }

    /**
     * Sets the agenda.
     * 
     * @param value the new agenda
     */
    public void setAgenda(String value) {
        this.agenda = value;
    }

}
