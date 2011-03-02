
package com.webex.schemas._2002._06.service.trainingsession;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for copyLibTests complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="copyLibTests">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="testID" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded"/>
 *         &lt;element name="copyToType" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}shareType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "copyLibTests", propOrder = {
    "testID",
    "copyToType"
})
public class CopyLibTests
    extends BodyContentType
{

    @XmlElement(type = Long.class)
    protected List<Long> testID;
    @XmlElement(required = true)
    protected ShareType copyToType;

    /**
     * Gets the value of the testID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getTestID() {
        if (testID == null) {
            testID = new ArrayList<Long>();
        }
        return this.testID;
    }

    /**
     * Gets the value of the copyToType property.
     * 
     * @return
     *     possible object is
     *     {@link ShareType }
     *     
     */
    public ShareType getCopyToType() {
        return copyToType;
    }

    /**
     * Sets the value of the copyToType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareType }
     *     
     */
    public void setCopyToType(ShareType value) {
        this.copyToType = value;
    }

}
