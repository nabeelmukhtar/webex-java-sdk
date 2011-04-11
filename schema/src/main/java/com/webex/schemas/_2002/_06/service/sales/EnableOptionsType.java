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

package com.webex.schemas._2002._06.service.sales;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class EnableOptionsType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enableOptionsType", propOrder = {
    "autoDeleteAfterMeetingEnd",
    "sendEmailByClient",
    "displayQuickStartHost"
})
public class EnableOptionsType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The auto delete after meeting end. */
    protected Boolean autoDeleteAfterMeetingEnd;
    
    /** The send email by client. */
    protected Boolean sendEmailByClient;
    
    /** The display quick start host. */
    protected Boolean displayQuickStartHost;

    /**
     * Checks if is auto delete after meeting end.
     * 
     * @return the boolean
     */
    public Boolean isAutoDeleteAfterMeetingEnd() {
        return autoDeleteAfterMeetingEnd;
    }

    /**
     * Sets the auto delete after meeting end.
     * 
     * @param value the new auto delete after meeting end
     */
    public void setAutoDeleteAfterMeetingEnd(Boolean value) {
        this.autoDeleteAfterMeetingEnd = value;
    }

    /**
     * Checks if is send email by client.
     * 
     * @return the boolean
     */
    public Boolean isSendEmailByClient() {
        return sendEmailByClient;
    }

    /**
     * Sets the send email by client.
     * 
     * @param value the new send email by client
     */
    public void setSendEmailByClient(Boolean value) {
        this.sendEmailByClient = value;
    }

    /**
     * Checks if is display quick start host.
     * 
     * @return the boolean
     */
    public Boolean isDisplayQuickStartHost() {
        return displayQuickStartHost;
    }

    /**
     * Sets the display quick start host.
     * 
     * @param value the new display quick start host
     */
    public void setDisplayQuickStartHost(Boolean value) {
        this.displayQuickStartHost = value;
    }

}
