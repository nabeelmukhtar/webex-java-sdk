
package com.webex.schemas._2002._06.service.trainingsession;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for scheduledTestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scheduledTestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="testID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="delivery" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}testDeliveryType"/>
 *         &lt;element name="status" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}testStatusType"/>
 *         &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scheduledTestType", propOrder = {
    "testID",
    "title",
    "delivery",
    "status",
    "dueDate"
})
public class ScheduledTestType {

    @XmlElement(required = true)
    protected BigInteger testID;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true, defaultValue = "IN_SESSION")
    protected TestDeliveryType delivery;
    @XmlElement(required = true, defaultValue = "NOT_STARTED")
    protected TestStatusType status;
    protected String dueDate;

    /**
     * Gets the value of the testID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTestID() {
        return testID;
    }

    /**
     * Sets the value of the testID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTestID(BigInteger value) {
        this.testID = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the delivery property.
     * 
     * @return
     *     possible object is
     *     {@link TestDeliveryType }
     *     
     */
    public TestDeliveryType getDelivery() {
        return delivery;
    }

    /**
     * Sets the value of the delivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestDeliveryType }
     *     
     */
    public void setDelivery(TestDeliveryType value) {
        this.delivery = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TestStatusType }
     *     
     */
    public TestStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestStatusType }
     *     
     */
    public void setStatus(TestStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDate(String value) {
        this.dueDate = value;
    }

}
