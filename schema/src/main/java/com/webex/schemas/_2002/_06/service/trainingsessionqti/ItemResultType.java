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

package com.webex.schemas._2002._06.service.trainingsessionqti;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for item_resultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="item_resultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asi_metadata" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqti}asi_metadata_item_resultType" minOccurs="0"/>
 *         &lt;element name="response" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqti}responseType" maxOccurs="unbounded"/>
 *         &lt;element name="outcomes" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqti}outcomes_item_resultType"/>
 *         &lt;element name="feedback_displayed" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqti}feedback_displayedType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item_resultType", propOrder = {
    "asiMetadata",
    "response",
    "outcomes",
    "feedbackDisplayed"
})
public class ItemResultType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "asi_metadata")
    protected AsiMetadataItemResultType asiMetadata;
    @XmlElement(required = true)
    protected List<ResponseType> response;
    @XmlElement(required = true)
    protected OutcomesItemResultType outcomes;
    @XmlElement(name = "feedback_displayed")
    protected FeedbackDisplayedType feedbackDisplayed;

    /**
     * Gets the value of the asiMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link AsiMetadataItemResultType }
     *     
     */
    public AsiMetadataItemResultType getAsiMetadata() {
        return asiMetadata;
    }

    /**
     * Sets the value of the asiMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsiMetadataItemResultType }
     *     
     */
    public void setAsiMetadata(AsiMetadataItemResultType value) {
        this.asiMetadata = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the response property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseType }
     * 
     * 
     */
    public List<ResponseType> getResponse() {
        if (response == null) {
            response = new ArrayList<ResponseType>();
        }
        return this.response;
    }

    /**
     * Gets the value of the outcomes property.
     * 
     * @return
     *     possible object is
     *     {@link OutcomesItemResultType }
     *     
     */
    public OutcomesItemResultType getOutcomes() {
        return outcomes;
    }

    /**
     * Sets the value of the outcomes property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutcomesItemResultType }
     *     
     */
    public void setOutcomes(OutcomesItemResultType value) {
        this.outcomes = value;
    }

    /**
     * Gets the value of the feedbackDisplayed property.
     * 
     * @return
     *     possible object is
     *     {@link FeedbackDisplayedType }
     *     
     */
    public FeedbackDisplayedType getFeedbackDisplayed() {
        return feedbackDisplayed;
    }

    /**
     * Sets the value of the feedbackDisplayed property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedbackDisplayedType }
     *     
     */
    public void setFeedbackDisplayed(FeedbackDisplayedType value) {
        this.feedbackDisplayed = value;
    }

}
