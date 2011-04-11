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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class AssessmentType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assessmentType", propOrder = {
    "qticomment",
    "duration",
    "section"
})
public class AssessmentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The qticomment. */
    protected QticommentType qticomment;
    
    /** The duration. */
    protected String duration;
    
    /** The section. */
    @XmlElement(required = true)
    protected SectionType section;
    
    /** The ident. */
    @XmlAttribute
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long ident;
    
    /** The title. */
    @XmlAttribute
    protected String title;

    /**
     * Gets the qticomment.
     * 
     * @return the qticomment
     */
    public QticommentType getQticomment() {
        return qticomment;
    }

    /**
     * Sets the qticomment.
     * 
     * @param value the new qticomment
     */
    public void setQticomment(QticommentType value) {
        this.qticomment = value;
    }

    /**
     * Gets the duration.
     * 
     * @return the duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the duration.
     * 
     * @param value the new duration
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the section.
     * 
     * @return the section
     */
    public SectionType getSection() {
        return section;
    }

    /**
     * Sets the section.
     * 
     * @param value the new section
     */
    public void setSection(SectionType value) {
        this.section = value;
    }

    /**
     * Gets the ident.
     * 
     * @return the ident
     */
    public long getIdent() {
        if (ident == null) {
            return new Adapter1().unmarshal("0");
        } else {
            return ident;
        }
    }

    /**
     * Sets the ident.
     * 
     * @param value the new ident
     */
    public void setIdent(Long value) {
        this.ident = value;
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

}
