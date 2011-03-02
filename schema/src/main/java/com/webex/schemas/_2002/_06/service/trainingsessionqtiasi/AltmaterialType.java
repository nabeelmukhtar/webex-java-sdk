
package com.webex.schemas._2002._06.service.trainingsessionqtiasi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for altmaterialType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="altmaterialType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="qticomment" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}qticommentType" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="mattext" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}mattextType"/>
 *           &lt;element name="matemtext" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}matemtextType"/>
 *           &lt;element name="matimage" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}matimageType"/>
 *           &lt;element name="mataudio" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}mataudioType"/>
 *           &lt;element name="matvideo" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}matvideoType"/>
 *           &lt;element name="matapplet" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}matappletType"/>
 *           &lt;element name="matapplication" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}matapplicationType"/>
 *           &lt;element name="matref" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}matrefType"/>
 *           &lt;element name="matbreak" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}matbreakType"/>
 *           &lt;element name="mat_extension" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}mat_extensionType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "altmaterialType", propOrder = {
    "qticomment",
    "mattextOrMatemtextOrMatimage"
})
public class AltmaterialType {

    protected QticommentType qticomment;
    @XmlElements({
        @XmlElement(name = "matemtext", type = MatemtextType.class),
        @XmlElement(name = "mattext", type = MattextType.class),
        @XmlElement(name = "mat_extension", type = MatExtensionType.class),
        @XmlElement(name = "matapplication", type = MatapplicationType.class),
        @XmlElement(name = "matvideo", type = MatvideoType.class),
        @XmlElement(name = "matimage", type = MatimageType.class),
        @XmlElement(name = "matapplet", type = MatappletType.class),
        @XmlElement(name = "matref", type = MatrefType.class),
        @XmlElement(name = "mataudio", type = MataudioType.class),
        @XmlElement(name = "matbreak", type = MatbreakType.class)
    })
    protected List<Object> mattextOrMatemtextOrMatimage;

    /**
     * Gets the value of the qticomment property.
     * 
     * @return
     *     possible object is
     *     {@link QticommentType }
     *     
     */
    public QticommentType getQticomment() {
        return qticomment;
    }

    /**
     * Sets the value of the qticomment property.
     * 
     * @param value
     *     allowed object is
     *     {@link QticommentType }
     *     
     */
    public void setQticomment(QticommentType value) {
        this.qticomment = value;
    }

    /**
     * Gets the value of the mattextOrMatemtextOrMatimage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mattextOrMatemtextOrMatimage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMattextOrMatemtextOrMatimage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatemtextType }
     * {@link MattextType }
     * {@link MatExtensionType }
     * {@link MatapplicationType }
     * {@link MatvideoType }
     * {@link MatimageType }
     * {@link MatappletType }
     * {@link MatrefType }
     * {@link MataudioType }
     * {@link MatbreakType }
     * 
     * 
     */
    public List<Object> getMattextOrMatemtextOrMatimage() {
        if (mattextOrMatemtextOrMatimage == null) {
            mattextOrMatemtextOrMatimage = new ArrayList<Object>();
        }
        return this.mattextOrMatemtextOrMatimage;
    }

}
