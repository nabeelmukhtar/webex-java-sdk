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
import javax.xml.bind.annotation.XmlType;


/**
 * The Class SalesRoleType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salesRoleType", propOrder = {
    "rep",
    "mgr",
    "asst",
    "sme"
})
public class SalesRoleType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The rep. */
    @XmlElement(defaultValue = "true")
    protected Boolean rep;
    
    /** The mgr. */
    @XmlElement(defaultValue = "false")
    protected Boolean mgr;
    
    /** The asst. */
    @XmlElement(defaultValue = "false")
    protected Boolean asst;
    
    /** The sme. */
    @XmlElement(defaultValue = "false")
    protected Boolean sme;

    /**
     * Checks if is rep.
     * 
     * @return the boolean
     */
    public Boolean isRep() {
        return rep;
    }

    /**
     * Sets the rep.
     * 
     * @param value the new rep
     */
    public void setRep(Boolean value) {
        this.rep = value;
    }

    /**
     * Checks if is mgr.
     * 
     * @return the boolean
     */
    public Boolean isMgr() {
        return mgr;
    }

    /**
     * Sets the mgr.
     * 
     * @param value the new mgr
     */
    public void setMgr(Boolean value) {
        this.mgr = value;
    }

    /**
     * Checks if is asst.
     * 
     * @return the boolean
     */
    public Boolean isAsst() {
        return asst;
    }

    /**
     * Sets the asst.
     * 
     * @param value the new asst
     */
    public void setAsst(Boolean value) {
        this.asst = value;
    }

    /**
     * Checks if is sme.
     * 
     * @return the boolean
     */
    public Boolean isSme() {
        return sme;
    }

    /**
     * Sets the sme.
     * 
     * @param value the new sme
     */
    public void setSme(Boolean value) {
        this.sme = value;
    }

}
