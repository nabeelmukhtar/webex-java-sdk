
package com.webex.schemas._2002._06.service.ep;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for delRecordingResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="delRecordingResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="recordingID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delRecordingResponse", propOrder = {
    "recordingID"
})
public class DelRecordingResponse
    extends BodyContentType
{

    protected int recordingID;

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

}
