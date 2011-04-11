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

package com.webex.schemas._2002._06.service.site;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * The Class GetSite.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSite", propOrder = {
    "returnSettings"
})
public class GetSite
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The return settings. */
    protected GetSite.ReturnSettings returnSettings;

    /**
     * Gets the return settings.
     * 
     * @return the return settings
     */
    public GetSite.ReturnSettings getReturnSettings() {
        return returnSettings;
    }

    /**
     * Sets the return settings.
     * 
     * @param value the new return settings
     */
    public void setReturnSettings(GetSite.ReturnSettings value) {
        this.returnSettings = value;
    }


    /**
     * The Class ReturnSettings.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "eventCenter"
    })
    public static class ReturnSettings
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The event center. */
        protected Boolean eventCenter;

        /**
         * Checks if is event center.
         * 
         * @return the boolean
         */
        public Boolean isEventCenter() {
            return eventCenter;
        }

        /**
         * Sets the event center.
         * 
         * @param value the new event center
         */
        public void setEventCenter(Boolean value) {
            this.eventCenter = value;
        }

    }

}
