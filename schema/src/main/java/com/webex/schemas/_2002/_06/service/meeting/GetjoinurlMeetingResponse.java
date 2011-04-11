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

package com.webex.schemas._2002._06.service.meeting;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * The Class GetjoinurlMeetingResponse.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getjoinurlMeetingResponse", propOrder = {
    "joinMeetingURL",
    "inviteMeetingURL",
    "registerMeetingURL"
})
public class GetjoinurlMeetingResponse
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The join meeting url. */
    protected String joinMeetingURL;
    
    /** The invite meeting url. */
    protected String inviteMeetingURL;
    
    /** The register meeting url. */
    protected String registerMeetingURL;

    /**
     * Gets the join meeting url.
     * 
     * @return the join meeting url
     */
    public String getJoinMeetingURL() {
        return joinMeetingURL;
    }

    /**
     * Sets the join meeting url.
     * 
     * @param value the new join meeting url
     */
    public void setJoinMeetingURL(String value) {
        this.joinMeetingURL = value;
    }

    /**
     * Gets the invite meeting url.
     * 
     * @return the invite meeting url
     */
    public String getInviteMeetingURL() {
        return inviteMeetingURL;
    }

    /**
     * Sets the invite meeting url.
     * 
     * @param value the new invite meeting url
     */
    public void setInviteMeetingURL(String value) {
        this.inviteMeetingURL = value;
    }

    /**
     * Gets the register meeting url.
     * 
     * @return the register meeting url
     */
    public String getRegisterMeetingURL() {
        return registerMeetingURL;
    }

    /**
     * Sets the register meeting url.
     * 
     * @param value the new register meeting url
     */
    public void setRegisterMeetingURL(String value) {
        this.registerMeetingURL = value;
    }

}
