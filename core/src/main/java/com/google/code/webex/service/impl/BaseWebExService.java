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

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;

import com.google.code.webex.service.WebExConsumer;
import com.google.code.webex.service.WebExException;
import com.google.code.webex.service.WebExService;
import com.google.code.webex.service.util.ApplicationConstants;
import com.google.code.webex.service.util.WebExUrls.WebExUrlBuilder;

/**
 * The Class BaseUClassifyClient.
 * 
 * @author Nabeel Mukhtar
 */
public abstract class BaseWebExService implements WebExService {

    /** Field description. */
    private static final String GZIP_ENCODING = "gzip";

    /** Field description. */
//    private final SchemaElementFactory OBJECT_FACTORY = createObjectFactory();

    /** The static logger. */
    protected final Logger LOG = Logger.getLogger(getClass().getCanonicalName());
    
    /** Field description. */
    private WebExConsumer apiConsumer;

    /** Field description. */
    private Map<String, String> requestHeaders;

    /**
     * Constructs ...
     * 
     * @param readApiKey the read api key
     * @param writeApiKey the write api key
     */
    protected BaseWebExService(String webExId, String password, Long siteId, String siteName, String partnerId) {
        requestHeaders = new HashMap<String, String>();

        // by default we compress contents
        requestHeaders.put("Accept-Encoding", "gzip, deflate");
        apiConsumer = new WebExConsumer(webExId, password, siteId, siteName, partnerId);
    }

    /**
     * {@inheritDoc}
     */
    public void setRequestHeaders(Map<String, String> requestHeaders) {
        this.requestHeaders = requestHeaders;
    }

    /**
     * {@inheritDoc}
     */
    public Map<String, String> getRequestHeaders() {
        return requestHeaders;
    }

    /**
     * {@inheritDoc}
     */
    public void addRequestHeader(String headerName, String headerValue) {
        requestHeaders.put(headerName, headerValue);
    }

    /**
     * {@inheritDoc}
     */
    public void removeRequestHeader(String headerName) {
        requestHeaders.remove(headerName);
    }

    /**
     * {@inheritDoc}
     */
    public void setApiConsumer(WebExConsumer apiConsumer) {
        this.apiConsumer = apiConsumer;
    }

    /**
     * {@inheritDoc}
     */
    public WebExConsumer getApiConsumer() {
        return apiConsumer;
    }
    
    /**
     * Method description.
     * 
     * @param clazz the clazz
     * @param is the is
     * 
     * @return the T
     */
    protected <T> T readResponse(Class<T> clazz, InputStream is) {
        try {
            return unmarshallObject(clazz, is);
        } finally {
            closeStream(is);
        }
    }

    /**
     * Read response.
     * 
     * @param is the is
     * 
     * @return the list< response entity>
     */
//    protected List<ResponseEntity> readResponse(InputStream is) {
//    	com.uclassify.api._1.responseschema.Uclassify response = readResponse(com.uclassify.api._1.responseschema.Uclassify.class, is);
//    	if (response != null) {
//    		if (response.getStatus() != null) {
//    			if (response.getStatus().isSuccess()) {
//                	return response.getReadCalls().getClassifyAndGetInformation();
//    			} else {
//    				throw new WebExException(response.getStatus().getValue(), response.getStatus().getStatusCode().intValue(), new Date());  				
//    			}
//    		}
//    	}
//		throw new WebExException("Unable to unmarshal response.");    		
//    }
    
    /**
     * Call api method.
     * 
     * @param apiUrl the api url
     * @param xmlContent the xml content
     * @param contentType the content type
     * @param method the method
     * @param expected the expected
     * 
     * @return the input stream
     */
    protected InputStream callApiMethod(String apiUrl, String xmlContent, String contentType, HttpMethod method,
            int expected) {
        try {
            URL               url     = new URL(apiUrl);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();

            if (ApplicationConstants.CONNECT_TIMEOUT > -1) {
                request.setConnectTimeout(ApplicationConstants.CONNECT_TIMEOUT);
            }

            if (ApplicationConstants.READ_TIMEOUT > -1) {
                request.setReadTimeout(ApplicationConstants.READ_TIMEOUT);
            }

            for (String headerName : requestHeaders.keySet()) {
                request.setRequestProperty(headerName, requestHeaders.get(headerName));
            }

            request.setRequestMethod(method.name());
            request.setDoOutput(true);

            if (contentType != null) {
                request.setRequestProperty("Content-Type", contentType);
            }

            if (xmlContent != null) {
                PrintStream out = new PrintStream(new BufferedOutputStream(request.getOutputStream()));

                out.print(xmlContent);
                out.flush();
                out.close();
            }

            request.connect();

            if (request.getResponseCode() != expected) {
                throw new WebExException(convertStreamToString(getWrappedInputStream(request.getErrorStream(),
                        GZIP_ENCODING.equalsIgnoreCase(request.getContentEncoding()))));
            } else {
                return getWrappedInputStream(request.getInputStream(),
                                             GZIP_ENCODING.equalsIgnoreCase(request.getContentEncoding()));
            }
        } catch (IOException e) {
            throw new WebExException(e);
        }
    }

    /**
     * Method description.
     * 
     * @param is the is
     */
    protected void closeStream(InputStream is) {
        try {
            is.close();
        } catch (IOException e) {
        	LOG.log(Level.SEVERE, "An error occurred while closing stream.", e);	
        }
    }

    /**
     * Method description.
     * 
     * @param connection the connection
     */
    protected void closeConnection(HttpURLConnection connection) {
        try {
        	if (connection != null) {
        		connection.disconnect();
        	}
        } catch (Exception e) {
        	LOG.log(Level.SEVERE, "An error occurred while disconnecting connection.", e);	
        }
    }
    
    /**
     * Method description.
     * 
     * @param is the is
     * @param gzip the gzip
     * 
     * @return the wrapped input stream
     * 
     * @throws IOException Signals that an I/O exception has occurred.
     */
    protected InputStream getWrappedInputStream(InputStream is, boolean gzip) throws IOException {
        if (gzip) {
            return new BufferedInputStream(new GZIPInputStream(is));
        } else {
            return new BufferedInputStream(is);
        }
    }

    /**
     * Get property as long.
     * 
     * @param s the s
     * 
     * @return true, if checks if is null or empty
     */
    protected boolean isNullOrEmpty(String s) {
        return ((s == null) || (s.length() == 0));
    }

    /**
     * Assert not null or empty.
     * 
     * @param name the name
     * @param value the value
     */
    protected void assertNotNullOrEmpty(String name, String value) {
        if (isNullOrEmpty(value)) {
            throw new IllegalArgumentException(name + " cannot be null or empty.");
        }
    }

    /**
     * Assert not null or empty.
     * 
     * @param name the name
     * @param value the value
     */
    protected void assertNotNullOrEmpty(String name, Collection<?> value) {
        if ((value == null) || value.isEmpty()) {
            throw new IllegalArgumentException(name + " cannot be null or empty.");
        }
    }

    /**
     * Assert not null or empty.
     * 
     * @param name the name
     * @param value the value
     */
   protected void assertNotNullOrEmpty(String name, Map<?, ?> value) {
       if ((value == null) || value.isEmpty()) {
           throw new IllegalArgumentException(name + " cannot be null or empty.");
       }
   }
   
    /**
     * Assert positive number.
     * 
     * @param name the name
     * @param value the value
     */
    protected void assertPositiveNumber(String name, int value) {
        if (value < 0) {
            throw new IllegalArgumentException(name + " cannot be less than zero.");
        }
    }

    /**
     * Assert not null.
     * 
     * @param name the name
     * @param value the value
     */
    protected void assertNotNull(String name, Object value) {
        if (value == null) {
            throw new IllegalArgumentException(name + " cannot be null.");
        }
    }
    
	/**
	 * Convert stream to string.
	 * 
	 * @param is the is
	 * 
	 * @return the string
	 */
	protected static String convertStreamToString(InputStream is) {
	    /*
	     * To convert the InputStream to String we use the BufferedReader.readLine()
	     * method. We iterate until the BufferedReader return null which means
	     * there's no more data to read. Each line will appended to a StringBuilder
	     * and returned as String.
	     */
	    BufferedReader reader = new BufferedReader(new InputStreamReader(is));
	    StringBuilder sb = new StringBuilder();
	
	    String line = null;
	    try {
	        while ((line = reader.readLine()) != null) {
	            sb.append(line + "\n");
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            is.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	
	    return sb.toString();
	}
    
    /**
     * Method description.
     * 
     * @param clazz the clazz
     * @param xmlContent the xml content
     * 
     * @return the T
     */
    protected abstract <T> T unmarshallObject(Class<T> clazz, InputStream xmlContent);

    /**
     * Method description.
     * 
     * @param element the element
     * 
     * @return the string
     */
    protected abstract String marshallObject(Object element);

    /**
     * Method description.
     * 
     * @param urlFormat the url format
     * 
     * @return the u classify url builder
     */
    protected abstract WebExUrlBuilder createWebExUrlBuilder(String urlFormat);

    /**
     * Method description.
     * 
     * @return the schema element factory
     */
//    protected abstract SchemaElementFactory createObjectFactory();
}
