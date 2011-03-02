
package com.webex.schemas._2002._06.service.site;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for setSite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setSite">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="meetingPlace" type="{http://www.webex.com/schemas/2002/06/service/site}meetingPlaceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setSite", propOrder = {
    "meetingPlace"
})
public class SetSite
    extends BodyContentType
{

    protected MeetingPlaceType meetingPlace;

    /**
     * Gets the value of the meetingPlace property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingPlaceType }
     *     
     */
    public MeetingPlaceType getMeetingPlace() {
        return meetingPlace;
    }

    /**
     * Sets the value of the meetingPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingPlaceType }
     *     
     */
    public void setMeetingPlace(MeetingPlaceType value) {
        this.meetingPlace = value;
    }

}
