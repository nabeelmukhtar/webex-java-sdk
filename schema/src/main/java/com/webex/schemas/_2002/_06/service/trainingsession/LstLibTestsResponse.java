
package com.webex.schemas._2002._06.service.trainingsession;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for lstLibTestsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lstLibTestsResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="libTest" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}libTestInstanceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lstLibTestsResponse", propOrder = {
    "libTest"
})
public class LstLibTestsResponse
    extends BodyContentType
{

    protected List<LibTestInstanceType> libTest;

    /**
     * Gets the value of the libTest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the libTest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLibTest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LibTestInstanceType }
     * 
     * 
     */
    public List<LibTestInstanceType> getLibTest() {
        if (libTest == null) {
            libTest = new ArrayList<LibTestInstanceType>();
        }
        return this.libTest;
    }

}
