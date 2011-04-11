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

package com.webex.schemas._2002._06.service.user;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * The Class UploadPMRImage.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadPMRImage", propOrder = {
    "imageFor",
    "imageData"
})
public class UploadPMRImage
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The image for. */
    protected ImageForType imageFor;
    
    /** The image data. */
    protected byte[] imageData;

    /**
     * Gets the image for.
     * 
     * @return the image for
     */
    public ImageForType getImageFor() {
        return imageFor;
    }

    /**
     * Sets the image for.
     * 
     * @param value the new image for
     */
    public void setImageFor(ImageForType value) {
        this.imageFor = value;
    }

    /**
     * Gets the image data.
     * 
     * @return the image data
     */
    public byte[] getImageData() {
        return imageData;
    }

    /**
     * Sets the image data.
     * 
     * @param value the new image data
     */
    public void setImageData(byte[] value) {
        this.imageData = ((byte[]) value);
    }

}
