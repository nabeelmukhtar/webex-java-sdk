
package com.webex.schemas._2002._06.service.trainingsession;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTestInformationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTestInformationResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/trainingsession}scheduledTestInstanceType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeLimit" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numQuestions" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="numSubmitted" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="numStarted" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="numSubmittedUnscroed" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="numSubmittedUnscored" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="submittedTest" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}submittedTestType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="maxScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTestInformationResponse", propOrder = {
    "description",
    "startDate",
    "timeLimit",
    "author",
    "numQuestions",
    "numSubmitted",
    "numStarted",
    "numSubmittedUnscroed",
    "numSubmittedUnscored",
    "submittedTest",
    "maxScore"
})
public class GetTestInformationResponse
    extends ScheduledTestInstanceType
{

    protected String description;
    @XmlElement(required = true)
    protected String startDate;
    protected BigInteger timeLimit;
    @XmlElement(required = true)
    protected String author;
    @XmlElement(required = true)
    protected BigInteger numQuestions;
    @XmlElement(required = true)
    protected BigInteger numSubmitted;
    @XmlElement(required = true)
    protected BigInteger numStarted;
    @XmlElement(required = true)
    protected BigInteger numSubmittedUnscroed;
    protected BigInteger numSubmittedUnscored;
    protected List<SubmittedTestType> submittedTest;
    protected BigInteger maxScore;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the timeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimeLimit() {
        return timeLimit;
    }

    /**
     * Sets the value of the timeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimeLimit(BigInteger value) {
        this.timeLimit = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the numQuestions property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumQuestions() {
        return numQuestions;
    }

    /**
     * Sets the value of the numQuestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumQuestions(BigInteger value) {
        this.numQuestions = value;
    }

    /**
     * Gets the value of the numSubmitted property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumSubmitted() {
        return numSubmitted;
    }

    /**
     * Sets the value of the numSubmitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumSubmitted(BigInteger value) {
        this.numSubmitted = value;
    }

    /**
     * Gets the value of the numStarted property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumStarted() {
        return numStarted;
    }

    /**
     * Sets the value of the numStarted property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumStarted(BigInteger value) {
        this.numStarted = value;
    }

    /**
     * Gets the value of the numSubmittedUnscroed property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumSubmittedUnscroed() {
        return numSubmittedUnscroed;
    }

    /**
     * Sets the value of the numSubmittedUnscroed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumSubmittedUnscroed(BigInteger value) {
        this.numSubmittedUnscroed = value;
    }

    /**
     * Gets the value of the numSubmittedUnscored property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumSubmittedUnscored() {
        return numSubmittedUnscored;
    }

    /**
     * Sets the value of the numSubmittedUnscored property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumSubmittedUnscored(BigInteger value) {
        this.numSubmittedUnscored = value;
    }

    /**
     * Gets the value of the submittedTest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the submittedTest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubmittedTest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubmittedTestType }
     * 
     * 
     */
    public List<SubmittedTestType> getSubmittedTest() {
        if (submittedTest == null) {
            submittedTest = new ArrayList<SubmittedTestType>();
        }
        return this.submittedTest;
    }

    /**
     * Gets the value of the maxScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxScore() {
        return maxScore;
    }

    /**
     * Sets the value of the maxScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxScore(BigInteger value) {
        this.maxScore = value;
    }

}
