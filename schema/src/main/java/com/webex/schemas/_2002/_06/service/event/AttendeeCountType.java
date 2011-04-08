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

package com.webex.schemas._2002._06.service.event;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for attendeeCountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="attendeeCountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="estEnrollment" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="estAttendance" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="source" type="{http://www.webex.com/schemas/2002/06/service/event}sourceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attendeeCountType", propOrder = {
    "estEnrollment",
    "estAttendance",
    "source"
})
public class AttendeeCountType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected long estEnrollment;
    protected long estAttendance;
    protected List<SourceType> source;

    /**
     * Gets the value of the estEnrollment property.
     * 
     */
    public long getEstEnrollment() {
        return estEnrollment;
    }

    /**
     * Sets the value of the estEnrollment property.
     * 
     */
    public void setEstEnrollment(long value) {
        this.estEnrollment = value;
    }

    /**
     * Gets the value of the estAttendance property.
     * 
     */
    public long getEstAttendance() {
        return estAttendance;
    }

    /**
     * Sets the value of the estAttendance property.
     * 
     */
    public void setEstAttendance(long value) {
        this.estAttendance = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the source property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceType }
     * 
     * 
     */
    public List<SourceType> getSource() {
        if (source == null) {
            source = new ArrayList<SourceType>();
        }
        return this.source;
    }

}
