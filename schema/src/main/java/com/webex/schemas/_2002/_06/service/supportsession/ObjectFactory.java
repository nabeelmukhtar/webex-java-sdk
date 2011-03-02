
package com.webex.schemas._2002._06.service.supportsession;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webex.schemas._2002._06.service.supportsession package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webex.schemas._2002._06.service.supportsession
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MetaDataType }
     * 
     */
    public MetaDataType createMetaDataType() {
        return new MetaDataType();
    }

    /**
     * Create an instance of {@link SupportInstanceType }
     * 
     */
    public SupportInstanceType createSupportInstanceType() {
        return new SupportInstanceType();
    }

    /**
     * Create an instance of {@link CreateSupportSession }
     * 
     */
    public CreateSupportSession createCreateSupportSession() {
        return new CreateSupportSession();
    }

    /**
     * Create an instance of {@link CreateSupportSessionResponse }
     * 
     */
    public CreateSupportSessionResponse createCreateSupportSessionResponse() {
        return new CreateSupportSessionResponse();
    }

    /**
     * Create an instance of {@link SupportType }
     * 
     */
    public SupportType createSupportType() {
        return new SupportType();
    }

}
