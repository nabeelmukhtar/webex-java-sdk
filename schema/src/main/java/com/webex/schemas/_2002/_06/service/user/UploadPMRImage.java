
package com.webex.schemas._2002._06.service.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for uploadPMRImage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uploadPMRImage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="imageFor" type="{http://www.webex.com/schemas/2002/06/service/user}imageForType" minOccurs="0"/>
 *         &lt;element name="imageData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadPMRImage", propOrder = {
    "imageFor",
    "imageData"
})
public class UploadPMRImage
    extends BodyContentType
{

    protected ImageForType imageFor;
    protected byte[] imageData;

    /**
     * Gets the value of the imageFor property.
     * 
     * @return
     *     possible object is
     *     {@link ImageForType }
     *     
     */
    public ImageForType getImageFor() {
        return imageFor;
    }

    /**
     * Sets the value of the imageFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageForType }
     *     
     */
    public void setImageFor(ImageForType value) {
        this.imageFor = value;
    }

    /**
     * Gets the value of the imageData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImageData() {
        return imageData;
    }

    /**
     * Sets the value of the imageData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImageData(byte[] value) {
        this.imageData = ((byte[]) value);
    }

}
