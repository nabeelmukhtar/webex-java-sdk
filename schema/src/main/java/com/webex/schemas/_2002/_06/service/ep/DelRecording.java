
package com.webex.schemas._2002._06.service.ep;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for delRecording complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="delRecording">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="recordingID" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "delRecording", propOrder = {
    "recordingID",
    "isServiceRecording"
})
public class DelRecording
    extends BodyContentType
{

    protected int recordingID;
    protected Boolean isServiceRecording;

    /**
     * Gets the value of the recordingID property.
     * 
     */
    public int getRecordingID() {
        return recordingID;
    }

    /**
     * Sets the value of the recordingID property.
     * 
     */
    public void setRecordingID(int value) {
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
