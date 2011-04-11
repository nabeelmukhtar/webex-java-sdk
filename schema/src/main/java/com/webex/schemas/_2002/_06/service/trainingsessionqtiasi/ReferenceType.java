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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class ReferenceType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "referenceType", propOrder = {
    "qticommentOrMaterialOrMattext"
})
public class ReferenceType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The qticomment or material or mattext. */
    @XmlElements({
        @XmlElement(name = "matvideo", type = MatvideoType.class),
        @XmlElement(name = "mataudio", type = MataudioType.class),
        @XmlElement(name = "matemtext", type = MatemtextType.class),
        @XmlElement(name = "matbreak", type = MatbreakType.class),
        @XmlElement(name = "mat_extension", type = MatExtensionType.class),
        @XmlElement(name = "mattext", type = MattextType.class),
        @XmlElement(name = "qticomment", type = QticommentType.class),
        @XmlElement(name = "material", type = MaterialType.class),
        @XmlElement(name = "matapplication", type = MatapplicationType.class),
        @XmlElement(name = "matapplet", type = MatappletType.class),
        @XmlElement(name = "matimage", type = MatimageType.class)
    })
    protected List<Object> qticommentOrMaterialOrMattext;

    /**
     * Gets the qticomment or material or mattext.
     * 
     * @return the qticomment or material or mattext
     */
    public List<Object> getQticommentOrMaterialOrMattext() {
        if (qticommentOrMaterialOrMattext == null) {
            qticommentOrMaterialOrMattext = new ArrayList<Object>();
        }
        return this.qticommentOrMaterialOrMattext;
    }

}
