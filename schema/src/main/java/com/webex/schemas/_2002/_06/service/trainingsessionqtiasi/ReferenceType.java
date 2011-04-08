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
 * <p>Java class for referenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="referenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="qticomment" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}qticommentType"/>
 *         &lt;element name="material" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}materialType"/>
 *         &lt;element name="mattext" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}mattextType"/>
 *         &lt;element name="matemtext" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}matemtextType"/>
 *         &lt;element name="matimage" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}matimageType"/>
 *         &lt;element name="mataudio" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}mataudioType"/>
 *         &lt;element name="matvideo" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}matvideoType"/>
 *         &lt;element name="matapplet" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}matappletType"/>
 *         &lt;element name="matapplication" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}matapplicationType"/>
 *         &lt;element name="matbreak" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}matbreakType"/>
 *         &lt;element name="mat_extension" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}mat_extensionType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "referenceType", propOrder = {
    "qticommentOrMaterialOrMattext"
})
public class ReferenceType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
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
     * Gets the value of the qticommentOrMaterialOrMattext property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qticommentOrMaterialOrMattext property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQticommentOrMaterialOrMattext().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatvideoType }
     * {@link MataudioType }
     * {@link MatemtextType }
     * {@link MatbreakType }
     * {@link MatExtensionType }
     * {@link MattextType }
     * {@link QticommentType }
     * {@link MaterialType }
     * {@link MatapplicationType }
     * {@link MatappletType }
     * {@link MatimageType }
     * 
     * 
     */
    public List<Object> getQticommentOrMaterialOrMattext() {
        if (qticommentOrMaterialOrMattext == null) {
            qticommentOrMaterialOrMattext = new ArrayList<Object>();
        }
        return this.qticommentOrMaterialOrMattext;
    }

}
