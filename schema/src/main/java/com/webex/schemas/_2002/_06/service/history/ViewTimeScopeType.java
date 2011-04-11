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

package com.webex.schemas._2002._06.service.history;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class ViewTimeScopeType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "viewTimeScopeType", propOrder = {
    "viewTimeStart",
    "viewTimeEnd"
})
public class ViewTimeScopeType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The view time start. */
    @XmlElement(required = true)
    protected String viewTimeStart;
    
    /** The view time end. */
    @XmlElement(required = true)
    protected String viewTimeEnd;

    /**
     * Gets the view time start.
     * 
     * @return the view time start
     */
    public String getViewTimeStart() {
        return viewTimeStart;
    }

    /**
     * Sets the view time start.
     * 
     * @param value the new view time start
     */
    public void setViewTimeStart(String value) {
        this.viewTimeStart = value;
    }

    /**
     * Gets the view time end.
     * 
     * @return the view time end
     */
    public String getViewTimeEnd() {
        return viewTimeEnd;
    }

    /**
     * Sets the view time end.
     * 
     * @param value the new view time end
     */
    public void setViewTimeEnd(String value) {
        this.viewTimeEnd = value;
    }

}
