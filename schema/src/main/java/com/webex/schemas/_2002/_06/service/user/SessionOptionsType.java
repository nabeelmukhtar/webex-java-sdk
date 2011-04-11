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

package com.webex.schemas._2002._06.service.user;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.webex.schemas._2002._06.common.ServiceTypeType;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class SessionOptionsType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sessionOptionsType", propOrder = {
    "defaultSessionType",
    "defaultServiceType",
    "autoDeleteAfterMeetingEnd",
    "displayQuickStartHost",
    "displayQuickStartAttendees"
})
public class SessionOptionsType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The default session type. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long defaultSessionType;
    
    /** The default service type. */
    protected ServiceTypeType defaultServiceType;
    
    /** The auto delete after meeting end. */
    protected Boolean autoDeleteAfterMeetingEnd;
    
    /** The display quick start host. */
    protected Boolean displayQuickStartHost;
    
    /** The display quick start attendees. */
    protected Boolean displayQuickStartAttendees;

    /**
     * Gets the default session type.
     * 
     * @return the default session type
     */
    public Long getDefaultSessionType() {
        return defaultSessionType;
    }

    /**
     * Sets the default session type.
     * 
     * @param value the new default session type
     */
    public void setDefaultSessionType(Long value) {
        this.defaultSessionType = value;
    }

    /**
     * Gets the default service type.
     * 
     * @return the default service type
     */
    public ServiceTypeType getDefaultServiceType() {
        return defaultServiceType;
    }

    /**
     * Sets the default service type.
     * 
     * @param value the new default service type
     */
    public void setDefaultServiceType(ServiceTypeType value) {
        this.defaultServiceType = value;
    }

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

    /**
     * Checks if is display quick start attendees.
     * 
     * @return the boolean
     */
    public Boolean isDisplayQuickStartAttendees() {
        return displayQuickStartAttendees;
    }

    /**
     * Sets the display quick start attendees.
     * 
     * @param value the new display quick start attendees
     */
    public void setDisplayQuickStartAttendees(Boolean value) {
        this.displayQuickStartAttendees = value;
    }

}
