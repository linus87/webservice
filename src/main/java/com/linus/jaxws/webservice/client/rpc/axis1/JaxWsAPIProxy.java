package com.linus.jaxws.webservice.client.rpc.axis1;

public class JaxWsAPIProxy implements com.linus.jaxws.webservice.client.rpc.axis1.JaxWsAPI {
  private String _endpoint = null;
  private com.linus.jaxws.webservice.client.rpc.axis1.JaxWsAPI jaxWsAPI = null;
  
  public JaxWsAPIProxy() {
    _initJaxWsAPIProxy();
  }
  
  public JaxWsAPIProxy(String endpoint) {
    _endpoint = endpoint;
    _initJaxWsAPIProxy();
  }
  
  private void _initJaxWsAPIProxy() {
    try {
      jaxWsAPI = (new JaxWsAPIServiceLocator()).getJaxWsAPI();
      if (jaxWsAPI != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)jaxWsAPI)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)jaxWsAPI)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (jaxWsAPI != null)
      ((javax.xml.rpc.Stub)jaxWsAPI)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.linus.jaxws.webservice.client.rpc.axis1.JaxWsAPI getJaxWsAPI() {
    if (jaxWsAPI == null)
      _initJaxWsAPIProxy();
    return jaxWsAPI;
  }
  
  public void setWeather(com.linus.jaxws.webservice.data.Weather weather) throws java.rmi.RemoteException{
    if (jaxWsAPI == null)
      _initJaxWsAPIProxy();
    jaxWsAPI.setWeather(weather);
  }
  
  public com.linus.jaxws.webservice.data.Weather getWeather() throws java.rmi.RemoteException{
    if (jaxWsAPI == null)
      _initJaxWsAPIProxy();
    return jaxWsAPI.getWeather();
  }
  
  
}