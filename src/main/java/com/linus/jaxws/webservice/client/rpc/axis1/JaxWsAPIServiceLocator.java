/**
 * JaxWsAPIServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.linus.jaxws.webservice.client.rpc.axis1;

public class JaxWsAPIServiceLocator extends org.apache.axis.client.Service implements JaxWsAPIService {

    public JaxWsAPIServiceLocator() {
    }


    public JaxWsAPIServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public JaxWsAPIServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for JaxWsAPI
    private java.lang.String JaxWsAPI_address = "http://localhost:8080/WebServiceProject/services/JaxWsAPI";

    public java.lang.String getJaxWsAPIAddress() {
        return JaxWsAPI_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String JaxWsAPIWSDDServiceName = "JaxWsAPI";

    public java.lang.String getJaxWsAPIWSDDServiceName() {
        return JaxWsAPIWSDDServiceName;
    }

    public void setJaxWsAPIWSDDServiceName(java.lang.String name) {
        JaxWsAPIWSDDServiceName = name;
    }

    public JaxWsAPI getJaxWsAPI() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(JaxWsAPI_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getJaxWsAPI(endpoint);
    }

    public JaxWsAPI getJaxWsAPI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            JaxWsAPISoapBindingStub _stub = new JaxWsAPISoapBindingStub(portAddress, this);
            _stub.setPortName(getJaxWsAPIWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setJaxWsAPIEndpointAddress(java.lang.String address) {
        JaxWsAPI_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.linus.jaxws.webservice.client.rpc.axis1.JaxWsAPI.class.isAssignableFrom(serviceEndpointInterface)) {
                com.linus.jaxws.webservice.client.rpc.axis1.JaxWsAPISoapBindingStub _stub = new com.linus.jaxws.webservice.client.rpc.axis1.JaxWsAPISoapBindingStub(new java.net.URL(JaxWsAPI_address), this);
                _stub.setPortName(getJaxWsAPIWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("JaxWsAPI".equals(inputPortName)) {
            return getJaxWsAPI();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.webservice.jaxws.linus.com", "JaxWsAPIService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.webservice.jaxws.linus.com", "JaxWsAPI"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("JaxWsAPI".equals(portName)) {
            setJaxWsAPIEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
