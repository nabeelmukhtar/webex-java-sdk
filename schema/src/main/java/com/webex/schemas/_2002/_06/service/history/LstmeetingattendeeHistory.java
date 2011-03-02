
package com.webex.schemas._2002._06.service.history;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.LstControlType;


/**
 * <p>Java class for lstmeetingattendeeHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lstmeetingattendeeHistory">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="meetingKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="order" type="{http://www.webex.com/schemas/2002/06/service/history}orderMCAttenHisType" minOccurs="0"/>
 *         &lt;element name="startTimeScope" type="{http://www.webex.com/schemas/2002/06/service/history}startTimeValueType" minOccurs="0"/>
 *         &lt;element name="confName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listControl" type="{http://www.webex.com/schemas/2002/06/service}lstControlType" minOccurs="0"/>
 *         &lt;element name="confID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="endTimeScope" type="{http://www.webex.com/schemas/2002/06/service/history}endTimeScopeType" minOccurs="0"/>
 *         &lt;element name="inclAudioOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lstmeetingattendeeHistory", propOrder = {
    "meetingKey",
    "order",
    "startTimeScope",
    "confName",
    "listControl",
    "confID",
    "endTimeScope",
    "inclAudioOnly"
})
@XmlSeeAlso({
    LstsalesAttendeeHistory.class
})
public class LstmeetingattendeeHistory
    extends BodyContentType
{

    protected Long meetingKey;
    protected OrderMCAttenHisType order;
    protected StartTimeValueType startTimeScope;
    protected String confName;
    protected LstControlType listControl;
    protected Long confID;
    protected EndTimeScopeType endTimeScope;
    protected Boolean inclAudioOnly;

    /**
     * Gets the value of the meetingKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMeetingKey() {
        return meetingKey;
    }

    /**
     * Sets the value of the meetingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMeetingKey(Long value) {
        this.meetingKey = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link OrderMCAttenHisType }
     *     
     */
    public OrderMCAttenHisType getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderMCAttenHisType }
     *     
     */
    public void setOrder(OrderMCAttenHisType value) {
        this.order = value;
    }

    /**
     * Gets the value of the startTimeScope property.
     * 
     * @return
     *     possible object is
     *     {@link StartTimeValueType }
     *     
     */
    public StartTimeValueType getStartTimeScope() {
        return startTimeScope;
    }

    /**
     * Sets the value of the startTimeScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartTimeValueType }
     *     
     */
    public void setStartTimeScope(StartTimeValueType value) {
        this.startTimeScope = value;
    }

    /**
     * Gets the value of the confName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfName() {
        return confName;
    }

    /**
     * Sets the value of the confName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfName(String value) {
        this.confName = value;
    }

    /**
     * Gets the value of the listControl property.
     * 
     * @return
     *     possible object is
     *     {@link LstControlType }
     *     
     */
    public LstControlType getListControl() {
        return listControl;
    }

    /**
     * Sets the value of the listControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link LstControlType }
     *     
     */
    public void setListControl(LstControlType value) {
        this.listControl = value;
    }

    /**
     * Gets the value of the confID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConfID() {
        return confID;
    }

    /**
     * Sets the value of the confID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConfID(Long value) {
        this.confID = value;
    }

    /**
     * Gets the value of the endTimeScope property.
     * 
     * @return
     *     possible object is
     *     {@link EndTimeScopeType }
     *     
     */
    public EndTimeScopeType getEndTimeScope() {
        return endTimeScope;
    }

    /**
     * Sets the value of the endTimeScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndTimeScopeType }
     *     
     */
    public void setEndTimeScope(EndTimeScopeType value) {
        this.endTimeScope = value;
    }

    /**
     * Gets the value of the inclAudioOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInclAudioOnly() {
        return inclAudioOnly;
    }

    /**
     * Sets the value of the inclAudioOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInclAudioOnly(Boolean value) {
        this.inclAudioOnly = value;
    }

}
