
package com.webex.schemas._2002._06.service.user;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for delSessionTemplates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="delSessionTemplates">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="sessionTemplate" type="{http://www.webex.com/schemas/2002/06/service/user}sessionTemplateType" maxOccurs="unbounded"/>
 *         &lt;element name="templateType" type="{http://www.webex.com/schemas/2002/06/service/user}templateTypeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delSessionTemplates", propOrder = {
    "sessionTemplate",
    "templateType"
})
public class DelSessionTemplates
    extends BodyContentType
{

    @XmlElement(required = true)
    protected List<SessionTemplateType> sessionTemplate;
    @XmlElement(defaultValue = "User")
    protected TemplateTypeType templateType;

    /**
     * Gets the value of the sessionTemplate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sessionTemplate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSessionTemplate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SessionTemplateType }
     * 
     * 
     */
    public List<SessionTemplateType> getSessionTemplate() {
        if (sessionTemplate == null) {
            sessionTemplate = new ArrayList<SessionTemplateType>();
        }
        return this.sessionTemplate;
    }

    /**
     * Gets the value of the templateType property.
     * 
     * @return
     *     possible object is
     *     {@link TemplateTypeType }
     *     
     */
    public TemplateTypeType getTemplateType() {
        return templateType;
    }

    /**
     * Sets the value of the templateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateTypeType }
     *     
     */
    public void setTemplateType(TemplateTypeType value) {
        this.templateType = value;
    }

}
