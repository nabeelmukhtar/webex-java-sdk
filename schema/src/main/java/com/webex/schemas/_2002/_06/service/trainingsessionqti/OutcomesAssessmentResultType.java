
package com.webex.schemas._2002._06.service.trainingsessionqti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outcomes_assessment_resultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outcomes_assessment_resultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="score" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqti}score_assessment_result_outcomesType"/>
 *         &lt;element name="grade" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqti}gradeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outcomes_assessment_resultType", propOrder = {
    "score",
    "grade"
})
public class OutcomesAssessmentResultType {

    @XmlElement(required = true)
    protected ScoreAssessmentResultOutcomesType score;
    protected GradeType grade;

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link ScoreAssessmentResultOutcomesType }
     *     
     */
    public ScoreAssessmentResultOutcomesType getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScoreAssessmentResultOutcomesType }
     *     
     */
    public void setScore(ScoreAssessmentResultOutcomesType value) {
        this.score = value;
    }

    /**
     * Gets the value of the grade property.
     * 
     * @return
     *     possible object is
     *     {@link GradeType }
     *     
     */
    public GradeType getGrade() {
        return grade;
    }

    /**
     * Sets the value of the grade property.
     * 
     * @param value
     *     allowed object is
     *     {@link GradeType }
     *     
     */
    public void setGrade(GradeType value) {
        this.grade = value;
    }

}
