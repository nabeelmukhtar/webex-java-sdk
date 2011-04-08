/*
 * Copyright 2010-2011 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */

package com.webex.schemas._2002._06.service.attendee;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for registerMeetingAttendeeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registerMeetingAttendeeResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
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
@XmlType(name = "registerMeetingAttendeeResponse", propOrder = {
    "register"
})
public class RegisterMeetingAttendeeResponse
    extends BodyContentType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<RegisterMeetingAttendeeResponse.Register> register;

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
     * {@link RegisterMeetingAttendeeResponse.Register }
     * 
     * 
     */
    public List<RegisterMeetingAttendeeResponse.Register> getRegister() {
        if (register == null) {
            register = new ArrayList<RegisterMeetingAttendeeResponse.Register>();
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
    public static class Register
        implements Serializable
    {

        private final static long serialVersionUID = 2461660169443089969L;
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
