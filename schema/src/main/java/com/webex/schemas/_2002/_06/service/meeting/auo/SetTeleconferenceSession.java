
package com.webex.schemas._2002._06.service.meeting.auo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setTeleconferenceSession complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setTeleconferenceSession">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/meeting/auo}audioOnlyType">
 *       &lt;sequence>
 *         &lt;element name="sessionKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setTeleconferenceSession", propOrder = {
    "sessionKey"
})
public class SetTeleconferenceSession
    extends AudioOnlyType
{

    protected long sessionKey;

    /**
     * Gets the value of the sessionKey property.
     * 
     */
    public long getSessionKey() {
        return sessionKey;
    }

    /**
     * Sets the value of the sessionKey property.
     * 
     */
    public void setSessionKey(long value) {
        this.sessionKey = value;
    }

}
