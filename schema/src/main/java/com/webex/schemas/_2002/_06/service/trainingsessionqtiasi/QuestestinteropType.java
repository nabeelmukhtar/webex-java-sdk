
package com.webex.schemas._2002._06.service.trainingsessionqtiasi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for questestinteropType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="questestinteropType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assessment" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}assessmentType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "questestinteropType", propOrder = {
    "assessment"
})
public class QuestestinteropType {

    @XmlElement(required = true)
    protected AssessmentType assessment;

    /**
     * Gets the value of the assessment property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentType }
     *     
     */
    public AssessmentType getAssessment() {
        return assessment;
    }

    /**
     * Sets the value of the assessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentType }
     *     
     */
    public void setAssessment(AssessmentType value) {
        this.assessment = value;
    }

}
