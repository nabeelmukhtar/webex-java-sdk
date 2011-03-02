
package com.webex.schemas._2002._06.service.ep;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.GlobalCallInNumType;
import com.webex.schemas._2002._06.service.TspAccountType;


/**
 * <p>Java class for oneClickAccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oneClickAccountType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}tspAccountType">
 *       &lt;sequence>
 *         &lt;element name="participantLimitedAccessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intlLocalCallInNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tollFreeCallInData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tollCallInData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="globalNum" type="{http://www.webex.com/schemas/2002/06/service}globalCallInNumType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oneClickAccountType", propOrder = {
    "participantLimitedAccessCode",
    "intlLocalCallInNumber",
    "tollFreeCallInData",
    "tollCallInData",
    "globalNum"
})
public class OneClickAccountType
    extends TspAccountType
{

    protected String participantLimitedAccessCode;
    protected String intlLocalCallInNumber;
    protected String tollFreeCallInData;
    protected String tollCallInData;
    protected List<GlobalCallInNumType> globalNum;

    /**
     * Gets the value of the participantLimitedAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantLimitedAccessCode() {
        return participantLimitedAccessCode;
    }

    /**
     * Sets the value of the participantLimitedAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantLimitedAccessCode(String value) {
        this.participantLimitedAccessCode = value;
    }

    /**
     * Gets the value of the intlLocalCallInNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntlLocalCallInNumber() {
        return intlLocalCallInNumber;
    }

    /**
     * Sets the value of the intlLocalCallInNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntlLocalCallInNumber(String value) {
        this.intlLocalCallInNumber = value;
    }

    /**
     * Gets the value of the tollFreeCallInData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTollFreeCallInData() {
        return tollFreeCallInData;
    }

    /**
     * Sets the value of the tollFreeCallInData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTollFreeCallInData(String value) {
        this.tollFreeCallInData = value;
    }

    /**
     * Gets the value of the tollCallInData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTollCallInData() {
        return tollCallInData;
    }

    /**
     * Sets the value of the tollCallInData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTollCallInData(String value) {
        this.tollCallInData = value;
    }

    /**
     * Gets the value of the globalNum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the globalNum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalNum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalCallInNumType }
     * 
     * 
     */
    public List<GlobalCallInNumType> getGlobalNum() {
        if (globalNum == null) {
            globalNum = new ArrayList<GlobalCallInNumType>();
        }
        return this.globalNum;
    }

}
