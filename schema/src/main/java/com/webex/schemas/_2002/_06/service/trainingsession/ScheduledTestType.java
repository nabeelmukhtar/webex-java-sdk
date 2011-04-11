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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class ScheduledTestType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scheduledTestType", propOrder = {
    "testID",
    "title",
    "delivery",
    "status",
    "dueDate"
})
public class ScheduledTestType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The test id. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long testID;
    
    /** The title. */
    @XmlElement(required = true)
    protected String title;
    
    /** The delivery. */
    @XmlElement(required = true, defaultValue = "IN_SESSION")
    protected TestDeliveryType delivery;
    
    /** The status. */
    @XmlElement(required = true, defaultValue = "NOT_STARTED")
    protected TestStatusType status;
    
    /** The due date. */
    protected String dueDate;

    /**
     * Gets the test id.
     * 
     * @return the test id
     */
    public Long getTestID() {
        return testID;
    }

    /**
     * Sets the test id.
     * 
     * @param value the new test id
     */
    public void setTestID(Long value) {
        this.testID = value;
    }

    /**
     * Gets the title.
     * 
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title.
     * 
     * @param value the new title
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the delivery.
     * 
     * @return the delivery
     */
    public TestDeliveryType getDelivery() {
        return delivery;
    }

    /**
     * Sets the delivery.
     * 
     * @param value the new delivery
     */
    public void setDelivery(TestDeliveryType value) {
        this.delivery = value;
    }

    /**
     * Gets the status.
     * 
     * @return the status
     */
    public TestStatusType getStatus() {
        return status;
    }

    /**
     * Sets the status.
     * 
     * @param value the new status
     */
    public void setStatus(TestStatusType value) {
        this.status = value;
    }

    /**
     * Gets the due date.
     * 
     * @return the due date
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Sets the due date.
     * 
     * @param value the new due date
     */
    public void setDueDate(String value) {
        this.dueDate = value;
    }

}
