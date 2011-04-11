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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class ObjectbankType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objectbankType", propOrder = {
    "qticomment",
    "qtimetadata",
    "sectionOrItem"
})
public class ObjectbankType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The qticomment. */
    protected QticommentType qticomment;
    
    /** The qtimetadata. */
    protected List<QtimetadataType> qtimetadata;
    
    /** The section or item. */
    @XmlElements({
        @XmlElement(name = "item", type = ItemType.class),
        @XmlElement(name = "section", type = SectionType.class)
    })
    protected List<Object> sectionOrItem;
    
    /** The ident. */
    @XmlAttribute(required = true)
    protected String ident;

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
     * Gets the qtimetadata.
     * 
     * @return the qtimetadata
     */
    public List<QtimetadataType> getQtimetadata() {
        if (qtimetadata == null) {
            qtimetadata = new ArrayList<QtimetadataType>();
        }
        return this.qtimetadata;
    }

    /**
     * Gets the section or item.
     * 
     * @return the section or item
     */
    public List<Object> getSectionOrItem() {
        if (sectionOrItem == null) {
            sectionOrItem = new ArrayList<Object>();
        }
        return this.sectionOrItem;
    }

    /**
     * Gets the ident.
     * 
     * @return the ident
     */
    public String getIdent() {
        return ident;
    }

    /**
     * Sets the ident.
     * 
     * @param value the new ident
     */
    public void setIdent(String value) {
        this.ident = value;
    }

}
