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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.PersonType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.attendee.RoleType;


/**
 * The Class ParticipantType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "participantType", propOrder = {
    "person",
    "contactID",
    "joinStatus",
    "role"
})
public class ParticipantType
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The person. */
    @XmlElement(required = true)
    protected PersonType person;
    
    /** The contact id. */
    protected Long contactID;
    
    /** The join status. */
    protected JoinStatusType joinStatus;
    
    /** The role. */
    protected RoleType role;

    /**
     * Gets the person.
     * 
     * @return the person
     */
    public PersonType getPerson() {
        return person;
    }

    /**
     * Sets the person.
     * 
     * @param value the new person
     */
    public void setPerson(PersonType value) {
        this.person = value;
    }

    /**
     * Gets the contact id.
     * 
     * @return the contact id
     */
    public Long getContactID() {
        return contactID;
    }

    /**
     * Sets the contact id.
     * 
     * @param value the new contact id
     */
    public void setContactID(Long value) {
        this.contactID = value;
    }

    /**
     * Gets the join status.
     * 
     * @return the join status
     */
    public JoinStatusType getJoinStatus() {
        return joinStatus;
    }

    /**
     * Sets the join status.
     * 
     * @param value the new join status
     */
    public void setJoinStatus(JoinStatusType value) {
        this.joinStatus = value;
    }

    /**
     * Gets the role.
     * 
     * @return the role
     */
    public RoleType getRole() {
        return role;
    }

    /**
     * Sets the role.
     * 
     * @param value the new role
     */
    public void setRole(RoleType value) {
        this.role = value;
    }

}
