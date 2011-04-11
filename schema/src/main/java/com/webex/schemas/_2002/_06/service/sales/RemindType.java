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

package com.webex.schemas._2002._06.service.sales;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for remindType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="remindType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enableReminder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="daysAhead" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="hoursAhead" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="minutesAhead" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remindType", propOrder = {
    "enableReminder",
    "daysAhead",
    "hoursAhead",
    "minutesAhead"
})
public class RemindType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected Boolean enableReminder;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long daysAhead;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long hoursAhead;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long minutesAhead;

    /**
     * Gets the value of the enableReminder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableReminder() {
        return enableReminder;
    }

    /**
     * Sets the value of the enableReminder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableReminder(Boolean value) {
        this.enableReminder = value;
    }

    /**
     * Gets the value of the daysAhead property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getDaysAhead() {
        return daysAhead;
    }

    /**
     * Sets the value of the daysAhead property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysAhead(Long value) {
        this.daysAhead = value;
    }

    /**
     * Gets the value of the hoursAhead property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getHoursAhead() {
        return hoursAhead;
    }

    /**
     * Sets the value of the hoursAhead property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoursAhead(Long value) {
        this.hoursAhead = value;
    }

    /**
     * Gets the value of the minutesAhead property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getMinutesAhead() {
        return minutesAhead;
    }

    /**
     * Sets the value of the minutesAhead property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinutesAhead(Long value) {
        this.minutesAhead = value;
    }

}
