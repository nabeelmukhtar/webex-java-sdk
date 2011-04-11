/*
 * Copyright 2010-2011 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */

package com.webex.schemas._2002._06.service.trainingsession;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.trainingsessionqti.QtiResultReportType;


/**
 * The Class GetIMStestResultResponse.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getIMStestResultResponse", propOrder = {
    "qtiResultReport"
})
public class GetIMStestResultResponse
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The qti result report. */
    @XmlElement(name = "qti_result_report", required = true)
    protected QtiResultReportType qtiResultReport;

    /**
     * Gets the qti result report.
     * 
     * @return the qti result report
     */
    public QtiResultReportType getQtiResultReport() {
        return qtiResultReport;
    }

    /**
     * Sets the qti result report.
     * 
     * @param value the new qti result report
     */
    public void setQtiResultReport(QtiResultReportType value) {
        this.qtiResultReport = value;
    }

}
