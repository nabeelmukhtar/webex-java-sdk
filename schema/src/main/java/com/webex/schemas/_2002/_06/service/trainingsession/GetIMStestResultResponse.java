
package com.webex.schemas._2002._06.service.trainingsession;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.trainingsessionqti.QtiResultReportType;


/**
 * <p>Java class for getIMStestResultResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getIMStestResultResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="qti_result_report" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqti}qti_result_reportType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getIMStestResultResponse", propOrder = {
    "qtiResultReport"
})
public class GetIMStestResultResponse
    extends BodyContentType
{

    @XmlElement(name = "qti_result_report", required = true)
    protected QtiResultReportType qtiResultReport;

    /**
     * Gets the value of the qtiResultReport property.
     * 
     * @return
     *     possible object is
     *     {@link QtiResultReportType }
     *     
     */
    public QtiResultReportType getQtiResultReport() {
        return qtiResultReport;
    }

    /**
     * Sets the value of the qtiResultReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link QtiResultReportType }
     *     
     */
    public void setQtiResultReport(QtiResultReportType value) {
        this.qtiResultReport = value;
    }

}
