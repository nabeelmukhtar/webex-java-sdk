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

package com.webex.schemas._2002._06.common;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * A factory for creating Object objects.
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Instantiates a new object factory.
     */
    public ObjectFactory() {
    }

    /**
     * Creates a new Object object.
     * 
     * @return the security type
     */
    public SecurityType createSecurityType() {
        return new SecurityType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the address type
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the session template type
     */
    public SessionTemplateType createSessionTemplateType() {
        return new SessionTemplateType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the tracking type
     */
    public TrackingType createTrackingType() {
        return new TrackingType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the text box tag type
     */
    public TextBoxTagType createTextBoxTagType() {
        return new TextBoxTagType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the phone label num type
     */
    public PhoneLabelNumType createPhoneLabelNumType() {
        return new PhoneLabelNumType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the person type
     */
    public PersonType createPersonType() {
        return new PersonType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the check box tag type
     */
    public CheckBoxTagType createCheckBoxTagType() {
        return new CheckBoxTagType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the option button tag type
     */
    public OptionButtonTagType createOptionButtonTagType() {
        return new OptionButtonTagType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the dropdown list tag type
     */
    public DropdownListTagType createDropdownListTagType() {
        return new DropdownListTagType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the check box item tag type
     */
    public CheckBoxItemTagType createCheckBoxItemTagType() {
        return new CheckBoxItemTagType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the phones type
     */
    public PhonesType createPhonesType() {
        return new PhonesType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the pso fields type
     */
    public PsoFieldsType createPsoFieldsType() {
        return new PsoFieldsType();
    }

}
