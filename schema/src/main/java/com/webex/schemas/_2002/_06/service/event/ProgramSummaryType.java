
package com.webex.schemas._2002._06.service.event;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for programSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="programSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="programID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="programName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hostWebExID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="expectedEnrollment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="budget" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.webex.com/schemas/2002/06/service/event}listingType" minOccurs="0"/>
 *         &lt;element name="programURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="afterEnrollmentURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "programSummaryType", propOrder = {
    "programID",
    "programName",
    "hostWebExID",
    "expectedEnrollment",
    "budget",
    "status",
    "programURL",
    "afterEnrollmentURL"
})
public class ProgramSummaryType {

    protected long programID;
    @XmlElement(required = true)
    protected String programName;
    @XmlElement(required = true)
    protected String hostWebExID;
    protected String expectedEnrollment;
    protected String budget;
    protected ListingType status;
    protected String programURL;
    protected String afterEnrollmentURL;

    /**
     * Gets the value of the programID property.
     * 
     */
    public long getProgramID() {
        return programID;
    }

    /**
     * Sets the value of the programID property.
     * 
     */
    public void setProgramID(long value) {
        this.programID = value;
    }

    /**
     * Gets the value of the programName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * Sets the value of the programName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramName(String value) {
        this.programName = value;
    }

    /**
     * Gets the value of the hostWebExID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostWebExID() {
        return hostWebExID;
    }

    /**
     * Sets the value of the hostWebExID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostWebExID(String value) {
        this.hostWebExID = value;
    }

    /**
     * Gets the value of the expectedEnrollment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpectedEnrollment() {
        return expectedEnrollment;
    }

    /**
     * Sets the value of the expectedEnrollment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedEnrollment(String value) {
        this.expectedEnrollment = value;
    }

    /**
     * Gets the value of the budget property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBudget() {
        return budget;
    }

    /**
     * Sets the value of the budget property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBudget(String value) {
        this.budget = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ListingType }
     *     
     */
    public ListingType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingType }
     *     
     */
    public void setStatus(ListingType value) {
        this.status = value;
    }

    /**
     * Gets the value of the programURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramURL() {
        return programURL;
    }

    /**
     * Sets the value of the programURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramURL(String value) {
        this.programURL = value;
    }

    /**
     * Gets the value of the afterEnrollmentURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfterEnrollmentURL() {
        return afterEnrollmentURL;
    }

    /**
     * Sets the value of the afterEnrollmentURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfterEnrollmentURL(String value) {
        this.afterEnrollmentURL = value;
    }

}
