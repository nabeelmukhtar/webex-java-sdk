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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * The Class CreateTrainingSessionResponse.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createTrainingSessionResponse", propOrder = {
    "sessionkey",
    "additionalInfo"
})
public class CreateTrainingSessionResponse
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The sessionkey. */
    @XmlElement(type = Long.class)
    protected List<Long> sessionkey;
    
    /** The additional info. */
    protected CreateTrainingSessionResponse.AdditionalInfo additionalInfo;

    /**
     * Gets the sessionkey.
     * 
     * @return the sessionkey
     */
    public List<Long> getSessionkey() {
        if (sessionkey == null) {
            sessionkey = new ArrayList<Long>();
        }
        return this.sessionkey;
    }

    /**
     * Gets the additional info.
     * 
     * @return the additional info
     */
    public CreateTrainingSessionResponse.AdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the additional info.
     * 
     * @param value the new additional info
     */
    public void setAdditionalInfo(CreateTrainingSessionResponse.AdditionalInfo value) {
        this.additionalInfo = value;
    }


    /**
     * The Class AdditionalInfo.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sessionkeyAndGuestToken"
    })
    public static class AdditionalInfo
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The sessionkey and guest token. */
        @XmlElements({
            @XmlElement(name = "guestToken", type = String.class),
            @XmlElement(name = "sessionkey", type = Long.class)
        })
        protected List<Serializable> sessionkeyAndGuestToken;

        /**
         * Gets the sessionkey and guest token.
         * 
         * @return the sessionkey and guest token
         */
        public List<Serializable> getSessionkeyAndGuestToken() {
            if (sessionkeyAndGuestToken == null) {
                sessionkeyAndGuestToken = new ArrayList<Serializable>();
            }
            return this.sessionkeyAndGuestToken;
        }

    }

}
