
package com.webex.schemas._2002._06.service.event;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.SessionTemplateType;


/**
 * <p>Java class for metaDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="metaDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sessionType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultHighestMT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sessionTemplate" type="{http://www.webex.com/schemas/2002/06/common}sessionTemplateType" minOccurs="0"/>
 *         &lt;element name="programID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="postEventSurvey" type="{http://www.webex.com/schemas/2002/06/service/event}postEventSurveyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metaDataType", propOrder = {
    "sessionName",
    "sessionType",
    "description",
    "defaultHighestMT",
    "sessionTemplate",
    "programID",
    "postEventSurvey"
})
public class MetaDataType {

    protected String sessionName;
    @XmlElement(defaultValue = "-1")
    protected BigInteger sessionType;
    protected String description;
    @XmlElement(defaultValue = "true")
    protected Boolean defaultHighestMT;
    protected SessionTemplateType sessionTemplate;
    protected BigInteger programID;
    protected PostEventSurveyType postEventSurvey;

    /**
     * Gets the value of the sessionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionName() {
        return sessionName;
    }

    /**
     * Sets the value of the sessionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionName(String value) {
        this.sessionName = value;
    }

    /**
     * Gets the value of the sessionType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSessionType() {
        return sessionType;
    }

    /**
     * Sets the value of the sessionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSessionType(BigInteger value) {
        this.sessionType = value;
    }

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
     * Gets the value of the defaultHighestMT property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultHighestMT() {
        return defaultHighestMT;
    }

    /**
     * Sets the value of the defaultHighestMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultHighestMT(Boolean value) {
        this.defaultHighestMT = value;
    }

    /**
     * Gets the value of the sessionTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link SessionTemplateType }
     *     
     */
    public SessionTemplateType getSessionTemplate() {
        return sessionTemplate;
    }

    /**
     * Sets the value of the sessionTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionTemplateType }
     *     
     */
    public void setSessionTemplate(SessionTemplateType value) {
        this.sessionTemplate = value;
    }

    /**
     * Gets the value of the programID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProgramID() {
        return programID;
    }

    /**
     * Sets the value of the programID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProgramID(BigInteger value) {
        this.programID = value;
    }

    /**
     * Gets the value of the postEventSurvey property.
     * 
     * @return
     *     possible object is
     *     {@link PostEventSurveyType }
     *     
     */
    public PostEventSurveyType getPostEventSurvey() {
        return postEventSurvey;
    }

    /**
     * Sets the value of the postEventSurvey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostEventSurveyType }
     *     
     */
    public void setPostEventSurvey(PostEventSurveyType value) {
        this.postEventSurvey = value;
    }

}
