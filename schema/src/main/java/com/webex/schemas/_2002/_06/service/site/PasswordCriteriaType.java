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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class PasswordCriteriaType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passwordCriteriaType", propOrder = {
    "mixedCase",
    "minLength",
    "minAlpha",
    "minNumeric",
    "minSpecial",
    "disallowWebTextSessions",
    "disallowWebTextAccounts",
    "disallowList",
    "disallowValue"
})
public class PasswordCriteriaType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The mixed case. */
    protected boolean mixedCase;
    
    /** The min length. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long minLength;
    
    /** The min alpha. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long minAlpha;
    
    /** The min numeric. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long minNumeric;
    
    /** The min special. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long minSpecial;
    
    /** The disallow web text sessions. */
    protected boolean disallowWebTextSessions;
    
    /** The disallow web text accounts. */
    protected boolean disallowWebTextAccounts;
    
    /** The disallow list. */
    protected boolean disallowList;
    
    /** The disallow value. */
    protected List<String> disallowValue;

    /**
     * Checks if is mixed case.
     * 
     * @return true, if is mixed case
     */
    public boolean isMixedCase() {
        return mixedCase;
    }

    /**
     * Sets the mixed case.
     * 
     * @param value the new mixed case
     */
    public void setMixedCase(boolean value) {
        this.mixedCase = value;
    }

    /**
     * Gets the min length.
     * 
     * @return the min length
     */
    public Long getMinLength() {
        return minLength;
    }

    /**
     * Sets the min length.
     * 
     * @param value the new min length
     */
    public void setMinLength(Long value) {
        this.minLength = value;
    }

    /**
     * Gets the min alpha.
     * 
     * @return the min alpha
     */
    public Long getMinAlpha() {
        return minAlpha;
    }

    /**
     * Sets the min alpha.
     * 
     * @param value the new min alpha
     */
    public void setMinAlpha(Long value) {
        this.minAlpha = value;
    }

    /**
     * Gets the min numeric.
     * 
     * @return the min numeric
     */
    public Long getMinNumeric() {
        return minNumeric;
    }

    /**
     * Sets the min numeric.
     * 
     * @param value the new min numeric
     */
    public void setMinNumeric(Long value) {
        this.minNumeric = value;
    }

    /**
     * Gets the min special.
     * 
     * @return the min special
     */
    public Long getMinSpecial() {
        return minSpecial;
    }

    /**
     * Sets the min special.
     * 
     * @param value the new min special
     */
    public void setMinSpecial(Long value) {
        this.minSpecial = value;
    }

    /**
     * Checks if is disallow web text sessions.
     * 
     * @return true, if is disallow web text sessions
     */
    public boolean isDisallowWebTextSessions() {
        return disallowWebTextSessions;
    }

    /**
     * Sets the disallow web text sessions.
     * 
     * @param value the new disallow web text sessions
     */
    public void setDisallowWebTextSessions(boolean value) {
        this.disallowWebTextSessions = value;
    }

    /**
     * Checks if is disallow web text accounts.
     * 
     * @return true, if is disallow web text accounts
     */
    public boolean isDisallowWebTextAccounts() {
        return disallowWebTextAccounts;
    }

    /**
     * Sets the disallow web text accounts.
     * 
     * @param value the new disallow web text accounts
     */
    public void setDisallowWebTextAccounts(boolean value) {
        this.disallowWebTextAccounts = value;
    }

    /**
     * Checks if is disallow list.
     * 
     * @return true, if is disallow list
     */
    public boolean isDisallowList() {
        return disallowList;
    }

    /**
     * Sets the disallow list.
     * 
     * @param value the new disallow list
     */
    public void setDisallowList(boolean value) {
        this.disallowList = value;
    }

    /**
     * Gets the disallow value.
     * 
     * @return the disallow value
     */
    public List<String> getDisallowValue() {
        if (disallowValue == null) {
            disallowValue = new ArrayList<String>();
        }
        return this.disallowValue;
    }

}
