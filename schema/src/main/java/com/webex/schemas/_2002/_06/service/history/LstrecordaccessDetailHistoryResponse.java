
package com.webex.schemas._2002._06.service.history;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.MatchingRecordsType;


/**
 * <p>Java class for lstrecordaccessDetailHistoryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lstrecordaccessDetailHistoryResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="recordDetail" type="{http://www.webex.com/schemas/2002/06/service/history}recordAccessDetailHistoryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="matchingRecords" type="{http://www.webex.com/schemas/2002/06/service}matchingRecordsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lstrecordaccessDetailHistoryResponse", propOrder = {
    "recordDetail",
    "matchingRecords"
})
public class LstrecordaccessDetailHistoryResponse
    extends BodyContentType
{

    protected List<RecordAccessDetailHistoryType> recordDetail;
    protected MatchingRecordsType matchingRecords;

    /**
     * Gets the value of the recordDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordAccessDetailHistoryType }
     * 
     * 
     */
    public List<RecordAccessDetailHistoryType> getRecordDetail() {
        if (recordDetail == null) {
            recordDetail = new ArrayList<RecordAccessDetailHistoryType>();
        }
        return this.recordDetail;
    }

    /**
     * Gets the value of the matchingRecords property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingRecordsType }
     *     
     */
    public MatchingRecordsType getMatchingRecords() {
        return matchingRecords;
    }

    /**
     * Sets the value of the matchingRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingRecordsType }
     *     
     */
    public void setMatchingRecords(MatchingRecordsType value) {
        this.matchingRecords = value;
    }

}
