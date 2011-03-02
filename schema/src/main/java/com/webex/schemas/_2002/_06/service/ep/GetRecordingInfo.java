
package com.webex.schemas._2002._06.service.ep;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for getRecordingInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRecordingInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="recordingID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="isServiceRecording" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRecordingInfo", propOrder = {
    "recordingID",
    "isServiceRecording"
})
public class GetRecordingInfo
    extends BodyContentType
{

    protected long recordingID;
    protected Boolean isServiceRecording;

    /**
     * Gets the value of the recordingID property.
     * 
     */
    public long getRecordingID() {
        return recordingID;
    }

    /**
     * Sets the value of the recordingID property.
     * 
     */
    public void setRecordingID(long value) {
        this.recordingID = value;
    }

    /**
     * Gets the value of the isServiceRecording property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsServiceRecording() {
        return isServiceRecording;
    }

    /**
     * Sets the value of the isServiceRecording property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsServiceRecording(Boolean value) {
        this.isServiceRecording = value;
    }

}
