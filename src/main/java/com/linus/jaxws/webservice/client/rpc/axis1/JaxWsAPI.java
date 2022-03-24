/**
 * JaxWsAPI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.linus.jaxws.webservice.client.rpc.axis1;

public interface JaxWsAPI extends java.rmi.Remote {
    public void setWeather(com.linus.jaxws.webservice.data.Weather weather) throws java.rmi.RemoteException;
    public com.linus.jaxws.webservice.data.Weather getWeather() throws java.rmi.RemoteException;
}
