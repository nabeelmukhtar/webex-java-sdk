
package com.webex.schemas._2002._06.service.trainingsessionqtiasi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for solutionmaterialType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="solutionmaterialType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="material" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}materialType" maxOccurs="unbounded"/>
 *         &lt;element name="flow_mat" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}flow_matType" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solutionmaterialType", propOrder = {
    "material",
    "flowMat"
})
public class SolutionmaterialType {

    protected List<MaterialType> material;
    @XmlElement(name = "flow_mat")
    protected List<FlowMatType> flowMat;

    /**
     * Gets the value of the material property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the material property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialType }
     * 
     * 
     */
    public List<MaterialType> getMaterial() {
        if (material == null) {
            material = new ArrayList<MaterialType>();
        }
        return this.material;
    }

    /**
     * Gets the value of the flowMat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flowMat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlowMat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowMatType }
     * 
     * 
     */
    public List<FlowMatType> getFlowMat() {
        if (flowMat == null) {
            flowMat = new ArrayList<FlowMatType>();
        }
        return this.flowMat;
    }

}
