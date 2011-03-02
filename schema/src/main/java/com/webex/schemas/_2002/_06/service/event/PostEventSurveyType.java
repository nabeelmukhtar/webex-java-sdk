
package com.webex.schemas._2002._06.service.event;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for postEventSurveyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="postEventSurveyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="display" type="{http://www.webex.com/schemas/2002/06/service/event}surveyDisplayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "postEventSurveyType", propOrder = {
    "display"
})
public class PostEventSurveyType {

    protected SurveyDisplayType display;

    /**
     * Gets the value of the display property.
     * 
     * @return
     *     possible object is
     *     {@link SurveyDisplayType }
     *     
     */
    public SurveyDisplayType getDisplay() {
        return display;
    }

    /**
     * Sets the value of the display property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurveyDisplayType }
     *     
     */
    public void setDisplay(SurveyDisplayType value) {
        this.display = value;
    }

}
