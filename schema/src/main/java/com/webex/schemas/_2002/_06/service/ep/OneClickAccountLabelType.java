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

package com.webex.schemas._2002._06.service.ep;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.TspAccountLabelType;


/**
 * <p>Java class for oneClickAccountLabelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oneClickAccountLabelType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}tspAccountLabelType">
 *       &lt;sequence>
 *         &lt;element name="participantLimitedAccessCodeLabel" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="512"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oneClickAccountLabelType", propOrder = {
    "participantLimitedAccessCodeLabel"
})
public class OneClickAccountLabelType
    extends TspAccountLabelType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String participantLimitedAccessCodeLabel;

    /**
     * Gets the value of the participantLimitedAccessCodeLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantLimitedAccessCodeLabel() {
        return participantLimitedAccessCodeLabel;
    }

    /**
     * Sets the value of the participantLimitedAccessCodeLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantLimitedAccessCodeLabel(String value) {
        this.participantLimitedAccessCodeLabel = value;
    }

}
