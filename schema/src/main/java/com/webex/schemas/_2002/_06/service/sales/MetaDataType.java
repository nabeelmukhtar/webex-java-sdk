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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.webex.schemas._2002._06.common.SessionTemplateType;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class MetaDataType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metaDataType", propOrder = {
    "confName",
    "agenda",
    "account",
    "opportunity",
    "sessionType",
    "defaultHighestMT",
    "intAccountID",
    "intOpptyID",
    "extSystemID",
    "sessionTemplate"
})
public class MetaDataType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The conf name. */
    protected String confName;
    
    /** The agenda. */
    protected String agenda;
    
    /** The account. */
    protected String account;
    
    /** The opportunity. */
    protected String opportunity;
    
    /** The session type. */
    @XmlElement(type = String.class, defaultValue = "-1")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long sessionType;
    
    /** The default highest mt. */
    @XmlElement(defaultValue = "true")
    protected Boolean defaultHighestMT;
    
    /** The int account id. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long intAccountID;
    
    /** The int oppty id. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long intOpptyID;
    
    /** The ext system id. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long extSystemID;
    
    /** The session template. */
    protected SessionTemplateType sessionTemplate;

    /**
     * Gets the conf name.
     * 
     * @return the conf name
     */
    public String getConfName() {
        return confName;
    }

    /**
     * Sets the conf name.
     * 
     * @param value the new conf name
     */
    public void setConfName(String value) {
        this.confName = value;
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

    /**
     * Gets the account.
     * 
     * @return the account
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the account.
     * 
     * @param value the new account
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Gets the opportunity.
     * 
     * @return the opportunity
     */
    public String getOpportunity() {
        return opportunity;
    }

    /**
     * Sets the opportunity.
     * 
     * @param value the new opportunity
     */
    public void setOpportunity(String value) {
        this.opportunity = value;
    }

    /**
     * Gets the session type.
     * 
     * @return the session type
     */
    public Long getSessionType() {
        return sessionType;
    }

    /**
     * Sets the session type.
     * 
     * @param value the new session type
     */
    public void setSessionType(Long value) {
        this.sessionType = value;
    }

    /**
     * Checks if is default highest mt.
     * 
     * @return the boolean
     */
    public Boolean isDefaultHighestMT() {
        return defaultHighestMT;
    }

    /**
     * Sets the default highest mt.
     * 
     * @param value the new default highest mt
     */
    public void setDefaultHighestMT(Boolean value) {
        this.defaultHighestMT = value;
    }

    /**
     * Gets the int account id.
     * 
     * @return the int account id
     */
    public Long getIntAccountID() {
        return intAccountID;
    }

    /**
     * Sets the int account id.
     * 
     * @param value the new int account id
     */
    public void setIntAccountID(Long value) {
        this.intAccountID = value;
    }

    /**
     * Gets the int oppty id.
     * 
     * @return the int oppty id
     */
    public Long getIntOpptyID() {
        return intOpptyID;
    }

    /**
     * Sets the int oppty id.
     * 
     * @param value the new int oppty id
     */
    public void setIntOpptyID(Long value) {
        this.intOpptyID = value;
    }

    /**
     * Gets the ext system id.
     * 
     * @return the ext system id
     */
    public Long getExtSystemID() {
        return extSystemID;
    }

    /**
     * Sets the ext system id.
     * 
     * @param value the new ext system id
     */
    public void setExtSystemID(Long value) {
        this.extSystemID = value;
    }

    /**
     * Gets the session template.
     * 
     * @return the session template
     */
    public SessionTemplateType getSessionTemplate() {
        return sessionTemplate;
    }

    /**
     * Sets the session template.
     * 
     * @param value the new session template
     */
    public void setSessionTemplate(SessionTemplateType value) {
        this.sessionTemplate = value;
    }

}
