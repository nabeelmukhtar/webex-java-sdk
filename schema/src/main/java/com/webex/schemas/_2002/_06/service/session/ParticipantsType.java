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

package com.webex.schemas._2002._06.service.session;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class ParticipantsType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "participantsType", propOrder = {
    "maxUserNumber",
    "participants"
})
public class ParticipantsType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The max user number. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long maxUserNumber;
    
    /** The participants. */
    @XmlElementRef(name = "participants", namespace = "http://www.webex.com/schemas/2002/06/service/session", type = JAXBElement.class)
    protected JAXBElement<ParticipantsType.Participants> participants;

    /**
     * Gets the max user number.
     * 
     * @return the max user number
     */
    public Long getMaxUserNumber() {
        return maxUserNumber;
    }

    /**
     * Sets the max user number.
     * 
     * @param value the new max user number
     */
    public void setMaxUserNumber(Long value) {
        this.maxUserNumber = value;
    }

    /**
     * Gets the participants.
     * 
     * @return the participants
     */
    public JAXBElement<ParticipantsType.Participants> getParticipants() {
        return participants;
    }

    /**
     * Sets the participants.
     * 
     * @param value the new participants
     */
    public void setParticipants(JAXBElement<ParticipantsType.Participants> value) {
        this.participants = ((JAXBElement<ParticipantsType.Participants> ) value);
    }


    /**
     * The Class Participants.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "participant"
    })
    public static class Participants
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The participant. */
        @XmlElement(nillable = true)
        protected List<ParticipantType> participant;

        /**
         * Gets the participant.
         * 
         * @return the participant
         */
        public List<ParticipantType> getParticipant() {
            if (participant == null) {
                participant = new ArrayList<ParticipantType>();
            }
            return this.participant;
        }

    }

}
