/**
 * JaxWsAPIService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.linus.jaxws.webservice.client.rpc.axis1;

public interface JaxWsAPIService extends javax.xml.rpc.Service {
    public java.lang.String getJaxWsAPIAddress();

    public com.linus.jaxws.webservice.client.rpc.axis1.JaxWsAPI getJaxWsAPI() throws javax.xml.rpc.ServiceException;

    public com.linus.jaxws.webservice.client.rpc.axis1.JaxWsAPI getJaxWsAPI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
