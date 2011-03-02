
package com.webex.schemas._2002._06.service.attendee;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for createMeetingAttendeeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createMeetingAttendeeResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="attendeeId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="register" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="attendeeID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="registerID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createMeetingAttendeeResponse", propOrder = {
    "attendeeId",
    "register"
})
public class CreateMeetingAttendeeResponse
    extends BodyContentType
{

    @XmlElement(type = Long.class)
    protected List<Long> attendeeId;
    protected List<CreateMeetingAttendeeResponse.Register> register;

    /**
     * Gets the value of the attendeeId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attendeeId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttendeeId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getAttendeeId() {
        if (attendeeId == null) {
            attendeeId = new ArrayList<Long>();
        }
        return this.attendeeId;
    }

    /**
     * Gets the value of the register property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the register property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegister().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreateMeetingAttendeeResponse.Register }
     * 
     * 
     */
    public List<CreateMeetingAttendeeResponse.Register> getRegister() {
        if (register == null) {
            register = new ArrayList<CreateMeetingAttendeeResponse.Register>();
        }
        return this.register;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="attendeeID" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="registerID" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "attendeeID",
        "registerID"
    })
    public static class Register {

        protected long attendeeID;
        protected long registerID;

        /**
         * Gets the value of the attendeeID property.
         * 
         */
        public long getAttendeeID() {
            return attendeeID;
        }

        /**
         * Sets the value of the attendeeID property.
         * 
         */
        public void setAttendeeID(long value) {
            this.attendeeID = value;
        }

        /**
         * Gets the value of the registerID property.
         * 
         */
        public long getRegisterID() {
            return registerID;
        }

        /**
         * Sets the value of the registerID property.
         * 
         */
        public void setRegisterID(long value) {
            this.registerID = value;
        }

    }

}
