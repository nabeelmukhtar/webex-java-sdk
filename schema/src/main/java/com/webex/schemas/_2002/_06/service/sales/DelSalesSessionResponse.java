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

package com.webex.schemas._2002._06.service.sales;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for delSalesSessionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="delSalesSessionResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="iCalendarURL" type="{http://www.webex.com/schemas/2002/06/service/sales}iCalendarURL" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delSalesSessionResponse", propOrder = {
    "iCalendarURL"
})
public class DelSalesSessionResponse
    extends BodyContentType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected ICalendarURL iCalendarURL;

    /**
     * Gets the value of the iCalendarURL property.
     * 
     * @return
     *     possible object is
     *     {@link ICalendarURL }
     *     
     */
    public ICalendarURL getICalendarURL() {
        return iCalendarURL;
    }

    /**
     * Sets the value of the iCalendarURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICalendarURL }
     *     
     */
    public void setICalendarURL(ICalendarURL value) {
        this.iCalendarURL = value;
    }

}
