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

package com.webex.schemas._2002._06.service.supportsession;

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
     * @return the creates the support session
     */
    public CreateSupportSession createCreateSupportSession() {
        return new CreateSupportSession();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the meta data type
     */
    public MetaDataType createMetaDataType() {
        return new MetaDataType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the creates the support session response
     */
    public CreateSupportSessionResponse createCreateSupportSessionResponse() {
        return new CreateSupportSessionResponse();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the support type
     */
    public SupportType createSupportType() {
        return new SupportType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the support instance type
     */
    public SupportInstanceType createSupportInstanceType() {
        return new SupportInstanceType();
    }

}
