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

package com.webex.schemas._2002._06.service.site;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.WebACDRoleType;
import com.webex.schemas._2002._06.service.ep.ListControlType;


/**
 * <p>Java class for GetWebACDQueues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetWebACDQueues">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="webExId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.webex.com/schemas/2002/06/service}webACDRoleType" minOccurs="0"/>
 *         &lt;element name="listControl" type="{http://www.webex.com/schemas/2002/06/service/ep}listControlType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetWebACDQueues", propOrder = {
    "webExId",
    "type",
    "listControl"
})
public class GetWebACDQueues
    extends BodyContentType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String webExId;
    protected WebACDRoleType type;
    protected ListControlType listControl;

    /**
     * Gets the value of the webExId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebExId() {
        return webExId;
    }

    /**
     * Sets the value of the webExId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebExId(String value) {
        this.webExId = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link WebACDRoleType }
     *     
     */
    public WebACDRoleType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebACDRoleType }
     *     
     */
    public void setType(WebACDRoleType value) {
        this.type = value;
    }

    /**
     * Gets the value of the listControl property.
     * 
     * @return
     *     possible object is
     *     {@link ListControlType }
     *     
     */
    public ListControlType getListControl() {
        return listControl;
    }

    /**
     * Sets the value of the listControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListControlType }
     *     
     */
    public void setListControl(ListControlType value) {
        this.listControl = value;
    }

}
