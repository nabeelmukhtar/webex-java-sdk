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
package com.google.code.webex.service.impl;
import java.io.InputStream;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.google.code.webex.service.WebExException;
import com.google.code.webex.service.util.WebExUrls.WebExUrlBuilder;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.MessageType;
import com.webex.schemas._2002._06.service.ObjectFactory;
import com.webex.schemas._2002._06.service.SecurityContextType;

/**
 * The Class WebExJaxbService.
 */
public class WebExJaxbService extends BaseWebExService {

    /** The Constant OBJECT_FACTORY. */
    private static final ObjectFactory OBJECT_FACTORY = new ObjectFactory();
    
    /** The JAX b_ context. */
    private static JAXBContext JAXB_CONTEXT;

    /**
     * Instantiates a new web ex jaxb service.
     * 
     * @param webExId the web ex id
     * @param password the password
     * @param siteId the site id
     * @param siteName the site name
     * @param partnerId the partner id
     */
    public WebExJaxbService(String webExId, String password, Long siteId, String siteName, String partnerId) {
        super(webExId, password, siteId, siteName, partnerId);
    }

    /* (non-Javadoc)
     * @see com.google.code.webex.service.impl.BaseWebExService#unmarshallObject(java.lang.Class, java.io.InputStream)
     */
    @SuppressWarnings("unchecked")
    protected <T> T unmarshallObject(Class<T> clazz, InputStream xmlContent) {
        try {
            Unmarshaller u  = getJaxbContext().createUnmarshaller();
            JAXBElement<T> element = (JAXBElement<T>) u.unmarshal(xmlContent);
            return element.getValue();
        } catch (JAXBException e) {
            throw new WebExException(e);
        }
    }

    /* (non-Javadoc)
     * @see com.google.code.webex.service.impl.BaseWebExService#marshallObject(java.lang.Object)
     */
	protected String marshallObject(Object element) {
        try {
            StringWriter writer = new StringWriter();
            Marshaller   marshaller = getJaxbContext().createMarshaller();

            marshaller.marshal(element, writer);
            return writer.toString();
        } catch (JAXBException e) {
            throw new WebExException(e);
        }
    }

    /* (non-Javadoc)
     * @see com.google.code.webex.service.impl.BaseWebExService#createWebExUrlBuilder(java.lang.String)
     */
    protected WebExUrlBuilder createWebExUrlBuilder(String urlFormat) {
        return new WebExUrlBuilder(urlFormat, getApiConsumer().getSiteName());
    }
    
    /**
     * Creates the request.
     * 
     * @param bodyContents the body contents
     * 
     * @return the message type
     */
    protected MessageType createRequest(BodyContentType... bodyContents) {
		MessageType message = OBJECT_FACTORY.createMessageType();
		MessageType.Header header = OBJECT_FACTORY.createMessageTypeHeader();
		message.setHeader(header);
		SecurityContextType securityContext = OBJECT_FACTORY.createSecurityContextType();
		header.setSecurityContext(securityContext);
		securityContext.setWebExID(getApiConsumer().getWebExId());
		securityContext.setPassword(getApiConsumer().getPassword());
		securityContext.setSiteID(getApiConsumer().getSiteId());
		securityContext.setPartnerID(getApiConsumer().getPartnerId());
		
		MessageType.Body body = OBJECT_FACTORY.createMessageTypeBody();
		message.setBody(body);
		
		for (BodyContentType bodyContent : bodyContents) {
			body.getBodyContent().add(bodyContent);
		}
    	
		return message;
    }

    /**
     * Gets the jaxb context.
     * 
     * @return the jaxb context
     * 
     * @throws JAXBException the JAXB exception
     */
	protected JAXBContext getJaxbContext() throws JAXBException {
		if (JAXB_CONTEXT == null ) {
			JAXB_CONTEXT = JAXBContext.newInstance("com.webex.schemas._2002._06.service");
		}
		return JAXB_CONTEXT;
	}
}
