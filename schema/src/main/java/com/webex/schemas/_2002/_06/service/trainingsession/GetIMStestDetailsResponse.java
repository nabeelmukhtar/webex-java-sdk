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
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.trainingsessionqtiasi.QuestestinteropType;


/**
 * <p>Java class for getIMStestDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getIMStestDetailsResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="questestinterop" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}questestinteropType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getIMStestDetailsResponse", propOrder = {
    "questestinterop"
})
public class GetIMStestDetailsResponse
    extends BodyContentType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected QuestestinteropType questestinterop;

    /**
     * Gets the value of the questestinterop property.
     * 
     * @return
     *     possible object is
     *     {@link QuestestinteropType }
     *     
     */
    public QuestestinteropType getQuestestinterop() {
        return questestinterop;
    }

    /**
     * Sets the value of the questestinterop property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuestestinteropType }
     *     
     */
    public void setQuestestinterop(QuestestinteropType value) {
        this.questestinterop = value;
    }

}
