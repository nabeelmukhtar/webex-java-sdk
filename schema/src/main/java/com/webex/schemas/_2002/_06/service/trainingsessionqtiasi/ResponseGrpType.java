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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The Class ResponseGrpType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "response_grpType", propOrder = {
    "content"
})
public class ResponseGrpType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The content. */
    @XmlElementRefs({
        @XmlElementRef(name = "render_hotspot", namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi", type = JAXBElement.class),
        @XmlElementRef(name = "material", namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi", type = JAXBElement.class),
        @XmlElementRef(name = "material_ref", namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi", type = JAXBElement.class),
        @XmlElementRef(name = "render_choice", namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi", type = JAXBElement.class),
        @XmlElementRef(name = "render_extension", namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi", type = JAXBElement.class),
        @XmlElementRef(name = "render_fib", namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi", type = JAXBElement.class),
        @XmlElementRef(name = "render_slider", namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> content;
    
    /** The rcardinality. */
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rcardinality;
    
    /** The ident. */
    @XmlAttribute(required = true)
    protected String ident;
    
    /** The rtiming. */
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rtiming;

    /**
     * Gets the content.
     * 
     * @return the content
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

    /**
     * Gets the rcardinality.
     * 
     * @return the rcardinality
     */
    public String getRcardinality() {
        if (rcardinality == null) {
            return "Single";
        } else {
            return rcardinality;
        }
    }

    /**
     * Sets the rcardinality.
     * 
     * @param value the new rcardinality
     */
    public void setRcardinality(String value) {
        this.rcardinality = value;
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

    /**
     * Gets the rtiming.
     * 
     * @return the rtiming
     */
    public String getRtiming() {
        if (rtiming == null) {
            return "No";
        } else {
            return rtiming;
        }
    }

    /**
     * Sets the rtiming.
     * 
     * @param value the new rtiming
     */
    public void setRtiming(String value) {
        this.rtiming = value;
    }

}
