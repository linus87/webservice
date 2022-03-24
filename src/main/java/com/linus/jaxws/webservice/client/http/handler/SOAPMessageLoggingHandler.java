package com.linus.jaxws.webservice.client.http.handler;

import java.io.StringWriter;

/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Get xml string from soap message for logging,
 *
 */
public class SOAPMessageLoggingHandler implements SOAPHandler<SOAPMessageContext> {

    private static final Logger log = LoggerFactory.getLogger(SOAPMessageLoggingHandler.class);

    public SOAPMessageLoggingHandler() {
        super();
    }

    // log soap message
    public boolean handleMessage(SOAPMessageContext smc) {

        // get xml string from SOAPMessageContext
        String xmlStr = null;
        try {
            SOAPMessage message = smc.getMessage();
            Source payload = message.getSOAPPart().getContent();
            
            xmlStr = sourceToString(payload);
        } catch (Exception e) {
                log.error(e.getMessage());
            return true;
        }

        Boolean request = (Boolean) smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        if (request.booleanValue()) {// for request message
            logMessage("Request", xmlStr);
        } else { // for response message
            logMessage("Response", xmlStr);
        }

        return true;
    }

    // log soap fault
    public boolean handleFault(SOAPMessageContext smc) {

        // get xml string from SOAPMessageContext
        String xmlStr = null;
        try {
            SOAPMessage message = smc.getMessage();
            Source payload = message.getSOAPPart().getContent();
            xmlStr = sourceToString(payload);
        } catch (Exception e) {
            log.error("fail to get xml string from SOAP message");
            log.error(e.getMessage());
            return true;
        }

        return true;

    }

    private void logMessage(String msgName, String msgStr) {
        String hs = java.text.MessageFormat.format("{0} Message: Length={1}",
                new Object[] { msgName, new Integer(msgStr.length()) });
        log.info(hs);
        log.info(msgStr);
    }

    public Set<QName> getHeaders() {
        return null;
    }

    public void close(MessageContext context) {
        // TODO Auto-generated method stub

    }
    
    private String sourceToString(Source source) throws TransformerConfigurationException, TransformerException {
        StringWriter stringWriter=new StringWriter();
        Result result=new StreamResult(stringWriter);
        
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.transform(source, result);
        return stringWriter.toString();
    }
}
