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

package com.webex.schemas._2002._06.service.ep;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * The Class GetAPIVersionResponse.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAPIVersionResponse", propOrder = {
    "apiVersion",
    "release",
    "trainReleaseVersion"
})
public class GetAPIVersionResponse
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The api version. */
    @XmlElement(required = true)
    protected String apiVersion;
    
    /** The release. */
    protected String release;
    
    /** The train release version. */
    protected String trainReleaseVersion;

    /**
     * Gets the api version.
     * 
     * @return the api version
     */
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * Sets the api version.
     * 
     * @param value the new api version
     */
    public void setApiVersion(String value) {
        this.apiVersion = value;
    }

    /**
     * Gets the release.
     * 
     * @return the release
     */
    public String getRelease() {
        return release;
    }

    /**
     * Sets the release.
     * 
     * @param value the new release
     */
    public void setRelease(String value) {
        this.release = value;
    }

    /**
     * Gets the train release version.
     * 
     * @return the train release version
     */
    public String getTrainReleaseVersion() {
        return trainReleaseVersion;
    }

    /**
     * Sets the train release version.
     * 
     * @param value the new train release version
     */
    public void setTrainReleaseVersion(String value) {
        this.trainReleaseVersion = value;
    }

}
