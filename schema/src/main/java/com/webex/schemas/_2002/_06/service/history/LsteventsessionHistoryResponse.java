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

package com.webex.schemas._2002._06.service.history;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.MatchingRecordsType;


/**
 * <p>Java class for lsteventsessionHistoryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lsteventsessionHistoryResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="eventSessionHistory" type="{http://www.webex.com/schemas/2002/06/service/history}eventSessionHistoryInstanceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="matchingRecords" type="{http://www.webex.com/schemas/2002/06/service}matchingRecordsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lsteventsessionHistoryResponse", propOrder = {
    "eventSessionHistory",
    "matchingRecords"
})
public class LsteventsessionHistoryResponse
    extends BodyContentType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<EventSessionHistoryInstanceType> eventSessionHistory;
    protected MatchingRecordsType matchingRecords;

    /**
     * Gets the value of the eventSessionHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventSessionHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventSessionHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventSessionHistoryInstanceType }
     * 
     * 
     */
    public List<EventSessionHistoryInstanceType> getEventSessionHistory() {
        if (eventSessionHistory == null) {
            eventSessionHistory = new ArrayList<EventSessionHistoryInstanceType>();
        }
        return this.eventSessionHistory;
    }

    /**
     * Gets the value of the matchingRecords property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingRecordsType }
     *     
     */
    public MatchingRecordsType getMatchingRecords() {
        return matchingRecords;
    }

    /**
     * Sets the value of the matchingRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingRecordsType }
     *     
     */
    public void setMatchingRecords(MatchingRecordsType value) {
        this.matchingRecords = value;
    }

}
