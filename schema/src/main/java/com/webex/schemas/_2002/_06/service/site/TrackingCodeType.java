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
 * The Class TrackingCodeType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trackingCodeType", propOrder = {
    "index",
    "name",
    "inputMode",
    "hostProfile",
    "schedulingPage",
    "listValue"
})
public class TrackingCodeType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The index. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long index;
    
    /** The name. */
    @XmlElement(required = true)
    protected String name;
    
    /** The input mode. */
    @XmlElement(required = true)
    protected String inputMode;
    
    /** The host profile. */
    @XmlElement(required = true)
    protected CodeDisplayType hostProfile;
    
    /** The scheduling page. */
    protected List<CodeSchedulingType> schedulingPage;
    
    /** The list value. */
    protected List<CodeListType> listValue;

    /**
     * Gets the index.
     * 
     * @return the index
     */
    public Long getIndex() {
        return index;
    }

    /**
     * Sets the index.
     * 
     * @param value the new index
     */
    public void setIndex(Long value) {
        this.index = value;
    }

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     * 
     * @param value the new name
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the input mode.
     * 
     * @return the input mode
     */
    public String getInputMode() {
        return inputMode;
    }

    /**
     * Sets the input mode.
     * 
     * @param value the new input mode
     */
    public void setInputMode(String value) {
        this.inputMode = value;
    }

    /**
     * Gets the host profile.
     * 
     * @return the host profile
     */
    public CodeDisplayType getHostProfile() {
        return hostProfile;
    }

    /**
     * Sets the host profile.
     * 
     * @param value the new host profile
     */
    public void setHostProfile(CodeDisplayType value) {
        this.hostProfile = value;
    }

    /**
     * Gets the scheduling page.
     * 
     * @return the scheduling page
     */
    public List<CodeSchedulingType> getSchedulingPage() {
        if (schedulingPage == null) {
            schedulingPage = new ArrayList<CodeSchedulingType>();
        }
        return this.schedulingPage;
    }

    /**
     * Gets the list value.
     * 
     * @return the list value
     */
    public List<CodeListType> getListValue() {
        if (listValue == null) {
            listValue = new ArrayList<CodeListType>();
        }
        return this.listValue;
    }

}
