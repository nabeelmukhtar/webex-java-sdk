
package com.webex.schemas._2002._06.service.trainingsessionqti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outcomes_item_resultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outcomes_item_resultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="score" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqti}score_item_result_outcomesType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outcomes_item_resultType", propOrder = {
    "score"
})
public class OutcomesItemResultType {

    @XmlElement(required = true)
    protected ScoreItemResultOutcomesType score;

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link ScoreItemResultOutcomesType }
     *     
     */
    public ScoreItemResultOutcomesType getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScoreItemResultOutcomesType }
     *     
     */
    public void setScore(ScoreItemResultOutcomesType value) {
        this.score = value;
    }

}
