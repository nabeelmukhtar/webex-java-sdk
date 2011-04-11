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

package com.webex.schemas._2002._06.service.trainingsessionqtiasi;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The Class DisplayfeedbackType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "displayfeedbackType", propOrder = {
    "value"
})
public class DisplayfeedbackType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The value. */
    @XmlValue
    protected String value;
    
    /** The feedbacktype. */
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String feedbacktype;
    
    /** The linkrefid. */
    @XmlAttribute(required = true)
    protected String linkrefid;

    /**
     * Gets the value.
     * 
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value.
     * 
     * @param value the new value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the feedbacktype.
     * 
     * @return the feedbacktype
     */
    public String getFeedbacktype() {
        if (feedbacktype == null) {
            return "Response";
        } else {
            return feedbacktype;
        }
    }

    /**
     * Sets the feedbacktype.
     * 
     * @param value the new feedbacktype
     */
    public void setFeedbacktype(String value) {
        this.feedbacktype = value;
    }

    /**
     * Gets the linkrefid.
     * 
     * @return the linkrefid
     */
    public String getLinkrefid() {
        return linkrefid;
    }

    /**
     * Sets the linkrefid.
     * 
     * @param value the new linkrefid
     */
    public void setLinkrefid(String value) {
        this.linkrefid = value;
    }

}
