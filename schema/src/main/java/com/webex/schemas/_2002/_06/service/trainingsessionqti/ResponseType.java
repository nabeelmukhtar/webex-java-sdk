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

package com.webex.schemas._2002._06.service.trainingsessionqti;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class ResponseType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseType", propOrder = {
    "responseForm",
    "responseValue"
})
public class ResponseType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The response form. */
    @XmlElement(name = "response_form", required = true)
    protected ResponseFormType responseForm;
    
    /** The response value. */
    @XmlElement(name = "response_value", required = true)
    protected List<ResponseValueType> responseValue;
    
    /** The ident ref. */
    @XmlAttribute(name = "ident_ref")
    protected String identRef;

    /**
     * Gets the response form.
     * 
     * @return the response form
     */
    public ResponseFormType getResponseForm() {
        return responseForm;
    }

    /**
     * Sets the response form.
     * 
     * @param value the new response form
     */
    public void setResponseForm(ResponseFormType value) {
        this.responseForm = value;
    }

    /**
     * Gets the response value.
     * 
     * @return the response value
     */
    public List<ResponseValueType> getResponseValue() {
        if (responseValue == null) {
            responseValue = new ArrayList<ResponseValueType>();
        }
        return this.responseValue;
    }

    /**
     * Gets the ident ref.
     * 
     * @return the ident ref
     */
    public String getIdentRef() {
        return identRef;
    }

    /**
     * Sets the ident ref.
     * 
     * @param value the new ident ref
     */
    public void setIdentRef(String value) {
        this.identRef = value;
    }

}
