package com.linus.jaxws.webservice.service;

import javax.jws.WebMethod;
import javax.xml.transform.dom.DOMSource;
import javax.xml.ws.Provider;
import javax.xml.ws.ServiceMode;
import javax.xml.ws.WebServiceProvider;

import com.linus.jaxws.webservice.data.User;

/**
 * <p>@ServiceMode only used on Provider implementation</p>
 * 
 *
 */
@ServiceMode
@WebServiceProvider(serviceName="JaxWSAPIService", portName="UserAPI", targetNamespace="urn:com:linus:api:components")
public class UserAPIProvider implements Provider<DOMSource> {

    @WebMethod(exclude=true)
    public DOMSource invoke(DOMSource request) {
        // TODO Auto-generated method stub
        return null;
    }
    
    @WebMethod(operationName="AddUser")
    public User addUser(User user) {
        return user;
    }

}
