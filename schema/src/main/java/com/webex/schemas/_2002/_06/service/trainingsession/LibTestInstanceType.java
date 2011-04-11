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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class LibTestInstanceType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "libTestInstanceType", propOrder = {
    "testID",
    "type",
    "title",
    "description",
    "author"
})
public class LibTestInstanceType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The test id. */
    protected long testID;
    
    /** The type. */
    @XmlElement(required = true)
    protected ShareType type;
    
    /** The title. */
    @XmlElement(required = true)
    protected String title;
    
    /** The description. */
    @XmlElement(required = true)
    protected String description;
    
    /** The author. */
    @XmlElement(required = true)
    protected String author;

    /**
     * Gets the test id.
     * 
     * @return the test id
     */
    public long getTestID() {
        return testID;
    }

    /**
     * Sets the test id.
     * 
     * @param value the new test id
     */
    public void setTestID(long value) {
        this.testID = value;
    }

    /**
     * Gets the type.
     * 
     * @return the type
     */
    public ShareType getType() {
        return type;
    }

    /**
     * Sets the type.
     * 
     * @param value the new type
     */
    public void setType(ShareType value) {
        this.type = value;
    }

    /**
     * Gets the title.
     * 
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title.
     * 
     * @param value the new title
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the description.
     * 
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description.
     * 
     * @param value the new description
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the author.
     * 
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author.
     * 
     * @param value the new author
     */
    public void setAuthor(String value) {
        this.author = value;
    }

}
