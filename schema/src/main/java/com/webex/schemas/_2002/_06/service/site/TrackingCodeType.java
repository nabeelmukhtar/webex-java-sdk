
package com.webex.schemas._2002._06.service.site;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for trackingCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trackingCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="index" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inputMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hostProfile" type="{http://www.webex.com/schemas/2002/06/service/site}codeDisplayType"/>
 *         &lt;element name="schedulingPage" type="{http://www.webex.com/schemas/2002/06/service/site}codeSchedulingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listValue" type="{http://www.webex.com/schemas/2002/06/service/site}codeListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trackingCodeType", propOrder = {
    "index",
    "name",
    "inputMode",
    "hostProfile",
    "schedulingPage",
    "listValue"
})
public class TrackingCodeType {

    @XmlElement(required = true)
    protected BigInteger index;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String inputMode;
    @XmlElement(required = true)
    protected CodeDisplayType hostProfile;
    protected List<CodeSchedulingType> schedulingPage;
    protected List<CodeListType> listValue;

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndex(BigInteger value) {
        this.index = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the inputMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputMode() {
        return inputMode;
    }

    /**
     * Sets the value of the inputMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputMode(String value) {
        this.inputMode = value;
    }

    /**
     * Gets the value of the hostProfile property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDisplayType }
     *     
     */
    public CodeDisplayType getHostProfile() {
        return hostProfile;
    }

    /**
     * Sets the value of the hostProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDisplayType }
     *     
     */
    public void setHostProfile(CodeDisplayType value) {
        this.hostProfile = value;
    }

    /**
     * Gets the value of the schedulingPage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schedulingPage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchedulingPage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeSchedulingType }
     * 
     * 
     */
    public List<CodeSchedulingType> getSchedulingPage() {
        if (schedulingPage == null) {
            schedulingPage = new ArrayList<CodeSchedulingType>();
        }
        return this.schedulingPage;
    }

    /**
     * Gets the value of the listValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeListType }
     * 
     * 
     */
    public List<CodeListType> getListValue() {
        if (listValue == null) {
            listValue = new ArrayList<CodeListType>();
        }
        return this.listValue;
    }

}
